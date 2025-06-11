import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wu")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	field5780(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	field5783(2, 2);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1960515693
	)
	public final int field5782;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1176597651
	)
	final int field5781;

	FillMode(int var3, int var4) {
		this.field5782 = var3;
		this.field5781 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5781;
	}
}
