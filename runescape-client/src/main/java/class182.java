import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class182 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -283462333
	)
	static int field2016;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lfv;"
	)
	class132[] field2018;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2115036993
	)
	int field2017;

	@ObfuscatedSignature(
		descriptor = "(Lve;I)V"
	)
	class182(Buffer var1, int var2) {
		this.field2018 = new class132[var2];
		this.field2017 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2018.length; ++var3) {
			class132 var4 = new class132(this.field2017, var1, false);
			this.field2018[var3] = var4;
		}

		this.method3974();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "780282081"
	)
	void method3974() {
		class132[] var1 = this.field2018;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class132 var3 = var1[var2];
			if (var3.field1557 >= 0) {
				var3.field1560 = this.field2018[var3.field1557];
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1535587173"
	)
	public int method3975() {
		return this.field2018.length;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "785026374"
	)
	class132 method3995(int var1) {
		return var1 >= this.method3975() ? null : this.field2018[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfv;",
		garbageValue = "880956443"
	)
	class132[] method3976() {
		return this.field2018;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfy;II)V",
		garbageValue = "737453688"
	)
	void method3982(class142 var1, int var2) {
		this.method3978(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I[ZZI)V",
		garbageValue = "-1282492777"
	)
	void method3978(class142 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3421();
		int var6 = 0;
		class132[] var7 = this.method3976();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class132 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3400(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;IB)Z",
		garbageValue = "-96"
	)
	public static boolean method3997(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var3 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var3 == null) {
			return false;
		} else {
			int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
			byte[] var5 = var1.getFile(var4, 0);
			return var5 != null;
		}
	}
}
