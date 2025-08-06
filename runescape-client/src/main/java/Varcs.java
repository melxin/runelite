import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ac")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("av")
	@Export("map")
	Map map;
	@ObfuscatedName("au")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -907287058441332393L
	)
	long field1251;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = AsyncRestClient.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = LoginPacket.method3765(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		this.read();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "703496654"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "65"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "2"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-341720781"
	)
	@Export("clearTransient")
	void clearTransient() {
		for (int var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZS)Lvv;",
		garbageValue = "128"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return HttpResponse.getPreferencesFile("2", class36.field227.name, var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1530943642"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class283.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var27 = new Buffer(var2);
			var27.writeByte(2);
			var27.writeShort(var3);
			Iterator var28 = this.map.entrySet().iterator();

			label146:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.offset, 0, var27.field5818);
						break label146;
					}

					var16 = (Entry)var28.next();
					var17 = (Integer)var16.getKey();
				} while(!this.intsPersistence[var17]);

				var27.writeShort(var17);
				Object var8 = var16.getValue();
				Class var10 = var8.getClass();
				class570[] var11 = class570.method11060();
				int var12 = 0;

				class570 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class570 var13 = var11[var12];
					if (var10 == var13.field5722) {
						var9 = var13;
						break;
					}

					++var12;
				}

				var27.writeByte(var9.field5717);
				class570.method11055(var8, var27);
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
		this.field1251 = UserComparator7.method3496();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-35105960"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		try {
			byte[] var2 = new byte[(int)var1.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var1.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2);
			if (var14.offset.length - var14.field5818 < 1) {
				return;
			}

			int var15 = var14.readUnsignedByte();
			if (var15 < 0 || var15 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) {
				var16 = var14.readUnsignedShort();

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readUnsignedByte();
					class570 var10 = (class570)HealthBarConfig.findEnumerated(class570.method11060(), var9);
					Object var11 = var10.method11054(var14);
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
						this.map.put(var8, var11);
					}
				}
			} else {
				var16 = var14.readUnsignedShort();

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readInt();
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
						this.map.put(var8, var9);
					}
				}

				var7 = var14.readUnsignedShort();

				for (var8 = 0; var8 < var7; ++var8) {
					var14.readUnsignedShort();
					var14.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1583513479"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1251 < UserComparator7.method3496() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2034031895"
	)
	static void method2869() {
		class447.field5053 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = ChatChannel.method1997((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F));
			class447.field5053[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class447.field5053.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = ChatChannel.method1997((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class447.field5053.length; ++var0) {
				class447.field5053[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1915620532"
	)
	static int method2870(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1189487012"
	)
	public static int method2868(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("au")
	public static boolean method2848(long var0) {
		return (int)(var0 >>> 19 & 1L) == 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[BIIIIIIIIII)V",
		garbageValue = "-432951518"
	)
	static final void method2871(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];

			for (var13 = var3; var13 < var3 + 8; ++var13) {
				for (var14 = var4; var14 < var4 + 8; ++var14) {
					if (var12.method6138(var13, var14)) {
						var12.method6146(var13, var14, 1073741824);
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		int var15;
		int var16;
		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var16 = var3 + Huffman.method8115(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var4 + var18;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						AsyncHttpResponse.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						AsyncHttpResponse.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

		var13 = var25.field5818 < var25.offset.length ? var25.readUnsignedByte() : 0;
		boolean var26 = (var13 & 1) != 0;
		if (var26) {
			for (var15 = 0; var15 < 64; ++var15) {
				for (var16 = 0; var16 < 64; ++var16) {
					Projectile.method1932(var25);
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "748087726"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!Language.client.containsAccessAndRefreshToken() && !Language.client.otlTokenRequesterInitialized() && !Language.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			DynamicObject.method1987(2);
			if (var0) {
				Login.Login_password = "";
			}

			class66.method2131();
			class141.focusPasswordWhenUsernameFilled();
		} else {
			DynamicObject.method1987(10);
		}
	}
}
