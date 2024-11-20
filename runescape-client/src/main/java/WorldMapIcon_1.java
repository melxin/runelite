import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -544919021
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2082000839
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -754717387
	)
	@Export("element")
	int element;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1522079287
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 108468131
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lny;Lny;ILkd;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "379300209"
	)
	@Export("init")
	void init() {
		this.element = HttpMethod.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(Tiles.WorldMapElement_get(this.element));
		WorldMapElement var1 = Tiles.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292003718"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lln;",
		garbageValue = "1"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901376317"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1893194548"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
