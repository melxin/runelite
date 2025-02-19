import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ah")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1402378187
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -795675999
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -26992829
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Lrp;",
		garbageValue = "84"
	)
	public static class442 method6284(class442 var0) {
		synchronized(class442.field4894) {
			if (class187.field1997 == 0) {
				return new class442(var0);
			} else {
				class442.field4894[--class187.field1997].method8309(var0);
				return class442.field4894[class187.field1997];
			}
		}
	}
}
