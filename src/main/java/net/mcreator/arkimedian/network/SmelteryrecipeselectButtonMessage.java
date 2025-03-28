
package net.mcreator.arkimedian.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.world.inventory.SmelteryrecipeselectMenu;
import net.mcreator.arkimedian.procedures.OnoffswitchProcedure;
import net.mcreator.arkimedian.procedures.IronclickedProcedure;
import net.mcreator.arkimedian.procedures.GoldclickedProcedure;
import net.mcreator.arkimedian.procedures.CopperclickedProcedure;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SmelteryrecipeselectButtonMessage {
	private final int buttonID, x, y, z;

	public SmelteryrecipeselectButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SmelteryrecipeselectButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SmelteryrecipeselectButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SmelteryrecipeselectButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = SmelteryrecipeselectMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GoldclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			IronclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			OnoffswitchProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			CopperclickedProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArkimedianMod.addNetworkMessage(SmelteryrecipeselectButtonMessage.class, SmelteryrecipeselectButtonMessage::buffer, SmelteryrecipeselectButtonMessage::new, SmelteryrecipeselectButtonMessage::handler);
	}
}
