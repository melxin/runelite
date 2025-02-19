import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -862602241
	)
	final int field3156;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 750872157
	)
	final int field3157;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 252699579
	)
	final int field3160;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3156 = var1;
		this.field3157 = var2;
		this.field3160 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-1486777292"
	)
	boolean method5860(float var1) {
		return var1 >= (float)this.field3160;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lks;",
		garbageValue = "-1668935928"
	)
	static WorldMapLabelSize[] method5863() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium};
	}
}
