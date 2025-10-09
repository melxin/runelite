import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class335 {
	@ObfuscatedName("ab")
	static int[] field3845;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;

	static {
		new Object();
		field3845 = new int[33];
		field3845[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3845[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lop;",
		garbageValue = "-1662521454"
	)
	public static GameBuild[] method7109() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "1291175626"
	)
	public static void method7091(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}
}
