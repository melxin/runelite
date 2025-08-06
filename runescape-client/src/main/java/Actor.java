import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	final ModelColorOverride field1066;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 383253283
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bm")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bq")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bv")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bx")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bl")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bf")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bd")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 152608263
	)
	int field1062;
	@ObfuscatedName("ba")
	boolean field1068;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1572731953
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 2126075317
	)
	int field1026;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 773626309
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -890084545
	)
	@Export("index")
	int index;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -678502515
	)
	@Export("x")
	int x;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 502098815
	)
	@Export("y")
	int y;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1043778481
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2095967375
	)
	@Export("size")
	int size;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1621036649
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 10798323
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -147382113
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1779256329
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1101502993
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -860442435
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1856027021
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1294401241
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -570549651
	)
	int field1077;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -236019291
	)
	int field1050;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1493408613
	)
	int field1051;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 146474537
	)
	int field1052;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 90250411
	)
	int field1020;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1663613755
	)
	int field1061;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1790033953
	)
	int field1055;
	@ObfuscatedName("cv")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cc")
	boolean field1054;
	@ObfuscatedName("cp")
	boolean field1058;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -233999167
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -194158403
	)
	int field1060;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -986870303
	)
	int field1078;
	@ObfuscatedName("ct")
	int[] field1030;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1760991351
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("poseAnimationSequence")
	AnimationSequence poseAnimationSequence;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	AnimationSequence field1081;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1923299729
	)
	int field1059;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 621650187
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1360058743
	)
	int field1070;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 265691937
	)
	int field1071;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 842126163
	)
	int field1072;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1833722367
	)
	int field1073;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -460383175
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1709256017
	)
	int field1075;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1421878403
	)
	int field1076;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -57103607
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -77613671
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1695729143
	)
	int field1079;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 749185769
	)
	int field1041;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 606175875
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dw")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("de")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Lke;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -860800707
	)
	int field1085;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 397526263
	)
	int field1086;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -195756245
	)
	int field1087;

	Actor(int var1) {
		this.field1066 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1062 = -1;
		this.npcCycle = -1;
		this.field1026 = -1;
		this.worldViewId = -1;
		this.isWalking = false;
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1077 = -1;
		this.field1050 = -1;
		this.field1051 = -1;
		this.field1052 = -1;
		this.field1020 = -1;
		this.field1061 = -1;
		this.field1055 = -1;
		this.overheadText = null;
		this.field1058 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1060 = 0;
		this.field1078 = 0;
		this.field1030 = null;
		this.targetIndex = -1;
		this.poseAnimationSequence = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		this.field1081 = new AnimationSequence();
		this.field1059 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1079 = 0;
		this.field1041 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1085 = 0;
		this.field1086 = 0;
		this.field1087 = -1;
		this.index = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261334993"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class7.topLevelWorldView.plane;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113253836"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1615218034"
	)
	int vmethod2682() {
		return 0;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1047267276"
	)
	int method2382() {
		return this.poseAnimationSequence.getId();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-108"
	)
	void method2383(int var1) {
		this.poseAnimationSequence.setSequence(var1);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-116"
	)
	int method2442() {
		return !this.poseAnimationSequence.isActive() ? 0 : this.poseAnimationSequence.getSequenceDefinition().animationHeightOffset;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1311739468"
	)
	int method2384() {
		return this.animationSequence.getId();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1400803774"
	)
	void method2385() {
		this.animationSequence.reset();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "24172801"
	)
	boolean method2386() {
		return this.animationSequence.isActive() && this.field1059 == 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IILke;I)V",
		garbageValue = "-1098134547"
	)
	void method2387(int var1, int var2, MoveSpeed var3) {
		if (this.pathLength < 9) {
			++this.pathLength;
		}

		for (int var4 = this.pathLength; var4 > 0; --var4) {
			this.pathX[var4] = this.pathX[var4 - 1];
			this.pathY[var4] = this.pathY[var4 - 1];
			this.pathTraversed[var4] = this.pathTraversed[var4 - 1];
		}

		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.pathTraversed[0] = var3;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "350151172"
	)
	void method2462(int var1, int var2) {
		this.pathLength = 0;
		this.field1086 = 0;
		this.field1085 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.pathX[0] * 128 + this.size * -821821440;
		this.y = this.pathY[0] * 128 + this.size * -821821440;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1174741864"
	)
	final void method2391() {
		this.pathLength = 0;
		this.field1086 = 0;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "838758847"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = BuddyRankComparator.method3550(var1);
			var10 = var12.field2247;
			var11 = var12.field2238;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2000908122"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = UserComparator3.method3522(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field2015 == var7.field2015) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBarConfig(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1215385283"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = UserComparator3.method3522(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "107"
	)
	@Export("updateSpotAnimation")
	void updateSpotAnimation(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		ActorSpotAnim var6 = (ActorSpotAnim)this.spotAnimations.get((long)var1);
		if (var6 != null) {
			var6.remove();
			--this.graphicsCount;
		}

		if (var2 != 65535 && var2 != -1) {
			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5), (long)var1);
			++this.graphicsCount;
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "932071800"
	)
	IterableNodeHashTable method2404() {
		return this.spotAnimations;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-782050843"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8621(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ljx;I)Ljx;",
		garbageValue = "-45803249"
	)
	Model method2396(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2878;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8621(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var7.field5339 && !var7.animationSequence.method9601(30)) {
					Model var8 = Skeleton.SpotAnimationDefinition_get(var7.id).method4394();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5508(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8621(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var11.field5339 && !var11.animationSequence.method9601(30)) {
					Model var9 = Skeleton.SpotAnimationDefinition_get(var11.id).getModel(var11.animationSequence.getFrame());
					if (var9 != null) {
						var9.offsetBy(0, -var11.height, 0);
						var10.method5508(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-53356906"
	)
	void method2397() {
		this.field1068 = false;
		this.field1062 = -1;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1626965421"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Ldj;S)Lng;",
		garbageValue = "253"
	)
	Coord method2400(WorldView var1) {
		if (var1 == class7.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method10091();
				int var7 = this.getPlane() - var2.method10154();
				double var8 = (double)(-var2.method10098()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = var3 + (int)((double)var6 * var10 - var12 * (double)var7);
				int var15 = var4 + (int)((double)var6 * var12 + (double)var7 * var10);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	int vmethod2681() {
		return this.defaultHeight;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)Ldj;",
		garbageValue = "1327044398"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : class7.topLevelWorldView;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1544868589"
	)
	boolean method2405() {
		return this.field1075 >= Client.cycle;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)Lrk;",
		garbageValue = "688990277"
	)
	AnimationSequence method2427() {
		return this.field1059 == 0 && this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4719() ? this.animationSequence : null;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Lrk;I)Lrk;",
		garbageValue = "-2145855541"
	)
	AnimationSequence method2407(AnimationSequence var1) {
		return !this.poseAnimationSequence.isActive() || !this.poseAnimationSequence.getSequenceDefinition().method4719() || this.method2382() == this.idleSequence && var1 != null ? null : this.poseAnimationSequence;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lke;",
		garbageValue = "-422481686"
	)
	public static MoveSpeed[] method2472() {
		return new MoveSpeed[]{MoveSpeed.field3194, MoveSpeed.field3197, MoveSpeed.field3195, MoveSpeed.field3192};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1823940216"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class329.garbageCollector == null || !class329.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class329.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class329.garbageCollector != null) {
			long var9 = UserComparator7.method3496();
			long var3 = class329.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
