import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 272079507
	)
	static int field2625;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -526275005
	)
	@Export("count")
	int count;
	@ObfuscatedName("ah")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ap")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	class225 field2626;

	public Skeleton(int var1, byte[] var2) {
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.field5818 < var3.offset.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2626 = new class225(var3, var4);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-216913603"
	)
	public int method5066() {
		return this.count;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lii;",
		garbageValue = "-582314828"
	)
	public class225 method5072() {
		return this.field2626;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhz;",
		garbageValue = "512"
	)
	public static SpotAnimationDefinition method5071(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.field2160.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-1049776610"
	)
	static File method5073(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		class27.field121 = new File(class502.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var16;
		File var38;
		if (class27.field121.exists()) {
			AccessFile var7 = null;

			try {
				var7 = new AccessFile(class27.field121, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.field5818 < var8.offset.length; var8.field5818 += var9) {
					var9 = var7.read(var8.offset, var8.field5818, var8.offset.length - var8.field5818);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.field5818 = 0;
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
			label357:
			for (int var17 = 0; var17 < class427.field4969.length; ++var17) {
				for (int var18 = 0; var18 < HttpMethod.field41.length; ++var18) {
					File var19 = new File(HttpMethod.field41[var18] + class427.field4969[var17] + File.separatorChar + var0 + File.separatorChar);
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
							break label357;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = class502.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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
				AccessFile var45 = new AccessFile(class27.field121, "rw", 10000L);
				Buffer var43 = new Buffer(500);
				var43.writeByte(3);
				var43.writeByte(var8 != null ? 1 : 0);
				var43.writeCESU8(var37.getPath());
				if (var8 != null) {
					var43.writeCESU8("");
				}

				var45.write(var43.offset, 0, var43.field5818);
				var45.close();
			} catch (IOException var31) {
				var31.printStackTrace();
			}
		}

		return new File(var4);
	}
}
