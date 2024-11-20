import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1341209698"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2014080520"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1817161468"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1976196201"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lvr;",
		garbageValue = "-2062540728"
	)
	static SpritePixels method9235() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SecureRandomFuture.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = HttpResponse.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = WorldMapCacheName.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = SpriteBufferProperties.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = class140.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		HttpResponse.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		WorldMapCacheName.SpriteBuffer_spriteHeights = null;
		class140.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2044924347"
	)
	static int method9236(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--PrivateChatMode.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			PendingSpawn.method2635(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			PrivateChatMode.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class451.method8760(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
