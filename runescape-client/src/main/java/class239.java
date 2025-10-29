import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public abstract class class239 {
	@ObfuscatedName("an")
	String field2666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	final class236 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljava/lang/String;)V"
	)
	class239(class236 var1, String var2) {
		this.this$0 = var1;
		this.field2666 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2141955216"
	)
	public abstract int vmethod5235();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "497178271"
	)
	public int vmethod5232() {
		return -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1380857227"
	)
	public String vmethod5233() {
		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method5231() {
		return this.field2666;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "112"
	)
	static int method5241(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
