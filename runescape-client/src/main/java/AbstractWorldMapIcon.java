import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 477295627
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 359669139
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-11538"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Llj;",
		garbageValue = "-10265660"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-127"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1221967219"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-42"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-73154274"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "831884459"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = Canvas.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
				break;
			case 1:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-137458974"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-39"
	)
	static int method6353(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lcw;",
		garbageValue = "-710579982"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return GrandExchangeOfferNameComparator.getNextWorldListWorld();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F",
		garbageValue = "884566445"
	)
	public static float method6336(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var1 - var7) * (var4 - var3) + (var6 - var7) * (var0 - var4)) / var11;
		float var13 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var13 * var9 + var8 * var12 + var14 * var10;
	}
}
