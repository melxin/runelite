import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1142290253
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1891308037
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1313098329"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1635642188"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1852373606"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1791929685"
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
		garbageValue = "1436979369"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1299692522"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = VerticalAlignment.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
				break;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
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
		garbageValue = "1058781978"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lti;Ljava/lang/Object;III)I",
		garbageValue = "2147483647"
	)
	public static int method6894(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10322()) {
			var3 = var0.method10322();
		}

		int var5;
		if (var0.field5504 == class574.field5820) {
			int[] var11 = var0.method10318();
			var5 = (Integer)var1;

			for (int var6 = var2; var6 < var3; ++var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5504 == class574.field5816) {
			long[] var10 = var0.method10320();
			long var8 = (Long)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var10[var7] == var8) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10321();

			for (var5 = var2; var5 < var3; ++var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}
}
