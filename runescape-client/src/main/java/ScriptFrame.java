import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	Script field448;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 187401251
	)
	int field449;
	@ObfuscatedName("ae")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("af")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.field449 = -1;
	}

	@ObfuscatedName("ao")
	public static int method1191(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;ZI)V",
		garbageValue = "-1284364629"
	)
	public static void method1192(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		class154.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-201478541"
	)
	static void method1190(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
