import java.applet.Applet;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class31 {
	@ObfuscatedName("au")
	static Applet field147;
	@ObfuscatedName("as")
	static String field146;
	@ObfuscatedName("la")
	static String field148;

	static {
		field147 = null;
		field146 = "";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "2"
	)
	public static float method501(int var0) {
		var0 &= 2047;
		return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "304199328"
	)
	static final int method493(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-344354961"
	)
	static final int method496(long var0, String var2) {
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

		var4.encryptRsa(class48.field686, class48.field682);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		class323.randomDatData2(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class48.field686, class48.field682);
		var7 = class283.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var4.offset + var5.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = class70.method2218(var9.array);

		try {
			URL var11 = new URL(class365.method7850("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + SequenceDefinition.method4774(var10) + "&dest=" + SequenceDefinition.method4774("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var16 = new String(var9.array);
					if (var16.startsWith("OFFLINE")) {
						return 4;
					} else if (var16.startsWith("WRONG")) {
						return 7;
					} else if (var16.startsWith("RELOAD")) {
						return 3;
					} else if (var16.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var16 = new String(var9.array, 0, var9.offset);
						if (WorldMapSprite.method6810(var16)) {
							class441.openURL(var16, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var15;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var17) {
			var17.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "373781916"
	)
	static int method498(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.indexCheck.method6093(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.indexCheck.method6095(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1668063032"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "-1627298737"
	)
	static void method499(WorldView var0) {
		WorldEntity var1 = (WorldEntity)var0.worldEntities.get((long)Client.field326);
		if (var1 != null) {
			FileSystem.method5908(var0, var1, false);
		}
	}
}
