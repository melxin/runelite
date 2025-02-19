import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeDeque field249;
	@ObfuscatedName("au")
	int field250;
	@ObfuscatedName("ad")
	int field251;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field249 = new NodeDeque();
		this.field250 = 0;
		this.field251 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("au")
	void method692() {
		if (this.field250 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field249.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field249.previous()) {
				var1.field392 -= this.field250;
			}

			this.field251 -= this.field250;
			this.field250 = 0;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Luy;Lcs;)V"
	)
	void method676(Node var1, PcmStreamMixerListener var2) {
		while (this.field249.sentinel != var1 && ((PcmStreamMixerListener)var1).field392 <= var2.field392) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field251 = ((PcmStreamMixerListener)this.field249.sentinel.previous).field392;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lcs;)V"
	)
	void method686(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field249.sentinel.previous;
		if (var2 == this.field249.sentinel) {
			this.field251 = -1;
		} else {
			this.field251 = ((PcmStreamMixerListener)var2).field392;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("af")
	protected int vmethod6801() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field251 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field250 < this.field251) {
				this.field250 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field251 - this.field250;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field250 += var4;
			this.method692();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field249.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field392 = 0;
					this.method686(var5);
				} else {
					var5.field392 = var7;
					this.method676(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("as")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ae")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field251 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field250 + var1 < this.field251) {
				this.field250 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field251 - this.field250;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field250 += var2;
			this.method692();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field249.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field392 = 0;
					this.method686(var3);
				} else {
					var3.field392 = var5;
					this.method676(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ax")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
