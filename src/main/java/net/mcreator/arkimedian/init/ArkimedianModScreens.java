
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.arkimedian.client.gui.UpgradeunlockerscreenScreen;
import net.mcreator.arkimedian.client.gui.SystemselectScreen;
import net.mcreator.arkimedian.client.gui.SplitterGUIScreen;
import net.mcreator.arkimedian.client.gui.SpaceassemblerselectScreen;
import net.mcreator.arkimedian.client.gui.SpaceassemblercraftingScreen;
import net.mcreator.arkimedian.client.gui.SolarsystemplanetselectScreen;
import net.mcreator.arkimedian.client.gui.SmelteryrecipeselectScreen;
import net.mcreator.arkimedian.client.gui.SmelteryGUIScreen;
import net.mcreator.arkimedian.client.gui.STORAGEGUIScreen;
import net.mcreator.arkimedian.client.gui.RefineryrecipeselectScreen;
import net.mcreator.arkimedian.client.gui.RefineryGUIScreen;
import net.mcreator.arkimedian.client.gui.PipeguiScreen;
import net.mcreator.arkimedian.client.gui.OilrigselectionScreen;
import net.mcreator.arkimedian.client.gui.OilrigGUIScreen;
import net.mcreator.arkimedian.client.gui.MinerselectionScreen;
import net.mcreator.arkimedian.client.gui.MinerGUIScreen;
import net.mcreator.arkimedian.client.gui.MergerGUIScreen;
import net.mcreator.arkimedian.client.gui.InputGUIScreen;
import net.mcreator.arkimedian.client.gui.GasexhaustguiScreen;
import net.mcreator.arkimedian.client.gui.ElectrolyzerrecipeselectScreen;
import net.mcreator.arkimedian.client.gui.ElectrolyzerGUIScreen;
import net.mcreator.arkimedian.client.gui.ConstructorcorerecipeselectScreen;
import net.mcreator.arkimedian.client.gui.Constructioncorerecipeselect2Screen;
import net.mcreator.arkimedian.client.gui.ConstructCoreGUIScreen;
import net.mcreator.arkimedian.client.gui.BiomassburnerGUIScreen;
import net.mcreator.arkimedian.client.gui.BeltliftguiScreen;
import net.mcreator.arkimedian.client.gui.BeltdirectionGUIScreen;
import net.mcreator.arkimedian.client.gui.BeltGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArkimedianModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ArkimedianModMenus.INPUT_GUI.get(), InputGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.CONSTRUCT_CORE_GUI.get(), ConstructCoreGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.CONSTRUCTORCORERECIPESELECT.get(), ConstructorcorerecipeselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.SMELTERY_GUI.get(), SmelteryGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.GASEXHAUSTGUI.get(), GasexhaustguiScreen::new);
			MenuScreens.register(ArkimedianModMenus.SMELTERYRECIPESELECT.get(), SmelteryrecipeselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.REFINERYRECIPESELECT.get(), RefineryrecipeselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.REFINERY_GUI.get(), RefineryGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.MINERSELECTION.get(), MinerselectionScreen::new);
			MenuScreens.register(ArkimedianModMenus.MINER_GUI.get(), MinerGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.BELT_GUI.get(), BeltGuiScreen::new);
			MenuScreens.register(ArkimedianModMenus.STORAGEGUI.get(), STORAGEGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.MERGER_GUI.get(), MergerGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.OILRIGSELECTION.get(), OilrigselectionScreen::new);
			MenuScreens.register(ArkimedianModMenus.OILRIG_GUI.get(), OilrigGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.PIPEGUI.get(), PipeguiScreen::new);
			MenuScreens.register(ArkimedianModMenus.SPLITTER_GUI.get(), SplitterGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.SYSTEMSELECT.get(), SystemselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.SOLARSYSTEMPLANETSELECT.get(), SolarsystemplanetselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.ELECTROLYZER_GUI.get(), ElectrolyzerGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.ELECTROLYZERRECIPESELECT.get(), ElectrolyzerrecipeselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.SPACEASSEMBLERSELECT.get(), SpaceassemblerselectScreen::new);
			MenuScreens.register(ArkimedianModMenus.SPACEASSEMBLERCRAFTING.get(), SpaceassemblercraftingScreen::new);
			MenuScreens.register(ArkimedianModMenus.CONSTRUCTIONCORERECIPESELECT_2.get(), Constructioncorerecipeselect2Screen::new);
			MenuScreens.register(ArkimedianModMenus.UPGRADEUNLOCKERSCREEN.get(), UpgradeunlockerscreenScreen::new);
			MenuScreens.register(ArkimedianModMenus.BELTDIRECTION_GUI.get(), BeltdirectionGUIScreen::new);
			MenuScreens.register(ArkimedianModMenus.BELTLIFTGUI.get(), BeltliftguiScreen::new);
			MenuScreens.register(ArkimedianModMenus.BIOMASSBURNER_GUI.get(), BiomassburnerGUIScreen::new);
		});
	}
}
