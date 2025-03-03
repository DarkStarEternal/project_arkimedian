
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AirductfabricItem extends Item {
	public AirductfabricItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
