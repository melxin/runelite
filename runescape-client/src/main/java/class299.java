import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class299 implements WorldMapSection {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 489984215
	)
	int field3412;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 345213555
	)
	int field3407;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 468239605
	)
	int field3418;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1850076807
	)
	int field3409;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -72774507
	)
	int field3410;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1814140371
	)
	int field3411;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1410177857
	)
	int field3408;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2033081509
	)
	int field3413;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -380903341
	)
	int field3414;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1730699417
	)
	int field3415;

	class299() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1683202969"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3410) {
			var1.regionLowX = this.field3410;
		}

		if (var1.regionHighX < this.field3410) {
			var1.regionHighX = this.field3410;
		}

		if (var1.regionLowY > this.field3411) {
			var1.regionLowY = this.field3411;
		}

		if (var1.regionHighY < this.field3411) {
			var1.regionHighY = this.field3411;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-15"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3412 && var1 < this.field3407 + this.field3412) {
			return var2 >= (this.field3418 << 6) + (this.field3408 << 3) && var2 <= (this.field3418 << 6) + (this.field3408 << 3) + 7 && var3 >= (this.field3409 << 6) + (this.field3413 << 3) && var3 <= (this.field3409 << 6) + (this.field3413 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1836111411"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3410 << 6) + (this.field3414 << 3) && var1 <= (this.field3410 << 6) + (this.field3414 << 3) + 7 && var2 >= (this.field3411 << 6) + (this.field3415 << 3) && var2 <= (this.field3411 << 6) + (this.field3415 << 3) + 7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3410 * 64 - this.field3418 * 64 + var2 + (this.field3414 * 8 - this.field3408 * 8), var3 + (this.field3411 * 64 - this.field3409 * 64) + (this.field3415 * 8 - this.field3413 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Loj;",
		garbageValue = "216292671"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3418 * 64 - this.field3410 * 64 + (this.field3408 * 8 - this.field3414 * 8) + var1;
			int var4 = this.field3409 * 64 - this.field3411 * 64 + var2 + (this.field3413 * 8 - this.field3415 * 8);
			return new Coord(this.field3412, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1666502772"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3412 = var1.readUnsignedByte();
		this.field3407 = var1.readUnsignedByte();
		this.field3418 = var1.readUnsignedShort();
		this.field3408 = var1.readUnsignedByte();
		this.field3409 = var1.readUnsignedShort();
		this.field3413 = var1.readUnsignedByte();
		this.field3410 = var1.readUnsignedShort();
		this.field3414 = var1.readUnsignedByte();
		this.field3411 = var1.readUnsignedShort();
		this.field3415 = var1.readUnsignedByte();
		this.method6896();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	void method6896() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxg;",
		garbageValue = "-1859449601"
	)
	@Export("FillMode_values")
	public static class612[] FillMode_values() {
		return new class612[]{class612.field6100, class612.field6102, class612.SOLID};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1398379748"
	)
	@Export("performLoginRequest")
	static void performLoginRequest() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			class525.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(EnumComposition.method4451("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset * 2108391709, 1000 - var7.offset * 2108391709);
					if (var8 == -1) {
						var7.offset = 0;
						long var22 = var7.readLong();
						var1 = var22;
						break;
					}

					var7.offset += var8 * 1741769013;
					if (var7.offset * 2108391709 >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var34) {
				var1 = 0L;
			}

			byte var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				String var35 = Login.Login_username;
				Random var36 = new Random();
				Buffer var26 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var36.nextInt(), var36.nextInt(), (int)(var1 >> 32), (int)var1};
				var26.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var36.nextInt());
				}

				var26.writeInt(var10[0]);
				var26.writeInt(var10[1]);
				var26.writeLong(var1);
				var26.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var36.nextInt());
				}

				var26.encryptRsa(class48.field655, class48.field656);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var36.nextInt());
				}

				var9.writeLong(var36.nextLong());
				var9.writeLongMedium(var36.nextLong());
				if (Client.randomDatData != null) {
					var9.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var12 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var12);

						int var13;
						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) {
						}

						if (var13 >= 24) {
							throw new IOException();
						}
					} catch (Exception var33) {
						for (int var14 = 0; var14 < 24; ++var14) {
							var12[var14] = -1;
						}
					}

					var9.writeBytes(var12, 0, var12.length);
				}

				var9.writeLong(var36.nextLong());
				var9.encryptRsa(class48.field655, class48.field656);
				var11 = AccessFile.stringCp1252NullTerminatedByteSize(var35);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var37 = new Buffer(var11);
				var37.writeStringCp1252NullTerminated(var35);
				var37.offset = var11 * 1741769013;
				var37.xteaEncryptAll(var10);
				Buffer var27 = new Buffer(var37.offset * 2108391709 + var26.offset * 2108391709 + var9.offset * 2108391709 + 5);
				var27.writeByte(2);
				var27.writeByte(var26.offset * 2108391709);
				var27.writeBytes(var26.array, 0, var26.offset * 2108391709);
				var27.writeByte(var9.offset * 2108391709);
				var27.writeBytes(var9.array, 0, var9.offset * 2108391709);
				var27.writeShort(var37.offset * 2108391709);
				var27.writeBytes(var37.array, 0, var37.offset * 2108391709);
				byte[] var15 = var27.array;
				String var29 = BufferedSource.method10458(var15, 0, var15.length);
				String var16 = var29;

				byte var30;
				try {
					URL var17 = new URL(EnumComposition.method4451("services", false) + "m=accountappeal/login.ws");
					URLConnection var18 = var17.openConnection();
					var18.setDoInput(true);
					var18.setDoOutput(true);
					var18.setConnectTimeout(5000);
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
					var19.write("data2=" + class320.method7182(var16) + "&dest=" + class320.method7182("passwordchoice.ws"));
					var19.flush();
					InputStream var20 = var18.getInputStream();
					var27 = new Buffer(new byte[1000]);

					while (true) {
						int var21 = var20.read(var27.array, var27.offset * 2108391709, 1000 - var27.offset * 2108391709);
						if (var21 == -1) {
							var19.close();
							var20.close();
							String var31 = new String(var27.array);
							if (var31.startsWith("OFFLINE")) {
								var30 = 4;
							} else if (var31.startsWith("WRONG")) {
								var30 = 7;
							} else if (var31.startsWith("RELOAD")) {
								var30 = 3;
							} else if (var31.startsWith("Not permitted for social network accounts.")) {
								var30 = 6;
							} else {
								var27.xteaDecryptAll(var10);

								while (var27.offset * 2108391709 > 0 && var27.array[var27.offset * 2108391709 - 1] == 0) {
									var27.offset -= 1741769013;
								}

								var31 = new String(var27.array, 0, var27.offset * 2108391709);
								if (WorldEntityCoord.method6506(var31)) {
									class558.openURL(var31);
									var30 = 2;
								} else {
									var30 = 5;
								}
							}
							break;
						}

						var27.offset += var21 * 1741769013;
						if (var27.offset * 2108391709 >= 1000) {
							var30 = 5;
							break;
						}
					}
				} catch (Throwable var32) {
					var32.printStackTrace();
					var30 = 5;
				}

				var0 = var30;
			}

			switch(var0) {
			case 2:
				class525.setLoginResponseString(Strings.field4794, Strings.field4795, Strings.field4839);
				class30.method484(6);
				break;
			case 3:
				class525.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class525.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class525.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class525.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class525.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
