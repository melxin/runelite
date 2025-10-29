import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Renderable")
public abstract class Renderable extends IndexedObjectNode {
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1272589951
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903085797"
	)
	protected int vmethod5827() {
		return 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "1389940305"
	)
	protected class248 vmethod5821() {
		return class248.field2783;
	}

	@ObfuscatedName("ge")
	void vmethod5939(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		if (Rasterizer3D.clips.field3150 != 1 || this.vmethod5839()) {
			Model var15 = this.getModel();
			if (var15 != null) {
				var5 -= this.vmethod5827();
				this.height = var15.height;
				var15.method6068(this.vmethod5821());
				var15.method5940(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
				var15.method6068(class248.field2783);
			}

		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(ILry;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (Rasterizer3D.clips.field3150 != 1 || this.vmethod5839()) {
			Model var8 = this.getModel();
			if (var8 != null) {
				var4 -= this.vmethod5827();
				this.height = var8.height;
				var8.method6068(this.vmethod5821());
				var8.draw(var1, var2, var3, var4, var5, var6);
				var8.method6068(class248.field2783);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcv;B)Lci;",
		garbageValue = "-69"
	)
	public static Player method5846(int var0, WorldViewManager var1) {
		Player var2 = null;
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			Player var5 = (Player)var4.players.get((long)var0);
			if (var5 != null) {
				if (var4.id != -1) {
					return var5;
				}

				var2 = var5;
			}
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-62"
	)
	public static int method5835(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;IIB)V",
		garbageValue = "60"
	)
	public static void method5847(String[] var0, Object[] var1, int var2, int var3) {
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
			method5847(var0, var1, var2, var5 - 1);
			method5847(var0, var1, var5 + 1, var3);
		}

	}
}
