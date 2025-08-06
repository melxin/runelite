import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1871773193
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("animationSequence")
	public final AnimationSequence animationSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -767202117
	)
	public int field5339;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 363369293
	)
	@Export("height")
	public int height;

	public ActorSpotAnim(int var1, int var2, int var3) {
		this.id = -1;
		this.animationSequence = new AnimationSequence();
		this.field5339 = 0;
		this.height = 0;
		this.id = var1;
		this.height = var2;
		this.field5339 = var3;
		if (this.id >= 0) {
			this.animationSequence.setSequence(Skeleton.SpotAnimationDefinition_get(this.id).sequence);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "1621488757"
	)
	static void method10193(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}
}
