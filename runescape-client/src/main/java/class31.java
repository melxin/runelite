import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class31 {
	@ObfuscatedName("as")
	public static Applet field136;
	@ObfuscatedName("aq")
	public static String field137;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -2079809159
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field136 = null;
		field137 = "";
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1174795376"
	)
	static final void method474(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (float)var0 / 200.0F + 0.5F;
		Rasterizer3D.buildPalette((double)var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness((double)var1);
		if (GameBuild.worldMap != null) {
			GameBuild.worldMap.method9818();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		Renderable.clientPreferences.updateBrightness((double)var1);
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lnh;B)I",
		garbageValue = "-17"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)(var0.childIndex * -1626125685));
		return var1 != null ? var1.integer : var0.flags;
	}
}
