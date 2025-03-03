
package net.mcreator.arkimedian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class ChainswordItem extends AxeItem {
	public ChainswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1547;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 6.2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.3f, new Item.Properties());
	}
}
