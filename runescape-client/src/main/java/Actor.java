import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("pf")
	static int[][] field1286;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	final ModelColorOverride field1220;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -499202501
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bh")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("ba")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bk")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bd")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bc")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 66276601
	)
	int field1211;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -87916729
	)
	int field1222;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -197849979
	)
	int field1223;
	@ObfuscatedName("bv")
	boolean field1224;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1582787283
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1600974361
	)
	int field1226;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 666159709
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -495986951
	)
	@Export("index")
	int index;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1935452939
	)
	@Export("x")
	int x;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1785639253
	)
	@Export("y")
	int y;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1189441443
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -2010502167
	)
	@Export("size")
	int size;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 283681027
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1067878957
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 147747107
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 853067441
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1997949081
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1321632811
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1289996219
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 401537553
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1464076561
	)
	int field1215;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -804768447
	)
	int field1280;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1402330969
	)
	int field1244;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -735365017
	)
	int field1245;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1077365107
	)
	int field1246;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1561284969
	)
	int field1243;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -654730943
	)
	int field1248;
	@ObfuscatedName("ct")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ck")
	boolean field1227;
	@ObfuscatedName("cj")
	boolean field1251;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1490394423
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1277124311
	)
	int field1253;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 2075528809
	)
	int field1254;
	@ObfuscatedName("co")
	int[] field1255;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -206286905
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -395396925
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2090860199
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 137610079
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1010257071
	)
	int field1260;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -2046318331
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -678966771
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -841894057
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1741239947
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1265516427
	)
	int field1265;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -898787511
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 969175275
	)
	int field1256;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -189656167
	)
	int field1269;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1680335023
	)
	int field1270;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1797519049
	)
	int field1229;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -396252349
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -413043529
	)
	int field1273;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1792163521
	)
	int field1217;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -852181573
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -362694393
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -47889969
	)
	int field1277;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 594985559
	)
	int field1241;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1727033741
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dx")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dk")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[Lkw;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1264292269
	)
	int field1283;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1034318795
	)
	int field1284;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -200906387
	)
	int field1285;

	Actor(int var1) {
		this.field1220 = new ModelColorOverride();
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.false0 = false;
		this.field1211 = -1;
		this.field1222 = -1;
		this.field1223 = -1;
		this.npcCycle = -1;
		this.field1226 = -1;
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
		this.field1215 = -1;
		this.field1280 = -1;
		this.field1244 = -1;
		this.field1245 = -1;
		this.field1246 = -1;
		this.field1243 = -1;
		this.field1248 = -1;
		this.overheadText = null;
		this.field1251 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1253 = 0;
		this.field1254 = 0;
		this.field1255 = null;
		this.targetIndex = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1260 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1265 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1277 = 0;
		this.field1241 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1283 = 0;
		this.field1284 = 0;
		this.field1285 = -1;
		this.index = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "497971202"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IILkw;B)V",
		garbageValue = "-19"
	)
	void method2639(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1324379072"
	)
	void method2640(int var1, int var2) {
		this.pathLength = 0;
		this.field1284 = 0;
		this.field1283 = 0;
		this.pathX[0] = var1;
		this.pathY[0] = var2;
		this.x = this.pathX[0] * 128 + this.size * -729546752;
		this.y = this.pathY[0] * 128 + this.size * -729546752;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2005135798"
	)
	final void method2641() {
		this.pathLength = 0;
		this.field1284 = 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "102"
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
			HitSplatDefinition var12 = class172.method3755(var1);
			var10 = var12.field2859;
			var11 = var12.field2863;
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1253221793"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class136.method3355(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field2641 == var7.field2641) {
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1186735777"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class136.method3355(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "54"
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "-1448855357"
	)
	IterableNodeHashTable method2647() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method7939(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Lhe;",
		garbageValue = "-1034077852"
	)
	Model method2649(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2278;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method7939(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = ArchiveLoader.SpotAnimationDefinition_get(var7.spotAnimation).method5238();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4391(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method7939(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = ArchiveLoader.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4391(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1976818652"
	)
	void method2693() {
		this.field1224 = false;
		this.field1211 = -1;
		this.field1222 = -1;
		this.field1223 = -1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-77408734"
	)
	@Export("getY")
	public int getY() {
		return this.x;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.y;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)Lnt;",
		garbageValue = "376290850"
	)
	Coord method2653(WorldView var1) {
		if (var1 == class509.topLevelWorldView) {
			return new Coord(this.getX(), this.getY(), this.getPlane());
		} else {
			WorldEntity var2 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var1.id);
			if (var2 == null) {
				return new Coord(this.getX(), this.getY(), this.getPlane());
			} else {
				int var3 = var2.getY();
				int var4 = var2.getPlane();
				int var5 = var2.getX();
				int var6 = this.getY() - var2.method9339();
				int var7 = this.getPlane() - var2.method9337();
				double var8 = (double)(-var2.method9346()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var10 * (double)var6 - (double)var7 * var12) + var3;
				int var15 = (int)((double)var7 * var10 + var12 * (double)var6) + var4;
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1259627089"
	)
	@Export("getX")
	public int getX() {
		if (this.worldViewId != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.worldViewId);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class509.topLevelWorldView.plane;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "177433814"
	)
	int vmethod2917() {
		return this.defaultHeight;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)Ldj;",
		garbageValue = "1"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.worldViewId != -1 ? Client.worldViewManager.getWorldView(this.worldViewId) : class509.topLevelWorldView;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;ZLrk;B)V",
		garbageValue = "4"
	)
	public static void method2690(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		UserComparator8.ItemDefinition_archive = var0;
		class166.ItemDefinition_modelArchive = var1;
		ItemComposition.ItemDefinition_inMembersWorld = var2;
		class472.ItemDefinition_fileCount = UserComparator8.ItemDefinition_archive.getGroupFileCount(10);
		WorldMapAreaData.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1281444683"
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

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Loc;I)V",
		garbageValue = "1428795810"
	)
	static void method2699(WorldView var0, class386 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1352.method9060(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1352.method9056(var3));
			if (var4 != null && var4.method9328() == var1) {
				boolean var5 = var4.worldView.id == Client.field530;
				boolean var6;
				if (!var5) {
					var6 = var2 < Client.field574;
					if (!var6) {
						continue;
					}

					++var2;
				}

				var6 = false;
				if (var1 == class386.field4570) {
					var6 = AsyncHttpResponse.method280(var4, var0);
				}

				boolean var7 = var4.field5163.field2804 && !var6;
				int var8 = var4.getX();
				int var10 = var4.getY();
				int var9 = var10 >> 7;
				int var13 = var4.getPlane();
				int var12 = var13 >> 7;
				long var14 = LoginPacket.calculateTag(var8, var9, var12, 4, var7, var4.plane, var0.id);
				var4.worldEntityCoord.setZ(GraphicsObject.getTileHeight(var0, var4.getY(), var4.getPlane(), var0.plane));
				var4.worldView.scene.cycle = Client.cycle;
				var4.initScenePlane(var6);
				boolean var16 = var0.scene.drawEntity(var0.plane, var4.getY(), var4.getPlane(), var4.getZ(), 60, var4.worldView.scene, var4.method9346(), var14, false);
				if (var16 && !var6) {
					HorizontalAlignment.method5169(var4.worldView);
					WorldView var17 = var4.worldView;
					if (Client.combatTargetPlayerIndex >= 0 && var17.players.get((long)Client.combatTargetPlayerIndex) != null) {
						WorldMapRectangle.addPlayerToScene(var17, Client.combatTargetPlayerIndex, false);
					}

					class477.method9102(var4.worldView, true);
					WorldView var18 = var4.worldView;
					int var19 = Client.playerUpdateManager.playerCount;
					int[] var20 = Client.playerUpdateManager.playerIndices;

					for (int var21 = 0; var21 < var19; ++var21) {
						if (var20[var21] != Client.combatTargetPlayerIndex && var20[var21] != Client.localPlayerIndex) {
							WorldMapRectangle.addPlayerToScene(var18, var20[var21], true);
						}
					}

					class477.method9102(var4.worldView, false);
					class280.method5892(var4.worldView);
					WorldMapDecorationType.method7541(var4.worldView);
				}
			}
		}

	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(IIIILwc;Lne;I)V",
		garbageValue = "609943979"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class434.redHintArrowSprite.method10795(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			HttpRequestTask.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
