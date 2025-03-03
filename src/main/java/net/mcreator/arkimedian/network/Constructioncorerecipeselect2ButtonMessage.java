
package net.mcreator.arkimedian.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.world.inventory.Constructioncorerecipeselect2Menu;
import net.mcreator.arkimedian.procedures.OnoffswitchProcedure;
import net.mcreator.arkimedian.procedures.FabricclickedProcedure;
import net.mcreator.arkimedian.procedures.ArrowpreviousclickedProcedure;
import net.mcreator.arkimedian.procedures.ArrownextclickedProcedure;
import net.mcreator.arkimedian.ArkimedianMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Constructioncorerecipeselect2ButtonMessage {
	private final int buttonID, x, y, z;

	public Constructioncorerecipeselect2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Constructioncorerecipeselect2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Constructioncorerecipeselect2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Constructioncorerecipeselect2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Constructioncorerecipeselect2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OnoffswitchProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			ArrownextclickedProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			ArrowpreviousclickedProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			FabricclickedProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArkimedianMod.addNetworkMessage(Constructioncorerecipeselect2ButtonMessage.class, Constructioncorerecipeselect2ButtonMessage::buffer, Constructioncorerecipeselect2ButtonMessage::new, Constructioncorerecipeselect2ButtonMessage::handler);
	}
}
