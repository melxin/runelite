import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ai")
	static byte[][][] field806;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		longValue = -4449852899261931453L
	)
	static long field804;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 705681979
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;",
		garbageValue = "1609462101"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lbd;",
		garbageValue = "-1459480157"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1488192901"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("al")
	public static final int method1997(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = var14 + (0.6666666666666666D - var20) * (var12 - var14) * 6.0D;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1750791445"
	)
	static final int method2002() {
		float var0 = 200.0F * ((float)FriendSystem.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
