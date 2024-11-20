import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public abstract class class309 implements class311 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static IndexedSprite field3285;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 280580751
	)
	protected int field3286;

	@ObfuscatedSignature(
		descriptor = "(Loc;Lpw;I)V"
	)
	protected class309(StudioGame var1, Language var2, int var3) {
		this.field3286 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "390545817"
	)
	public static class427 method6386() {
		synchronized(class427.field4768) {
			if (class427.field4769 == 0) {
				return new class427();
			} else {
				class427.field4768[--class427.field4769].method8180();
				return class427.field4768[class427.field4769];
			}
		}
	}
}
