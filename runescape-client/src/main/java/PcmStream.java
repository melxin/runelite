import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("al")
	int field323;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ag")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ax")
	protected abstract int vmethod6927();

	@ObfuscatedName("at")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("au")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bk")
	int vmethod1079() {
		return 255;
	}

	@ObfuscatedName("gd")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
