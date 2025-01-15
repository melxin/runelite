import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class221 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class221 field2422;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2421;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 1772774201
	)
	static int field2426;
	@ObfuscatedName("ay")
	String field2410;
	@ObfuscatedName("ah")
	String field2415;
	@ObfuscatedName("az")
	String field2411;
	@ObfuscatedName("ao")
	String field2413;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -1785860587673457591L
	)
	long field2414;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	AsyncRestClient field2420;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	AsyncHttpResponse field2416;
	@ObfuscatedName("ax")
	final int field2417;
	@ObfuscatedName("at")
	final int field2418;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 968711367
	)
	int field2419;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 816256339
	)
	int field2423;
	@ObfuscatedName("ak")
	String field2428;
	@ObfuscatedName("av")
	boolean field2424;

	static {
		field2422 = new class221();
	}

	class221() {
		this.field2410 = "";
		this.field2415 = "";
		this.field2411 = "";
		this.field2413 = "";
		this.field2414 = -1L;
		this.field2417 = 1;
		this.field2418 = 2;
		this.field2419 = 1;
		this.field2423 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "71"
	)
	public void method4976(int var1, String var2) {
		this.field2423 = var1;
		this.field2428 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-769087225"
	)
	public void method4977(boolean var1) {
		this.field2424 = var1;
		this.field2420 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1012227368"
	)
	void method4975(String var1, String var2, String var3) {
		if (this.field2419 != 2) {
			this.field2410 = var1;
			this.field2415 = var2;
			this.field2411 = var3;
			if (!this.field2410.endsWith("/")) {
				this.field2410 = this.field2410 + "/";
			}

			if (!this.field2415.equals("")) {
				String var4 = this.field2410;
				var4 = var4 + "session/open/" + this.field2415;
				if (this.field2411.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2411;

				try {
					this.field2416 = this.method4992(var4);
					this.field2414 = ReflectionCheck.method724();
				} catch (IOException var6) {
					this.field2416 = null;
					this.field2415 = "";
					this.field2411 = "";
				}

			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1891305770"
	)
	public void method4979() {
		if (this.field2416 == null) {
			if (!this.field2413.isEmpty() && this.field2419 == 1) {
				long var1 = ReflectionCheck.method724();
				long var3 = var1 - this.field2414;
				String var5 = this.field2410;
				var5 = var5 + "session/close/" + this.field2415 + "/" + this.field2413;
				if (this.field2411.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2411 + "&sessionDuration=" + var3;
				}

				try {
					this.field2416 = this.method4992(var5);
				} catch (IOException var7) {
					this.field2419 = 1;
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	public void method4980() {
		if (this.field2420 != null) {
			this.field2420.shutdown();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "862837352"
	)
	void method4991() {
		if (!this.field2413.isEmpty()) {
			String var1 = "";
			switch(this.field2423) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2428.isEmpty()) {
				String var2 = this.field2410;
				var2 = var2 + var1 + "/" + this.field2415 + "/" + this.field2413 + "/" + this.field2428 + "?userHash=" + this.field2411;

				try {
					this.field2416 = this.method4992(var2);
				} catch (IOException var4) {
					this.field2419 = 1;
				}

				this.field2419 = 1;
				this.field2423 = 0;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2024423487"
	)
	public void method4982() {
		if (this.field2416 != null && this.field2416.hasFinished()) {
			if (this.field2416.hasFinished() && this.field2416.await().getResponseCode() == 200 && this.field2413.isEmpty()) {
				String var1 = this.field2416.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2413 = var1;
			}

			if (this.field2423 != 0) {
				this.method4991();
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1263544057"
	)
	public boolean method4983(String var1) {
		this.method4976(2, var1);
		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lag;",
		garbageValue = "-190142456"
	)
	AsyncHttpResponse method4992(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2424);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2420.submitRequest(var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "192939260"
	)
	static void method5000() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class150.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(RouteStrategy.method5846("services", false) + "m=accountappeal/login.ws");
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
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var22 = var7.readLong();
						var1 = var22;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var31) {
				var1 = 0L;
			}

			byte var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				String var32 = Login.Login_username;
				Random var33 = new Random();
				Buffer var26 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var33.nextInt(), var33.nextInt(), (int)(var1 >> 32), (int)var1};
				var26.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var33.nextInt());
				}

				var26.writeInt(var10[0]);
				var26.writeInt(var10[1]);
				var26.writeLong(var1);
				var26.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var33.nextInt());
				}

				var26.encryptRsa(class75.field897, class75.field900);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var33.nextInt());
				}

				var9.writeLong(var33.nextLong());
				var9.writeLongMedium(var33.nextLong());
				WorldMapElement.randomDatData2(var9);
				var9.writeLong(var33.nextLong());
				var9.encryptRsa(class75.field897, class75.field900);
				var11 = MouseRecorder.stringCp1252NullTerminatedByteSize(var32);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var32);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var26.offset + var9.offset + var12.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var26.offset);
				var13.writeBytes(var26.array, 0, var26.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				String var14 = CollisionMap.method5830(var13.array);

				byte var27;
				try {
					URL var15 = new URL(RouteStrategy.method5846("services", false) + "m=accountappeal/login.ws");
					URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write("data2=" + PcmPlayer.method857(var14) + "&dest=" + PcmPlayer.method857("passwordchoice.ws"));
					var17.flush();
					InputStream var18 = var16.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var28 = new String(var13.array);
							if (var28.startsWith("OFFLINE")) {
								var27 = 4;
							} else if (var28.startsWith("WRONG")) {
								var27 = 7;
							} else if (var28.startsWith("RELOAD")) {
								var27 = 3;
							} else if (var28.startsWith("Not permitted for social network accounts.")) {
								var27 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var28 = new String(var13.array, 0, var13.offset);
								boolean var20;
								if (var28 == null) {
									var20 = false;
								} else {
									label116: {
										try {
											new URL(var28);
										} catch (MalformedURLException var29) {
											var20 = false;
											break label116;
										}

										var20 = true;
									}
								}

								if (var20) {
									WorldMapRectangle.openURL(var28, true, false);
									var27 = 2;
								} else {
									var27 = 5;
								}
							}
							break;
						}

						var13.offset += var19;
						if (var13.offset >= 1000) {
							var27 = 5;
							break;
						}
					}
				} catch (Throwable var30) {
					var30.printStackTrace();
					var27 = 5;
				}

				var0 = var27;
			}

			switch(var0) {
			case 2:
				class150.setLoginResponseString(Strings.field4256, Strings.field4410, Strings.field4439);
				Varcs.method3212(6);
				break;
			case 3:
				class150.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class150.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class150.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class150.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class150.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
