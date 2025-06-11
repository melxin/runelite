import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	NodeDeque field1281;
	@ObfuscatedName("an")
	int field1282;
	@ObfuscatedName("ai")
	int field1283;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1281 = new NodeDeque();
		this.field1282 = 0;
		this.field1283 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("an")
	void method2838() {
		if (this.field1282 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1281.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1281.previous()) {
				var1.field1425 -= this.field1282;
			}

			this.field1283 -= this.field1282;
			this.field1282 = 0;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lub;Len;)V"
	)
	void method2839(Node var1, PcmStreamMixerListener var2) {
		while (this.field1281.sentinel != var1 && ((PcmStreamMixerListener)var1).field1425 <= var2.field1425) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1283 = ((PcmStreamMixerListener)this.field1281.sentinel.previous).field1425;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	void method2871(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1281.sentinel.previous;
		if (var2 == this.field1281.sentinel) {
			this.field1283 = -1;
		} else {
			this.field1283 = ((PcmStreamMixerListener)var2).field1425;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("am")
	protected int vmethod7122() {
		return 0;
	}

	@ObfuscatedName("ah")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1283 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1282 < this.field1283) {
				this.field1282 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1283 - this.field1282;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1282 += var4;
			this.method2838();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1281.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1425 = 0;
					this.method2871(var5);
				} else {
					var5.field1425 = var7;
					this.method2839(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ag")
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
			if (this.field1283 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1282 + var1 < this.field1283) {
				this.field1282 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1283 - this.field1282;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1282 += var2;
			this.method2838();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1281.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1425 = 0;
					this.method2871(var3);
				} else {
					var3.field1425 = var5;
					this.method2839(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ar")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
