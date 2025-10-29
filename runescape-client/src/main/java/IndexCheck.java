import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("at")
	public int[] field3247;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1355266525
	)
	public int field3234;
	@ObfuscatedName("an")
	int[] field3235;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 689848607
	)
	int field3236;
	@ObfuscatedName("aj")
	public char field3248;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2044709447
	)
	public int field3233;
	@ObfuscatedName("aw")
	char[] field3239;
	@ObfuscatedName("ap")
	int[] field3240;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 729836485
	)
	int field3241;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -822332839
	)
	int field3237;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -436309025
	)
	int field3243;
	@ObfuscatedName("ad")
	boolean[] field3244;
	@ObfuscatedName("ai")
	boolean[] field3245;
	@ObfuscatedName("as")
	boolean[] field3246;

	public IndexCheck() {
		this.field3247 = new int[128];
		this.field3234 = 0;
		this.field3235 = new int[128];
		this.field3236 = 0;
		this.field3239 = new char[128];
		this.field3240 = new int[128];
		this.field3241 = 0;
		this.field3237 = 0;
		this.field3243 = 0;
		this.field3244 = new boolean[112];
		this.field3245 = new boolean[112];
		this.field3246 = new boolean[112];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1696349320"
	)
	public boolean vmethod6295(int var1) {
		this.method6298(var1);
		this.field3244[var1] = true;
		this.field3245[var1] = true;
		this.field3246[var1] = false;
		if (this.field3234 < 128) {
			this.field3247[++this.field3234 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "63"
	)
	public boolean vmethod6326(int var1) {
		this.field3244[var1] = false;
		this.field3245[var1] = false;
		this.field3246[var1] = true;
		if (this.field3236 < 128) {
			this.field3235[++this.field3236 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-128"
	)
	public boolean vmethod6297(char var1) {
		int var2 = this.field3237 + 1 & 127;
		if (var2 != this.field3241) {
			this.field3240[this.field3237] = -1;
			this.field3239[this.field3237] = var1;
			this.field3237 = var2;
		}

		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-885160198"
	)
	public boolean vmethod6294(boolean var1) {
		return false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-320593924"
	)
	void method6298(int var1) {
		int var2 = this.field3237 + 1 & 127;
		if (var2 != this.field3241) {
			this.field3240[this.field3237] = var1;
			this.field3239[this.field3237] = 0;
			this.field3237 = var2;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public void method6300() {
		this.field3241 = this.field3243;
		this.field3243 = this.field3237;
		this.field3234 = 0;
		this.field3236 = 0;
		Arrays.fill(this.field3245, false);
		Arrays.fill(this.field3246, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	public final boolean method6301() {
		if (this.field3243 == this.field3241) {
			return false;
		} else {
			this.field3233 = this.field3240[this.field3241];
			this.field3248 = this.field3239[this.field3241];
			this.field3241 = this.field3241 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "504064209"
	)
	public boolean method6311(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3245[var1] : false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "1337"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3244[var1] : false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1677082177"
	)
	public boolean method6299(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3246[var1] : false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1169373205"
	)
	public int[] method6305() {
		int[] var1 = new int[this.field3234];

		for (int var2 = 0; var2 < this.field3234; ++var2) {
			var1[var2] = this.field3247[var2];
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1631973653"
	)
	public int[] method6320() {
		int[] var1 = new int[this.field3236];

		for (int var2 = 0; var2 < this.field3236; ++var2) {
			var1[var2] = this.field3235[var2];
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Z",
		garbageValue = "43"
	)
	static boolean method6308(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
