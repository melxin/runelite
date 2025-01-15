import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	public static final WorldMapCacheName field3264;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	public static final WorldMapCacheName field3269;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	public static final WorldMapCacheName field3265;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final WorldMapCacheName field3263;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	public static final WorldMapCacheName field3267;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static Bounds field3266;
	@ObfuscatedName("jc")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("an")
	@Export("name")
	public final String name;

	static {
		field3264 = new WorldMapCacheName("details");
		field3269 = new WorldMapCacheName("compositemap");
		field3265 = new WorldMapCacheName("compositetexture");
		field3263 = new WorldMapCacheName("area");
		field3267 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-34"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)I",
		garbageValue = "8"
	)
	static int method6467(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var0.method7548(var1);
			return 1;
		}
	}
}
