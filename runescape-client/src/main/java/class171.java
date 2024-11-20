import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class171 {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field1814;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-124"
	)
	public static int method3679(int var0) {
		return Renderable.method5155(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1768470727"
	)
	public static int method3678(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}
}
