
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ComputerItem extends Item {
	public ComputerItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
