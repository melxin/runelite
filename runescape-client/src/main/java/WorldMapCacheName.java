import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final WorldMapCacheName field3410;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final WorldMapCacheName field3411;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final WorldMapCacheName field3407;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static final WorldMapCacheName field3408;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final WorldMapCacheName field3409;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -562752735
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;

	static {
		field3410 = new WorldMapCacheName("details");
		field3411 = new WorldMapCacheName("compositemap");
		field3407 = new WorldMapCacheName("compositetexture");
		field3408 = new WorldMapCacheName("area");
		field3409 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(Lch;ZB)V",
		garbageValue = "-1"
	)
	static final void method6881(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.vmethod10593();
		if (var1) {
			class167.widgetDefinition.method7460(var2);
		}

		for (class357 var4 = (class357)Client.field417.first(); var4 != null; var4 = (class357)Client.field417.next()) {
			if ((long)var2 == (var4.key >> 16 & 65535L)) {
				var4.vmethod10593();
			}
		}

		Widget var5 = class167.widgetDefinition.method7456(var3);
		if (var5 != null) {
			ApproximateRouteStrategy.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			HttpResponse.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
