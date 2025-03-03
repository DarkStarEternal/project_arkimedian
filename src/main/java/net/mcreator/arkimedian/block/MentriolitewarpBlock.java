
package net.mcreator.arkimedian.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class MentriolitewarpBlock extends Block {
	public MentriolitewarpBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3.7f, 36.5f).lightLevel(s -> 1));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
