import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("al")
	@Export("name")
	public final String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1227870063
	)
	@Export("buildId")
	public final int buildId;

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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lrv;",
		garbageValue = "-1376096067"
	)
	public static Bounds method7927(int var0, int var1, int var2, int var3) {
		synchronized(Bounds.field4953) {
			if (Bounds.field4954 == 0) {
				return new Bounds(var0, var1, var2, var3);
			} else {
				--Bounds.field4954;
				Bounds.field4953[Bounds.field4954].setLow(var0, var1);
				Bounds.field4953[Bounds.field4954].setHigh(var2, var3);
				return Bounds.field4953[Bounds.field4954];
			}
		}
	}
}
