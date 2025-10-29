import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class142 implements class133 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1683466465
	)
	public static int field1705;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1250506995
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 510143033
	)
	static int field1704;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;IB)Ljt;",
		garbageValue = "104"
	)
	public static Frames method3884(AbstractArchive var0, AbstractArchive var1, int var2) {
		boolean var3 = true;
		int var4 = -1;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var3 = false;
			} else if (var4 == -1) {
				var4 = (var7[0] & 255) << 8 | var7[1] & 255;
			}
		}

		if (var4 != -1) {
			byte[] var8 = var1.getFile(var4, 0);
			if (var8 == null) {
				var3 = false;
			}
		} else {
			var3 = false;
		}

		if (!var3) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFFLft;I)V",
		garbageValue = "1961066754"
	)
	static void method3886(float var0, float var1, float var2, float var3, class139 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1659 = var7 - var6 - var8;
		var4.field1658 = var8 + var8 + var8;
		var4.field1657 = var5 + var5 + var5;
		var4.field1655 = var0;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-240032281"
	)
	static boolean method3885(int var0) {
		for (int var1 = 0; var1 < Client.field405; ++var1) {
			if (Client.field407[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
