import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ul")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("al")
	long[] field3052;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -919398757
	)
	int field3049;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -928886409
	)
	int field3048;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -7713475289237829613L
	)
	long field3054;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 652933049
	)
	int field3051;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -19318215
	)
	int field3053;

	public MilliClock() {
		this.field3052 = new long[10];
		this.field3049 = 256;
		this.field3048 = 1;
		this.field3051 = 0;
		this.field3054 = UserComparator7.method3496();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3052[var1] = this.field3054;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1103629739"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3052[var1] = 0L;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2018679037"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field3049;
		int var4 = this.field3048;
		this.field3049 = 300;
		this.field3048 = 1;
		this.field3054 = UserComparator7.method3496();
		if (0L == this.field3052[this.field3053]) {
			this.field3049 = var3;
			this.field3048 = var4;
		} else if (this.field3054 > this.field3052[this.field3053]) {
			this.field3049 = (int)((long)(var1 * 2560) / (this.field3054 - this.field3052[this.field3053]));
		}

		if (this.field3049 < 25) {
			this.field3049 = 25;
		}

		if (this.field3049 > 256) {
			this.field3049 = 256;
			this.field3048 = (int)((long)var1 - (this.field3054 - this.field3052[this.field3053]) / 10L);
		}

		if (this.field3048 > var1) {
			this.field3048 = var1;
		}

		this.field3052[this.field3053] = this.field3054;
		this.field3053 = (this.field3053 + 1) % 10;
		int var5;
		if (this.field3048 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field3052[var5] != 0L) {
					this.field3052[var5] += (long)this.field3048;
				}
			}
		}

		if (this.field3048 < var2) {
			this.field3048 = var2;
		}

		UserComparator4.method3477((long)this.field3048);

		for (var5 = 0; this.field3051 < 256; this.field3051 += this.field3049) {
			++var5;
		}

		this.field3051 &= 255;
		return var5;
	}

	@ObfuscatedName("al")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class443.base37Table[(int)(var6 - 37L * var0)];
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Lkm;I)Z",
		garbageValue = "859240387"
	)
	public static boolean method5926(Buffer var0, WorldEntityCoord var1) {
		byte var2 = var0.readByte();
		if (var2 == 0) {
			return false;
		} else {
			int var3 = class1.method8(var0, var2, 0);
			int var4 = class1.method8(var0, var2, 2);
			int var5 = class1.method8(var0, var2, 4);
			int var6 = class1.method8(var0, var2, 6);
			var1.method6259(var3, var4, var5, var6);
			return true;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		Sound.clear();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		Client.field344.method6081();
		System.gc();
		class267.method6028(0, 0);
		class330.method7035();
		Client.playingJingle = false;
		Script.method1978();
		AuthenticationScheme.updateGameState(10);
		Client.serverCycle = 0;
		class190.method4289().method5940();
		class190.method4289().method5961();
	}
}
