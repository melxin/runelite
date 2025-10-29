import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1784084401
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbu;",
		garbageValue = "-77"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lbu;",
		garbageValue = "-1671591810"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1853998737"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lwe;",
		garbageValue = "-1689231098"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class458.field5233.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method11469(new Buffer(var2));
			}

			var1.method11471();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([J[JIIB)V",
		garbageValue = "-30"
	)
	public static void method2061(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

			for (int var12 = var2; var12 < var3; ++var12) {
				if (var0[var12] < var6 + ((long)var12 & var10)) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method2061(var0, var1, var2, var5 - 1);
			method2061(var0, var1, var5 + 1, var3);
		}
	}
}
