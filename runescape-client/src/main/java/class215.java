import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class215 extends class230 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -776772319
	)
	int field2395;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lix;Ljava/lang/String;I)V"
	)
	class215(class227 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2395 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-112"
	)
	public int vmethod4622() {
		return 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1526672975"
	)
	public int vmethod4616() {
		return this.field2395;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILhy;B)Lqn;",
		garbageValue = "-52"
	)
	public static Bounds method4379(int var0, int var1, int var2, class200 var3) {
		int var4 = var3.method4033();
		int var5 = var3.method4038();
		int var6 = var3.method4047() / 2;
		int var7 = var3.method4051() / 2;
		double var8 = (double)class204.method4072(var2) / 65536.0D;
		int var14 = class520.field5274[var2 & 2047];
		double var12 = (double)var14 / 65536.0D;
		int var16 = (int)(var8 * (double)var4 - var12 * (double)var5);
		int var17 = (int)((double)var4 * var12 + var8 * (double)var5);
		var0 += var16;
		var1 += var17;
		int var18 = (int)((double)var6 * var8 - (double)var7 * var12);
		int var19 = (int)((double)var7 * var8 + var12 * (double)var6);
		int var20 = (int)((double)var7 * var12 + (double)var6 * var8);
		int var21 = (int)((double)var7 * var8 - (double)var6 * var12);
		int var22 = var0 - var18;
		int var23 = var19 + var1;
		int var24 = var0 + var20;
		int var25 = var21 + var1;
		int var26 = var0 + var18;
		int var27 = var1 - var19;
		int var28 = var0 - var20;
		int var29 = var1 - var21;
		int var30 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
		int var31 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
		int var32 = Math.min(var23, Math.min(var25, Math.min(var27, var29)));
		int var33 = Math.max(var23, Math.max(var25, Math.max(var27, var29)));
		int var35 = var31 - var30 + 1;
		int var36 = var33 - var32 + 1;
		synchronized(Bounds.field4888) {
			Bounds var34;
			if (class346.field3798 == 0) {
				var34 = new Bounds(var30, var32, var35, var36);
			} else {
				--class346.field3798;
				Bounds.field4888[class346.field3798].setLow(var30, var32);
				Bounds.field4888[class346.field3798].setHigh(var35, var36);
				var34 = Bounds.field4888[class346.field3798];
			}

			return var34;
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lcg;I)V",
		garbageValue = "2118841791"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (ModelData0.loginState != var0) {
			ModelData0.loginState = var0;
		}
	}
}
