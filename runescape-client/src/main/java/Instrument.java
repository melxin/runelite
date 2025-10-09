import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Instrument")
public class Instrument {
	@ObfuscatedName("at")
	@Export("Instrument_samples")
	static int[] Instrument_samples;
	@ObfuscatedName("ag")
	@Export("Instrument_noise")
	static int[] Instrument_noise;
	@ObfuscatedName("aj")
	@Export("Instrument_sine")
	static int[] Instrument_sine;
	@ObfuscatedName("ah")
	@Export("Instrument_phases")
	static int[] Instrument_phases;
	@ObfuscatedName("af")
	@Export("Instrument_delays")
	static int[] Instrument_delays;
	@ObfuscatedName("ae")
	@Export("Instrument_volumeSteps")
	static int[] Instrument_volumeSteps;
	@ObfuscatedName("aq")
	@Export("Instrument_pitchSteps")
	static int[] Instrument_pitchSteps;
	@ObfuscatedName("ac")
	@Export("Instrument_pitchBaseSteps")
	static int[] Instrument_pitchBaseSteps;
	@ObfuscatedName("aa")
	@Export("duration")
	int duration;
	@ObfuscatedName("ap")
	@Export("offset")
	int offset;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("pitch")
	SoundEnvelope pitch;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("volume")
	SoundEnvelope volume;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("pitchModifier")
	SoundEnvelope pitchModifier;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("pitchModifierAmplitude")
	SoundEnvelope pitchModifierAmplitude;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("volumeMultiplier")
	SoundEnvelope volumeMultiplier;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("volumeMultiplierAmplitude")
	SoundEnvelope volumeMultiplierAmplitude;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("release")
	SoundEnvelope release;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("attack")
	SoundEnvelope attack;
	@ObfuscatedName("ax")
	@Export("oscillatorVolume")
	int[] oscillatorVolume;
	@ObfuscatedName("an")
	@Export("oscillatorPitch")
	int[] oscillatorPitch;
	@ObfuscatedName("aw")
	@Export("oscillatorDelays")
	int[] oscillatorDelays;
	@ObfuscatedName("ai")
	@Export("delayTime")
	int delayTime;
	@ObfuscatedName("am")
	@Export("delayDecay")
	int delayDecay;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("filter")
	AudioFilter filter;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("filterEnvelope")
	SoundEnvelope filterEnvelope;

	static {
		Instrument_phases = new int[5];
		Instrument_delays = new int[5];
		Instrument_volumeSteps = new int[5];
		Instrument_pitchSteps = new int[5];
		Instrument_pitchBaseSteps = new int[5];
		Instrument_noise = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			Instrument_noise[var1] = (var0.nextInt() & 2) - 1;
		}

		Instrument_sine = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			Instrument_sine[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		Instrument_samples = new int[220500];
	}

	Instrument() {
		this.duration = 500;
		this.offset = 0;
		this.oscillatorVolume = new int[]{0, 0, 0, 0, 0};
		this.oscillatorPitch = new int[]{0, 0, 0, 0, 0};
		this.oscillatorDelays = new int[]{0, 0, 0, 0, 0};
		this.delayTime = 0;
		this.delayDecay = 100;
	}

	@ObfuscatedName("ab")
	final int[] method3551(int var1, int var2, int var3) {
		class478.clearIntArray(Instrument_samples, 0, var1);
		if (var2 < 10) {
			return Instrument_samples;
		} else {
			double var4 = (double)var1 / ((double)var2 + 0.0D);
			this.pitch.reset();
			this.volume.reset();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.pitchModifier != null) {
				this.pitchModifier.reset();
				this.pitchModifierAmplitude.reset();
				var6 = (int)((double)(this.pitchModifier.end - this.pitchModifier.start) * 32.768D / var4);
				var7 = (int)((double)this.pitchModifier.start * 32.768D / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.volumeMultiplier != null) {
				this.volumeMultiplier.reset();
				this.volumeMultiplierAmplitude.reset();
				var9 = (int)((double)(this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768D / var4);
				var10 = (int)((double)this.volumeMultiplier.start * 32.768D / var4);
			}

			int var12;
			for (var12 = 0; var12 < 5; ++var12) {
				if (this.oscillatorVolume[var12] != 0) {
					Instrument_phases[var12] = 0;
					Instrument_delays[var12] = (int)((double)this.oscillatorDelays[var12] * var4);
					Instrument_volumeSteps[var12] = (this.oscillatorVolume[var12] << 14) / 100;
					Instrument_pitchSteps[var12] = (int)((double)(this.pitch.end - this.pitch.start) * 32.768D * Math.pow(1.0057929410678534D, (double)this.oscillatorPitch[var12]) / var4);
					Instrument_pitchBaseSteps[var12] = (int)((double)this.pitch.start * 32.768D / var4);
				}
			}

			int var13;
			int var14;
			int var15;
			int var16;
			int[] var10000;
			for (var12 = 0; var12 < var1; ++var12) {
				var13 = this.pitch.doStep(var1);
				var14 = this.volume.doStep(var1);
				if (this.pitchModifier != null) {
					var15 = this.pitchModifier.doStep(var1);
					var16 = this.pitchModifierAmplitude.doStep(var1);
					var13 += this.evaluateWave(var8, var16, this.pitchModifier.form) >> 1;
					var8 = var8 + var7 + (var15 * var6 >> 16);
				}

				if (this.volumeMultiplier != null) {
					var15 = this.volumeMultiplier.doStep(var1);
					var16 = this.volumeMultiplierAmplitude.doStep(var1);
					var14 = var14 * ((this.evaluateWave(var11, var16, this.volumeMultiplier.form) >> 1) + 32768) >> 15;
					var11 = var11 + var10 + (var15 * var9 >> 16);
				}

				for (var15 = 0; var15 < 5; ++var15) {
					if (this.oscillatorVolume[var15] != 0) {
						var16 = Instrument_delays[var15] + var12;
						if (var16 < var1) {
							var10000 = Instrument_samples;
							var10000[var16] += this.evaluateWave(Instrument_phases[var15], var14 * Instrument_volumeSteps[var15] >> 15, this.pitch.form);
							var10000 = Instrument_phases;
							var10000[var15] += (var13 * Instrument_pitchSteps[var15] >> 16) + Instrument_pitchBaseSteps[var15];
						}
					}
				}
			}

			int var17;
			if (this.release != null) {
				this.release.reset();
				this.attack.reset();
				var12 = 0;
				boolean var20 = false;
				boolean var21 = true;

				for (var15 = 0; var15 < var1; ++var15) {
					var16 = this.release.doStep(var1);
					var17 = this.attack.doStep(var1);
					if (var21) {
						var13 = (var16 * (this.release.end - this.release.start) >> 8) + this.release.start;
					} else {
						var13 = (var17 * (this.release.end - this.release.start) >> 8) + this.release.start;
					}

					var12 += 256;
					if (var12 >= var13) {
						var12 = 0;
						var21 = !var21;
					}

					if (var21) {
						Instrument_samples[var15] = 0;
					}
				}
			}

			if (this.delayTime > 0 && this.delayDecay > 0) {
				var12 = (int)((double)this.delayTime * var4);

				for (var13 = var12; var13 < var1; ++var13) {
					var10000 = Instrument_samples;
					var10000[var13] += Instrument_samples[var13 - var12] * this.delayDecay / 100;
				}
			}

			if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
				this.filterEnvelope.reset();
				var12 = this.filterEnvelope.doStep(var1 + 1);
				var13 = this.filter.compute(0, (float)var12 / 65536.0F, var3);
				var14 = this.filter.compute(1, (float)var12 / 65536.0F, var3);
				if (var1 >= var13 + var14) {
					var15 = 0;
					var16 = var14;
					if (var14 > var1 - var13) {
						var16 = var1 - var13;
					}

					int var18;
					while (var15 < var16) {
						var17 = (int)((long)Instrument_samples[var15 + var13] * (long)AudioFilter.forwardMultiplier >> 16);

						for (var18 = 0; var18 < var13; ++var18) {
							var17 += (int)((long)Instrument_samples[var15 + var13 - 1 - var18] * (long)AudioFilter.coefficients[0][var18] >> 16);
						}

						for (var18 = 0; var18 < var15; ++var18) {
							var17 -= (int)((long)Instrument_samples[var15 - 1 - var18] * (long)AudioFilter.coefficients[1][var18] >> 16);
						}

						Instrument_samples[var15] = var17;
						var12 = this.filterEnvelope.doStep(var1 + 1);
						++var15;
					}

					boolean var22 = true;
					var16 = 128;

					while (true) {
						if (var16 > var1 - var13) {
							var16 = var1 - var13;
						}

						int var19;
						while (var15 < var16) {
							var18 = (int)((long)Instrument_samples[var15 + var13] * (long)AudioFilter.forwardMultiplier >> 16);

							for (var19 = 0; var19 < var13; ++var19) {
								var18 += (int)((long)Instrument_samples[var15 + var13 - 1 - var19] * (long)AudioFilter.coefficients[0][var19] >> 16);
							}

							for (var19 = 0; var19 < var14; ++var19) {
								var18 -= (int)((long)Instrument_samples[var15 - 1 - var19] * (long)AudioFilter.coefficients[1][var19] >> 16);
							}

							Instrument_samples[var15] = var18;
							var12 = this.filterEnvelope.doStep(var1 + 1);
							++var15;
						}

						if (var15 >= var1 - var13) {
							while (var15 < var1) {
								var18 = 0;

								for (var19 = var15 + var13 - var1; var19 < var13; ++var19) {
									var18 += (int)((long)Instrument_samples[var15 + var13 - 1 - var19] * (long)AudioFilter.coefficients[0][var19] >> 16);
								}

								for (var19 = 0; var19 < var14; ++var19) {
									var18 -= (int)((long)Instrument_samples[var15 - 1 - var19] * (long)AudioFilter.coefficients[1][var19] >> 16);
								}

								Instrument_samples[var15] = var18;
								this.filterEnvelope.doStep(var1 + 1);
								++var15;
							}
							break;
						}

						var13 = this.filter.compute(0, (float)var12 / 65536.0F, var3);
						var14 = this.filter.compute(1, (float)var12 / 65536.0F, var3);
						var16 += 128;
					}
				}
			}

			for (var12 = 0; var12 < var1; ++var12) {
				if (Instrument_samples[var12] < -32768) {
					Instrument_samples[var12] = -32768;
				}

				if (Instrument_samples[var12] > 32767) {
					Instrument_samples[var12] = 32767;
				}
			}

			return Instrument_samples;
		}
	}

	@ObfuscatedName("at")
	@Export("evaluateWave")
	final int evaluateWave(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return Instrument_sine[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return (var2 * (var1 & 32767) >> 14) - var2;
		} else {
			return var3 == 4 ? var2 * Instrument_noise[var1 / 2607 & 32767] : 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	@Export("decode")
	final void decode(Buffer var1) {
		this.pitch = new SoundEnvelope();
		this.pitch.decode(var1);
		this.volume = new SoundEnvelope();
		this.volume.decode(var1);
		int var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.pitchModifier = new SoundEnvelope();
			this.pitchModifier.decode(var1);
			this.pitchModifierAmplitude = new SoundEnvelope();
			this.pitchModifierAmplitude.decode(var1);
		}

		var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.volumeMultiplier = new SoundEnvelope();
			this.volumeMultiplier.decode(var1);
			this.volumeMultiplierAmplitude = new SoundEnvelope();
			this.volumeMultiplierAmplitude.decode(var1);
		}

		var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.release = new SoundEnvelope();
			this.release.decode(var1);
			this.attack = new SoundEnvelope();
			this.attack.decode(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.readUShortSmart();
			if (var4 == 0) {
				break;
			}

			this.oscillatorVolume[var3] = var4;
			this.oscillatorPitch[var3] = var1.readShortSmart();
			this.oscillatorDelays[var3] = var1.readUShortSmart();
		}

		this.delayTime = var1.readUShortSmart();
		this.delayDecay = var1.readUShortSmart();
		this.duration = var1.readUnsignedShort();
		this.offset = var1.readUnsignedShort();
		this.filter = new AudioFilter();
		this.filterEnvelope = new SoundEnvelope();
		this.filter.method3506(var1, this.filterEnvelope);
	}
}
