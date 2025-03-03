
package net.mcreator.arkimedian.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.arkimedian.procedures.GrelhoundPlaybackConditionProcedure;
import net.mcreator.arkimedian.init.ArkimedianModItems;
import net.mcreator.arkimedian.init.ArkimedianModEntities;

public class GrelhoundEntity extends Monster {
	public final AnimationState animationState0 = new AnimationState();

	public GrelhoundEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ArkimedianModEntities.GRELHOUND.get(), world);
	}

	public GrelhoundEntity(EntityType<GrelhoundEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.7f);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (GrelhoundEntity.this.isInWater())
					GrelhoundEntity.this.setDeltaMovement(GrelhoundEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !GrelhoundEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - GrelhoundEntity.this.getX();
					double dy = this.wantedY - GrelhoundEntity.this.getY();
					double dz = this.wantedZ - GrelhoundEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * GrelhoundEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					GrelhoundEntity.this.setYRot(this.rotlerp(GrelhoundEntity.this.getYRot(), f, 10));
					GrelhoundEntity.this.yBodyRot = GrelhoundEntity.this.getYRot();
					GrelhoundEntity.this.yHeadRot = GrelhoundEntity.this.getYRot();
					if (GrelhoundEntity.this.isInWater()) {
						GrelhoundEntity.this.setSpeed((float) GrelhoundEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						GrelhoundEntity.this.setXRot(this.rotlerp(GrelhoundEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(GrelhoundEntity.this.getXRot() * (float) (Math.PI / 180.0));
						GrelhoundEntity.this.setZza(f3 * f1);
						GrelhoundEntity.this.setYya((float) (f1 * dy));
					} else {
						GrelhoundEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					GrelhoundEntity.this.setSpeed(0);
					GrelhoundEntity.this.setYya(0);
					GrelhoundEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new FloatGoal(this));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DocreanitileEntity.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(ArkimedianModItems.GRELHOUND_FUR.get()));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(GrelhoundPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	public static void init() {
		SpawnPlacements.register(ArkimedianModEntities.GRELHOUND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 35);
		builder = builder.add(Attributes.ARMOR, 0.1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}
