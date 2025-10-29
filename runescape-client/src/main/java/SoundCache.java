import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	static File field1347;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field1346;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	NodeHashTable field1351;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field1351 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field1346 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldq;",
		garbageValue = "1746275493"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method3233(var1, var2, false);
		class107 var6 = (class107)this.field1351.get(var4);
		if (var6 != null) {
			return var6.method3484();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field1351.put(new class107(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Leq;",
		garbageValue = "115684603"
	)
	class107 method3253(int var1, int var2) {
		long var3 = this.method3233(var1, var2, true);
		class107 var5 = (class107)this.field1351.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field1346, var1, var2);
			if (var6 == null) {
				return new class107();
			} else {
				class107 var7 = new class107(var6);
				this.field1351.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Ldq;",
		garbageValue = "99"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Leq;",
		garbageValue = "988618379"
	)
	public class107 method3250(int var1) {
		if (this.field1346.getGroupCount() == 1) {
			return this.method3253(0, var1);
		} else if (this.field1346.getGroupFileCount(var1) == 1) {
			return this.method3253(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldq;",
		garbageValue = "15"
	)
	public RawSound method3232(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "32"
	)
	long method3233(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)[I",
		garbageValue = "113"
	)
	static int[] method3252(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class388.method8367(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class388.method8367(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class388.method8367(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class388.method8367(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfz;",
		garbageValue = "-4"
	)
	static class141 method3248(int var0) {
		class141 var1 = (class141)GrandExchangeOffer.findEnumerated(class395.method8408(), var0);
		if (var1 == null) {
			var1 = class141.field1702;
		}

		return var1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1941494184"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field331;
		} else if (var5 >= 100) {
			var6 = Client.field519;
		} else {
			var6 = (Client.field519 - Client.field331) * var5 / 100 + Client.field331;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field337) {
			var14 = Client.field337;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field332) {
				var6 = Client.field332;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field529) {
			var14 = Client.field529;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field335) {
				var6 = Client.field335;
				var8 = var14 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = GraphicsObject.method1936(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = class532.method10785(var11, var3);
				var13[var9] = var12 * var11 >> 16;
			}

			Occluder.topLevelWorldView.scene.method5711(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
