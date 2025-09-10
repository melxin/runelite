import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -945635161
	)
	@Export("element")
	final int element;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -301118169
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2084315803
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;ILls;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = VerticalAlignment.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
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

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "916887222"
	)
	static void method6747() {
		Client.field348 = Client.localPlayerIndex;
		class4.field7 = class384.USERNAME_PASSWORD;
		Client.field347 = -1;
	}
}
