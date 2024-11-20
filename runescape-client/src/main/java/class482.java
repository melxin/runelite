import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public abstract class class482 {
	@ObfuscatedName("go")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	class482() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lsl;IB)V",
		garbageValue = "0"
	)
	abstract void vmethod9208(WorldEntityCoord var1, class481 var2, int var3);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;III)Z",
		garbageValue = "1905256684"
	)
	abstract boolean vmethod9214(WorldEntityCoord var1, int var2, int var3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-680568556"
	)
	abstract void vmethod9206(int var1, int var2);
}
