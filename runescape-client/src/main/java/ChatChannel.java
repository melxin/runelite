import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1026361993
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lcd;",
		garbageValue = "41"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "1923336036"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "331471141"
	)
	@Export("size")
	int size() {
		return this.count;
	}
}
