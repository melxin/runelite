import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1554100419
	)
	@Export("element")
	final int element;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1573211953
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -584619463
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Lnp;ILlp;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = InvDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2005636344"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "111016802"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-963913416"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-341446402"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1658243407"
	)
	public static int method6537(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-60"
	)
	public static int method6523(int var0, int var1, int var2) {
		int var3 = Skills.method7913(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
