import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class255 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	public UrlRequest field3018;
	@ObfuscatedName("ab")
	public float[] field3019;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final class265 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	class255(class265 var1) {
		this.this$0 = var1;
		this.field3019 = new float[4];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1241337534"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}
}
