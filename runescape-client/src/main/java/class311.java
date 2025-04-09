import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public abstract class class311 implements class313 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1525641107
	)
	protected int field3357;

	@ObfuscatedSignature(
		descriptor = "(Loi;Lqa;I)V"
	)
	protected class311(StudioGame var1, Language var2, int var3) {
		this.field3357 = var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "9"
	)
	public static int method6481(int var0, int var1, int var2) {
		int var3 = VerticalAlignment.method5222(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}
}
