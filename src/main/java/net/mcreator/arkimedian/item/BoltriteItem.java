
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BoltriteItem extends Item {
	public BoltriteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
