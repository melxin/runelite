import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
class class140 implements Callable {
	@ObfuscatedName("av")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class145 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	final class136[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfz;II[Lfj;)V"
	)
	class140(class145 var1, int var2, int var3, class136[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}
}
