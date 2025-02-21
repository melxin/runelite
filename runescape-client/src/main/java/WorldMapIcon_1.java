import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -739608175
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -166072865
	)
	@Export("element")
	int element;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -168066729
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 956040501
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;ILlk;)V"
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
		garbageValue = "-1950070476"
	)
	@Export("init")
	void init() {
		this.element = class177.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(Canvas.WorldMapElement_get(this.element));
		WorldMapElement var1 = Canvas.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-11538"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Llj;",
		garbageValue = "-10265660"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-127"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1221967219"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILit;IB)V",
		garbageValue = "-90"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 16384;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field855 = var3.int7 * 16384;
		var5.field856 = Math.max(var3.int8 * 128 - 128, 0);
		var5.field863 = var3.int5;
		var5.field860 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field859 = var5.field863 + (int)(Math.random() * (double)(var5.field860 - var5.field863));
		}

	}
}
