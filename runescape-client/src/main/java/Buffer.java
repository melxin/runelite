import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("au")
	@Export("SpriteBuffer_spriteHeights")
	public static long[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("ai")
	static int[] field5918;
	@ObfuscatedName("aa")
	public byte[] field5916;
	@ObfuscatedName("am")
	@Export("array")
	@ObfuscatedGetter(
		intValue = 1216585693
	)
	public int array;

	static {
		SpriteBuffer_spriteHeights = new long[256];
		field5918 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var4 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var4 & 1) == 1) {
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1;
				}
			}

			field5918[var1] = var4;
		}

		for (var2 = 0; var2 < 256; ++var2) {
			long var0 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var0 & 1L) == 1L) {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}

			SpriteBuffer_spriteHeights[var2] = var0;
		}

	}

	public Buffer(int var1, boolean var2) {
		this.method11175(var1, var2);
	}

	public Buffer(int var1) {
		this.field5916 = class137.method3661(var1);
		this.array = 0;
	}

	public Buffer(byte[] var1) {
		this.field5916 = var1;
		this.array = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("releaseArray")
	void releaseArray() {
		if (this.field5916 != null) {
			WorldMapSection1.ByteArrayPool_release(this.field5916);
		}

		this.field5916 = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-620775171"
	)
	void method11175(int var1, boolean var2) {
		this.releaseArray();
		this.field5916 = class403.ByteArrayPool_getArrayBool(var1, var2);
		this.array = 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-73"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1788367333"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-592596333"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1216921951"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
	}

	@ObfuscatedName("bv")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 40));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 32));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 24));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 16));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 8));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bj")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 56));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 48));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 40));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 32));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 24));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 16));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 8));
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "995519023"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-110"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array += class273.encodeStringCp1252(var1, 0, var1.length(), this.field5916, 1216585693 * this.array) * -290410379;
			this.field5916[(this.array += -290410379) * 1216585693 - 1] = 0;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "68"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field5916[(this.array += -290410379) * 1216585693 - 1] = 0;
			this.array += class273.encodeStringCp1252(var1, 0, var1.length(), this.field5916, this.array * 1216585693) * -290410379;
			this.field5916[(this.array += -290410379) * 1216585693 - 1] = 0;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "1"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class207.method4519(var1);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = 0;
		this.writeVarInt(var2);
		int var3 = this.array;
		byte[] var5 = this.field5916;
		int var6 = this.array * 1216585693;
		int var7 = var1.length();
		int var8 = var6;

		for (int var9 = 0; var9 < var7; ++var9) {
			char var10 = var1.charAt(var9);
			if (var10 <= 127) {
				var5[var8++] = (byte)var10;
			} else if (var10 <= 2047) {
				var5[var8++] = (byte)(192 | var10 >> 6);
				var5[var8++] = (byte)(128 | var10 & '?');
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f');
				var5[var8++] = (byte)(128 | var10 >> 6 & 63);
				var5[var8++] = (byte)(128 | var10 & '?');
			}
		}

		int var4 = var8 - var6;
		this.array = var4 * -290410379 + var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-327455358"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.field5916[(this.array += -290410379) * 1216585693 - 1] = var1[var4];
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-587312583"
	)
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.field5916, 0, var1.array * 1216585693);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1789700528"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field5916[this.array * 1216585693 - var1 - 4] = (byte)(var1 >> 24);
			this.field5916[this.array * 1216585693 - var1 - 3] = (byte)(var1 >> 16);
			this.field5916[this.array * 1216585693 - var1 - 2] = (byte)(var1 >> 8);
			this.field5916[this.array * 1216585693 - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1590303875"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field5916[this.array * 1216585693 - var1 - 2] = (byte)(var1 >> 8);
			this.field5916[this.array * 1216585693 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field5916[this.array * 1216585693 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1904864344"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128);
				}

				this.writeByte(var1 >>> 14 | 128);
			}

			this.writeByte(var1 >>> 7 | 128);
		}

		this.writeByte(var1 & 127);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-962568706"
	)
	void method11194(int var1) {
		while (var1 < 0 || var1 > 127) {
			this.writeByte(128 | var1 & 127);
			var1 >>>= 7;
		}

		this.writeByte(var1);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2009520810"
	)
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.method11194(var1);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.field5916[(this.array += -290410379) * 1216585693 - 1] & 255;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2036678009"
	)
	@Export("readByte")
	public byte readByte() {
		return this.field5916[(this.array += -290410379) * 1216585693 - 1];
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1767223356"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.array += -580820758;
		return (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("readShort")
	public int readShort() {
		this.array += -580820758;
		int var1 = (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915086141"
	)
	@Export("readMedium")
	public int readMedium() {
		this.array += -871231137;
		return (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 16) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "678074504"
	)
	@Export("readInt")
	public int readInt() {
		this.array += -871231137;
		int var1 = (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 16) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1358414633"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		this.array += -1161641516;
		return (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8) + ((this.field5916[this.array * 1216585693 - 4] & 255) << 24) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 16);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "5"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readShortSmart() & 4294967295L;
		long var3 = (long)this.readShortSmart() & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1018946723"
	)
	public float method11362() {
		return Float.intBitsToFloat(this.readShortSmart());
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-109"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1297997464"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.field5916[this.array * 1216585693] == 0) {
			this.array += -290410379;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-59"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.array * 1216585693;

		while (this.field5916[(this.array += -290410379) * 1216585693 - 1] != 0) {
		}

		int var2 = this.array * 1216585693 - var1 - 1;
		return var2 == 0 ? "" : FloorOverlayDefinition.decodeStringCp1252(this.field5916, var1, var2);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "60"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.field5916[(this.array += -290410379) * 1216585693 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.array * 1216585693;

			while (this.field5916[(this.array += -290410379) * 1216585693 - 1] != 0) {
			}

			int var3 = this.array * 1216585693 - var2 - 1;
			return var3 == 0 ? "" : FloorOverlayDefinition.decodeStringCp1252(this.field5916, var2, var3);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.field5916[(this.array += -290410379) * 1216585693 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.packBytesToInt();
			if (var2 + this.array * 1216585693 > this.field5916.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.field5916;
				int var5 = this.array * 1216585693;
				char[] var6 = new char[var2];
				int var7 = 0;
				int var8 = var5;

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) {
					int var10 = var4[var8++] & 255;
					if (var10 < 128) {
						if (var10 == 0) {
							var11 = 65533;
						} else {
							var11 = var10;
						}
					} else if (var10 < 192) {
						var11 = 65533;
					} else if (var10 < 224) {
						if (var8 < var9 && (var4[var8] & 192) == 128) {
							var11 = (var10 & 31) << 6 | var4[var8++] & 63;
							if (var11 < 128) {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else if (var10 < 240) {
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
							if (var11 < 2048) {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else if (var10 < 248) {
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
							if (var11 >= 65536 && var11 <= 1114111) {
								var11 = 65533;
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else {
						var11 = 65533;
					}
				}

				String var3 = new String(var6, 0, var7);
				this.array += -290410379 * var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "48009855"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.field5916[(this.array += -290410379) * 1216585693 - 1];
		}

	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1340131211"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.field5916[this.array * 1216585693] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "42"
	)
	@Export("readShortSmartSub")
	public int readShortSmartSub() {
		int var1 = this.field5916[this.array * 1216585693] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1987050920"
	)
	@Export("readLargeSmart")
	public int readLargeSmart() {
		int var1 = this.field5916[this.array * 1216585693] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-375298005"
	)
	@Export("readIncrSmallSmart")
	public int readIncrSmallSmart() {
		int var1 = 0;

		int var2;
		for (var2 = this.readShortSmartSub(); var2 == 32767; var2 = this.readShortSmartSub()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1849660934"
	)
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		return this.field5916[this.array * 1216585693] < 0 ? this.readShortSmart() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-16"
	)
	@Export("readVarInt")
	public int readVarInt() {
		if (this.field5916[this.array * 1216585693] < 0) {
			return this.readShortSmart() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("packBytesToInt")
	public int packBytesToInt() {
		byte var1 = this.field5916[(this.array += -290410379) * 1216585693 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.field5916[(this.array += -290410379) * 1216585693 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1877481212"
	)
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		int var2 = 0;
		int var3 = 0;

		int var1;
		do {
			var1 = this.readUnsignedByte();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while(var1 > 127);

		return var2;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-75712416"
	)
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		int var1 = this.readUnsignedByteAdd();
		return var1 >>> 1 ^ -(var1 & 1);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1871840527"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.array * 1216585693 / 8;
		this.array = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readShortSmart();
			int var5 = this.readShortSmart();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.array -= 1971684264;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "224"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.array * 1216585693 / 8;
		this.array = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readShortSmart();
			int var5 = this.readShortSmart();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.array -= 1971684264;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1090917467"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.array * 1216585693;
		this.array = var2 * -290410379;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readShortSmart();
			int var8 = this.readShortSmart();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.array -= 1971684264;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.array = var4 * -290410379;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1335983553"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.array * 1216585693;
		this.array = var2 * -290410379;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readShortSmart();
			int var8 = this.readShortSmart();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.array -= 1971684264;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.array = var4 * -290410379;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-197749771"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.array * 1216585693;
		this.array = 0;
		byte[] var4 = new byte[var3];
		this.readBytes(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.array = 0;
		this.writeShort(var7.length);
		this.writeBytes(var7, 0, var7.length);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2023947132"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class346.method7343(this.field5916, var1, this.array * 1216585693);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-806179785"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.array -= -1161641516;
		int var1 = class346.method7343(this.field5916, 0, this.array * 1216585693);
		int var2 = this.readShortSmart();
		return var2 == var1;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1237001541"
	)
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-598220801"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1209505995"
	)
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		return this.field5916[(this.array += -290410379) * 1216585693 - 1] - 128 & 255;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1067471232"
	)
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		return 0 - this.field5916[(this.array += -290410379) * 1216585693 - 1] & 255;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1042100603"
	)
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		return 128 - this.field5916[(this.array += -290410379) * 1216585693 - 1] & 255;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "110"
	)
	@Export("readByteAdd")
	public byte readByteAdd() {
		return (byte)(this.field5916[(this.array += -290410379) * 1216585693 - 1] - 128);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2082310505"
	)
	@Export("readByteNeg")
	public byte readByteNeg() {
		return (byte)(0 - this.field5916[(this.array += -290410379) * 1216585693 - 1]);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-355932459"
	)
	@Export("readByteSub")
	public byte readByteSub() {
		return (byte)(128 - this.field5916[(this.array += -290410379) * 1216585693 - 1]);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-326263112"
	)
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2074279444"
	)
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2013052194"
	)
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-431866276"
	)
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.array += -580820758;
		return ((this.field5916[this.array * 1216585693 - 1] & 255) << 8) + (this.field5916[this.array * 1216585693 - 2] & 255);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-785303486"
	)
	@Export("readShortLE")
	public int readShortLE() {
		this.array += -580820758;
		return (this.field5916[this.array * 1216585693 - 1] - 128 & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-549805098"
	)
	@Export("readSignedShort")
	public int readSignedShort() {
		this.array += -580820758;
		return ((this.field5916[this.array * 1216585693 - 1] & 255) << 8) + (this.field5916[this.array * 1216585693 - 2] - 128 & 255);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "775317943"
	)
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		this.array += -580820758;
		int var1 = ((this.field5916[this.array * 1216585693 - 1] & 255) << 8) + (this.field5916[this.array * 1216585693 - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1763870609"
	)
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.array += -580820758;
		int var1 = (this.field5916[this.array * 1216585693 - 1] - 128 & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1880016911"
	)
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.array += -580820758;
		int var1 = (this.field5916[this.array * 1216585693 - 2] - 128 & 255) + ((this.field5916[this.array * 1216585693 - 1] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1450699290"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1328594169"
	)
	public int method11421() {
		this.array += -871231137;
		return (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 16) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 8);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1031453960"
	)
	public int method11247() {
		this.array += -871231137;
		int var1 = (this.field5916[this.array * 1216585693 - 2] & 255) + ((this.field5916[this.array * 1216585693 - 1] & 255) << 8) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	public int method11248() {
		this.array += -871231137;
		int var1 = ((this.field5916[this.array * 1216585693 - 3] & 255) << 8) + (this.field5916[this.array * 1216585693 - 1] & 255) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2146012397"
	)
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1976728026"
	)
	public void method11250(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1450609835"
	)
	public void method11234(int var1) {
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)var1;
		this.field5916[(this.array += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "98"
	)
	public int method11252() {
		this.array += -1161641516;
		return ((this.field5916[this.array * 1216585693 - 1] & 255) << 24) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 8) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 16) + (this.field5916[this.array * 1216585693 - 4] & 255);
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	public int method11295() {
		this.array += -1161641516;
		return ((this.field5916[this.array * 1216585693 - 1] & 255) << 16) + ((this.field5916[this.array * 1216585693 - 4] & 255) << 8) + ((this.field5916[this.array * 1216585693 - 2] & 255) << 24) + (this.field5916[this.array * 1216585693 - 3] & 255);
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-637976194"
	)
	public int method11254() {
		this.array += -1161641516;
		return ((this.field5916[this.array * 1216585693 - 1] & 255) << 8) + ((this.field5916[this.array * 1216585693 - 3] & 255) << 24) + ((this.field5916[this.array * 1216585693 - 4] & 255) << 16) + (this.field5916[this.array * 1216585693 - 2] & 255);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-852939771"
	)
	public void method11255(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.field5916[(this.array += -290410379) * 1216585693 - 1] - 128);
		}

	}
}
