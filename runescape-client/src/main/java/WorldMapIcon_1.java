import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2021936591
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 932941725
	)
	@Export("element")
	int element;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1688612149
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 837717153
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;ILlc;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("init")
	void init() {
		this.element = AsyncHttpResponse.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class463.WorldMapElement_get(this.element));
		WorldMapElement var1 = class463.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;B)I",
		garbageValue = "-76"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			var8 = Sound.method4019(var10);
			var9 = Actor.standardizeChar(var9, var2);
			var10 = Actor.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class329.lowercaseChar(var9, var2) - class329.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var12)) {
				var18 = Character.toLowerCase(var18);
				var12 = Character.toLowerCase(var12);
				if (var18 != var12) {
					return class329.lowercaseChar(var18, var2) - class329.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var12 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var13 != var12) {
					return class329.lowercaseChar(var12, var2) - class329.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIISISIII)V",
		garbageValue = "-2034093454"
	)
	static void method6595(WorldView var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10) {
		NodeDeque var11 = var0.groundItems[var1][var2][var3];
		if (var11 != null) {
			for (TileItem var12 = (TileItem)var11.last(); var12 != null; var12 = (TileItem)var11.previous()) {
				if (var4 == var12.id && var5 == var12.quantity) {
					PlayerCompositionColorTextureOverride var13 = var12.method2905();
					if (var13 == null) {
						var13 = new PlayerCompositionColorTextureOverride(var4);
					}

					if (var13.method4243() && var7 > -1 && var7 < var13.playerCompositionRecolorTo.length) {
						var13.playerCompositionRecolorTo[var7] = var6;
					}

					if (var13.method4244() && var9 > -1 && var9 < var13.playerCompositionRetextureTo.length) {
						var13.playerCompositionRetextureTo[var9] = var8;
					}

					if (var10 > -1) {
						var13.field1940 = var10;
						var13.field1932 = null;
					}

					var12.method2906(var13);
					break;
				}
			}

			class157.updateItemPile(var1, var2, var3);
		}

	}
}
