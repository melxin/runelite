import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("sz")
public class class477 extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field5359;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field5358;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field5360;

	@ObfuscatedSignature(
		descriptor = "(Lsw;Lpe;Lpe;Lpe;)V"
	)
	public class477(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5359 = var2;
		this.field5358 = var3;
		this.field5360 = var4;
		super.field5350 = "LoadSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		int var1 = 0;
		Iterator var2 = class338.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3910 > 1 && var3.midiPcmStream.method7158()) {
					this.method9741("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field4025) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field4027 == null) {
								var3.field4027 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field4027 == null) {
									continue;
								}
							}

							if (var3.field4022 == null) {
								var3.field4022 = new SoundCache(this.field5360, this.field5358);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field4027, this.field5359, var3.field4022)) {
								++var1;
								var3.field4025 = true;
								var3.midiPcmStream.method7152();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var5);
						this.method9741(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class338.midiRequests.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1751781072"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.method11575();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.method11575();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = MidiRequest.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = MidiRequest.loadClassFromDescriptor(var20);
						if (MidiRequest.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = MidiRequest.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.method11575();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (MidiRequest.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(MidiRequest.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class35.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "930911907"
	)
	static void method9766() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			class203.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(class174.method4161("services", false) + "m=accountappeal/login.ws");
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
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				var0 = class574.method11215(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class203.setLoginResponseString(Strings.field4777, Strings.field4626, Strings.field4779);
				class146.method3876(6);
				break;
			case 3:
				class203.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class203.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class203.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class203.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class203.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-119"
	)
	static final void method9765(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2397()];
		float[] var3 = new float[Client.worldViewManager.method2397()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var40 = (WorldView)var5.next();
			var2[var4] = var40.id;
			var3[var4] = var40.scene.field2714;
		}

		class367.method7919(var3, var2);
		HashMap var41 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class516 var42 = Client.worldViewManager.method2376(var2[var4]);
				if (!var41.containsKey(var42)) {
					var41.put(var42, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class516 var7 = Client.worldViewManager.method2376(var6);
			Integer var8 = (Integer)var41.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class516.field5563) {
					class162.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class516.field5564) {
					int var9 = Client.viewportWidth / 2;
					int var10 = Client.viewportHeight / 2;
					int var11 = Client.viewportZoom;
					Scene var13 = class547.topLevelWorldView.scene;
					int var14 = Client.field572;
					int var15 = Huffman.cameraX;
					int var16 = class514.cameraY;
					int var17 = ChatChannel.cameraZ;
					float var18 = 1.0E-5F;
					class173.method4158();
					DelayFadeTask.method9712(var13.field2749, var13.field2711, var13.field2751, var13.field2703, var9, var10, var11);
					class450 var19 = IndexCheck.method6169(0.0F, 1.0F, 0.0F);
					class450 var21 = ViewportMouse.field2955;
					float var20 = var19.method9074(var21);
					class450 var12;
					class450 var24;
					float var26;
					if (Math.abs(var20) < 1.0E-5F) {
						var19.method9065();
						var12 = null;
					} else {
						class450 var23 = IndexCheck.method6169((float)var15, (float)var16, (float)var17);
						var24 = IndexCheck.method6169(var23.field5216, var23.field5218 - (float)var14, var23.field5219);
						float var25 = var19.method9074(var24);
						var26 = -var25 / var20;
						var19.method9065();
						if (var26 < 0.0F) {
							var24.method9065();
							var23.method9065();
							var12 = null;
						} else {
							class450 var28 = ViewportMouse.field2955;
							class450 var29 = NPC.method2793(var28);
							var29.method9096(var26);
							class450 var30 = class302.method6840(var23, var29);
							var29.method9065();
							var24.method9065();
							var23.method9065();
							var12 = var30;
						}
					}

					if (var12 != null) {
						var19 = IndexCheck.method6169((float)Client.field484, (float)Client.field572, (float)Client.field377);
						var21 = NPC.method2793(var12);
						var21.method9073(var19);
						class450 var35 = NPC.method2851(class450.field5211, var21);
						var24 = class450.field5212;
						float var36 = var35.method9074(var24);
						class450 var27 = class450.field5211;
						var26 = var27.method9074(var21);
						float var37 = (float)Math.atan2((double)var36, (double)var26);
						int var38 = (int)((double)var37 / 6.283185307179586D * 2048.0D) & 2047;
						int var32 = var38 + 64;
						int var31 = (var32 & 2047) / 128;
						class162.insertMenuItem("Set heading", "", 60, var31, 0, 0, 0, false, var6);
						var19.method9065();
						var21.method9065();
						var35.method9065();
						var12.method9065();
					}
				}
			}
		}

	}
}
