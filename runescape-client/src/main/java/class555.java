import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
public class class555 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	public static final class555 field5495;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	public static final class555 field5491;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	public static final class555 field5492;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1218393909
	)
	public final int field5493;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1315529227
	)
	public final int field5494;
	@ObfuscatedName("ac")
	public final Class field5490;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public final class551 field5496;

	static {
		field5495 = new class555(0, 0, Integer.class, new class552());
		field5491 = new class555(2, 1, Long.class, new class554());
		field5492 = new class555(1, 2, String.class, new class556());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lve;)V"
	)
	class555(int var1, int var2, Class var3, class551 var4) {
		this.field5493 = var1;
		this.field5494 = var2;
		this.field5490 = var3;
		this.field5496 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5494;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-1439991537"
	)
	public Object method10075(Buffer var1) {
		return this.field5496.vmethod10078(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvg;",
		garbageValue = "-58"
	)
	public static class555[] method10068() {
		return new class555[]{field5495, field5492, field5491};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lvg;",
		garbageValue = "2"
	)
	public static class555 method10074(Class var0) {
		class555[] var1 = method10068();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class555 var3 = var1[var2];
			if (var3.field5490 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("af")
	public static int method10064(long var0) {
		int var2 = (int)(var0 >>> 50 & 4095L);
		if ((long)var2 == 4095L) {
			var2 = -1;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1785769725"
	)
	public static float method10077(float var0, float var1, float var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
