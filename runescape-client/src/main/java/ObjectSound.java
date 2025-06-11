import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	static AbstractSocket field653;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1131180031
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -275650299
	)
	@Export("x")
	final int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2085882123
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1842172823
	)
	@Export("maxX")
	final int maxX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1170668485
	)
	@Export("maxY")
	final int maxY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 550171561
	)
	final int field645;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("obj")
	final ObjectComposition obj;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 443155313
	)
	int field646;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2091518745
	)
	int field647;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 635755441
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 106761089
	)
	int field643;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 86766499
	)
	int field651;
	@ObfuscatedName("af")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2140607899
	)
	int field650;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	@ObfuscatedSignature(
		descriptor = "(IIIIILik;)V"
	)
	ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
		this.plane = var1;
		this.x = var2;
		this.y = Coord.method7228(var3);
		this.maxX = Coord.method7228(var4);
		int var7 = var6.sizeX;
		int var8 = var6.sizeY;
		if (var5 == 1 || var5 == 3) {
			var7 = var6.sizeY;
			var8 = var6.sizeX;
		}

		this.maxY = Coord.method7228(var3 + var7);
		this.field645 = Coord.method7228(var8 + var4);
		this.soundEffectId = var6.ambientSoundId;
		this.field646 = Coord.method7228(var6.int7);
		this.field647 = Math.max(Coord.method7228(var6.int8 - 1), 0);
		this.field643 = var6.int5;
		this.field651 = var6.int6;
		this.soundEffectIds = var6.soundEffectIds;
		if (var6.transforms != null) {
			this.obj = var6;
			this.set();
		} else {
			this.obj = null;
		}

		if (this.soundEffectIds != null) {
			this.field650 = this.field643 + (int)(Math.random() * (double)(this.field651 - this.field643));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field646 = Coord.method7228(var2.int7);
			this.field647 = Coord.method7228(var2.int8);
			this.field643 = var2.int5;
			this.field651 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field646 = 0;
			this.field647 = 0;
			this.field643 = 0;
			this.field651 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId) {
			this.method1593();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1434439585"
	)
	void method1593() {
		if (this.stream1 != null) {
			UserComparator6.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "567966176"
	)
	void method1555() {
		if (this.stream2 != null) {
			UserComparator6.pcmStreamMixer.removeSubStream(this.stream2);
			this.stream2 = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "484428853"
	)
	int method1556() {
		return this.soundEffectId;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	int method1557() {
		return this.y;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	int method1558() {
		return this.maxY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2051945534"
	)
	int method1559() {
		return this.maxX;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-660605054"
	)
	int method1560() {
		return this.field645;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1276273555"
	)
	int method1561() {
		return this.x;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-629119022"
	)
	int method1562() {
		return this.field646;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	int method1565() {
		return this.field647;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "502005707"
	)
	public static void method1583() {
		class36.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqp;III)I",
		garbageValue = "-405545737"
	)
	static int method1601(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "209767292"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "20427667"
	)
	static final int method1600(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class201.method4292(var3, var5);
		int var8 = class201.method4292(var3 + 1, var5);
		int var9 = class201.method4292(var3, var5 + 1);
		int var10 = class201.method4292(var3 + 1, var5 + 1);
		int var11 = SceneTilePaint.method5725(var7, var8, var4, var2);
		int var12 = SceneTilePaint.method5725(var9, var10, var4, var2);
		return SceneTilePaint.method5725(var11, var12, var6, var2);
	}
}
