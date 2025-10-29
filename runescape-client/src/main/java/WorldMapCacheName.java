import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final WorldMapCacheName field3532;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final WorldMapCacheName field3535;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final WorldMapCacheName field3531;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final WorldMapCacheName field3533;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final WorldMapCacheName field3534;
	@ObfuscatedName("aj")
	@Export("name")
	public final String name;

	static {
		field3532 = new WorldMapCacheName("details");
		field3535 = new WorldMapCacheName("compositemap");
		field3531 = new WorldMapCacheName("compositetexture");
		field3533 = new WorldMapCacheName("area");
		field3534 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-604505976"
	)
	public static boolean method7092(int var0) {
		return (var0 >> 22 & 1) != 0;
	}
}
