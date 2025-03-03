
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MotorItem extends Item {
	public MotorItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
