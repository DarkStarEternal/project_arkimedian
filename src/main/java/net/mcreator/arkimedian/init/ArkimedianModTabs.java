
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.arkimedian.ArkimedianMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArkimedianModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArkimedianMod.MODID);
	public static final RegistryObject<CreativeModeTab> PROJECTARKIMEDIAN = REGISTRY.register("projectarkimedian",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.arkimedian.projectarkimedian")).icon(() -> new ItemStack(ArkimedianModBlocks.CONSTRUCTIONCORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ArkimedianModBlocks.INPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.OUTPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.FLUIDINPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.PIPEOUTPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.MERGER.get().asItem());
				tabData.accept(ArkimedianModBlocks.SPLITTER.get().asItem());
				tabData.accept(ArkimedianModBlocks.CONSTRUCTIONCORE.get().asItem());
				tabData.accept(ArkimedianModBlocks.SMELTERY.get().asItem());
				tabData.accept(ArkimedianModBlocks.ELECTROLYZER.get().asItem());
				tabData.accept(ArkimedianModBlocks.SPACEASSEMBLER.get().asItem());
				tabData.accept(ArkimedianModBlocks.GASEXHAUST.get().asItem());
				tabData.accept(ArkimedianModBlocks.BELT_AV_I.get().asItem());
				tabData.accept(ArkimedianModBlocks.BELT_AV_II.get().asItem());
				tabData.accept(ArkimedianModBlocks.PIPE.get().asItem());
				tabData.accept(ArkimedianModBlocks.BELTLIFT.get().asItem());
				tabData.accept(ArkimedianModBlocks.BELTLIFTINPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.BELTLIFTOUTPUT.get().asItem());
				tabData.accept(ArkimedianModBlocks.STORAGECONTAINER.get().asItem());
				tabData.accept(ArkimedianModBlocks.REFINERY.get().asItem());
				tabData.accept(ArkimedianModBlocks.OILRIG.get().asItem());
				tabData.accept(ArkimedianModBlocks.MINERSHAFT.get().asItem());
				tabData.accept(ArkimedianModBlocks.MINER.get().asItem());
				tabData.accept(ArkimedianModBlocks.OILVEIN.get().asItem());
				tabData.accept(ArkimedianModBlocks.OREVEINORE.get().asItem());
				tabData.accept(ArkimedianModBlocks.OREVEINBLOCK.get().asItem());
				tabData.accept(ArkimedianModBlocks.COPPERVEINORE.get().asItem());
				tabData.accept(ArkimedianModBlocks.COPPERVEINBLOCK.get().asItem());
				tabData.accept(ArkimedianModBlocks.MARSSTONE.get().asItem());
				tabData.accept(ArkimedianModBlocks.MARSSAND.get().asItem());
				tabData.accept(ArkimedianModBlocks.MARSGOLDOREVEIN.get().asItem());
				tabData.accept(ArkimedianModBlocks.ALUMINIUMORE_VEIN.get().asItem());
				tabData.accept(ArkimedianModBlocks.ALUMINIUMOREVEINSIDE.get().asItem());
				tabData.accept(ArkimedianModBlocks.NTRASYL_WOOD.get().asItem());
				tabData.accept(ArkimedianModBlocks.NTRASYL_LOG.get().asItem());
				tabData.accept(ArkimedianModBlocks.NTRASYL_LEAVES.get().asItem());
				tabData.accept(ArkimedianModBlocks.NTRASYLLEAVESSLAB.get().asItem());
				tabData.accept(ArkimedianModBlocks.SININCA_WOOD.get().asItem());
				tabData.accept(ArkimedianModBlocks.SININCA_LOG.get().asItem());
				tabData.accept(ArkimedianModBlocks.SININCA_LEAVES.get().asItem());
				tabData.accept(ArkimedianModBlocks.CERAMITEVEIN.get().asItem());
				tabData.accept(ArkimedianModBlocks.CERAMITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.EXTRATERRESTRICDIRT.get().asItem());
				tabData.accept(ArkimedianModBlocks.SILANITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.TURNITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.CALITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.GWEN_SERVER.get().asItem());
				tabData.accept(ArkimedianModBlocks.METALCASING.get().asItem());
				tabData.accept(ArkimedianModBlocks.METALCASING_STAIRS.get().asItem());
				tabData.accept(ArkimedianModBlocks.METALCASING_SLAB.get().asItem());
				tabData.accept(ArkimedianModBlocks.PLATECASING.get().asItem());
				tabData.accept(ArkimedianModBlocks.PLATECASING_STAIRS.get().asItem());
				tabData.accept(ArkimedianModBlocks.PLATECASING_SLAB.get().asItem());
				tabData.accept(ArkimedianModBlocks.BIOMASSWOOD_PLANKS.get().asItem());
				tabData.accept(ArkimedianModBlocks.BIOMASSWOOD_STAIRS.get().asItem());
				tabData.accept(ArkimedianModBlocks.BIOMASSWOOD_SLAB.get().asItem());
				tabData.accept(ArkimedianModBlocks.BIOMASSWOOD_FENCE.get().asItem());
				tabData.accept(ArkimedianModBlocks.FOUNDATION.get().asItem());
				tabData.accept(ArkimedianModBlocks.EXTRATERRESTRICMUD.get().asItem());
				tabData.accept(ArkimedianModBlocks.XENOSHROOMSTEM.get().asItem());
				tabData.accept(ArkimedianModBlocks.XENOSHROOMHAT.get().asItem());
				tabData.accept(ArkimedianModBlocks.TORANILE_LEAVES.get().asItem());
				tabData.accept(ArkimedianModBlocks.TORANILE_LOG.get().asItem());
				tabData.accept(ArkimedianModBlocks.TORANILE_WOOD.get().asItem());
				tabData.accept(ArkimedianModBlocks.XENTANIVESNEST.get().asItem());
				tabData.accept(ArkimedianModBlocks.FILLEDXENTANIVESNEST.get().asItem());
				tabData.accept(ArkimedianModBlocks.BIOMASSGENERATOR.get().asItem());
				tabData.accept(ArkimedianModBlocks.DOCREANITILEFLESH.get().asItem());
				tabData.accept(ArkimedianModBlocks.EXHAUSTWITHWIRECONNECT.get().asItem());
				tabData.accept(ArkimedianModBlocks.MENTRIOLITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.MENTRIOLITEWARP.get().asItem());
				tabData.accept(ArkimedianModBlocks.WARPCRYSTAL.get().asItem());
				tabData.accept(ArkimedianModBlocks.HOLOGRAMDISPLAYER.get().asItem());
				tabData.accept(ArkimedianModBlocks.UNRINRIL_LOG.get().asItem());
				tabData.accept(ArkimedianModBlocks.UNRINRIL_WOOD.get().asItem());
				tabData.accept(ArkimedianModBlocks.HEATEDDIRT.get().asItem());
				tabData.accept(ArkimedianModBlocks.MOSSY_CRILNAZITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.CRILNAZITE.get().asItem());
				tabData.accept(ArkimedianModBlocks.WIRINGBLOCK.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> PROJECTARKIMEDIANITEMS = REGISTRY.register("projectarkimedianitems", () -> CreativeModeTab.builder().title(Component.translatable("item_group.arkimedian.projectarkimedianitems"))
			.icon(() -> new ItemStack(ArkimedianModItems.ARKIMEDIAN_AV_1_POWERARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ArkimedianModItems.ASAD.get());
				tabData.accept(ArkimedianModItems.CIRCUITS.get());
				tabData.accept(ArkimedianModItems.MOTOR.get());
				tabData.accept(ArkimedianModItems.SPOOL.get());
				tabData.accept(ArkimedianModItems.COPPERSPOOL.get());
				tabData.accept(ArkimedianModItems.CABLE.get());
				tabData.accept(ArkimedianModItems.HEAVYPLATE.get());
				tabData.accept(ArkimedianModItems.STATOR.get());
				tabData.accept(ArkimedianModItems.ROTOR.get());
				tabData.accept(ArkimedianModItems.COMPUTER.get());
				tabData.accept(ArkimedianModItems.PLASTIC.get());
				tabData.accept(ArkimedianModItems.PLASTICRESIN.get());
				tabData.accept(ArkimedianModItems.ARKIMEDIAN_AV_1_POWERARMOR_HELMET.get());
				tabData.accept(ArkimedianModItems.ARKIMEDIAN_AV_1_POWERARMOR_CHESTPLATE.get());
				tabData.accept(ArkimedianModItems.ARKIMEDIAN_AV_1_POWERARMOR_LEGGINGS.get());
				tabData.accept(ArkimedianModItems.ARKIMEDIAN_AV_1_POWERARMOR_BOOTS.get());
				tabData.accept(ArkimedianModItems.IRONSPOOLEMPTY.get());
				tabData.accept(ArkimedianModItems.COPPER_IRONSPOOL.get());
				tabData.accept(ArkimedianModItems.GOLD_IRONSPOOL.get());
				tabData.accept(ArkimedianModItems.COMPLEXCIRCUIT.get());
				tabData.accept(ArkimedianModItems.EXOSKELETONCHESTPLATE.get());
				tabData.accept(ArkimedianModItems.EXOSKELETONBOOTS.get());
				tabData.accept(ArkimedianModItems.EXOSKELETON_LEGGINGS.get());
				tabData.accept(ArkimedianModItems.FABRIC.get());
				tabData.accept(ArkimedianModItems.SPACESUIT_HELMET.get());
				tabData.accept(ArkimedianModItems.THRUSTER.get());
				tabData.accept(ArkimedianModItems.SPACEPROOFPLATING.get());
				tabData.accept(ArkimedianModItems.ENERGYCORE.get());
				tabData.accept(ArkimedianModItems.AIRDUCTFABRIC.get());
				tabData.accept(ArkimedianModItems.FUELTANK.get());
				tabData.accept(ArkimedianModItems.SHIPCONTROLUNIT.get());
				tabData.accept(ArkimedianModItems.BAUXITE.get());
				tabData.accept(ArkimedianModItems.ALUMINIUM.get());
				tabData.accept(ArkimedianModItems.UNREFINEDALUMINIUMSCRAP.get());
				tabData.accept(ArkimedianModItems.ALUMINIUMSHEET.get());
				tabData.accept(ArkimedianModItems.ALUMINIUMACID.get());
				tabData.accept(ArkimedianModItems.BOLTGUN.get());
				tabData.accept(ArkimedianModItems.CHAINSWORD.get());
				tabData.accept(ArkimedianModItems.BIOMASS.get());
				tabData.accept(ArkimedianModItems.SYNRIAFLESH.get());
				tabData.accept(ArkimedianModItems.DOCREANTILE_FLESH.get());
				tabData.accept(ArkimedianModItems.GRELHOUND_FUR.get());
				tabData.accept(ArkimedianModItems.BOLTCONTAINER.get());
				tabData.accept(ArkimedianModItems.BOLTS.get());
				tabData.accept(ArkimedianModItems.URANIUMSHARD.get());
				tabData.accept(ArkimedianModItems.BOLTRITE.get());
				tabData.accept(ArkimedianModItems.SOROSTEELLUMP.get());
				tabData.accept(ArkimedianModItems.AMMOUPGRADE.get());
			}).withTabsBefore(PROJECTARKIMEDIAN.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ArkimedianModItems.SYNRIA_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.CUTIE_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.ERNETMONSTROCITY_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.XENTANIVE_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.GRELHOUND_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.DOCREANITILE_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.GVRAL_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.SICARIONFIGHTER_SPAWN_EGG.get());
			tabData.accept(ArkimedianModItems.GNIRILION_SPAWN_EGG.get());
		}
	}
}
