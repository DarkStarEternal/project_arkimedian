
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import org.lwjgl.system.windows.INPUT;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.arkimedian.block.entity.XentanivesnestBlockEntity;
import net.mcreator.arkimedian.block.entity.WiringblockBlockEntity;
import net.mcreator.arkimedian.block.entity.UnrinrilLogBlockEntity;
import net.mcreator.arkimedian.block.entity.StoragecontainerBlockEntity;
import net.mcreator.arkimedian.block.entity.SplitterBlockEntity;
import net.mcreator.arkimedian.block.entity.SpaceassemblerBlockEntity;
import net.mcreator.arkimedian.block.entity.SmelteryBlockEntity;
import net.mcreator.arkimedian.block.entity.RefineryBlockEntity;
import net.mcreator.arkimedian.block.entity.PipeoutputBlockEntity;
import net.mcreator.arkimedian.block.entity.PipeBlockEntity;
import net.mcreator.arkimedian.block.entity.OutputBlockEntity;
import net.mcreator.arkimedian.block.entity.OilrigBlockEntity;
import net.mcreator.arkimedian.block.entity.NtrasylLogBlockEntity;
import net.mcreator.arkimedian.block.entity.MinerBlockEntity;
import net.mcreator.arkimedian.block.entity.MergerBlockEntity;
import net.mcreator.arkimedian.block.entity.InputBlockEntity;
import net.mcreator.arkimedian.block.entity.GasexhaustBlockEntity;
import net.mcreator.arkimedian.block.entity.FluidinputBlockEntity;
import net.mcreator.arkimedian.block.entity.FilledxentanivesnestBlockEntity;
import net.mcreator.arkimedian.block.entity.ExhaustwithwireconnectBlockEntity;
import net.mcreator.arkimedian.block.entity.ElectrolyzerBlockEntity;
import net.mcreator.arkimedian.block.entity.ConstructioncoreBlockEntity;
import net.mcreator.arkimedian.block.entity.BiomassgeneratorBlockEntity;
import net.mcreator.arkimedian.block.entity.BeltliftoutputBlockEntity;
import net.mcreator.arkimedian.block.entity.BeltliftinputBlockEntity;
import net.mcreator.arkimedian.block.entity.BeltliftBlockEntity;
import net.mcreator.arkimedian.block.entity.BeltBlockEntity;
import net.mcreator.arkimedian.block.entity.BeltAV2BlockEntity;
import net.mcreator.arkimedian.ArkimedianMod;

public class ArkimedianModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ArkimedianMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INPUT = register("input", ArkimedianModBlocks.INPUT, InputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CONSTRUCTIONCORE = register("constructioncore", ArkimedianModBlocks.CONSTRUCTIONCORE, ConstructioncoreBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMELTERY = register("smeltery", ArkimedianModBlocks.SMELTERY, SmelteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GASEXHAUST = register("gasexhaust", ArkimedianModBlocks.GASEXHAUST, GasexhaustBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BELT_AV_I = register("belt_av_i", ArkimedianModBlocks.BELT_AV_I, BeltBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OUTPUT = register("output", ArkimedianModBlocks.OUTPUT, OutputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STORAGECONTAINER = register("storagecontainer", ArkimedianModBlocks.STORAGECONTAINER, StoragecontainerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REFINERY = register("refinery", ArkimedianModBlocks.REFINERY, RefineryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINER = register("miner", ArkimedianModBlocks.MINER, MinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MERGER = register("merger", ArkimedianModBlocks.MERGER, MergerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OILRIG = register("oilrig", ArkimedianModBlocks.OILRIG, OilrigBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPE = register("pipe", ArkimedianModBlocks.PIPE, PipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PIPEOUTPUT = register("pipeoutput", ArkimedianModBlocks.PIPEOUTPUT, PipeoutputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLUIDINPUT = register("fluidinput", ArkimedianModBlocks.FLUIDINPUT, FluidinputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPLITTER = register("splitter", ArkimedianModBlocks.SPLITTER, SplitterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTROLYZER = register("electrolyzer", ArkimedianModBlocks.ELECTROLYZER, ElectrolyzerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NTRASYL_LOG = register("ntrasyl_log", ArkimedianModBlocks.NTRASYL_LOG, NtrasylLogBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPACEASSEMBLER = register("spaceassembler", ArkimedianModBlocks.SPACEASSEMBLER, SpaceassemblerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BELT_AV_II = register("belt_av_ii", ArkimedianModBlocks.BELT_AV_II, BeltAV2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BELTLIFTINPUT = register("beltliftinput", ArkimedianModBlocks.BELTLIFTINPUT, BeltliftinputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BELTLIFTOUTPUT = register("beltliftoutput", ArkimedianModBlocks.BELTLIFTOUTPUT, BeltliftoutputBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BELTLIFT = register("beltlift", ArkimedianModBlocks.BELTLIFT, BeltliftBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> XENTANIVESNEST = register("xentanivesnest", ArkimedianModBlocks.XENTANIVESNEST, XentanivesnestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FILLEDXENTANIVESNEST = register("filledxentanivesnest", ArkimedianModBlocks.FILLEDXENTANIVESNEST, FilledxentanivesnestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIOMASSGENERATOR = register("biomassgenerator", ArkimedianModBlocks.BIOMASSGENERATOR, BiomassgeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXHAUSTWITHWIRECONNECT = register("exhaustwithwireconnect", ArkimedianModBlocks.EXHAUSTWITHWIRECONNECT, ExhaustwithwireconnectBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNRINRIL_LOG = register("unrinril_log", ArkimedianModBlocks.UNRINRIL_LOG, UnrinrilLogBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WIRINGBLOCK = register("wiringblock", ArkimedianModBlocks.WIRINGBLOCK, WiringblockBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
