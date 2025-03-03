package net.mcreator.arkimedian.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class NaplaBoneMealSuccessConditionProcedure {
	public static boolean execute() {
		if (Math.round(Mth.nextInt(RandomSource.create(), 1, 10)) > 6) {
			return true;
		}
		return false;
	}
}
