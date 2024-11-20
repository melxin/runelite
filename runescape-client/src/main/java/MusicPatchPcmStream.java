import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnn;[IIIIB)V",
		garbageValue = "32"
	)
	void method6770(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3648[var1.field3728] & 4) != 0 && var1.field3716 < 0) {
			int var6 = this.superStream.field3665[var1.field3728] / (DbTableType.field5406 * 1168272912);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3731) / var6;
				if (var7 > var4) {
					var1.field3731 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3731 += var6 * var7 - 1048576;
				int var8 = DbTableType.field5406 * 1168272912 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3643[var1.field3728] == 0) {
					var1.stream = RawPcmStream.method913(var1.rawSound, var10.method887(), var10.method878(), var10.method898());
				} else {
					var1.stream = RawPcmStream.method913(var1.rawSound, var10.method887(), 0, var10.method898());
					this.superStream.method6564(var1, var1.table.field3694[var1.field3715] < 0);
					var1.stream.method872(var8, var10.method878());
				}

				if (var1.table.field3694[var1.field3715] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method885(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method889()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IB)V",
		garbageValue = "-13"
	)
	void method6757(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3648[var1.field3728] & 4) != 0 && var1.field3716 < 0) {
			int var3 = this.superStream.field3665[var1.field3728] / (DbTableType.field5406 * 1168272912);
			int var4 = (var3 + 1048575 - var1.field3731) / var3;
			var1.field3731 = var3 * var2 + var1.field3731 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3643[var1.field3728] == 0) {
					var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method887(), var1.stream.method878(), var1.stream.method898());
				} else {
					var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method887(), 0, var1.stream.method898());
					this.superStream.method6564(var1, var1.table.field3694[var1.field3715] < 0);
				}

				if (var1.table.field3694[var1.field3715] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3731 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ac")
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

	@ObfuscatedName("aj")
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

	@ObfuscatedName("av")
	protected int vmethod6753() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6589(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3717) {
						this.method6770(var6, var1, var4, var5, var5 + var4);
						var6.field3717 -= var5;
						break;
					}

					this.method6770(var6, var1, var4, var6.field3717, var4 + var5);
					var4 += var6.field3717;
					var5 -= var6.field3717;
				} while(!this.superStream.method6590(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("af")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6589(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3717) {
						this.method6757(var3, var2);
						var3.field3717 -= var2;
						break;
					}

					this.method6757(var3, var3.field3717);
					var2 -= var3.field3717;
				} while(!this.superStream.method6590(var3, (int[])null, 0, var2));
			}
		}

	}
}
