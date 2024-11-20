import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class179 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-94"
	)
	public static byte[] method3746(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? WorldMapSectionType.method6188(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2146746486"
	)
	public static int method3750(int var0) {
		return var0 >>> 4 & class550.field5419;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method3749() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
			var2.setLenient(false);
			StringBuilder var3 = new StringBuilder();
			String[] var4 = Login.field948;
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5];
					if (var6 != null) {
						var3.append(var6);
						++var5;
						continue;
					}

					WorldMapArea.method5906("Date not valid.", "Please ensure all characters are populated.", "");
					var1 = null;
				} else {
					var3.append("12");
					var1 = var2.parse(var3.toString());
				}

				var0 = var1;
				break;
			}
		} catch (ParseException var10) {
			WorldMapArea.method5906("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var7 = GraphicsObject.method2251(var0);
			Date var11 = class1.method12();
			boolean var8 = var0.after(var11);
			if (!var8) {
				WorldMapArea.method5906("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var7) {
					AttackOption.field1381 = 8388607;
				} else {
					AttackOption.field1381 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}
}
