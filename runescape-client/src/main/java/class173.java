import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class173 extends class166 {
	@ObfuscatedName("ab")
	String field1820;
	@ObfuscatedName("aw")
	byte field1822;
	@ObfuscatedName("at")
	byte field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class173(class167 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	void vmethod3691(Buffer var1) {
		this.field1820 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1820 != null) {
			var1.readUnsignedByte();
			this.field1822 = var1.readByte();
			this.field1819 = var1.readByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	void vmethod3688(ClanChannel var1) {
		var1.name = this.field1820;
		if (this.field1820 != null) {
			var1.field1809 = this.field1822;
			var1.field1810 = this.field1819;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)D",
		garbageValue = "8"
	)
	public static double method3686(int var0) {
		return (double)WorldMapIcon_0.method6148(var0) / 65536.0D;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "887771545"
	)
	static SecureRandom method3692() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1701101127"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class92.updateItemPile2(Projection.worldView, var0, var1, var2);
	}
}
