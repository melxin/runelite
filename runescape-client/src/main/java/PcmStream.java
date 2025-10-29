import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("af")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ao")
	int field1385;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("aw")
	protected abstract int vmethod7569();

	@ObfuscatedName("ap")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("au")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bn")
	int vmethod3432() {
		return 255;
	}

	@ObfuscatedName("gt")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
