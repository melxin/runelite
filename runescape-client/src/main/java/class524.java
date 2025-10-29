import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class524 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class524 field5563;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	public static final class524 field5562;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class524 field5564;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class524 field5569;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 551325433
	)
	final int field5566;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 258686257
	)
	final int field5567;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -784785121
	)
	final int field5568;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -884512677
	)
	final int field5565;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1440885129
	)
	final int field5570;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1567378527
	)
	final int field5571;

	static {
		field5563 = new class524(0, 0, 0, 0, 0, 0);
		field5562 = new class524(1, 1, 507, 507, 507, 507);
		field5564 = new class524(2, 2, 338, 338, 338, 507);
		field5569 = new class524(3, 3, 499, 499, 499, 507);
	}

	class524(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5566 = var1;
		this.field5571 = var2;
		this.field5567 = var3;
		this.field5568 = var4;
		this.field5565 = var5;
		this.field5570 = var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5571;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "683279812"
	)
	boolean method10605(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z",
		garbageValue = "-126"
	)
	boolean method10606(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-125"
	)
	public boolean method10633(boolean var1, boolean var2, boolean var3) {
		return this.method10605(this.field5567, var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "923591847"
	)
	public boolean method10613(boolean var1, boolean var2, boolean var3) {
		return this.method10605(this.field5568, var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-1"
	)
	public boolean method10609(boolean var1, boolean var2, boolean var3) {
		return this.method10605(this.field5565, var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "18"
	)
	public boolean method10610(boolean var1, boolean var2, boolean var3) {
		return this.method10605(this.field5570, var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1627122591"
	)
	public boolean method10607(boolean var1, boolean var2, boolean var3) {
		return this.method10606(this.field5567, var1, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1380196845"
	)
	public boolean method10604(boolean var1, boolean var2, boolean var3) {
		return this.method10606(this.field5568, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "74"
	)
	public boolean method10629(boolean var1, boolean var2, boolean var3) {
		return this.method10606(this.field5565, var1, var2, var3);
	}
}
