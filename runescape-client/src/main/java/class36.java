import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class36 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("aj")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("fg")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldv;",
		garbageValue = "-72"
	)
	static AttackOption[] method697() {
		return new AttackOption[]{AttackOption.field1192, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1195, AttackOption.AttackOption_alwaysRightClick};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "514941940"
	)
	public static void method705() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "16"
	)
	public static int method700(int var0) {
		class143 var1 = UserComparator4.method3387(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3594() ? 0 : 1;
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIIII[Ljava/lang/String;III)V",
		garbageValue = "2046012377"
	)
	static void method703(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1003 = -1;
			BoundaryObject.method5841(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1008 = var5;
		var13.field1002 = var6;
		var13.field1001 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2278(var8);
		var13.method2292(var9);
	}
}
