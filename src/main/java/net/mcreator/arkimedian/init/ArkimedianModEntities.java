
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.arkimedian.entity.XentaniveEntity;
import net.mcreator.arkimedian.entity.SynriaEntity;
import net.mcreator.arkimedian.entity.SicarionfighterEntity;
import net.mcreator.arkimedian.entity.MME4421Entity;
import net.mcreator.arkimedian.entity.GvralEntity;
import net.mcreator.arkimedian.entity.GrelhoundEntity;
import net.mcreator.arkimedian.entity.GnirilionEntity;
import net.mcreator.arkimedian.entity.ErnetmonstrocityEntity;
import net.mcreator.arkimedian.entity.DocreanitileEntity;
import net.mcreator.arkimedian.entity.CutieEntity;
import net.mcreator.arkimedian.entity.BoltEntity;
import net.mcreator.arkimedian.ArkimedianMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArkimedianModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArkimedianMod.MODID);
	public static final RegistryObject<EntityType<MME4421Entity>> MME_4421 = register("mme_4421",
			EntityType.Builder.<MME4421Entity>of(MME4421Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MME4421Entity::new).fireImmune().sized(1.2f, 3f));
	public static final RegistryObject<EntityType<SynriaEntity>> SYNRIA = register("synria",
			EntityType.Builder.<SynriaEntity>of(SynriaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(53).setUpdateInterval(3).setCustomClientFactory(SynriaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CutieEntity>> CUTIE = register("cutie",
			EntityType.Builder.<CutieEntity>of(CutieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutieEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ErnetmonstrocityEntity>> ERNETMONSTROCITY = register("ernetmonstrocity",
			EntityType.Builder.<ErnetmonstrocityEntity>of(ErnetmonstrocityEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ErnetmonstrocityEntity::new)

					.sized(2.3f, 3.2f));
	public static final RegistryObject<EntityType<XentaniveEntity>> XENTANIVE = register("xentanive",
			EntityType.Builder.<XentaniveEntity>of(XentaniveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XentaniveEntity::new)

					.sized(0.3f, 0.5f));
	public static final RegistryObject<EntityType<GrelhoundEntity>> GRELHOUND = register("grelhound",
			EntityType.Builder.<GrelhoundEntity>of(GrelhoundEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrelhoundEntity::new)

					.sized(1.2f, 1.5f));
	public static final RegistryObject<EntityType<DocreanitileEntity>> DOCREANITILE = register("docreanitile",
			EntityType.Builder.<DocreanitileEntity>of(DocreanitileEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DocreanitileEntity::new)

					.sized(2f, 1.5f));
	public static final RegistryObject<EntityType<GvralEntity>> GVRAL = register("gvral",
			EntityType.Builder.<GvralEntity>of(GvralEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GvralEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SicarionfighterEntity>> SICARIONFIGHTER = register("sicarionfighter", EntityType.Builder.<SicarionfighterEntity>of(SicarionfighterEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SicarionfighterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GnirilionEntity>> GNIRILION = register("gnirilion",
			EntityType.Builder.<GnirilionEntity>of(GnirilionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GnirilionEntity::new).fireImmune().sized(1.1f, 1f));
	public static final RegistryObject<EntityType<BoltEntity>> BOLT = register("bolt",
			EntityType.Builder.<BoltEntity>of(BoltEntity::new, MobCategory.MISC).setCustomClientFactory(BoltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MME4421Entity.init();
			SynriaEntity.init();
			CutieEntity.init();
			ErnetmonstrocityEntity.init();
			XentaniveEntity.init();
			GrelhoundEntity.init();
			DocreanitileEntity.init();
			GvralEntity.init();
			SicarionfighterEntity.init();
			GnirilionEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MME_4421.get(), MME4421Entity.createAttributes().build());
		event.put(SYNRIA.get(), SynriaEntity.createAttributes().build());
		event.put(CUTIE.get(), CutieEntity.createAttributes().build());
		event.put(ERNETMONSTROCITY.get(), ErnetmonstrocityEntity.createAttributes().build());
		event.put(XENTANIVE.get(), XentaniveEntity.createAttributes().build());
		event.put(GRELHOUND.get(), GrelhoundEntity.createAttributes().build());
		event.put(DOCREANITILE.get(), DocreanitileEntity.createAttributes().build());
		event.put(GVRAL.get(), GvralEntity.createAttributes().build());
		event.put(SICARIONFIGHTER.get(), SicarionfighterEntity.createAttributes().build());
		event.put(GNIRILION.get(), GnirilionEntity.createAttributes().build());
	}
}
