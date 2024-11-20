import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -807677907
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -248981743
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -494237031
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1919341087
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -340268377
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2820727198451891697L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 657470305
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
