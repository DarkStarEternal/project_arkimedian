
package net.mcreator.arkimedian.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.world.inventory.RefineryrecipeselectMenu;
import net.mcreator.arkimedian.procedures.RefinedoilclickedProcedure;
import net.mcreator.arkimedian.procedures.PlasticclickedProcedure;
import net.mcreator.arkimedian.procedures.OnoffswitchProcedure;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RefineryrecipeselectButtonMessage {
	private final int buttonID, x, y, z;

	public RefineryrecipeselectButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RefineryrecipeselectButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RefineryrecipeselectButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RefineryrecipeselectButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RefineryrecipeselectMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OnoffswitchProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			RefinedoilclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			PlasticclickedProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArkimedianMod.addNetworkMessage(RefineryrecipeselectButtonMessage.class, RefineryrecipeselectButtonMessage::buffer, RefineryrecipeselectButtonMessage::new, RefineryrecipeselectButtonMessage::handler);
	}
}
