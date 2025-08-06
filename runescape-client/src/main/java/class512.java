import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public class class512 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class512 field5381;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class512 field5374;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class512 field5376;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	public static final class512 field5377;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 114083335
	)
	final int field5378;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 642948229
	)
	final int field5379;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -222504619
	)
	final int field5375;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 28489459
	)
	final int field5380;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1316896431
	)
	final int field5382;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 369725755
	)
	final int field5383;

	static {
		field5381 = new class512(0, 0, 0, 0, 0, 0);
		field5374 = new class512(1, 1, 507, 507, 507, 507);
		field5376 = new class512(2, 2, 338, 338, 338, 507);
		field5377 = new class512(3, 3, 499, 499, 499, 507);
	}

	class512(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5378 = var1;
		this.field5383 = var2;
		this.field5379 = var3;
		this.field5375 = var4;
		this.field5380 = var5;
		this.field5382 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "2015875172"
	)
	boolean method10295(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "65280"
	)
	boolean method10337(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "985574739"
	)
	public boolean method10297(boolean var1, boolean var2, boolean var3) {
		return this.method10295(this.field5379, var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-614602003"
	)
	public boolean method10298(boolean var1, boolean var2, boolean var3) {
		return this.method10295(this.field5375, var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "1"
	)
	public boolean method10310(boolean var1, boolean var2, boolean var3) {
		return this.method10295(this.field5380, var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "0"
	)
	public boolean method10300(boolean var1, boolean var2, boolean var3) {
		return this.method10295(this.field5382, var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "62"
	)
	public boolean method10301(boolean var1, boolean var2, boolean var3) {
		return this.method10337(this.field5379, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1436388473"
	)
	public boolean method10302(boolean var1, boolean var2, boolean var3) {
		return this.method10337(this.field5375, var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "16"
	)
	public boolean method10319(boolean var1, boolean var2, boolean var3) {
		return this.method10337(this.field5380, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([JI)Ltn;",
		garbageValue = "-411270971"
	)
	public static DynamicArray method10338(long[] var0) {
		DynamicArray var1 = new DynamicArray(class570.field5724, false);
		var1.field5405 = var0;
		var1.size = var0.length * 1527641021;
		var1.field5402 = var0.length;
		return var1;
	}
}
