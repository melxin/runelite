import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class237 {
	@ObfuscatedName("ah")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("an")
	public String field2652;
	@ObfuscatedName("ae")
	public float[] field2651;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 174700835
	)
	public int field2654;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 896739389
	)
	public int field2656;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 46220593
	)
	public int field2657;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	final class236 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljk;)V"
	)
	class237(class236 var1) {
		this.this$0 = var1;
		this.field2651 = new float[4];
		this.field2654 = 1;
		this.field2656 = 1;
		this.field2657 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2120438094"
	)
	public static int method5213(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}
}
