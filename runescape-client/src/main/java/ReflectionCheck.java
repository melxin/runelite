import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1954190523
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1704967697
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 213130435
	)
	@Export("size")
	int size;
	@ObfuscatedName("ae")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("af")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("as")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aq")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("av")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("am")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;B)I",
		garbageValue = "-115"
	)
	static int method712(AbstractArchive var0) {
		int var1 = Login.field964.length + Login.field948.length;
		String[] var2 = Login.field965;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILti;Lpx;I)V",
		garbageValue = "1245571013"
	)
	static void method713(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}
}
