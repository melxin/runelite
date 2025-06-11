import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("aj")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("an")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "29375"
	)
	static void method7912() {
		Tiles.Tiles_minPlane = 99;
		AuthenticationScheme.Tiles_underlays = new short[4][104][104];
		class31.Tiles_overlays = new short[4][104][104];
		User.Tiles_shapes = new byte[4][104][104];
		class518.field5341 = new byte[4][104][104];
		SecureRandomCallable.field862 = new int[4][105][105];
		class462.Tiles_underlays2 = new byte[4][105][105];
		Tiles.field846 = new int[105][105];
		class451.Tiles_hue = new int[104];
		WorldMapDecoration.Tiles_saturation = new int[104];
		GrandExchangeOfferNameComparator.Tiles_lightness = new int[104];
		GameEngine.Tiles_hueMultiplier = new int[104];
		World.field617 = new int[104];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lwu;",
		garbageValue = "1493520980"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5783, FillMode.SOLID, FillMode.field5780};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1378985189"
	)
	public static int method7913(int var0) {
		return class333.field3682[var0];
	}
}
