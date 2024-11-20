import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;B)I",
		garbageValue = "-43"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltl;",
		garbageValue = "-725944516"
	)
	static class495[] method3226() {
		return new class495[]{class495.field5117, class495.field5119, class495.field5118, class495.field5121};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "37"
	)
	public static float method3225(int var0) {
		var0 &= 16383;
		return (float)(3.834951969714103E-4D * (double)((float)var0));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IB)V",
		garbageValue = "22"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3941 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4014 == null) {
				var0.field4014 = new int[var0.field3941.length];
			}

			var0.field4014[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			SecureUrlRequester.clientPreferences.updateRoofsHidden(!SecureUrlRequester.clientPreferences.isRoofsHidden());
			if (SecureUrlRequester.clientPreferences.isRoofsHidden()) {
				class289.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class289.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = SecureUrlRequester.method3179(var0.substring(5).trim()) == 1;
			NpcOverrides.client.method481(var1);
			Rasterizer3D.method4701(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			SecureUrlRequester.clientPreferences.toggleDisplayFps();
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
				SecureUrlRequester.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				class289.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				HttpRequest.topLevelWorldView.scene.method5076(class232.method4580()[var2]);
			} catch (NumberFormatException var5) {
				class289.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			class289.addGameMessage(99, "", String.format("%d", SecureUrlRequester.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class158.worldMap.showCoord = !class158.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				SecureUrlRequester.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				SecureUrlRequester.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				PcmPlayer.method773();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				WorldMapLabelSize.method5797();
			}
		}

		PacketBufferNode var7 = Message.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
