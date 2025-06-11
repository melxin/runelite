import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class225 extends class231 {
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field2457;
	@ObfuscatedName("ap")
	String field2460;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	final class228 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lio;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class225(class228 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2460 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1702909446"
	)
	public int vmethod4851() {
		return 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1383799233"
	)
	public String vmethod4852() {
		return this.field2460;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ltp;I)I",
		garbageValue = "-514255612"
	)
	public static int method4751(class509 var0, class509 var1) {
		if (var1 == var0) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var2 = var0.method9937();
			int var3 = var1.method9937();
			int var4 = Math.min(var2, var3);
			int var7;
			if (var0.field5288 == class563.field5600 && class563.field5600 == var1.field5288) {
				int[] var10 = var0.method9965();
				int[] var12 = var1.method9965();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var10[var7] < var12[var7]) {
						return -1;
					}

					if (var10[var7] > var12[var7]) {
						return 1;
					}
				}
			} else if (var0.field5288 == class563.field5594 && class563.field5594 == var1.field5288) {
				long[] var9 = var0.method9973();
				long[] var11 = var1.method9973();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var9[var7] < var11[var7]) {
						return -1;
					}

					if (var9[var7] > var11[var7]) {
						return 1;
					}
				}
			} else {
				if (var0.field5288 != class563.field5595 || class563.field5595 != var1.field5288) {
					throw new RuntimeException();
				}

				Object[] var5 = var0.method9936();
				Object[] var6 = var1.method9936();

				for (var7 = 0; var7 < var4; ++var7) {
					int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
					if (var8 < 0) {
						return -1;
					}

					if (var8 > 0) {
						return 1;
					}
				}
			}

			return var2 < var3 ? -1 : (var3 == var2 ? 0 : 1);
		}
	}
}
