import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ap")
	public static long[] field5599;
	@ObfuscatedName("ax")
	static int[] field5600;
	@ObfuscatedName("aw")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2066221813
	)
	@Export("offset")
	public int offset;

	static {
		field5599 = new long[256];
		field5600 = new int[256];

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

			field5600[var1] = var4;
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

			field5599[var2] = var0;
		}

	}

	public Buffer(int var1, boolean var2) {
		this.array = WorldMapIcon_1.ByteArrayPool_getArrayBool(var1, var2);
	}

	public Buffer(int var1) {
		this.array = ArchiveLoader.method2432(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			class7.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1343113283"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-756823701"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1510943814"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
	}

	@ObfuscatedName("bv")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 40));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 32));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 24));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 16));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 8));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("be")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 56));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 48));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 40));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 32));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 24));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 16));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)(var1 >> 8));
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1559609301"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "38"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += class356.encodeStringCp1252(var1, 0, var1.length(), this.array, -2066221813 * this.offset) * 29699747;
			this.array[(this.offset += 29699747) * -2066221813 - 1] = 0;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-415515328"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[(this.offset += 29699747) * -2066221813 - 1] = 0;
			this.offset += class356.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset * -2066221813) * 29699747;
			this.array[(this.offset += 29699747) * -2066221813 - 1] = 0;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "1785639253"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = ArchiveDiskActionHandler.method7628(var1);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = 0;
		this.writeVarInt(var2);
		this.offset += VarcInt.method5086(this.array, -2066221813 * this.offset, var1) * 29699747;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1865811168"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[(this.offset += 29699747) * -2066221813 - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1083651286"
	)
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset * -2066221813);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1721350718"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset * -2066221813 - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset * -2066221813 - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset * -2066221813 - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset * -2066221813 - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "793289019"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset * -2066221813 - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset * -2066221813 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset * -2066221813 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-27980"
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1526708815"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[(this.offset += 29699747) * -2066221813 - 1] & 255;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2126378890"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[(this.offset += 29699747) * -2066221813 - 1];
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1398655058"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 59399494;
		return (this.array[this.offset * -2066221813 - 1] & 255) + ((this.array[this.offset * -2066221813 - 2] & 255) << 8);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-30568"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 59399494;
		int var1 = (this.array[this.offset * -2066221813 - 1] & 255) + ((this.array[this.offset * -2066221813 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-57"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 89099241;
		return ((this.array[this.offset * -2066221813 - 2] & 255) << 8) + (this.array[this.offset * -2066221813 - 1] & 255) + ((this.array[this.offset * -2066221813 - 3] & 255) << 16);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 118798988;
		return ((this.array[this.offset * -2066221813 - 4] & 255) << 24) + ((this.array[this.offset * -2066221813 - 2] & 255) << 8) + (this.array[this.offset * -2066221813 - 1] & 255) + ((this.array[this.offset * -2066221813 - 3] & 255) << 16);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "448503072"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-23"
	)
	public float method10305() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "40"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset * -2066221813] == 0) {
			this.offset += 29699747;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1066259959"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset * -2066221813;

		while (this.array[(this.offset += 29699747) * -2066221813 - 1] != 0) {
		}

		int var2 = this.offset * -2066221813 - var1 - 1;
		return var2 == 0 ? "" : PlayerCompositionColorTextureOverride.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "72"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[(this.offset += 29699747) * -2066221813 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset * -2066221813;

			while (this.array[(this.offset += 29699747) * -2066221813 - 1] != 0) {
			}

			int var3 = this.offset * -2066221813 - var2 - 1;
			return var3 == 0 ? "" : PlayerCompositionColorTextureOverride.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-21"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[(this.offset += 29699747) * -2066221813 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset * -2066221813 > this.array.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array;
				int var5 = this.offset * -2066221813;
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
				this.offset += 29699747 * var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1313261591"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[(this.offset += 29699747) * -2066221813 - 1];
		}

	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-214795105"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset * -2066221813] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1854675112"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset * -2066221813] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "617684205"
	)
	@Export("readShortSmartSub")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset * -2066221813] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-959692548"
	)
	@Export("readIncrSmallSmart")
	public int readIncrSmallSmart() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1305999231"
	)
	@Export("readLargeSmart")
	public int readLargeSmart() {
		return this.array[this.offset * -2066221813] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1798115445"
	)
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		if (this.array[this.offset * -2066221813] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[(this.offset += 29699747) * -2066221813 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += 29699747) * -2066221813 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("packBytesToInt")
	public int packBytesToInt() {
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "640251418"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset * -2066221813 / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.offset -= 237597976;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1704002092"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset * -2066221813 / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 237597976;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "6"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset * -2066221813;
		this.offset = var2 * 29699747;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.offset -= 237597976;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4 * 29699747;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "2092292791"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset * -2066221813;
		this.offset = var2 * 29699747;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 237597976;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4 * 29699747;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-269112703"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset * -2066221813;
		this.offset = 0;
		byte[] var4 = new byte[var3];
		this.readBytes(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.offset = 0;
		this.writeShort(var7.length);
		this.writeBytes(var7, 0, var7.length);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1181387674"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = WorldView.method2877(this.array, var1, this.offset * -2066221813);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1751868888"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 118798988;
		byte[] var2 = this.array;
		int var3 = this.offset * -2066221813;
		int var4 = -1;

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4 = var4 >>> 8 ^ field5600[(var4 ^ var2[var5]) & 255];
		}

		var4 = ~var4;
		var5 = this.readInt();
		return var4 == var5;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1593033863"
	)
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "160280479"
	)
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1663130400"
	)
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2099115864"
	)
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		return this.array[(this.offset += 29699747) * -2066221813 - 1] - 128 & 255;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "732553818"
	)
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		return 0 - this.array[(this.offset += 29699747) * -2066221813 - 1] & 255;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1526870373"
	)
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		return 128 - this.array[(this.offset += 29699747) * -2066221813 - 1] & 255;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1708406531"
	)
	@Export("readByteAdd")
	public byte readByteAdd() {
		return (byte)(this.array[(this.offset += 29699747) * -2066221813 - 1] - 128);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-59"
	)
	@Export("readByteNeg")
	public byte readByteNeg() {
		return (byte)(0 - this.array[(this.offset += 29699747) * -2066221813 - 1]);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "0"
	)
	@Export("readByteSub")
	public byte readByteSub() {
		return (byte)(128 - this.array[(this.offset += 29699747) * -2066221813 - 1]);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1403226259"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-84219920"
	)
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-546472608"
	)
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 + 128);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "136"
	)
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		this.offset += 59399494;
		return ((this.array[this.offset * -2066221813 - 1] & 255) << 8) + (this.array[this.offset * -2066221813 - 2] & 255);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-953986572"
	)
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		this.offset += 59399494;
		return (this.array[this.offset * -2066221813 - 1] - 128 & 255) + ((this.array[this.offset * -2066221813 - 2] & 255) << 8);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.offset += 59399494;
		return (this.array[this.offset * -2066221813 - 2] - 128 & 255) + ((this.array[this.offset * -2066221813 - 1] & 255) << 8);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-816842342"
	)
	@Export("readShortLE")
	public int readShortLE() {
		this.offset += 59399494;
		int var1 = ((this.array[this.offset * -2066221813 - 1] & 255) << 8) + (this.array[this.offset * -2066221813 - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "42"
	)
	@Export("readSignedShort")
	public int readSignedShort() {
		this.offset += 59399494;
		int var1 = (this.array[this.offset * -2066221813 - 2] - 128 & 255) + ((this.array[this.offset * -2066221813 - 1] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "641045178"
	)
	public void method10280(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-92"
	)
	public int method10416() {
		this.offset += 89099241;
		return ((this.array[this.offset * -2066221813 - 2] & 255) << 8) + (this.array[this.offset * -2066221813 - 3] & 255) + ((this.array[this.offset * -2066221813 - 1] & 255) << 16);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-194563356"
	)
	public int method10282() {
		this.offset += 89099241;
		int var1 = ((this.array[this.offset * -2066221813 - 1] & 255) << 16) + (this.array[this.offset * -2066221813 - 3] & 255) + ((this.array[this.offset * -2066221813 - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-774097659"
	)
	public int method10324() {
		this.offset += 89099241;
		int var1 = ((this.array[this.offset * -2066221813 - 1] & 255) << 8) + (this.array[this.offset * -2066221813 - 2] & 255) + ((this.array[this.offset * -2066221813 - 3] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2094998397"
	)
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15265"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1269094191"
	)
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)var1;
		this.array[(this.offset += 29699747) * -2066221813 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1009340913"
	)
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		this.offset += 118798988;
		return ((this.array[this.offset * -2066221813 - 1] & 255) << 24) + ((this.array[this.offset * -2066221813 - 3] & 255) << 8) + (this.array[this.offset * -2066221813 - 4] & 255) + ((this.array[this.offset * -2066221813 - 2] & 255) << 16);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.offset += 118798988;
		return (this.array[this.offset * -2066221813 - 3] & 255) + ((this.array[this.offset * -2066221813 - 1] & 255) << 16) + ((this.array[this.offset * -2066221813 - 4] & 255) << 8) + ((this.array[this.offset * -2066221813 - 2] & 255) << 24);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "921140593"
	)
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.offset += 118798988;
		return ((this.array[this.offset * -2066221813 - 3] & 255) << 24) + ((this.array[this.offset * -2066221813 - 4] & 255) << 16) + ((this.array[this.offset * -2066221813 - 1] & 255) << 8) + (this.array[this.offset * -2066221813 - 2] & 255);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-81"
	)
	public void method10353(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[(this.offset += 29699747) * -2066221813 - 1] - 128);
		}

	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-161863405"
	)
	public void method10526(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = (byte)(this.array[(this.offset += 29699747) * -2066221813 - 1] - 128);
		}

	}
}
