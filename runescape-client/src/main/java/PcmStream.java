import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ab")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ak")
	int field1413;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("as")
	protected abstract int vmethod7364();

	@ObfuscatedName("al")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ai")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bn")
	int vmethod3324() {
		return 255;
	}

	@ObfuscatedName("gq")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
