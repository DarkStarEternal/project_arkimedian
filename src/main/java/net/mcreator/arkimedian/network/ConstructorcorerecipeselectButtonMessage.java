
package net.mcreator.arkimedian.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.world.inventory.ConstructorcorerecipeselectMenu;
import net.mcreator.arkimedian.procedures.StatorclickedProcedure;
import net.mcreator.arkimedian.procedures.RotorclickedProcedure;
import net.mcreator.arkimedian.procedures.OnoffswitchProcedure;
import net.mcreator.arkimedian.procedures.ManufactureditemclickedProcedure;
import net.mcreator.arkimedian.procedures.HeavyplateclickedProcedure;
import net.mcreator.arkimedian.procedures.GoldspoolclickedProcedure;
import net.mcreator.arkimedian.procedures.EngineclickedProcedure;
import net.mcreator.arkimedian.procedures.EmptyironspoolclickedProcedure;
import net.mcreator.arkimedian.procedures.CopperspoolclickedProcedure;
import net.mcreator.arkimedian.procedures.ComputerclickedProcedure;
import net.mcreator.arkimedian.procedures.ComplexcircuitclickedProcedure;
import net.mcreator.arkimedian.procedures.CanisterclickedProcedure;
import net.mcreator.arkimedian.procedures.CableclickedProcedure;
import net.mcreator.arkimedian.procedures.ArrownextclickedProcedure;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConstructorcorerecipeselectButtonMessage {
	private final int buttonID, x, y, z;

	public ConstructorcorerecipeselectButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ConstructorcorerecipeselectButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ConstructorcorerecipeselectButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ConstructorcorerecipeselectButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ConstructorcorerecipeselectMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ManufactureditemclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			EngineclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			OnoffswitchProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			StatorclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			RotorclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			CableclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			CanisterclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			HeavyplateclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			CopperspoolclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 9) {

			EmptyironspoolclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			GoldspoolclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			ComplexcircuitclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			ComputerclickedProcedure.execute(world, x, y, z);
		}
		if (buttonID == 13) {

			ArrownextclickedProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArkimedianMod.addNetworkMessage(ConstructorcorerecipeselectButtonMessage.class, ConstructorcorerecipeselectButtonMessage::buffer, ConstructorcorerecipeselectButtonMessage::new, ConstructorcorerecipeselectButtonMessage::handler);
	}
}
