import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static class114 field1320;
	@ObfuscatedName("ab")
	int field1315;
	@ObfuscatedName("at")
	int field1319;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	class108 field1316;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lee;"
	)
	@Export("instruments")
	final Instrument[] instruments;
	@ObfuscatedName("af")
	@Export("start")
	int start;
	@ObfuscatedName("ae")
	@Export("end")
	int end;

	static {
		field1320 = new class114();
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;ILeg;)V"
	)
	SoundEffect(Buffer var1, int var2, class108 var3) {
		this.instruments = new Instrument[10];
		this.field1319 = var2;
		this.field1316 = var3;
		if (var2 == 0) {
			this.method3120(var1);
		} else {
			if (var2 != 1) {
				throw new RuntimeException("Invalid fileId for SFX");
			}

			var3.method3444(var1);
			this.field1315 = var3.method3470();
			this.start = var3.method3446();
			this.end = var3.method3449();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void method3120(Buffer var1) {
		this.field1315 = 22050;

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 != 0) {
				--var1.offset;
				this.instruments[var2] = new Instrument();
				this.instruments[var2].decode(var1);
			}
		}

		this.start = var1.readUnsignedShort();
		this.end = var1.readUnsignedShort();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldi;"
	)
	public RawSound method3108(boolean var1) {
		short[] var2 = this.mix(var1);
		RawSound var3 = new RawSound(this.field1315, var2, this.field1315 * this.start / 1000, this.field1315 * this.end / 1000, false, var1);
		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("toRawSound")
	public RawSound toRawSound() {
		return this.field1319 == 0 ? this.method3108(false) : this.field1316.method3448();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldi;"
	)
	public RawSound method3110(boolean var1) {
		return this.field1319 == 0 ? this.method3108(var1) : this.field1316.method3448();
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

	@ObfuscatedName("ae")
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
			var3 = var2 * this.field1315 / 1000;
			short[] var4 = new short[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.instruments[var5] != null) {
					int var6 = this.instruments[var5].duration * this.field1315 / 1000;
					int var7 = this.instruments[var5].offset * this.field1315 / 1000;
					int[] var8 = this.instruments[var5].method3551(var6, this.instruments[var5].duration, this.field1315);
					int var9;
					int var10;
					if (var1) {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = (var8[var9] >> 8) + var4[var9 + var7];
							var10 = KeyHandler.method396(-128, 127, var10);
							var4[var9 + var7] = (short)((byte)var10);
						}
					} else {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = var8[var9] + var4[var9 + var7];
							var10 = KeyHandler.method396(-32768, 32767, var10);
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
		descriptor = "(Lpe;II)Ldz;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		class108 var3 = new class108(field1320);
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
				var3.method3461(var4, 4);
				var5.offset = var6 + 4;
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
