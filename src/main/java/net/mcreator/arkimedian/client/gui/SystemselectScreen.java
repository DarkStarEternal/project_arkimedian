package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.SystemselectMenu;
import net.mcreator.arkimedian.network.SystemselectButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SystemselectScreen extends AbstractContainerScreen<SystemselectMenu> {
	private final static HashMap<String, Object> guistate = SystemselectMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wrench;

	public SystemselectScreen(SystemselectMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/systemselect.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/texture_3.png"), this.leftPos + -100, this.topPos + -49, 0, 0, 192, 128, 192, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.arkimedian.systemselect.label_sun"), -91, -22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.arkimedian.systemselect.label_system"), -91, -13, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_wrench = new ImageButton(this.leftPos + -91, this.topPos + -40, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_wrench.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new SystemselectButtonMessage(0, x, y, z));
				SystemselectButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wrench", imagebutton_wrench);
		this.addRenderableWidget(imagebutton_wrench);
	}
}
