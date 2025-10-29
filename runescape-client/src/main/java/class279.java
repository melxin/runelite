import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class279 extends Node {
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1436225141
	)
	public int field3225;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1485962813
	)
	public int field3226;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 251947843
	)
	public int field3231;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public Widget field3227;

	@ObfuscatedSignature(
		descriptor = "(IIILof;)V"
	)
	public class279(int var1, int var2, int var3, Widget var4) {
		this.field3231 = var1;
		this.field3225 = var2;
		this.field3226 = var3;
		this.field3227 = var4;
	}
}
