import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lno;[IIIIB)V",
		garbageValue = "-31"
	)
	void method7371(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3905[var1.field3976] & 4) != 0 && var1.field3988 < 0) {
			int var6 = this.superStream.field3907[var1.field3976] / PcmPlayer.field1356;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3996) / var6;
				if (var7 > var4) {
					var1.field3996 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3996 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field1356 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3928[var1.field3976] == 0) {
					var1.stream = RawPcmStream.method3154(var1.rawSound, var10.method3187(), var10.method3177(), var10.method3280());
				} else {
					var1.stream = RawPcmStream.method3154(var1.rawSound, var10.method3187(), 0, var10.method3280());
					this.superStream.method7164(var1, var1.table.field3959[var1.field3981] < 0);
					var1.stream.method3184(var8, var10.method3177());
				}

				if (var1.table.field3959[var1.field3981] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method3186(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method3190()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lno;IB)V",
		garbageValue = "50"
	)
	void method7362(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3905[var1.field3976] & 4) != 0 && var1.field3988 < 0) {
			int var3 = this.superStream.field3907[var1.field3976] / PcmPlayer.field1356;
			int var4 = (var3 + 1048575 - var1.field3996) / var3;
			var1.field3996 = var3 * var2 + var1.field3996 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3928[var1.field3976] == 0) {
					var1.stream = RawPcmStream.method3154(var1.rawSound, var1.stream.method3187(), var1.stream.method3177(), var1.stream.method3280());
				} else {
					var1.stream = RawPcmStream.method3154(var1.rawSound, var1.stream.method3187(), 0, var1.stream.method3280());
					this.superStream.method7164(var1, var1.table.field3959[var1.field3981] < 0);
				}

				if (var1.table.field3959[var1.field3981] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3996 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
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

	@ObfuscatedName("as")
	protected int vmethod7364() {
		return 0;
	}

	@ObfuscatedName("al")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7226(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3995) {
						this.method7371(var6, var1, var4, var5, var4 + var5);
						var6.field3995 -= var5;
						break;
					}

					this.method7371(var6, var1, var4, var6.field3995, var4 + var5);
					var4 += var6.field3995;
					var5 -= var6.field3995;
				} while(!this.superStream.method7180(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ai")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7226(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3995) {
						this.method7362(var3, var2);
						var3.field3995 -= var2;
						break;
					}

					this.method7362(var3, var3.field3995);
					var2 -= var3.field3995;
				} while(!this.superStream.method7180(var3, (int[])null, 0, var2));
			}
		}

	}
}
