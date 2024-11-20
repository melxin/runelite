import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -393183661
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1614084209
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -607423937
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1979575164"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1147534510"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-905150932"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "753967636"
	)
	static final int method9124(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
