import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ah")
	String field1004;
	@ObfuscatedName("az")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ao")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ad")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1831460751
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -970822451
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 386041121
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -914529041
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lue;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[Lue;",
		garbageValue = "-1004050298"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "310846203"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1522771239"
	)
	static Date method2490() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1144422908"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class544.clientPreferences.updateRoofsHidden(!class544.clientPreferences.isRoofsHidden());
			if (class544.clientPreferences.isRoofsHidden()) {
				Interpreter.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				Interpreter.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class278.method5972(var0.substring(5).trim()) == 1;
			Client.client.method541(var1);
			Rasterizer3D.method4017(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class544.clientPreferences.toggleDisplayFps();
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
				class544.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				Interpreter.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				GameEngine.topLevelWorldView.scene.method4212(class175.method3888()[var2]);
			} catch (NumberFormatException var5) {
				Interpreter.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			Interpreter.addGameMessage(99, "", String.format("%d", class544.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class420.worldMap.showCoord = !class420.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class544.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class544.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				MenuAction.method2363();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				ModelData0.method4808();
			}
		}

		PacketBufferNode var7 = ScriptEvent.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
