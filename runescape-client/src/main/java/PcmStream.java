import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ar")
	int field343;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("az")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("af")
	protected abstract int vmethod6801();

	@ObfuscatedName("aa")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ae")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bq")
	int vmethod1025() {
		return 255;
	}

	@ObfuscatedName("ge")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
