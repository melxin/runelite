import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class503 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static final class503 field5203;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static final class503 field5198;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static final class503 field5204;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	public static final class503 field5199;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 818290841
	)
	final int field5200;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -549467053
	)
	final int field5201;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -441623435
	)
	final int field5202;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1884355355
	)
	final int field5197;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1083686743
	)
	final int field5196;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1038260919
	)
	final int field5205;

	static {
		field5203 = new class503(0, 0, 0, 0, 0, 0);
		field5198 = new class503(1, 1, 507, 507, 507, 507);
		field5204 = new class503(2, 2, 338, 338, 338, 507);
		field5199 = new class503(3, 3, 499, 499, 499, 507);
	}

	class503(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5200 = var1;
		this.field5201 = var2;
		this.field5202 = var3;
		this.field5197 = var4;
		this.field5196 = var5;
		this.field5205 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5201;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z",
		garbageValue = "20"
	)
	boolean method9486(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZZZS)Z",
		garbageValue = "-27374"
	)
	boolean method9506(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1349967394"
	)
	public boolean method9491(boolean var1, boolean var2, boolean var3) {
		return this.method9486(this.field5202, var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-30"
	)
	public boolean method9489(boolean var1, boolean var2, boolean var3) {
		return this.method9486(this.field5197, var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "320123392"
	)
	public boolean method9490(boolean var1, boolean var2, boolean var3) {
		return this.method9486(this.field5196, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1795846943"
	)
	public boolean method9487(boolean var1, boolean var2, boolean var3) {
		return this.method9486(this.field5205, var1, var2, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "837920734"
	)
	public boolean method9511(boolean var1, boolean var2, boolean var3) {
		return this.method9506(this.field5202, var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "401813950"
	)
	public boolean method9492(boolean var1, boolean var2, boolean var3) {
		return this.method9506(this.field5197, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "70"
	)
	public boolean method9493(boolean var1, boolean var2, boolean var3) {
		return this.method9506(this.field5196, var1, var2, var3);
	}
}
