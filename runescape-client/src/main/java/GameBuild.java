import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = -1069164939
	)
	static int field4198;
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 250730267
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1093681776"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
