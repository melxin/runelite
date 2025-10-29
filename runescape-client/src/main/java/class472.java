import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class472 {
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("av")
	public char field5322;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1415121929
	)
	public int field5324;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -798824383
	)
	public int field5323;

	class472() {
		this.field5324 = 0;
		this.field5323 = 0;
	}
}
