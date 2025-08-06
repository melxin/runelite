import java.awt.Component;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4263(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4261(1, 0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4270(2, 0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4280(3, 0),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4272(9, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4265(4, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4266(5, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4267(6, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4269(7, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4282(8, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4274(12, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4271(13, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4273(14, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4262(15, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4268(16, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4260(17, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4276(18, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4277(19, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4278(20, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4279(21, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4264(10, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4275(11, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4281(22, 3);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 803457887
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1914929106"
	)
	static void method8151(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "109"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			FriendSystem.clientPreferences.updateRoofsHidden(!FriendSystem.clientPreferences.isRoofsHidden());
			if (FriendSystem.clientPreferences.isRoofsHidden()) {
				AuthenticationScheme.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				AuthenticationScheme.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = HttpResponse.method313(var0.substring(5).trim()) == 1;
			Language.client.method542(var1);
			Rasterizer3D.method4968(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			FriendSystem.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var4;
		if (var0.startsWith("setdrawdistance")) {
			var4 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var4[1]);
				FriendSystem.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var8) {
				AuthenticationScheme.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var4[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var4 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var4[1]);
				class7.topLevelWorldView.scene.method5115(class215.method4775()[var2]);
			} catch (NumberFormatException var7) {
				AuthenticationScheme.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var4[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			AuthenticationScheme.addGameMessage(99, "", String.format("%d", FriendSystem.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				Skills.worldMap.showCoord = !Skills.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				FriendSystem.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				FriendSystem.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				AsyncRestClient.method161();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				class62.method2115();
			} else if (var0.equalsIgnoreCase("sfx8bit")) {
				FriendSystem.clientPreferences.method2522(true);
			} else if (var0.equalsIgnoreCase("sfx16bit")) {
				FriendSystem.clientPreferences.method2522(false);
			} else if (var0.startsWith("playsong ")) {
				String var9 = var0.substring("playsong ".length());

				try {
					if (FriendSystem.clientPreferences.getMusicVolume() == 0) {
						class267.method6028(0, 0);
					} else {
						var2 = FriendSystem.clientPreferences.getMusicVolume();
						class267.method6028(0, 0);
						ArrayList var3 = new ArrayList();
						var3.add(new MidiRequest(MoveSpeed.field3199, var9, "", var2, false));
						class30.method486(var3, 0, 0, 0, 100, false);
					}
				} catch (Exception var6) {
					AuthenticationScheme.addGameMessage(99, "", "Can't play the midi named " + var9);
				}
			} else if (var0.equalsIgnoreCase("stopsong")) {
				class267.method6028(0, 0);
			}
		}

		PacketBufferNode var10 = class291.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var10.packetBuffer.writeByte(var0.length() + 1);
		var10.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var10);
	}
}
