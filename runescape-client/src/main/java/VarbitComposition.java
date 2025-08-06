import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("al")
	static final int[] field2207;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1255076423
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1142076203
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1838225857
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1324654765
	)
	@Export("endBit")
	public int endBit;

	static {
		field2207 = new int[32];
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2207[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1791016684"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "-102"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lco;I)V",
		garbageValue = "-1060337149"
	)
	static final void method4480(WorldView var0, PendingSpawn var1) {
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
			var5 = class70.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1017 = var6;
		var1.field1009 = var7;
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-855989691"
	)
	static void method4479(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class476.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
