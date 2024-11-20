import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class208 {
	@ObfuscatedName("au")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -959237623
	)
	public int field2155;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1749115075
	)
	public int field2154;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 72267647
	)
	public int field2160;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -247808571
	)
	public int field2156;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1533784309
	)
	public int field2157;

	class208(int var1, int var2, int var3, int var4, int var5) {
		this.field2155 = 0;
		this.field2154 = 1;
		this.field2160 = 0;
		this.field2156 = 0;
		this.field2157 = 0;
		this.field2155 = var1;
		this.field2154 = var2;
		this.field2160 = var3;
		this.field2156 = var4;
		this.field2157 = var5;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	static void method4104() {
		if (AsyncHttpResponse.localPlayer.x >> 7 == Client.destinationX && AsyncHttpResponse.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
