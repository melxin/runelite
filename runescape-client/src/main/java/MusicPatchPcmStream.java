import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("jh")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lma;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIIII)V",
		garbageValue = "1738538147"
	)
	void method6903(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3651[var1.field3731] & 4) != 0 && var1.field3727 < 0) {
			int var6 = this.superStream.field3654[var1.field3731] / PcmPlayer.field257;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3733) / var6;
				if (var7 > var4) {
					var1.field3733 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3733 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field257 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3652[var1.field3731] == 0) {
					var1.stream = RawPcmStream.method911(var1.rawSound, var10.method926(), var10.method922(), var10.method918());
				} else {
					var1.stream = RawPcmStream.method911(var1.rawSound, var10.method926(), 0, var10.method918());
					this.superStream.method6723(var1, var1.table.field3691[var1.field3718] < 0);
					var1.stream.method950(var8, var10.method922());
				}

				if (var1.table.field3691[var1.field3718] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method924(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method928()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lne;II)V",
		garbageValue = "-622400505"
	)
	void method6904(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3651[var1.field3731] & 4) != 0 && var1.field3727 < 0) {
			int var3 = this.superStream.field3654[var1.field3731] / PcmPlayer.field257;
			int var4 = (var3 + 1048575 - var1.field3733) / var3;
			var1.field3733 = var3 * var2 + var1.field3733 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3652[var1.field3731] == 0) {
					var1.stream = RawPcmStream.method911(var1.rawSound, var1.stream.method926(), var1.stream.method922(), var1.stream.method918());
				} else {
					var1.stream = RawPcmStream.method911(var1.rawSound, var1.stream.method926(), 0, var1.stream.method918());
					this.superStream.method6723(var1, var1.table.field3691[var1.field3718] < 0);
				}

				if (var1.table.field3691[var1.field3718] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3733 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
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
		descriptor = "()Lbn;"
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

	@ObfuscatedName("ax")
	protected int vmethod6927() {
		return 0;
	}

	@ObfuscatedName("at")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6745(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3728) {
						this.method6903(var6, var1, var4, var5, var4 + var5);
						var6.field3728 -= var5;
						break;
					}

					this.method6903(var6, var1, var4, var6.field3728, var4 + var5);
					var4 += var6.field3728;
					var5 -= var6.field3728;
				} while(!this.superStream.method6746(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6745(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3728) {
						this.method6904(var3, var2);
						var3.field3728 -= var2;
						break;
					}

					this.method6904(var3, var3.field3728);
					var2 -= var3.field3728;
				} while(!this.superStream.method6746(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIB)V",
		garbageValue = "77"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		PcmPlayer.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
