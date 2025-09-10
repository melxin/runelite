import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ao")
	public static int[] field5390;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1759439157
	)
	public int field5389;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("at")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5389 = (int)(class189.method4284() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V",
		garbageValue = "2003318548"
	)
	public static void method9922(AbstractArchive var0, AbstractArchive var1) {
		class169.WorldMapElement_archive = var1;
		WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
		class255.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			byte[] var3 = var0.takeFile(35, var2);
			class255.WorldMapElement_cached[var2] = new WorldMapElement(var2);
			if (var3 != null) {
				class255.WorldMapElement_cached[var2].decode(new Buffer(var3));
				class255.WorldMapElement_cached[var2].method4183();
			}
		}

	}
}
