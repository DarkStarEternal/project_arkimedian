
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnrefinedaluminiumscrapItem extends Item {
	public UnrefinedaluminiumscrapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
