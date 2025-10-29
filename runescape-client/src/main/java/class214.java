import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
class class214 implements ThreadFactory {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	final SequenceDefinition this$0;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	class214(SequenceDefinition var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "-1486769056"
	)
	static SpritePixels method4712() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class208.SpriteBuffer_spriteWidth;
		var0.height = class144.SpriteBuffer_spriteHeight;
		var0.xOffset = class615.SpriteBuffer_xOffsets[0];
		var0.yOffset = class615.SpriteBuffer_yOffsets[0];
		var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class615.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subWidth * var0.subHeight;
		byte[] var2 = class320.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = BufferedSource.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class615.SpriteBuffer_xOffsets = null;
		class615.SpriteBuffer_yOffsets = null;
		IntHashTable.SpriteBuffer_spriteWidths = null;
		class615.SpriteBuffer_spriteHeights = null;
		BufferedSource.SpriteBuffer_spritePalette = null;
		class320.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1927981662"
	)
	static final void method4711(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4196()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + AccessFile.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
