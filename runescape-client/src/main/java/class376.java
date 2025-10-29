import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class376 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	public class378 field4141;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	class372 field4136;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	class28 field4140;
	@ObfuscatedName("an")
	public Object[] field4138;
	@ObfuscatedName("ae")
	public Object[] field4139;
	@ObfuscatedName("aj")
	public Object[] field4135;
	@ObfuscatedName("ak")
	public Object[] field4137;

	class376() {
		this.field4141 = new class378();
		this.field4136 = new class372();
		this.field4140 = new class28();
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "5"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field490) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
