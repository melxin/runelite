import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class271 extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 402339939
	)
	public int field3127;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1018715855
	)
	public int field3128;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1803568137
	)
	public int field3125;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	public Widget field3129;

	@ObfuscatedSignature(
		descriptor = "(IIILox;)V"
	)
	public class271(int var1, int var2, int var3, Widget var4) {
		this.field3125 = var1;
		this.field3127 = var2;
		this.field3128 = var3;
		this.field3129 = var4;
	}
}
