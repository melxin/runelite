import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class142 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1869948611
	)
	static int field1631;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "121870175"
	)
	static class145 method3513(int var0) {
		class145[] var1 = new class145[]{class145.field1652, class145.field1658, class145.field1649, class145.field1650, class145.field1651, class145.field1647, class145.field1648, class145.field1653, class145.field1655};
		class145 var2 = (class145)StructComposition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class145.field1655;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lkl;",
		garbageValue = "1781059216"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method3514() {
		if (Client.oculusOrbState == 1) {
			Client.field602 = true;
		}

	}
}
