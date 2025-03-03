package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.Constructioncorerecipeselect2Menu;
import net.mcreator.arkimedian.network.Constructioncorerecipeselect2ButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Constructioncorerecipeselect2Screen extends AbstractContainerScreen<Constructioncorerecipeselect2Menu> {
	private final static HashMap<String, Object> guistate = Constructioncorerecipeselect2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_on_off_switch;
	ImageButton imagebutton_arrow_next;
	ImageButton imagebutton_arrowprevious;
	ImageButton imagebutton_temperating_cloth;

	public Constructioncorerecipeselect2Screen(Constructioncorerecipeselect2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/constructioncorerecipeselect_2.png");

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

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/texture_3.png"), this.leftPos + -100, this.topPos + -67, 0, 0, 192, 128, 192, 128);

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
		imagebutton_on_off_switch = new ImageButton(this.leftPos + 71, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_on_off_switch.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Constructioncorerecipeselect2ButtonMessage(0, x, y, z));
				Constructioncorerecipeselect2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_on_off_switch", imagebutton_on_off_switch);
		this.addRenderableWidget(imagebutton_on_off_switch);
		imagebutton_arrow_next = new ImageButton(this.leftPos + -19, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_arrow_next.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Constructioncorerecipeselect2ButtonMessage(1, x, y, z));
				Constructioncorerecipeselect2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_next", imagebutton_arrow_next);
		this.addRenderableWidget(imagebutton_arrow_next);
		imagebutton_arrowprevious = new ImageButton(this.leftPos + -97, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_arrowprevious.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Constructioncorerecipeselect2ButtonMessage(2, x, y, z));
				Constructioncorerecipeselect2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrowprevious", imagebutton_arrowprevious);
		this.addRenderableWidget(imagebutton_arrowprevious);
		imagebutton_temperating_cloth = new ImageButton(this.leftPos + -91, this.topPos + -58, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_temperating_cloth.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Constructioncorerecipeselect2ButtonMessage(3, x, y, z));
				Constructioncorerecipeselect2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_temperating_cloth", imagebutton_temperating_cloth);
		this.addRenderableWidget(imagebutton_temperating_cloth);
	}
}
