import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lnj;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lng;[IIIII)V",
		garbageValue = "-1552677807"
	)
	void method7369(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3932[var1.field3993] & 4) != 0 && var1.field3990 < 0) {
			int var6 = this.superStream.field3913[var1.field3993] / (class349.field4014 * -304735216);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field4007) / var6;
				if (var7 > var4) {
					var1.field4007 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field4007 += var6 * var7 - 1048576;
				int var8 = class349.field4014 * -304735216 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3930[var1.field3993] == 0) {
					var1.stream = RawPcmStream.method3236(var1.rawSound, var10.method3234(), var10.method3259(), var10.method3261());
				} else {
					var1.stream = RawPcmStream.method3236(var1.rawSound, var10.method3234(), 0, var10.method3261());
					this.superStream.method7161(var1, var1.table.field3965[var1.field4001] < 0);
					var1.stream.method3265(var8, var10.method3259());
				}

				if (var1.table.field3965[var1.field4001] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method3260(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method3269()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)V",
		garbageValue = "-87"
	)
	void method7365(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3932[var1.field3993] & 4) != 0 && var1.field3990 < 0) {
			int var3 = this.superStream.field3913[var1.field3993] / (class349.field4014 * -304735216);
			int var4 = (var3 + 1048575 - var1.field4007) / var3;
			var1.field4007 = var3 * var2 + var1.field4007 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3930[var1.field3993] == 0) {
					var1.stream = RawPcmStream.method3236(var1.rawSound, var1.stream.method3234(), var1.stream.method3259(), var1.stream.method3261());
				} else {
					var1.stream = RawPcmStream.method3236(var1.rawSound, var1.stream.method3234(), 0, var1.stream.method3261());
					this.superStream.method7161(var1, var1.table.field3965[var1.field4001] < 0);
				}

				if (var1.table.field3965[var1.field4001] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field4007 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
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

	@ObfuscatedName("aq")
	protected int vmethod7359() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7282(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3987) {
						this.method7369(var6, var1, var4, var5, var4 + var5);
						var6.field3987 -= var5;
						break;
					}

					this.method7369(var6, var1, var4, var6.field3987, var4 + var5);
					var4 += var6.field3987;
					var5 -= var6.field3987;
				} while(!this.superStream.method7186(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ap")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7282(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3987) {
						this.method7365(var3, var2);
						var3.field3987 -= var2;
						break;
					}

					this.method7365(var3, var3.field3987);
					var2 -= var3.field3987;
				} while(!this.superStream.method7186(var3, (int[])null, 0, var2));
			}
		}

	}
}
