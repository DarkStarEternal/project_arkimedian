
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arkimedian.ArkimedianMod;

public class ArkimedianModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ArkimedianMod.MODID);
	public static final RegistryObject<SoundEvent> SYNRIA_BREATHES = REGISTRY.register("synria_breathes", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("arkimedian", "synria_breathes")));
	public static final RegistryObject<SoundEvent> SYNRIA_DEATH = REGISTRY.register("synria_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("arkimedian", "synria_death")));
	public static final RegistryObject<SoundEvent> ETHENRIA_AMBIENT = REGISTRY.register("ethenria_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("arkimedian", "ethenria_ambient")));
}
