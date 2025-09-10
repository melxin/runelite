import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static class115 field1316;
	@ObfuscatedName("af")
	int field1320;
	@ObfuscatedName("aw")
	int field1317;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	class109 field1315;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lep;"
	)
	@Export("instruments")
	final Instrument[] instruments;
	@ObfuscatedName("aq")
	@Export("start")
	int start;
	@ObfuscatedName("ao")
	@Export("end")
	int end;

	static {
		field1316 = new class115();
	}

	@ObfuscatedSignature(
		descriptor = "(Lwb;ILew;)V"
	)
	SoundEffect(Buffer var1, int var2, class109 var3) {
		this.instruments = new Instrument[10];
		this.field1317 = var2;
		this.field1315 = var3;
		if (var2 == 0) {
			this.method3005(var1);
		} else {
			if (var2 != 1) {
				throw new RuntimeException("Invalid fileId for SFX");
			}

			var3.method3395(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	void method3005(Buffer var1) {
		this.field1320 = 22050;

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 != 0) {
				var1.offset -= -290410379;
				this.instruments[var2] = new Instrument();
				this.instruments[var2].decode(var1);
			}
		}

		this.start = var1.readUnsignedShort();
		this.end = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldv;"
	)
	public RawSound method3003(boolean var1) {
		short[] var2 = this.mix(var1);
		RawSound var3 = new RawSound(this.field1320, var2, this.field1320 * this.start / 1000, this.field1320 * this.end / 1000, false, var1);
		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldv;"
	)
	@Export("toRawSound")
	RawSound toRawSound() {
		return this.field1317 == 0 ? this.method3003(false) : this.field1315.method3394();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldv;"
	)
	public RawSound method3013(boolean var1) {
		return this.field1317 == 0 ? this.method3003(var1) : this.field1315.method3394();
	}

	@ObfuscatedName("aq")
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

	@ObfuscatedName("ao")
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
			var3 = var2 * this.field1320 / 1000;
			short[] var4 = new short[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.instruments[var5] != null) {
					int var6 = this.instruments[var5].duration * this.field1320 / 1000;
					int var7 = this.instruments[var5].offset * this.field1320 / 1000;
					int[] var8 = this.instruments[var5].method3472(var6, this.instruments[var5].duration, this.field1320);
					int var9;
					int var10;
					if (var1) {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = (var8[var9] >> 8) + var4[var9 + var7];
							var10 = WorldEntity.method10135(-128, 127, var10);
							var4[var9 + var7] = (short)((byte)var10);
						}
					} else {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = var8[var9] + var4[var9 + var7];
							var10 = WorldEntity.method10135(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Ldl;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		class109 var3 = new class109(field1316);
		byte[] var4 = var0.takeFile(var1, var2);
		if (var4 == null) {
			return null;
		} else {
			Buffer var5 = new Buffer(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.method1958();
				var3.method3397(var4, 4);
				var5.offset = (var6 + 4) * -290410379;
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
