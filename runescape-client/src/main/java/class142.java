import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class142 implements class132 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbp;Lbp;IZI)I",
		garbageValue = "-225972985"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1493() ? (var1.method1493() ? 0 : 1) : (var1.method1493() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1477() ? (var1.method1477() ? 0 : 1) : (var1.method1477() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2127927157"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			MusicPatchNode2.runComponentCloseListeners(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1875883492"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (DevicePcmPlayerProvider.friendsChat != null) {
			PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
