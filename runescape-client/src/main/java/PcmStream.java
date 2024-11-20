import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ak")
	int field341;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ah")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("av")
	protected abstract int vmethod6753();

	@ObfuscatedName("au")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("af")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("be")
	int vmethod1032() {
		return 255;
	}

	@ObfuscatedName("ft")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
