import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1324198157
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1918705007
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Lnp;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2005636344"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "111016802"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-963913416"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-341446402"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1220021426"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1236044011"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "80"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = InvDefinition.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-102006893"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "128598371"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
