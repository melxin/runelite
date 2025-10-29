import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnd;[IIIIB)V",
		garbageValue = "-3"
	)
	void method7572(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3943[var1.field4016] & 4) != 0 && var1.field4030 < 0) {
			int var6 = this.superStream.field3967[var1.field4016] / (EnumComposition.field2063 * 1063377631);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field4036) / var6;
				if (var7 > var4) {
					var1.field4036 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field4036 += var6 * var7 - 1048576;
				int var8 = EnumComposition.field2063 * 1063377631 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3944[var1.field4016] == 0) {
					var1.stream = RawPcmStream.method3267(var1.rawSound, var10.method3388(), var10.method3293(), var10.method3291());
				} else {
					var1.stream = RawPcmStream.method3267(var1.rawSound, var10.method3388(), 0, var10.method3291());
					this.superStream.method7378(var1, var1.table.field3995[var1.field4019] < 0);
					var1.stream.method3296(var8, var10.method3293());
				}

				if (var1.table.field3995[var1.field4019] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method3298(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method3382()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "995705765"
	)
	void method7573(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3943[var1.field4016] & 4) != 0 && var1.field4030 < 0) {
			int var3 = this.superStream.field3967[var1.field4016] / (EnumComposition.field2063 * 1063377631);
			int var4 = (var3 + 1048575 - var1.field4036) / var3;
			var1.field4036 = var3 * var2 + var1.field4036 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3944[var1.field4016] == 0) {
					var1.stream = RawPcmStream.method3267(var1.rawSound, var1.stream.method3388(), var1.stream.method3293(), var1.stream.method3291());
				} else {
					var1.stream = RawPcmStream.method3267(var1.rawSound, var1.stream.method3388(), 0, var1.stream.method3291());
					this.superStream.method7378(var1, var1.table.field3995[var1.field4019] < 0);
				}

				if (var1.table.field3995[var1.field4019] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field4036 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
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

	@ObfuscatedName("aw")
	protected int vmethod7569() {
		return 0;
	}

	@ObfuscatedName("ap")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7400(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field4035) {
						this.method7572(var6, var1, var4, var5, var5 + var4);
						var6.field4035 -= var5;
						break;
					}

					this.method7572(var6, var1, var4, var6.field4035, var5 + var4);
					var4 += var6.field4035;
					var5 -= var6.field4035;
				} while(!this.superStream.method7453(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7400(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field4035) {
						this.method7573(var3, var2);
						var3.field4035 -= var2;
						break;
					}

					this.method7573(var3, var3.field4035);
					var2 -= var3.field4035;
				} while(!this.superStream.method7453(var3, (int[])null, 0, var2));
			}
		}

	}
}
