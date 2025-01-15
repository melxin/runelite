import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1352700713
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2131429413
	)
	@Export("element")
	int element;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 441142667
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -575586641
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;ILki;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	@Export("init")
	void init() {
		this.element = class142.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class31.WorldMapElement_get(this.element));
		WorldMapElement var1 = class31.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "468922444"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lli;",
		garbageValue = "24"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1283952551"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1685687159"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
