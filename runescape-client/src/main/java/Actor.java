import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2138138423
	)
	@Export("x")
	int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1494548179
	)
	@Export("y")
	int y;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -605676703
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ba")
	int field1199;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -373889063
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1827642847
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1080218049
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1038783201
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2067872323
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -329573829
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 903596675
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 556962821
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1343291871
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1519581381
	)
	int field1209;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -416433321
	)
	int field1228;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -846575233
	)
	int field1266;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -535340637
	)
	int field1212;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 34060063
	)
	int field1213;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 157614889
	)
	int field1214;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -676843339
	)
	int field1215;
	@ObfuscatedName("by")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bs")
	boolean field1217;
	@ObfuscatedName("bc")
	boolean field1218;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 897041691
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 636558879
	)
	int field1223;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1042283555
	)
	int field1211;
	@ObfuscatedName("cv")
	int[] field1222;
	@ObfuscatedName("cn")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ck")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cs")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("co")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("ci")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1245972765
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cb")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1142990649
	)
	int field1242;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 234075085
	)
	int field1251;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1961892221
	)
	int field1234;
	@ObfuscatedName("cu")
	boolean field1227;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 590400839
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1333693095
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 2040782511
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1369979963
	)
	int field1239;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1400873349
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1043355907
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 800977685
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -103666323
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1945916907
	)
	int field1195;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1079083789
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 512025447
	)
	int field1247;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1854855739
	)
	int field1248;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -2016432785
	)
	int field1249;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -923175797
	)
	int field1250;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1840770145
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 2142171051
	)
	int field1252;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1681292157
	)
	int field1253;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1400511441
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1055308123
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1068540955
	)
	int field1256;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1568966553
	)
	int field1264;
	@ObfuscatedName("dn")
	byte field1224;
	@ObfuscatedName("de")
	byte field1235;
	@ObfuscatedName("dy")
	byte field1240;
	@ObfuscatedName("dj")
	byte field1233;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1117284043
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1648540089
	)
	int field1263;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1990161443
	)
	int field1241;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1820678361
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ds")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dv")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -2104923049
	)
	int field1269;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1595780475
	)
	int field1270;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 867603811
	)
	int field1271;

	Actor() {
		this.isWalking = false;
		this.field1199 = -720464675;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1209 = -1;
		this.field1228 = -1;
		this.field1266 = -1;
		this.field1212 = -1;
		this.field1213 = -1;
		this.field1214 = -1;
		this.field1215 = -1;
		this.overheadText = null;
		this.field1218 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1223 = 0;
		this.field1211 = 0;
		this.field1222 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1242 = -1;
		this.field1251 = -1;
		this.field1234 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1239 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1195 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1256 = -1;
		this.field1264 = -1;
		this.field1263 = 0;
		this.field1241 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1269 = 0;
		this.field1270 = 0;
		this.field1271 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-399095249"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	@Export("getPlane")
	public int getPlane() {
		return HttpRequest.topLevelWorldView.plane;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1426757895"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	final void method2641() {
		this.pathLength = 0;
		this.field1270 = 0;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-687771977"
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
			HitSplatDefinition var12 = ObjectSound.method1997(var1);
			var10 = var12.field2137;
			var11 = var12.field2139;
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2097504196"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = WorldMapSectionType.method6191(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1934 == var7.field1934) {
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1867246206"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = WorldMapSectionType.method6191(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1252965633"
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

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)Lug;",
		garbageValue = "53"
	)
	IterableNodeHashTable method2655() {
		return this.spotAnimations;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "813811462"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9758(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)Ljt;",
		garbageValue = "-2045251281"
	)
	Model method2649(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2842;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9758(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = ViewportMouse.SpotAnimationDefinition_get(var7.spotAnimation).method3977();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5243(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9758(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = ViewportMouse.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5243(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "529313999"
	)
	void method2650() {
		this.field1227 = false;
		this.field1242 = -1;
		this.field1251 = -1;
		this.field1234 = -1;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)Lny;",
		garbageValue = "708895071"
	)
	Coord method2653(WorldView var1) {
		if (var1 == HttpRequest.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			WorldEntity var2 = HttpRequest.topLevelWorldView.worldEntities[var1.id];
			if (var2 == null) {
				return new Coord(this.getPlane(), this.getX(), this.getY());
			} else {
				int var3 = var2.getX();
				int var4 = var2.getY();
				int var5 = var2.getPlane();
				int var6 = this.getX() - var2.method9143();
				int var7 = this.getY() - var2.method9138();
				double var8 = (double)(-var2.method9139()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var10 * (double)var6 - (double)var7 * var12) + var3;
				int var15 = var4 + (int)(var10 * (double)var7 + var12 * (double)var6);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int vmethod2908() {
		return this.defaultHeight;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "-1966818981"
	)
	public static class225 method2671() {
		return class225.field2425;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "347067722"
	)
	public static void method2695() {
		KitDefinition.KitDefinition_archive = null;
		class204.KitDefinition_modelsArchive = null;
		class419.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnp;S)I",
		garbageValue = "-4397"
	)
	static int method2694(Widget var0) {
		if (var0.type != 11) {
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var0.method7333(var1);
			return 1;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "662132406"
	)
	public static int method2696(byte[] var0, int var1) {
		return class153.method3484(var0, 0, var1);
	}
}
