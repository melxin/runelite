import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ay")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ag")
	int field332;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("am")
	protected abstract int vmethod6832();

	@ObfuscatedName("aa")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ax")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bc")
	int vmethod1046() {
		return 255;
	}

	@ObfuscatedName("fn")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
