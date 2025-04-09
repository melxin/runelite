import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 8730349907772508289L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1281443653
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1455183137
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -161025593
	)
	@Export("z")
	int z;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -641925033
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 690451417
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -384087039
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 728270709
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -999754695
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 77909563
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 414315947
	)
	int field2389;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2139496603
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1690867509
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "37"
	)
	static final void method4700(String var0) {
		ClanSettings.method3631(var0 + " is already on your ignore list");
	}
}
