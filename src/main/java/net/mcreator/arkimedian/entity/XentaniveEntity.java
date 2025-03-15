
package net.mcreator.arkimedian.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.procedures.XentanivePlaybackConditionProcedure;
import net.mcreator.arkimedian.procedures.XenantivetamedyesProcedure;
import net.mcreator.arkimedian.procedures.GrelhoundPlaybackConditionProcedure;
import net.mcreator.arkimedian.init.ArkimedianModItems;
import net.mcreator.arkimedian.init.ArkimedianModEntities;

import java.util.EnumSet;

public class XentaniveEntity extends TamableAnimal {
	public static final EntityDataAccessor<Integer> DATA_feed_level = SynchedEntityData.defineId(XentaniveEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_hivex = SynchedEntityData.defineId(XentaniveEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_hivey = SynchedEntityData.defineId(XentaniveEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_hivez = SynchedEntityData.defineId(XentaniveEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();

	public XentaniveEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ArkimedianModEntities.XENTANIVE.get(), world);
	}

	public XentaniveEntity(EntityType<XentaniveEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.5f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_feed_level, 0);
		this.entityData.define(DATA_hivex, 0);
		this.entityData.define(DATA_hivey, 0);
		this.entityData.define(DATA_hivez, 0);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (XentaniveEntity.this.getTarget() != null && !XentaniveEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return XentaniveEntity.this.getMoveControl().hasWanted() && XentaniveEntity.this.getTarget() != null && XentaniveEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = XentaniveEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				XentaniveEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = XentaniveEntity.this.getTarget();
				if (XentaniveEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					XentaniveEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = XentaniveEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						XentaniveEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new FloatGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 2, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = XentaniveEntity.this.getRandom();
				double dir_x = XentaniveEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = XentaniveEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = XentaniveEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = XentaniveEntity.this.getX();
				double y = XentaniveEntity.this.getY();
				double z = XentaniveEntity.this.getZ();
				Entity entity = XentaniveEntity.this;
				Level world = XentaniveEntity.this.level();
				return super.canUse() && XenantivetamedyesProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CaveSpider.class, true, false) {
			@Override
			public boolean canUse() {
				double x = XentaniveEntity.this.getX();
				double y = XentaniveEntity.this.getY();
				double z = XentaniveEntity.this.getZ();
				Entity entity = XentaniveEntity.this;
				Level world = XentaniveEntity.this.level();
				return super.canUse() && XenantivetamedyesProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(9, new HurtByTargetGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datafeed_level", this.entityData.get(DATA_feed_level));
		compound.putInt("Datahivex", this.entityData.get(DATA_hivex));
		compound.putInt("Datahivey", this.entityData.get(DATA_hivey));
		compound.putInt("Datahivez", this.entityData.get(DATA_hivez));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datafeed_level"))
			this.entityData.set(DATA_feed_level, compound.getInt("Datafeed_level"));
		if (compound.contains("Datahivex"))
			this.entityData.set(DATA_hivex, compound.getInt("Datahivex"));
		if (compound.contains("Datahivey"))
			this.entityData.set(DATA_hivey, compound.getInt("Datahivey"));
		if (compound.contains("Datahivez"))
			this.entityData.set(DATA_hivez, compound.getInt("Datahivez"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level().isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level().isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState1.animateWhen(XentanivePlaybackConditionProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this), this.tickCount);
			this.animationState2.animateWhen(GrelhoundPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		XentaniveEntity retval = ArkimedianModEntities.XENTANIVE.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(Items.SPIDER_EYE), new ItemStack(ArkimedianModItems.DOCREANTILE_FLESH.get())).test(stack);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 8);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.FLYING_SPEED, 0.2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.2);
		return builder;
	}
}
