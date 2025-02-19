import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class194 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("ah")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Ldp;B)Z",
		garbageValue = "24"
	)
	static boolean method3975(class492 var0, WorldView var1) {
		Bounds var2 = class215.method4379(var0.getX(), var0.getY(), var0.method9290(), var0.field5149);

		int var3;
		for (var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
			Player var4 = (Player)var1.field1353.method7890((long)Client.playerUpdateManager.playerIndices[var3]);
			if (var4 != null && var2.method8260(var4.x, var4.y)) {
				var2.method8284();
				return true;
			}
		}

		for (var3 = 0; var3 < var1.field1355.method9005(); ++var3) {
			NPC var7 = (NPC)var1.field1356.method7890((long)var1.field1355.method9007(var3));
			if (var7 != null && var2.method8260(var7.x, var7.y)) {
				for (int var6 = 0; var6 < var7.definition.actions.length; ++var6) {
					if (var7.definition.actions[var6] != null) {
						var2.method8284();
						return true;
					}
				}
			}
		}

		for (var3 = 0; var3 < var1.field1357.method9005(); ++var3) {
			class492 var8 = (class492)var1.field1358.get((long)var1.field1357.method9007(var3));
			if (var8 != null && var8 != var0 && var8.field5148.scene.baseY == Client.cycle) {
				Bounds var5 = class215.method4379(var8.getX(), var8.getY(), var8.method9290(), var8.field5149);
				if (var2.method8257(var5)) {
					var2.method8284();
					var5.method8284();
					return true;
				}

				var5.method8284();
			}
		}

		var2.method8284();
		return false;
	}
}
