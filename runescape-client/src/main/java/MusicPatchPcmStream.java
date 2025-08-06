import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1823113663
	)
	static int field3876;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lnm;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnk;[IIIIB)V",
		garbageValue = "11"
	)
	void method7329(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3807[var1.field3882] & 4) != 0 && var1.field3902 < 0) {
			int var6 = this.superStream.field3809[var1.field3882] / PcmPlayer.field1313;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3884) / var6;
				if (var7 > var4) {
					var1.field3884 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3884 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field1313 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3801[var1.field3882] == 0) {
					var1.stream = RawPcmStream.method3108(var1.rawSound, var10.method3157(), var10.method3131(), var10.method3133());
				} else {
					var1.stream = RawPcmStream.method3108(var1.rawSound, var10.method3157(), 0, var10.method3133());
					this.superStream.method7165(var1, var1.table.field3859[var1.field3887] < 0);
					var1.stream.method3138(var8, var10.method3131());
				}

				if (var1.table.field3859[var1.field3887] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method3173(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method3144()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "51"
	)
	void method7331(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3807[var1.field3882] & 4) != 0 && var1.field3902 < 0) {
			int var3 = this.superStream.field3809[var1.field3882] / PcmPlayer.field1313;
			int var4 = (var3 + 1048575 - var1.field3884) / var3;
			var1.field3884 = var3 * var2 + var1.field3884 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3801[var1.field3882] == 0) {
					var1.stream = RawPcmStream.method3108(var1.rawSound, var1.stream.method3157(), var1.stream.method3131(), var1.stream.method3133());
				} else {
					var1.stream = RawPcmStream.method3108(var1.rawSound, var1.stream.method3157(), 0, var1.stream.method3133());
					this.superStream.method7165(var1, var1.table.field3859[var1.field3887] < 0);
				}

				if (var1.table.field3859[var1.field3887] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3884 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
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

	@ObfuscatedName("ap")
	protected int vmethod7328() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7166(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3901) {
						this.method7329(var6, var1, var4, var5, var4 + var5);
						var6.field3901 -= var5;
						break;
					}

					this.method7329(var6, var1, var4, var6.field3901, var5 + var4);
					var4 += var6.field3901;
					var5 -= var6.field3901;
				} while(!this.superStream.method7167(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ag")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7166(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3901) {
						this.method7331(var3, var2);
						var3.field3901 -= var2;
						break;
					}

					this.method7331(var3, var3.field3901);
					var2 -= var3.field3901;
				} while(!this.superStream.method7167(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "32"
	)
	static int method7324(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
