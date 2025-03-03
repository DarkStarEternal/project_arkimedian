
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import org.lwjgl.system.windows.INPUT;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.arkimedian.block.XentanivesnestBlock;
import net.mcreator.arkimedian.block.XenoshroomstemBlock;
import net.mcreator.arkimedian.block.XenoshroomhatBlock;
import net.mcreator.arkimedian.block.WiringblockBlock;
import net.mcreator.arkimedian.block.WarpcrystalBlock;
import net.mcreator.arkimedian.block.UnrinrilWoodBlock;
import net.mcreator.arkimedian.block.UnrinrilLogBlock;
import net.mcreator.arkimedian.block.TurniteBlock;
import net.mcreator.arkimedian.block.ToranileWoodBlock;
import net.mcreator.arkimedian.block.ToranileLogBlock;
import net.mcreator.arkimedian.block.ToranileLeavesBlock;
import net.mcreator.arkimedian.block.StoragecontainerBlock;
import net.mcreator.arkimedian.block.SplitterBlock;
import net.mcreator.arkimedian.block.SpaceassemblerBlock;
import net.mcreator.arkimedian.block.SmelteryBlock;
import net.mcreator.arkimedian.block.SinincaWoodBlock;
import net.mcreator.arkimedian.block.SinincaLogBlock;
import net.mcreator.arkimedian.block.SinincaLeavesBlock;
import net.mcreator.arkimedian.block.SilaniteBlock;
import net.mcreator.arkimedian.block.RefineryBlock;
import net.mcreator.arkimedian.block.PlatecasingStairsBlock;
import net.mcreator.arkimedian.block.PlatecasingSlabBlock;
import net.mcreator.arkimedian.block.PlatecasingBlock;
import net.mcreator.arkimedian.block.PipeoutputBlock;
import net.mcreator.arkimedian.block.PipeBlock;
import net.mcreator.arkimedian.block.OutputBlock;
import net.mcreator.arkimedian.block.OreveinoreBlock;
import net.mcreator.arkimedian.block.OreveinblockBlock;
import net.mcreator.arkimedian.block.OilveinBlock;
import net.mcreator.arkimedian.block.OilrigBlock;
import net.mcreator.arkimedian.block.NtrasylleavesslabBlock;
import net.mcreator.arkimedian.block.NtrasylWoodBlock;
import net.mcreator.arkimedian.block.NtrasylLogBlock;
import net.mcreator.arkimedian.block.NtrasylLeavesBlock;
import net.mcreator.arkimedian.block.NaplaBlock;
import net.mcreator.arkimedian.block.MossyCrilnaziteBlock;
import net.mcreator.arkimedian.block.MinershaftBlock;
import net.mcreator.arkimedian.block.MinerBlock;
import net.mcreator.arkimedian.block.MetalcasingStairsBlock;
import net.mcreator.arkimedian.block.MetalcasingSlabBlock;
import net.mcreator.arkimedian.block.MetalcasingBlock;
import net.mcreator.arkimedian.block.MergerBlock;
import net.mcreator.arkimedian.block.MentriolitewarpBlock;
import net.mcreator.arkimedian.block.MentrioliteBlock;
import net.mcreator.arkimedian.block.MarsstoneBlock;
import net.mcreator.arkimedian.block.MarssandBlock;
import net.mcreator.arkimedian.block.MarsgoldoreveinBlock;
import net.mcreator.arkimedian.block.InputBlock;
import net.mcreator.arkimedian.block.HologramdisplayerBlock;
import net.mcreator.arkimedian.block.HeatedgrassblockBlock;
import net.mcreator.arkimedian.block.HeateddirtBlock;
import net.mcreator.arkimedian.block.GwenServerBlock;
import net.mcreator.arkimedian.block.GvralhologramBlock;
import net.mcreator.arkimedian.block.GasexhaustBlock;
import net.mcreator.arkimedian.block.FoundationBlock;
import net.mcreator.arkimedian.block.FluidinputBlock;
import net.mcreator.arkimedian.block.FilledxentanivesnestBlock;
import net.mcreator.arkimedian.block.ExtraterrestricmudBlock;
import net.mcreator.arkimedian.block.ExtraterrestricdirtBlock;
import net.mcreator.arkimedian.block.ExtraterresticgrassBlock;
import net.mcreator.arkimedian.block.ExhaustwithwireconnectBlock;
import net.mcreator.arkimedian.block.EnergyclusterBlock;
import net.mcreator.arkimedian.block.ElectrolyzerBlock;
import net.mcreator.arkimedian.block.DocreanitilefleshBlock;
import net.mcreator.arkimedian.block.DisplayBlock;
import net.mcreator.arkimedian.block.CrilnaziteBlock;
import net.mcreator.arkimedian.block.CopperveinoreBlock;
import net.mcreator.arkimedian.block.CopperveinblockBlock;
import net.mcreator.arkimedian.block.ConstructioncoreBlock;
import net.mcreator.arkimedian.block.CeramiteveinBlock;
import net.mcreator.arkimedian.block.CeramiteBlock;
import net.mcreator.arkimedian.block.CeracreteWallBlock;
import net.mcreator.arkimedian.block.CeracreteStairBlock;
import net.mcreator.arkimedian.block.CeracreteSlabBlock;
import net.mcreator.arkimedian.block.CeracreteBlock;
import net.mcreator.arkimedian.block.CaliteBlock;
import net.mcreator.arkimedian.block.BiomasswoodStairsBlock;
import net.mcreator.arkimedian.block.BiomasswoodSlabBlock;
import net.mcreator.arkimedian.block.BiomasswoodPlanksBlock;
import net.mcreator.arkimedian.block.BiomasswoodFenceBlock;
import net.mcreator.arkimedian.block.BiomassgeneratorBlock;
import net.mcreator.arkimedian.block.BeltliftoutputBlock;
import net.mcreator.arkimedian.block.BeltliftinputBlock;
import net.mcreator.arkimedian.block.BeltliftBlock;
import net.mcreator.arkimedian.block.BeltBlock;
import net.mcreator.arkimedian.block.BeltAV2Block;
import net.mcreator.arkimedian.block.AluminiumoreveinsideBlock;
import net.mcreator.arkimedian.block.AluminiumoreVeinBlock;
import net.mcreator.arkimedian.ArkimedianMod;

public class ArkimedianModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArkimedianMod.MODID);
	public static final RegistryObject<Block> INPUT = REGISTRY.register("input", () -> new InputBlock());
	public static final RegistryObject<Block> CONSTRUCTIONCORE = REGISTRY.register("constructioncore", () -> new ConstructioncoreBlock());
	public static final RegistryObject<Block> SMELTERY = REGISTRY.register("smeltery", () -> new SmelteryBlock());
	public static final RegistryObject<Block> GASEXHAUST = REGISTRY.register("gasexhaust", () -> new GasexhaustBlock());
	public static final RegistryObject<Block> GWEN_SERVER = REGISTRY.register("gwen_server", () -> new GwenServerBlock());
	public static final RegistryObject<Block> BELT_AV_I = REGISTRY.register("belt_av_i", () -> new BeltBlock());
	public static final RegistryObject<Block> OUTPUT = REGISTRY.register("output", () -> new OutputBlock());
	public static final RegistryObject<Block> STORAGECONTAINER = REGISTRY.register("storagecontainer", () -> new StoragecontainerBlock());
	public static final RegistryObject<Block> REFINERY = REGISTRY.register("refinery", () -> new RefineryBlock());
	public static final RegistryObject<Block> OREVEINORE = REGISTRY.register("oreveinore", () -> new OreveinoreBlock());
	public static final RegistryObject<Block> OREVEINBLOCK = REGISTRY.register("oreveinblock", () -> new OreveinblockBlock());
	public static final RegistryObject<Block> OILVEIN = REGISTRY.register("oilvein", () -> new OilveinBlock());
	public static final RegistryObject<Block> MINER = REGISTRY.register("miner", () -> new MinerBlock());
	public static final RegistryObject<Block> FOUNDATION = REGISTRY.register("foundation", () -> new FoundationBlock());
	public static final RegistryObject<Block> COPPERVEINORE = REGISTRY.register("copperveinore", () -> new CopperveinoreBlock());
	public static final RegistryObject<Block> COPPERVEINBLOCK = REGISTRY.register("copperveinblock", () -> new CopperveinblockBlock());
	public static final RegistryObject<Block> MERGER = REGISTRY.register("merger", () -> new MergerBlock());
	public static final RegistryObject<Block> MINERSHAFT = REGISTRY.register("minershaft", () -> new MinershaftBlock());
	public static final RegistryObject<Block> OILRIG = REGISTRY.register("oilrig", () -> new OilrigBlock());
	public static final RegistryObject<Block> PIPE = REGISTRY.register("pipe", () -> new PipeBlock());
	public static final RegistryObject<Block> PIPEOUTPUT = REGISTRY.register("pipeoutput", () -> new PipeoutputBlock());
	public static final RegistryObject<Block> FLUIDINPUT = REGISTRY.register("fluidinput", () -> new FluidinputBlock());
	public static final RegistryObject<Block> SPLITTER = REGISTRY.register("splitter", () -> new SplitterBlock());
	public static final RegistryObject<Block> MARSSTONE = REGISTRY.register("marsstone", () -> new MarsstoneBlock());
	public static final RegistryObject<Block> MARSSAND = REGISTRY.register("marssand", () -> new MarssandBlock());
	public static final RegistryObject<Block> MARSGOLDOREVEIN = REGISTRY.register("marsgoldorevein", () -> new MarsgoldoreveinBlock());
	public static final RegistryObject<Block> ALUMINIUMORE_VEIN = REGISTRY.register("aluminiumore_vein", () -> new AluminiumoreVeinBlock());
	public static final RegistryObject<Block> ALUMINIUMOREVEINSIDE = REGISTRY.register("aluminiumoreveinside", () -> new AluminiumoreveinsideBlock());
	public static final RegistryObject<Block> ELECTROLYZER = REGISTRY.register("electrolyzer", () -> new ElectrolyzerBlock());
	public static final RegistryObject<Block> NTRASYL_WOOD = REGISTRY.register("ntrasyl_wood", () -> new NtrasylWoodBlock());
	public static final RegistryObject<Block> NTRASYL_LOG = REGISTRY.register("ntrasyl_log", () -> new NtrasylLogBlock());
	public static final RegistryObject<Block> NTRASYL_LEAVES = REGISTRY.register("ntrasyl_leaves", () -> new NtrasylLeavesBlock());
	public static final RegistryObject<Block> NTRASYLLEAVESSLAB = REGISTRY.register("ntrasylleavesslab", () -> new NtrasylleavesslabBlock());
	public static final RegistryObject<Block> SININCA_WOOD = REGISTRY.register("sininca_wood", () -> new SinincaWoodBlock());
	public static final RegistryObject<Block> SININCA_LOG = REGISTRY.register("sininca_log", () -> new SinincaLogBlock());
	public static final RegistryObject<Block> SININCA_LEAVES = REGISTRY.register("sininca_leaves", () -> new SinincaLeavesBlock());
	public static final RegistryObject<Block> SPACEASSEMBLER = REGISTRY.register("spaceassembler", () -> new SpaceassemblerBlock());
	public static final RegistryObject<Block> BELT_AV_II = REGISTRY.register("belt_av_ii", () -> new BeltAV2Block());
	public static final RegistryObject<Block> DISPLAY = REGISTRY.register("display", () -> new DisplayBlock());
	public static final RegistryObject<Block> ENERGYCLUSTER = REGISTRY.register("energycluster", () -> new EnergyclusterBlock());
	public static final RegistryObject<Block> CERAMITEVEIN = REGISTRY.register("ceramitevein", () -> new CeramiteveinBlock());
	public static final RegistryObject<Block> CERAMITE = REGISTRY.register("ceramite", () -> new CeramiteBlock());
	public static final RegistryObject<Block> CERACRETE = REGISTRY.register("ceracrete", () -> new CeracreteBlock());
	public static final RegistryObject<Block> CERACRETE_SLAB = REGISTRY.register("ceracrete_slab", () -> new CeracreteSlabBlock());
	public static final RegistryObject<Block> CERACRETE_STAIR = REGISTRY.register("ceracrete_stair", () -> new CeracreteStairBlock());
	public static final RegistryObject<Block> CERACRETE_WALL = REGISTRY.register("ceracrete_wall", () -> new CeracreteWallBlock());
	public static final RegistryObject<Block> METALCASING = REGISTRY.register("metalcasing", () -> new MetalcasingBlock());
	public static final RegistryObject<Block> METALCASING_STAIRS = REGISTRY.register("metalcasing_stairs", () -> new MetalcasingStairsBlock());
	public static final RegistryObject<Block> METALCASING_SLAB = REGISTRY.register("metalcasing_slab", () -> new MetalcasingSlabBlock());
	public static final RegistryObject<Block> NAPLA = REGISTRY.register("napla", () -> new NaplaBlock());
	public static final RegistryObject<Block> EXTRATERRESTRICDIRT = REGISTRY.register("extraterrestricdirt", () -> new ExtraterrestricdirtBlock());
	public static final RegistryObject<Block> EXTRATERRESTICGRASS = REGISTRY.register("extraterresticgrass", () -> new ExtraterresticgrassBlock());
	public static final RegistryObject<Block> SILANITE = REGISTRY.register("silanite", () -> new SilaniteBlock());
	public static final RegistryObject<Block> TURNITE = REGISTRY.register("turnite", () -> new TurniteBlock());
	public static final RegistryObject<Block> CALITE = REGISTRY.register("calite", () -> new CaliteBlock());
	public static final RegistryObject<Block> BELTLIFTINPUT = REGISTRY.register("beltliftinput", () -> new BeltliftinputBlock());
	public static final RegistryObject<Block> BELTLIFTOUTPUT = REGISTRY.register("beltliftoutput", () -> new BeltliftoutputBlock());
	public static final RegistryObject<Block> BELTLIFT = REGISTRY.register("beltlift", () -> new BeltliftBlock());
	public static final RegistryObject<Block> BIOMASSWOOD_PLANKS = REGISTRY.register("biomasswood_planks", () -> new BiomasswoodPlanksBlock());
	public static final RegistryObject<Block> BIOMASSWOOD_STAIRS = REGISTRY.register("biomasswood_stairs", () -> new BiomasswoodStairsBlock());
	public static final RegistryObject<Block> BIOMASSWOOD_SLAB = REGISTRY.register("biomasswood_slab", () -> new BiomasswoodSlabBlock());
	public static final RegistryObject<Block> BIOMASSWOOD_FENCE = REGISTRY.register("biomasswood_fence", () -> new BiomasswoodFenceBlock());
	public static final RegistryObject<Block> PLATECASING = REGISTRY.register("platecasing", () -> new PlatecasingBlock());
	public static final RegistryObject<Block> PLATECASING_STAIRS = REGISTRY.register("platecasing_stairs", () -> new PlatecasingStairsBlock());
	public static final RegistryObject<Block> PLATECASING_SLAB = REGISTRY.register("platecasing_slab", () -> new PlatecasingSlabBlock());
	public static final RegistryObject<Block> EXTRATERRESTRICMUD = REGISTRY.register("extraterrestricmud", () -> new ExtraterrestricmudBlock());
	public static final RegistryObject<Block> XENOSHROOMSTEM = REGISTRY.register("xenoshroomstem", () -> new XenoshroomstemBlock());
	public static final RegistryObject<Block> XENOSHROOMHAT = REGISTRY.register("xenoshroomhat", () -> new XenoshroomhatBlock());
	public static final RegistryObject<Block> TORANILE_WOOD = REGISTRY.register("toranile_wood", () -> new ToranileWoodBlock());
	public static final RegistryObject<Block> TORANILE_LOG = REGISTRY.register("toranile_log", () -> new ToranileLogBlock());
	public static final RegistryObject<Block> TORANILE_LEAVES = REGISTRY.register("toranile_leaves", () -> new ToranileLeavesBlock());
	public static final RegistryObject<Block> XENTANIVESNEST = REGISTRY.register("xentanivesnest", () -> new XentanivesnestBlock());
	public static final RegistryObject<Block> FILLEDXENTANIVESNEST = REGISTRY.register("filledxentanivesnest", () -> new FilledxentanivesnestBlock());
	public static final RegistryObject<Block> BIOMASSGENERATOR = REGISTRY.register("biomassgenerator", () -> new BiomassgeneratorBlock());
	public static final RegistryObject<Block> DOCREANITILEFLESH = REGISTRY.register("docreanitileflesh", () -> new DocreanitilefleshBlock());
	public static final RegistryObject<Block> EXHAUSTWITHWIRECONNECT = REGISTRY.register("exhaustwithwireconnect", () -> new ExhaustwithwireconnectBlock());
	public static final RegistryObject<Block> MENTRIOLITE = REGISTRY.register("mentriolite", () -> new MentrioliteBlock());
	public static final RegistryObject<Block> MENTRIOLITEWARP = REGISTRY.register("mentriolitewarp", () -> new MentriolitewarpBlock());
	public static final RegistryObject<Block> WARPCRYSTAL = REGISTRY.register("warpcrystal", () -> new WarpcrystalBlock());
	public static final RegistryObject<Block> HOLOGRAMDISPLAYER = REGISTRY.register("hologramdisplayer", () -> new HologramdisplayerBlock());
	public static final RegistryObject<Block> GVRALHOLOGRAM = REGISTRY.register("gvralhologram", () -> new GvralhologramBlock());
	public static final RegistryObject<Block> UNRINRIL_LOG = REGISTRY.register("unrinril_log", () -> new UnrinrilLogBlock());
	public static final RegistryObject<Block> UNRINRIL_WOOD = REGISTRY.register("unrinril_wood", () -> new UnrinrilWoodBlock());
	public static final RegistryObject<Block> HEATEDDIRT = REGISTRY.register("heateddirt", () -> new HeateddirtBlock());
	public static final RegistryObject<Block> HEATEDGRASSBLOCK = REGISTRY.register("heatedgrassblock", () -> new HeatedgrassblockBlock());
	public static final RegistryObject<Block> CRILNAZITE = REGISTRY.register("crilnazite", () -> new CrilnaziteBlock());
	public static final RegistryObject<Block> MOSSY_CRILNAZITE = REGISTRY.register("mossy_crilnazite", () -> new MossyCrilnaziteBlock());
	public static final RegistryObject<Block> WIRINGBLOCK = REGISTRY.register("wiringblock", () -> new WiringblockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			NtrasylLeavesBlock.blockColorLoad(event);
			NtrasylleavesslabBlock.blockColorLoad(event);
			SinincaLeavesBlock.blockColorLoad(event);
			ExtraterresticgrassBlock.blockColorLoad(event);
			ToranileLeavesBlock.blockColorLoad(event);
			HeatedgrassblockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			NtrasylLeavesBlock.itemColorLoad(event);
			NtrasylleavesslabBlock.itemColorLoad(event);
			SinincaLeavesBlock.itemColorLoad(event);
			ExtraterresticgrassBlock.itemColorLoad(event);
			ToranileLeavesBlock.itemColorLoad(event);
			HeatedgrassblockBlock.itemColorLoad(event);
		}
	}
}
