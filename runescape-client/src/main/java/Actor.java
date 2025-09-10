import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	final ModelColorOverride field1076;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1854930575
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bb")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bo")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("by")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bg")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bx")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bz")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 846922369
	)
	int field1049;
	@ObfuscatedName("be")
	boolean field1050;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1255835765
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -476427083
	)
	int field1052;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -495009501
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1651928137
	)
	@Export("index")
	int index;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 303437413
	)
	@Export("x")
	int x;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1160761169
	)
	@Export("y")
	int y;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -586567781
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1283096512
	)
	@Export("size")
	int size;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1817974403
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 825481483
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1625246641
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1012524313
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -819852111
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1972770459
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1662117781
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1237655323
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1548333261
	)
	int field1068;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -226312921
	)
	int field1065;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -969249701
	)
	int field1090;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1017389471
	)
	int field1071;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -236142133
	)
	int field1069;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -646858059
	)
	int field1061;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 746784379
	)
	int field1105;
	@ObfuscatedName("cq")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cn")
	boolean field1101;
	@ObfuscatedName("cl")
	boolean field1077;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2124863453
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1694399019
	)
	int field1079;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -696017381
	)
	int field1080;
	@ObfuscatedName("cy")
	int[] field1081;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1358362101
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("poseAnimationSequence")
	AnimationSequence poseAnimationSequence;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	AnimationSequence field1093;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1029683027
	)
	int field1102;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -255704089
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 187769141
	)
	int field1089;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1285640149
	)
	int field1072;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1247127995
	)
	int field1091;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1261495719
	)
	int field1084;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -498749091
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1871268445
	)
	int field1094;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -761854131
	)
	int field1095;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1541058847
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1455508697
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -61048109
	)
	int field1098;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -714512343
	)
	int field1099;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -986510815
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dm")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dz")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1183749097
	)
	int field1104;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1998868437
	)
	int field1040;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 747209251
	)
	int field1106;

	Actor(int var1) {
		this.field1076 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1049 = -1;
		this.npcCycle = -1;
		this.field1052 = -1;
		this.worldViewId = -1;
		this.isWalking = false;
		this.size = 64;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1068 = -1;
		this.field1065 = -1;
		this.field1090 = -1;
		this.field1071 = -1;
		this.field1069 = -1;
		this.field1061 = -1;
		this.field1105 = -1;
		this.overheadText = null;
		this.field1077 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1079 = 0;
		this.field1080 = 0;
		this.field1081 = null;
		this.targetIndex = -1;
		this.poseAnimationSequence = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		this.field1093 = new AnimationSequence();
		this.field1102 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1098 = 0;
		this.field1099 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1104 = 0;
		this.field1040 = 0;
		this.field1106 = -1;
		this.index = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class333.topLevelWorldView.plane;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1641761362"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	int vmethod2763() {
		return 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1289418566"
	)
	int method2416() {
		return this.poseAnimationSequence.getId();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2062840113"
	)
	void method2438(int var1) {
		this.poseAnimationSequence.setSequence(var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "48778735"
	)
	int method2417() {
		AnimationSequence var1 = this.method2441();
		AnimationSequence var2 = this.method2419(var1);
		AnimationSequence var3 = var2;
		if (var2 == null) {
			var3 = this.animationSequence;
			if (var3 == null) {
				var3 = this.field1093;
			}
		}

		return var3.isActive() ? var3.getSequenceDefinition().animationHeightOffset : 0;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	int method2484() {
		return this.animationSequence.getId();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-659191107"
	)
	void method2472() {
		this.animationSequence.reset();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2112180199"
	)
	boolean method2420() {
		return this.animationSequence.isActive() && this.field1102 == 0;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IILko;B)V",
		garbageValue = "-35"
	)
	void method2421(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1428644699"
	)
	void method2422(int var1, int var2) {
		this.pathLength = 0;
		this.field1040 = 0;
		this.field1104 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.pathX[0] * 128 + this.size * 92278784;
		this.y = this.pathY[0] * 128 + this.size * 92278784;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1763316687"
	)
	final void method2423() {
		this.pathLength = 0;
		this.field1040 = 0;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "991931135"
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
			HitSplatDefinition var12 = MusicPatchNode2.method7103(var1);
			var10 = var12.field2298;
			var11 = var12.field2289;
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1543431796"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = InvDefinition.method4153(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field2042 == var7.field2042) {
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

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1946793930"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = InvDefinition.method4153(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1811444680"
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(S)Lqm;",
		garbageValue = "10263"
	)
	IterableNodeHashTable method2429() {
		return this.spotAnimations;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2085814437"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8573(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;S)Ljn;",
		garbageValue = "-31221"
	)
	Model method2431(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2934;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8573(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var7.field5444 && !var7.animationSequence.method9567(30)) {
					Model var8 = ModeWhere.SpotAnimationDefinition_get(var7.id).method4405();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5572(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8573(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var11.field5444 && !var11.animationSequence.method9567(30)) {
					Model var9 = ModeWhere.SpotAnimationDefinition_get(var11.id).getModel(var11.animationSequence.getFrame());
					if (var9 != null) {
						var9.offsetBy(0, -var11.height, 0);
						var10.method5572(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "322527999"
	)
	void method2432() {
		this.field1050 = false;
		this.field1049 = -1;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5422"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "955086849"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)Lna;",
		garbageValue = "-1256856098"
	)
	Coord method2435(WorldView var1) {
		if (var1 == class333.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method10077();
				int var7 = this.getPlane() - var2.method10093();
				double var8 = (double)(-var2.method10110()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = var3 + (int)((double)var6 * var10 - var12 * (double)var7);
				int var15 = var4 + (int)((double)var6 * var12 + (double)var7 * var10);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-370338102"
	)
	int vmethod2734() {
		return this.defaultHeight;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)Ldr;",
		garbageValue = "48"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : class333.topLevelWorldView;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1380581508"
	)
	boolean method2440() {
		return this.field1094 >= Client.cycle;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)Lsp;",
		garbageValue = "-1430666237"
	)
	AnimationSequence method2441() {
		return this.field1102 == 0 && this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4791() ? this.animationSequence : null;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lsp;B)Lsp;",
		garbageValue = "101"
	)
	AnimationSequence method2419(AnimationSequence var1) {
		return !this.poseAnimationSequence.isActive() || !this.poseAnimationSequence.getSequenceDefinition().method4791() || this.method2416() == this.idleSequence && var1 != null ? null : this.poseAnimationSequence;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-216608611"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
