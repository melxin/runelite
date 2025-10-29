import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("ab")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1593199457
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aj")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;II)Z",
		garbageValue = "-1267610787"
	)
	public static boolean method6969(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var3 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var3 == null) {
			return false;
		} else {
			int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
			byte[] var5 = var1.getFile(var4, 0);
			return var5 != null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcu;",
		garbageValue = "-1921805386"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = EnumComposition.getScript(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var4 = class495.method10109(var2, var0);
			var5 = EnumComposition.getScript(var4, var0);
			if (var5 != null) {
				return var5;
			} else {
				var4 = class341.method7292(var0);
				var5 = EnumComposition.getScript(var4, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "689249021"
	)
	static final float method6970(float var0) {
		var0 = (var0 - 75.0F) * 1.0100503F;
		return 1.0100503F + 150.75377F / var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-951127487"
	)
	static final void method6964(String var0) {
		SwapSongTask.method9921(var0 + " is already on your ignore list");
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field442.method6268();
			}

			if (Client.gameState == 0) {
				SecureUrlRequester.client.method554();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field561 = 0;
				Client.field291 = 0;
				Client.timer.method8507(var0);
				if (var0 != 20) {
					class155.method4000(false);
				}
			}

			if (var0 != 20 && var0 != 40 && FadeInTask.field5377 != null) {
				FadeInTask.field5377.close();
				FadeInTask.field5377 = null;
			}

			if (Client.gameState == 25) {
				Client.field356 = 0;
				Client.field373 = 0;
				Client.field374 = 1;
				Client.field375 = 0;
				Client.field376 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					HttpResponse.method311(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field225, false, var3);
				} else if (var0 == 11) {
					HttpResponse.method311(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field225, false, 4);
				} else if (var0 == 50) {
					class525.setLoginResponseString("", "Updating date of birth...", "");
					HttpResponse.method311(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field225, false, 7);
				} else if (var0 != 0 && class217.clearLoginScreen) {
					class208.titleboxSprite = null;
					World.titlebuttonSprite = null;
					DirectByteArrayCopier.runesSprite = null;
					class560.leftTitleSprite = null;
					WorldMapData_1.rightTitleSprite = null;
					class50.logoSprite = null;
					FadeOutTask.title_muteSprite = null;
					class456.options_buttons_0Sprite = null;
					WidgetConfigNode.options_buttons_2Sprite = null;
					class461.worldSelectBackSprites = null;
					class107.worldSelectFlagSprites = null;
					MoveSpeed.worldSelectArrows = null;
					class148.worldSelectStars = null;
					ModelData0.field3172 = null;
					class204.loginScreenRunesAnimation.method2598();
					class167.method4167(0, 100);
					Script.method2043().method8679(true);
					class217.clearLoginScreen = false;
				}
			} else {
				boolean var1 = class468.clientPreferences.getEULA() >= Client.field330;
				int var2 = var1 ? 0 : 12;
				HttpResponse.method311(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field225, true, var2);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIII)Lrx;",
		garbageValue = "124586281"
	)
	static ProjectionCoord method6968(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 * 128;
		int var5 = var2 * 128;
		ProjectionCoord var6 = FaceNormal.method5848((float)var4, (float)var0.tileHeights[var3][var1][var2], (float)var5);
		ProjectionCoord var7 = FaceNormal.method5848((float)(var4 + 128), (float)var0.tileHeights[var3][var1 + 1][var2], (float)var5);
		ProjectionCoord var8 = FaceNormal.method5848((float)(var4 + 128), (float)var0.tileHeights[var3][var1 + 1][var2 + 1], (float)(var5 + 128));
		ProjectionCoord var9 = FaceNormal.method5848((float)var4, (float)var0.tileHeights[var3][var1][var2 + 1], (float)(var5 + 128));
		if (var7.z == var6.z && var6.z == var8.z && var6.z == var9.z) {
			var6.release();
			var7.release();
			var8.release();
			var9.release();
			return ProjectionCoord.field5242;
		} else {
			ProjectionCoord var11 = class30.method486(var7);
			var11.method9293(var6);
			ProjectionCoord var13 = class30.method486(var9);
			var13.method9293(var6);
			ProjectionCoord var14 = class451.method9146(var11, var13);
			var11.release();
			var13.release();
			ProjectionCoord var16 = class30.method486(var7);
			var16.method9293(var8);
			ProjectionCoord var18 = class30.method486(var9);
			var18.method9293(var8);
			ProjectionCoord var19 = class451.method9146(var18, var16);
			var16.release();
			var18.release();
			var6.release();
			var7.release();
			var8.release();
			var9.release();
			ProjectionCoord var21 = class30.method486(var14);
			var21.method9294(var19);
			var14.release();
			var19.release();
			ProjectionCoord var23;
			synchronized(ProjectionCoord.field5238) {
				if (ProjectionCoord.field5236 == 0) {
					var23 = new ProjectionCoord();
				} else {
					ProjectionCoord.field5238[--ProjectionCoord.field5236].method9349();
					var23 = ProjectionCoord.field5238[ProjectionCoord.field5236];
				}
			}

			float var26 = 1.0F / var21.method9306();
			var23.x = var26 * var21.x;
			var23.z = var26 * var21.z;
			var23.y = var26 * var21.y;
			var21.release();
			return var23;
		}
	}
}
