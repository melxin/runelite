import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class255 extends class270 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lha;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ik")
	static Iterator field3064;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1666046163
	)
	int field3067;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final class267 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkm;Ljava/lang/String;I)V"
	)
	class255(class267 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3067 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-11589271"
	)
	public int vmethod6058() {
		return 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2108382239"
	)
	public int vmethod6060() {
		return this.field3067;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "2"
	)
	static final int method5813(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "84"
	)
	public static int method5805(int var0, int var1) {
		return var0 + (int)(Math.random() * (double)(var1 - var0));
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIB)I",
		garbageValue = "-74"
	)
	static int method5812(WorldView var0, int var1, int var2, int var3, int var4) {
		if (var4 == 0) {
			return JagNetThread.method8434(var0, var1, var2, var3);
		} else {
			int var5 = var4 / 2;
			int var6 = var1 - var5;
			int var7 = var2 - var5;
			int var8 = var5 + var1;
			int var9 = var5 + var2;
			int var10 = var6 >> 7;
			int var11 = var10 + 1;
			int var12 = var7 >> 7;
			int var13 = var12 + 1;
			int var14 = var8 >> 7;
			int var15 = var14;
			int var16 = var9 >> 7;
			int var17 = var16;
			int var18 = Integer.MAX_VALUE;

			for (int var19 = var11; var19 <= var15; ++var19) {
				for (int var20 = var13; var20 <= var17; ++var20) {
					var18 = Math.min(var18, JagNetThread.method8434(var0, Coord.method7417(var19), Coord.method7417(var20), var3));
				}
			}

			var18 = Math.min(var18, JagNetThread.method8434(var0, var1, var2, var3));
			var18 = Math.min(var18, JagNetThread.method8434(var0, var1 - var5, var2 - var5, var3));
			var18 = Math.min(var18, JagNetThread.method8434(var0, var1 - var5, var5 + var2, var3));
			var18 = Math.min(var18, JagNetThread.method8434(var0, var5 + var1, var2 - var5, var3));
			var18 = Math.min(var18, JagNetThread.method8434(var0, var5 + var1, var5 + var2, var3));
			return var18;
		}
	}
}
