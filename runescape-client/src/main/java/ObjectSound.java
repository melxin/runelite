import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1658232713
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -396202969
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1025989504
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 404406400
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1843843753
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1365479901
	)
	int field855;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1642624233
	)
	int field856;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -863000725
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2026086577
	)
	int field863;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2070922601
	)
	int field860;
	@ObfuscatedName("ai")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2111284051
	)
	int field859;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1981055479"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field855 = var2.int7 * 16384;
			this.field856 = var2.int8 * 128;
			this.field863 = var2.int5;
			this.field860 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field855 = 0;
			this.field856 = 0;
			this.field863 = 0;
			this.field860 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			WorldMapIcon_0.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhf;",
		garbageValue = "685889571"
	)
	public static VarcInt method1966(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3816(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIIIII[Ljava/lang/String;IIB)V",
		garbageValue = "-21"
	)
	static void method1959(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
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
			var13.field1210 = -1;
			InterfaceParent.method2436(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1206 = var5;
		var13.field1215 = var6;
		var13.field1207 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2577(var8);
		var13.method2588(var9);
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)I",
		garbageValue = "-5"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return WorldMapSprite.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
