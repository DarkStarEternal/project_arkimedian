
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThrusterItem extends Item {
	public ThrusterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
