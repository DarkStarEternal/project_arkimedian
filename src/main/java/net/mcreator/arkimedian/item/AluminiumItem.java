
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AluminiumItem extends Item {
	public AluminiumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
