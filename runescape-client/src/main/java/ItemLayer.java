import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1432977343
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -279066337
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1950426147
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 3036212681244980719L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 314893951
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "2102457966"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
