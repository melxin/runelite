import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("Renderable")
public abstract class Renderable extends IndexedObjectNode {
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1657100269
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "1493429071"
	)
	protected class223 vmethod5439() {
		return class223.field2627;
	}

	@ObfuscatedName("gw")
	void vmethod5554(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		if (Rasterizer3D.clips.field2999 != 1 || this.vmethod5447()) {
			Model var15 = this.getModel();
			if (var15 != null) {
				this.height = var15.height;
				var15.method5559(this.vmethod5439());
				var15.method5555(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
				var15.method5559(class223.field2627);
			}

		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(ILrz;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (Rasterizer3D.clips.field2999 != 1 || this.vmethod5447()) {
			Model var8 = this.getModel();
			if (var8 != null) {
				this.height = var8.height;
				var8.method5559(this.vmethod5439());
				var8.draw(var1, var2, var3, var4, var5, var6);
				var8.method5559(class223.field2627);
			}

		}
	}
}
