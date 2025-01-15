import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	NodeDeque field233;
	@ObfuscatedName("az")
	int field232;
	@ObfuscatedName("ao")
	int field235;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field233 = new NodeDeque();
		this.field232 = 0;
		this.field235 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbn;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbn;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("az")
	void method770() {
		if (this.field232 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field233.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field233.previous()) {
				var1.field374 -= this.field232;
			}

			this.field235 -= this.field232;
			this.field232 = 0;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lca;)V"
	)
	void method730(Node var1, PcmStreamMixerListener var2) {
		while (this.field233.sentinel != var1 && ((PcmStreamMixerListener)var1).field374 <= var2.field374) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field235 = ((PcmStreamMixerListener)this.field233.sentinel.previous).field374;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lca;)V"
	)
	void method767(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field233.sentinel.previous;
		if (var2 == this.field233.sentinel) {
			this.field235 = -1;
		} else {
			this.field235 = ((PcmStreamMixerListener)var2).field374;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ax")
	protected int vmethod6927() {
		return 0;
	}

	@ObfuscatedName("at")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field235 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field232 < this.field235) {
				this.field232 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field235 - this.field232;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field232 += var4;
			this.method770();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field233.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field374 = 0;
					this.method767(var5);
				} else {
					var5.field374 = var7;
					this.method730(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ac")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field235 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field232 + var1 < this.field235) {
				this.field232 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field235 - this.field232;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field232 += var2;
			this.method770();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field233.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field374 = 0;
					this.method767(var3);
				} else {
					var3.field374 = var5;
					this.method730(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("as")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
