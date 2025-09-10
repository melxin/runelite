import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
public class class516 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final class516 field5483;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	public static final class516 field5485;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final class516 field5475;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final class516 field5476;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1045374039
	)
	final int field5479;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2029866325
	)
	final int field5480;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 193868011
	)
	final int field5481;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 166691455
	)
	final int field5482;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1113410191
	)
	final int field5477;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1013134339
	)
	final int field5484;

	static {
		field5483 = new class516(0, 0, 0, 0, 0, 0);
		field5485 = new class516(1, 1, 507, 507, 507, 507);
		field5475 = new class516(2, 2, 338, 338, 338, 507);
		field5476 = new class516(3, 3, 499, 499, 499, 507);
	}

	class516(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5479 = var1;
		this.field5484 = var2;
		this.field5480 = var3;
		this.field5481 = var4;
		this.field5482 = var5;
		this.field5477 = var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5484;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "2093749101"
	)
	boolean method10292(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z",
		garbageValue = "-44"
	)
	boolean method10277(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-1295265182"
	)
	public boolean method10278(boolean var1, boolean var2, boolean var3) {
		return this.method10292(this.field5480, var1, var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1346006950"
	)
	public boolean method10279(boolean var1, boolean var2, boolean var3) {
		return this.method10292(this.field5481, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1511130983"
	)
	public boolean method10280(boolean var1, boolean var2, boolean var3) {
		return this.method10292(this.field5482, var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-917748612"
	)
	public boolean method10281(boolean var1, boolean var2, boolean var3) {
		return this.method10292(this.field5477, var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "111"
	)
	public boolean method10285(boolean var1, boolean var2, boolean var3) {
		return this.method10277(this.field5480, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "2039592518"
	)
	public boolean method10282(boolean var1, boolean var2, boolean var3) {
		return this.method10277(this.field5481, var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-83"
	)
	public boolean method10283(boolean var1, boolean var2, boolean var3) {
		return this.method10277(this.field5482, var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lti;III)V",
		garbageValue = "956583818"
	)
	public static void method10308(DynamicArray var0, int var1, int var2) {
		if (var0 != null && var0.method10322() > 1) {
			class374.method8144(var0);
			if (var0.field5504 == class574.field5820) {
				class480.method9692(var0.method10318(), var0.method10322(), var1, var2);
			} else if (var0.field5504 == class574.field5816) {
				class480.method9689(var0.method10320(), var0.method10322(), var1, var2);
			} else {
				class480.method9709(var0.method10321(), var0.method10322(), var1, var2);
			}

		}
	}
}
