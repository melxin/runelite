import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("av")
	static final int[] field2273;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static JagNetThread field2279;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1051846737
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1628144867
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1525413401
	)
	@Export("endBit")
	public int endBit;

	static {
		field2273 = new int[32];
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2273[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "64"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;IB)V",
		garbageValue = "101"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "16711680"
	)
	public static long method4681(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1953320624"
	)
	public static void method4678(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "110"
	)
	public static int method4673(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-62"
	)
	static void method4668(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
