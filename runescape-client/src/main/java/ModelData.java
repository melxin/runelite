import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("ModelData")
public class ModelData extends TileItem {
	@ObfuscatedName("bq")
	static int[] field2551;
	@ObfuscatedName("bx")
	static int[] field2545;
	@ObfuscatedName("bf")
	static int field2572;
	@ObfuscatedName("bc")
	@Export("ModelData_sine")
	static int[] ModelData_sine;
	@ObfuscatedName("bb")
	@Export("ModelData_cosine")
	static int[] ModelData_cosine;
	@ObfuscatedName("ad")
	int field2533;
	@ObfuscatedName("ah")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ac")
	int[] field2535;
	@ObfuscatedName("ao")
	int[] field2546;
	@ObfuscatedName("af")
	@Export("faceCount")
	int faceCount;
	@ObfuscatedName("aa")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("as")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ae")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ax")
	@Export("faceRenderTypes")
	byte[] faceRenderTypes;
	@ObfuscatedName("ai")
	@Export("textureRenderTypes")
	byte[] textureRenderTypes;
	@ObfuscatedName("ak")
	byte[] field2543;
	@ObfuscatedName("aj")
	@Export("textureCoords")
	byte[] textureCoords;
	@ObfuscatedName("av")
	@Export("faceColors")
	short[] faceColors;
	@ObfuscatedName("ar")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ag")
	@Export("priority")
	byte priority;
	@ObfuscatedName("az")
	@Export("textureTriangleCount")
	int textureTriangleCount;
	@ObfuscatedName("am")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("aq")
	@Export("texTriangleX")
	short[] texTriangleX;
	@ObfuscatedName("aw")
	short[] field2550;
	@ObfuscatedName("an")
	short[] field2547;
	@ObfuscatedName("at")
	@Export("vertexSkins")
	int[] vertexSkins;
	@ObfuscatedName("ap")
	int[] field2554;
	@ObfuscatedName("al")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bw")
	int[][] field2548;
	@ObfuscatedName("bo")
	int[][] field2544;
	@ObfuscatedName("bs")
	int[][] field2558;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Ljp;"
	)
	class248[] field2559;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Ljy;"
	)
	VertexNormal[] field2560;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Ljy;"
	)
	VertexNormal[] field2561;
	@ObfuscatedName("bg")
	public short field2562;
	@ObfuscatedName("bv")
	public short field2563;
	@ObfuscatedName("bk")
	@Export("isBoundsCalculated")
	boolean isBoundsCalculated;
	@ObfuscatedName("bu")
	int field2565;
	@ObfuscatedName("by")
	int field2566;
	@ObfuscatedName("bh")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("be")
	int field2530;
	@ObfuscatedName("bj")
	int field2540;

	static {
		field2551 = new int[10000];
		field2545 = new int[10000];
		field2572 = 0;
		ModelData_sine = Rasterizer3D.Rasterizer3D_sine;
		ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine;
	}

	ModelData() {
		this.field2533 = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljk;I)V"
	)
	public ModelData(ModelData[] var1, int var2) {
		this.field2533 = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field2533 = 0;
		this.faceCount = 0;
		this.textureTriangleCount = 0;
		this.priority = -1;

		int var10;
		ModelData var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field2533 += var11.field2533;
				this.faceCount += var11.faceCount;
				this.textureTriangleCount += var11.textureTriangleCount;
				if (var11.textureRenderTypes != null) {
					var4 = true;
				} else {
					if (this.priority == -1) {
						this.priority = var11.priority;
					}

					if (this.priority != var11.priority) {
						var4 = true;
					}
				}

				var3 |= var11.faceRenderTypes != null;
				var5 |= var11.field2543 != null;
				var6 |= var11.field2554 != null;
				var7 |= var11.faceTextures != null;
				var8 |= var11.textureCoords != null;
				var9 |= var11.field2544 != null;
			}
		}

		this.verticesX = new int[this.field2533];
		this.field2535 = new int[this.field2533];
		this.field2546 = new int[this.field2533];
		this.vertexSkins = new int[this.field2533];
		this.indices1 = new int[this.faceCount];
		this.indices2 = new int[this.faceCount];
		this.indices3 = new int[this.faceCount];
		if (var3) {
			this.faceRenderTypes = new byte[this.faceCount];
		}

		if (var4) {
			this.textureRenderTypes = new byte[this.faceCount];
		}

		if (var5) {
			this.field2543 = new byte[this.faceCount];
		}

		if (var6) {
			this.field2554 = new int[this.faceCount];
		}

		if (var7) {
			this.faceTextures = new short[this.faceCount];
		}

		if (var8) {
			this.textureCoords = new byte[this.faceCount];
		}

		if (var9) {
			this.field2544 = new int[this.field2533][];
			this.field2558 = new int[this.field2533][];
		}

		this.faceColors = new short[this.faceCount];
		if (this.textureTriangleCount > 0) {
			this.faceRenderPriorities = new byte[this.textureTriangleCount];
			this.texTriangleX = new short[this.textureTriangleCount];
			this.field2550 = new short[this.textureTriangleCount];
			this.field2547 = new short[this.textureTriangleCount];
		}

		this.field2533 = 0;
		this.faceCount = 0;
		this.textureTriangleCount = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.faceCount; ++var12) {
					if (var3 && var11.faceRenderTypes != null) {
						this.faceRenderTypes[this.faceCount] = var11.faceRenderTypes[var12];
					}

					if (var4) {
						if (var11.textureRenderTypes != null) {
							this.textureRenderTypes[this.faceCount] = var11.textureRenderTypes[var12];
						} else {
							this.textureRenderTypes[this.faceCount] = var11.priority;
						}
					}

					if (var5 && var11.field2543 != null) {
						this.field2543[this.faceCount] = var11.field2543[var12];
					}

					if (var6 && var11.field2554 != null) {
						this.field2554[this.faceCount] = var11.field2554[var12];
					}

					if (var7) {
						if (var11.faceTextures != null) {
							this.faceTextures[this.faceCount] = var11.faceTextures[var12];
						} else {
							this.faceTextures[this.faceCount] = -1;
						}
					}

					if (var8) {
						if (var11.textureCoords != null && var11.textureCoords[var12] != -1) {
							this.textureCoords[this.faceCount] = (byte)(this.textureTriangleCount + var11.textureCoords[var12]);
						} else {
							this.textureCoords[this.faceCount] = -1;
						}
					}

					this.faceColors[this.faceCount] = var11.faceColors[var12];
					this.indices1[this.faceCount] = this.method4645(var11, var11.indices1[var12]);
					this.indices2[this.faceCount] = this.method4645(var11, var11.indices2[var12]);
					this.indices3[this.faceCount] = this.method4645(var11, var11.indices3[var12]);
					++this.faceCount;
				}

				for (var12 = 0; var12 < var11.textureTriangleCount; ++var12) {
					byte var13 = this.faceRenderPriorities[this.textureTriangleCount] = var11.faceRenderPriorities[var12];
					if (var13 == 0) {
						this.texTriangleX[this.textureTriangleCount] = (short)this.method4645(var11, var11.texTriangleX[var12]);
						this.field2550[this.textureTriangleCount] = (short)this.method4645(var11, var11.field2550[var12]);
						this.field2547[this.textureTriangleCount] = (short)this.method4645(var11, var11.field2547[var12]);
					}

					++this.textureTriangleCount;
				}
			}
		}

	}

	ModelData(byte[] var1) {
		this.field2533 = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method4709(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method4641(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method4642(var1);
		} else {
			this.method4643(var1);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljk;ZZZZ)V",
		garbageValue = "1"
	)
	public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field2533 = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		this.field2533 = var1.field2533;
		this.faceCount = var1.faceCount;
		this.textureTriangleCount = var1.textureTriangleCount;
		int var6;
		if (var2) {
			this.verticesX = var1.verticesX;
			this.field2535 = var1.field2535;
			this.field2546 = var1.field2546;
		} else {
			this.verticesX = new int[this.field2533];
			this.field2535 = new int[this.field2533];
			this.field2546 = new int[this.field2533];

			for (var6 = 0; var6 < this.field2533; ++var6) {
				this.verticesX[var6] = var1.verticesX[var6];
				this.field2535[var6] = var1.field2535[var6];
				this.field2546[var6] = var1.field2546[var6];
			}
		}

		if (var3) {
			this.faceColors = var1.faceColors;
		} else {
			this.faceColors = new short[this.faceCount];

			for (var6 = 0; var6 < this.faceCount; ++var6) {
				this.faceColors[var6] = var1.faceColors[var6];
			}
		}

		if (!var4 && var1.faceTextures != null) {
			this.faceTextures = new short[this.faceCount];

			for (var6 = 0; var6 < this.faceCount; ++var6) {
				this.faceTextures[var6] = var1.faceTextures[var6];
			}
		} else {
			this.faceTextures = var1.faceTextures;
		}

		this.field2543 = var1.field2543;
		this.indices1 = var1.indices1;
		this.indices2 = var1.indices2;
		this.indices3 = var1.indices3;
		this.faceRenderTypes = var1.faceRenderTypes;
		this.textureRenderTypes = var1.textureRenderTypes;
		this.textureCoords = var1.textureCoords;
		this.priority = var1.priority;
		this.faceRenderPriorities = var1.faceRenderPriorities;
		this.texTriangleX = var1.texTriangleX;
		this.field2550 = var1.field2550;
		this.field2547 = var1.field2547;
		this.vertexSkins = var1.vertexSkins;
		this.field2554 = var1.field2554;
		this.vertexLabels = var1.vertexLabels;
		this.field2548 = var1.field2548;
		this.field2560 = var1.field2560;
		this.field2559 = var1.field2559;
		this.field2561 = var1.field2561;
		this.field2544 = var1.field2544;
		this.field2558 = var1.field2558;
		this.field2562 = var1.field2562;
		this.field2563 = var1.field2563;
	}

	public ModelData(int var1, int var2, int var3) {
		this.field2533 = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		this.verticesX = new int[var1];
		this.field2535 = new int[var1];
		this.field2546 = new int[var1];
		this.vertexSkins = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceRenderTypes = new byte[var2];
		this.textureRenderTypes = new byte[var2];
		this.field2543 = new byte[var2];
		this.faceColors = new short[var2];
		this.faceTextures = new short[var2];
		this.textureCoords = new byte[var2];
		this.field2554 = new int[var2];
		if (var3 > 0) {
			this.faceRenderPriorities = new byte[var3];
			this.texTriangleX = new short[var3];
			this.field2550 = new short[var3];
			this.field2547 = new short[var3];
		}

	}

	@ObfuscatedName("au")
	void method4709(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.field5570 = var1.length - 26;
		int var9 = var2.readUnsignedShort();
		int var10 = var2.readUnsignedShort();
		int var11 = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedByte();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = var2.readUnsignedShort();
		int var24 = var2.readUnsignedShort();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.faceRenderPriorities = new byte[var11];
			var2.field5570 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.faceRenderPriorities[var28] = var2.readByte();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field2533 = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.field2535 = new int[var9];
		this.field2546 = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var17 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new byte[var10];
		}

		if (var13 == 255) {
			this.textureRenderTypes = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.field2543 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2554 = new int[var10];
		}

		if (var16 == 1) {
			this.faceTextures = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.textureCoords = new byte[var10];
		}

		if (var18 == 1) {
			this.field2544 = new int[var9][];
			this.field2558 = new int[var9][];
		}

		this.faceColors = new short[var10];
		if (var11 > 0) {
			this.texTriangleX = new short[var11];
			this.field2550 = new short[var11];
			this.field2547 = new short[var11];
		}

		var2.field5570 = var11;
		var3.field5570 = var40;
		var4.field5570 = var41;
		var5.field5570 = var42;
		var6.field5570 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.readUnsignedByte();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.readShortSmart();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.readShortSmart();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.readShortSmart();
			}

			this.verticesX[var53] = var50 + var55;
			this.field2535[var53] = var51 + var56;
			this.field2546[var53] = var52 + var57;
			var50 = this.verticesX[var53];
			var51 = this.field2535[var53];
			var52 = this.field2546[var53];
			if (var17 == 1) {
				this.vertexSkins[var53] = var6.readUnsignedByte();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.readUnsignedByte();
				this.field2544[var53] = new int[var54];
				this.field2558[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2544[var53][var55] = var6.readUnsignedByte();
					this.field2558[var53][var55] = var6.readUnsignedByte();
				}
			}
		}

		var2.field5570 = var39;
		var3.field5570 = var30;
		var4.field5570 = var32;
		var5.field5570 = var35;
		var6.field5570 = var33;
		var7.field5570 = var37;
		var8.field5570 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.faceColors[var53] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var53] = var3.readByte();
			}

			if (var13 == 255) {
				this.textureRenderTypes[var53] = var4.readByte();
			}

			if (var14 == 1) {
				this.field2543[var53] = var5.readByte();
			}

			if (var15 == 1) {
				this.field2554[var53] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var53] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var53] != -1) {
				this.textureCoords[var53] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.field5570 = var36;
		var3.field5570 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.readUnsignedByte();
			if (var58 == 1) {
				var53 = var2.readShortSmart() + var56;
				var54 = var2.readShortSmart() + var53;
				var55 = var2.readShortSmart() + var54;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var59;
				this.indices3[var57] = var55;
			}
		}

		var2.field5570 = var43;
		var3.field5570 = var44;
		var4.field5570 = var45;
		var5.field5570 = var46;
		var6.field5570 = var47;
		var7.field5570 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.faceRenderPriorities[var57] & 255;
			if (var58 == 0) {
				this.texTriangleX[var57] = (short)var2.readUnsignedShort();
				this.field2550[var57] = (short)var2.readUnsignedShort();
				this.field2547[var57] = (short)var2.readUnsignedShort();
			}
		}

		var2.field5570 = var28;
		var57 = var2.readUnsignedByte();
		if (var57 != 0) {
			new class263();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	@ObfuscatedName("ad")
	void method4641(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.field5570 = var1.length - 23;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedByte();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		int var21 = var4.readUnsignedShort();
		int var22 = var4.readUnsignedShort();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field2533 = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.field2535 = new int[var9];
		this.field2546 = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.faceRenderPriorities = new byte[var11];
			this.texTriangleX = new short[var11];
			this.field2550 = new short[var11];
			this.field2547 = new short[var11];
		}

		if (var16 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new byte[var10];
			this.textureCoords = new byte[var10];
			this.faceTextures = new short[var10];
		}

		if (var13 == 255) {
			this.textureRenderTypes = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.field2543 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2554 = new int[var10];
		}

		if (var17 == 1) {
			this.field2544 = new int[var9][];
			this.field2558 = new int[var9][];
		}

		this.faceColors = new short[var10];
		var4.field5570 = var23;
		var5.field5570 = var34;
		var6.field5570 = var35;
		var7.field5570 = var47;
		var8.field5570 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.readUnsignedByte();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.readShortSmart();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.readShortSmart();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.readShortSmart();
			}

			this.verticesX[var40] = var37 + var42;
			this.field2535[var40] = var38 + var43;
			this.field2546[var40] = var39 + var44;
			var37 = this.verticesX[var40];
			var38 = this.field2535[var40];
			var39 = this.field2546[var40];
			if (var16 == 1) {
				this.vertexSkins[var40] = var8.readUnsignedByte();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.readUnsignedByte();
				this.field2544[var40] = new int[var41];
				this.field2558[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field2544[var40][var42] = var8.readUnsignedByte();
					this.field2558[var40][var42] = var8.readUnsignedByte();
				}
			}
		}

		var4.field5570 = var32;
		var5.field5570 = var28;
		var6.field5570 = var26;
		var7.field5570 = var30;
		var8.field5570 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.faceColors[var40] = (short)var4.readUnsignedShort();
			if (var12 == 1) {
				var41 = var5.readUnsignedByte();
				if ((var41 & 1) == 1) {
					this.faceRenderTypes[var40] = 1;
					var2 = true;
				} else {
					this.faceRenderTypes[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.textureCoords[var40] = (byte)(var41 >> 2);
					this.faceTextures[var40] = this.faceColors[var40];
					this.faceColors[var40] = 127;
					if (this.faceTextures[var40] != -1) {
						var3 = true;
					}
				} else {
					this.textureCoords[var40] = -1;
					this.faceTextures[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.textureRenderTypes[var40] = var6.readByte();
			}

			if (var14 == 1) {
				this.field2543[var40] = var7.readByte();
			}

			if (var15 == 1) {
				this.field2554[var40] = var8.readUnsignedByte();
			}
		}

		var4.field5570 = var31;
		var5.field5570 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.readUnsignedByte();
			if (var45 == 1) {
				var40 = var4.readShortSmart() + var43;
				var41 = var4.readShortSmart() + var40;
				var42 = var4.readShortSmart() + var41;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var46;
				this.indices3[var44] = var42;
			}
		}

		var4.field5570 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.faceRenderPriorities[var44] = 0;
			this.texTriangleX[var44] = (short)var4.readUnsignedShort();
			this.field2550[var44] = (short)var4.readUnsignedShort();
			this.field2547[var44] = (short)var4.readUnsignedShort();
		}

		if (this.textureCoords != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.textureCoords[var45] & 255;
				if (var46 != 255) {
					if (this.indices1[var45] == (this.texTriangleX[var46] & '\uffff') && this.indices2[var45] == (this.field2550[var46] & '\uffff') && this.indices3[var45] == (this.field2547[var46] & '\uffff')) {
						this.textureCoords[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.textureCoords = null;
			}
		}

		if (!var3) {
			this.faceTextures = null;
		}

		if (!var2) {
			this.faceRenderTypes = null;
		}

	}

	@ObfuscatedName("ah")
	void method4642(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.field5570 = var1.length - 23;
		int var9 = var2.readUnsignedShort();
		int var10 = var2.readUnsignedShort();
		int var11 = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedShort();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.faceRenderPriorities = new byte[var11];
			var2.field5570 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.faceRenderPriorities[var26] = var2.readByte();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field2533 = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.field2535 = new int[var9];
		this.field2546 = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var17 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new byte[var10];
		}

		if (var13 == 255) {
			this.textureRenderTypes = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.field2543 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2554 = new int[var10];
		}

		if (var16 == 1) {
			this.faceTextures = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.textureCoords = new byte[var10];
		}

		this.faceColors = new short[var10];
		if (var11 > 0) {
			this.texTriangleX = new short[var11];
			this.field2550 = new short[var11];
			this.field2547 = new short[var11];
		}

		var2.field5570 = var11;
		var3.field5570 = var38;
		var4.field5570 = var39;
		var5.field5570 = var40;
		var6.field5570 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.readUnsignedByte();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.readShortSmart();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.readShortSmart();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.readShortSmart();
			}

			this.verticesX[var51] = var48 + var53;
			this.field2535[var51] = var49 + var54;
			this.field2546[var51] = var50 + var55;
			var48 = this.verticesX[var51];
			var49 = this.field2535[var51];
			var50 = this.field2546[var51];
			if (var17 == 1) {
				this.vertexSkins[var51] = var6.readUnsignedByte();
			}
		}

		var2.field5570 = var37;
		var3.field5570 = var28;
		var4.field5570 = var30;
		var5.field5570 = var33;
		var6.field5570 = var31;
		var7.field5570 = var35;
		var8.field5570 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.faceColors[var51] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var51] = var3.readByte();
			}

			if (var13 == 255) {
				this.textureRenderTypes[var51] = var4.readByte();
			}

			if (var14 == 1) {
				this.field2543[var51] = var5.readByte();
			}

			if (var15 == 1) {
				this.field2554[var51] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var51] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var51] != -1) {
				this.textureCoords[var51] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.field5570 = var34;
		var3.field5570 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.readUnsignedByte();
			if (var56 == 1) {
				var51 = var2.readShortSmart() + var54;
				var52 = var2.readShortSmart() + var51;
				var53 = var2.readShortSmart() + var52;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var57;
				this.indices3[var55] = var53;
			}
		}

		var2.field5570 = var41;
		var3.field5570 = var42;
		var4.field5570 = var43;
		var5.field5570 = var44;
		var6.field5570 = var45;
		var7.field5570 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.faceRenderPriorities[var55] & 255;
			if (var56 == 0) {
				this.texTriangleX[var55] = (short)var2.readUnsignedShort();
				this.field2550[var55] = (short)var2.readUnsignedShort();
				this.field2547[var55] = (short)var2.readUnsignedShort();
			}
		}

		var2.field5570 = var26;
		var55 = var2.readUnsignedByte();
		if (var55 != 0) {
			new class263();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	@ObfuscatedName("ac")
	void method4643(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.field5570 = var1.length - 18;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedShort();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field2533 = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.field2535 = new int[var9];
		this.field2546 = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.faceRenderPriorities = new byte[var11];
			this.texTriangleX = new short[var11];
			this.field2550 = new short[var11];
			this.field2547 = new short[var11];
		}

		if (var16 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new byte[var10];
			this.textureCoords = new byte[var10];
			this.faceTextures = new short[var10];
		}

		if (var13 == 255) {
			this.textureRenderTypes = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.field2543 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2554 = new int[var10];
		}

		this.faceColors = new short[var10];
		var4.field5570 = var21;
		var5.field5570 = var32;
		var6.field5570 = var33;
		var7.field5570 = var45;
		var8.field5570 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.readUnsignedByte();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.readShortSmart();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.readShortSmart();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.readShortSmart();
			}

			this.verticesX[var38] = var35 + var40;
			this.field2535[var38] = var36 + var41;
			this.field2546[var38] = var37 + var42;
			var35 = this.verticesX[var38];
			var36 = this.field2535[var38];
			var37 = this.field2546[var38];
			if (var16 == 1) {
				this.vertexSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.field5570 = var30;
		var5.field5570 = var26;
		var6.field5570 = var24;
		var7.field5570 = var28;
		var8.field5570 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.faceColors[var38] = (short)var4.readUnsignedShort();
			if (var12 == 1) {
				var39 = var5.readUnsignedByte();
				if ((var39 & 1) == 1) {
					this.faceRenderTypes[var38] = 1;
					var2 = true;
				} else {
					this.faceRenderTypes[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.textureCoords[var38] = (byte)(var39 >> 2);
					this.faceTextures[var38] = this.faceColors[var38];
					this.faceColors[var38] = 127;
					if (this.faceTextures[var38] != -1) {
						var3 = true;
					}
				} else {
					this.textureCoords[var38] = -1;
					this.faceTextures[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.textureRenderTypes[var38] = var6.readByte();
			}

			if (var14 == 1) {
				this.field2543[var38] = var7.readByte();
			}

			if (var15 == 1) {
				this.field2554[var38] = var8.readUnsignedByte();
			}
		}

		var4.field5570 = var29;
		var5.field5570 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.readUnsignedByte();
			if (var43 == 1) {
				var38 = var4.readShortSmart() + var41;
				var39 = var4.readShortSmart() + var38;
				var40 = var4.readShortSmart() + var39;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var44;
				this.indices3[var42] = var40;
			}
		}

		var4.field5570 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.faceRenderPriorities[var42] = 0;
			this.texTriangleX[var42] = (short)var4.readUnsignedShort();
			this.field2550[var42] = (short)var4.readUnsignedShort();
			this.field2547[var42] = (short)var4.readUnsignedShort();
		}

		if (this.textureCoords != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.textureCoords[var43] & 255;
				if (var44 != 255) {
					if (this.indices1[var43] == (this.texTriangleX[var44] & '\uffff') && this.indices2[var43] == (this.field2550[var44] & '\uffff') && this.indices3[var43] == (this.field2547[var44] & '\uffff')) {
						this.textureCoords[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.textureCoords = null;
			}
		}

		if (!var3) {
			this.faceTextures = null;
		}

		if (!var2) {
			this.faceRenderTypes = null;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I)I"
	)
	final int method4645(ModelData var1, int var2) {
		int var3 = -1;
		int var4 = var1.verticesX[var2];
		int var5 = var1.field2535[var2];
		int var6 = var1.field2546[var2];

		for (int var7 = 0; var7 < this.field2533; ++var7) {
			if (var4 == this.verticesX[var7] && var5 == this.field2535[var7] && var6 == this.field2546[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.verticesX[this.field2533] = var4;
			this.field2535[this.field2533] = var5;
			this.field2546[this.field2533] = var6;
			if (var1.vertexSkins != null) {
				this.vertexSkins[this.field2533] = var1.vertexSkins[var2];
			}

			if (var1.field2544 != null) {
				this.field2544[this.field2533] = var1.field2544[var2];
				this.field2558[this.field2533] = var1.field2558[var2];
			}

			var3 = this.field2533++;
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljk;"
	)
	@Export("copyModelData")
	public ModelData copyModelData() {
		ModelData var1 = new ModelData();
		if (this.faceRenderTypes != null) {
			var1.faceRenderTypes = new byte[this.faceCount];

			for (int var2 = 0; var2 < this.faceCount; ++var2) {
				var1.faceRenderTypes[var2] = this.faceRenderTypes[var2];
			}
		}

		var1.field2533 = this.field2533;
		var1.faceCount = this.faceCount;
		var1.textureTriangleCount = this.textureTriangleCount;
		var1.verticesX = this.verticesX;
		var1.field2535 = this.field2535;
		var1.field2546 = this.field2546;
		var1.indices1 = this.indices1;
		var1.indices2 = this.indices2;
		var1.indices3 = this.indices3;
		var1.textureRenderTypes = this.textureRenderTypes;
		var1.field2543 = this.field2543;
		var1.textureCoords = this.textureCoords;
		var1.faceColors = this.faceColors;
		var1.faceTextures = this.faceTextures;
		var1.priority = this.priority;
		var1.faceRenderPriorities = this.faceRenderPriorities;
		var1.texTriangleX = this.texTriangleX;
		var1.field2550 = this.field2550;
		var1.field2547 = this.field2547;
		var1.vertexSkins = this.vertexSkins;
		var1.field2554 = this.field2554;
		var1.vertexLabels = this.vertexLabels;
		var1.field2548 = this.field2548;
		var1.field2560 = this.field2560;
		var1.field2559 = this.field2559;
		var1.field2562 = this.field2562;
		var1.field2563 = this.field2563;
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljk;"
	)
	public ModelData method4647(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBounds();
		int var7 = var2 + this.field2566;
		int var8 = var2 + this.verticesCount;
		int var9 = var4 + this.field2540;
		int var10 = var4 + this.field2530;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				ModelData var11 = new ModelData(this, true, true, true, true);
				var11.field2535 = new int[var11.field2533];
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field2533; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.field2546[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2535[var12] = var21 + this.field2535[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2533; ++var12) {
						var13 = (-this.field2535[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.field2546[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2535[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field2535[var12];
						} else {
							var11.field2535[var12] = this.field2535[var12];
						}
					}
				}

				var11.method4660();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("ai")
	public int method4700(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2533; ++var4) {
			if (this.verticesX[var4] == var1 && var2 == this.field2535[var4] && var3 == this.field2546[var4]) {
				return var4;
			}
		}

		this.verticesX[this.field2533] = var1;
		this.field2535[this.field2533] = var2;
		this.field2546[this.field2533] = var3;
		return this.field2533++;
	}

	@ObfuscatedName("ak")
	public int method4648(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
		this.indices1[this.faceCount] = var1;
		this.indices2[this.faceCount] = var2;
		this.indices3[this.faceCount] = var3;
		this.faceRenderTypes[this.faceCount] = var4;
		this.textureCoords[this.faceCount] = var5;
		this.faceColors[this.faceCount] = var6;
		this.faceTextures[this.faceCount] = var7;
		return this.faceCount++;
	}

	@ObfuscatedName("aj")
	@Export("invalidate")
	void invalidate() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.vertexSkins != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2533; ++var3) {
				var4 = this.vertexSkins[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.vertexLabels = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.vertexLabels[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2533; this.vertexLabels[var4][var1[var4]++] = var3++) {
				var4 = this.vertexSkins[var3];
			}

			this.vertexSkins = null;
		}

		if (this.field2554 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.faceCount; ++var3) {
				var4 = this.field2554[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2548 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2548[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.faceCount; this.field2548[var4][var1[var4]++] = var3++) {
				var4 = this.field2554[var3];
			}

			this.field2554 = null;
		}

	}

	@ObfuscatedName("av")
	public void method4701() {
		for (int var1 = 0; var1 < this.field2533; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.field2546[var1];
			this.field2546[var1] = -var2;
		}

		this.method4660();
	}

	@ObfuscatedName("ar")
	public void method4692() {
		for (int var1 = 0; var1 < this.field2533; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.field2546[var1] = -this.field2546[var1];
		}

		this.method4660();
	}

	@ObfuscatedName("ag")
	public void method4652() {
		for (int var1 = 0; var1 < this.field2533; ++var1) {
			int var2 = this.field2546[var1];
			this.field2546[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.method4660();
	}

	@ObfuscatedName("az")
	public void method4653(int var1) {
		int var2 = ModelData_sine[var1];
		int var3 = ModelData_cosine[var1];

		for (int var4 = 0; var4 < this.field2533; ++var4) {
			int var5 = var2 * this.field2546[var4] + var3 * this.verticesX[var4] >> 16;
			this.field2546[var4] = var3 * this.field2546[var4] - var2 * this.verticesX[var4] >> 16;
			this.verticesX[var4] = var5;
		}

		this.method4660();
	}

	@ObfuscatedName("am")
	@Export("changeOffset")
	public void changeOffset(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2533; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.field2535;
			var10000[var4] += var2;
			var10000 = this.field2546;
			var10000[var4] += var3;
		}

		this.method4660();
	}

	@ObfuscatedName("aq")
	@Export("recolor")
	public void recolor(short var1, short var2) {
		for (int var3 = 0; var3 < this.faceCount; ++var3) {
			if (this.faceColors[var3] == var1) {
				this.faceColors[var3] = var2;
			}
		}

	}

	@ObfuscatedName("aw")
	@Export("retexture")
	public void retexture(short var1, short var2) {
		if (this.faceTextures != null) {
			for (int var3 = 0; var3 < this.faceCount; ++var3) {
				if (this.faceTextures[var3] == var1) {
					this.faceTextures[var3] = var2;
				}
			}

		}
	}

	@ObfuscatedName("an")
	public void method4687() {
		int var1;
		for (var1 = 0; var1 < this.field2533; ++var1) {
			this.field2546[var1] = -this.field2546[var1];
		}

		for (var1 = 0; var1 < this.faceCount; ++var1) {
			int var2 = this.indices1[var1];
			this.indices1[var1] = this.indices3[var1];
			this.indices3[var1] = var2;
		}

		this.method4660();
	}

	@ObfuscatedName("at")
	@Export("resize")
	public void resize(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2533; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.field2535[var4] = var2 * this.field2535[var4] / 128;
			this.field2546[var4] = var3 * this.field2546[var4] / 128;
		}

		this.method4660();
	}

	@ObfuscatedName("ap")
	@Export("calculateVertexNormals")
	public void calculateVertexNormals() {
		if (this.field2560 == null) {
			this.field2560 = new VertexNormal[this.field2533];

			int var1;
			for (var1 = 0; var1 < this.field2533; ++var1) {
				this.field2560[var1] = new VertexNormal();
			}

			for (var1 = 0; var1 < this.faceCount; ++var1) {
				int var2 = this.indices1[var1];
				int var3 = this.indices2[var1];
				int var4 = this.indices3[var1];
				int var5 = this.verticesX[var3] - this.verticesX[var2];
				int var6 = this.field2535[var3] - this.field2535[var2];
				int var7 = this.field2546[var3] - this.field2546[var2];
				int var8 = this.verticesX[var4] - this.verticesX[var2];
				int var9 = this.field2535[var4] - this.field2535[var2];
				int var10 = this.field2546[var4] - this.field2546[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.faceRenderTypes == null) {
					var15 = 0;
				} else {
					var15 = this.faceRenderTypes[var1];
				}

				if (var15 == 0) {
					VertexNormal var16 = this.field2560[var2];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
					var16 = this.field2560[var3];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
					var16 = this.field2560[var4];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
				} else if (var15 == 1) {
					if (this.field2559 == null) {
						this.field2559 = new class248[this.faceCount];
					}

					class248 var17 = this.field2559[var1] = new class248();
					var17.y = var11;
					var17.z = var12;
					var17.x = var13;
				}
			}

		}
	}

	@ObfuscatedName("al")
	void method4660() {
		this.field2560 = null;
		this.field2561 = null;
		this.field2559 = null;
		this.isBoundsCalculated = false;
	}

	@ObfuscatedName("bw")
	@Export("calculateBounds")
	void calculateBounds() {
		if (!this.isBoundsCalculated) {
			super.height = 0;
			this.field2565 = 0;
			this.field2566 = 999999;
			this.verticesCount = -999999;
			this.field2530 = -99999;
			this.field2540 = 99999;

			for (int var1 = 0; var1 < this.field2533; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.field2535[var1];
				int var4 = this.field2546[var1];
				if (var2 < this.field2566) {
					this.field2566 = var2;
				}

				if (var2 > this.verticesCount) {
					this.verticesCount = var2;
				}

				if (var4 < this.field2540) {
					this.field2540 = var4;
				}

				if (var4 > this.field2530) {
					this.field2530 = var4;
				}

				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.field2565) {
					this.field2565 = var3;
				}
			}

			this.isBoundsCalculated = true;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Ljf;"
	)
	@Export("toModel")
	public final Model toModel(int var1, int var2, int var3, int var4, int var5) {
		this.calculateVertexNormals();
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
		int var7 = var6 * var2 >> 8;
		Model var8 = new Model();
		var8.field2888 = new int[this.faceCount];
		var8.field2889 = new int[this.faceCount];
		var8.field2890 = new int[this.faceCount];
		if (this.textureTriangleCount > 0 && this.textureCoords != null) {
			int[] var9 = new int[this.textureTriangleCount];

			int var10;
			for (var10 = 0; var10 < this.faceCount; ++var10) {
				if (this.textureCoords[var10] != -1) {
					++var9[this.textureCoords[var10] & 255];
				}
			}

			var8.field2896 = 0;

			for (var10 = 0; var10 < this.textureTriangleCount; ++var10) {
				if (var9[var10] > 0 && this.faceRenderPriorities[var10] == 0) {
					++var8.field2896;
				}
			}

			var8.indices1 = new int[var8.field2896];
			var8.field2898 = new int[var8.field2896];
			var8.field2917 = new int[var8.field2896];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.textureTriangleCount; ++var11) {
				if (var9[var11] > 0 && this.faceRenderPriorities[var11] == 0) {
					var8.indices1[var10] = this.texTriangleX[var11] & '\uffff';
					var8.field2898[var10] = this.field2550[var11] & '\uffff';
					var8.field2917[var10] = this.field2547[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2943 = new byte[this.faceCount];

			for (var11 = 0; var11 < this.faceCount; ++var11) {
				if (this.textureCoords[var11] != -1) {
					var8.field2943[var11] = (byte)var9[this.textureCoords[var11] & 255];
				} else {
					var8.field2943[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.faceCount; ++var16) {
			byte var17;
			if (this.faceRenderTypes == null) {
				var17 = 0;
			} else {
				var17 = this.faceRenderTypes[var16];
			}

			byte var18;
			if (this.field2543 == null) {
				var18 = 0;
			} else {
				var18 = this.field2543[var16];
			}

			short var12;
			if (this.faceTextures == null) {
				var12 = -1;
			} else {
				var12 = this.faceTextures[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			VertexNormal var13;
			int var14;
			class248 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field2559[var16];
						var14 = (var4 * var19.z + var5 * var19.x + var3 * var19.y) / (var7 / 2 + var7) + var1;
						var8.field2888[var16] = method4662(this.faceColors[var16] & '\uffff', var14);
						var8.field2890[var16] = -1;
					} else if (var17 == 3) {
						var8.field2888[var16] = 128;
						var8.field2890[var16] = -1;
					} else {
						var8.field2890[var16] = -2;
					}
				} else {
					int var15 = this.faceColors[var16] & '\uffff';
					if (this.field2561 != null && this.field2561[this.indices1[var16]] != null) {
						var13 = this.field2561[this.indices1[var16]];
					} else {
						var13 = this.field2560[this.indices1[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.field2888[var16] = method4662(var15, var14);
					if (this.field2561 != null && this.field2561[this.indices2[var16]] != null) {
						var13 = this.field2561[this.indices2[var16]];
					} else {
						var13 = this.field2560[this.indices2[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.field2889[var16] = method4662(var15, var14);
					if (this.field2561 != null && this.field2561[this.indices3[var16]] != null) {
						var13 = this.field2561[this.indices3[var16]];
					} else {
						var13 = this.field2560[this.indices3[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.field2890[var16] = method4662(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field2559[var16];
					var14 = (var4 * var19.z + var5 * var19.x + var3 * var19.y) / (var7 / 2 + var7) + var1;
					var8.field2888[var16] = method4663(var14);
					var8.field2890[var16] = -1;
				} else {
					var8.field2890[var16] = -2;
				}
			} else {
				if (this.field2561 != null && this.field2561[this.indices1[var16]] != null) {
					var13 = this.field2561[this.indices1[var16]];
				} else {
					var13 = this.field2560[this.indices1[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.field2888[var16] = method4663(var14);
				if (this.field2561 != null && this.field2561[this.indices2[var16]] != null) {
					var13 = this.field2561[this.indices2[var16]];
				} else {
					var13 = this.field2560[this.indices2[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.field2889[var16] = method4663(var14);
				if (this.field2561 != null && this.field2561[this.indices3[var16]] != null) {
					var13 = this.field2561[this.indices3[var16]];
				} else {
					var13 = this.field2560[this.indices3[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.field2890[var16] = method4663(var14);
			}
		}

		this.invalidate();
		var8.verticesCount = this.field2533;
		var8.verticesX = this.verticesX;
		var8.verticesY = this.field2535;
		var8.verticesZ = this.field2546;
		var8.field2884 = this.faceCount;
		var8.texIndices1 = this.indices1;
		var8.field2886 = this.indices2;
		var8.field2887 = this.indices3;
		var8.faceRenderPriorities = this.textureRenderTypes;
		var8.field2892 = this.field2543;
		var8.field2904 = this.priority;
		var8.vertexLabels = this.vertexLabels;
		var8.faceLabelsAlpha = this.field2548;
		var8.faceTextures = this.faceTextures;
		var8.field2902 = this.field2544;
		var8.field2903 = this.field2558;
		return var8;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;II)Ljk;"
	)
	@Export("ModelData_get")
	public static ModelData ModelData_get(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		return var3 == null ? null : new ModelData(var3);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljk;IIIZ)V"
	)
	static void method4690(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
		var0.calculateBounds();
		var0.calculateVertexNormals();
		var1.calculateBounds();
		var1.calculateVertexNormals();
		++field2572;
		int var6 = 0;
		int[] var7 = var1.verticesX;
		int var8 = var1.field2533;

		int var9;
		for (var9 = 0; var9 < var0.field2533; ++var9) {
			VertexNormal var10 = var0.field2560[var9];
			if (var10.magnitude != 0) {
				int var11 = var0.field2535[var9] - var3;
				if (var11 <= var1.field2565) {
					int var12 = var0.verticesX[var9] - var2;
					if (var12 >= var1.field2566 && var12 <= var1.verticesCount) {
						int var13 = var0.field2546[var9] - var4;
						if (var13 >= var1.field2540 && var13 <= var1.field2530) {
							for (int var14 = 0; var14 < var8; ++var14) {
								VertexNormal var15 = var1.field2560[var14];
								if (var12 == var7[var14] && var13 == var1.field2546[var14] && var11 == var1.field2535[var14] && var15.magnitude != 0) {
									if (var0.field2561 == null) {
										var0.field2561 = new VertexNormal[var0.field2533];
									}

									if (var1.field2561 == null) {
										var1.field2561 = new VertexNormal[var8];
									}

									VertexNormal var16 = var0.field2561[var9];
									if (var16 == null) {
										var16 = var0.field2561[var9] = new VertexNormal(var10);
									}

									VertexNormal var17 = var1.field2561[var14];
									if (var17 == null) {
										var17 = var1.field2561[var14] = new VertexNormal(var15);
									}

									var16.x += var15.x;
									var16.y += var15.y;
									var16.z += var15.z;
									var16.magnitude += var15.magnitude;
									var17.x += var10.x;
									var17.y += var10.y;
									var17.z += var10.z;
									var17.magnitude += var10.magnitude;
									++var6;
									field2551[var9] = field2572;
									field2545[var14] = field2572;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.faceCount; ++var9) {
				if (field2551[var0.indices1[var9]] == field2572 && field2551[var0.indices2[var9]] == field2572 && field2551[var0.indices3[var9]] == field2572) {
					if (var0.faceRenderTypes == null) {
						var0.faceRenderTypes = new byte[var0.faceCount];
					}

					var0.faceRenderTypes[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.faceCount; ++var9) {
				if (field2572 == field2545[var1.indices1[var9]] && field2572 == field2545[var1.indices2[var9]] && field2572 == field2545[var1.indices3[var9]]) {
					if (var1.faceRenderTypes == null) {
						var1.faceRenderTypes = new byte[var1.faceCount];
					}

					var1.faceRenderTypes[var9] = 2;
				}
			}

		}
	}

	@ObfuscatedName("bz")
	static final int method4662(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("bt")
	static final int method4663(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
