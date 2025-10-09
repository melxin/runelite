import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class275 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3252;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3241;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3242;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3243;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3244;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3245;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class275 field3246;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	static final class275[] field3248;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 414728357
	)
	final int field3240;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1362288185
	)
	final int field3249;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -91492065
	)
	final int field3250;

	static {
		field3252 = new class275(3, 8, 8);
		field3241 = new class275(0, 16, 16);
		field3242 = new class275(5, 32, 32);
		field3243 = new class275(6, 48, 48);
		field3244 = new class275(2, 64, 64);
		field3245 = new class275(4, 96, 96);
		field3246 = new class275(1, 128, 128);
		class275[] var0 = new class275[]{field3241, field3246, field3244, field3252, field3245, field3242, field3243};
		field3248 = var0;
		Arrays.sort(field3248, new class282());
	}

	class275(int var1, int var2, int var3) {
		this.field3240 = var1;
		this.field3249 = var2;
		this.field3250 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	int method6239() {
		return this.field3250 * this.field3249;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "-996668065"
	)
	public static VarbitComposition method6241(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	public static void method6237() {
		class202.field2230.clear();
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(II)Lwa;",
		garbageValue = "-950588724"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(WorldMapSprite.field3462, Actor.method2548(var0), GrandExchangeOfferOwnWorldComparator.method791(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
