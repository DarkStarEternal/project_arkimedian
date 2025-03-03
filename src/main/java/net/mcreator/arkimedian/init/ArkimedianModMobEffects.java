
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.arkimedian.potion.RadiatedMobEffect;
import net.mcreator.arkimedian.ArkimedianMod;

public class ArkimedianModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ArkimedianMod.MODID);
	public static final RegistryObject<MobEffect> RADIATED = REGISTRY.register("radiated", () -> new RadiatedMobEffect());
}
