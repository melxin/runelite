import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("bh")
	protected static String field1061;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	SecureRandomCallable() {
	}

	public Object call() {
		return ServerPacket.method6515();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)[I",
		garbageValue = "311"
	)
	static int[] method2410(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class204.method4070(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class204.method4070(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class204.method4070(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class204.method4070(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1738644681"
	)
	static void method2398() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class401.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = FileSystem.method4489();
			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
				var6.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.writeInt(var8[0]);
				var6.writeInt(var8[1]);
				var6.writeLong(var1);
				var6.writeLong(0L);

				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.encryptRsa(class74.field916, class74.field921);
				var7.writeByte(10);

				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}

				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				if (Client.randomDatData != null) {
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var21 = FontName.randomDatData2();
					var7.writeBytes(var21, 0, var21.length);
				}

				var7.writeLong(var5.nextLong());
				var7.encryptRsa(class74.field916, class74.field921);
				var9 = AsyncRestClient.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9);
				var10.writeStringCp1252NullTerminated(var4);
				var10.offset = var9;
				var10.xteaEncryptAll(var8);
				Buffer var11 = new Buffer(var7.offset + var6.offset + var10.offset + 5);
				var11.writeByte(2);
				var11.writeByte(var6.offset);
				var11.writeBytes(var6.array, 0, var6.offset);
				var11.writeByte(var7.offset);
				var11.writeBytes(var7.array, 0, var7.offset);
				var11.writeShort(var10.offset);
				var11.writeBytes(var10.array, 0, var10.offset);
				byte[] var13 = var11.array;
				int var15 = var13.length;
				StringBuilder var16 = new StringBuilder();

				int var19;
				for (int var17 = 0; var17 < var15 + 0; var17 += 3) {
					int var18 = var13[var17] & 255;
					var16.append(class434.field4872[var18 >>> 2]);
					if (var17 < var15 - 1) {
						var19 = var13[var17 + 1] & 255;
						var16.append(class434.field4872[(var18 & 3) << 4 | var19 >>> 4]);
						if (var17 < var15 - 2) {
							int var20 = var13[var17 + 2] & 255;
							var16.append(class434.field4872[(var19 & 15) << 2 | var20 >>> 6]).append(class434.field4872[var20 & 63]);
						} else {
							var16.append(class434.field4872[(var19 & 15) << 2]).append("=");
						}
					} else {
						var16.append(class434.field4872[(var18 & 3) << 4]).append("==");
					}
				}

				String var14 = var16.toString();
				var14 = var14;

				byte var3;
				try {
					URL var22 = new URL(World.method1887("services", false) + "m=accountappeal/login.ws");
					URLConnection var27 = var22.openConnection();
					var27.setDoInput(true);
					var27.setDoOutput(true);
					var27.setConnectTimeout(5000);
					OutputStreamWriter var23 = new OutputStreamWriter(var27.getOutputStream());
					var23.write("data2=" + class321.method6493(var14) + "&dest=" + class321.method6493("passwordchoice.ws"));
					var23.flush();
					InputStream var24 = var27.getInputStream();
					var11 = new Buffer(new byte[1000]);

					while (true) {
						var19 = var24.read(var11.array, var11.offset, 1000 - var11.offset);
						if (var19 == -1) {
							var23.close();
							var24.close();
							String var25 = new String(var11.array);
							if (var25.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var25.startsWith("WRONG")) {
								var3 = 7;
							} else if (var25.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var25.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var11.xteaDecryptAll(var8);

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) {
									--var11.offset;
								}

								var25 = new String(var11.array, 0, var11.offset);
								if (FriendSystem.method1929(var25)) {
									class91.openURL(var25, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}

						var11.offset += var19;
						if (var11.offset >= 1000) {
							var3 = 5;
							break;
						}
					}
				} catch (Throwable var26) {
					var26.printStackTrace();
					var3 = 5;
				}

				var0 = var3;
			}

			switch(var0) {
			case 2:
				class401.setLoginResponseString(Strings.field4503, Strings.field4504, Strings.field4505);
				ObjectComposition.method4206(6);
				break;
			case 3:
				class401.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class401.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class401.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class401.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class401.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2069273434"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class376.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class376.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class72.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1212802427"
	)
	static void method2411(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class467.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		class521.method9609(var0, var1);
	}
}
