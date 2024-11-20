import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class228 {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static AbstractSocket field2462;
	@ObfuscatedName("ae")
	public String field2455;
	@ObfuscatedName("ao")
	public float[] field2461;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1902551417
	)
	public int field2452;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 735689519
	)
	public int field2457;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1082783441
	)
	public int field2458;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lid;)V"
	)
	class228(class227 var1) {
		this.this$0 = var1;
		this.field2461 = new float[4];
		this.field2452 = 1;
		this.field2457 = 1;
		this.field2458 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-1805257804"
	)
	public static byte[] method4528(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-43"
	)
	static int method4526(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIII)V",
		garbageValue = "2021071577"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = class77.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= class403.cameraX;
			var6 -= class166.cameraY;
			var2 -= class328.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[SoundSystem.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[SoundSystem.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[ReflectionCheck.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[ReflectionCheck.cameraYaw];
			int var11 = var10 * var1 + var9 * var2 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var7 * var6 + var8 * var2 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
