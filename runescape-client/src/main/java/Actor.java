import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	final ModelColorOverride field1054;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1169471309
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bm")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("be")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bo")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bw")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bf")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bj")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bd")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 867179357
	)
	int field1022;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -315295693
	)
	int field1059;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 623399329
	)
	int field1024;
	@ObfuscatedName("bg")
	boolean field1025;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 126165161
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -563527589
	)
	int field1027;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 442578005
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -133638623
	)
	@Export("index")
	int index;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1601824715
	)
	@Export("x")
	int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1516248195
	)
	@Export("y")
	int y;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -375352047
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1972277415
	)
	@Export("size")
	int size;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -2042472113
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1386438887
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1051182823
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1767744983
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -2047881681
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1562840885
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 164020113
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -169781847
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2139898563
	)
	int field1043;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 803527435
	)
	int field1052;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1868803719
	)
	int field1045;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1738776935
	)
	int field1046;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1574633953
	)
	int field1047;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 71691211
	)
	int field1074;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 938972313
	)
	int field1038;
	@ObfuscatedName("cf")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ch")
	boolean field1035;
	@ObfuscatedName("cp")
	boolean field1041;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 466990749
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 2136887885
	)
	int field1023;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1849694167
	)
	int field1055;
	@ObfuscatedName("cc")
	int[] field1056;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1814951647
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1236863861
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1378985189
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 552743143
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1471430401
	)
	int field1051;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -211433003
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1610883401
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 2061138279
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -797422177
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1358410453
	)
	int field1066;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -432258021
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1937618125
	)
	int field1062;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 2036286995
	)
	int field1070;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -320967829
	)
	int field1065;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -463757289
	)
	int field1072;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1495414251
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 483952347
	)
	int field1016;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 382662491
	)
	int field1012;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 535018137
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1721356931
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1778984871
	)
	int field1078;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -928035651
	)
	int field1079;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -164506973
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("da")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dz")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lkt;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 686084937
	)
	int field1085;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1766204877
	)
	int field1048;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1909156121
	)
	int field1086;

	Actor(int var1) {
		this.field1054 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1022 = -1;
		this.field1059 = -1;
		this.field1024 = -1;
		this.npcCycle = -1;
		this.field1027 = -1;
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
		this.field1043 = -1;
		this.field1052 = -1;
		this.field1045 = -1;
		this.field1046 = -1;
		this.field1047 = -1;
		this.field1074 = -1;
		this.field1038 = -1;
		this.overheadText = null;
		this.field1041 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1023 = 0;
		this.field1055 = 0;
		this.field1056 = null;
		this.targetIndex = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1051 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1066 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1078 = 0;
		this.field1079 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1085 = 0;
		this.field1048 = 0;
		this.field1086 = -1;
		this.index = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1537061280"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return Sound.topLevelWorldView.plane;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-55"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IILkt;I)V",
		garbageValue = "-1678199851"
	)
	void method2317(int var1, int var2, MoveSpeed var3) {
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
		garbageValue = "-1609606088"
	)
	void method2328(int var1, int var2) {
		this.pathLength = 0;
		this.field1048 = 0;
		this.field1085 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.size * -343670784 + this.pathX[0] * 128;
		this.y = this.size * -343670784 + this.pathY[0] * 128;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	final void method2296() {
		this.pathLength = 0;
		this.field1048 = 0;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1309791025"
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
			HitSplatDefinition var12 = ClientPreferences.method2477(var1);
			var10 = var12.field2194;
			var11 = var12.field2188;
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "80"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = Sound.method3719(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1961 == var7.field1961) {
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "894843679"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = Sound.method3719(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1839300153"
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
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5, var7), (long)var1);
			++this.graphicsCount;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "1951948890"
	)
	IterableNodeHashTable method2331() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2126488771"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8308(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)Ljm;",
		garbageValue = "61"
	)
	Model method2327(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2931;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8308(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class386.SpotAnimationDefinition_get(var7.spotAnimation).method4238();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5530(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8308(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class386.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5530(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1709280748"
	)
	void method2305() {
		this.field1025 = false;
		this.field1022 = -1;
		this.field1059 = -1;
		this.field1024 = -1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2121730630"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)Lnp;",
		garbageValue = "-1382608674"
	)
	Coord method2308(WorldView var1) {
		if (var1 == Sound.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method9711();
				int var7 = this.getPlane() - var2.method9712();
				double var8 = (double)(-var2.method9706()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var10 * (double)var6 - (double)var7 * var12) + var3;
				int var15 = var4 + (int)(var10 * (double)var7 + var12 * (double)var6);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "22549"
	)
	int vmethod2621() {
		return this.defaultHeight;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)Ldl;",
		garbageValue = "-106754762"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : Sound.topLevelWorldView;
	}
}
