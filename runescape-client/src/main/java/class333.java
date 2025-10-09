import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public final class class333 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -9205144743388651051L
	)
	static long field3842;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -4656341478693028815L
	)
	static long field3841;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvt;B)I",
		garbageValue = "35"
	)
	static final int method7072(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5840) {
			case 4:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("ab")
	public static int method7074(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(256.0D * var3);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1967352087"
	)
	public static void method7075(int var0) {
		Varps.Varps_temp = new int[var0];
		Varps.Varps_main = new int[var0];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2137089095"
	)
	static final void method7076() {
		Frames.method5459("Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-279878845"
	)
	static void method7077(String var0) {
		HttpAuthenticationHeader.field5389 = var0;
	}
}
