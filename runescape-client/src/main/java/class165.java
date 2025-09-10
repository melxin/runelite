import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class165 extends class151 {
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 29702835
	)
	static int field1886;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1299114377
	)
	int field1885;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class165(class154 var1) {
		this.this$0 = var1;
		this.field1885 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1885 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3925(this.field1885);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "40"
	)
	public static int method4019(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
