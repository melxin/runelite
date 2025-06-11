import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class270 extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1156891931
	)
	public int field3053;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 165333043
	)
	public int field3054;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2105669231
	)
	public int field3055;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	public Widget field3051;

	@ObfuscatedSignature(
		descriptor = "(IIILov;)V"
	)
	public class270(int var1, int var2, int var3, Widget var4) {
		this.field3055 = var1;
		this.field3053 = var2;
		this.field3054 = var3;
		this.field3051 = var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1734690149"
	)
	public static int method5882(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}
}
