import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
@Implements("ArchiveDisk")
public final class ArchiveDisk {
	@ObfuscatedName("ab")
	@Export("ArchiveDisk_buffer")
	static byte[] ArchiveDisk_buffer;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("datFile")
	BufferedFile datFile;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("idxFile")
	BufferedFile idxFile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1596930259
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1617309495
	)
	@Export("maxEntrySize")
	int maxEntrySize;

	static {
		ArchiveDisk_buffer = new byte[520];
	}

	@ObfuscatedSignature(
		descriptor = "(ILvy;Lvy;I)V"
	)
	public ArchiveDisk(int var1, BufferedFile var2, BufferedFile var3, int var4) {
		this.datFile = null;
		this.idxFile = null;
		this.maxEntrySize = 65000;
		this.archive = var1;
		this.datFile = var2;
		this.idxFile = var3;
		this.maxEntrySize = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "78"
	)
	@Export("read")
	public byte[] read(int var1) {
		synchronized(this.datFile) {
			try {
				Object var10000;
				if (this.idxFile.length() < (long)(var1 * 6 + 6)) {
					var10000 = null;
					return (byte[])var10000;
				} else {
					this.idxFile.seek((long)(var1 * 6));
					this.idxFile.read(ArchiveDisk_buffer, 0, 6);
					int var3 = ((ArchiveDisk_buffer[0] & 255) << 16) + (ArchiveDisk_buffer[2] & 255) + ((ArchiveDisk_buffer[1] & 255) << 8);
					int var4 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8);
					if (var3 < 0 || var3 > this.maxEntrySize) {
						var10000 = null;
						return (byte[])var10000;
					} else if (var4 <= 0 || (long)var4 > this.datFile.length() / 520L) {
						var10000 = null;
						return (byte[])var10000;
					} else {
						byte[] var5 = new byte[var3];
						int var6 = 0;

						for (int var7 = 0; var6 < var3; ++var7) {
							if (var4 == 0) {
								var10000 = null;
								return (byte[])var10000;
							}

							this.datFile.seek(520L * (long)var4);
							int var8 = var3 - var6;
							int var9;
							int var10;
							int var11;
							int var12;
							byte var13;
							if (var1 > 65535) {
								if (var8 > 510) {
									var8 = 510;
								}

								var13 = 10;
								this.datFile.read(ArchiveDisk_buffer, 0, var13 + var8);
								var9 = ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24) + (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8);
								var10 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
								var11 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16);
								var12 = ArchiveDisk_buffer[9] & 255;
							} else {
								if (var8 > 512) {
									var8 = 512;
								}

								var13 = 8;
								this.datFile.read(ArchiveDisk_buffer, 0, var8 + var13);
								var9 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8);
								var10 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8);
								var11 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
								var12 = ArchiveDisk_buffer[7] & 255;
							}

							if (var9 != var1 || var10 != var7 || var12 != this.archive) {
								var10000 = null;
								return (byte[])var10000;
							}

							if (var11 < 0 || (long)var11 > this.datFile.length() / 520L) {
								var10000 = null;
								return (byte[])var10000;
							}

							int var14 = var13 + var8;

							for (int var15 = var13; var15 < var14; ++var15) {
								var5[var6++] = ArchiveDisk_buffer[var15];
							}

							var4 = var11;
						}

						byte[] var20 = var5;
						return var20;
					}
				}
			} catch (IOException var18) {
				return null;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[BII)Z",
		garbageValue = "229118123"
	)
	@Export("write")
	public boolean write(int var1, byte[] var2, int var3) {
		synchronized(this.datFile) {
			if (var3 >= 0 && var3 <= this.maxEntrySize) {
				boolean var5 = this.write0(var1, var2, var3, true);
				if (!var5) {
					var5 = this.write0(var1, var2, var3, false);
				}

				return var5;
			} else {
				throw new IllegalArgumentException("" + this.archive + ',' + var1 + ',' + var3);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[BIZI)Z",
		garbageValue = "2032478115"
	)
	@Export("write0")
	boolean write0(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.datFile) {
			try {
				int var6;
				boolean var10000;
				if (var4) {
					if (this.idxFile.length() < (long)(var1 * 6 + 6)) {
						var10000 = false;
						return var10000;
					}

					this.idxFile.seek((long)(var1 * 6));
					this.idxFile.read(ArchiveDisk_buffer, 0, 6);
					var6 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8);
					if (var6 <= 0 || (long)var6 > this.datFile.length() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var6 = (int)((this.datFile.method11088().length() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}

				int var7 = 0;
				int var8 = 0;

				for (int var9 = var6; var7 < var3; ++var8) {
					int var10 = 0;
					int var11;
					if (var4) {
						this.datFile.seek(520L * (long)var9);
						int var12;
						int var13;
						if (var1 > 65535) {
							this.datFile.read(ArchiveDisk_buffer, 0, 10);
							var11 = ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24) + (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8);
							var12 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
							var10 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16);
							var13 = ArchiveDisk_buffer[9] & 255;
						} else {
							this.datFile.read(ArchiveDisk_buffer, 0, 8);
							var11 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8);
							var12 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8);
							var10 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
							var13 = ArchiveDisk_buffer[7] & 255;
						}

						if (var11 != var1 || var12 != var8 || var13 != this.archive) {
							var10000 = false;
							return var10000;
						}

						if (var10 < 0 || (long)var10 > this.datFile.length() / 520L) {
							var10000 = false;
							return var10000;
						}
					}

					if (var10 == 0) {
						var4 = false;
						var10 = (int)((this.datFile.method11088().length() + 519L) / 520L);
						if (var10 == 0) {
							++var10;
						}

						if (var9 == var10) {
							++var10;
						}
					}

					if (var1 > 65535) {
						if (var3 - var7 <= 510) {
							var10 = 0;
						}

						ArchiveDisk_buffer[0] = (byte)(var1 >> 24);
						ArchiveDisk_buffer[1] = (byte)(var1 >> 16);
						ArchiveDisk_buffer[2] = (byte)(var1 >> 8);
						ArchiveDisk_buffer[3] = (byte)var1;
						ArchiveDisk_buffer[4] = (byte)(var8 >> 8);
						ArchiveDisk_buffer[5] = (byte)var8;
						ArchiveDisk_buffer[6] = (byte)(var10 >> 16);
						ArchiveDisk_buffer[7] = (byte)(var10 >> 8);
						ArchiveDisk_buffer[8] = (byte)var10;
						ArchiveDisk_buffer[9] = (byte)this.archive;
						this.datFile.seek((long)var9 * 520L);
						this.datFile.write(ArchiveDisk_buffer, 0, 10);
						var11 = var3 - var7;
						if (var11 > 510) {
							var11 = 510;
						}

						this.datFile.write(var2, var7, var11);
						var7 += var11;
					} else {
						if (var3 - var7 <= 512) {
							var10 = 0;
						}

						ArchiveDisk_buffer[0] = (byte)(var1 >> 8);
						ArchiveDisk_buffer[1] = (byte)var1;
						ArchiveDisk_buffer[2] = (byte)(var8 >> 8);
						ArchiveDisk_buffer[3] = (byte)var8;
						ArchiveDisk_buffer[4] = (byte)(var10 >> 16);
						ArchiveDisk_buffer[5] = (byte)(var10 >> 8);
						ArchiveDisk_buffer[6] = (byte)var10;
						ArchiveDisk_buffer[7] = (byte)this.archive;
						this.datFile.seek(520L * (long)var9);
						this.datFile.write(ArchiveDisk_buffer, 0, 8);
						var11 = var3 - var7;
						if (var11 > 512) {
							var11 = 512;
						}

						this.datFile.write(var2, var7, var11);
						var7 += var11;
					}

					var9 = var10;
				}

				ArchiveDisk_buffer[0] = (byte)(var3 >> 16);
				ArchiveDisk_buffer[1] = (byte)(var3 >> 8);
				ArchiveDisk_buffer[2] = (byte)var3;
				ArchiveDisk_buffer[3] = (byte)(var6 >> 16);
				ArchiveDisk_buffer[4] = (byte)(var6 >> 8);
				ArchiveDisk_buffer[5] = (byte)var6;
				this.idxFile.seek((long)(var1 * 6));
				this.idxFile.write(ArchiveDisk_buffer, 0, 6);
				var10000 = true;
				return var10000;
			} catch (IOException var16) {
				return false;
			}
		}
	}

	public String toString() {
		return "" + this.archive;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1666111145"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class171.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class171.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class171.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
