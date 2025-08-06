import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeDeque field1284;
	@ObfuscatedName("ac")
	int field1285;
	@ObfuscatedName("av")
	int field1287;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1284 = new NodeDeque();
		this.field1285 = 0;
		this.field1287 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldy;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldy;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.vmethod10593();
	}

	@ObfuscatedName("ac")
	void method2934() {
		if (this.field1285 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1284.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1284.previous()) {
				var1.field1468 -= this.field1285;
			}

			this.field1287 -= this.field1285;
			this.field1285 = 0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luj;Lev;)V"
	)
	void method2935(Node var1, PcmStreamMixerListener var2) {
		while (this.field1284.sentinel != var1 && ((PcmStreamMixerListener)var1).field1468 <= var2.field1468) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1287 = ((PcmStreamMixerListener)this.field1284.sentinel.previous).field1468;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	void method2936(PcmStreamMixerListener var1) {
		var1.vmethod10593();
		var1.remove2();
		Node var2 = this.field1284.sentinel.previous;
		if (var2 == this.field1284.sentinel) {
			this.field1287 = -1;
		} else {
			this.field1287 = ((PcmStreamMixerListener)var2).field1468;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ap")
	protected int vmethod7328() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1287 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1285 < this.field1287) {
				this.field1285 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1287 - this.field1285;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1285 += var4;
			this.method2934();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1284.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1468 = 0;
					this.method2936(var5);
				} else {
					var5.field1468 = var7;
					this.method2935(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("aj")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ag")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1287 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1285 + var1 < this.field1287) {
				this.field1285 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1287 - this.field1285;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1285 += var2;
			this.method2934();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1284.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1468 = 0;
					this.method2936(var3);
				} else {
					var3.field1468 = var5;
					this.method2935(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ay")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
