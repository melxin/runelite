import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 427380359
	)
	@Export("group")
	int group;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1808680689
	)
	@Export("type")
	int type;
	@ObfuscatedName("ae")
	boolean field1077;

	InterfaceParent() {
		this.field1077 = false;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(II)Lvm;",
		garbageValue = "1227626412"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class171.field1872, UserComparator6.method3255(var0), class256.method5325(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
