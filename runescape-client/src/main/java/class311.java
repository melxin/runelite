import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public abstract class class311 implements class313 {
	@ObfuscatedName("fv")
	static boolean field3348;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1850309007
	)
	protected int field3347;

	@ObfuscatedSignature(
		descriptor = "(Lon;Lqt;I)V"
	)
	protected class311(StudioGame var1, Language var2, int var3) {
		this.field3347 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltp;I)I",
		garbageValue = "1841229055"
	)
	public static int method6762(class509 var0) {
		class377.method7917(var0);
		byte var1 = 0;
		int var2 = var0.method9937();
		int var3 = -1;
		int var8;
		if (var0.field5288 == class563.field5600) {
			int[] var4 = var0.method9965();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] > var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5288 == class563.field5594) {
			long[] var9 = var0.method9973();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] > var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5288 == class563.field5595) {
			String var10 = null;
			Object[] var5 = var0.method9936();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) > 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1534634605"
	)
	static final void method6763() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			class525.method10146(var1);
		}

	}
}
