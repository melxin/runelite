import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class506 extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1871773193
	)
	public int field5342;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	public final class465 field5340;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -767202117
	)
	public int field5339;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 363369293
	)
	public int field5341;

	public class506(int var1, int var2, int var3) {
		this.field5342 = -1;
		this.field5340 = new class465();
		this.field5339 = 0;
		this.field5341 = 0;
		this.field5342 = var1;
		this.field5341 = var2;
		this.field5339 = var3;
		if (this.field5342 >= 0) {
			this.field5340.method9569(Skeleton.method5071(this.field5342).sequence);
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
