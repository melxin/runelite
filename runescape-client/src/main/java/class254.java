import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class254 extends class269 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1613610671
	)
	int field3066;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	final class266 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkt;Ljava/lang/String;I)V"
	)
	class254(class266 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3066 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493842566"
	)
	public int vmethod6072() {
		return 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "475535765"
	)
	public int vmethod6070() {
		return this.field3066;
	}

	@ObfuscatedName("ah")
	public static int method5858(long var0) {
		int var2 = (int)(var0 >>> 52 & 4095L);
		if (4095L == (long)var2) {
			var2 = -1;
		}

		return var2;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "-663707809"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class385.loginState != var0) {
			class385.loginState = var0;
		}
	}
}
