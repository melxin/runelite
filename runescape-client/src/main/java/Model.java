import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ak")
	static boolean[] field3032;
	@ObfuscatedName("aw")
	static boolean[] field3096;
	@ObfuscatedName("ap")
	static boolean[] field3034;
	@ObfuscatedName("ay")
	@Export("modelViewportXs")
	static float[] modelViewportXs;
	@ObfuscatedName("au")
	@Export("modelViewportYs")
	static float[] modelViewportYs;
	@ObfuscatedName("az")
	static float[] field3037;
	@ObfuscatedName("ad")
	static int[] field3090;
	@ObfuscatedName("ai")
	static int[] field3054;
	@ObfuscatedName("as")
	static int[] field3040;
	@ObfuscatedName("ac")
	static int[] field3041;
	@ObfuscatedName("ab")
	static char[] field3067;
	@ObfuscatedName("ax")
	static char[][] field3055;
	@ObfuscatedName("ar")
	static int[] field3044;
	@ObfuscatedName("ah")
	static int[][] field3045;
	@ObfuscatedName("al")
	static int[] field3046;
	@ObfuscatedName("af")
	static int[] field3047;
	@ObfuscatedName("am")
	static int[] field3064;
	@ObfuscatedName("ao")
	static boolean field3049;
	@ObfuscatedName("aa")
	static int[] field3068;
	@ObfuscatedName("aq")
	static int[] field3051;
	@ObfuscatedName("be")
	static int[] field3052;
	@ObfuscatedName("bo")
	static int[] field3098;
	@ObfuscatedName("bg")
	static float[] field3058;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bz")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("bb")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static TransformationMatrix field3101;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static TransformationMatrix field3060;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static TransformationMatrix field3061;
	@ObfuscatedName("bt")
	static int[] field3062;
	@ObfuscatedName("bu")
	static int[] field3075;
	@ObfuscatedName("ba")
	static int[] field3065;
	@ObfuscatedName("bi")
	static float[] field3053;
	@ObfuscatedName("by")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bw")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bf")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bn")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bd")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("br")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("bh")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bl")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("bc")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("bq")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("bx")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bv")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ch")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ce")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cu")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ct")
	@Export("faceAlphas")
	public byte[] faceAlphas;
	@ObfuscatedName("cm")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("cb")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ck")
	@Export("faceBias")
	byte[] faceBias;
	@ObfuscatedName("cc")
	public byte field3085;
	@ObfuscatedName("cs")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("cn")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("co")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cx")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("cg")
	int[][] field3092;
	@ObfuscatedName("cp")
	int[][] field3091;
	@ObfuscatedName("cd")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("cz")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ci")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cf")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("cy")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cq")
	@Export("radius")
	int radius;
	@ObfuscatedName("cv")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("cw")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("modelColorOverride")
	ModelColorOverride modelColorOverride;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	class248 field3102;
	@ObfuscatedName("cl")
	short field3103;

	static {
		field3032 = new boolean[6500];
		field3096 = new boolean[6500];
		field3034 = new boolean[6500];
		modelViewportXs = new float[6500];
		modelViewportYs = new float[6500];
		field3037 = new float[6500];
		field3090 = new int[6500];
		field3054 = new int[6500];
		field3040 = new int[6500];
		field3041 = new int[6500];
		field3067 = new char[6000];
		field3055 = new char[6000][512];
		field3044 = new int[12];
		field3045 = new int[12][2500];
		field3046 = new int[2500];
		field3047 = new int[2500];
		field3064 = new int[12];
		field3049 = true;
		field3068 = Rasterizer3D.Rasterizer3D_sine;
		field3051 = Rasterizer3D.Rasterizer3D_cosine;
		field3052 = Rasterizer3D.Rasterizer3D_colorPalette;
		field3098 = Rasterizer3D.field2795;
		field3058 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field3101 = new TransformationMatrix();
		field3060 = new TransformationMatrix();
		field3061 = new TransformationMatrix();
		field3062 = new int[10];
		field3075 = new int[10];
		field3065 = new int[10];
		field3053 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3085 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field3102 = class248.field2783;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3085 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field3102 = class248.field2783;
		this.method5910(var1, var2, var3);
		this.field3085 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3085 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field3102 = class248.field2783;
		this.verticesCount = var1.verticesCount;
		this.indicesCount = var1.indicesCount;
		this.texIndicesCount = var1.texIndicesCount;
		this.verticesX = var1.verticesX;
		this.verticesY = var1.verticesY;
		this.verticesZ = var1.verticesZ;
		this.indices1 = var1.indices1;
		this.indices2 = var1.indices2;
		this.indices3 = var1.indices3;
		this.faceColors1 = var1.faceColors1;
		this.faceColors2 = var1.faceColors2;
		this.faceColors3 = var1.faceColors3;
		this.faceRenderPriorities = var1.faceRenderPriorities;
		this.faceAlphas = var1.faceAlphas;
		this.textureFaces = var1.textureFaces;
		this.faceTextures = var1.faceTextures;
		this.faceBias = var1.faceBias;
		this.field3085 = var1.field3085;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Lky;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3085 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field3102 = class248.field2783;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field3085 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field3085 == -1) {
					this.field3085 = var4.field3085;
				}
			}
		}

		this.method5910(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5912(var1[var3]);
		}

	}

	@ObfuscatedName("av")
	void method5910(int var1, int var2, int var3) {
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceColors1 = new int[var2];
		this.faceColors2 = new int[var2];
		this.faceColors3 = new int[var2];
		if (var3 > 0) {
			this.texIndices1 = new int[var3];
			this.texIndices2 = new int[var3];
			this.texIndices3 = new int[var3];
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	void method5911(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3085 != var1.field3085)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field3085);
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) {
			this.faceAlphas = new byte[var2];
			Arrays.fill(this.faceAlphas, (byte)0);
		}

		if (this.faceTextures == null && var1.faceTextures != null) {
			this.faceTextures = new short[var2];
			Arrays.fill(this.faceTextures, (short)-1);
		}

		if (this.textureFaces == null && var1.textureFaces != null) {
			this.textureFaces = new byte[var2];
			Arrays.fill(this.textureFaces, (byte)-1);
		}

		if (this.faceBias == null && var1.faceBias != null) {
			this.faceBias = new byte[var2];
			Arrays.fill(this.faceBias, (byte)0);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	public void method5912(Model var1) {
		if (var1 != null) {
			this.method5911(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field3085;
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) {
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
				}

				if (this.faceTextures != null) {
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
				}

				if (this.textureFaces != null) {
					if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
						this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
					} else {
						this.textureFaces[this.indicesCount] = -1;
					}
				}

				if (this.faceBias != null && var1.faceBias != null) {
					this.faceBias[this.indicesCount] = var1.faceBias[var2];
				}

				++this.indicesCount;
			}

			for (var2 = 0; var2 < var1.texIndicesCount; ++var2) {
				this.texIndices1[this.texIndicesCount] = this.verticesCount + var1.texIndices1[var2];
				this.texIndices2[this.texIndicesCount] = this.verticesCount + var1.texIndices2[var2];
				this.texIndices3[this.texIndicesCount] = this.verticesCount + var1.texIndices3[var2];
				++this.texIndicesCount;
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) {
				this.verticesX[this.verticesCount] = var1.verticesX[var2];
				this.verticesY[this.verticesCount] = var1.verticesY[var2];
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
				++this.verticesCount;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lky;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model(this);
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

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

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Z)Lky;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Z)Lky;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZLky;[B)Lky;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.texIndicesCount = this.texIndicesCount;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.textureFaces = this.textureFaces;
		var2.faceTextures = this.faceTextures;
		var2.faceBias = this.faceBias;
		var2.field3085 = this.field3085;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field3092 = this.field3092;
		var2.field3091 = this.field3091;
		var2.isSingleTile = this.isSingleTile;
		var2.modelColorOverride = this.modelColorOverride;
		var2.field3103 = this.field3103;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("ax")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		AABB var2 = this.getAABB(var1);
		if (var2 == null) {
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			int var9 = field3051[var1];
			int var10 = field3068[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var12 = class348.method7548(this.verticesX[var11], this.verticesZ[var11], var9, var10);
				int var13 = this.verticesY[var11];
				int var15 = this.verticesX[var11];
				int var16 = this.verticesZ[var11];
				int var14 = var16 * var9 - var10 * var15 >> 16;
				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}

				if (var14 < var5) {
					var5 = var14;
				}

				if (var14 > var8) {
					var8 = var14;
				}
			}

			var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
			boolean var18 = true;
			if (var2.xMidOffset < 32) {
				var2.xMidOffset = 32;
			}

			if (var2.zMidOffset < 32) {
				var2.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var19 = true;
				var2.xMidOffset += 8;
				var2.zMidOffset += 8;
			}

			var2.aabb = this.aabb;
			this.aabb = var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lje;"
	)
	@Export("getAABB")
	AABB getAABB(int var1) {
		for (AABB var2 = this.aabb; var2 != null; var2 = var2.aabb) {
			if (var2.orientation == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("ah")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("al")
	void method6052() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("af")
	public int method5921() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ao")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			if (var2 != -1) {
				Animation var3 = var1.frames[var2];
				Skeleton var4 = var3.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;

				for (int var5 = 0; var5 < var3.transformCount; ++var5) {
					int var6 = var3.transformSkeletonLabels[var5];
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
				}

				this.resetBounds();
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)V"
	)
	public void method5924(class146 var1, int var2) {
		Skeleton var3 = var1.field1721;
		class251 var4 = var3.method5545();
		if (var4 != null) {
			var3.method5545().method5478(var1, var2);
			this.method5996(var3.method5545(), var1.method3906());
		}

		if (var1.method3935()) {
			this.method5925(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)V"
	)
	void method5925(class146 var1, int var2) {
		Skeleton var3 = var1.field1721;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1719 != null && var1.field1719[var4] != null && var1.field1719[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class139 var6 = var1.field1719[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3835(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)V"
	)
	void method5996(class251 var1, int var2) {
		this.method5952(var1, var2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljt;ILjt;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljc;Lfy;I[ZZZ)V"
	)
	public void method6006(Skeleton var1, class146 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class251 var7 = var1.method5545();
		if (var7 != null) {
			var7.method5479(var2, var3, var4, var5);
			if (var6) {
				this.method5996(var7, var2.method3906());
			}
		}

		if (!var5 && var2.method3935()) {
			this.method5925(var2, var3);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I[IZ)V"
	)
	public void method6053(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("bk")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field3068[var14];
								var16 = field3051[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field3068[var12];
								var16 = field3051[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field3068[var13];
								var16 = field3051[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("bb")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bj")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bm")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bp")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3068[var1];
		int var3 = field3051[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	public void method6034(class461 var1) {
		ProjectionCoord var2;
		synchronized(ProjectionCoord.field5238) {
			if (ProjectionCoord.field5236 == 0) {
				var2 = new ProjectionCoord();
			} else {
				ProjectionCoord.field5238[--ProjectionCoord.field5236].method9349();
				var2 = ProjectionCoord.field5238[ProjectionCoord.field5236];
			}
		}

		ProjectionCoord var3 = var2;

		for (int var5 = 0; var5 < this.verticesCount; ++var5) {
			var3.method9296((float)this.verticesX[var5], (float)this.verticesY[var5], (float)this.verticesZ[var5]);
			var3.method9307(var1);
			this.verticesX[var5] = (int)var3.x;
			this.verticesY[var5] = (int)var3.z;
			this.verticesZ[var5] = (int)var3.y;
		}

		var3.release();
		this.resetBounds();
	}

	@ObfuscatedName("bu")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ba")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bi")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method6052();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field3068[var1];
		int var11 = field3051[var1];
		int var12 = field3068[var2];
		int var13 = field3051[var2];
		int var14 = field3068[var3];
		int var15 = field3051[var3];
		int var16 = field3068[var4];
		int var17 = field3051[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field3090[var19] = var22 - var18;
			modelViewportXs[var19] = (float)(var8 + var20 * Rasterizer3D.get3dZoom() / var22);
			modelViewportYs[var19] = (float)(var9 + var23 * Rasterizer3D.get3dZoom() / var22);
			field3037[var19] = (float)var22;
			if (this.faceTextures != null) {
				field3054[var19] = var20;
				field3040[var19] = var23;
				field3041[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("by")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method6052();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field3068[var1];
		int var12 = field3051[var1];
		int var13 = field3068[var2];
		int var14 = field3051[var2];
		int var15 = field3068[var3];
		int var16 = field3051[var3];
		int var17 = field3068[var4];
		int var18 = field3051[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field3090[var20] = var23 - var19;
			modelViewportXs[var20] = (float)(var9 + var21 * Rasterizer3D.get3dZoom() / var8);
			modelViewportYs[var20] = (float)(var10 + var24 * Rasterizer3D.get3dZoom() / var8);
			field3037[var20] = (float)var8;
			if (this.faceTextures != null) {
				field3054[var20] = var21;
				field3040[var20] = var24;
				field3041[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bw")
	void method5940(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		if (Rasterizer3D.clips.field3150 != 1 || this.faceAlphas != null) {
			int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
			float var13 = Rasterizer3D.field2798[var2];
			float var14 = Rasterizer3D.field2791[var2];
			float var15 = Rasterizer3D.field2798[var3];
			float var16 = Rasterizer3D.field2791[var3];
			if (this.boundsType != 1) {
				this.calculateBoundsCylinder();
			}

			this.calculateBoundingBox(var1);
			int var17 = var12 * var6 - var11 * var4 >> 16;
			int var18 = var17 * var10 + var5 * var9 >> 16;
			int var19 = var10 * this.xzRadius >> 16;
			int var20 = var18 + var19;
			if (var20 > 50 && var18 < AbstractRasterizer.method5511()) {
				int var21 = var11 * var6 + var12 * var4 >> 16;
				int var22 = (var21 - this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
					int var23 = (var21 + this.xzRadius) * Rasterizer3D.get3dZoom();
					if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
						int var24 = var5 * var10 - var17 * var9 >> 16;
						int var25 = var9 * this.xzRadius >> 16;
						int var26 = var25 + (var10 * this.bottomY >> 16);
						int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
						if (var27 / var20 > Rasterizer3D.method5373()) {
							int var28 = var25 + (var10 * super.height >> 16);
							int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
							if (var29 / var20 < Rasterizer3D.method5372()) {
								int var30 = var19 + (var9 * super.height >> 16);
								boolean var31 = false;
								boolean var32 = false;
								if (var18 - var30 <= 50) {
									var32 = true;
								}

								boolean var33 = var32 || this.faceTextures != null;
								int var34 = UserComparator8.method3685();
								int var35 = HttpMethod.method85();
								boolean var36 = ViewportMouse.ViewportMouse_isInViewport;
								boolean var38 = WorldMapLabelSize.method6577(var7);
								boolean var39 = false;
								int var41;
								if (var38 && var36) {
									boolean var40 = false;
									int var42;
									int var43;
									if (field3049) {
										var40 = WorldMapSection1.method7043(this, var1, var4, var5, var6, var13, var14, var15, var16, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
									} else {
										var41 = var18 - var19;
										if (var41 <= 50) {
											var41 = 50;
										}

										if (var21 > 0) {
											var22 /= var20;
											var23 /= var41;
										} else {
											var23 /= var20;
											var22 /= var41;
										}

										if (var24 > 0) {
											var29 /= var20;
											var27 /= var41;
										} else {
											var27 /= var20;
											var29 /= var41;
										}

										var42 = var34 - Rasterizer3D.getClipMidX();
										var43 = var35 - Rasterizer3D.getClipMidY();
										if (var42 > var22 && var42 < var23 && var43 > var29 && var43 < var27) {
											var40 = true;
										}
									}

									if (var40) {
										if (this.isSingleTile) {
											var41 = var5 - super.height / 2;
											var42 = var12 * var6 - var11 * var4 >> 16;
											var42 = var41 * var9 + var42 * var10 >> 16;
											var43 = var42 - this.xzRadius;
											Varps.method7665(var7, var43);
										} else {
											var39 = true;
										}
									}
								}

								int var51 = Rasterizer3D.getClipMidX();
								var41 = Rasterizer3D.getClipMidY();
								float var52 = 0.0F;
								float var53 = 0.0F;
								if (var1 != 0) {
									var52 = Rasterizer3D.field2798[var1];
									var53 = Rasterizer3D.field2791[var1];
								}

								for (int var44 = 0; var44 < this.verticesCount; ++var44) {
									float var45 = (float)this.verticesX[var44];
									float var46 = (float)this.verticesY[var44];
									float var47 = (float)this.verticesZ[var44];
									float var48;
									if (var1 != 0) {
										var48 = var47 * var52 + var45 * var53;
										var47 = var47 * var53 - var45 * var52;
										var45 = var48;
									}

									var45 += (float)var4;
									var46 += (float)var5;
									var47 += (float)var6;
									var48 = var47 * var15 + var45 * var16;
									var47 = var47 * var16 - var45 * var15;
									var45 = var48;
									var48 = var46 * var14 - var47 * var13;
									var47 = var46 * var13 + var47 * var14;
									var31 |= this.method5942(var44, var45, var48, var47, var18, var51, var41, var33);
								}

								try {
									this.draw0(var31, var39, this.isSingleTile, var7);
								} catch (Exception var50) {
								}

							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bf")
	boolean method5942(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		field3090[var1] = (int)var4 - var5;
		if (var8) {
			field3054[var1] = (int)var2;
			field3040[var1] = (int)var3;
			field3041[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			modelViewportXs[var1] = (float)var6 + var2 * (float)Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = (float)var7 + var3 * (float)Rasterizer3D.get3dZoom() / var4;
			field3037[var1] = var4;
			return false;
		} else {
			modelViewportXs[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("bn")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field3067[var6] = 0;
			}

			var6 = var3 ? 20 : 5;
			int var7 = Rasterizer3D.method5412();

			for (int var8 = 0; var8 < this.indicesCount; ++var8) {
				if (this.faceColors3[var8] == -2) {
					field3034[var8] = true;
				} else {
					if (this.field3102 != class248.field2785) {
						if (Rasterizer3D.clips.field3150 == 1 && (this.faceAlphas == null || this.faceAlphas[var8] == 0)) {
							field3034[var8] = true;
							continue;
						}

						if (Rasterizer3D.clips.field3150 == 0 && this.faceAlphas != null && this.faceAlphas[var8] != 0) {
							field3034[var8] = true;
							continue;
						}
					}

					int var9 = this.indices1[var8];
					int var10 = this.indices2[var8];
					int var11 = this.indices3[var8];
					float var12 = modelViewportXs[var9];
					float var13 = modelViewportXs[var10];
					float var14 = modelViewportXs[var11];
					field3096[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
					int var15;
					if (field3096[var8]) {
						var15 = field3054[var9];
						int var16 = field3054[var10];
						int var17 = field3054[var11];
						int var18 = field3040[var9];
						int var19 = field3040[var10];
						int var20 = field3040[var11];
						int var21 = field3041[var9];
						int var22 = field3041[var10];
						int var23 = field3041[var11];
						var15 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						var21 -= var22;
						var23 -= var22;
						int var24 = var18 * var23 - var21 * var20;
						int var25 = var21 * var17 - var15 * var23;
						int var26 = var15 * var20 - var18 * var17;
						field3034[var8] = (float)(var16 * var24 + var19 * var25 + var22 * var26) <= 0.0F;
					} else {
						field3034[var8] = (var12 - var13) * (modelViewportYs[var11] - modelViewportYs[var10]) - (modelViewportYs[var9] - modelViewportYs[var10]) * (var14 - var13) <= 0.0F;
						field3032[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > (float)var7 || var13 > (float)var7 || var14 > (float)var7;
						if (var2 && VarcInt.method4357((int)modelViewportYs[var9], (int)modelViewportYs[var10], (int)modelViewportYs[var11], (int)var12, (int)var13, (int)var14, var6)) {
							var15 = (int)(field3037[var9] + field3037[var10] + field3037[var11]) / 3;
							Varps.method7665(var4, var15);
						}
					}
				}
			}

			short var31 = this.field3103;
			boolean var32 = false;
			if (Rasterizer3D.clips.field3166.method6121()) {
				this.field3103 = (short)this.indicesCount;
			} else if (this.modelColorOverride != null && this.modelColorOverride.method6121()) {
				Rasterizer3D.clips.field3166.method6119(this.modelColorOverride);
				var32 = true;
			}

			try {
				if (!Rasterizer3D.method5376()) {
					this.method5936();
				} else {
					class248 var28 = this.field3102;
					if (var28 == class248.field2783) {
						if (Rasterizer3D.clips.field3150 != 0 && this.faceAlphas != null) {
							var28 = class248.field2784;
						} else {
							var28 = class248.field2786;
						}
					}

					switch(var28.field2787) {
					case 1:
						Rasterizer3D.clips.field3142 = -1;
						Rasterizer3D.clips.field3139 = -1;
						this.method5936();
						break;
					case 2:
						Rasterizer3D.clips.field3142 = -1;
						Rasterizer3D.clips.field3139 = 0;
						this.method5936();
						Rasterizer3D.clips.field3142 = 0;
						Rasterizer3D.clips.field3139 = -1;
						this.method5936();
						Rasterizer3D.clips.field3142 = -1;
						Rasterizer3D.clips.field3139 = -1;
						break;
					case 3:
						Rasterizer3D.clips.field3142 = -1;
						Rasterizer3D.clips.field3139 = -1;
						this.method5944();
					}
				}
			} finally {
				this.field3103 = var31;
				if (var32) {
					Rasterizer3D.clips.field3166.method6118();
				}

			}

		}
	}

	@ObfuscatedName("bd")
	void method5944() {
		for (int var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field3034[var1]) {
				this.drawFace(var1);
			}
		}

	}

	@ObfuscatedName("br")
	void method5936() {
		for (char var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field3034[var1]) {
				int var2 = (field3090[this.indices1[var1]] + field3090[this.indices2[var1]] + field3090[this.indices3[var1]]) / 3 + this.radius;
				field3055[var2][field3067[var2]++] = var1;
			}
		}

		if (this.faceRenderPriorities == null) {
			for (int var5 = this.diameter - 1; var5 >= 0; --var5) {
				char var6 = field3067[var5];
				if (var6 > 0) {
					char[] var3 = field3055[var5];

					for (int var4 = 0; var4 < var6; ++var4) {
						this.drawFace(var3[var4]);
					}
				}
			}
		} else {
			this.method5946();
		}

	}

	@ObfuscatedName("bh")
	void method5946() {
		int var1;
		for (var1 = 0; var1 < 12; ++var1) {
			field3044[var1] = 0;
			field3064[var1] = 0;
		}

		int var4;
		for (var1 = this.diameter - 1; var1 >= 0; --var1) {
			char var2 = field3067[var1];
			if (var2 > 0) {
				char[] var13 = field3055[var1];

				for (var4 = 0; var4 < var2; ++var4) {
					char var5 = var13[var4];
					byte var6 = this.faceRenderPriorities[var5];
					int var14 = field3044[var6]++;
					field3045[var6][var14] = var5;
					if (var6 < 10) {
						int[] var10000 = field3064;
						var10000[var6] += var1;
					} else if (var6 == 10) {
						field3046[var14] = var1;
					} else {
						field3047[var14] = var1;
					}
				}
			}
		}

		var1 = 0;
		if (field3044[1] > 0 || field3044[2] > 0) {
			var1 = (field3064[1] + field3064[2]) / (field3044[1] + field3044[2]);
		}

		int var15 = 0;
		if (field3044[3] > 0 || field3044[4] > 0) {
			var15 = (field3064[3] + field3064[4]) / (field3044[3] + field3044[4]);
		}

		int var3 = 0;
		if (field3044[6] > 0 || field3044[8] > 0) {
			var3 = (field3064[8] + field3064[6]) / (field3044[8] + field3044[6]);
		}

		int var16 = 0;
		int var17 = field3044[10];
		int[] var7 = field3045[10];
		int[] var8 = field3046;
		if (var16 == var17) {
			var16 = 0;
			var17 = field3044[11];
			var7 = field3045[11];
			var8 = field3047;
		}

		if (var16 < var17) {
			var4 = var8[var16];
		} else {
			var4 = -1000;
		}

		for (int var9 = 0; var9 < 10; ++var9) {
			while (var9 == 0 && var4 > var1) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field3045[11]) {
					var16 = 0;
					var17 = field3044[11];
					var7 = field3045[11];
					var8 = field3047;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 3 && var4 > var15) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field3045[11]) {
					var16 = 0;
					var17 = field3044[11];
					var7 = field3045[11];
					var8 = field3047;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 5 && var4 > var3) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field3045[11]) {
					var16 = 0;
					var17 = field3044[11];
					var7 = field3045[11];
					var8 = field3047;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			int var10 = field3044[var9];
			int[] var11 = field3045[var9];

			for (int var12 = 0; var12 < var10; ++var12) {
				this.drawFace(var11[var12]);
			}
		}

		while (var4 != -1000) {
			this.drawFace(var7[var16++]);
			if (var16 == var17 && var7 != field3045[11]) {
				var16 = 0;
				var7 = field3045[11];
				var17 = field3044[11];
				var8 = field3047;
			}

			if (var16 < var17) {
				var4 = var8[var16];
			} else {
				var4 = -1000;
			}
		}

	}

	@ObfuscatedName("bl")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.currentFaceAlpha = 0;
		} else {
			Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
		}

		if (Rasterizer3D.clips.field3150 != 1 || Rasterizer3D.clips.currentFaceAlpha != 0) {
			if (Rasterizer3D.clips.field3150 != 0 || Rasterizer3D.clips.currentFaceAlpha == 0) {
				if (field3096[var1]) {
					this.method5950(var1);
				} else {
					int var2 = this.indices1[var1];
					int var3 = this.indices2[var1];
					int var4 = this.indices3[var1];
					Rasterizer3D.clips.clipping = field3032[var1];
					int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
					float var6 = WorldMapSectionType.method6970(field3037[var2] - (float)var5);
					float var7 = WorldMapSectionType.method6970(field3037[var3] - (float)var5);
					float var8 = WorldMapSectionType.method6970(field3037[var4] - (float)var5);
					this.method5949(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], var6, var7, var8, this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
				}
			}
		}
	}

	@ObfuscatedName("bc")
	boolean method6027(int var1) {
		return var1 < this.field3103;
	}

	@ObfuscatedName("bq")
	final void method5949(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.textureFaces != null && this.textureFaces[var1] != -1) {
				int var17 = this.textureFaces[var1] & 255;
				var18 = this.texIndices1[var17];
				var15 = this.texIndices2[var17];
				var16 = this.texIndices3[var17];
			} else {
				var18 = this.indices1[var1];
				var15 = this.indices2[var1];
				var16 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3054[var18], field3054[var15], field3054[var16], field3040[var18], field3040[var15], field3040[var16], field3041[var18], field3041[var15], field3041[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3054[var18], field3054[var15], field3054[var16], field3040[var18], field3040[var15], field3040[var16], field3041[var18], field3041[var15], field3041[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method6027(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3052[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3052[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bx")
	final void method5950(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field3041[var5];
		int var9 = field3041[var6];
		int var10 = field3041[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.currentFaceAlpha = 0;
		} else {
			Rasterizer3D.clips.currentFaceAlpha = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field3062[var4] = (int)modelViewportXs[var5];
			field3075[var4] = (int)modelViewportYs[var5];
			field3053[var4] = field3037[var5];
			field3065[var4++] = this.faceColors1[var1];
		} else {
			var11 = field3054[var5];
			var12 = field3040[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field3098[var10 - var8] * (50 - var8);
				field3062[var4] = var2 + (var11 + ((field3054[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field3098[var9 - var8] * (50 - var8);
				field3062[var4] = var2 + (var11 + ((field3054[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field3062[var4] = (int)modelViewportXs[var6];
			field3075[var4] = (int)modelViewportYs[var6];
			field3053[var4] = field3037[var6];
			field3065[var4++] = this.faceColors2[var1];
		} else {
			var11 = field3054[var6];
			var12 = field3040[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field3098[var8 - var9] * (50 - var9);
				field3062[var4] = var2 + (var11 + ((field3054[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field3098[var10 - var9] * (50 - var9);
				field3062[var4] = var2 + (var11 + ((field3054[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field3062[var4] = (int)modelViewportXs[var7];
			field3075[var4] = (int)modelViewportYs[var7];
			field3053[var4] = field3037[var7];
			field3065[var4++] = this.faceColors3[var1];
		} else {
			var11 = field3054[var7];
			var12 = field3040[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field3098[var9 - var10] * (50 - var10);
				field3062[var4] = var2 + (var11 + ((field3054[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field3098[var8 - var10] * (50 - var10);
				field3062[var4] = var2 + (var11 + ((field3054[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3075[var4] = var3 + (var12 + ((field3040[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3053[var4] = 50.0F;
				field3065[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field3062[0];
		var12 = field3062[1];
		var13 = field3062[2];
		var14 = field3075[0];
		int var15 = field3075[1];
		int var16 = field3075[2];
		int var17 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
		float var18 = WorldMapSectionType.method6970(field3053[0] - (float)var17);
		float var19 = WorldMapSectionType.method6970(field3053[1] - (float)var17);
		float var20 = WorldMapSectionType.method6970(field3053[2] - (float)var17);
		Rasterizer3D.clips.clipping = false;
		int var21 = Rasterizer3D.method5412();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5949(var1, (float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field3065[0], field3065[1], field3065[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21 || field3062[3] < 0 || field3062[3] > var21) {
				Rasterizer3D.clips.clipping = true;
			}

			int var23;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var24;
				int var26;
				if (this.textureFaces != null && this.textureFaces[var1] != -1) {
					int var25 = this.textureFaces[var1] & 255;
					var26 = this.texIndices1[var25];
					var23 = this.texIndices2[var25];
					var24 = this.texIndices3[var25];
				} else {
					var26 = var5;
					var23 = var6;
					var24 = var7;
				}

				short var27 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3054[var26], field3054[var23], field3054[var24], field3040[var26], field3040[var23], field3040[var24], field3041[var26], field3041[var23], field3041[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3054[var26], field3054[var23], field3054[var24], field3040[var26], field3040[var23], field3040[var24], field3041[var26], field3041[var23], field3041[var24], var27);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field3065[0], field3065[1], field3065[2], field3054[var26], field3054[var23], field3054[var24], field3040[var26], field3040[var23], field3040[var24], field3041[var26], field3041[var23], field3041[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], field3065[0], field3065[2], field3065[3], field3054[var26], field3054[var23], field3054[var24], field3040[var26], field3040[var23], field3040[var24], field3041[var26], field3041[var23], field3041[var24], var27);
				}
			} else {
				boolean var22 = this.method6027(var1);
				if (this.faceColors3[var1] == -1 && var22) {
					var23 = field3052[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterTriangle((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], var23);
				} else if (this.faceColors3[var1] == -1) {
					var23 = field3052[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterFlat((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], var23);
				} else if (var22) {
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field3065[0], field3065[1], field3065[2]);
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], field3065[0], field3065[2], field3065[3]);
				} else {
					Rasterizer3D.rasterGouraud((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field3065[0], field3065[1], field3065[2]);
					Rasterizer3D.rasterGouraud((float)var14, (float)var16, (float)field3075[3], (float)var11, (float)var13, (float)field3062[3], var18, var20, field3053[3], field3065[0], field3065[2], field3065[3]);
				}
			}
		}

	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILry;)V"
	)
	void method6042(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field5260[0] * var3 + var2.field5260[4] * var4 + var2.field5260[8] * var5 + var2.field5260[12] * var6);
		this.verticesY[var1] = -((int)(var2.field5260[1] * var3 + var2.field5260[5] * var4 + var2.field5260[9] * var5 + var2.field5260[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field5260[2] * var3 + var2.field5260[6] * var4 + var2.field5260[10] * var5 + var2.field5260[14] * var6));
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)V"
	)
	void method5952(class251 var1, int var2) {
		if (this.field3092 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field3092[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field3091[var3];
					field3101.method9422();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class136 var8 = var1.method5476(var7);
						if (var8 != null) {
							field3060.method9424((float)var5[var6] / 255.0F);
							field3061.method9480(var8.method3788(var2));
							field3061.method9426(field3060);
							field3101.method9448(field3061);
						}
					}

					this.method6042(var3, field3101);
				}
			}

		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lko;S)V"
	)
	public void method5953(ModelColorOverride var1, short var2) {
		if (this.modelColorOverride == null) {
			this.modelColorOverride = new ModelColorOverride();
		}

		this.modelColorOverride.method6119(var1);
		this.field3103 = var2;
	}

	@ObfuscatedName("cb")
	public void method5954() {
		this.modelColorOverride = null;
	}

	@ObfuscatedName("ck")
	public void method5955(float var1) {
		for (int var2 = 0; var2 < this.verticesCount; ++var2) {
			this.verticesY[var2] = (int)((float)this.verticesY[var2] * var1);
		}

	}

	@ObfuscatedName("cc")
	public void method5956(int var1) {
		for (int var2 = 0; var2 < this.verticesCount; ++var2) {
			this.verticesY[var2] += var1;
		}

	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljs;)V"
	)
	void method6068(class248 var1) {
		this.field3102 = var1;
	}

	@ObfuscatedName("ge")
	void vmethod5939(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.method5940(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(ILry;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (Rasterizer3D.clips.field3150 != 1 || this.faceAlphas != null) {
			if (this.boundsType != 1) {
				this.calculateBoundsCylinder();
			}

			this.calculateBoundingBox(var1);
			class456 var8 = BuddyRankComparator.method3741();
			var8.field5219.method9367((float)var1 * 0.0030679614F, 0.0F, 0.0F);
			var8.field5216.method9296(1.0F, 1.0F, 1.0F);
			var8.field5215.method9296((float)var3, (float)var4, (float)var5);
			TransformationMatrix var9 = SecureUrlRequester.method3659();
			var9.method9427(var8);
			var9.method9426(var2);
			int var10 = (int)var9.method9437(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.radius;
			boolean var13 = var12 <= 50 || this.faceTextures != null;
			boolean var14 = WorldMapLabelSize.method6577(var6);
			boolean var15 = false;
			if (var14) {
				boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
				if (var16) {
					int var19 = Rasterizer3D.getClipMidX();
					int var20 = Rasterizer3D.getClipMidY();
					int var21 = Rasterizer3D.get3dZoom();
					boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
					boolean var17;
					int var24;
					int var40;
					if (!var22) {
						var17 = false;
					} else {
						if (!ViewportMouse.ViewportMouse_false0) {
							byte var23 = 50;
							var24 = AbstractRasterizer.method5511();
							int var25 = var23 * (ViewportMouse.ViewportMouse_x - var19) / var21;
							int var26 = var23 * (ViewportMouse.ViewportMouse_y - var20) / var21;
							int var27 = var24 * (ViewportMouse.ViewportMouse_x - var19) / var21;
							int var28 = var24 * (ViewportMouse.ViewportMouse_y - var20) / var21;
							TransformationMatrix var29;
							synchronized(TransformationMatrix.field5257) {
								if (TransformationMatrix.field5255 == 0) {
									var29 = new TransformationMatrix(var2);
								} else {
									TransformationMatrix.field5257[--TransformationMatrix.field5255].method9480(var2);
									var29 = TransformationMatrix.field5257[TransformationMatrix.field5255];
								}
							}

							var29.method9431();
							float[] var31 = new float[3];
							var29.transformPoint((float)var25, (float)var26, (float)var23, var31);
							var25 = (int)var31[0];
							var26 = (int)var31[1];
							var40 = (int)var31[2];
							var29.transformPoint((float)var27, (float)var28, (float)var24, var31);
							var27 = (int)var31[0];
							var28 = (int)var31[1];
							var24 = (int)var31[2];
							var29.method9417();
							ReflectionCheck.method3624(var25, var26, var40, var27, var28, var24);
						}

						var17 = class179.method4285(this, var1, var3, var4, var5);
					}

					if (var17) {
						if (this.isSingleTile) {
							var40 = (int)var9.method9437(0.0F, (float)(super.height / 2), 0.0F);
							var24 = var40 - this.xzRadius;
							Varps.method7665(var6, var24);
						} else {
							var15 = true;
						}
					}
				}
			}

			int var35 = Rasterizer3D.getClipMidX();
			int var36 = Rasterizer3D.getClipMidY();

			for (int var32 = 0; var32 < this.verticesCount; ++var32) {
				float var37 = (float)this.verticesX[var32];
				float var38 = (float)this.verticesY[var32];
				float var39 = (float)this.verticesZ[var32];
				var9.transformPoint(var37, var38, var39, field3058);
				var37 = field3058[0];
				var38 = field3058[1];
				var39 = field3058[2];
				var11 |= this.method5942(var32, var37, var38, var39, var10, var35, var36, var13);
			}

			var8.method9216();
			var9.method9417();

			try {
				this.draw0(var11, var15, this.isSingleTile, var6);
			} catch (Exception var33) {
			}

		}
	}
}
