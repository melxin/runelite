import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static class381 field1571;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1818481597
	)
	static int field1574;
	@ObfuscatedName("ov")
	static SecureRandom field1570;
	@ObfuscatedName("al")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lto;Lto;I)I",
		garbageValue = "1261538368"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lir;",
		garbageValue = "-1507471743"
	)
	public static HitSplatDefinition method3550(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2087899454"
	)
	static int method3551(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static final void method3548() {
		if (Client.field555 != class7.topLevelWorldView.plane) {
			Client.field555 = class7.topLevelWorldView.plane;
			int var0 = class7.topLevelWorldView.plane;
			int[] var1 = Script.sceneMinimapSprite.pixels;
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
					if ((class7.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
						class7.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (class7.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
						class7.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4;
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			Script.sceneMinimapSprite.setRaster();

			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((class7.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
						UrlRequester.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (class7.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
						UrlRequester.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0;

			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = class7.topLevelWorldView.scene.getFloorDecorationTag(class7.topLevelWorldView.plane, var5, var6);
					if (0L != var7) {
						int var9 = class70.Entity_unpackID(var7);
						int var10 = SpriteMask.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0 && GrandExchangeOfferAgeComparator.WorldMapElement_get(var10).field1967) {
							Client.mapIcons[Client.mapIconCount] = GrandExchangeOfferAgeComparator.WorldMapElement_get(var10).getSpriteBool(false);
							Client.changedSkills[Client.mapIconCount] = var5;
							Client.field558[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}

			Interpreter.rasterProvider.apply();
		}

	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)V",
		garbageValue = "-1957028796"
	)
	static final void method3549(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field468 == -1) {
				Client.field468 = var0.spriteId2;
				Client.field577 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field468;
			} else {
				var0.spriteId2 = Client.field577;
			}

		} else if (var1 == 325) {
			if (Client.field468 == -1) {
				Client.field468 = var0.spriteId2;
				Client.field577 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field577;
			} else {
				var0.spriteId2 = Client.field468;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
