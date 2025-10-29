import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1140033983
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1188087065
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lqn;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-33"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method8542(var1) || this.archive.method8541(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbu;",
		garbageValue = "0"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	static final int method2155() {
		if (class468.clientPreferences.isRoofsHidden()) {
			return Occluder.topLevelWorldView.plane;
		} else {
			int var0 = SpriteBufferProperties.cameraX >> 7;
			int var1 = class528.cameraZ >> 7;
			if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
				int var2 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, SpriteBufferProperties.cameraX, class528.cameraZ, Occluder.topLevelWorldView.plane);
				return var2 - ScriptFrame.cameraY < 800 && (Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var0][var1] & 4) != 0 ? Occluder.topLevelWorldView.plane : 3;
			} else {
				return Occluder.topLevelWorldView.plane;
			}
		}
	}
}
