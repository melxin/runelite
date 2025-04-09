import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class272 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3101;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3091;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3092;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3090;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3103;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3095;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class272 field3096;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lkx;"
	)
	static final class272[] field3098;
	@ObfuscatedName("ai")
	static int[] field3094;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1575941763
	)
	final int field3097;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 160954365
	)
	final int field3099;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 942334173
	)
	final int field3100;

	static {
		field3101 = new class272(0, 8, 8);
		field3091 = new class272(4, 16, 16);
		field3092 = new class272(3, 32, 32);
		field3090 = new class272(6, 48, 48);
		field3103 = new class272(5, 64, 64);
		field3095 = new class272(2, 96, 96);
		field3096 = new class272(1, 128, 128);
		field3098 = class92.method2499();
		Arrays.sort(field3098, new class280());
	}

	class272(int var1, int var2, int var3) {
		this.field3097 = var1;
		this.field3099 = var2;
		this.field3100 = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1563188277"
	)
	int method5744() {
		return this.field3099 * this.field3100;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1865242672"
	)
	static int method5749(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-585226964"
	)
	static final void method5750() {
		Client.field742 = Client.cycleCntr;
		class443.field4925 = true;
	}
}
