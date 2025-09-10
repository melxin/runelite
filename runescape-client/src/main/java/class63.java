import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class63 {
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = 1874666475
	)
	static int field884;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "206495819"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1028045502"
	)
	static final void method2123() {
		if (class133.field1614) {
			WorldMapData_0.method6353();
			class133.field1614 = false;
		}

	}
}
