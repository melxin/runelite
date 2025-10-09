import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class149 extends class150 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -433586583
	)
	int field1764;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class149(class153 var1) {
		this.this$0 = var1;
		this.field1764 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1764 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3988(this.field1764);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)I",
		garbageValue = "2098102306"
	)
	static int method3901(RawPcmStream var0) {
		return var0 != null ? var0.method3257() : 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([JIII)V",
		garbageValue = "-395771654"
	)
	static void method3896(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lcc;I)V",
		garbageValue = "-379502987"
	)
	static final void method3900(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var3 != 0L) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = BuddyRankComparator.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1012 = var6;
		var1.field1011 = var7;
	}
}
