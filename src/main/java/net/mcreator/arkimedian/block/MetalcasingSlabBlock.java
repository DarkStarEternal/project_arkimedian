
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MetalcasingSlabBlock extends SlabBlock {
	public MetalcasingSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 10f));
	}
}
