import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class class517 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V",
		garbageValue = "2016273975"
	)
	public static void method10310(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lti;II)V",
		garbageValue = "2133433682"
	)
	static void method10309(DynamicArray var0, int var1) {
		if (var1 < 0 || var1 >= var0.method10322()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1713952680"
	)
	static void method10312() {
		Script.Script_cached.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "2121835308"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class27.getNextWorldListWorld();
	}
}
