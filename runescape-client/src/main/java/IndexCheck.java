import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("aj")
	public int[] field3058;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2026753427
	)
	public int field3059;
	@ObfuscatedName("ai")
	int[] field3060;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -874743009
	)
	int field3057;
	@ObfuscatedName("ac")
	public char field3062;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 131148493
	)
	public int field3063;
	@ObfuscatedName("am")
	char[] field3061;
	@ObfuscatedName("ah")
	int[] field3065;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1238675111
	)
	int field3072;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 983784001
	)
	int field3064;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1174454467
	)
	int field3070;
	@ObfuscatedName("ad")
	boolean[] field3069;
	@ObfuscatedName("af")
	boolean[] field3068;
	@ObfuscatedName("ak")
	boolean[] field3071;

	public IndexCheck() {
		this.field3058 = new int[128];
		this.field3059 = 0;
		this.field3060 = new int[128];
		this.field3057 = 0;
		this.field3061 = new char[128];
		this.field3065 = new int[128];
		this.field3072 = 0;
		this.field3064 = 0;
		this.field3070 = 0;
		this.field3069 = new boolean[112];
		this.field3068 = new boolean[112];
		this.field3071 = new boolean[112];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1360488450"
	)
	public boolean vmethod5884(int var1) {
		this.method5887(var1);
		this.field3069[var1] = true;
		this.field3068[var1] = true;
		this.field3071[var1] = false;
		if (this.field3059 < 128) {
			this.field3058[++this.field3059 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-918792953"
	)
	public boolean vmethod5912(int var1) {
		this.field3069[var1] = false;
		this.field3068[var1] = false;
		this.field3071[var1] = true;
		if (this.field3057 < 128) {
			this.field3060[++this.field3057 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1362136571"
	)
	public boolean vmethod5908(char var1) {
		int var2 = this.field3064 + 1 & 127;
		if (var2 != this.field3072) {
			this.field3065[this.field3064] = -1;
			this.field3061[this.field3064] = var1;
			this.field3064 = var2;
		}

		return false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1328180320"
	)
	public boolean vmethod5888(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1933155739"
	)
	void method5887(int var1) {
		int var2 = this.field3064 + 1 & 127;
		if (var2 != this.field3072) {
			this.field3065[this.field3064] = var1;
			this.field3061[this.field3064] = 0;
			this.field3064 = var2;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "880494042"
	)
	public void method5921() {
		this.field3072 = this.field3070;
		this.field3070 = this.field3064;
		this.field3059 = 0;
		this.field3057 = 0;
		Arrays.fill(this.field3068, false);
		Arrays.fill(this.field3071, false);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "21"
	)
	public final boolean method5890() {
		if (this.field3070 == this.field3072) {
			return false;
		} else {
			this.field3063 = this.field3065[this.field3072];
			this.field3062 = this.field3061[this.field3072];
			this.field3072 = this.field3072 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1511706882"
	)
	public boolean method5891(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3068[var1] : false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2141849756"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3069[var1] : false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-126"
	)
	public boolean method5893(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3071[var1] : false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "38"
	)
	public int[] method5894() {
		int[] var1 = new int[this.field3059];

		for (int var2 = 0; var2 < this.field3059; ++var2) {
			var1[var2] = this.field3058[var2];
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-119"
	)
	public int[] method5895() {
		int[] var1 = new int[this.field3057];

		for (int var2 = 0; var2 < this.field3057; ++var2) {
			var1[var2] = this.field3060[var2];
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "1590736225"
	)
	static float method5922(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}
}
