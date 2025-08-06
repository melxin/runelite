import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("nv")
	static boolean field3231;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1808346777
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1729067567
	)
	@Export("element")
	int element;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 217010977
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2014443095
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lng;Lng;ILlc;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1970229818"
	)
	@Export("init")
	void init() {
		this.element = SpriteMask.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(GrandExchangeOfferAgeComparator.WorldMapElement_get(this.element));
		WorldMapElement var1 = GrandExchangeOfferAgeComparator.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "43009635"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "9"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1977770397"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxh;",
		garbageValue = "339110765"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5899, FillMode.field5897, FillMode.SOLID};
	}
}
