import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class130 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 249862335
	)
	int field1537;
	@ObfuscatedName("an")
	float field1534;
	@ObfuscatedName("ae")
	float field1535;
	@ObfuscatedName("af")
	float field1541;
	@ObfuscatedName("as")
	float field1538;
	@ObfuscatedName("aq")
	float field1536;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1539;

	class130() {
		this.field1535 = Float.MAX_VALUE;
		this.field1541 = Float.MAX_VALUE;
		this.field1538 = Float.MAX_VALUE;
		this.field1536 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "-542846065"
	)
	void method3256(Buffer var1, int var2) {
		this.field1537 = var1.readShort();
		this.field1534 = var1.method10305();
		this.field1535 = var1.method10305();
		this.field1541 = var1.method10305();
		this.field1538 = var1.method10305();
		this.field1536 = var1.method10305();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-2139222934"
	)
	static File method3260(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		class36.field217 = new File(class166.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		File var33;
		if (class36.field217.exists()) {
			AccessFile var7 = null;

			try {
				var7 = new AccessFile(class36.field217, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset * -2066221813 < var8.array.length; var8.offset += var9 * 29699747) {
					var9 = var7.read(var8.array, var8.offset * -2066221813, var8.array.length - var8.offset * -2066221813);
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
				if (!RestClientThreadFactory.method204(var33, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label328:
			for (int var15 = 0; var15 < Varcs.field1454.length; ++var15) {
				for (int var16 = 0; var16 < VertexNormal.field2318.length; ++var16) {
					File var17 = new File(VertexNormal.field2318[var16] + Varcs.field1454[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && RestClientThreadFactory.method204(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label328;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = class166.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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
				AccessFile var35 = new AccessFile(class36.field217, "rw", 10000L);
				Buffer var36 = new Buffer(500);
				var36.writeByte(3);
				var36.writeByte(var8 != null ? 1 : 0);
				var36.writeCESU8(var32.getPath());
				if (var8 != null) {
					var36.writeCESU8("");
				}

				var35.write(var36.array, 0, var36.offset * -2066221813);
				var35.close();
			} catch (IOException var28) {
				var28.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-75"
	)
	static final int method3257(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
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
}
