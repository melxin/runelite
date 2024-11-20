import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final WorldMapCacheName field3272;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final WorldMapCacheName field3271;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final WorldMapCacheName field3265;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final WorldMapCacheName field3266;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final WorldMapCacheName field3267;
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ac")
	@Export("name")
	public final String name;

	static {
		field3272 = new WorldMapCacheName("details");
		field3271 = new WorldMapCacheName("compositemap");
		field3265 = new WorldMapCacheName("compositetexture");
		field3266 = new WorldMapCacheName("area");
		field3267 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
