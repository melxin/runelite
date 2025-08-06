import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ad")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("af")
	int field1390;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ap")
	protected abstract int vmethod7328();

	@ObfuscatedName("am")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ag")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bx")
	int vmethod3277() {
		return 255;
	}

	@ObfuscatedName("gk")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
