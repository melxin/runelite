import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class29 {
	@ObfuscatedName("of")
	@Export("regions")
	static int[] regions;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "413794857"
	)
	public static void method457() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "-101"
	)
	static File method464(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		class135.field1640 = new File(ItemContainer.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var16;
		File var38;
		if (class135.field1640.exists()) {
			AccessFile var7 = null;

			try {
				var7 = new AccessFile(class135.field1640, "rw", 10000L);

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
			} catch (Exception var35) {
				var35.printStackTrace();
			} finally {
				try {
					if (var7 != null) {
						var7.close();
					}
				} catch (IOException var30) {
				}

			}

			if (var4 != null) {
				var38 = new File(var4);
				if (!var38.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var38 = new File(var4, "test.dat");

				boolean var39;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var38, "rw");
					var16 = var15.read();
					var15.seek(0L);
					var15.write(var16);
					var15.seek(0L);
					var15.close();
					var38.delete();
					var39 = true;
				} catch (Exception var33) {
					var39 = false;
				}

				if (!var39) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label355:
			for (int var17 = 0; var17 < JagexCache.field3115.length; ++var17) {
				for (int var18 = 0; var18 < DefaultsGroup.field5589.length; ++var18) {
					File var19 = new File(DefaultsGroup.field5589[var18] + JagexCache.field3115[var17] + File.separatorChar + var0 + File.separatorChar);
					if (var19.exists()) {
						File var11 = new File(var19, "test.dat");

						boolean var40;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var11.delete();
							var40 = true;
						} catch (Exception var32) {
							var40 = false;
						}

						if (var40) {
							var4 = var19.toString();
							var6 = true;
							break label355;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = ItemContainer.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var37;
		if (var5 != null) {
			var37 = new File(var5);
			var38 = new File(var4);

			try {
				File[] var44 = var37.listFiles();
				File[] var42 = var44;

				for (var16 = 0; var16 < var42.length; ++var16) {
					File var41 = var42[var16];
					File var20 = new File(var38, var41.getName());
					boolean var14 = var41.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var34) {
				var34.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var37 = new File(var4);
			var8 = null;

			try {
				AccessFile var45 = new AccessFile(class135.field1640, "rw", 10000L);
				Buffer var43 = new Buffer(500);
				var43.writeByte(3);
				var43.writeByte(var8 != null ? 1 : 0);
				var43.writeCESU8(var37.getPath());
				if (var8 != null) {
					var43.writeCESU8("");
				}

				var45.write(var43.array, 0, var43.offset);
				var45.close();
			} catch (IOException var31) {
				var31.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1398746247"
	)
	static SecureRandom method462() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1852991510"
	)
	public static int method463(int var0, int var1) {
		return var0 + (int)(Math.random() * (double)(var1 - var0));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	static boolean method465() {
		if ((Client.worldProperties & class580.field5932.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class146.method3876(1);
			return true;
		} else if ((Client.worldProperties & class580.field5920.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class580.field5923.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class146.method3876(1);
			return true;
		} else if ((Client.worldProperties & class580.field5923.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class146.method3876(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)V",
		garbageValue = "78"
	)
	static final void method461(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field570 == -1) {
				Client.field570 = var0.spriteId2;
				Client.field350 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field570;
			} else {
				var0.spriteId2 = Client.field350;
			}

		} else if (var1 == 325) {
			if (Client.field570 == -1) {
				Client.field570 = var0.spriteId2;
				Client.field350 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field350;
			} else {
				var0.spriteId2 = Client.field570;
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
