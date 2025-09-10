import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("Renderable")
public abstract class Renderable extends IndexedObjectNode {
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1493606971
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-1879635116"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lid;",
		garbageValue = "-102"
	)
	protected class224 vmethod5366() {
		return class224.field2627;
	}

	@ObfuscatedName("fr")
	void vmethod5531(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		Model var15 = this.getModel();
		if (var15 != null) {
			this.height = var15.height;
			var15.method5493(this.vmethod5366());
			var15.method5479(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
			var15.method5493(class224.field2627);
		}

	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ILrj;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.method5493(this.vmethod5366());
			var8.draw(var1, var2, var3, var4, var5, var6);
			var8.method5493(class224.field2627);
		}

	}
}
