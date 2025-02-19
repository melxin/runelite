import java.io.File;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ad")
	static File field2430;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive13")
	static Archive archive13;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2104584816"
	)
	public static void method4478(int var0, int var1) {
		Iterator var2 = class335.field3691.iterator();

		while (var2.hasNext()) {
			class341 var3 = (class341)var2.next();
			var3.vmethod6792(var0, var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-860236379"
	)
	static int method4474(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			ObjectComposition var4 = class177.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
