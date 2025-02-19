import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("TileItem")
public abstract class TileItem extends Renderable {
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1006610245
	)
	@Export("height")
	public int height;

	protected TileItem() {
		this.height = 1000;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("fu")
	void vmethod5284(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		Model var15 = this.getModel();
		if (var15 != null) {
			this.height = var15.height;
			int var16 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var17 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var18 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var19 = Rasterizer3D.Rasterizer3D_cosine[var3];
			var15.draw(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ILro;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.draw(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)I",
		garbageValue = "-18"
	)
	public static final int method5177(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5450) {
			case 1:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1367207519"
	)
	public static void method5187() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < BuddyRankComparator.field1546; ++var0) {
				class379.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
