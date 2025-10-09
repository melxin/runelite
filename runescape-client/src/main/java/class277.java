import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class277 {
	@ObfuscatedName("ab")
	final int[][] field3262;
	@ObfuscatedName("at")
	final int[][] field3263;
	@ObfuscatedName("ag")
	final int[] field3261;
	@ObfuscatedName("aj")
	final int[] field3260;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -226759645
	)
	final int field3264;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1482026013
	)
	int field3265;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1202523019
	)
	int field3266;

	class277(int var1, int var2) {
		this.field3262 = new int[var1][var2];
		this.field3263 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = ConcurrentMidiTask.method9757(var3 / 4);
		this.field3261 = new int[var4];
		this.field3260 = new int[var4];
		this.field3264 = var4 - 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "979975411"
	)
	void method6253() {
		for (int var1 = 0; var1 < this.field3262.length; ++var1) {
			for (int var2 = 0; var2 < this.field3262[var1].length; ++var2) {
				this.field3262[var1][var2] = 0;
				this.field3263[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "255"
	)
	void method6251(int var1, int var2) {
		this.field3265 = var1;
		this.field3266 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	int method6252() {
		return this.field3265;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	int method6281() {
		return this.field3266;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "906956931"
	)
	int method6249() {
		return this.field3262.length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "911957538"
	)
	int method6282() {
		return this.field3262[0].length;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1285060706"
	)
	int[][] method6256() {
		return this.field3262;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "65535"
	)
	int[][] method6257() {
		return this.field3263;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	int[] method6258() {
		return this.field3261;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "117"
	)
	int[] method6259() {
		return this.field3260;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1770246872"
	)
	int method6269() {
		return this.field3264;
	}

	@ObfuscatedName("ag")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class445.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
