import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("MidiFileReader")
public class MidiFileReader {
	@ObfuscatedName("aq")
	static final byte[] field3938;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("as")
	@Export("division")
	int division;
	@ObfuscatedName("al")
	@Export("trackLengths")
	int[] trackLengths;
	@ObfuscatedName("au")
	int field3935;
	@ObfuscatedName("ai")
	@Export("trackStarts")
	int[] trackStarts;
	@ObfuscatedName("aa")
	@Export("trackPositions")
	int[] trackPositions;
	@ObfuscatedName("am")
	int[] field3945;
	@ObfuscatedName("an")
	long field3941;

	static {
		field3938 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	MidiFileReader() {
		this.buffer = new Buffer((byte[])null);
	}

	@ObfuscatedName("af")
	@Export("parse")
	void parse(byte[] var1) {
		this.buffer.field5916 = var1;
		this.buffer.array = 1390863506;
		int var2 = this.buffer.readUnsignedShort();
		this.division = this.buffer.readUnsignedShort();
		this.field3935 = 500000;
		this.trackStarts = new int[var2];

		Buffer var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.array += var5 * -290410379) {
			int var4 = this.buffer.readShortSmart();
			var5 = this.buffer.readShortSmart();
			if (var4 == 1297379947) {
				this.trackStarts[var3] = this.buffer.array * 1216585693;
				++var3;
			}

			var10000 = this.buffer;
		}

		this.field3941 = 0L;
		this.trackPositions = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.trackPositions[var3] = this.trackStarts[var3];
		}

		this.trackLengths = new int[var2];
		this.field3945 = new int[var2];
	}

	@ObfuscatedName("aw")
	@Export("clear")
	void clear() {
		this.buffer.field5916 = null;
		this.trackStarts = null;
		this.trackPositions = null;
		this.trackLengths = null;
		this.field3945 = null;
	}

	@ObfuscatedName("at")
	@Export("isReady")
	boolean isReady() {
		return this.buffer.field5916 != null;
	}

	@ObfuscatedName("ac")
	@Export("trackCount")
	int trackCount() {
		return this.trackPositions.length;
	}

	@ObfuscatedName("ap")
	@Export("gotoTrack")
	void gotoTrack(int var1) {
		this.buffer.array = this.trackPositions[var1] * -290410379;
	}

	@ObfuscatedName("aq")
	@Export("markTrackPosition")
	void markTrackPosition(int var1) {
		this.trackPositions[var1] = this.buffer.array * 1216585693;
	}

	@ObfuscatedName("ao")
	@Export("setTrackDone")
	void setTrackDone() {
		this.buffer.array = 290410379;
	}

	@ObfuscatedName("as")
	@Export("readTrackLength")
	void readTrackLength(int var1) {
		int var2 = this.buffer.packBytesToInt();
		int[] var10000 = this.trackLengths;
		var10000[var1] += var2;
	}

	@ObfuscatedName("al")
	@Export("readMessage")
	int readMessage(int var1) {
		int var2 = this.readMessage0(var1);
		return var2;
	}

	@ObfuscatedName("au")
	@Export("readMessage0")
	int readMessage0(int var1) {
		byte var2 = this.buffer.field5916[this.buffer.array * 1216585693];
		Buffer var10000;
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3945[var1] = var5;
			var10000 = this.buffer;
			var10000.array += -290410379;
		} else {
			var5 = this.field3945[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method7273(var1, var5);
		} else {
			int var3 = this.buffer.packBytesToInt();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.buffer.field5916[this.buffer.array * 1216585693] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					var10000 = this.buffer;
					var10000.array += -290410379;
					this.field3945[var1] = var4;
					return this.method7273(var1, var4);
				}
			}

			var10000 = this.buffer;
			var10000.array += var3 * -290410379;
			return 0;
		}
	}

	@ObfuscatedName("ai")
	int method7273(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.buffer.readUnsignedByte();
			var4 = this.buffer.packBytesToInt();
			Buffer var10000;
			if (var7 == 47) {
				var10000 = this.buffer;
				var10000.array += var4 * -290410379;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.buffer.readMedium();
				var4 -= 3;
				int var6 = this.trackLengths[var1];
				this.field3941 += (long)var6 * (long)(this.field3935 - var5);
				this.field3935 = var5;
				var10000 = this.buffer;
				var10000.array += var4 * -290410379;
				return 2;
			} else {
				var10000 = this.buffer;
				var10000.array += var4 * -290410379;
				return 3;
			}
		} else {
			byte var3 = field3938[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.buffer.readUnsignedByte() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.buffer.readUnsignedByte() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("aa")
	long method7280(int var1) {
		return this.field3941 + (long)var1 * (long)this.field3935;
	}

	@ObfuscatedName("am")
	@Export("getPrioritizedTrack")
	int getPrioritizedTrack() {
		int var1 = this.trackPositions.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
				var2 = var4;
				var3 = this.trackLengths[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("an")
	@Export("isDone")
	boolean isDone() {
		int var1 = this.trackPositions.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.trackPositions[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("ar")
	@Export("reset")
	void reset(long var1) {
		this.field3941 = var1;
		int var3 = this.trackPositions.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.trackLengths[var4] = 0;
			this.field3945[var4] = 0;
			this.buffer.array = this.trackStarts[var4] * -290410379;
			this.readTrackLength(var4);
			this.trackPositions[var4] = this.buffer.array * 1216585693;
		}

	}
}
