import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class160 extends class151 {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field1815;
	@ObfuscatedName("of")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("av")
	String field1811;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class160(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1811 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.name = this.field1811;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "579418713"
	)
	static int method4034(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field609 - 7.0D) * 256.0D);
	}
}
