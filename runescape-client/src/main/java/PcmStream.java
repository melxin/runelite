import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("aw")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("am")
	int field1413;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("aq")
	protected abstract int vmethod7359();

	@ObfuscatedName("ac")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ap")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bo")
	int vmethod3401() {
		return 255;
	}

	@ObfuscatedName("fs")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
