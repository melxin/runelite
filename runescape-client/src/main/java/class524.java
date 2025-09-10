import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public enum class524 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5541(2, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5540(3, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5542(0, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5543(1, 10);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -758135483
	)
	final int field5544;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1429021695
	)
	final int field5545;

	class524(int var3, int var4) {
		this.field5544 = var3;
		this.field5545 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5545;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-1419301039"
	)
	public static KitDefinition method10438(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
