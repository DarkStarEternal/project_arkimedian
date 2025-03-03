
package net.mcreator.arkimedian.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.arkimedian.procedures.GweninteractionDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class GweninteractionOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (GweninteractionDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("arkimedian:textures/screens/gwen_talking_hud.png"), w / 2 + -126, h / 2 + -121, 0, 0, 256, 48, 256, 48);

			event.getGuiGraphics().blit(new ResourceLocation("arkimedian:textures/screens/gwen_logo.png"), 196, 0, 0, 0, 32, 16, 32, 16);

			event.getGuiGraphics().blit(new ResourceLocation("arkimedian:textures/screens/skip_button.png"), w / 2 + -63, h / 2 + -76, 0, 0, 24, 8, 24, 8);

			event.getGuiGraphics().blit(new ResourceLocation("arkimedian:textures/screens/beastiary_button_plesae_edit.png"), w / 2 + -27, h / 2 + -76, 0, 0, 32, 8, 32, 8);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.arkimedian.gweninteraction.label_hello_im_gwen"), w / 2 + -100, h / 2 + -103, -6710887, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.arkimedian.gweninteraction.label_gwen_your"), w / 2 + -70, h / 2 + -92, -6710887, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
