import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	NodeDeque field1311;
	@ObfuscatedName("ag")
	int field1312;
	@ObfuscatedName("aj")
	int field1310;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1311 = new NodeDeque();
		this.field1312 = 0;
		this.field1310 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldw;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldw;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ag")
	void method3094() {
		if (this.field1312 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1311.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1311.previous()) {
				var1.field1488 -= this.field1312;
			}

			this.field1310 -= this.field1312;
			this.field1312 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lum;Let;)V"
	)
	void method3072(Node var1, PcmStreamMixerListener var2) {
		while (this.field1311.sentinel != var1 && ((PcmStreamMixerListener)var1).field1488 <= var2.field1488) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1310 = ((PcmStreamMixerListener)this.field1311.sentinel.previous).field1488;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	void method3073(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1311.sentinel.previous;
		if (var2 == this.field1311.sentinel) {
			this.field1310 = -1;
		} else {
			this.field1310 = ((PcmStreamMixerListener)var2).field1488;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("aq")
	protected int vmethod7359() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1310 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1312 < this.field1310) {
				this.field1312 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1310 - this.field1312;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1312 += var4;
			this.method3094();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1311.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1488 = 0;
					this.method3073(var5);
				} else {
					var5.field1488 = var7;
					this.method3072(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("aa")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ap")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1310 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1312 + var1 < this.field1310) {
				this.field1312 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1310 - this.field1312;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1312 += var2;
			this.method3094();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1311.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1488 = 0;
					this.method3073(var3);
				} else {
					var3.field1488 = var5;
					this.method3072(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ad")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
