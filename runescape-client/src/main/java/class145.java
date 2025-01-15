import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public enum class145 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1652(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1658(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1649(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1650(3, 3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1651(4, 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1647(5, 5),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1648(6, 6),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1653(7, 7),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1655(8, 8);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 950168225
	)
	final int field1654;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 855199151
	)
	final int field1657;

	class145(int var3, int var4) {
		this.field1654 = var3;
		this.field1657 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1657;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "2060354283"
	)
	static File method3556(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.field2389 = new File(HttpContentType.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		File var33;
		if (JagexCache.field2389.exists()) {
			AccessFile var7 = null;

			try {
				var7 = new AccessFile(JagexCache.field2389, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}
			} catch (Exception var30) {
				var30.printStackTrace();
			} finally {
				try {
					if (var7 != null) {
						var7.close();
					}
				} catch (IOException var27) {
				}

			}

			if (var4 != null) {
				var33 = new File(var4);
				if (!var33.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var33 = new File(var4, "test.dat");
				if (!HealthBarConfig.method3008(var33, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label332:
			for (int var15 = 0; var15 < BuddyRankComparator.field1522.length; ++var15) {
				for (int var16 = 0; var16 < class355.field3789.length; ++var16) {
					File var17 = new File(class355.field3789[var16] + BuddyRankComparator.field1522[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && HealthBarConfig.method3008(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label332;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = HttpContentType.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var32;
		if (var5 != null) {
			var32 = new File(var5);
			var33 = new File(var4);

			try {
				File[] var34 = var32.listFiles();
				File[] var18 = var34;

				for (int var19 = 0; var19 < var18.length; ++var19) {
					File var12 = var18[var19];
					File var13 = new File(var33, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var29) {
				var29.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var32 = new File(var4);
			var8 = null;

			try {
				AccessFile var35 = new AccessFile(JagexCache.field2389, "rw", 10000L);
				Buffer var36 = new Buffer(500);
				var36.writeByte(3);
				var36.writeByte(var8 != null ? 1 : 0);
				var36.writeCESU8(var32.getPath());
				if (var8 != null) {
					var36.writeCESU8("");
				}

				var35.write(var36.array, 0, var36.offset);
				var35.close();
			} catch (IOException var28) {
				var28.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([F[II)V",
		garbageValue = "162405776"
	)
	public static void method3557(float[] var0, int[] var1) {
		AsyncRestClient.method187(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1477331175"
	)
	static boolean method3558(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1280"
	)
	static final void method3555() {
		int var0;
		int var1;
		int var2;
		if (!Client.field669) {
			var0 = Coord.method6980(LoginScreenAnimation.field1293);
			var1 = Coord.method6980(WorldMapAreaData.field3274);
			var2 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var0, var1, GameEngine.topLevelWorldView.plane) - class95.field1167;
			class374.method7623(var0, var2, var1);
		} else if (Client.field657 != null) {
			Buddy.cameraX = Client.field657.vmethod9687();
			class31.cameraZ = Client.field657.vmethod9688();
			if (Client.field758) {
				Message.cameraY = Client.field657.vmethod9689();
			} else {
				Message.cameraY = Canvas.getTileHeight(GameEngine.topLevelWorldView, Buddy.cameraX, class31.cameraZ, GameEngine.topLevelWorldView.plane) - Client.field657.vmethod9689();
			}

			Client.field657.method9700();
		}

		if (!Client.field757) {
			var0 = Coord.method6980(class280.field3067);
			var1 = Coord.method6980(Client.field801);
			var2 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var0, var1, GameEngine.topLevelWorldView.plane) - class416.field4710;
			int var3 = var0 - Buddy.cameraX;
			int var4 = var2 - Message.cameraY;
			int var5 = var1 - class31.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			GraphicsObject.method2358(var7, var8);
		} else {
			if (Client.field761 != null) {
				class159.cameraPitch = Client.field761.method9684();
				class159.cameraPitch = Math.min(Math.max(class159.cameraPitch, 128), 383);
				Client.field761.method9700();
			}

			if (Client.field725 != null) {
				IntProjection.cameraYaw = Client.field725.method9684() & 2047;
				Client.field725.method9700();
			}
		}

	}
}
