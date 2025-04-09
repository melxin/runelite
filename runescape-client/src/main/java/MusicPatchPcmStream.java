import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("as")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lmv;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnl;[IIIII)V",
		garbageValue = "-1622427059"
	)
	void method6838(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3713[var1.field3802] & 4) != 0 && var1.field3801 < 0) {
			int var6 = this.superStream.field3714[var1.field3802] / (class4.field7 * -70401264);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3787) / var6;
				if (var7 > var4) {
					var1.field3787 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3787 += var7 * var6 - 1048576;
				int var8 = class4.field7 * -70401264 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3730[var1.field3802] == 0) {
					var1.stream = RawPcmStream.method896(var1.rawSound, var10.method928(), var10.method983(), var10.method921());
				} else {
					var1.stream = RawPcmStream.method896(var1.rawSound, var10.method928(), 0, var10.method921());
					this.superStream.method6696(var1, var1.table.field3769[var1.field3792] < 0);
					var1.stream.method925(var8, var10.method983());
				}

				if (var1.table.field3769[var1.field3792] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method927(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method1011()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnl;IB)V",
		garbageValue = "20"
	)
	void method6843(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3713[var1.field3802] & 4) != 0 && var1.field3801 < 0) {
			int var3 = this.superStream.field3714[var1.field3802] / (class4.field7 * -70401264);
			int var4 = (var3 + 1048575 - var1.field3787) / var3;
			var1.field3787 = var3 * var2 + var1.field3787 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3730[var1.field3802] == 0) {
					var1.stream = RawPcmStream.method896(var1.rawSound, var1.stream.method928(), var1.stream.method983(), var1.stream.method921());
				} else {
					var1.stream = RawPcmStream.method896(var1.rawSound, var1.stream.method928(), 0, var1.stream.method921());
					this.superStream.method6696(var1, var1.table.field3769[var1.field3792] < 0);
				}

				if (var1.table.field3769[var1.field3792] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3787 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("am")
	protected int vmethod6832() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6668(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3806) {
						this.method6838(var6, var1, var4, var5, var5 + var4);
						var6.field3806 -= var5;
						break;
					}

					this.method6838(var6, var1, var4, var6.field3806, var5 + var4);
					var4 += var6.field3806;
					var5 -= var6.field3806;
				} while(!this.superStream.method6669(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ax")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6668(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3806) {
						this.method6843(var3, var2);
						var3.field3806 -= var2;
						break;
					}

					this.method6843(var3, var3.field3806);
					var2 -= var3.field3806;
				} while(!this.superStream.method6669(var3, (int[])null, 0, var2));
			}
		}

	}
}
