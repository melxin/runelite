import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static class114 field1291;
	@ObfuscatedName("av")
	int field1286;
	@ObfuscatedName("at")
	int field1285;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	class108 field1288;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	@Export("instruments")
	final Instrument[] instruments;
	@ObfuscatedName("aj")
	@Export("start")
	int start;
	@ObfuscatedName("ak")
	@Export("end")
	int end;

	static {
		field1291 = new class114();
	}

	@ObfuscatedSignature(
		descriptor = "(Lxa;ILes;)V"
	)
	SoundEffect(Buffer var1, int var2, class108 var3) {
		this.instruments = new Instrument[10];
		this.field1285 = var2;
		this.field1288 = var3;
		if (var2 == 0) {
			this.method3114(var1);
		} else {
			if (var2 != 1) {
				throw new RuntimeException("Invalid fileId for SFX");
			}

			var3.method3496(var1);
			this.field1286 = var3.method3493();
			this.start = var3.method3492();
			this.end = var3.method3495();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;)V"
	)
	void method3114(Buffer var1) {
		this.field1286 = 22050;

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 != 0) {
				var1.offset -= 1741769013;
				this.instruments[var2] = new Instrument();
				this.instruments[var2].decode(var1);
			}
		}

		this.start = var1.readUnsignedShort();
		this.end = var1.readUnsignedShort();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldq;"
	)
	public RawSound method3130(boolean var1) {
		short[] var2 = this.mix(var1);
		RawSound var3 = new RawSound(this.field1286, var2, this.field1286 * this.start / 1000, this.field1286 * this.end / 1000, false, var1);
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Ldq;"
	)
	@Export("toRawSound")
	public RawSound toRawSound() {
		return this.field1285 == 0 ? this.method3130(false) : this.field1288.method3506();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldq;"
	)
	public RawSound method3115(boolean var1) {
		return this.field1285 == 0 ? this.method3130(var1) : this.field1288.method3506();
	}

	@ObfuscatedName("aj")
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

	@ObfuscatedName("ak")
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
			var3 = var2 * this.field1286 / 1000;
			short[] var4 = new short[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.instruments[var5] != null) {
					int var6 = this.instruments[var5].duration * this.field1286 / 1000;
					int var7 = this.instruments[var5].offset * this.field1286 / 1000;
					int[] var8 = this.instruments[var5].method3601(var6, this.instruments[var5].duration, this.field1286);
					int var9;
					int var10;
					if (var1) {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = (var8[var9] >> 8) + var4[var9 + var7];
							var10 = class470.method9686(-128, 127, var10);
							var4[var9 + var7] = (short)((byte)var10);
						}
					} else {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = var8[var9] + var4[var9 + var7];
							var10 = class470.method9686(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqm;II)Ldx;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		class108 var3 = new class108(field1291);
		byte[] var4 = var0.takeFile(var1, var2);
		if (var4 == null) {
			return null;
		} else {
			Buffer var5 = new Buffer(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.readInt();
				var3.method3499(var4, 4);
				var5.offset = (var6 + 4) * 1741769013;
			} else {
				if (var2 != 0) {
					return null;
				}

				var5 = new Buffer(var4);
			}

			return new SoundEffect(var5, var2, var3);
		}
	}
}
