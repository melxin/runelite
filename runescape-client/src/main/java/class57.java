import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class57 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("soundEffects")
	static final SoundEffect[] soundEffects;
	@ObfuscatedName("ag")
	static final int[] field787;
	@ObfuscatedName("an")
	@Export("soundEffectIds")
	static final int[] soundEffectIds;
	@ObfuscatedName("ae")
	@Export("soundLocations")
	static final int[] soundLocations;
	@ObfuscatedName("aj")
	@Export("queuedSoundEffectDelays")
	static final int[] queuedSoundEffectDelays;
	@ObfuscatedName("ak")
	@Export("queuedSoundEffectLoops")
	static final int[] queuedSoundEffectLoops;
	@ObfuscatedName("aw")
	static final int[] field792;
	@ObfuscatedName("ap")
	static final boolean[] field793;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1548103253
	)
	@Export("soundEffectCount")
	public static int soundEffectCount;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	static {
		soundEffects = new SoundEffect[50];
		field787 = new int[50];
		soundEffectIds = new int[50];
		soundLocations = new int[50];
		queuedSoundEffectDelays = new int[50];
		queuedSoundEffectLoops = new int[50];
		field792 = new int[50];
		field793 = new boolean[50];
		soundEffectCount = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1003323912"
	)
	static boolean method2089() {
		if ((Client.worldProperties & class594.field5991.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class30.method484(1);
			return true;
		} else if ((Client.worldProperties & class594.field5985.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class594.field5992.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class30.method484(1);
			return true;
		} else if ((Client.worldProperties & class594.field5992.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class30.method484(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-105"
	)
	static final int method2086(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "73"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (BuddyRankComparator.friendsChat != null) {
			PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-251374338"
	)
	static void method2090() {
		if (Client.oculusOrbState == 1) {
			Client.field444 = true;
		}

	}
}
