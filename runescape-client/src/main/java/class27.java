import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class27 {
	@ObfuscatedName("ae")
	int[] field129;
	@ObfuscatedName("aq")
	int[] field128;

	public class27() {
		this.field129 = new int[112];
		this.field128 = new int[192];
		Arrays.fill(this.field129, 3);
		Arrays.fill(this.field128, 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-19639"
	)
	public void method406(int var1, int var2) {
		if (this.method414(var1) && this.method416(var2)) {
			this.field129[var1] = var2;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "127"
	)
	public void method407(char var1, int var2) {
		if (this.method415(var1) && this.method416(var2)) {
			this.field128[var1] = var2;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1306234141"
	)
	public int method408(int var1) {
		return this.method414(var1) ? this.field129[var1] : 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-11"
	)
	public int method426(char var1) {
		return this.method415(var1) ? this.field128[var1] : 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1918199008"
	)
	public boolean method410(int var1) {
		return this.method414(var1) && (this.field129[var1] == 1 || this.field129[var1] == 3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2071506574"
	)
	public boolean method409(char var1) {
		return this.method415(var1) && (this.field128[var1] == 1 || this.field128[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method412(int var1) {
		return this.method414(var1) && (this.field129[var1] == 2 || this.field129[var1] == 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-975053530"
	)
	public boolean method430(char var1) {
		return this.method415(var1) && (this.field128[var1] == 2 || this.field128[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1064429288"
	)
	boolean method414(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "3"
	)
	boolean method415(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	boolean method416(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-18095"
	)
	public static boolean method405(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class441.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "0"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "120681303"
	)
	static void method441(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		Player.method2203(class32.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
