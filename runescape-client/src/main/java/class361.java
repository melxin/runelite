import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class361 {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 168218257
	)
	public int field3885;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1420984831
	)
	public int field3883;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2064503183
	)
	public int field3886;

	class361() {
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(II)Lvu;",
		garbageValue = "-1158963920"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AbstractByteArrayCopier.field3837, class393.method7981(var0), Projectile.method1944(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
