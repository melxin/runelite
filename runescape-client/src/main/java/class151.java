import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public abstract class class151 extends Node {
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1287295721
	)
	@Export("currentPort")
	static int currentPort;

	class151() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	abstract void vmethod4111(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	abstract void vmethod4112(ClanSettings var1);

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "1219805793"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return class423.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
