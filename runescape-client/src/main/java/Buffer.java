import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("aa")
	public static long[] field5980;
	@ObfuscatedName("ap")
	public static int[] field5981;
	@ObfuscatedName("ad")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 140499425
	)
	@Export("offset")
	public int offset;

	static {
		field5980 = new long[256];
		field5981 = new int[256];

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

			field5981[var1] = var4;
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

			field5980[var2] = var0;
		}

	}

	public Buffer(int var1, boolean var2) {
		this.method11470(var1, var2);
	}

	public Buffer(int var1) {
		byte[] var2 = GrandExchangeOffer.ByteArrayPool_getArrayBool(var1, false);
		this.array = var2;
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1445456723"
	)
	@Export("releaseArray")
	void releaseArray() {
		if (this.array != null) {
			WorldMapID.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1602393789"
	)
	void method11470(int var1, boolean var2) {
		this.releaseArray();
		this.array = GrandExchangeOffer.ByteArrayPool_getArrayBool(var1, var2);
		this.offset = 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1796774148"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "366067738"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2005005920"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bi")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bw")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-296998153"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "860056749"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += HttpMethod.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-37"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += HttpMethod.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "32"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				++var4;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var4);
		this.offset += TriBool.method10171(this.array, this.offset, var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-36"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-74"
	)
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1750765776"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "784139051"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-966757725"
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	void method11376(int var1) {
		while (var1 < 0 || var1 > 127) {
			this.writeByte(128 | var1 & 127);
			var1 >>>= 7;
		}

		this.writeByte(var1);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-678076398"
	)
	public void method11623(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.method11376(var1);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-27019818"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2006489224"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "12245"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "751955138"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "256"
	)
	public int method11575() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "0"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.method11575() & 4294967295L;
		long var3 = (long)this.method11575() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-2141967180"
	)
	public float method11385() {
		return Float.intBitsToFloat(this.method11575());
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "992103919"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1030415050"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : TileItem.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-71"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset;

			while (this.array[++this.offset - 1] != 0) {
			}

			int var3 = this.offset - var2 - 1;
			return var3 == 0 ? "" : TileItem.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1491226823"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array;
				int var5 = this.offset;
				char[] var6 = new char[var2];
				int var7 = 0;
				int var8 = var5;

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) {
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
				this.offset += var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1226016706"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2127314483"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1395139336"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	@Export("readShortSmartSub")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1352121489"
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

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-581787315"
	)
	@Export("readLargeSmart")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.method11575() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-37"
	)
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.method11575() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1116551857"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1822326599"
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

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1697709219"
	)
	public int method11400() {
		int var1 = this.packBytesToInt();
		return var1 >>> 1 ^ -(var1 & 1);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1028657391"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.method11575();
			int var5 = this.method11575();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1945200652"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.method11575();
			int var5 = this.method11575();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "500210372"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.method11575();
			int var8 = this.method11575();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "81"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.method11575();
			int var8 = this.method11575();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "-51"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset;
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-451678003"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array;
		int var4 = this.offset;
		int var5 = -1;

		for (int var6 = var1; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field5981[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		this.writeInt(var5);
		return var5;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "395704090"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		byte[] var2 = this.array;
		int var3 = this.offset;
		int var4 = -1;

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4 = var4 >>> 8 ^ field5981[(var4 ^ var2[var5]) & 255];
		}

		var4 = ~var4;
		var5 = this.method11575();
		return var5 == var4;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1554394994"
	)
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-5325298"
	)
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1836838380"
	)
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2086548404"
	)
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "11"
	)
	@Export("readByteNeg")
	public byte readByteNeg() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "79"
	)
	@Export("readByteSub")
	public byte readByteSub() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1303508511"
	)
	@Export("readByteAdd")
	public byte readByteAdd() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "76"
	)
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1861013956"
	)
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1179616288"
	)
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1051013649"
	)
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1097072349"
	)
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("readSignedShort")
	public int readSignedShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-55"
	)
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1792752686"
	)
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-127"
	)
	public int method11427() {
		this.offset += 3;
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method11485() {
		this.offset += 3;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "49"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1436386995"
	)
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1008918747"
	)
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261907089"
	)
	@Export("readShortLE")
	public int readShortLE() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "17186"
	)
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method11535() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "1"
	)
	public void method11475(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}
}
