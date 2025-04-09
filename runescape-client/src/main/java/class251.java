import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class251 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2772;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2766;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2776;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2765;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2769;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2774;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final class251 field2771;
	@ObfuscatedName("aa")
	public static int[] field2773;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -617234207
	)
	static int field2775;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -43903311
	)
	final int field2768;

	static {
		field2772 = new class251(0);
		field2766 = new class251(1);
		field2776 = new class251(2);
		field2765 = new class251(3);
		field2769 = new class251(4);
		field2774 = new class251(5);
		field2771 = new class251(6);
		field2773 = null;
	}

	class251(int var1) {
		this.field2768 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1040419537"
	)
	public static void method5231() {
		field2773 = new int[7];
		field2773[field2772.field2768] = class267.field3038.field3045;
		field2773[field2766.field2768] = class267.field3042.field3045;
		field2773[field2776.field2768] = class267.field3040.field3045;
		field2773[field2765.field2768] = class267.field3037.field3045;
		field2773[field2769.field2768] = class267.field3039.field3045;
		field2773[field2774.field2768] = class267.field3034.field3045;
		field2773[field2771.field2768] = class267.field3041.field3045;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1684687790"
	)
	static final void method5230(String var0) {
		ClanSettings.method3631("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1899918952"
	)
	public static long method5233(int var0) {
		if (var0 > 63) {
			throw new class447("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-321205294"
	)
	static void method5232(String var0, String var1, String var2) {
		class137.method3379(7);
		TileItem.setLoginResponseString(var0, var1, var2);
	}
}
