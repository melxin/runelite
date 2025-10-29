import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("av")
	@Export("state")
	byte state;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -840737413
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 270012189
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 966823731
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -634712805
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 993851531
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lxa;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-887756991"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	void method8778(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "417836213"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1367739041"
	)
	void method8780(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Lqr;IB)Lqr;",
		garbageValue = "1"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1235362860"
	)
	public static void method8796(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		class57.soundEffectIds[class57.soundEffectCount] = var0;
		class57.soundEffects[class57.soundEffectCount] = null;
		class57.soundLocations[class57.soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
		class57.field792[class57.soundEffectCount] = var1;
		class57.queuedSoundEffectLoops[class57.soundEffectCount] = var6;
		class57.queuedSoundEffectDelays[class57.soundEffectCount] = var7;
		class57.field787[class57.soundEffectCount] = var5;
		class57.field793[class57.soundEffectCount] = var8;
		++class57.soundEffectCount;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "3"
	)
	static final void method8779(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat((float)var21, (float)var22, (float)var23, (float)var17, (float)var18, (float)var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat((float)var21, (float)var23, (float)var24, (float)var17, (float)var19, (float)var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
