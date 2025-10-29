import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xa")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ay")
	public static long[] field6016;
	@ObfuscatedName("au")
	static int[] field6017;
	@ObfuscatedName("az")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ad")
	@Export("offset")
	@ObfuscatedGetter(
		intValue = 2108391709
	)
	public int offset;

	static {
		field6016 = new long[256];
		field6017 = new int[256];

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

			field6017[var1] = var4;
		}

		for (var2 = 0; var2 < 256; ++var2) {
			long var0 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if (1L == (var0 & 1L)) {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}

			field6016[var2] = var0;
		}

	}

	public Buffer(int var1, boolean var2) {
		this.method11647(var1, var2);
	}

	public Buffer(int var1) {
		byte[] var2 = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, false);
		this.array = var2;
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("releaseArray")
	void releaseArray() {
		if (this.array != null) {
			class372.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1962716857"
	)
	void method11647(int var1, boolean var2) {
		this.releaseArray();
		this.array = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, var2);
		this.offset = 0;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15420"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2026164095"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145437173"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "707622539"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
	}

	@ObfuscatedName("ck")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 40));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 32));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 24));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 16));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 8));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("cc")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 56));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 48));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 40));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 32));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 24));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 16));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)(var1 >> 8));
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "88"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "998990159"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += class459.encodeStringCp1252(var1, 0, var1.length(), this.array, 2108391709 * this.offset) * 1741769013;
			this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "731661595"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
			this.offset += class459.encodeStringCp1252(var1, 0, var1.length(), this.array, 2108391709 * this.offset) * 1741769013;
			this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-671176567"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class498.method10136(var1);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
		this.writeVarInt(var2);
		this.offset += class431.method8837(this.array, 2108391709 * this.offset, var1) * 1741769013;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1187258379"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[(this.offset += 1741769013) * 2108391709 - 1] = var1[var4];
		}

	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1488881614"
	)
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset * 2108391709);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1708490112"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset * 2108391709 - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset * 2108391709 - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset * 2108391709 - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset * 2108391709 - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset * 2108391709 - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset * 2108391709 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2085039976"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset * 2108391709 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-726685052"
	)
	void method11662(int var1) {
		while (var1 < 0 || var1 > 127) {
			this.writeByte(128 | var1 & 127);
			var1 >>>= 7;
		}

		this.writeByte(var1);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2095903573"
	)
	public void method11623(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.method11662(var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-11030725"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[(this.offset += 1741769013) * 2108391709 - 1] & 255;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "29"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[(this.offset += 1741769013) * 2108391709 - 1];
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += -811429270;
		return ((this.array[this.offset * 2108391709 - 2] & 255) << 8) + (this.array[this.offset * 2108391709 - 1] & 255);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += -811429270;
		int var1 = (this.array[this.offset * 2108391709 - 1] & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "415804693"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 930339743;
		return ((this.array[this.offset * 2108391709 - 2] & 255) << 8) + ((this.array[this.offset * 2108391709 - 3] & 255) << 16) + (this.array[this.offset * 2108391709 - 1] & 255);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907484938"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += -1622858540;
		return ((this.array[this.offset * 2108391709 - 2] & 255) << 8) + ((this.array[this.offset * 2108391709 - 4] & 255) << 24) + ((this.array[this.offset * 2108391709 - 3] & 255) << 16) + (this.array[this.offset * 2108391709 - 1] & 255);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1876967980"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "148945505"
	)
	public float method11642() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2004535120"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "792604665"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset * 2108391709] == 0) {
			this.offset += 1741769013;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1791062770"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset * 2108391709;

		while (this.array[(this.offset += 1741769013) * 2108391709 - 1] != 0) {
		}

		int var2 = this.offset * 2108391709 - var1 - 1;
		return var2 == 0 ? "" : RouteStrategy.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1115433129"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset * 2108391709;

			while (this.array[(this.offset += 1741769013) * 2108391709 - 1] != 0) {
			}

			int var3 = this.offset * 2108391709 - var2 - 1;
			return var3 == 0 ? "" : RouteStrategy.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1960788898"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset * 2108391709 > this.array.length) {
				throw new IllegalStateException("");
			} else {
				String var3 = class228.method5079(this.array, this.offset * 2108391709, var2);
				this.offset += var2 * 1741769013;
				return var3;
			}
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "66"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[(this.offset += 1741769013) * 2108391709 - 1];
		}

	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1344439755"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset * 2108391709] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1165629396"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset * 2108391709] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1212883843"
	)
	@Export("readShortSmartSub")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset * 2108391709] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-496650014"
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

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1497980145"
	)
	@Export("readLargeSmart")
	public int readLargeSmart() {
		return this.array[this.offset * 2108391709] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1408083472"
	)
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		if (this.array[this.offset * 2108391709] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1493126422"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "424130914"
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

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1425476520"
	)
	@Export("writeIntME")
	public int writeIntME() {
		int var1 = this.packBytesToInt();
		return var1 >>> 1 ^ -(var1 & 1);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "24115"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset * 2108391709 / 8;
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

			this.offset -= 1049250216;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "113"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset * 2108391709 / 8;
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

			this.offset -= 1049250216;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "73"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset * 2108391709;
		this.offset = var2 * 1741769013;
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

			this.offset -= 1049250216;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4 * 1741769013;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-13"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset * 2108391709;
		this.offset = var2 * 1741769013;
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

			this.offset -= 1049250216;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4 * 1741769013;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "90"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset * 2108391709;
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

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1693282382"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array;
		int var4 = this.offset * 2108391709;
		int var5 = -1;

		for (int var6 = var1; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field6017[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		this.writeInt(var5);
		return var5;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2115171660"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= -1622858540;
		byte[] var2 = this.array;
		int var3 = this.offset * 2108391709;
		int var4 = -1;

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4 = var4 >>> 8 ^ field6017[(var4 ^ var2[var5]) & 255];
		}

		var4 = ~var4;
		var5 = this.readInt();
		return var5 == var4;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1374553641"
	)
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "338397670"
	)
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-22454"
	)
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1657033841"
	)
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		return this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128 & 255;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "29557685"
	)
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		return 0 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 255;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		return 128 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 255;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-13"
	)
	@Export("readByteAdd")
	public byte readByteAdd() {
		return (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "344605225"
	)
	@Export("readByteNeg")
	public byte readByteNeg() {
		return (byte)(0 - this.array[(this.offset += 1741769013) * 2108391709 - 1]);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-639471049"
	)
	@Export("readByteSub")
	public byte readByteSub() {
		return (byte)(128 - this.array[(this.offset += 1741769013) * 2108391709 - 1]);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1863428325"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2079885139"
	)
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1146507527"
	)
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-3"
	)
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		this.offset += -811429270;
		return ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + (this.array[this.offset * 2108391709 - 2] & 255);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1156088784"
	)
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		this.offset += -811429270;
		return (this.array[this.offset * 2108391709 - 1] - 128 & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 8);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1021854631"
	)
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.offset += -811429270;
		return ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + (this.array[this.offset * 2108391709 - 2] - 128 & 255);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2121151374"
	)
	@Export("readShortLE")
	public int readShortLE() {
		this.offset += -811429270;
		int var1 = ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + (this.array[this.offset * 2108391709 - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "900601211"
	)
	@Export("readSignedShort")
	public int readSignedShort() {
		this.offset += -811429270;
		int var1 = (this.array[this.offset * 2108391709 - 1] - 128 & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-57"
	)
	public int method11682() {
		this.offset += -811429270;
		int var1 = ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + (this.array[this.offset * 2108391709 - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method11683(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method11684() {
		this.offset += 930339743;
		return (this.array[this.offset * 2108391709 - 3] & 255) + ((this.array[this.offset * 2108391709 - 1] & 255) << 16) + ((this.array[this.offset * 2108391709 - 2] & 255) << 8);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "49"
	)
	public int method11685() {
		this.offset += 930339743;
		return ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + ((this.array[this.offset * 2108391709 - 3] & 255) << 16) + (this.array[this.offset * 2108391709 - 2] & 255);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "877004632"
	)
	public int method11686() {
		this.offset += 930339743;
		return ((this.array[this.offset * 2108391709 - 3] & 255) << 8) + (this.array[this.offset * 2108391709 - 1] & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 16);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "833859808"
	)
	public int method11687() {
		this.offset += 930339743;
		int var1 = (this.array[this.offset * 2108391709 - 3] & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 8) + ((this.array[this.offset * 2108391709 - 1] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1444991285"
	)
	public int method11663() {
		this.offset += 930339743;
		int var1 = ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + ((this.array[this.offset * 2108391709 - 3] & 255) << 16) + (this.array[this.offset * 2108391709 - 2] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1624929588"
	)
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1487331231"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "783375377"
	)
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
		this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1370916521"
	)
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		this.offset += -1622858540;
		return ((this.array[this.offset * 2108391709 - 3] & 255) << 8) + ((this.array[this.offset * 2108391709 - 2] & 255) << 16) + ((this.array[this.offset * 2108391709 - 1] & 255) << 24) + (this.array[this.offset * 2108391709 - 4] & 255);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1303899069"
	)
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.offset += -1622858540;
		return ((this.array[this.offset * 2108391709 - 4] & 255) << 8) + ((this.array[this.offset * 2108391709 - 1] & 255) << 16) + (this.array[this.offset * 2108391709 - 3] & 255) + ((this.array[this.offset * 2108391709 - 2] & 255) << 24);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1607481041"
	)
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.offset += -1622858540;
		return ((this.array[this.offset * 2108391709 - 1] & 255) << 8) + ((this.array[this.offset * 2108391709 - 3] & 255) << 24) + ((this.array[this.offset * 2108391709 - 4] & 255) << 16) + (this.array[this.offset * 2108391709 - 2] & 255);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "23"
	)
	public void method11695(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[(this.offset += 1741769013) * 2108391709 - 1];
		}

	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "88"
	)
	public void method11694(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
		}

	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1425102174"
	)
	public void method11697(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
		}

	}
}
