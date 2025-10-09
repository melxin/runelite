import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class151 extends class150 {
	@ObfuscatedName("ah")
	public static short[] field1771;
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1701493589
	)
	int field1772;
	@ObfuscatedName("at")
	boolean field1774;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class151(class153 var1) {
		this.this$0 = var1;
		this.field1772 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1772 = var1.readUnsignedShort();
		this.field1774 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3994(this.field1772, this.field1774);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Los;",
		garbageValue = "-1429370694"
	)
	public static class381[] method3910() {
		return new class381[]{class381.field4430, class381.field4427, class381.field4426};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([IB)Ltl;",
		garbageValue = "56"
	)
	public static DynamicArray method3914(int[] var0) {
		DynamicArray var1 = new DynamicArray(class572.field5879, false);
		var1.array = var0;
		var1.size = var0.length * 1093200759;
		var1.field5572 = var0.length;
		return var1;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "48907788"
	)
	static void method3917(int var0, int var1, int var2, int var3, int var4) {
		class206.method4592(class32.worldView, var0, var1, var2, var3, var4);
	}
}
