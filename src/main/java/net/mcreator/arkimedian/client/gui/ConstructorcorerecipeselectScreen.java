package net.mcreator.arkimedian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arkimedian.world.inventory.ConstructorcorerecipeselectMenu;
import net.mcreator.arkimedian.procedures.StatorseconditemProcedure;
import net.mcreator.arkimedian.procedures.RotorfirstitemrequiredProcedure;
import net.mcreator.arkimedian.procedures.RecipedeclarethirditemcountProcedure;
import net.mcreator.arkimedian.procedures.RecipedeclareseconditemcountProcedure;
import net.mcreator.arkimedian.procedures.RecipedeclarefourthitemcountProcedure;
import net.mcreator.arkimedian.procedures.RecipedeclarefirstitemcountProcedure;
import net.mcreator.arkimedian.procedures.RawcopperseconditemProcedure;
import net.mcreator.arkimedian.procedures.PlasticthirditemrequiredProcedure;
import net.mcreator.arkimedian.procedures.IronfirstrequireditemProcedure;
import net.mcreator.arkimedian.procedures.HeavyplateseconditemrequiredProcedure;
import net.mcreator.arkimedian.procedures.HeavyplatefirstitemProcedure;
import net.mcreator.arkimedian.procedures.GoldfirstitemProcedure;
import net.mcreator.arkimedian.procedures.EmptyspoolsecondrequiredProcedure;
import net.mcreator.arkimedian.procedures.CopperspoolfirstitemrequiredProcedure;
import net.mcreator.arkimedian.procedures.CopperfirstrequireditemProcedure;
import net.mcreator.arkimedian.procedures.ComplexcircuitfirstdeclareProcedure;
import net.mcreator.arkimedian.procedures.CircuitfirstitemrequiredProcedure;
import net.mcreator.arkimedian.procedures.CablethirditemrequiredProcedure;
import net.mcreator.arkimedian.procedures.CableseconditemrequiredProcedure;
import net.mcreator.arkimedian.network.ConstructorcorerecipeselectButtonMessage;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ConstructorcorerecipeselectScreen extends AbstractContainerScreen<ConstructorcorerecipeselectMenu> {
	private final static HashMap<String, Object> guistate = ConstructorcorerecipeselectMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_manufactured_item;
	ImageButton imagebutton_engine;
	ImageButton imagebutton_on_off_switch;
	ImageButton imagebutton_stator;
	ImageButton imagebutton_rotor;
	ImageButton imagebutton_cable;
	ImageButton imagebutton_gas_canister;
	ImageButton imagebutton_heavy_plate;
	ImageButton imagebutton_iron_spool_copper;
	ImageButton imagebutton_iron_spool_empty;
	ImageButton imagebutton_iron_spool_gold;
	ImageButton imagebutton_complex_circuit;
	ImageButton imagebutton_wrench;
	ImageButton imagebutton_arrow_next;

	public ConstructorcorerecipeselectScreen(ConstructorcorerecipeselectMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("arkimedian:textures/screens/constructorcorerecipeselect.png");

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

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + 8, this.topPos + -22, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + 62, this.topPos + -22, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + 35, this.topPos + -22, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/item_required_back.png"), this.leftPos + 8, this.topPos + 14, 0, 0, 20, 20, 20, 20);

		if (CopperfirstrequireditemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/copper_ingot.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (IronfirstrequireditemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/iron_ingot.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (EmptyspoolsecondrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/iron_spool_empty.png"), this.leftPos + 37, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (HeavyplateseconditemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/heavy_plate_update.png"), this.leftPos + 37, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (CircuitfirstitemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/circuit_update.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (CablethirditemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/cable.png"), this.leftPos + 64, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (CableseconditemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/cable.png"), this.leftPos + 37, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (PlasticthirditemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/plastic.png"), this.leftPos + 64, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (CopperspoolfirstitemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/iron_spool_copper.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (RotorfirstitemrequiredProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/rotor_update.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (StatorseconditemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/stator_update.png"), this.leftPos + 37, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (ComplexcircuitfirstdeclareProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/complex_circuit.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (GoldfirstitemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/gold_ingot.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (HeavyplatefirstitemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/heavy_plate_update.png"), this.leftPos + 10, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
		if (RawcopperseconditemProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("arkimedian:textures/screens/raw_copper.png"), this.leftPos + 37, this.topPos + -20, 0, 0, 16, 16, 16, 16);
		}
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
		guiGraphics.drawString(this.font,

				RecipedeclarefirstitemcountProcedure.execute(world, entity), 8, -4, -6710887, false);
		guiGraphics.drawString(this.font,

				RecipedeclareseconditemcountProcedure.execute(world, entity), 35, -4, -6710887, false);
		guiGraphics.drawString(this.font,

				RecipedeclarethirditemcountProcedure.execute(world, entity), 62, -4, -6710887, false);
		guiGraphics.drawString(this.font,

				RecipedeclarefourthitemcountProcedure.execute(world, entity), 8, 32, -6710887, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_manufactured_item = new ImageButton(this.leftPos + -82, this.topPos + -58, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_manufactured_item.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(0, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_manufactured_item", imagebutton_manufactured_item);
		this.addRenderableWidget(imagebutton_manufactured_item);
		imagebutton_engine = new ImageButton(this.leftPos + -82, this.topPos + -31, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_engine.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(1, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_engine", imagebutton_engine);
		this.addRenderableWidget(imagebutton_engine);
		imagebutton_on_off_switch = new ImageButton(this.leftPos + 71, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_on_off_switch.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(2, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_on_off_switch", imagebutton_on_off_switch);
		this.addRenderableWidget(imagebutton_on_off_switch);
		imagebutton_stator = new ImageButton(this.leftPos + -82, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_stator.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(3, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stator", imagebutton_stator);
		this.addRenderableWidget(imagebutton_stator);
		imagebutton_rotor = new ImageButton(this.leftPos + -82, this.topPos + 23, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_rotor.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(4, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rotor", imagebutton_rotor);
		this.addRenderableWidget(imagebutton_rotor);
		imagebutton_cable = new ImageButton(this.leftPos + -55, this.topPos + -31, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_cable.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(5, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_cable", imagebutton_cable);
		this.addRenderableWidget(imagebutton_cable);
		imagebutton_gas_canister = new ImageButton(this.leftPos + -55, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_gas_canister.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(6, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gas_canister", imagebutton_gas_canister);
		this.addRenderableWidget(imagebutton_gas_canister);
		imagebutton_heavy_plate = new ImageButton(this.leftPos + -55, this.topPos + 23, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_heavy_plate.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(7, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heavy_plate", imagebutton_heavy_plate);
		this.addRenderableWidget(imagebutton_heavy_plate);
		imagebutton_iron_spool_copper = new ImageButton(this.leftPos + -55, this.topPos + -58, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_iron_spool_copper.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(8, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iron_spool_copper", imagebutton_iron_spool_copper);
		this.addRenderableWidget(imagebutton_iron_spool_copper);
		imagebutton_iron_spool_empty = new ImageButton(this.leftPos + -28, this.topPos + -58, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_iron_spool_empty.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(9, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iron_spool_empty", imagebutton_iron_spool_empty);
		this.addRenderableWidget(imagebutton_iron_spool_empty);
		imagebutton_iron_spool_gold = new ImageButton(this.leftPos + -28, this.topPos + -31, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_iron_spool_gold.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(10, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iron_spool_gold", imagebutton_iron_spool_gold);
		this.addRenderableWidget(imagebutton_iron_spool_gold);
		imagebutton_complex_circuit = new ImageButton(this.leftPos + -28, this.topPos + -4, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_complex_circuit.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(11, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_complex_circuit", imagebutton_complex_circuit);
		this.addRenderableWidget(imagebutton_complex_circuit);
		imagebutton_wrench = new ImageButton(this.leftPos + -28, this.topPos + 23, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_wrench.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(12, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wrench", imagebutton_wrench);
		this.addRenderableWidget(imagebutton_wrench);
		imagebutton_arrow_next = new ImageButton(this.leftPos + -19, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("arkimedian:textures/screens/atlas/imagebutton_arrow_next.png"), 16, 32, e -> {
			if (true) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new ConstructorcorerecipeselectButtonMessage(13, x, y, z));
				ConstructorcorerecipeselectButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_next", imagebutton_arrow_next);
		this.addRenderableWidget(imagebutton_arrow_next);
	}
}
