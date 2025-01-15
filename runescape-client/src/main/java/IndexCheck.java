import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ah")
	char[] field2976;
	@ObfuscatedName("az")
	int[] field2977;
	@ObfuscatedName("ao")
	public int[] field2984;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1194474427
	)
	public int field2979;
	@ObfuscatedName("an")
	int[] field2980;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2034379675
	)
	int field2982;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -165631079
	)
	int field2990;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1411319837
	)
	int field2983;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 271975871
	)
	int field2978;
	@ObfuscatedName("au")
	boolean[] field2985;
	@ObfuscatedName("as")
	boolean[] field2986;
	@ObfuscatedName("aq")
	boolean[] field2987;
	@ObfuscatedName("af")
	public char field2975;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -821031549
	)
	public int field2989;

	public IndexCheck() {
		this.field2976 = new char[128];
		this.field2977 = new int[128];
		this.field2984 = new int[128];
		this.field2979 = 0;
		this.field2980 = new int[128];
		this.field2982 = 0;
		this.field2990 = 0;
		this.field2983 = 0;
		this.field2978 = 0;
		this.field2985 = new boolean[112];
		this.field2986 = new boolean[112];
		this.field2987 = new boolean[112];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-458319724"
	)
	public boolean vmethod5756(int var1) {
		this.method5789(var1);
		this.field2985[var1] = true;
		this.field2986[var1] = true;
		this.field2987[var1] = false;
		if (this.field2979 < 128) {
			this.field2984[++this.field2979 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean vmethod5757(int var1) {
		this.field2985[var1] = false;
		this.field2986[var1] = false;
		this.field2987[var1] = true;
		if (this.field2982 < 128) {
			this.field2980[++this.field2982 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "804434279"
	)
	public boolean vmethod5758(char var1) {
		int var2 = this.field2983 + 1 & 127;
		if (var2 != this.field2990) {
			this.field2977[this.field2983] = -1;
			this.field2976[this.field2983] = var1;
			this.field2983 = var2;
		}

		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1360179052"
	)
	public boolean vmethod5764(boolean var1) {
		return false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1037307663"
	)
	void method5789(int var1) {
		int var2 = this.field2983 + 1 & 127;
		if (var2 != this.field2990) {
			this.field2977[this.field2983] = var1;
			this.field2976[this.field2983] = 0;
			this.field2983 = var2;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "310936192"
	)
	public void method5763() {
		this.field2990 = this.field2978;
		this.field2978 = this.field2983;
		this.field2979 = 0;
		this.field2982 = 0;
		Arrays.fill(this.field2986, false);
		Arrays.fill(this.field2987, false);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1914191137"
	)
	public final boolean method5772() {
		if (this.field2978 == this.field2990) {
			return false;
		} else {
			this.field2989 = this.field2977[this.field2990];
			this.field2975 = this.field2976[this.field2990];
			this.field2990 = this.field2990 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method5755(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2986[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2985[var1] : false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	public boolean method5774(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2987[var1] : false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-61519205"
	)
	public int[] method5766() {
		int[] var1 = new int[this.field2979];

		for (int var2 = 0; var2 < this.field2979; ++var2) {
			var1[var2] = this.field2984[var2];
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-46"
	)
	public int[] method5767() {
		int[] var1 = new int[this.field2982];

		for (int var2 = 0; var2 < this.field2982; ++var2) {
			var1[var2] = this.field2980[var2];
		}

		return var1;
	}
}
