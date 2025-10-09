import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2029526719
	)
	int field3993;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	MusicPatchNode2 field4006;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1344104323
	)
	int field3991;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1550821951
	)
	int field4001;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1115379127
	)
	int field4002;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -867981355
	)
	int field3994;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1666135817
	)
	int field3995;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -677652669
	)
	int field3996;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 104187107
	)
	int field3997;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -656261120
	)
	int field3998;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 694832327
	)
	int field3999;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1757613601
	)
	int field4000;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 440045657
	)
	int field3990;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -587881975
	)
	int field4004;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1204150127
	)
	int field4003;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1379725479
	)
	int field3992;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1492756227
	)
	int field3987;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -861319443
	)
	int field4007;

	MusicPatchNode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "782003979"
	)
	void method7383() {
		this.table = null;
		this.rawSound = null;
		this.field4006 = null;
		this.stream = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "309125636"
	)
	static void method7382(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method7382(var0, var1, var2, var5 - 1);
			method7382(var0, var1, var5 + 1, var3);
		}

	}
}
