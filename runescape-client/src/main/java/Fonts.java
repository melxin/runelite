import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("at")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lub;B)Ljava/util/HashMap;",
		garbageValue = "-94"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				Font var6;
				if (!var7.isValidFileName(var9, "")) {
					var6 = null;
				} else {
					int var10 = var7.getGroupId(var9);
					int var11 = var7.getFileId(var10, "");
					var6 = class166.method3637(var7, var8, var10, var11);
				}

				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;Ljava/lang/String;B)Lvy;",
		garbageValue = "-123"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class326.method6471(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = SecureRandomCallable.method2433();
			}

			return var5;
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Ljava/lang/String;",
		garbageValue = "49324"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class202.Widget_unpackTargetMask(Renderable.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
