
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CeracreteSlabBlock extends SlabBlock {
	public CeracreteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.8f, 19f).requiresCorrectToolForDrops());
	}
}
