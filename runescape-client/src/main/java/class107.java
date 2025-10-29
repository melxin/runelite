import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class107 extends Node {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	class101 field1398;

	public class107() {
		this.field1398 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class107(VorbisSample var1) {
		if (var1 != null) {
			this.field1398 = new class101(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ldq;)V"
	)
	public class107(RawSound var1) {
		this.field1398 = new class101((VorbisSample)null, var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2011319333"
	)
	public boolean method3479() {
		return this.field1398 == null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ldq;",
		garbageValue = "-2146256813"
	)
	public RawSound method3478() {
		if (this.field1398 != null && this.field1398.field1361.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method3489();
			} finally {
				this.field1398.field1361.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ldq;",
		garbageValue = "1621"
	)
	public RawSound method3484() {
		if (this.field1398 != null) {
			this.field1398.field1361.lock();

			RawSound var1;
			try {
				var1 = this.method3489();
			} finally {
				this.field1398.field1361.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ldq;",
		garbageValue = "-226875568"
	)
	RawSound method3489() {
		if (this.field1398.field1360 == null) {
			this.field1398.field1360 = this.field1398.field1359.toRawSound((int[])null);
			this.field1398.field1359 = null;
		}

		return this.field1398.field1360;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "989955989"
	)
	static void method3490(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbn;Lbn;IZI)I",
		garbageValue = "991765083"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1562() ? (var1.method1562() ? 0 : 1) : (var1.method1562() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1535() ? (var1.method1535() ? 0 : 1) : (var1.method1535() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
