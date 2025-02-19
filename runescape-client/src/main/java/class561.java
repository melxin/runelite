import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vs")
public class class561 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 795658641
	)
	@Export("SpriteBuffer_spriteCount")
	public static int SpriteBuffer_spriteCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2093753765
	)
	static final int field5517;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 615065103
	)
	static final int field5518;

	static {
		field5517 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5518 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}
}
