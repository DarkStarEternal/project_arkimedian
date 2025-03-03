
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ManufactureditemItem extends Item {
	public ManufactureditemItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON));
	}
}
