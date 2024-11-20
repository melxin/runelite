import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class271 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3036;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3030;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3032;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3031;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3033;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3034;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3039;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lkl;"
	)
	static final class271[] field3029;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1487228949
	)
	final int field3040;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1172274639
	)
	final int field3037;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1608977737
	)
	final int field3038;

	static {
		field3036 = new class271(0, 8, 8);
		field3030 = new class271(6, 16, 16);
		field3032 = new class271(2, 32, 32);
		field3031 = new class271(5, 48, 48);
		field3033 = new class271(1, 64, 64);
		field3034 = new class271(3, 96, 96);
		field3039 = new class271(4, 128, 128);
		field3029 = class459.method8807();
		Arrays.sort(field3029, new class278());
	}

	class271(int var1, int var2, int var3) {
		this.field3040 = var1;
		this.field3037 = var2;
		this.field3038 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method5638() {
		return this.field3037 * this.field3038;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lse;",
		garbageValue = "0"
	)
	public static class491[] method5642() {
		return new class491[]{class491.field5083, class491.field5084, class491.field5085};
	}
}
