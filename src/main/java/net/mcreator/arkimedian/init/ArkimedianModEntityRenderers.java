
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.arkimedian.client.renderer.XentaniveRenderer;
import net.mcreator.arkimedian.client.renderer.SynriaRenderer;
import net.mcreator.arkimedian.client.renderer.SicarionfighterRenderer;
import net.mcreator.arkimedian.client.renderer.MME4421Renderer;
import net.mcreator.arkimedian.client.renderer.GvralRenderer;
import net.mcreator.arkimedian.client.renderer.GrelhoundRenderer;
import net.mcreator.arkimedian.client.renderer.GnirilionRenderer;
import net.mcreator.arkimedian.client.renderer.ErnetmonstrocityRenderer;
import net.mcreator.arkimedian.client.renderer.DocreanitileRenderer;
import net.mcreator.arkimedian.client.renderer.CutieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArkimedianModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ArkimedianModEntities.MME_4421.get(), MME4421Renderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.SYNRIA.get(), SynriaRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.CUTIE.get(), CutieRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.ERNETMONSTROCITY.get(), ErnetmonstrocityRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.XENTANIVE.get(), XentaniveRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.GRELHOUND.get(), GrelhoundRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.DOCREANITILE.get(), DocreanitileRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.GVRAL.get(), GvralRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.SICARIONFIGHTER.get(), SicarionfighterRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.GNIRILION.get(), GnirilionRenderer::new);
		event.registerEntityRenderer(ArkimedianModEntities.BOLT.get(), ThrownItemRenderer::new);
	}
}
