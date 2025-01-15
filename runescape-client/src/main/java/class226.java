import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public abstract class class226 {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -830255683
	)
	public static int field2468;
	@ObfuscatedName("ao")
	String field2465;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class223 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;)V"
	)
	class226(class223 var1, String var2) {
		this.this$0 = var1;
		this.field2465 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-681041604"
	)
	public abstract int vmethod5060();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2027661207"
	)
	public int vmethod5064() {
		return -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "2048"
	)
	public String vmethod5061() {
		return null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-100"
	)
	public String method5059() {
		return this.field2465;
	}
}
