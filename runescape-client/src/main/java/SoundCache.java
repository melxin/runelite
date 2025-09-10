import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ps")
	static int[] field1377;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field1376;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	NodeHashTable field1375;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field1375 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field1376 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Ldv;",
		garbageValue = "-79"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method3122(var1, var2, false);
		class108 var6 = (class108)this.field1375.get(var4);
		if (var6 != null) {
			return var6.method3372();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field1375.put(new class108(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Lec;",
		garbageValue = "489673497"
	)
	class108 method3143(int var1, int var2) {
		long var3 = this.method3122(var1, var2, true);
		class108 var5 = (class108)this.field1375.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field1376, var1, var2);
			if (var6 == null) {
				return new class108();
			} else {
				class108 var7 = new class108(var6);
				this.field1375.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Ldv;",
		garbageValue = "50"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 1) {
			return this.getSoundEffect0(var1, 1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 0) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lec;",
		garbageValue = "1318867147"
	)
	public class108 method3120(int var1) {
		if (this.field1376.getGroupCount() == 1) {
			return this.method3143(0, var1);
		} else if (this.field1376.getGroupFileCount(var1) == 1) {
			return this.method3143(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ldv;",
		garbageValue = "1047739201"
	)
	public RawSound method3121(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "-55"
	)
	long method3122(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)Lxt;",
		garbageValue = "-1019010004"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class587.method11132(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = class606.SpriteBuffer_spriteWidth;
			var4.height = class581.SpriteBuffer_spriteHeight;
			var4.xOffset = LoginPacket.SpriteBuffer_xOffsets[0];
			var4.yOffset = class191.SpriteBuffer_yOffsets[0];
			var4.subWidth = class255.SpriteBuffer_spriteWidths[0];
			var4.subHeight = FriendLoginUpdate.field5390[0];
			int var5 = var4.subHeight * var4.subWidth;
			byte[] var6 = SpriteBufferProperties.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = TriBool.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class388.method8205();
			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-62"
	)
	static final void method3117(String var0) {
		PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)F",
		garbageValue = "2011880333"
	)
	static final float method3130(float var0, float var1, float var2, float var3) {
		return var0 * var2 - var3 * var1;
	}
}
