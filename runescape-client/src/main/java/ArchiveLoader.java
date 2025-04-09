import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("pv")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2052018743
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 220117271
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7664(var1) || this.archive.method7639(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "-1298104059"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferNameComparator.field4771.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1992829917"
	)
	public static byte[] method2432(int var0) {
		return WorldMapIcon_1.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "16"
	)
	static int method2437(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			NPCComposition var6 = class232.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = class232.getNpcDefinition(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.method5184(var4);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.method5186(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class232.getNpcDefinition(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1311198736"
	)
	static final int method2433(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
