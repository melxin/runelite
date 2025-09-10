import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ax")
	static String[] field4411;
	@ObfuscatedName("ap")
	@Export("name")
	public final String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1209641847
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
}
