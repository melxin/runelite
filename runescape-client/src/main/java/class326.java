import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class326 implements class321 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3593;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3583;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3584;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3582;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3586;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3587;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class326 field3588;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static final class326 field3589;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	static final class326[] field3585;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1437997089
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1117211653
	)
	public final int field3590;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 748387373
	)
	public final int field3591;

	static {
		field3593 = new class326(14, 0);
		field3583 = new class326(15, 20);
		field3584 = new class326(16, -2);
		field3582 = new class326(18, -2);
		field3586 = new class326(19, -2);
		field3587 = new class326(20, 58);
		field3588 = new class326(21, 37);
		field3589 = new class326(27, 0);
		field3585 = new class326[32];
		class326[] var0 = Clock.method5073();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3585[var0[var1].field3590] = var0[var1];
		}

	}

	class326(int var1, int var2) {
		this.field3590 = var1;
		this.field3591 = var2;
	}
}
