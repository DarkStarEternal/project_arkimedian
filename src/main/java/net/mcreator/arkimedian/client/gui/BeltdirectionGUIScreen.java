package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.BeltdirectionGUIMenu;
import net.mcreator.arkimedian.network.BeltdirectionGUIButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BeltdirectionGUIScreen extends AbstractContainerScreen<BeltdirectionGUIMenu> {
	private final static HashMap<String, Object> guistate = BeltdirectionGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_belt;
	ImageButton imagebutton_belt1;
	ImageButton imagebutton_belt2;

	public BeltdirectionGUIScreen(BeltdirectionGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/beltdirection_gui.png");

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

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/gwen_talking_hud.png"), this.leftPos + -127, this.topPos + -22, 0, 0, 256, 48, 256, 48);

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
	}

	@Override
	public void init() {
		super.init();
		imagebutton_belt = new ImageButton(this.leftPos + -19, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_belt.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new BeltdirectionGUIButtonMessage(0, x, y, z));
				BeltdirectionGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_belt", imagebutton_belt);
		this.addRenderableWidget(imagebutton_belt);
		imagebutton_belt1 = new ImageButton(this.leftPos + -37, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_belt1.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new BeltdirectionGUIButtonMessage(1, x, y, z));
				BeltdirectionGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_belt1", imagebutton_belt1);
		this.addRenderableWidget(imagebutton_belt1);
		imagebutton_belt2 = new ImageButton(this.leftPos + -1, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_belt2.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new BeltdirectionGUIButtonMessage(2, x, y, z));
				BeltdirectionGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_belt2", imagebutton_belt2);
		this.addRenderableWidget(imagebutton_belt2);
	}
}
