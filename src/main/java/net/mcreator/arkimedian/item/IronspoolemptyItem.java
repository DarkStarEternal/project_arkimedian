
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronspoolemptyItem extends Item {
	public IronspoolemptyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
