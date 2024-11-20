import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2044(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2043(2, 2);

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 94294007
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 802501761
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I[B[BI)V",
		garbageValue = "1255806932"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3941 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3941 = new byte[11][];
			var0.field3942 = new byte[11][];
			var0.field3943 = new int[11];
			var0.field3944 = new int[11];
		}

		var0.field3941[var1] = var2;
		if (var2 != null) {
			var0.field3940 = true;
		} else {
			var0.field3940 = false;

			for (int var4 = 0; var4 < var0.field3941.length; ++var4) {
				if (var0.field3941[var4] != null) {
					var0.field3940 = true;
					break;
				}
			}
		}

		var0.field3942[var1] = var3;
	}
}
