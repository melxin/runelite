import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class259 {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive6")
	static Archive archive6;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lkd;",
		garbageValue = "21"
	)
	public static class265 method5905() {
		return class265.field3133;
	}

	@ObfuscatedName("nv")
	static final void method5906(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (DynamicObject.worldMap != null) {
			DynamicObject.worldMap.method10658();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		class36.clientPreferences.updateBrightness(var0);
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1580385136"
	)
	static void method5907() {
		if (ClanChannelMember.field1780 != null) {
			Client.field432 = Client.cycle;
			ClanChannelMember.field1780.method8538();
			Iterator var0 = class333.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				ClanChannelMember.field1780.method8548((var1.x >> 7) + class333.topLevelWorldView.baseX, (var1.y >> 7) + class333.topLevelWorldView.baseY);
			}
		}

	}
}
