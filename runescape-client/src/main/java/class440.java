import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class440 {
	@ObfuscatedName("al")
	static char[] field5024;
	@ObfuscatedName("ab")
	static char[] field5025;
	@ObfuscatedName("ac")
	static char[] field5026;
	@ObfuscatedName("av")
	static int[] field5027;
	@ObfuscatedName("au")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;

	static {
		field5024 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field5024[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5024[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5024[var0] = (char)(var0 + 48 - 52);
		}

		field5024[62] = '+';
		field5024[63] = '/';
		field5025 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5025[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5025[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5025[var0] = (char)(var0 + 48 - 52);
		}

		field5025[62] = '*';
		field5025[63] = '-';
		field5026 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5026[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5026[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5026[var0] = (char)(var0 + 48 - 52);
		}

		field5026[62] = '-';
		field5026[63] = '_';
		field5027 = new int[128];

		for (var0 = 0; var0 < field5027.length; ++var0) {
			field5027[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field5027[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field5027[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field5027[var0] = var0 - 48 + 52;
		}

		int[] var2 = field5027;
		field5027[43] = 62;
		var2[42] = 62;
		int[] var1 = field5027;
		field5027[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-651586173"
	)
	public static void method8908(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class566.ByteArrayPool_alternativeSizes = var0;
			FriendSystem.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			WorldMapData_1.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class566.ByteArrayPool_alternativeSizes.length; ++var2) {
				WorldMapData_1.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field5220.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field5220);
		} else {
			class566.ByteArrayPool_alternativeSizes = null;
			FriendSystem.ByteArrayPool_altSizeArrayCounts = null;
			WorldMapData_1.ByteArrayPool_arrays = null;
			MouseRecorder.method2130();
		}
	}
}
