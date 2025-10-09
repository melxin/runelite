import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 287422131
	)
	static int field1097;
	@ObfuscatedName("uy")
	static boolean field1066;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	final ModelColorOverride field1071;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 505933543
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bm")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bg")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bu")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bs")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bq")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bo")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bp")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -251792193
	)
	int field1075;
	@ObfuscatedName("bh")
	boolean field1039;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 978817319
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -665060061
	)
	int field1041;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -466370441
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1302149883
	)
	@Export("index")
	int index;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 685317211
	)
	@Export("x")
	int x;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 846066717
	)
	@Export("y")
	int y;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2081229199
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1282019931
	)
	@Export("size")
	int size;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1613531013
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 533697083
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1337647397
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1898113267
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 948906663
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -257198315
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 2011468013
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1185665527
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -609442133
	)
	int field1079;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1299046359
	)
	int field1058;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1108053175
	)
	int field1059;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1383222953
	)
	int field1060;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1510923881
	)
	int field1046;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -700107183
	)
	int field1062;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -186348325
	)
	int field1047;
	@ObfuscatedName("ct")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cf")
	boolean field1096;
	@ObfuscatedName("ch")
	boolean field1077;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 404803153
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1238818657
	)
	int field1042;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1127515767
	)
	int field1081;
	@ObfuscatedName("cv")
	int[] field1070;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -297001057
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("poseAnimationSequence")
	AnimationSequence poseAnimationSequence;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	AnimationSequence field1074;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -407050073
	)
	int field1054;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -780276253
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -255741781
	)
	int field1032;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1663407599
	)
	int field1061;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2077670293
	)
	int field1080;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1414573947
	)
	int field1055;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1999048391
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 86191849
	)
	int field1083;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1891961233
	)
	int field1084;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1297933475
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 900283595
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -872960249
	)
	int field1087;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1656039391
	)
	int field1088;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 683716923
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ds")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dv")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lkj;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -294141475
	)
	int field1093;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -794583285
	)
	int field1094;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1881321705
	)
	int field1057;

	Actor(int var1) {
		this.field1071 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1075 = -1;
		this.npcCycle = -1;
		this.field1041 = -1;
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
		this.field1079 = -1;
		this.field1058 = -1;
		this.field1059 = -1;
		this.field1060 = -1;
		this.field1046 = -1;
		this.field1062 = -1;
		this.field1047 = -1;
		this.overheadText = null;
		this.field1077 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1042 = 0;
		this.field1081 = 0;
		this.field1070 = null;
		this.targetIndex = -1;
		this.poseAnimationSequence = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		this.field1074 = new AnimationSequence();
		this.field1054 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1087 = 0;
		this.field1088 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1093 = 0;
		this.field1094 = 0;
		this.field1057 = -1;
		this.index = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565244070"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class547.topLevelWorldView.plane;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2136021980"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1173982593"
	)
	int vmethod2813() {
		return 0;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "110726800"
	)
	int method2442() {
		return this.poseAnimationSequence.getId();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1740501367"
	)
	void method2508(int var1) {
		this.poseAnimationSequence.setSequence(var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2053336085"
	)
	int method2444() {
		AnimationSequence var1 = this.method2443();
		AnimationSequence var2 = this.method2470(var1);
		AnimationSequence var3 = var2;
		if (var2 == null) {
			var3 = this.animationSequence;
			if (var3 == null) {
				var3 = this.field1074;
			}
		}

		return var3.isActive() ? var3.getSequenceDefinition().animationHeightOffset : 0;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	int method2445() {
		return this.animationSequence.getId();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1563995801"
	)
	void method2446() {
		this.animationSequence.reset();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "960966229"
	)
	boolean method2447() {
		return this.animationSequence.isActive() && this.field1054 == 0;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IILkj;I)V",
		garbageValue = "1087262349"
	)
	void method2527(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "420231224"
	)
	void method2449(int var1, int var2) {
		this.pathLength = 0;
		this.field1094 = 0;
		this.field1093 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.size * 64 + this.pathX[0] * 128;
		this.y = this.size * 64 + this.pathY[0] * 128;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	final void method2450() {
		this.pathLength = 0;
		this.field1094 = 0;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1890231328"
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
			HitSplatDefinition var12 = class324.method7034(var1);
			var10 = var12.field2287;
			var11 = var12.field2278;
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

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "927936690"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = FaceNormal.method5454(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field2034 == var7.field2034) {
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

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1613958463"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = FaceNormal.method5454(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "953494869"
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

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "2070755417"
	)
	IterableNodeHashTable method2455() {
		return this.spotAnimations;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "893961206"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8636(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Ljd;",
		garbageValue = "385783335"
	)
	Model method2534(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2928;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8636(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var7.field5510 && !var7.animationSequence.method9634(30)) {
					Model var8 = class535.SpotAnimationDefinition_get(var7.id).method4480();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5526(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8636(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var11.field5510 && !var11.animationSequence.method9634(30)) {
					Model var9 = class535.SpotAnimationDefinition_get(var11.id).getModel(var11.animationSequence.getFrame());
					if (var9 != null) {
						var9.offsetBy(0, -var11.height, 0);
						var10.method5526(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "391602907"
	)
	boolean method2540() {
		AnimationSequence var1 = this.method2443();
		if (var1 != null && var1.isActive() && var1.getSequenceDefinition().method4823(var1.getFrame())) {
			return true;
		} else {
			AnimationSequence var2 = this.method2470(var1);
			if (var2 != null && var2.isActive() && var2.getSequenceDefinition().method4823(var2.getFrame())) {
				return true;
			} else {
				return var1 == null && var2 == null && this.field1074.isActive() && this.field1074.getSequenceDefinition().method4823(this.field1074.getFrame());
			}
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-993771092"
	)
	boolean method2459() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8636(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			if (Client.cycle >= var2.field5510) {
				SpotAnimationDefinition var3 = class535.SpotAnimationDefinition_get(var2.id);
				if (var2.animationSequence.isActive() && var2.animationSequence.getSequenceDefinition().method4823(var2.animationSequence.getFrame())) {
					return true;
				}

				Model var4 = var3.method4480();
				if (var4 != null && var4.faceAlphas != null) {
					return true;
				}
			}
		}

		return false;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2077324441"
	)
	void method2460() {
		this.field1039 = false;
		this.field1075 = -1;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1225897704"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1777919612"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)Lny;",
		garbageValue = "-804821334"
	)
	Coord method2463(WorldView var1) {
		if (var1 == class547.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method10190();
				int var7 = this.getPlane() - var2.method10191();
				double var8 = (double)(-var2.method10204()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)((double)var6 * var10 - (double)var7 * var12) + var3;
				int var15 = var4 + (int)(var10 * (double)var7 + (double)var6 * var12);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int vmethod2797() {
		return this.defaultHeight;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)Ldm;",
		garbageValue = "1514187661"
	)
	WorldView method2466() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : class547.topLevelWorldView;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	boolean method2538() {
		return this.field1083 >= Client.cycle;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;",
		garbageValue = "2133337989"
	)
	AnimationSequence method2443() {
		return this.field1054 == 0 && this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4856() ? this.animationSequence : null;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)Lrl;",
		garbageValue = "-511901936"
	)
	AnimationSequence method2470(AnimationSequence var1) {
		return !this.poseAnimationSequence.isActive() || !this.poseAnimationSequence.getSequenceDefinition().method4856() || this.method2442() == this.idleSequence && var1 != null ? null : this.poseAnimationSequence;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-441948503"
	)
	public static int method2548(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CLqd;I)I",
		garbageValue = "1955992814"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lpg;",
		garbageValue = "1728799143"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class479.masterDisk, BufferedNetSocket.field5515, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1072820829"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field502 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (WorldMapRenderer.getWindowedMode() == 1) {
			class32.client.setMaxCanvasSize(765, 503);
		} else {
			class32.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(WorldMapRenderer.getWindowedMode());
			var1.packetBuffer.writeShort(class4.canvasWidth);
			var1.packetBuffer.writeShort(class558.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
