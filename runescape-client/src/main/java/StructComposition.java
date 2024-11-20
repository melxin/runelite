import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-1230389645"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "14"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class28.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1155242429"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1876346291"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return AsyncRestClient.method162(this.params, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "60"
	)
	public static void method4069(int var0, int var1, int var2, int var3) {
		class333.musicPlayerStatus = var0;
		class333.field3630 = var1;
		class333.field3622 = var2;
		class333.field3632 = var3;
	}
}
