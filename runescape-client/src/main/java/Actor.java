import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Actor")
public abstract class Actor extends Renderable implements CameraFocusableEntity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	final ModelColorOverride field1065;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 70809841
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bb")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bj")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bp")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bt")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bu")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -335130577
	)
	int field1009;
	@ObfuscatedName("bw")
	boolean field1020;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -618742451
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 413053887
	)
	int field1022;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1753020269
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1903023775
	)
	@Export("index")
	int index;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 340712311
	)
	@Export("x")
	int x;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1747310679
	)
	@Export("y")
	int y;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1777129311
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -919874483
	)
	@Export("size")
	int size;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1683244579
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1787008585
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -878052923
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1691426581
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1392171615
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1963363111
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 577914413
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -2045699099
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1665234837
	)
	int field1038;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1258908619
	)
	int field1027;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2019166665
	)
	int field1012;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 397393405
	)
	int field1041;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -2048617785
	)
	int field1042;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 2044363043
	)
	int field1040;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1077781875
	)
	int field1043;
	@ObfuscatedName("cp")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cd")
	boolean field1046;
	@ObfuscatedName("cz")
	boolean field1056;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 421730673
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1432687261
	)
	int field1049;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1059154345
	)
	int field1050;
	@ObfuscatedName("cq")
	int[] field1051;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -998106409
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("poseAnimationSequence")
	AnimationSequence poseAnimationSequence;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	AnimationSequence field1015;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1580752043
	)
	int field1017;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 942559465
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1977436663
	)
	int field1059;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -259434463
	)
	int field1060;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 2138954761
	)
	int field1061;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -276095977
	)
	int field1062;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 108069351
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 69976937
	)
	int field1057;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -246789331
	)
	int field1021;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1491799315
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1817477693
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1972883437
	)
	int field1068;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 662711013
	)
	int field1069;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1921456255
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dl")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 888202597
	)
	int field1074;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -114856975
	)
	int field1075;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -920641079
	)
	int field1076;

	Actor(int var1) {
		this.field1065 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1009 = -1;
		this.npcCycle = -1;
		this.field1022 = -1;
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
		this.field1038 = -1;
		this.field1027 = -1;
		this.field1012 = -1;
		this.field1041 = -1;
		this.field1042 = -1;
		this.field1040 = -1;
		this.field1043 = -1;
		this.overheadText = null;
		this.field1056 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1049 = 0;
		this.field1050 = 0;
		this.field1051 = null;
		this.targetIndex = -1;
		this.poseAnimationSequence = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		this.field1015 = new AnimationSequence();
		this.field1017 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1068 = 0;
		this.field1069 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1074 = 0;
		this.field1075 = 0;
		this.field1076 = -1;
		this.index = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "446304328"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return Occluder.topLevelWorldView.plane;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903085797"
	)
	protected int vmethod5827() {
		AnimationSequence var1 = this.method2507();
		AnimationSequence var2 = this.method2508(var1);
		AnimationSequence var3 = var2;
		if (var2 == null) {
			var3 = this.animationSequence;
			if (var3 == null) {
				var3 = this.field1015;
			}
		}

		return var3.isActive() ? var3.getSequenceDefinition().animationHeightOffset : 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1481041478"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-458299933"
	)
	int vmethod2828() {
		return 0;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1356161355"
	)
	int method2479() {
		return this.poseAnimationSequence.getId();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1252480495"
	)
	void method2548(int var1) {
		this.poseAnimationSequence.setSequence(var1);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-44590300"
	)
	int method2572() {
		return this.animationSequence.getId();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1660224990"
	)
	void method2486() {
		this.animationSequence.reset();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2125422907"
	)
	boolean method2484() {
		return this.animationSequence.isActive() && this.field1017 == 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IILlz;I)V",
		garbageValue = "-645794364"
	)
	void method2557(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1076394061"
	)
	void method2482(int var1, int var2) {
		this.pathLength = 0;
		this.field1075 = 0;
		this.field1074 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.size * -767295488 + this.pathX[0] * 128;
		this.y = this.size * -767295488 + this.pathY[0] * 128;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1773119452"
	)
	final void method2487() {
		this.pathLength = 0;
		this.field1075 = 0;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "32767"
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
			HitSplatDefinition var12 = class159.method4033(var1);
			var10 = var12.field2318;
			var11 = var12.field2309;
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

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "15"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			var8.field2047 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBarConfig var14 = null;
		HealthBarConfig var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBarConfig var13;
		for (var13 = (HealthBarConfig)this.healthBars.last(); var13 != null; var13 = (HealthBarConfig)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field2047 == var8.field2047) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBarConfig(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "327716789"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			var3.field2047 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBarConfig var5 = (HealthBarConfig)this.healthBars.last(); var5 != null; var5 = (HealthBarConfig)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1259962786"
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
		descriptor = "(I)Lql;",
		garbageValue = "-1495999345"
	)
	IterableNodeHashTable method2532() {
		return this.spotAnimations;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1935599509"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8854(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)Lky;",
		garbageValue = "1973682866"
	)
	Model method2495(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field3085;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8854(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var7.field5559 && !var7.animationSequence.method9876(30)) {
					Model var8 = class181.SpotAnimationDefinition_get(var7.id).method4564();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5912(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8854(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (Client.cycle >= var11.field5559 && !var11.animationSequence.method9876(30)) {
					Model var9 = class181.SpotAnimationDefinition_get(var11.id).getModel(var11.animationSequence.getFrame());
					if (var9 != null) {
						var9.offsetBy(0, -var11.height, 0);
						var10.method5912(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1561781710"
	)
	boolean method2496() {
		AnimationSequence var1 = this.method2507();
		if (var1 != null && var1.isActive() && var1.getSequenceDefinition().method4938(var1.getFrame())) {
			return true;
		} else {
			AnimationSequence var2 = this.method2508(var1);
			if (var2 != null && var2.isActive() && var2.getSequenceDefinition().method4938(var2.getFrame())) {
				return true;
			} else {
				return var1 == null && var2 == null && this.field1015.isActive() && this.field1015.getSequenceDefinition().method4938(this.field1015.getFrame());
			}
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "2048"
	)
	boolean method2537() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8854(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			if (Client.cycle >= var2.field5559) {
				SpotAnimationDefinition var3 = class181.SpotAnimationDefinition_get(var2.id);
				if (var2.animationSequence.isActive() && var2.animationSequence.getSequenceDefinition().method4938(var2.animationSequence.getFrame())) {
					return true;
				}

				Model var4 = var3.method4564();
				if (var4 != null && var4.faceAlphas != null) {
					return true;
				}
			}
		}

		return false;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-172768829"
	)
	void method2498() {
		this.field1020 = false;
		this.field1009 = -1;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1790262579"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-727737924"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)Loj;",
		garbageValue = "54"
	)
	Coord method2519(WorldView var1) {
		if (var1 == Occluder.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method10552();
				int var7 = this.getPlane() - var2.method10508();
				double var8 = (double)(-var2.method10529()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = var3 + (int)(var10 * (double)var6 - var12 * (double)var7);
				int var15 = (int)((double)var6 * var12 + var10 * (double)var7) + var4;
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "612699424"
	)
	int vmethod2826() {
		return this.defaultHeight + this.vmethod5827();
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)Ldd;",
		garbageValue = "-5"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : Occluder.topLevelWorldView;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	boolean method2506() {
		return this.field1057 >= Client.cycle;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)Lsj;",
		garbageValue = "2085604559"
	)
	AnimationSequence method2507() {
		return this.field1017 == 0 && this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4925() ? this.animationSequence : null;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lsj;I)Lsj;",
		garbageValue = "349458886"
	)
	AnimationSequence method2508(AnimationSequence var1) {
		return !this.poseAnimationSequence.isActive() || !this.poseAnimationSequence.getSequenceDefinition().method4925() || this.method2479() == this.idleSequence && var1 != null ? null : this.poseAnimationSequence;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIII)Z",
		garbageValue = "1889235760"
	)
	static boolean method2588(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		return ModelData0.method6246(var0, var1, var2, var3, var8, var9, var10, var11) || ModelData0.method6246(var2, var3, var4, var5, var8, var9, var10, var11) || ModelData0.method6246(var4, var5, var6, var7, var8, var9, var10, var11) || ModelData0.method6246(var6, var7, var0, var1, var8, var9, var10, var11);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CLqd;I)C",
		garbageValue = "-166188"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}
