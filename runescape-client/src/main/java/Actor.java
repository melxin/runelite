import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1044338629
	)
	@Export("x")
	int x;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -44433783
	)
	@Export("y")
	int y;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1109153491
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bi")
	int field1268;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1885349025
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 408666501
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1781032555
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1665125451
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 921539101
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1799682331
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1831323307
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1035765939
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1958052337
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1098434191
	)
	int field1198;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1810956249
	)
	int field1210;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1236663809
	)
	int field1251;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1182852731
	)
	int field1212;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1924630875
	)
	int field1234;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 831501533
	)
	int field1214;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1260523133
	)
	int field1220;
	@ObfuscatedName("bn")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("br")
	boolean field1217;
	@ObfuscatedName("bl")
	boolean field1218;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1094599131
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 586079917
	)
	int field1224;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 706657945
	)
	int field1215;
	@ObfuscatedName("co")
	int[] field1222;
	@ObfuscatedName("cg")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cp")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cz")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cy")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cq")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 22371881
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ci")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 494164555
	)
	int field1232;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 915871279
	)
	int field1233;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 811066719
	)
	int field1205;
	@ObfuscatedName("cx")
	boolean field1235;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1390751545
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1960117487
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -793241015
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 312972075
	)
	int field1239;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 692374621
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1052118849
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -71050643
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -55010777
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 380280781
	)
	int field1244;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1325828101
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 2072273527
	)
	int field1247;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -26101679
	)
	int field1248;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -634919257
	)
	int field1249;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -663741603
	)
	int field1250;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1481667593
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1577237363
	)
	int field1199;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -257058879
	)
	int field1253;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -155503131
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1175348523
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1897724421
	)
	int field1256;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -2074636425
	)
	int field1252;
	@ObfuscatedName("dw")
	byte field1258;
	@ObfuscatedName("dv")
	byte field1211;
	@ObfuscatedName("dx")
	byte field1261;
	@ObfuscatedName("dd")
	byte field1208;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1943045167
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1920209465
	)
	int field1231;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 692684441
	)
	int field1200;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -3955027
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dp")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("di")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1053384727
	)
	int field1269;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 557903775
	)
	int field1270;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -175457685
	)
	int field1209;

	Actor() {
		this.isWalking = false;
		this.field1268 = 1387352433;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1198 = -1;
		this.field1210 = -1;
		this.field1251 = -1;
		this.field1212 = -1;
		this.field1234 = -1;
		this.field1214 = -1;
		this.field1220 = -1;
		this.overheadText = null;
		this.field1218 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1224 = 0;
		this.field1215 = 0;
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
		this.field1232 = -1;
		this.field1233 = -1;
		this.field1205 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1239 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1244 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1256 = -1;
		this.field1252 = -1;
		this.field1231 = 0;
		this.field1200 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1269 = 0;
		this.field1270 = 0;
		this.field1209 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "392218032"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "251050381"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "105"
	)
	@Export("getPlane")
	public int getPlane() {
		return GameEngine.topLevelWorldView.plane;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1435204403"
	)
	final void method2774() {
		this.pathLength = 0;
		this.field1270 = 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1451040373"
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
			HitSplatDefinition var12 = IntProjection.method4104(var1);
			var10 = var12.field2769;
			var11 = var12.field2773;
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-928882178"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class30.method482(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field2568 == var7.field2568) {
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-257894628"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class30.method482(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-594909621"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Lue;",
		garbageValue = "781842535"
	)
	IterableNodeHashTable method2810() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9951(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lhv;I)Lhv;",
		garbageValue = "-381356017"
	)
	Model method2807(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2212;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9951(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = ObjectComposition.SpotAnimationDefinition_get(var7.spotAnimation).method5365();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4553(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9951(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = ObjectComposition.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4553(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711623629"
	)
	void method2782() {
		this.field1235 = false;
		this.field1232 = -1;
		this.field1233 = -1;
		this.field1205 = -1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)Lnz;",
		garbageValue = "-32"
	)
	Coord method2785(WorldView var1) {
		if (var1 == GameEngine.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			WorldEntity var2 = GameEngine.topLevelWorldView.worldEntities[var1.id];
			if (var2 == null) {
				return new Coord(this.getPlane(), this.getX(), this.getY());
			} else {
				int var3 = var2.getX();
				int var4 = var2.getY();
				int var5 = var2.getPlane();
				int var6 = this.getX() - var2.method9287();
				int var7 = this.getY() - var2.method9296();
				double var8 = (double)(-var2.method9291()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = var3 + (int)((double)var6 * var10 - var12 * (double)var7);
				int var15 = var4 + (int)((double)var6 * var12 + (double)var7 * var10);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "140502690"
	)
	int vmethod3030() {
		return this.defaultHeight;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I[BLsh;I)V",
		garbageValue = "-419021337"
	)
	static void method2784(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4530) {
			if (ArchiveDiskActionHandler.field4526 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4526 = 600;
		}
	}
}
