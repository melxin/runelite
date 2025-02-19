import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3340;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3336;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3338;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static final WorldMapCacheName field3337;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3339;
	@ObfuscatedName("ac")
	@Export("name")
	public final String name;

	static {
		field3340 = new WorldMapCacheName("details");
		field3336 = new WorldMapCacheName("compositemap");
		field3338 = new WorldMapCacheName("compositetexture");
		field3337 = new WorldMapCacheName("area");
		field3339 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-673049827"
	)
	public static int method6355(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
