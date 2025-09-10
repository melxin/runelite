import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -51663707
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1381594615
	)
	@Export("element")
	int element;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2074827413
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -696966113
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;ILlb;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("init")
	void init() {
		this.element = ModeWhere.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(VerticalAlignment.WorldMapElement_get(this.element));
		WorldMapElement var1 = VerticalAlignment.WorldMapElement_get(this.getElement());
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
		garbageValue = "-1313098329"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1635642188"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1852373606"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)[Lme;",
		garbageValue = "1259"
	)
	public static class328[] method6393() {
		return new class328[]{class328.field3643, class328.field3644, class328.field3645, class328.field3646, class328.field3647, class328.field3648, class328.field3655, class328.field3649, class328.field3650, class328.field3652, class328.field3653, class328.field3654, class328.field3651};
	}
}
