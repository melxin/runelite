import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wv")
public final class class574 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "211932648"
	)
	@Export("performLoginRequest")
	static final int performLoginRequest(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class48.field671, class48.field676);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var8 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var8);

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) {
				}

				if (var9 >= 24) {
					throw new IOException();
				}
			} catch (Exception var26) {
				for (int var10 = 0; var10 < 24; ++var10) {
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class48.field671, class48.field676);
		var7 = WorldMapArea.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var27 = new Buffer(var7);
		var27.writeStringCp1252NullTerminated(var2);
		var27.offset = var7;
		var27.xteaEncryptAll(var6);
		Buffer var20 = new Buffer(var5.offset + var4.offset + var27.offset + 5);
		var20.writeByte(2);
		var20.writeByte(var4.offset);
		var20.writeBytes(var4.array, 0, var4.offset);
		var20.writeByte(var5.offset);
		var20.writeBytes(var5.array, 0, var5.offset);
		var20.writeShort(var27.offset);
		var20.writeBytes(var27.array, 0, var27.offset);
		byte[] var11 = var20.array;
		String var22 = class169.method4113(var11, 0, var11.length);
		String var12 = var22;

		try {
			URL var13 = new URL(class174.method4161("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + FadeInTask.method9723(var12) + "&dest=" + FadeInTask.method9723("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var20 = new Buffer(new byte[1000]);

			do {
				int var17 = var16.read(var20.array, var20.offset, 1000 - var20.offset);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var23 = new String(var20.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var20.xteaDecryptAll(var6);

						while (var20.offset > 0 && var20.array[var20.offset - 1] == 0) {
							--var20.offset;
						}

						var23 = new String(var20.array, 0, var20.offset);
						boolean var18;
						if (var23 == null) {
							var18 = false;
						} else {
							label109: {
								try {
									new URL(var23);
								} catch (MalformedURLException var24) {
									var18 = false;
									break label109;
								}

								var18 = true;
							}
						}

						if (var18) {
							class114.openURL(var23);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var20.offset += var17;
			} while(var20.offset < 1000);

			return 5;
		} catch (Throwable var25) {
			var25.printStackTrace();
			return 5;
		}
	}
}
