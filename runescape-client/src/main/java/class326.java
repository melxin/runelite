import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class326 implements class321 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3587;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3581;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3582;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3586;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3584;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3585;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class326 field3590;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static final class326 field3580;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lmp;"
	)
	static final class326[] field3583;
	@ObfuscatedName("bs")
	static String field3591;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2002091107
	)
	public final int field3588;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1167649493
	)
	public final int field3589;

	static {
		field3587 = new class326(14, 0);
		field3581 = new class326(15, 20);
		field3582 = new class326(16, -2);
		field3586 = new class326(18, -2);
		field3584 = new class326(19, -2);
		field3585 = new class326(20, 58);
		field3590 = new class326(21, 37);
		field3580 = new class326(27, 0);
		field3583 = new class326[32];
		class326[] var0 = new class326[]{field3581, field3580, field3584, field3582, field3587, field3586, field3585, field3590};
		class326[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3583[var1[var2].field3588] = var1[var2];
		}

	}

	class326(int var1, int var2) {
		this.field3588 = var1;
		this.field3589 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-122"
	)
	public static byte[] method6472(int var0) {
		return DevicePcmPlayerProvider.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)Z",
		garbageValue = "2088328530"
	)
	static boolean method6471(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class95.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
