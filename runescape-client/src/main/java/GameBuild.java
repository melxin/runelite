import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ae")
	@Export("name")
	public final String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1357192003
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

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lcr;B)V",
		garbageValue = "111"
	)
	static final void method8376(Actor var0) {
		boolean var1 = var0.field1057 == Client.cycle || !var0.method2484();
		if (!var1) {
			SequenceDefinition var2 = var0.animationSequence.getSequenceDefinition();
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.animationSequence.getFrameCycle() + 1 > var2.frameLengths[var0.animationSequence.getFrame()];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1057 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.size * -767295488 + var0.field1059 * 128;
			int var5 = var0.size * -767295488 + var0.field1061 * 128;
			int var6 = var0.size * -767295488 + var0.field1060 * 128;
			int var7 = var0.size * -767295488 + var0.field1062 * 128;
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8;
			var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8;
		}

		var0.field1074 = 0;
		var0.orientation = var0.field1021;
		var0.rotation = var0.orientation;
	}
}
