import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public final class class456 {
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ab")
	final Object field5256;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 52939655
	)
	int field5258;

	class456(Object var1, int var2) {
		this.field5256 = var1;
		this.field5258 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcj;",
		garbageValue = "-88"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class142.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class203.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
