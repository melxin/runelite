import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
public class class563 {
	@ObfuscatedName("at")
	static final char[] field5780;
	@ObfuscatedName("ac")
	static final char[] field5782;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1353228377
	)
	static int field5778;
	@ObfuscatedName("fg")
	static boolean field5781;

	static {
		field5780 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field5782 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lwm;I)Lrw;",
		garbageValue = "2101182433"
	)
	public static Bounds method10884(WorldEntityCoord var0, class586 var1) {
		int var2 = var1.field5902;
		int var3 = var1.field5899;
		int var4 = var1.field5900;
		int var5 = var1.field5901;
		int var6 = var0.getCurrentRotationAngle();
		int var7 = var0.getX();
		int var8 = var0.getY();
		int var11 = class536.field5571[var6 & 2047];
		double var9 = (double)var11 / 65536.0D;
		double var13 = SequenceDefinition.method4817(var6);
		int var15 = (int)(var9 * (double)var2 - var13 * (double)var3);
		int var16 = (int)(var13 * (double)var2 + (double)var3 * var9);
		var7 += var15;
		var8 += var16;
		int var17 = (int)((double)var4 * var9 - var13 * (double)var5);
		int var18 = (int)((double)var5 * var9 + var13 * (double)var4);
		int var19 = (int)((double)var5 * var13 + var9 * (double)var4);
		int var20 = (int)((double)var5 * var9 - (double)var4 * var13);
		int var21 = var7 - var17;
		int var22 = var8 + var18;
		int var23 = var7 + var19;
		int var24 = var8 + var20;
		int var25 = var17 + var7;
		int var26 = var8 - var18;
		int var27 = var7 - var19;
		int var28 = var8 - var20;
		int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
		int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
		int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
		int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
		int var34 = var30 - var29 + 1;
		int var35 = var32 - var31 + 1;
		synchronized(Bounds.field5164) {
			Bounds var33;
			if (Bounds.field5161 == 0) {
				var33 = new Bounds(var29, var31, var34, var35);
			} else {
				--Bounds.field5161;
				Bounds.field5164[Bounds.field5161].setLow(var29, var31);
				Bounds.field5164[Bounds.field5161].setHigh(var34, var35);
				var33 = Bounds.field5164[Bounds.field5161];
			}

			return var33;
		}
	}
}
