import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
final class class86 implements class357 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 436040985
	)
	static int field1230;
	@ObfuscatedName("aw")
	static ThreadPoolExecutor field1231;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Loi;)V"
	)
	class86(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8197"
	)
	public void vmethod7474() {
		if (this.val$item.method7974().field4069 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2136(this.val$item);
			var1.setArgs(this.val$item.method7974().field4069);
			class161.method3912().addFirst(var1);
		}

	}
}
