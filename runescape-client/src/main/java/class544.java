import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
public class class544 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class544 field5392;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class544 field5395;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class544 field5393;
	@ObfuscatedName("ar")
	@Export("osName")
	static String osName;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 1101882757
	)
	static int field5398;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1468080595
	)
	public final int field5394;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1822348369
	)
	public final int field5391;
	@ObfuscatedName("an")
	public final Class field5396;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final class540 field5397;

	static {
		field5392 = new class544(2, 0, Integer.class, new class541());
		field5395 = new class544(1, 1, Long.class, new class543());
		field5393 = new class544(0, 2, String.class, new class545());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Luj;)V"
	)
	class544(int var1, int var2, Class var3, class540 var4) {
		this.field5394 = var1;
		this.field5391 = var2;
		this.field5396 = var3;
		this.field5397 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5391;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)Ljava/lang/Object;",
		garbageValue = "35"
	)
	public Object method10123(Buffer var1) {
		return this.field5397.vmethod10140(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lud;",
		garbageValue = "583849502"
	)
	public static class544[] method10125() {
		return new class544[]{field5393, field5392, field5395};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldm;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class241.method5261(var1, var0);
		Script var4 = class158.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = class158.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				var3 = class454.method8933(var0);
				var4 = class158.getScript(var3, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lud;",
		garbageValue = "46"
	)
	public static class544 method10119(Class var0) {
		class544[] var1 = method10125();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class544 var3 = var1[var2];
			if (var3.field5396 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "119"
	)
	static final boolean method10126(int var0) {
		return var0 == 16 || var0 == 17 || var0 >= 18 && var0 <= 22;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;B)V",
		garbageValue = "1"
	)
	public static void method10136(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class544 var4 = method10119(var3);
		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class540 var2 = var4.field5397;
			var2.vmethod10147(var0, var1);
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "109"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
