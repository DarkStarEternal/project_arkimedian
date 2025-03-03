
package net.mcreator.arkimedian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.arkimedian.procedures.OpenmeatinteractionsProcedure;

public class SynriafleshItem extends Item {
	public SynriafleshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.5f).meat().build()));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		OpenmeatinteractionsProcedure.execute(entity);
	}
}
