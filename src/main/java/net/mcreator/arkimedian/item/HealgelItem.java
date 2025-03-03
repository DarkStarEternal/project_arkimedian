
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HealgelItem extends Item {
	public HealgelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
