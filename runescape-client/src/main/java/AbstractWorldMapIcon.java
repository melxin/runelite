import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1414655745
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1232753195
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lny;Lny;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292003718"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lln;",
		garbageValue = "1"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901376317"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1893194548"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-419453436"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1813651259"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-20"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = Tiles.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1980179855"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIZI)V",
		garbageValue = "1301344815"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = (var1 - var0.rawWidth);
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1 >> 14);
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight);
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14);
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field3878 / var0.field3879;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field3879 / var0.field3878;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7284().method6984(var0.width, var0.height);
		}

		if (var3 && var0.onResize != null && (var0.width != var4 || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
