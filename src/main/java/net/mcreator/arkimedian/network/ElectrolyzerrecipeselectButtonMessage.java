
package net.mcreator.arkimedian.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.world.inventory.ElectrolyzerrecipeselectMenu;
import net.mcreator.arkimedian.procedures.OnoffswitchProcedure;
import net.mcreator.arkimedian.procedures.AluminiumscrapclickedProcedure;
import net.mcreator.arkimedian.procedures.AluminiumclickedProcedure;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElectrolyzerrecipeselectButtonMessage {
	private final int buttonID, x, y, z;

	public ElectrolyzerrecipeselectButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ElectrolyzerrecipeselectButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ElectrolyzerrecipeselectButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ElectrolyzerrecipeselectButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ElectrolyzerrecipeselectMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AluminiumscrapclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			AluminiumclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			OnoffswitchProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArkimedianMod.addNetworkMessage(ElectrolyzerrecipeselectButtonMessage.class, ElectrolyzerrecipeselectButtonMessage::buffer, ElectrolyzerrecipeselectButtonMessage::new, ElectrolyzerrecipeselectButtonMessage::handler);
	}
}
