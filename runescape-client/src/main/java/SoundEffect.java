import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	static class114 field1291;
	@ObfuscatedName("ap")
	static int field1294;
	@ObfuscatedName("al")
	int field1292;
	@ObfuscatedName("ab")
	int field1289;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	class108 field1290;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	@Export("instruments")
	final Instrument[] instruments;
	@ObfuscatedName("as")
	@Export("start")
	int start;
	@ObfuscatedName("ah")
	@Export("end")
	int end;

	static {
		field1291 = new class114();
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;ILee;)V"
	)
	SoundEffect(Buffer var1, int var2, class108 var3) {
		this.instruments = new Instrument[10];
		this.field1289 = var2;
		this.field1290 = var3;
		if (var2 == 0) {
			this.method2967(var1);
		} else {
			if (var2 != 1) {
				throw new RuntimeException("Invalid fileId for SFX");
			}

			var3.method3318(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void method2967(Buffer var1) {
		this.field1292 = 22050;

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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Z)Ldg;"
	)
	public RawSound method2969(boolean var1) {
		short[] var2 = this.mix(var1);
		RawSound var3 = new RawSound(this.field1292, var2, this.field1292 * this.start / 1000, this.field1292 * this.end / 1000, false, var1);
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ldg;"
	)
	@Export("toRawSound")
	public RawSound toRawSound() {
		return this.field1289 == 0 ? this.method2969(false) : this.field1290.method3319();
	}

	@ObfuscatedName("au")
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
			var3 = var2 * this.field1292 / 1000;
			short[] var4 = new short[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.instruments[var5] != null) {
					int var6 = this.instruments[var5].duration * this.field1292 / 1000;
					int var7 = this.instruments[var5].offset * this.field1292 / 1000;
					int[] var8 = this.instruments[var5].method3414(var6, this.instruments[var5].duration, this.field1292);
					int var9;
					int var10;
					if (var1) {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = (var8[var9] >> 8) + var4[var9 + var7];
							var10 = class146.method3755(-128, 127, var10);
							var4[var9 + var7] = (short)((byte)var10);
						}
					} else {
						for (var9 = 0; var9 < var6; ++var9) {
							var10 = var8[var9] + var4[var9 + var7];
							var10 = class146.method3755(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Ldn;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		class108 var3 = new class108(field1291);
		byte[] var4 = var0.takeFile(var1, var2);
		if (var4 == null) {
			System.out.println("[Red] empty jagfx.js file. ");
			return null;
		} else {
			Buffer var5 = new Buffer(var4);
			if (var2 == 1) {
				if (var4.length <= field1294) {
					System.out.println("[Red] the data of the jagfx.js is empty. ");
					return null;
				}

				field1294 = var5.readInt();
				byte[] var6 = Arrays.copyOfRange(var4, 4, field1294 + 4);
				var3.method3321(var6);
				var5.offset = field1294 + 4;
			} else {
				if (var2 != 0) {
					System.out.println("[Red] invalid fileId.");
					return null;
				}

				var5 = new Buffer(var4);
			}

			return new SoundEffect(var5, var2, var3);
		}
	}
}
