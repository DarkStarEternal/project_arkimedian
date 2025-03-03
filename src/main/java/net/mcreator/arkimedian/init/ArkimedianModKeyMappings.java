
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.arkimedian.network.OpensystemselectkMessage;
import net.mcreator.arkimedian.network.OpenGweninteractionsMessage;
import net.mcreator.arkimedian.network.InitiatestartsequenceMessage;
import net.mcreator.arkimedian.network.Gwenoption3Message;
import net.mcreator.arkimedian.network.Gwenoption2Message;
import net.mcreator.arkimedian.network.Gwenoption1Message;
import net.mcreator.arkimedian.ArkimedianMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ArkimedianModKeyMappings {
	public static final KeyMapping INITIATESTARTSEQUENCE = new KeyMapping("key.arkimedian.initiatestartsequence", GLFW.GLFW_KEY_UP, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new InitiatestartsequenceMessage(0, 0));
				InitiatestartsequenceMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPENSYSTEMSELECTK = new KeyMapping("key.arkimedian.opensystemselectk", GLFW.GLFW_KEY_P, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new OpensystemselectkMessage(0, 0));
				OpensystemselectkMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_GWENINTERACTIONS = new KeyMapping("key.arkimedian.open_gweninteractions", GLFW.GLFW_KEY_G, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new OpenGweninteractionsMessage(0, 0));
				OpenGweninteractionsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GWENOPTION_1 = new KeyMapping("key.arkimedian.gwenoption_1", GLFW.GLFW_KEY_KP_1, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Gwenoption1Message(0, 0));
				Gwenoption1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GWENOPTION_2 = new KeyMapping("key.arkimedian.gwenoption_2", GLFW.GLFW_KEY_KP_2, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Gwenoption2Message(0, 0));
				Gwenoption2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GWENOPTION_3 = new KeyMapping("key.arkimedian.gwenoption_3", GLFW.GLFW_KEY_KP_3, "key.categories.arkimedian") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ArkimedianMod.PACKET_HANDLER.sendToServer(new Gwenoption3Message(0, 0));
				Gwenoption3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(INITIATESTARTSEQUENCE);
		event.register(OPENSYSTEMSELECTK);
		event.register(OPEN_GWENINTERACTIONS);
		event.register(GWENOPTION_1);
		event.register(GWENOPTION_2);
		event.register(GWENOPTION_3);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				INITIATESTARTSEQUENCE.consumeClick();
				OPENSYSTEMSELECTK.consumeClick();
				OPEN_GWENINTERACTIONS.consumeClick();
				GWENOPTION_1.consumeClick();
				GWENOPTION_2.consumeClick();
				GWENOPTION_3.consumeClick();
			}
		}
	}
}
