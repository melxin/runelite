import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("ModelData")
public class ModelData extends Renderable {
	@ObfuscatedName("ac")
	static int[] field2526;
	@ObfuscatedName("ap")
	static int[] field2536;
	@ObfuscatedName("aq")
	static int field2528;
	@ObfuscatedName("ao")
	@Export("ModelData_sine")
	static int[] ModelData_sine;
	@ObfuscatedName("as")
	@Export("ModelData_cosine")
	static int[] ModelData_cosine;
	@ObfuscatedName("al")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("au")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ai")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("aa")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("am")
	@Export("faceCount")
	int faceCount;
	@ObfuscatedName("an")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ar")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ae")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ay")
	@Export("faceRenderTypes")
	byte[] faceRenderTypes;
	@ObfuscatedName("ad")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ag")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("av")
	@Export("textureCoords")
	byte[] textureCoords;
	@ObfuscatedName("ah")
	@Export("faceColors")
	short[] faceColors;
	@ObfuscatedName("ab")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ax")
	byte[] field2545;
	@ObfuscatedName("ak")
	@Export("priority")
	byte priority;
	@ObfuscatedName("aj")
	@Export("textureTriangleCount")
	int textureTriangleCount;
	@ObfuscatedName("az")
	@Export("textureRenderTypes")
	byte[] textureRenderTypes;
	@ObfuscatedName("bt")
	@Export("texTriangleX")
	short[] texTriangleX;
	@ObfuscatedName("bs")
	@Export("texTriangleY")
	short[] texTriangleY;
	@ObfuscatedName("bu")
	@Export("texTriangleZ")
	short[] texTriangleZ;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[Ljw;"
	)
	@Export("faceNormals")
	FaceNormal[] faceNormals;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lje;"
	)
	@Export("vertexNormals")
	VertexNormal[] vertexNormals;
	@ObfuscatedName("ba")
	@Export("ambient")
	public short ambient;
	@ObfuscatedName("bb")
	@Export("contrast")
	public short contrast;
	@ObfuscatedName("bo")
	int[][] field2542;
	@ObfuscatedName("bl")
	int[][] field2557;
	@ObfuscatedName("by")
	@Export("vertexSkins")
	int[] vertexSkins;
	@ObfuscatedName("bg")
	@Export("faceSkins")
	int[] faceSkins;
	@ObfuscatedName("bx")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bq")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lje;"
	)
	@Export("vertexVertices")
	VertexNormal[] vertexVertices;
	@ObfuscatedName("bn")
	@Export("isBoundsCalculated")
	boolean isBoundsCalculated;
	@ObfuscatedName("be")
	int field2537;
	@ObfuscatedName("bh")
	int field2539;
	@ObfuscatedName("bk")
	int field2566;
	@ObfuscatedName("bp")
	int field2567;
	@ObfuscatedName("br")
	int field2568;

	static {
		field2526 = new int[10000];
		field2536 = new int[10000];
		field2528 = 0;
		ModelData_sine = Rasterizer3D.Rasterizer3D_sine;
		ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine;
	}

	ModelData() {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
	}

	@ObfuscatedSignature(
		descriptor = "([Liu;I)V"
	)
	public ModelData(ModelData[] var1, int var2) {
		this.verticesCount = 0;
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
		boolean var10 = false;
		this.verticesCount = 0;
		this.faceCount = 0;
		this.textureTriangleCount = 0;
		this.priority = -1;

		int var11;
		ModelData var12;
		for (var11 = 0; var11 < var2; ++var11) {
			var12 = var1[var11];
			if (var12 != null) {
				this.verticesCount += var12.verticesCount;
				this.faceCount += var12.faceCount;
				this.textureTriangleCount += var12.textureTriangleCount;
				if (var12.faceRenderPriorities != null) {
					var4 = true;
				} else {
					if (this.priority == -1) {
						this.priority = var12.priority;
					}

					if (this.priority != var12.priority) {
						var4 = true;
					}
				}

				var3 |= var12.faceRenderTypes != null;
				var5 |= var12.faceAlphas != null;
				var6 |= var12.faceSkins != null;
				var7 |= var12.faceTextures != null;
				var8 |= var12.textureCoords != null;
				var9 |= var12.field2542 != null;
				var10 |= var12.field2545 != null;
			}
		}

		this.verticesX = new int[this.verticesCount];
		this.verticesY = new int[this.verticesCount];
		this.verticesZ = new int[this.verticesCount];
		this.vertexSkins = new int[this.verticesCount];
		this.indices1 = new int[this.faceCount];
		this.indices2 = new int[this.faceCount];
		this.indices3 = new int[this.faceCount];
		if (var3) {
			this.faceRenderTypes = new byte[this.faceCount];
		}

		if (var4) {
			this.faceRenderPriorities = new byte[this.faceCount];
		}

		if (var5) {
			this.faceAlphas = new byte[this.faceCount];
		}

		if (var6) {
			this.faceSkins = new int[this.faceCount];
		}

		if (var7) {
			this.faceTextures = new short[this.faceCount];
		}

		if (var8) {
			this.textureCoords = new byte[this.faceCount];
		}

		if (var9) {
			this.field2542 = new int[this.verticesCount][];
			this.field2557 = new int[this.verticesCount][];
		}

		if (var10) {
			this.field2545 = new byte[this.faceCount];
		}

		this.faceColors = new short[this.faceCount];
		if (this.textureTriangleCount > 0) {
			this.textureRenderTypes = new byte[this.textureTriangleCount];
			this.texTriangleX = new short[this.textureTriangleCount];
			this.texTriangleY = new short[this.textureTriangleCount];
			this.texTriangleZ = new short[this.textureTriangleCount];
		}

		this.verticesCount = 0;
		this.faceCount = 0;
		this.textureTriangleCount = 0;

		for (var11 = 0; var11 < var2; ++var11) {
			var12 = var1[var11];
			if (var12 != null) {
				int var13;
				for (var13 = 0; var13 < var12.faceCount; ++var13) {
					if (var3 && var12.faceRenderTypes != null) {
						this.faceRenderTypes[this.faceCount] = var12.faceRenderTypes[var13];
					}

					if (var4) {
						if (var12.faceRenderPriorities != null) {
							this.faceRenderPriorities[this.faceCount] = var12.faceRenderPriorities[var13];
						} else {
							this.faceRenderPriorities[this.faceCount] = var12.priority;
						}
					}

					if (var5 && var12.faceAlphas != null) {
						this.faceAlphas[this.faceCount] = var12.faceAlphas[var13];
					}

					if (var6 && var12.faceSkins != null) {
						this.faceSkins[this.faceCount] = var12.faceSkins[var13];
					}

					if (var7) {
						if (var12.faceTextures != null) {
							this.faceTextures[this.faceCount] = var12.faceTextures[var13];
						} else {
							this.faceTextures[this.faceCount] = -1;
						}
					}

					if (var8) {
						if (var12.textureCoords != null && var12.textureCoords[var13] != -1) {
							this.textureCoords[this.faceCount] = (byte)(this.textureTriangleCount + var12.textureCoords[var13]);
						} else {
							this.textureCoords[this.faceCount] = -1;
						}
					}

					if (var10 && var12.field2545 != null) {
						this.field2545[this.faceCount] = var12.field2545[var13];
					}

					this.faceColors[this.faceCount] = var12.faceColors[var13];
					this.indices1[this.faceCount] = this.method4903(var12, var12.indices1[var13]);
					this.indices2[this.faceCount] = this.method4903(var12, var12.indices2[var13]);
					this.indices3[this.faceCount] = this.method4903(var12, var12.indices3[var13]);
					++this.faceCount;
				}

				for (var13 = 0; var13 < var12.textureTriangleCount; ++var13) {
					byte var14 = this.textureRenderTypes[this.textureTriangleCount] = var12.textureRenderTypes[var13];
					if (var14 == 0) {
						this.texTriangleX[this.textureTriangleCount] = (short)this.method4903(var12, var12.texTriangleX[var13]);
						this.texTriangleY[this.textureTriangleCount] = (short)this.method4903(var12, var12.texTriangleY[var13]);
						this.texTriangleZ[this.textureTriangleCount] = (short)this.method4903(var12, var12.texTriangleZ[var13]);
					}

					++this.textureTriangleCount;
				}
			}
		}

	}

	ModelData(byte[] var1) {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method4839(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method4834(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method4836(var1);
		} else {
			this.method4859(var1);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Liu;ZZZZ)V",
		garbageValue = "1"
	)
	public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		this.verticesCount = var1.verticesCount;
		this.faceCount = var1.faceCount;
		this.textureTriangleCount = var1.textureTriangleCount;
		int var6;
		if (var2) {
			this.verticesX = var1.verticesX;
			this.verticesY = var1.verticesY;
			this.verticesZ = var1.verticesZ;
		} else {
			this.verticesX = new int[this.verticesCount];
			this.verticesY = new int[this.verticesCount];
			this.verticesZ = new int[this.verticesCount];

			for (var6 = 0; var6 < this.verticesCount; ++var6) {
				this.verticesX[var6] = var1.verticesX[var6];
				this.verticesY[var6] = var1.verticesY[var6];
				this.verticesZ[var6] = var1.verticesZ[var6];
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

		this.faceAlphas = var1.faceAlphas;
		this.indices1 = var1.indices1;
		this.indices2 = var1.indices2;
		this.indices3 = var1.indices3;
		this.faceRenderTypes = var1.faceRenderTypes;
		this.faceRenderPriorities = var1.faceRenderPriorities;
		this.textureCoords = var1.textureCoords;
		this.priority = var1.priority;
		this.textureRenderTypes = var1.textureRenderTypes;
		this.texTriangleX = var1.texTriangleX;
		this.texTriangleY = var1.texTriangleY;
		this.texTriangleZ = var1.texTriangleZ;
		this.vertexSkins = var1.vertexSkins;
		this.faceSkins = var1.faceSkins;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.vertexNormals = var1.vertexNormals;
		this.faceNormals = var1.faceNormals;
		this.vertexVertices = var1.vertexVertices;
		this.field2542 = var1.field2542;
		this.field2557 = var1.field2557;
		this.ambient = var1.ambient;
		this.contrast = var1.contrast;
		this.field2545 = var1.field2545;
	}

	public ModelData(int var1, int var2, int var3) {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.vertexSkins = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceRenderTypes = new byte[var2];
		this.faceRenderPriorities = new byte[var2];
		this.faceAlphas = new byte[var2];
		this.faceColors = new short[var2];
		this.faceTextures = new short[var2];
		this.textureCoords = new byte[var2];
		this.faceSkins = new int[var2];
		if (var3 > 0) {
			this.textureRenderTypes = new byte[var3];
			this.texTriangleX = new short[var3];
			this.texTriangleY = new short[var3];
			this.texTriangleZ = new short[var3];
		}

	}

	@ObfuscatedName("aq")
	void method4839(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.array = (var1.length - 26) * -290410379;
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
			this.textureRenderTypes = new byte[var11];
			var2.array = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.textureRenderTypes[var28] = var2.readByte();
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
		this.verticesCount = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
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
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		if (var16 == 1) {
			this.faceTextures = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.textureCoords = new byte[var10];
		}

		if (var18 == 1) {
			this.field2542 = new int[var9][];
			this.field2557 = new int[var9][];
		}

		this.faceColors = new short[var10];
		if (var11 > 0) {
			this.texTriangleX = new short[var11];
			this.texTriangleY = new short[var11];
			this.texTriangleZ = new short[var11];
		}

		var2.array = var11 * -290410379;
		var3.array = var40 * -290410379;
		var4.array = var41 * -290410379;
		var5.array = var42 * -290410379;
		var6.array = var34 * -290410379;
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
				var55 = var3.readUShortSmart();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.readUShortSmart();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.readUShortSmart();
			}

			this.verticesX[var53] = var50 + var55;
			this.verticesY[var53] = var51 + var56;
			this.verticesZ[var53] = var52 + var57;
			var50 = this.verticesX[var53];
			var51 = this.verticesY[var53];
			var52 = this.verticesZ[var53];
			if (var17 == 1) {
				this.vertexSkins[var53] = var6.readUnsignedByte();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.readUnsignedByte();
				this.field2542[var53] = new int[var54];
				this.field2557[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2542[var53][var55] = var6.readUnsignedByte();
					this.field2557[var53][var55] = var6.readUnsignedByte();
				}
			}
		}

		var2.array = var39 * -290410379;
		var3.array = var30 * -290410379;
		var4.array = var32 * -290410379;
		var5.array = var35 * -290410379;
		var6.array = var33 * -290410379;
		var7.array = var37 * -290410379;
		var8.array = var38 * -290410379;

		for (var53 = 0; var53 < var10; ++var53) {
			this.faceColors[var53] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var53] = var3.readByte();
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var53] = var4.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var53] = var5.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var53] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var53] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var53] != -1) {
				this.textureCoords[var53] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.array = var36 * -290410379;
		var3.array = var31 * -290410379;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		int var59;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.readUnsignedByte();
			if (var58 == 1) {
				var53 = var2.readUShortSmart() + var56;
				var54 = var2.readUShortSmart() + var53;
				var55 = var2.readUShortSmart() + var54;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.readUShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.readUShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 4) {
				var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.readUShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var59;
				this.indices3[var57] = var55;
			}
		}

		var2.array = var43 * -290410379;
		var3.array = var44 * -290410379;
		var4.array = var45 * -290410379;
		var5.array = var46 * -290410379;
		var6.array = var47 * -290410379;
		var7.array = var48 * -290410379;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.textureRenderTypes[var57] & 255;
			if (var58 == 0) {
				this.texTriangleX[var57] = (short)var2.readUnsignedShort();
				this.texTriangleY[var57] = (short)var2.readUnsignedShort();
				this.texTriangleZ[var57] = (short)var2.readUnsignedShort();
			}
		}

		var2.array = var28 * -290410379;
		var57 = var2.readUnsignedByte();
		if (var57 != 0) {
			new ModelData0();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readShortSmart();
		}

		boolean var60 = var2.readUnsignedByte() == 1;
		if (var60) {
			this.field2545 = new byte[var10];

			for (var59 = 0; var59 < var10; ++var59) {
				this.field2545[var59] = var2.readByte();
			}
		}

	}

	@ObfuscatedName("ao")
	void method4834(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.array = (var1.length - 23) * -290410379;
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
		int var49 = var23 + var9;
		int var25 = var49;
		var49 += var10;
		int var26 = var49;
		if (var13 == 255) {
			var49 += var10;
		}

		int var27 = var49;
		if (var15 == 1) {
			var49 += var10;
		}

		int var28 = var49;
		if (var12 == 1) {
			var49 += var10;
		}

		int var29 = var49;
		var49 += var22;
		int var30 = var49;
		if (var14 == 1) {
			var49 += var10;
		}

		int var31 = var49;
		var49 += var21;
		int var32 = var49;
		var49 += var10 * 2;
		int var33 = var49;
		var49 += var11 * 6;
		int var34 = var49;
		var49 += var18;
		int var35 = var49;
		var49 += var19;
		int var36 = var49;
		var49 += var20;
		this.verticesCount = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.textureRenderTypes = new byte[var11];
			this.texTriangleX = new short[var11];
			this.texTriangleY = new short[var11];
			this.texTriangleZ = new short[var11];
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
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		if (var17 == 1) {
			this.field2542 = new int[var9][];
			this.field2557 = new int[var9][];
		}

		this.faceColors = new short[var10];
		var4.array = var23 * -290410379;
		var5.array = var34 * -290410379;
		var6.array = var35 * -290410379;
		var7.array = var36 * -290410379;
		var8.array = var29 * -290410379;
		int var38 = 0;
		int var39 = 0;
		int var40 = 0;

		int var41;
		int var42;
		int var43;
		int var44;
		int var45;
		for (var41 = 0; var41 < var9; ++var41) {
			var42 = var4.readUnsignedByte();
			var43 = 0;
			if ((var42 & 1) != 0) {
				var43 = var5.readUShortSmart();
			}

			var44 = 0;
			if ((var42 & 2) != 0) {
				var44 = var6.readUShortSmart();
			}

			var45 = 0;
			if ((var42 & 4) != 0) {
				var45 = var7.readUShortSmart();
			}

			this.verticesX[var41] = var38 + var43;
			this.verticesY[var41] = var39 + var44;
			this.verticesZ[var41] = var40 + var45;
			var38 = this.verticesX[var41];
			var39 = this.verticesY[var41];
			var40 = this.verticesZ[var41];
			if (var16 == 1) {
				this.vertexSkins[var41] = var8.readUnsignedByte();
			}
		}

		if (var17 == 1) {
			for (var41 = 0; var41 < var9; ++var41) {
				var42 = var8.readUnsignedByte();
				this.field2542[var41] = new int[var42];
				this.field2557[var41] = new int[var42];

				for (var43 = 0; var43 < var42; ++var43) {
					this.field2542[var41][var43] = var8.readUnsignedByte();
					this.field2557[var41][var43] = var8.readUnsignedByte();
				}
			}
		}

		var4.array = var32 * -290410379;
		var5.array = var28 * -290410379;
		var6.array = var26 * -290410379;
		var7.array = var30 * -290410379;
		var8.array = var27 * -290410379;

		for (var41 = 0; var41 < var10; ++var41) {
			this.faceColors[var41] = (short)var4.readUnsignedShort();
			if (var12 == 1) {
				var42 = var5.readUnsignedByte();
				if ((var42 & 1) == 1) {
					this.faceRenderTypes[var41] = 1;
					var2 = true;
				} else {
					this.faceRenderTypes[var41] = 0;
				}

				if ((var42 & 2) == 2) {
					this.textureCoords[var41] = (byte)(var42 >> 2);
					this.faceTextures[var41] = this.faceColors[var41];
					this.faceColors[var41] = 127;
					if (this.faceTextures[var41] != -1) {
						var3 = true;
					}
				} else {
					this.textureCoords[var41] = -1;
					this.faceTextures[var41] = -1;
				}
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var41] = var6.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var41] = var7.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var41] = var8.readUnsignedByte();
			}
		}

		var4.array = var31 * -290410379;
		var5.array = var25 * -290410379;
		var41 = 0;
		var42 = 0;
		var43 = 0;
		var44 = 0;

		int var46;
		int var47;
		for (var45 = 0; var45 < var10; ++var45) {
			var46 = var5.readUnsignedByte();
			if (var46 == 1) {
				var41 = var4.readUShortSmart() + var44;
				var42 = var4.readUShortSmart() + var41;
				var43 = var4.readUShortSmart() + var42;
				var44 = var43;
				this.indices1[var45] = var41;
				this.indices2[var45] = var42;
				this.indices3[var45] = var43;
			}

			if (var46 == 2) {
				var42 = var43;
				var43 = var4.readUShortSmart() + var44;
				var44 = var43;
				this.indices1[var45] = var41;
				this.indices2[var45] = var42;
				this.indices3[var45] = var43;
			}

			if (var46 == 3) {
				var41 = var43;
				var43 = var4.readUShortSmart() + var44;
				var44 = var43;
				this.indices1[var45] = var41;
				this.indices2[var45] = var42;
				this.indices3[var45] = var43;
			}

			if (var46 == 4) {
				var47 = var41;
				var41 = var42;
				var42 = var47;
				var43 = var4.readUShortSmart() + var44;
				var44 = var43;
				this.indices1[var45] = var41;
				this.indices2[var45] = var47;
				this.indices3[var45] = var43;
			}
		}

		var4.array = var33 * -290410379;

		for (var45 = 0; var45 < var11; ++var45) {
			this.textureRenderTypes[var45] = 0;
			this.texTriangleX[var45] = (short)var4.readUnsignedShort();
			this.texTriangleY[var45] = (short)var4.readUnsignedShort();
			this.texTriangleZ[var45] = (short)var4.readUnsignedShort();
		}

		var4.array = var49 * -290410379;
		boolean var51 = var4.readUnsignedByte() == 1;
		if (var51) {
			this.field2545 = new byte[var10];

			for (var46 = 0; var46 < var10; ++var46) {
				this.field2545[var46] = var4.readByte();
			}
		}

		if (this.textureCoords != null) {
			boolean var50 = false;

			for (var47 = 0; var47 < var10; ++var47) {
				int var48 = this.textureCoords[var47] & 255;
				if (var48 != 255) {
					if (this.indices1[var47] == (this.texTriangleX[var48] & '\uffff') && this.indices2[var47] == (this.texTriangleY[var48] & '\uffff') && this.indices3[var47] == (this.texTriangleZ[var48] & '\uffff')) {
						this.textureCoords[var47] = -1;
					} else {
						var50 = true;
					}
				}
			}

			if (!var50) {
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
	void method4836(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.array = (var1.length - 23) * -290410379;
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
			this.textureRenderTypes = new byte[var11];
			var2.array = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.textureRenderTypes[var26] = var2.readByte();
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
		this.verticesCount = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
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
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
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
			this.texTriangleY = new short[var11];
			this.texTriangleZ = new short[var11];
		}

		var2.array = var11 * -290410379;
		var3.array = var38 * -290410379;
		var4.array = var39 * -290410379;
		var5.array = var40 * -290410379;
		var6.array = var32 * -290410379;
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
				var53 = var3.readUShortSmart();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.readUShortSmart();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.readUShortSmart();
			}

			this.verticesX[var51] = var48 + var53;
			this.verticesY[var51] = var49 + var54;
			this.verticesZ[var51] = var50 + var55;
			var48 = this.verticesX[var51];
			var49 = this.verticesY[var51];
			var50 = this.verticesZ[var51];
			if (var17 == 1) {
				this.vertexSkins[var51] = var6.readUnsignedByte();
			}
		}

		var2.array = var37 * -290410379;
		var3.array = var28 * -290410379;
		var4.array = var30 * -290410379;
		var5.array = var33 * -290410379;
		var6.array = var31 * -290410379;
		var7.array = var35 * -290410379;
		var8.array = var36 * -290410379;

		for (var51 = 0; var51 < var10; ++var51) {
			this.faceColors[var51] = (short)var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var51] = var3.readByte();
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var51] = var4.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var51] = var5.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var51] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var51] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var51] != -1) {
				this.textureCoords[var51] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.array = var34 * -290410379;
		var3.array = var29 * -290410379;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.readUnsignedByte();
			if (var56 == 1) {
				var51 = var2.readUShortSmart() + var54;
				var52 = var2.readUShortSmart() + var51;
				var53 = var2.readUShortSmart() + var52;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.readUShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.readUShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.readUShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var57;
				this.indices3[var55] = var53;
			}
		}

		var2.array = var41 * -290410379;
		var3.array = var42 * -290410379;
		var4.array = var43 * -290410379;
		var5.array = var44 * -290410379;
		var6.array = var45 * -290410379;
		var7.array = var46 * -290410379;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.textureRenderTypes[var55] & 255;
			if (var56 == 0) {
				this.texTriangleX[var55] = (short)var2.readUnsignedShort();
				this.texTriangleY[var55] = (short)var2.readUnsignedShort();
				this.texTriangleZ[var55] = (short)var2.readUnsignedShort();
			}
		}

		var2.array = var26 * -290410379;
		var55 = var2.readUnsignedByte();
		if (var55 != 0) {
			new ModelData0();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readShortSmart();
		}

	}

	@ObfuscatedName("al")
	void method4859(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.array = (var1.length - 18) * -290410379;
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
		this.verticesCount = var9;
		this.faceCount = var10;
		this.textureTriangleCount = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.textureRenderTypes = new byte[var11];
			this.texTriangleX = new short[var11];
			this.texTriangleY = new short[var11];
			this.texTriangleZ = new short[var11];
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
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		this.faceColors = new short[var10];
		var4.array = var21 * -290410379;
		var5.array = var32 * -290410379;
		var6.array = var33 * -290410379;
		var7.array = var45 * -290410379;
		var8.array = var27 * -290410379;
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
				var40 = var5.readUShortSmart();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.readUShortSmart();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.readUShortSmart();
			}

			this.verticesX[var38] = var35 + var40;
			this.verticesY[var38] = var36 + var41;
			this.verticesZ[var38] = var37 + var42;
			var35 = this.verticesX[var38];
			var36 = this.verticesY[var38];
			var37 = this.verticesZ[var38];
			if (var16 == 1) {
				this.vertexSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.array = var30 * -290410379;
		var5.array = var26 * -290410379;
		var6.array = var24 * -290410379;
		var7.array = var28 * -290410379;
		var8.array = var25 * -290410379;

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
				this.faceRenderPriorities[var38] = var6.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var38] = var7.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.array = var29 * -290410379;
		var5.array = var23 * -290410379;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.readUnsignedByte();
			if (var43 == 1) {
				var38 = var4.readUShortSmart() + var41;
				var39 = var4.readUShortSmart() + var38;
				var40 = var4.readUShortSmart() + var39;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.readUShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.readUShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.readUShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var44;
				this.indices3[var42] = var40;
			}
		}

		var4.array = var31 * -290410379;

		for (var42 = 0; var42 < var11; ++var42) {
			this.textureRenderTypes[var42] = 0;
			this.texTriangleX[var42] = (short)var4.readUnsignedShort();
			this.texTriangleY[var42] = (short)var4.readUnsignedShort();
			this.texTriangleZ[var42] = (short)var4.readUnsignedShort();
		}

		if (this.textureCoords != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.textureCoords[var43] & 255;
				if (var44 != 255) {
					if (this.indices1[var43] == (this.texTriangleX[var44] & '\uffff') && this.indices2[var43] == (this.texTriangleY[var44] & '\uffff') && this.indices3[var43] == (this.texTriangleZ[var44] & '\uffff')) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I"
	)
	final int method4903(ModelData var1, int var2) {
		int var3 = -1;
		int var4 = var1.verticesX[var2];
		int var5 = var1.verticesY[var2];
		int var6 = var1.verticesZ[var2];

		for (int var7 = 0; var7 < this.verticesCount; ++var7) {
			if (var4 == this.verticesX[var7] && var5 == this.verticesY[var7] && var6 == this.verticesZ[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.verticesX[this.verticesCount] = var4;
			this.verticesY[this.verticesCount] = var5;
			this.verticesZ[this.verticesCount] = var6;
			if (var1.vertexSkins != null) {
				this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
			}

			if (var1.field2542 != null) {
				this.field2542[this.verticesCount] = var1.field2542[var2];
				this.field2557[this.verticesCount] = var1.field2557[var2];
			}

			var3 = this.verticesCount++;
		}

		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Liu;"
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

		var1.verticesCount = this.verticesCount;
		var1.faceCount = this.faceCount;
		var1.textureTriangleCount = this.textureTriangleCount;
		var1.verticesX = this.verticesX;
		var1.verticesY = this.verticesY;
		var1.verticesZ = this.verticesZ;
		var1.indices1 = this.indices1;
		var1.indices2 = this.indices2;
		var1.indices3 = this.indices3;
		var1.faceRenderPriorities = this.faceRenderPriorities;
		var1.faceAlphas = this.faceAlphas;
		var1.textureCoords = this.textureCoords;
		var1.faceColors = this.faceColors;
		var1.faceTextures = this.faceTextures;
		var1.priority = this.priority;
		var1.textureRenderTypes = this.textureRenderTypes;
		var1.texTriangleX = this.texTriangleX;
		var1.texTriangleY = this.texTriangleY;
		var1.texTriangleZ = this.texTriangleZ;
		var1.vertexSkins = this.vertexSkins;
		var1.faceSkins = this.faceSkins;
		var1.vertexLabels = this.vertexLabels;
		var1.faceLabelsAlpha = this.faceLabelsAlpha;
		var1.vertexNormals = this.vertexNormals;
		var1.faceNormals = this.faceNormals;
		var1.ambient = this.ambient;
		var1.contrast = this.contrast;
		var1.field2545 = this.field2545;
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Liu;"
	)
	public ModelData method4847(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBounds();
		int var7 = var2 + this.field2539;
		int var8 = var2 + this.field2566;
		int var9 = var4 + this.field2568;
		int var10 = var4 + this.field2567;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				ModelData var11 = new ModelData(this, true, true, true, true);
				var11.verticesY = new int[var11.verticesCount];
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
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						} else {
							var11.verticesY[var12] = this.verticesY[var12];
						}
					}
				}

				var11.method4852();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("an")
	public int method4840(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			if (this.verticesX[var4] == var1 && var2 == this.verticesY[var4] && var3 == this.verticesZ[var4]) {
				return var4;
			}
		}

		this.verticesX[this.verticesCount] = var1;
		this.verticesY[this.verticesCount] = var2;
		this.verticesZ[this.verticesCount] = var3;
		return this.verticesCount++;
	}

	@ObfuscatedName("ar")
	public int method4841(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
		this.indices1[this.faceCount] = var1;
		this.indices2[this.faceCount] = var2;
		this.indices3[this.faceCount] = var3;
		this.faceRenderTypes[this.faceCount] = var4;
		this.textureCoords[this.faceCount] = var5;
		this.faceColors[this.faceCount] = var6;
		this.faceTextures[this.faceCount] = var7;
		return this.faceCount++;
	}

	@ObfuscatedName("ae")
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

			for (var3 = 0; var3 < this.verticesCount; ++var3) {
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

			for (var3 = 0; var3 < this.verticesCount; this.vertexLabels[var4][var1[var4]++] = var3++) {
				var4 = this.vertexSkins[var3];
			}

			this.vertexSkins = null;
		}

		if (this.faceSkins != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.faceCount; ++var3) {
				var4 = this.faceSkins[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.faceLabelsAlpha = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.faceLabelsAlpha[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.faceCount; this.faceLabelsAlpha[var4][var1[var4]++] = var3++) {
				var4 = this.faceSkins[var3];
			}

			this.faceSkins = null;
		}

	}

	@ObfuscatedName("ad")
	public void method4843() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.method4852();
	}

	@ObfuscatedName("ag")
	public void method4862() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.method4852();
	}

	@ObfuscatedName("av")
	public void method4901() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.method4852();
	}

	@ObfuscatedName("ah")
	public void method4835(int var1) {
		int var2 = ModelData_sine[var1];
		int var3 = ModelData_cosine[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var2 * this.verticesZ[var4] + var3 * this.verticesX[var4] >> 16;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] - var2 * this.verticesX[var4] >> 16;
			this.verticesX[var4] = var5;
		}

		this.method4852();
	}

	@ObfuscatedName("ab")
	@Export("changeOffset")
	public void changeOffset(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.method4852();
	}

	@ObfuscatedName("ax")
	@Export("recolor")
	public void recolor(short var1, short var2) {
		for (int var3 = 0; var3 < this.faceCount; ++var3) {
			if (this.faceColors[var3] == var1) {
				this.faceColors[var3] = var2;
			}
		}

	}

	@ObfuscatedName("ak")
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

	@ObfuscatedName("aj")
	public void method4853() {
		int var1;
		for (var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		for (var1 = 0; var1 < this.faceCount; ++var1) {
			int var2 = this.indices1[var1];
			this.indices1[var1] = this.indices3[var1];
			this.indices3[var1] = var2;
		}

		this.method4852();
	}

	@ObfuscatedName("az")
	@Export("resize")
	public void resize(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.method4852();
	}

	@ObfuscatedName("bt")
	@Export("calculateVertexNormals")
	public void calculateVertexNormals() {
		if (this.vertexNormals == null) {
			this.vertexNormals = new VertexNormal[this.verticesCount];

			int var1;
			for (var1 = 0; var1 < this.verticesCount; ++var1) {
				this.vertexNormals[var1] = new VertexNormal();
			}

			for (var1 = 0; var1 < this.faceCount; ++var1) {
				int var2 = this.indices1[var1];
				int var3 = this.indices2[var1];
				int var4 = this.indices3[var1];
				int var5 = this.verticesX[var3] - this.verticesX[var2];
				int var6 = this.verticesY[var3] - this.verticesY[var2];
				int var7 = this.verticesZ[var3] - this.verticesZ[var2];
				int var8 = this.verticesX[var4] - this.verticesX[var2];
				int var9 = this.verticesY[var4] - this.verticesY[var2];
				int var10 = this.verticesZ[var4] - this.verticesZ[var2];
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
					VertexNormal var16 = this.vertexNormals[var2];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
					var16 = this.vertexNormals[var3];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
					var16 = this.vertexNormals[var4];
					var16.x += var11;
					var16.y += var12;
					var16.z += var13;
					++var16.magnitude;
				} else if (var15 == 1) {
					if (this.faceNormals == null) {
						this.faceNormals = new FaceNormal[this.faceCount];
					}

					FaceNormal var17 = this.faceNormals[var1] = new FaceNormal();
					var17.x = var11;
					var17.y = var12;
					var17.z = var13;
				}
			}

		}
	}

	@ObfuscatedName("bs")
	void method4852() {
		this.vertexNormals = null;
		this.vertexVertices = null;
		this.faceNormals = null;
		this.isBoundsCalculated = false;
	}

	@ObfuscatedName("bu")
	@Export("calculateBounds")
	void calculateBounds() {
		if (!this.isBoundsCalculated) {
			super.height = 0;
			this.field2537 = 0;
			this.field2539 = 999999;
			this.field2566 = -999999;
			this.field2567 = -99999;
			this.field2568 = 99999;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (var2 < this.field2539) {
					this.field2539 = var2;
				}

				if (var2 > this.field2566) {
					this.field2566 = var2;
				}

				if (var4 < this.field2568) {
					this.field2568 = var4;
				}

				if (var4 > this.field2567) {
					this.field2567 = var4;
				}

				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.field2537) {
					this.field2537 = var3;
				}
			}

			this.isBoundsCalculated = true;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Ljn;"
	)
	@Export("toModel")
	public final Model toModel(int var1, int var2, int var3, int var4, int var5) {
		this.calculateVertexNormals();
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
		int var7 = var6 * var2 >> 8;
		Model var8 = new Model();
		var8.faceColors1 = new int[this.faceCount];
		var8.faceColors2 = new int[this.faceCount];
		var8.faceColors3 = new int[this.faceCount];
		if (this.textureTriangleCount > 0 && this.textureCoords != null) {
			int[] var9 = new int[this.textureTriangleCount];

			int var10;
			for (var10 = 0; var10 < this.faceCount; ++var10) {
				if (this.textureCoords[var10] != -1) {
					++var9[this.textureCoords[var10] & 255];
				}
			}

			var8.texIndicesCount = 0;

			for (var10 = 0; var10 < this.textureTriangleCount; ++var10) {
				if (var9[var10] > 0 && this.textureRenderTypes[var10] == 0) {
					++var8.texIndicesCount;
				}
			}

			var8.texIndices1 = new int[var8.texIndicesCount];
			var8.texIndices2 = new int[var8.texIndicesCount];
			var8.texIndices3 = new int[var8.texIndicesCount];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.textureTriangleCount; ++var11) {
				if (var9[var11] > 0 && this.textureRenderTypes[var11] == 0) {
					var8.texIndices1[var10] = this.texTriangleX[var11] & '\uffff';
					var8.texIndices2[var10] = this.texTriangleY[var11] & '\uffff';
					var8.texIndices3[var10] = this.texTriangleZ[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.textureFaces = new byte[this.faceCount];

			for (var11 = 0; var11 < this.faceCount; ++var11) {
				if (this.textureCoords[var11] != -1) {
					var8.textureFaces[var11] = (byte)var9[this.textureCoords[var11] & 255];
				} else {
					var8.textureFaces[var11] = -1;
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
			if (this.faceAlphas == null) {
				var18 = 0;
			} else {
				var18 = this.faceAlphas[var16];
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
			FaceNormal var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.faceNormals[var16];
						var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1;
						var8.faceColors1[var16] = method4832(this.faceColors[var16] & '\uffff', var14);
						var8.faceColors3[var16] = -1;
					} else if (var17 == 3) {
						var8.faceColors1[var16] = 128;
						var8.faceColors3[var16] = -1;
					} else {
						var8.faceColors3[var16] = -2;
					}
				} else {
					int var15 = this.faceColors[var16] & '\uffff';
					if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
						var13 = this.vertexVertices[this.indices1[var16]];
					} else {
						var13 = this.vertexNormals[this.indices1[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.faceColors1[var16] = method4832(var15, var14);
					if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
						var13 = this.vertexVertices[this.indices2[var16]];
					} else {
						var13 = this.vertexNormals[this.indices2[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.faceColors2[var16] = method4832(var15, var14);
					if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
						var13 = this.vertexVertices[this.indices3[var16]];
					} else {
						var13 = this.vertexNormals[this.indices3[var16]];
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
					var8.faceColors3[var16] = method4832(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.faceNormals[var16];
					var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1;
					var8.faceColors1[var16] = method4887(var14);
					var8.faceColors3[var16] = -1;
				} else {
					var8.faceColors3[var16] = -2;
				}
			} else {
				if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
					var13 = this.vertexVertices[this.indices1[var16]];
				} else {
					var13 = this.vertexNormals[this.indices1[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.faceColors1[var16] = method4887(var14);
				if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
					var13 = this.vertexVertices[this.indices2[var16]];
				} else {
					var13 = this.vertexNormals[this.indices2[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.faceColors2[var16] = method4887(var14);
				if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
					var13 = this.vertexVertices[this.indices3[var16]];
				} else {
					var13 = this.vertexNormals[this.indices3[var16]];
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
				var8.faceColors3[var16] = method4887(var14);
			}
		}

		this.invalidate();
		var8.verticesCount = this.verticesCount;
		var8.verticesX = this.verticesX;
		var8.verticesY = this.verticesY;
		var8.verticesZ = this.verticesZ;
		var8.indicesCount = this.faceCount;
		var8.indices1 = this.indices1;
		var8.indices2 = this.indices2;
		var8.indices3 = this.indices3;
		var8.faceRenderPriorities = this.faceRenderPriorities;
		var8.faceAlphas = this.faceAlphas;
		var8.field2934 = this.priority;
		var8.vertexLabels = this.vertexLabels;
		var8.faceLabelsAlpha = this.faceLabelsAlpha;
		var8.faceTextures = this.faceTextures;
		var8.field2939 = this.field2542;
		var8.field2938 = this.field2557;
		var8.faceBias = this.field2545;
		return var8;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Liu;"
	)
	@Export("ModelData_get")
	public static ModelData ModelData_get(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		return var3 == null ? null : new ModelData(var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liu;Liu;IIIZ)V"
	)
	static void method4831(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
		var0.calculateBounds();
		var0.calculateVertexNormals();
		var1.calculateBounds();
		var1.calculateVertexNormals();
		++field2528;
		int var6 = 0;
		int[] var7 = var1.verticesX;
		int var8 = var1.verticesCount;

		int var9;
		for (var9 = 0; var9 < var0.verticesCount; ++var9) {
			VertexNormal var10 = var0.vertexNormals[var9];
			if (var10.magnitude != 0) {
				int var11 = var0.verticesY[var9] - var3;
				if (var11 <= var1.field2537) {
					int var12 = var0.verticesX[var9] - var2;
					if (var12 >= var1.field2539 && var12 <= var1.field2566) {
						int var13 = var0.verticesZ[var9] - var4;
						if (var13 >= var1.field2568 && var13 <= var1.field2567) {
							for (int var14 = 0; var14 < var8; ++var14) {
								VertexNormal var15 = var1.vertexNormals[var14];
								if (var12 == var7[var14] && var13 == var1.verticesZ[var14] && var11 == var1.verticesY[var14] && var15.magnitude != 0) {
									if (var0.vertexVertices == null) {
										var0.vertexVertices = new VertexNormal[var0.verticesCount];
									}

									if (var1.vertexVertices == null) {
										var1.vertexVertices = new VertexNormal[var8];
									}

									VertexNormal var16 = var0.vertexVertices[var9];
									if (var16 == null) {
										var16 = var0.vertexVertices[var9] = new VertexNormal(var10);
									}

									VertexNormal var17 = var1.vertexVertices[var14];
									if (var17 == null) {
										var17 = var1.vertexVertices[var14] = new VertexNormal(var15);
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
									field2526[var9] = field2528;
									field2536[var14] = field2528;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.faceCount; ++var9) {
				if (field2526[var0.indices1[var9]] == field2528 && field2526[var0.indices2[var9]] == field2528 && field2526[var0.indices3[var9]] == field2528) {
					if (var0.faceRenderTypes == null) {
						var0.faceRenderTypes = new byte[var0.faceCount];
					}

					var0.faceRenderTypes[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.faceCount; ++var9) {
				if (field2528 == field2536[var1.indices1[var9]] && field2528 == field2536[var1.indices2[var9]] && field2528 == field2536[var1.indices3[var9]]) {
					if (var1.faceRenderTypes == null) {
						var1.faceRenderTypes = new byte[var1.faceCount];
					}

					var1.faceRenderTypes[var9] = 2;
				}
			}

		}
	}

	@ObfuscatedName("ac")
	static final int method4832(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ap")
	static final int method4887(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
