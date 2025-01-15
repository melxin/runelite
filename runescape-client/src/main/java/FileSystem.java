import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ay")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ah")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("az")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "74"
	)
	static int method4954(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			ObjectComposition var4 = class142.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
