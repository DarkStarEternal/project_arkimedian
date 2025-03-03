
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class CeracreteStairBlock extends StairBlock {
	public CeracreteStairBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.8f, 19f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 19f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
