import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public class class475 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	public static final class475 field5077;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final class475 field5078;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2081169623
	)
	final int field5080;

	static {
		field5077 = new class475(1);
		field5078 = new class475(0);
	}

	class475(int var1) {
		this.field5080 = var1;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "216466272"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			AbstractWorldMapIcon.clientPreferences.updateRoofsHidden(!AbstractWorldMapIcon.clientPreferences.isRoofsHidden());
			if (AbstractWorldMapIcon.clientPreferences.isRoofsHidden()) {
				LoginPacket.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				LoginPacket.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = Tiles.method2370(var0.substring(5).trim()) == 1;
			class569.client.method472(var1);
			Rasterizer3D.method4743(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			AbstractWorldMapIcon.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var3;
		if (var0.startsWith("setdrawdistance")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				AbstractWorldMapIcon.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				LoginPacket.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				class200.topLevelWorldView.scene.method4982(class232.method4635()[var2]);
			} catch (NumberFormatException var5) {
				LoginPacket.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			LoginPacket.addGameMessage(99, "", String.format("%d", AbstractWorldMapIcon.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class541.worldMap.showCoord = !class541.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				AbstractWorldMapIcon.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				AbstractWorldMapIcon.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class31.method413();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				ArchiveLoader.method2416();
			}
		}

		PacketBufferNode var7 = class272.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
