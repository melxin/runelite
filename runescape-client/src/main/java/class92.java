import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public enum class92 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1126(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1124(1, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1125(2, 3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1130(3, 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1127(4, 5),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1131(5, 6);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 653668643
	)
	final int field1129;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1129291547
	)
	final int field1123;

	class92(int var3, int var4) {
		this.field1129 = var3;
		this.field1123 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1123;
	}

	@ObfuscatedName("ac")
	static boolean method2465(long var0) {
		return (int)(var0 >>> 17 & 1L) == 1;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "287103962"
	)
	static final void method2467() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			WorldView var11 = Client.worldViewManager.getWorldView(Client.field645);
			if (var11 == null) {
				var11 = class200.topLevelWorldView;
			}

			Object var12 = null;
			switch(SoundCache.field311.field4173) {
			case 0:
				var12 = (Entity)var11.players.get((long)Client.field646);
				break;
			case 1:
				var12 = (Entity)var11.npcs.get((long)Client.field646);
				break;
			case 2:
				var12 = (Entity)var11.worldEntities.get((long)Client.field646);
			}

			if (var12 == null) {
				var12 = class132.localPlayer;
			}

			Client.field647 = ((Entity)var12).getX();
			Client.field532 = ((Entity)var12).getY();
			if (var11 != class200.topLevelWorldView) {
				class442 var13 = class162.method3620(var11, ((Entity)var12).getX(), ((Entity)var12).getY());
				Client.field647 = (int)var13.field4898;
				Client.field532 = (int)var13.field4900;
				var13.method8341();
			}

			var2 = ((Entity)var12).getPlane();
			if (RestClientThreadFactory.oculusOrbFocalPointX - Client.field647 >= -500 && RestClientThreadFactory.oculusOrbFocalPointX - Client.field647 <= 500 && class173.oculusOrbFocalPointY - Client.field532 >= -500 && class173.oculusOrbFocalPointY - Client.field532 <= 500) {
				if (RestClientThreadFactory.oculusOrbFocalPointX != Client.field647) {
					RestClientThreadFactory.oculusOrbFocalPointX += (Client.field647 - RestClientThreadFactory.oculusOrbFocalPointX) / 16;
				}

				if (Client.field532 != class173.oculusOrbFocalPointY) {
					class173.oculusOrbFocalPointY += (Client.field532 - class173.oculusOrbFocalPointY) / 16;
				}
			} else {
				RestClientThreadFactory.oculusOrbFocalPointX = Client.field647;
				class173.oculusOrbFocalPointY = Client.field532;
			}

			var3 = RestClientThreadFactory.oculusOrbFocalPointX >> 7;
			var4 = class173.oculusOrbFocalPointY >> 7;
			var5 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, RestClientThreadFactory.oculusOrbFocalPointX, class173.oculusOrbFocalPointY, var2);
			int var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = var2;
						if (var2 < 3 && (class200.topLevelWorldView.tileSettings[1][var7][var8] & 2) == 2) {
							var9 = var2 + 1;
						}

						int var10 = var5 - class200.topLevelWorldView.tileHeights[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = 32768;
			}

			if (var7 > Client.field617) {
				Client.field617 += (var7 - Client.field617) / 24;
			} else if (var7 < Client.field617) {
				Client.field617 += (var7 - Client.field617) / 80;
			}

			Client.field648 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, Client.field647, Client.field532, var2);
			class274.oculusOrbFocalPointZ = Client.field648 - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field614 && class132.localPlayer != null) {
				var0 = class132.localPlayer.pathX[0];
				var1 = class132.localPlayer.pathY[0];
				if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
					RestClientThreadFactory.oculusOrbFocalPointX = class132.localPlayer.x;
					var2 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class132.localPlayer.x, class132.localPlayer.y, class200.topLevelWorldView.plane) - Client.camFollowHeight;
					if (var2 < class274.oculusOrbFocalPointZ) {
						class274.oculusOrbFocalPointZ = var2;
					}

					class173.oculusOrbFocalPointY = class132.localPlayer.y;
					Client.field614 = false;
				}
			}

			short var14 = -1;
			if (Client.indexCheck.isValidIndexInRange(33)) {
				var14 = 0;
			} else if (Client.indexCheck.isValidIndexInRange(49)) {
				var14 = 1024;
			}

			if (Client.indexCheck.isValidIndexInRange(48)) {
				if (var14 == 0) {
					var14 = 1792;
				} else if (var14 == 1024) {
					var14 = 1280;
				} else {
					var14 = 1536;
				}
			} else if (Client.indexCheck.isValidIndexInRange(50)) {
				if (var14 == 0) {
					var14 = 256;
				} else if (var14 == 1024) {
					var14 = 768;
				} else {
					var14 = 512;
				}
			}

			byte var15 = 0;
			if (Client.indexCheck.isValidIndexInRange(35)) {
				var15 = -1;
			} else if (Client.indexCheck.isValidIndexInRange(51)) {
				var15 = 1;
			}

			var2 = 0;
			if (var14 >= 0 || var15 != 0) {
				var2 = Client.indexCheck.isValidIndexInRange(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field609 = var14;
				Client.field610 = var15;
			}

			if (Client.field663 < var2) {
				Client.field663 += var2 / 8;
				if (Client.field663 > var2) {
					Client.field663 = var2;
				}
			} else if (Client.field663 > var2) {
				Client.field663 = Client.field663 * 9 / 10;
			}

			if (Client.field663 > 0) {
				var3 = Client.field663 / 16;
				if (Client.field609 >= 0) {
					var0 = Client.field609 - FloorDecoration.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					RestClientThreadFactory.oculusOrbFocalPointX += var3 * var4 / 65536;
					class173.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field610 != 0) {
					class274.oculusOrbFocalPointZ += var3 * Client.field610;
					if (class274.oculusOrbFocalPointZ > 0) {
						class274.oculusOrbFocalPointZ = 0;
					}
				}
			} else {
				Client.field609 = -1;
				Client.field610 = -1;
			}

			char var16 = '耀';
			if (var16 > Client.field617) {
				Client.field617 += (var16 - Client.field617) / 24;
			} else if (var16 < Client.field617) {
				Client.field617 += (var16 - Client.field617) / 80;
			}

			if (Client.indexCheck.isValidIndexInRange(13)) {
				Client.packetWriter.addNode(class272.getPacketBufferNode(ClientPacket.field3426, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class466.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (Client.indexCheck.isValidIndexInRange(96)) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(97)) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (Client.indexCheck.isValidIndexInRange(98)) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(99)) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}
