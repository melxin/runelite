import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class229 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class229 field2501;
	@ObfuscatedName("ay")
	Map field2505;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1303688785
	)
	int field2502;

	static {
		field2501 = new class229();
	}

	class229() {
		this.field2505 = new HashMap();
		this.field2502 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILec;B)V",
		garbageValue = "54"
	)
	void method4595(JSONObject var1, int var2, UrlRequester var3) {
		this.field2505.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2502 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4602(var4.getJSONArray("crmcomponents"), this.field2502, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILec;I)V",
		garbageValue = "1939167426"
	)
	void method4602(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class227 var7 = new class227();

						try {
							var7.method4556(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2484.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2505.put(var8, var7);
						}
					}
				}
			}

			this.field2505 = this.method4596();
			InterfaceParent.method2434();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "2140150504"
	)
	Map method4596() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2505.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class227)((Entry)var2.get(var7)).getValue()).method4574() > ((class227)((Entry)var2.get(var7 + 1)).getValue()).method4574()) {
					Entry var4 = (Entry)var2.get(var7);
					var2.set(var7, var2.get(var7 + 1));
					var2.set(var7 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var5 = var2.iterator();

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lix;",
		garbageValue = "713410514"
	)
	class227 method4597(String var1) {
		return (class227)this.field2505.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "21869"
	)
	public static boolean method4611(int var0) {
		return var0 >= WorldMapDecorationType.field4136.id && var0 <= WorldMapDecorationType.field4137.id;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1662966852"
	)
	static final void method4610(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lnz;IIII)V",
		garbageValue = "186189218"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		UrlRequester.method3151();
		SpriteMask var4 = var0.method7308(class376.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field647 / 32 + 48;
				int var7 = 464 - Client.field532 / 32;
				MidiRequest.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var37;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var37 = Client.mapIconXs[var8] * 4 + 2 - Client.field647 / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - Client.field532 / 32;
					ClanChannelMember.drawSpriteOnMinimap(var1, var2, var37, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var37 = 0; var37 < 104; ++var37) {
						NodeDeque var27 = class200.topLevelWorldView.groundItems[class200.topLevelWorldView.plane][var8][var37];
						if (var27 != null) {
							var11 = var8 * 4 + 2 - Client.field647 / 32;
							var12 = var37 * 4 + 2 - Client.field532 / 32;
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var11, var12, class27.field124[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class200.topLevelWorldView.field1355.method9005(); ++var8) {
					NPC var9 = (NPC)class200.topLevelWorldView.npcs.get((long)class200.topLevelWorldView.field1355.method9007(var8));
					if (var9 != null && var9.isVisible()) {
						NPCComposition var41 = var9.definition;
						if (var41 != null && var41.transforms != null) {
							var41 = var41.transform();
						}

						if (var41 != null && var41.drawMapDot && var41.isInteractable) {
							var11 = var9.x / 32 - Client.field647 / 32;
							var12 = var9.y / 32 - Client.field532 / 32;
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var11, var12, class27.field124[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var38 = Client.playerUpdateManager.playerIndices;

				int var13;
				for (var10 = 0; var10 < var8; ++var10) {
					Player var36 = (Player)class200.topLevelWorldView.players.get((long)var38[var10]);
					if (var36 != null && var36.isVisible() && !var36.isHidden && var36 != class132.localPlayer) {
						var12 = var36.x / 32 - Client.field647 / 32;
						var13 = var36.y / 32 - Client.field532 / 32;
						if (var36.isFriend()) {
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var12, var13, class27.field124[3], var4);
						} else if (class132.localPlayer.team != 0 && var36.team != 0 && var36.team == class132.localPlayer.team) {
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var12, var13, class27.field124[4], var4);
						} else if (var36.isFriendsChatMember()) {
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var12, var13, class27.field124[5], var4);
						} else if (var36.isClanMember()) {
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var12, var13, class27.field124[6], var4);
						} else {
							ClanChannelMember.drawSpriteOnMinimap(var1, var2, var12, var13, class27.field124[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0) {
						NPC var42 = (NPC)class200.topLevelWorldView.npcs.get((long)Client.hintArrowNpcIndex);
						if (var42 != null) {
							var11 = var42.x / 32 - Client.field647 / 32;
							var12 = var42.y / 32 - Client.field532 / 32;
							class172.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class200.topLevelWorldView.baseX * 4 + 2 - Client.field647 / 32;
						var11 = Client.hintArrowY * 4 - class200.topLevelWorldView.baseY * 4 + 2 - Client.field532 / 32;
						class172.worldToMinimap(var1, var2, var10, var11, BuddyRankComparator.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0) {
						Player var43 = (Player)class200.topLevelWorldView.players.get((long)Client.hintArrowPlayerIndex);
						if (var43 != null) {
							var11 = var43.x / 32 - Client.field647 / 32;
							var12 = var43.y / 32 - Client.field532 / 32;
							class172.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Client.field647 / 32;
					var11 = Client.destinationY * 4 + 2 - Client.field532 / 32;
					ClanChannelMember.drawSpriteOnMinimap(var1, var2, var10, var11, BuddyRankComparator.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2536(-1) == class505.field5213 && BuddyRankComparator.mapDotSprites.length >= 4) {
					var10 = var4.width / 2 + var1;
					var11 = var4.height / 2 + var2;
					int var14;
					int var19;
					int var24;
					int var25;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var13 = var4.width / 2 + var1;
						var14 = var4.height / 2 + var2;
						int var15 = MouseHandler.MouseHandler_x - var13;
						int var16 = MouseHandler.MouseHandler_y - var14;
						int var17 = (int)Math.round(Math.atan2((double)var16, (double)var15) * 325.94932345220167D) - 512 & 2047;
						int var18 = var17 - Client.camAngleY;
						var18 &= 2047;
						int var20 = var18 + 64;
						var19 = (var20 & 2047) / 128;
						SpritePixels var28 = BuddyRankComparator.mapDotSprites[2];
						var15 = var19 * 128;
						var15 += Client.camAngleY;
						var15 &= 2047;
						byte var39 = 30;
						var20 = class520.field5274[var15 & 2047];
						double var29 = (double)var20 / 65536.0D;
						var20 = var10 - (int)(var29 * (double)var39);
						double var22 = (double)class204.method4072(var15) / 65536.0D;
						var24 = (int)(var22 * (double)var39) + var11;
						var25 = Math.max(var28.subWidth, var28.subHeight);
						int var26 = var25 / 2;
						var28.method10780(var20 - var26, var24 - var26, var28.subWidth, var28.subHeight, var28.subWidth / 2, var28.subHeight / 2, (double)class138.method3387(var15), 256);
					}

					if (Client.field790 > 0) {
						var12 = Client.field742;
						SpritePixels var31 = BuddyRankComparator.mapDotSprites[3];
						var14 = var12 * 128;
						var14 += Client.camAngleY;
						var14 &= 2047;
						byte var40 = 30;
						var19 = class520.field5274[var14 & 2047];
						double var32 = (double)var19 / 65536.0D;
						var19 = var10 - (int)(var32 * (double)var40);
						double var34 = (double)class204.method4072(var14) / 65536.0D;
						int var23 = (int)(var34 * (double)var40) + var11;
						var24 = Math.max(var31.subWidth, var31.subHeight);
						var25 = var24 / 2;
						var31.method10780(var19 - var25, var23 - var25, var31.subWidth, var31.subHeight, var31.subWidth / 2, var31.subHeight / 2, (double)class138.method3387(var14), 256);
					}
				}

				if (!class132.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field729[var3] = true;
		}
	}
}
