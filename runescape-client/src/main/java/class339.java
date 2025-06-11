import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class339 {
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1843677409
	)
	int field3762;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	class107 field3760;

	@ObfuscatedSignature(
		descriptor = "(ILeh;)V"
	)
	class339(int var1, class107 var2) {
		this.field3762 = var1;
		this.field3760 = var2;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "428799657"
	)
	public static int method7103(byte[] var0, int var1) {
		return WorldEntityCoord.method6095(var0, 0, var1);
	}
}
