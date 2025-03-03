
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WrenchItem extends Item {
	public WrenchItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
