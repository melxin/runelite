import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class89 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1271;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1258;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1259;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1260;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1262;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1265;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1263;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1264;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1266;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1257;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1267;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1268;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1269;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("field1390")
	static final class89 field1390;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1261;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class89 field1272;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 29795963
	)
	int field1273;

	static {
		field1271 = new class89(0);
		field1258 = new class89(1);
		field1259 = new class89(2);
		field1260 = new class89(3);
		field1262 = new class89(4);
		field1265 = new class89(5);
		field1263 = new class89(6);
		field1264 = new class89(7);
		field1266 = new class89(8);
		field1257 = new class89(9);
		field1267 = new class89(10);
		field1268 = new class89(11);
		field1269 = new class89(12);
		field1390 = new class89(13);
		field1261 = new class89(14);
		field1272 = new class89(15);
	}

	class89(int var1) {
		this.field1273 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lxt;",
		garbageValue = "10"
	)
	static SpritePixels method2878(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(RouteStrategy.method6239(var0, var1, var2));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-954950307"
	)
	static final boolean method2879() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)V",
		garbageValue = "1853994895"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field450) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
