import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public abstract class class268 {
	@ObfuscatedName("av")
	String field3115;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final class265 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;)V"
	)
	class268(class265 var1, String var2) {
		this.this$0 = var1;
		this.field3115 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public abstract int vmethod6032();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "829325079"
	)
	public int vmethod6034() {
		return -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1138888908"
	)
	public String vmethod6033() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1271423982"
	)
	public String method6041() {
		return this.field3115;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1986289180"
	)
	public static int method6040(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1180288745"
	)
	static void method6039() {
		DynamicObject.method1987(24);
		class460.setLoginResponseString("", "You were disconnected from the server.", "");
	}
}
