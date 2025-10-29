import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	NodeDeque field1283;
	@ObfuscatedName("ag")
	int field1282;
	@ObfuscatedName("an")
	int field1280;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1283 = new NodeDeque();
		this.field1282 = 0;
		this.field1280 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ag")
	void method3101() {
		if (this.field1282 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1283.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1283.previous()) {
				var1.field1463 -= this.field1282;
			}

			this.field1280 -= this.field1282;
			this.field1282 = 0;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvz;Lef;)V"
	)
	void method3070(Node var1, PcmStreamMixerListener var2) {
		while (this.field1283.sentinel != var1 && ((PcmStreamMixerListener)var1).field1463 <= var2.field1463) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1280 = ((PcmStreamMixerListener)this.field1283.sentinel.previous).field1463;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	void method3075(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1283.sentinel.previous;
		if (var2 == this.field1283.sentinel) {
			this.field1280 = -1;
		} else {
			this.field1280 = ((PcmStreamMixerListener)var2).field1463;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("aw")
	protected int vmethod7569() {
		return 0;
	}

	@ObfuscatedName("ap")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1280 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1282 < this.field1280) {
				this.field1282 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1280 - this.field1282;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1282 += var4;
			this.method3101();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1283.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1463 = 0;
					this.method3075(var5);
				} else {
					var5.field1463 = var7;
					this.method3070(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ay")
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
			if (this.field1280 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1282 + var1 < this.field1280) {
				this.field1282 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1280 - this.field1282;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1282 += var2;
			this.method3101();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1283.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1463 = 0;
					this.method3075(var3);
				} else {
					var3.field1463 = var5;
					this.method3070(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("az")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
