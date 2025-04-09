import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	NodeDeque field231;
	@ObfuscatedName("ae")
	int field232;
	@ObfuscatedName("af")
	int field234;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field231 = new NodeDeque();
		this.field232 = 0;
		this.field234 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ae")
	void method717() {
		if (this.field232 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field231.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field231.previous()) {
				var1.field381 -= this.field232;
			}

			this.field234 -= this.field232;
			this.field232 = 0;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luz;Lcs;)V"
	)
	void method718(Node var1, PcmStreamMixerListener var2) {
		while (this.field231.sentinel != var1 && ((PcmStreamMixerListener)var1).field381 <= var2.field381) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field234 = ((PcmStreamMixerListener)this.field231.sentinel.previous).field381;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lcs;)V"
	)
	void method719(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field231.sentinel.previous;
		if (var2 == this.field231.sentinel) {
			this.field234 = -1;
		} else {
			this.field234 = ((PcmStreamMixerListener)var2).field381;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("am")
	protected int vmethod6832() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field234 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field232 < this.field234) {
				this.field232 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field234 - this.field232;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field232 += var4;
			this.method717();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field231.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field381 = 0;
					this.method719(var5);
				} else {
					var5.field381 = var7;
					this.method718(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ap")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ax")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field234 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field232 + var1 < this.field234) {
				this.field232 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field234 - this.field232;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field232 += var2;
			this.method717();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field231.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field381 = 0;
					this.method719(var3);
				} else {
					var3.field381 = var5;
					this.method718(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("aw")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
