import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class378 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Ljava/lang/String;Ljava/lang/String;B)[Lvf;",
		garbageValue = "85"
	)
	public static SpritePixels[] method7637(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return AbstractSocket.method9404(var0, var3, var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "175783721"
	)
	static final void method7636(String var0) {
		PacketBufferNode var1 = ScriptEvent.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-334790907"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class544.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field753[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
