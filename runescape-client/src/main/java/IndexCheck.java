import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("IndexCheck")
public class IndexCheck implements class28 {
	@ObfuscatedName("at")
	public int[] field3208;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -606893143
	)
	public int field3217;
	@ObfuscatedName("aj")
	int[] field3210;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1302990029
	)
	int field3211;
	@ObfuscatedName("af")
	public char field3207;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1488579175
	)
	public int field3213;
	@ObfuscatedName("aq")
	char[] field3214;
	@ObfuscatedName("ac")
	int[] field3216;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -294733959
	)
	int field3221;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -468702289
	)
	int field3215;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 853108111
	)
	int field3218;
	@ObfuscatedName("av")
	boolean[] field3219;
	@ObfuscatedName("as")
	boolean[] field3220;
	@ObfuscatedName("ar")
	boolean[] field3209;

	public IndexCheck() {
		this.field3208 = new int[128];
		this.field3217 = 0;
		this.field3210 = new int[128];
		this.field3211 = 0;
		this.field3214 = new char[128];
		this.field3216 = new int[128];
		this.field3221 = 0;
		this.field3215 = 0;
		this.field3218 = 0;
		this.field3219 = new boolean[112];
		this.field3220 = new boolean[112];
		this.field3209 = new boolean[112];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2126195099"
	)
	public boolean vmethod6166(int var1) {
		this.method6128(var1);
		this.field3219[var1] = true;
		this.field3220[var1] = true;
		this.field3209[var1] = false;
		if (this.field3217 < 128) {
			this.field3208[++this.field3217 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-124"
	)
	public boolean vmethod6127(int var1) {
		this.field3219[var1] = false;
		this.field3220[var1] = false;
		this.field3209[var1] = true;
		if (this.field3211 < 128) {
			this.field3210[++this.field3211 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "951729544"
	)
	public boolean vmethod6156(char var1) {
		int var2 = this.field3215 + 1 & 127;
		if (var2 != this.field3221) {
			this.field3216[this.field3215] = -1;
			this.field3214[this.field3215] = var1;
			this.field3215 = var2;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1474092400"
	)
	public boolean vmethod6138(boolean var1) {
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-218152458"
	)
	void method6128(int var1) {
		int var2 = this.field3215 + 1 & 127;
		if (var2 != this.field3221) {
			this.field3216[this.field3215] = var1;
			this.field3214[this.field3215] = 0;
			this.field3215 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-686058641"
	)
	public void method6125() {
		this.field3221 = this.field3218;
		this.field3218 = this.field3215;
		this.field3217 = 0;
		this.field3211 = 0;
		Arrays.fill(this.field3220, false);
		Arrays.fill(this.field3209, false);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-604183241"
	)
	public final boolean method6130() {
		if (this.field3218 == this.field3221) {
			return false;
		} else {
			this.field3213 = this.field3216[this.field3221];
			this.field3207 = this.field3214[this.field3221];
			this.field3221 = this.field3221 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-22"
	)
	public boolean method6131(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3220[var1] : false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-84"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3219[var1] : false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1886744891"
	)
	public boolean method6157(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3209[var1] : false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-835711903"
	)
	public int[] method6129() {
		int[] var1 = new int[this.field3217];

		for (int var2 = 0; var2 < this.field3217; ++var2) {
			var1[var2] = this.field3208[var2];
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "135496316"
	)
	public int[] method6135() {
		int[] var1 = new int[this.field3211];

		for (int var2 = 0; var2 < this.field3211; ++var2) {
			var1[var2] = this.field3210[var2];
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "100"
	)
	static int method6170(int var0) {
		return class26.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lre;",
		garbageValue = "1519481429"
	)
	public static class450 method6169(float var0, float var1, float var2) {
		synchronized(class450.field5214) {
			if (class450.field5210 == 0) {
				return new class450(var0, var1, var2);
			} else {
				class450.field5214[--class450.field5210].method9066(var0, var1, var2);
				return class450.field5214[class450.field5210];
			}
		}
	}
}
