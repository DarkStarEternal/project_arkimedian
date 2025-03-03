
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class XenoshroomhatBlock extends Block {
	public XenoshroomhatBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(1.5f, 12.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
