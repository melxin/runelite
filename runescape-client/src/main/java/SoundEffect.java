import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("instruments")
	final Instrument[] instruments;
	@ObfuscatedName("ae")
	@Export("start")
	int start;
	@ObfuscatedName("af")
	@Export("end")
	int end;

	@ObfuscatedSignature(
		descriptor = "(Lve;)V"
	)
	SoundEffect(Buffer var1) {
		this.instruments = new Instrument[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 != 0) {
				var1.offset -= 29699747;
				this.instruments[var2] = new Instrument();
				this.instruments[var2].decode(var1);
			}
		}

		this.start = var1.readUnsignedShort();
		this.end = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)Lbj;"
	)
	public RawSound method755(boolean var1) {
		short[] var2 = this.mix(var1);
		RawSound var3 = new RawSound(22050, var2, this.start * 22050 / 1000, this.end * 22050 / 1000, false, var1);
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("toRawSound")
	RawSound toRawSound() {
		return this.method755(false);
	}

	@ObfuscatedName("af")
	@Export("calculateDelay")
	public final int calculateDelay() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.instruments[var2] != null && this.instruments[var2].offset / 20 < var1) {
				var1 = this.instruments[var2].offset / 20;
			}
		}

		if (this.start < this.end && this.start / 20 < var1) {
			var1 = this.start / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.instruments[var2] != null) {
					Instrument var10000 = this.instruments[var2];
					var10000.offset -= var1 * 20;
				}
			}

			if (this.start < this.end) {
				this.start -= var1 * 20;
				this.end -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("as")
	@Export("mix")
	final short[] mix(boolean var1) {
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < 10; ++var3) {
			if (this.instruments[var3] != null && this.instruments[var3].duration + this.instruments[var3].offset > var2) {
				var2 = this.instruments[var3].duration + this.instruments[var3].offset;
			}
		}

		if (var2 == 0) {
			return new short[0];
		} else {
			var3 = var2 * 22050 / 1000;
			short[] var4 = new short[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.instruments[var5] != null) {
					int var6 = this.instruments[var5].duration * 22050 / 1000;
					int var7 = this.instruments[var5].offset * 22050 / 1000;
					int[] var8 = this.instruments[var5].synthesize(var6, this.instruments[var5].duration);
					int var9;
					int var10;
					int var11;
					if (var1) {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = (var8[var9] >> 8) + var4[var9 + var7];
							var11 = Math.max(-128, Math.min(var10, 127));
							var4[var9 + var7] = (short)((byte)var11);
						}
					} else {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = var8[var9] + var4[var9 + var7];
							var11 = Math.max(-32768, Math.min(var10, 32767));
							var4[var9 + var7] = (short)var11;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;II)Lbx;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		return var3 == null ? null : new SoundEffect(new Buffer(var3));
	}
}
