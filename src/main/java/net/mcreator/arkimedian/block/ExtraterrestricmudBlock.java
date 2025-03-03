
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ExtraterrestricmudBlock extends Block {
	public ExtraterrestricmudBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(1.3f, 10.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
