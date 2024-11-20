import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	NodeDeque field250;
	@ObfuscatedName("at")
	int field248;
	@ObfuscatedName("ae")
	int field251;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field250 = new NodeDeque();
		this.field248 = 0;
		this.field251 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("at")
	void method688() {
		if (this.field248 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field250.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field250.previous()) {
				var1.field397 -= this.field248;
			}

			this.field251 -= this.field248;
			this.field248 = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Lcq;)V"
	)
	void method689(Node var1, PcmStreamMixerListener var2) {
		while (this.field250.sentinel != var1 && ((PcmStreamMixerListener)var1).field397 <= var2.field397) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field251 = ((PcmStreamMixerListener)this.field250.sentinel.previous).field397;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lcq;)V"
	)
	void method690(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field250.sentinel.previous;
		if (var2 == this.field250.sentinel) {
			this.field251 = -1;
		} else {
			this.field251 = ((PcmStreamMixerListener)var2).field397;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("av")
	protected int vmethod6753() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field251 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field248 < this.field251) {
				this.field248 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field251 - this.field248;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field248 += var4;
			this.method688();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field250.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field397 = 0;
					this.method690(var5);
				} else {
					var5.field397 = var7;
					this.method689(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("an")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("af")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field251 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field248 + var1 < this.field251) {
				this.field248 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field251 - this.field248;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field248 += var2;
			this.method688();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field250.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field397 = 0;
					this.method690(var3);
				} else {
					var3.field397 = var5;
					this.method689(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ai")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
