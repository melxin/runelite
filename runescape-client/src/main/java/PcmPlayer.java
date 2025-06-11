import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("af")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1518954695
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -641148757
	)
	int field1308;
	@ObfuscatedName("av")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -7791089586844821533L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 157905339
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -341655537
	)
	int field1313;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1255551147
	)
	int field1314;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 2124210000103161639L
	)
	long field1315;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1035585485
	)
	int field1316;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1303224249
	)
	int field1306;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 988218727
	)
	int field1318;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = -3546962462441414759L
	)
	long field1319;
	@ObfuscatedName("bv")
	boolean field1323;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1054887061
	)
	int field1321;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	PcmStream[] field1322;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	PcmStream[] field1312;

	protected PcmPlayer() {
		this.field1308 = 32;
		this.timeMs = class180.method3973();
		this.field1315 = 0L;
		this.field1316 = 0;
		this.field1306 = 0;
		this.field1318 = 0;
		this.field1319 = 0L;
		this.field1323 = true;
		this.field1321 = 0;
		this.field1322 = new PcmStream[8];
		this.field1312 = new PcmStream[8];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1333754181"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "608279250"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1325486588"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ai")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1859747430"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1005956693"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldf;B)V",
		garbageValue = "76"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-855755305"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class180.method3973();

			try {
				if (this.field1315 != 0L) {
					if (var1 < this.field1315) {
						return;
					}

					this.open(this.capacity);
					this.field1315 = 0L;
					this.field1323 = true;
				}

				int var3 = this.position();
				if (this.field1318 - var3 > this.field1316) {
					this.field1316 = this.field1318 - var3;
				}

				int var4 = this.field1313 + this.field1314;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field1323 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field1314 = var4 - this.field1313;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field1319) {
					if (!this.field1323) {
						if (this.field1316 == 0 && this.field1306 == 0) {
							this.close();
							this.field1315 = var1 + 2000L;
							return;
						}

						this.field1314 = Math.min(this.field1306, this.field1316);
						this.field1306 = this.field1316;
					} else {
						this.field1323 = false;
					}

					this.field1316 = 0;
					this.field1319 = 2000L + var1;
				}

				this.field1318 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1315 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / UserComparator3.field1521);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556235961"
	)
	public final void method2913() {
		this.field1323 = true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1323 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1315 = class180.method3973() + 2000L;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-108"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class209.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class209.soundSystem.players[var2]) {
					class209.soundSystem.players[var2] = null;
				}

				if (class209.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				BuddyRankComparator.soundSystemExecutor.shutdownNow();
				BuddyRankComparator.soundSystemExecutor = null;
				class209.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "97"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1321 -= var1;
		if (this.field1321 < 0) {
			this.field1321 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class470.clearIntArray(var1, 0, var3);
		this.field1321 -= var2;
		if (this.stream != null && this.field1321 <= 0) {
			this.field1321 += UserComparator3.field1521 >> 4;
			HealthBarConfig.PcmStream_disable(this.stream);
			this.method2918(this.stream, this.stream.vmethod3179());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label111:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field1322[var7];

						label105:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label105;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod7122();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1308) {
										break label111;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1372; var14 != null; var14 = var11.nextSubStream()) {
											this.method2918(var14, var15 * var14.vmethod3179() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1322[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field1312[var7] = var10;
									}

									var11 = var16;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var17 = this.field1322[var6];
				PcmStream[] var18 = this.field1322;
				this.field1312[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field1321 < 0) {
			this.field1321 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class180.method3973();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IB)V",
		garbageValue = "12"
	)
	final void method2918(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1312[var3];
		if (var4 == null) {
			this.field1322[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1312[var3] = var1;
		var1.field1372 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2064953132"
	)
	public static int method2961(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "-22"
	)
	static void method2962(float[] var0) {
		if (class132.field1558 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F));
			float var4 = 0.5F * (-var1 + var3);
			if (class132.field1558 + var0[1] > var4) {
				var0[1] = var4 - class132.field1558;
			} else {
				var4 = (-var1 - var3) * 0.5F;
				if (var0[1] < var4 + class132.field1558) {
					var0[1] = class132.field1558 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class132.field1558;
			var0[1] = 0.33333334F - class132.field1558;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1684213519"
	)
	static void method2960() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			MenuAction.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(class346.method7159("services", false) + "m=accountappeal/login.ws");
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
						long var23 = var7.readLong();
						var1 = var23;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var34) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var35 = Login.Login_username;
				Random var36 = new Random();
				Buffer var27 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var36.nextInt(), var36.nextInt(), (int)(var1 >> 32), (int)var1};
				var27.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var27.writeInt(var36.nextInt());
				}

				var27.writeInt(var10[0]);
				var27.writeInt(var10[1]);
				var27.writeLong(var1);
				var27.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var27.writeInt(var36.nextInt());
				}

				var27.encryptRsa(class49.field713, class49.field710);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var36.nextInt());
				}

				var9.writeLong(var36.nextLong());
				var9.writeLongMedium(var36.nextLong());
				class346.method7158(var9);
				var9.writeLong(var36.nextLong());
				var9.encryptRsa(class49.field713, class49.field710);
				var11 = FriendsChat.stringCp1252NullTerminatedByteSize(var35);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var35);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var9.offset + var27.offset + var12.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var27.offset);
				var13.writeBytes(var27.array, 0, var27.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				byte[] var15 = var13.array;
				int var17 = var15.length;
				StringBuilder var18 = new StringBuilder();

				int var21;
				for (int var19 = 0; var19 < var17 + 0; var19 += 3) {
					int var20 = var15[var19] & 255;
					var18.append(class437.field4937[var20 >>> 2]);
					if (var19 < var17 - 1) {
						var21 = var15[var19 + 1] & 255;
						var18.append(class437.field4937[(var20 & 3) << 4 | var21 >>> 4]);
						if (var19 < var17 - 2) {
							int var22 = var15[var19 + 2] & 255;
							var18.append(class437.field4937[(var21 & 15) << 2 | var22 >>> 6]).append(class437.field4937[var22 & 63]);
						} else {
							var18.append(class437.field4937[(var21 & 15) << 2]).append("=");
						}
					} else {
						var18.append(class437.field4937[(var20 & 3) << 4]).append("==");
					}
				}

				String var16 = var18.toString();
				var16 = var16;

				byte var31;
				try {
					URL var28 = new URL(class346.method7159("services", false) + "m=accountappeal/login.ws");
					URLConnection var37 = var28.openConnection();
					var37.setDoInput(true);
					var37.setDoOutput(true);
					var37.setConnectTimeout(5000);
					OutputStreamWriter var29 = new OutputStreamWriter(var37.getOutputStream());
					var29.write("data2=" + class598.method11493(var16) + "&dest=" + class598.method11493("passwordchoice.ws"));
					var29.flush();
					InputStream var30 = var37.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						var21 = var30.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var21 == -1) {
							var29.close();
							var30.close();
							String var32 = new String(var13.array);
							if (var32.startsWith("OFFLINE")) {
								var31 = 4;
							} else if (var32.startsWith("WRONG")) {
								var31 = 7;
							} else if (var32.startsWith("RELOAD")) {
								var31 = 3;
							} else if (var32.startsWith("Not permitted for social network accounts.")) {
								var31 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var32 = new String(var13.array, 0, var13.offset);
								if (ModelData0.method5838(var32)) {
									Calendar.openURL(var32, true, false);
									var31 = 2;
								} else {
									var31 = 5;
								}
							}
							break;
						}

						var13.offset += var21;
						if (var13.offset >= 1000) {
							var31 = 5;
							break;
						}
					}
				} catch (Throwable var33) {
					var33.printStackTrace();
					var31 = 5;
				}

				var0 = var31;
			}

			switch(var0) {
			case 2:
				MenuAction.setLoginResponseString(Strings.field4550, Strings.field4551, Strings.field4552);
				class85.method2689(6);
				break;
			case 3:
				MenuAction.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				MenuAction.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				MenuAction.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				MenuAction.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				MenuAction.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
