
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.arkimedian.world.inventory.UpgradeunlockerscreenMenu;
import net.mcreator.arkimedian.world.inventory.SystemselectMenu;
import net.mcreator.arkimedian.world.inventory.SplitterGUIMenu;
import net.mcreator.arkimedian.world.inventory.SpaceassemblerselectMenu;
import net.mcreator.arkimedian.world.inventory.SpaceassemblercraftingMenu;
import net.mcreator.arkimedian.world.inventory.SolarsystemplanetselectMenu;
import net.mcreator.arkimedian.world.inventory.SmelteryrecipeselectMenu;
import net.mcreator.arkimedian.world.inventory.SmelteryGUIMenu;
import net.mcreator.arkimedian.world.inventory.STORAGEGUIMenu;
import net.mcreator.arkimedian.world.inventory.RefineryrecipeselectMenu;
import net.mcreator.arkimedian.world.inventory.RefineryGUIMenu;
import net.mcreator.arkimedian.world.inventory.PipeguiMenu;
import net.mcreator.arkimedian.world.inventory.OilrigselectionMenu;
import net.mcreator.arkimedian.world.inventory.OilrigGUIMenu;
import net.mcreator.arkimedian.world.inventory.MinerselectionMenu;
import net.mcreator.arkimedian.world.inventory.MinerGUIMenu;
import net.mcreator.arkimedian.world.inventory.MergerGUIMenu;
import net.mcreator.arkimedian.world.inventory.InputGUIMenu;
import net.mcreator.arkimedian.world.inventory.GasexhaustguiMenu;
import net.mcreator.arkimedian.world.inventory.ElectrolyzerrecipeselectMenu;
import net.mcreator.arkimedian.world.inventory.ElectrolyzerGUIMenu;
import net.mcreator.arkimedian.world.inventory.ConstructorcorerecipeselectMenu;
import net.mcreator.arkimedian.world.inventory.Constructioncorerecipeselect2Menu;
import net.mcreator.arkimedian.world.inventory.ConstructCoreGUIMenu;
import net.mcreator.arkimedian.world.inventory.BiomassburnerGUIMenu;
import net.mcreator.arkimedian.world.inventory.BeltliftguiMenu;
import net.mcreator.arkimedian.world.inventory.BeltdirectionGUIMenu;
import net.mcreator.arkimedian.world.inventory.BeltGuiMenu;
import net.mcreator.arkimedian.ArkimedianMod;

public class ArkimedianModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ArkimedianMod.MODID);
	public static final RegistryObject<MenuType<InputGUIMenu>> INPUT_GUI = REGISTRY.register("input_gui", () -> IForgeMenuType.create(InputGUIMenu::new));
	public static final RegistryObject<MenuType<ConstructCoreGUIMenu>> CONSTRUCT_CORE_GUI = REGISTRY.register("construct_core_gui", () -> IForgeMenuType.create(ConstructCoreGUIMenu::new));
	public static final RegistryObject<MenuType<ConstructorcorerecipeselectMenu>> CONSTRUCTORCORERECIPESELECT = REGISTRY.register("constructorcorerecipeselect", () -> IForgeMenuType.create(ConstructorcorerecipeselectMenu::new));
	public static final RegistryObject<MenuType<SmelteryGUIMenu>> SMELTERY_GUI = REGISTRY.register("smeltery_gui", () -> IForgeMenuType.create(SmelteryGUIMenu::new));
	public static final RegistryObject<MenuType<GasexhaustguiMenu>> GASEXHAUSTGUI = REGISTRY.register("gasexhaustgui", () -> IForgeMenuType.create(GasexhaustguiMenu::new));
	public static final RegistryObject<MenuType<SmelteryrecipeselectMenu>> SMELTERYRECIPESELECT = REGISTRY.register("smelteryrecipeselect", () -> IForgeMenuType.create(SmelteryrecipeselectMenu::new));
	public static final RegistryObject<MenuType<RefineryrecipeselectMenu>> REFINERYRECIPESELECT = REGISTRY.register("refineryrecipeselect", () -> IForgeMenuType.create(RefineryrecipeselectMenu::new));
	public static final RegistryObject<MenuType<RefineryGUIMenu>> REFINERY_GUI = REGISTRY.register("refinery_gui", () -> IForgeMenuType.create(RefineryGUIMenu::new));
	public static final RegistryObject<MenuType<MinerselectionMenu>> MINERSELECTION = REGISTRY.register("minerselection", () -> IForgeMenuType.create(MinerselectionMenu::new));
	public static final RegistryObject<MenuType<MinerGUIMenu>> MINER_GUI = REGISTRY.register("miner_gui", () -> IForgeMenuType.create(MinerGUIMenu::new));
	public static final RegistryObject<MenuType<BeltGuiMenu>> BELT_GUI = REGISTRY.register("belt_gui", () -> IForgeMenuType.create(BeltGuiMenu::new));
	public static final RegistryObject<MenuType<STORAGEGUIMenu>> STORAGEGUI = REGISTRY.register("storagegui", () -> IForgeMenuType.create(STORAGEGUIMenu::new));
	public static final RegistryObject<MenuType<MergerGUIMenu>> MERGER_GUI = REGISTRY.register("merger_gui", () -> IForgeMenuType.create(MergerGUIMenu::new));
	public static final RegistryObject<MenuType<OilrigselectionMenu>> OILRIGSELECTION = REGISTRY.register("oilrigselection", () -> IForgeMenuType.create(OilrigselectionMenu::new));
	public static final RegistryObject<MenuType<OilrigGUIMenu>> OILRIG_GUI = REGISTRY.register("oilrig_gui", () -> IForgeMenuType.create(OilrigGUIMenu::new));
	public static final RegistryObject<MenuType<PipeguiMenu>> PIPEGUI = REGISTRY.register("pipegui", () -> IForgeMenuType.create(PipeguiMenu::new));
	public static final RegistryObject<MenuType<SplitterGUIMenu>> SPLITTER_GUI = REGISTRY.register("splitter_gui", () -> IForgeMenuType.create(SplitterGUIMenu::new));
	public static final RegistryObject<MenuType<SystemselectMenu>> SYSTEMSELECT = REGISTRY.register("systemselect", () -> IForgeMenuType.create(SystemselectMenu::new));
	public static final RegistryObject<MenuType<SolarsystemplanetselectMenu>> SOLARSYSTEMPLANETSELECT = REGISTRY.register("solarsystemplanetselect", () -> IForgeMenuType.create(SolarsystemplanetselectMenu::new));
	public static final RegistryObject<MenuType<ElectrolyzerGUIMenu>> ELECTROLYZER_GUI = REGISTRY.register("electrolyzer_gui", () -> IForgeMenuType.create(ElectrolyzerGUIMenu::new));
	public static final RegistryObject<MenuType<ElectrolyzerrecipeselectMenu>> ELECTROLYZERRECIPESELECT = REGISTRY.register("electrolyzerrecipeselect", () -> IForgeMenuType.create(ElectrolyzerrecipeselectMenu::new));
	public static final RegistryObject<MenuType<SpaceassemblerselectMenu>> SPACEASSEMBLERSELECT = REGISTRY.register("spaceassemblerselect", () -> IForgeMenuType.create(SpaceassemblerselectMenu::new));
	public static final RegistryObject<MenuType<SpaceassemblercraftingMenu>> SPACEASSEMBLERCRAFTING = REGISTRY.register("spaceassemblercrafting", () -> IForgeMenuType.create(SpaceassemblercraftingMenu::new));
	public static final RegistryObject<MenuType<Constructioncorerecipeselect2Menu>> CONSTRUCTIONCORERECIPESELECT_2 = REGISTRY.register("constructioncorerecipeselect_2", () -> IForgeMenuType.create(Constructioncorerecipeselect2Menu::new));
	public static final RegistryObject<MenuType<UpgradeunlockerscreenMenu>> UPGRADEUNLOCKERSCREEN = REGISTRY.register("upgradeunlockerscreen", () -> IForgeMenuType.create(UpgradeunlockerscreenMenu::new));
	public static final RegistryObject<MenuType<BeltdirectionGUIMenu>> BELTDIRECTION_GUI = REGISTRY.register("beltdirection_gui", () -> IForgeMenuType.create(BeltdirectionGUIMenu::new));
	public static final RegistryObject<MenuType<BeltliftguiMenu>> BELTLIFTGUI = REGISTRY.register("beltliftgui", () -> IForgeMenuType.create(BeltliftguiMenu::new));
	public static final RegistryObject<MenuType<BiomassburnerGUIMenu>> BIOMASSBURNER_GUI = REGISTRY.register("biomassburner_gui", () -> IForgeMenuType.create(BiomassburnerGUIMenu::new));
}
