
package net.mcreator.arkimedian.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CeracreteWallBlock extends WallBlock {
	public CeracreteWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.8f, 19f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
