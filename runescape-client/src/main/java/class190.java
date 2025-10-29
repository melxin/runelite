import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
class class190 implements ThreadFactory {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	final SequenceDefinition this$0;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	class190(SequenceDefinition var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "131874505"
	)
	public static int method4416(int var0, int var1) {
		return var0 + (int)(Math.random() * (double)(var1 - var0));
	}
}
