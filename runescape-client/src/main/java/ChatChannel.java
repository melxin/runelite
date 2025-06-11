import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ot")
	static SecureRandom field831;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -487327443
	)
	static int field830;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1886364519
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbd;",
		garbageValue = "105"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbd;",
		garbageValue = "21"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1523037483"
	)
	public static void method1995() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)Ltp;",
		garbageValue = "954628671"
	)
	public static class509 method2005(String[] var0) {
		class509 var1 = new class509(class563.field5595, false);
		var1.field5295 = var0;
		var1.field5287 = var0.length * 1090132113;
		var1.field5291 = var0.length;
		return var1;
	}
}
