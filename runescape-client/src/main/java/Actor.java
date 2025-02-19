import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Actor")
public abstract class Actor extends TileItem implements Entity {
	@ObfuscatedName("an")
	boolean field1223;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1247290939
	)
	int field1271;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 406046155
	)
	@Export("x")
	int x;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 413352991
	)
	@Export("y")
	int y;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1569958261
	)
	int field1222;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -100682003
	)
	int field1284;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1714653857
	)
	int field1225;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1574036861
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1403333573
	)
	int field1292;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 760794665
	)
	int field1228;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -678951
	)
	int field1237;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1868589995
	)
	int field1238;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -704690621
	)
	int field1231;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -346870805
	)
	int field1232;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1476364845
	)
	int field1230;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 790194091
	)
	int field1234;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -359093475
	)
	int field1235;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -354797887
	)
	int field1272;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1889743683
	)
	int field1229;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -663087727
	)
	int field1243;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 975184475
	)
	int field1283;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1768635273
	)
	int field1240;
	@ObfuscatedName("bd")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("br")
	boolean field1242;
	@ObfuscatedName("bm")
	boolean field1293;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1200692789
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -766822967
	)
	int field1245;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 216056239
	)
	int field1246;
	@ObfuscatedName("cp")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cs")
	byte field1248;
	@ObfuscatedName("cj")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cy")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cb")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("co")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("ct")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -800607889
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ck")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -63911639
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1302450713
	)
	int field1258;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -168256407
	)
	int field1259;
	@ObfuscatedName("cw")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -215228143
	)
	int field1261;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -421208937
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -261002867
	)
	int field1263;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 610225343
	)
	int field1294;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 527657827
	)
	int field1265;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1054664907
	)
	int field1266;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1517708983
	)
	int field1262;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 416820659
	)
	int field1268;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1817647195
	)
	int field1255;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1473018667
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1574612575
	)
	int field1221;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -950421865
	)
	int field1273;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1938160895
	)
	int field1274;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1284405587
	)
	int field1275;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 2138752019
	)
	int field1276;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1291252565
	)
	int field1239;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1184220103
	)
	int field1278;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1101084935
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 492292523
	)
	int field1280;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -124401555
	)
	int field1281;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	final class258 field1286;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -902194799
	)
	int field1282;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1214035749
	)
	int field1264;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1915778493
	)
	int field1267;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -754790111
	)
	int field1227;
	@ObfuscatedName("do")
	int[] field1287;
	@ObfuscatedName("dx")
	int[] field1288;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	MoveSpeed[] field1289;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1627110221
	)
	int field1277;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1678954297
	)
	int field1291;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1686322921
	)
	int field1257;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1911563667
	)
	int field1219;

	Actor(int var1) {
		this.field1223 = false;
		this.field1284 = 1;
		this.idleSequence = -1;
		this.field1292 = -1;
		this.field1228 = -1;
		this.field1237 = -1;
		this.field1238 = -1;
		this.field1231 = -1;
		this.field1232 = -1;
		this.field1230 = -1;
		this.field1234 = -1;
		this.field1235 = -1;
		this.field1272 = -1;
		this.field1229 = -1;
		this.field1243 = -1;
		this.field1283 = -1;
		this.field1240 = -1;
		this.overheadText = null;
		this.field1293 = false;
		this.rotation = 100;
		this.field1245 = 0;
		this.field1246 = 0;
		this.pathX = null;
		this.field1248 = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.isWalking = false;
		this.movementSequence = -1;
		this.field1258 = -1;
		this.field1259 = -1;
		this.field1261 = -1;
		this.movementFrame = 0;
		this.field1263 = 0;
		this.field1294 = 0;
		this.field1265 = -1;
		this.field1266 = 0;
		this.field1262 = 0;
		this.field1268 = 0;
		this.field1255 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.defaultHeight = 200;
		this.field1280 = -1;
		this.field1281 = -1;
		this.field1286 = new class258();
		this.field1264 = 0;
		this.field1267 = 32;
		this.field1227 = 0;
		this.field1287 = new int[10];
		this.field1288 = new int[10];
		this.field1289 = new MoveSpeed[10];
		this.field1277 = 0;
		this.field1291 = 0;
		this.field1257 = -1;
		this.field1219 = -1;
		this.field1271 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "657986527"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IILkn;B)V",
		garbageValue = "-45"
	)
	void method2590(int var1, int var2, MoveSpeed var3) {
		if (this.field1227 < 9) {
			++this.field1227;
		}

		for (int var4 = this.field1227; var4 > 0; --var4) {
			this.field1287[var4] = this.field1287[var4 - 1];
			this.field1288[var4] = this.field1288[var4 - 1];
			this.field1289[var4] = this.field1289[var4 - 1];
		}

		this.field1287[0] = var1;
		this.field1288[0] = var2;
		this.field1289[0] = var3;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "86"
	)
	void method2623(int var1, int var2) {
		this.field1227 = 0;
		this.field1291 = 0;
		this.field1277 = 0;
		this.field1287[0] = var1;
		this.field1288[0] = var2;
		this.x = this.field1284 * 64 + this.field1287[0] * 128;
		this.y = this.field1284 * 64 + this.field1288[0] * 128;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1870852483"
	)
	final void method2592() {
		this.field1227 = 0;
		this.field1291 = 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "3885396"
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
			HitSplatDefinition var12 = NpcOverrides.method3920(var1);
			var10 = var12.field2207;
			var11 = var12.field2205;
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
				this.field1248 = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.field1248;
				this.field1248 = (byte)((this.field1248 + 1) % 4);
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1068583891"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = ClientPreferences.method2709(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1980 == var7.field1980) {
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1327028883"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = ClientPreferences.method2709(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-526058520"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "1"
	)
	IterableNodeHashTable method2655() {
		return this.spotAnimations;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method7899(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljf;B)Ljf;",
		garbageValue = "105"
	)
	Model method2600(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.field2884;
			int var5 = var1.field2896;
			byte var6 = var1.field2904;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method7899(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class176.method3761(var7.spotAnimation).method3997();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.field2884;
						var5 += var8.field2896;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5257(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method7899(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class176.method3761(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5257(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	void method2601() {
		this.false0 = false;
		this.movementSequence = -1;
		this.field1258 = -1;
		this.field1259 = -1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1017918393"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ldp;B)Lnq;",
		garbageValue = "-113"
	)
	Coord method2604(WorldView var1) {
		if (var1 == class200.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			class492 var2 = (class492)class200.topLevelWorldView.field1358.get((long)var1.field1354);
			if (var2 == null) {
				return new Coord(this.getPlane(), this.getX(), this.getY());
			} else {
				int var3 = var2.getX();
				int var4 = var2.getY();
				int var5 = var2.getPlane();
				int var6 = this.getX() - var2.method9295();
				int var7 = this.getY() - var2.method9348();
				double var8 = (double)(-var2.method9290()) * 3.141592653589793D / 1024.0D;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = var3 + (int)(var10 * (double)var6 - var12 * (double)var7);
				int var15 = var4 + (int)((double)var7 * var10 + (double)var6 * var12);
				return new Coord(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "640118507"
	)
	@Export("getPlane")
	public int getPlane() {
		if (this.field1219 != -1) {
			WorldView var1 = Client.worldViewManager.method2546(this.field1219);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class200.topLevelWorldView.plane;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28116"
	)
	int vmethod2898() {
		return this.defaultHeight;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Ldp;",
		garbageValue = "-1821048708"
	)
	WorldView method2607() {
		return this.field1219 != -1 ? Client.worldViewManager.method2546(this.field1219) : class200.topLevelWorldView;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2019031656"
	)
	static int method2660(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1671725936"
	)
	public static void method2618() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Lvu;I)V",
		garbageValue = "-1578985055"
	)
	static void method2603(WorldView var0, PacketBuffer var1) {
		WorldView var2 = class376.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field514[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field514[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		FriendSystem.field845 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				FriendSystem.field845[var6][var7] = var1.readInt();
			}
		}

		UrlRequester.field1504 = new int[var5];
		SecureRandomFuture.field1016 = new int[var5];
		class450.field4944 = new int[var5];
		class139.field1661 = new byte[var5][];
		class159.field1785 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field514[var6][var7][var8];
					if (var9 != -1) {
						int var10 = var9 >> 14 & 1023;
						int var11 = var9 >> 3 & 2047;
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (UrlRequester.field1504[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							UrlRequester.field1504[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							SecureRandomFuture.field1016[var5] = class166.archive6.getGroupId("m" + var13 + "_" + var14);
							class450.field4944[var5] = class166.archive6.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		class511.updateGameState(25);
		Client.field520 = true;
		class105.field1384 = var2;
		UserComparator6.method3265(var2);
	}
}
