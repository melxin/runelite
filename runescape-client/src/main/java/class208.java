import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
class class208 implements ThreadFactory {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1309012693
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	final SequenceDefinition this$0;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	class208(SequenceDefinition var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
