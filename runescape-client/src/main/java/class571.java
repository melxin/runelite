import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vu")
final class class571 implements class565 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-567180997"
	)
	public void vmethod11079(Object var1, Buffer var2) {
		this.method11077((String)var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "-30185"
	)
	public Object vmethod11078(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lwj;I)V",
		garbageValue = "31023504"
	)
	void method11077(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "232291519"
	)
	static void method11084() {
		Tiles.Tiles_minPlane = 99;
		AABB.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		class28.Tiles_shapes = new byte[4][104][104];
		ChatChannel.field806 = new byte[4][104][104];
		class81.field1179 = new int[4][105][105];
		Script.Tiles_underlays2 = new byte[4][105][105];
		Timer.field4752 = new int[105][105];
		SecureRandomFuture.Tiles_hue = new int[104];
		WorldMapSection0.Tiles_saturation = new int[104];
		WorldMapArea.Tiles_lightness = new int[104];
		DbTable.Tiles_hueMultiplier = new int[104];
		DelayFadeTask.field5175 = new int[104];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;IIB)V",
		garbageValue = "97"
	)
	public static void method11083(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method11083(var0, var1, var2, var5 - 1);
			method11083(var0, var1, var5 + 1, var3);
		}

	}
}
