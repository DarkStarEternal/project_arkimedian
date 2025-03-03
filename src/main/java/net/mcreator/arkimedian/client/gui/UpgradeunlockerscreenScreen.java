package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.UpgradeunlockerscreenMenu;
import net.mcreator.arkimedian.network.UpgradeunlockerscreenButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UpgradeunlockerscreenScreen extends AbstractContainerScreen<UpgradeunlockerscreenMenu> {
	private final static HashMap<String, Object> guistate = UpgradeunlockerscreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_space_helmet;
	ImageButton imagebutton_aluminum_ingot;

	public UpgradeunlockerscreenScreen(UpgradeunlockerscreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/upgradeunlockerscreen.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -10 && mouseX < leftPos + 14 && mouseY > topPos + -76 && mouseY < topPos + -52)
			guiGraphics.renderTooltip(font, Component.translatable("gui.arkimedian.upgradeunlockerscreen.tooltip_unlocks_spacesuit"), mouseX, mouseY);
		if (mouseX > leftPos + -10 && mouseX < leftPos + 14 && mouseY > topPos + -40 && mouseY < topPos + -16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.arkimedian.upgradeunlockerscreen.tooltip_aluminium_refinement"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/research_tree_button.png"), this.leftPos + -19, this.topPos + -85, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/research_tree_button.png"), this.leftPos + -19, this.topPos + -49, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/straight_unlock_path.png"), this.leftPos + -10, this.topPos + -58, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/unlockscreen.png"), this.leftPos + -190, this.topPos + -148, 0, 0, 384, 320, 384, 320);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + -172, this.topPos + 41, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + -136, this.topPos + 41, 0, 0, 20, 20, 20, 20);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.arkimedian.upgradeunlockerscreen.label_submit_items"), -172, 32, -16737793, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_space_helmet = new ImageButton(this.leftPos + -10, this.topPos + -76, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_space_helmet.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new UpgradeunlockerscreenButtonMessage(0, x, y, z));
				UpgradeunlockerscreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_space_helmet", imagebutton_space_helmet);
		this.addRenderableWidget(imagebutton_space_helmet);
		imagebutton_aluminum_ingot = new ImageButton(this.leftPos + -10, this.topPos + -40, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_aluminum_ingot.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_aluminum_ingot", imagebutton_aluminum_ingot);
		this.addRenderableWidget(imagebutton_aluminum_ingot);
	}
}
