import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -879570211
	)
	@Export("element")
	final int element;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -402581373
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -231451761
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;ILlv;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class463.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1022817339"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Llv;",
		garbageValue = "118"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1815290607"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-184663833"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Loe;IS)Loe;",
		garbageValue = "11712"
	)
	public static WidgetConfigNode method6921(WidgetConfigNode var0, int var1) {
		for (WidgetConfigNode var2 = var0; var2 != null; var2 = var2.nextWidgetConfigNode) {
			if (var1 >= var2.start && var1 <= var2.end) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1706559695"
	)
	static void method6932(int var0, int var1, int var2, int var3, int var4, int var5) {
		SpriteMask.method7659(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5);
	}
}
