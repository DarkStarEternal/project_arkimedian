
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpoolItem extends Item {
	public SpoolItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
