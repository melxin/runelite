import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 2401494802445669407L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 754275415
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1152331983
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1284909137
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1367703823
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1490093769
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -115667083
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "-610796991"
	)
	public static void method5842(AbstractArchive var0) {
		class559.field5585 = var0;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2104549399"
	)
	static final void method5840() {
		ConcurrentMidiTask.method9288();
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lcc;S)V",
		garbageValue = "-6519"
	)
	static final void method5841(WorldView var0, PendingSpawn var1) {
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
			var5 = DirectByteArrayCopier.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field999 = var6;
		var1.field1000 = var7;
	}
}
