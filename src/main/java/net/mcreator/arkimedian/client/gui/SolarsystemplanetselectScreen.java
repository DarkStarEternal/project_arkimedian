package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.SolarsystemplanetselectMenu;
import net.mcreator.arkimedian.network.SolarsystemplanetselectButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SolarsystemplanetselectScreen extends AbstractContainerScreen<SolarsystemplanetselectMenu> {
	private final static HashMap<String, Object> guistate = SolarsystemplanetselectMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wrench;
	ImageButton imagebutton_wrench1;
	ImageButton imagebutton_socires_nolia;

	public SolarsystemplanetselectScreen(SolarsystemplanetselectMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/solarsystemplanetselect.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.arkimedian.solarsystemplanetselect.label_earth"), -91, -4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.arkimedian.solarsystemplanetselect.label_mars"), -46, -4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_wrench = new ImageButton(this.leftPos + -91, this.topPos + -40, 32, 32, 0, 0, 32, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_wrench.png"), 32, 64, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new SolarsystemplanetselectButtonMessage(0, x, y, z));
				SolarsystemplanetselectButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wrench", imagebutton_wrench);
		this.addRenderableWidget(imagebutton_wrench);
		imagebutton_wrench1 = new ImageButton(this.leftPos + -46, this.topPos + -40, 32, 32, 0, 0, 32, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_wrench1.png"), 32, 64, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new SolarsystemplanetselectButtonMessage(1, x, y, z));
				SolarsystemplanetselectButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wrench1", imagebutton_wrench1);
		this.addRenderableWidget(imagebutton_wrench1);
		imagebutton_socires_nolia = new ImageButton(this.leftPos + -91, this.topPos + 5, 32, 32, 0, 0, 32, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_socires_nolia.png"), 32, 64, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new SolarsystemplanetselectButtonMessage(2, x, y, z));
				SolarsystemplanetselectButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_socires_nolia", imagebutton_socires_nolia);
		this.addRenderableWidget(imagebutton_socires_nolia);
	}
}
