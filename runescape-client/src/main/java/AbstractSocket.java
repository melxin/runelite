import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static Bounds field5447;

	AbstractSocket() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2030306076"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "397267938"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "2145484894"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1472304779"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "217506457"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-23187275"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxt;",
		garbageValue = "-45505440"
	)
	static SpritePixels[] method10192() {
		SpritePixels[] var0 = new SpritePixels[class606.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class606.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class606.SpriteBuffer_spriteWidth;
			var2.height = class581.SpriteBuffer_spriteHeight;
			var2.xOffset = LoginPacket.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class191.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class255.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = FriendLoginUpdate.field5390[var1];
			int var3 = var2.subWidth * var2.subHeight;
			byte[] var4 = SpriteBufferProperties.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				int var6 = var4[var5] & 255;
				var2.pixels[var5] = TriBool.SpriteBuffer_spritePalette[var6];
			}
		}

		class388.method8205();
		return var0;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "110"
	)
	static final String method10167(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1523710913"
	)
	static void method10165(int var0) {
		SequenceDefinition var1 = InvDefinition.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class146 var4 = SecureUrlRequester.method3516(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3754() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field601.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
