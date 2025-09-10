import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeDeque field1309;
	@ObfuscatedName("at")
	int field1311;
	@ObfuscatedName("ac")
	int field1312;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1309 = new NodeDeque();
		this.field1311 = 0;
		this.field1312 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("at")
	void method2960() {
		if (this.field1311 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1309.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1309.previous()) {
				var1.field1488 -= this.field1311;
			}

			this.field1312 -= this.field1311;
			this.field1311 = 0;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luk;Leg;)V"
	)
	void method2977(Node var1, PcmStreamMixerListener var2) {
		while (this.field1309.sentinel != var1 && ((PcmStreamMixerListener)var1).field1488 <= var2.field1488) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1312 = ((PcmStreamMixerListener)this.field1309.sentinel.previous).field1488;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	void method2962(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1309.sentinel.previous;
		if (var2 == this.field1309.sentinel) {
			this.field1312 = -1;
		} else {
			this.field1312 = ((PcmStreamMixerListener)var2).field1488;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("as")
	protected int vmethod7364() {
		return 0;
	}

	@ObfuscatedName("al")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1312 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1311 < this.field1312) {
				this.field1311 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1312 - this.field1311;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1311 += var4;
			this.method2960();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1309.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1488 = 0;
					this.method2962(var5);
				} else {
					var5.field1488 = var7;
					this.method2977(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("au")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ai")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1312 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1311 + var1 < this.field1312) {
				this.field1311 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1312 - this.field1311;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1311 += var2;
			this.method2960();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1309.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1488 = 0;
					this.method2962(var3);
				} else {
					var3.field1488 = var5;
					this.method2977(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("aa")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
