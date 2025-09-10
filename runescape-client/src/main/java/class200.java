import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class200 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2186;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2179;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2180;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2181;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2187;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2183;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final class200 field2184;
	@ObfuscatedName("al")
	public static int[] field2182;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	static SpritePixels[] field2185;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1908966999
	)
	public final int field2189;

	static {
		field2186 = new class200(0);
		field2179 = new class200(1);
		field2180 = new class200(2);
		field2181 = new class200(3);
		field2187 = new class200(4);
		field2183 = new class200(5);
		field2184 = new class200(6);
		field2182 = null;
	}

	class200(int var1) {
		this.field2189 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1466914116"
	)
	public static int method4401(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1541384446"
	)
	static int method4402(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-668822835"
	)
	public static byte[] method4403(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
