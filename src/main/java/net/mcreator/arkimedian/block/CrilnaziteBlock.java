
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CrilnaziteBlock extends Block {
	public CrilnaziteBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.75f, 17.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
