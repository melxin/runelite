import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	static StudioGame field2749;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2746;
	@ObfuscatedName("jw")
	static int[] field2742;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1529643123"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "5"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1848014011"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class1.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "7"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Canvas.method336(this.params, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-634217919"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class47.method906(this.params, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Lpd;II)Lpd;",
		garbageValue = "-1909362778"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
