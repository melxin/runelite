import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Renderable")
public abstract class Renderable extends IndexedObjectNode {
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	static Widget[] field2813;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1985311067
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("ed")
	void vmethod5557(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
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

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(ILrz;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.draw(var1, var2, var3, var4, var5, var6);
		}

	}
}
