import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1278167567
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1278625025
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 703195807
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -310039813
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1679656779
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ao")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1399560353
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	PlayerCompositionColorTextureOverride field1220;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2147164729"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1995670392"
	)
	boolean method2820(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-1879635116"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = AttackOption.ItemDefinition_get(this.id);
		return this.field1220 == null ? var1.getModel(this.quantity) : var1.method4662(this.field1220);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "-595082567"
	)
	PlayerCompositionColorTextureOverride method2805() {
		return this.field1220;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "-84"
	)
	void method2812(PlayerCompositionColorTextureOverride var1) {
		this.field1220 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-96"
	)
	void method2818() {
		this.field1220 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;",
		garbageValue = "1446240292"
	)
	public static String method2824(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = (CharSequence)var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = (CharSequence)var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = (CharSequence)var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcg;",
		garbageValue = "19"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class334.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class334.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class137.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "123"
	)
	static final void method2823(int var0) {
		int[] var1 = SceneTilePaint.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((class333.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					class333.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (class333.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					class333.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		SceneTilePaint.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((class333.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					class27.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (class333.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					class27.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = class333.topLevelWorldView.scene.getFloorDecorationTag(class333.topLevelWorldView.plane, var5, var6);
				if (var7 != 0L) {
					int var9 = class537.Entity_unpackID(var7);
					int var10 = ModeWhere.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && VerticalAlignment.WorldMapElement_get(var10).field2000) {
						Client.mapIcons[Client.mapIconCount] = VerticalAlignment.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		GameEngine.rasterProvider.apply();
	}
}
