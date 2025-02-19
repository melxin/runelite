import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class246 {
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -830604617
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 867640615
	)
	final int field2799;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2093600087
	)
	int field2793;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 437245253
	)
	int field2794;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1034674873
	)
	int field2798;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -147340903
	)
	int field2796;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1590977931
	)
	int field2797;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -81534159
	)
	int field2801;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	class246 field2795;

	class246(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field2799 = var1;
		this.field2793 = var2;
		this.field2794 = var3;
		this.field2798 = var4;
		this.field2796 = var5;
		this.field2797 = var6;
		this.field2801 = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;II)Ljt;",
		garbageValue = "2050499910"
	)
	public static Frames method5176(AbstractArchive var0, AbstractArchive var1, int var2) {
		boolean var3 = true;
		int var4 = -1;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var3 = false;
			} else if (var4 == -1) {
				var4 = (var7[0] & 255) << 8 | var7[1] & 255;
			}
		}

		if (var4 != -1) {
			byte[] var8 = var1.getFile(var4, 0);
			if (var8 == null) {
				var3 = false;
			}
		} else {
			var3 = false;
		}

		if (!var3) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}
}
