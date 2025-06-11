import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("at")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("av")
	int field1372;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("am")
	protected abstract int vmethod7122();

	@ObfuscatedName("ah")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("au")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bj")
	int vmethod3179() {
		return 255;
	}

	@ObfuscatedName("gg")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
