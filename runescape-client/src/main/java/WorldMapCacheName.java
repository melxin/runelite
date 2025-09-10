import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final WorldMapCacheName field3498;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final WorldMapCacheName field3494;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final WorldMapCacheName field3495;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final WorldMapCacheName field3501;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final WorldMapCacheName field3497;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 753195445
	)
	static int field3500;
	@ObfuscatedName("aq")
	@Export("name")
	public final String name;

	static {
		field3498 = new WorldMapCacheName("details");
		field3494 = new WorldMapCacheName("compositemap");
		field3495 = new WorldMapCacheName("compositetexture");
		field3501 = new WorldMapCacheName("area");
		field3497 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-273544819"
	)
	static void method6895(int var0, int var1, int var2, int var3, int var4) {
		ArchiveLoader.method2091(HttpHeaders.worldView, var0, var1, var2, var3, var4);
	}
}
