import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3336;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3334;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3338;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static final WorldMapCacheName field3333;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3337;
	@ObfuscatedName("aq")
	@Export("name")
	public final String name;

	static {
		field3336 = new WorldMapCacheName("details");
		field3334 = new WorldMapCacheName("compositemap");
		field3338 = new WorldMapCacheName("compositetexture");
		field3333 = new WorldMapCacheName("area");
		field3337 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("av")
	static boolean method6410(long var0) {
		return (int)(var0 >>> 19 & 1L) == 1;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-139691399"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class333.updateItemPile2(DevicePcmPlayerProvider.worldView, var0, var1, var2);
	}
}
