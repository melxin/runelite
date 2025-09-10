import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ao")
	static boolean[] field2881;
	@ObfuscatedName("as")
	static boolean[] field2882;
	@ObfuscatedName("al")
	static boolean[] field2896;
	@ObfuscatedName("au")
	@Export("modelViewportXs")
	static float[] modelViewportXs;
	@ObfuscatedName("ai")
	@Export("modelViewportYs")
	static float[] modelViewportYs;
	@ObfuscatedName("aa")
	static float[] field2886;
	@ObfuscatedName("am")
	static int[] field2922;
	@ObfuscatedName("an")
	static int[] field2888;
	@ObfuscatedName("ar")
	static int[] field2889;
	@ObfuscatedName("ae")
	static int[] field2890;
	@ObfuscatedName("ay")
	static char[] field2884;
	@ObfuscatedName("ad")
	static char[][] field2892;
	@ObfuscatedName("ag")
	static int[] field2893;
	@ObfuscatedName("av")
	static int[][] field2894;
	@ObfuscatedName("ah")
	static int[] field2895;
	@ObfuscatedName("ab")
	static int[] field2899;
	@ObfuscatedName("ax")
	static int[] field2897;
	@ObfuscatedName("ak")
	static boolean field2898;
	@ObfuscatedName("aj")
	static int[] field2925;
	@ObfuscatedName("az")
	static int[] field2900;
	@ObfuscatedName("bt")
	static int[] field2949;
	@ObfuscatedName("bs")
	static int[] field2902;
	@ObfuscatedName("bu")
	static float[] field2903;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bd")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("bb")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	static TransformationMatrix field2940;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	static TransformationMatrix field2883;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	static TransformationMatrix field2912;
	@ObfuscatedName("bg")
	static int[] field2911;
	@ObfuscatedName("bx")
	static int[] field2931;
	@ObfuscatedName("bq")
	static int[] field2913;
	@ObfuscatedName("bz")
	static float[] field2914;
	@ObfuscatedName("bn")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("be")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bh")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bk")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bp")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("br")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("bv")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bj")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("bm")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("bf")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("bw")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bc")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("cw")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("cz")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cf")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("cg")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ci")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("cp")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("cm")
	@Export("faceBias")
	byte[] faceBias;
	@ObfuscatedName("cc")
	public byte field2934;
	@ObfuscatedName("cj")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ce")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("cr")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cb")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("cu")
	int[][] field2939;
	@ObfuscatedName("cq")
	int[][] field2938;
	@ObfuscatedName("cn")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("cl")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("cx")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cv")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ca")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cy")
	@Export("radius")
	int radius;
	@ObfuscatedName("cd")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("co")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("modelColorOverride")
	ModelColorOverride modelColorOverride;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	class224 field2951;
	@ObfuscatedName("cs")
	short field2952;

	static {
		field2881 = new boolean[6500];
		field2882 = new boolean[6500];
		field2896 = new boolean[6500];
		modelViewportXs = new float[6500];
		modelViewportYs = new float[6500];
		field2886 = new float[6500];
		field2922 = new int[6500];
		field2888 = new int[6500];
		field2889 = new int[6500];
		field2890 = new int[6500];
		field2884 = new char[6000];
		field2892 = new char[6000][512];
		field2893 = new int[12];
		field2894 = new int[12][2500];
		field2895 = new int[2500];
		field2899 = new int[2500];
		field2897 = new int[12];
		field2898 = true;
		field2925 = Rasterizer3D.Rasterizer3D_sine;
		field2900 = Rasterizer3D.Rasterizer3D_cosine;
		field2949 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2902 = Rasterizer3D.field2634;
		field2903 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2940 = new TransformationMatrix();
		field2883 = new TransformationMatrix();
		field2912 = new TransformationMatrix();
		field2911 = new int[10];
		field2931 = new int[10];
		field2913 = new int[10];
		field2914 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2934 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2951 = class224.field2628;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2934 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2951 = class224.field2628;
		this.method5502(var1, var2, var3);
		this.field2934 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2934 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2951 = class224.field2628;
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
		this.field2934 = var1.field2934;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljn;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2934 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2951 = class224.field2628;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2934 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2934 == -1) {
					this.field2934 = var4.field2934;
				}
			}
		}

		this.method5502(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5572(var1[var3]);
		}

	}

	@ObfuscatedName("af")
	void method5502(int var1, int var2, int var3) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	void method5451(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2934 != var1.field2934)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2934);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public void method5572(Model var1) {
		if (var1 != null) {
			this.method5451(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2934;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljn;"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZLjn;[B)Ljn;"
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
		var2.field2934 = this.field2934;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2939 = this.field2939;
		var2.field2938 = this.field2938;
		var2.isSingleTile = this.isSingleTile;
		var2.modelColorOverride = this.modelColorOverride;
		var2.field2952 = this.field2952;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("al")
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
			int var9 = field2900[var1];
			int var10 = field2925[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var12 = class255.method5813(this.verticesX[var11], this.verticesZ[var11], var9, var10);
				int var13 = this.verticesY[var11];
				int var14 = User.method9952(this.verticesX[var11], this.verticesZ[var11], var9, var10);
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
			boolean var15 = true;
			if (var2.xMidOffset < 32) {
				var2.xMidOffset = 32;
			}

			if (var2.zMidOffset < 32) {
				var2.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var16 = true;
				var2.xMidOffset += 8;
				var2.zMidOffset += 8;
			}

			var2.aabb = this.aabb;
			this.aabb = var2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;"
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

	@ObfuscatedName("aa")
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

	@ObfuscatedName("am")
	void method5460() {
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

	@ObfuscatedName("an")
	public int method5461() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ar")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljj;I)V"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I)V"
	)
	public void method5478(class146 var1, int var2) {
		Skeleton var3 = var1.field1731;
		class227 var4 = var3.method5095();
		if (var4 != null) {
			var3.method5095().method5029(var1, var2);
			this.method5515(var3.method5095(), var1.method3755());
		}

		if (var1.method3756()) {
			this.method5591(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I)V"
	)
	void method5591(class146 var1, int var2) {
		Skeleton var3 = var1.field1731;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1732 != null && var1.field1732[var4] != null && var1.field1732[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class138 var6 = var1.field1732[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3672(var2) * 255.0F);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lig;I)V"
	)
	void method5515(class227 var1, int var2) {
		this.method5567(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljj;ILjj;I[I)V"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lin;Lfh;I[ZZZ)V"
	)
	public void method5498(Skeleton var1, class146 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class227 var7 = var1.method5095();
		if (var7 != null) {
			var7.method5041(var2, var3, var4, var5);
			if (var6) {
				this.method5515(var7, var2.method3755());
			}
		}

		if (!var5 && var2.method3756()) {
			this.method5591(var2, var3);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljj;I[IZ)V"
	)
	public void method5468(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ak")
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
								var15 = field2925[var14];
								var16 = field2900[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2925[var12];
								var16 = field2900[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2925[var13];
								var16 = field2900[var13];
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

	@ObfuscatedName("aj")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("az")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bt")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bs")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2925[var1];
		int var3 = field2900[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

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

	@ObfuscatedName("bi")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bd")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5460();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2925[var1];
		int var11 = field2900[var1];
		int var12 = field2925[var2];
		int var13 = field2900[var2];
		int var14 = field2925[var3];
		int var15 = field2900[var3];
		int var16 = field2925[var4];
		int var17 = field2900[var4];
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
			field2922[var19] = var22 - var18;
			modelViewportXs[var19] = (float)(var8 + var20 * Rasterizer3D.get3dZoom() / var22);
			modelViewportYs[var19] = (float)(var9 + var23 * Rasterizer3D.get3dZoom() / var22);
			field2886[var19] = (float)var22;
			if (this.faceTextures != null) {
				field2888[var19] = var20;
				field2889[var19] = var23;
				field2890[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("ba")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method5460();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2925[var1];
		int var12 = field2900[var1];
		int var13 = field2925[var2];
		int var14 = field2900[var2];
		int var15 = field2925[var3];
		int var16 = field2900[var3];
		int var17 = field2925[var4];
		int var18 = field2900[var4];
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
			field2922[var20] = var23 - var19;
			modelViewportXs[var20] = (float)(var9 + var21 * Rasterizer3D.get3dZoom() / var8);
			modelViewportYs[var20] = (float)(var10 + var24 * Rasterizer3D.get3dZoom() / var8);
			field2886[var20] = (float)var8;
			if (this.faceTextures != null) {
				field2888[var20] = var21;
				field2889[var20] = var24;
				field2890[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bb")
	void method5479(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
		float var13 = Rasterizer3D.field2630[var2];
		float var14 = Rasterizer3D.field2638[var2];
		float var15 = Rasterizer3D.field2630[var3];
		float var16 = Rasterizer3D.field2638[var3];
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var17 = var12 * var6 - var11 * var4 >> 16;
		int var18 = var17 * var10 + var5 * var9 >> 16;
		int var19 = var10 * this.xzRadius >> 16;
		int var20 = var18 + var19;
		if (var20 > 50 && var18 < AbstractRasterizer.method5050()) {
			int var21 = var11 * var6 + var12 * var4 >> 16;
			int var22 = (var21 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var23 = (var21 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var24 = var5 * var10 - var17 * var9 >> 16;
					int var25 = var9 * this.xzRadius >> 16;
					int var26 = var25 + (var10 * this.bottomY >> 16);
					int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
					if (var27 / var20 > Rasterizer3D.method4937()) {
						int var28 = var25 + (var10 * super.height >> 16);
						int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
						if (var29 / var20 < Rasterizer3D.method4935()) {
							int var30 = var19 + (var9 * super.height >> 16);
							boolean var31 = false;
							boolean var32 = false;
							if (var18 - var30 <= 50) {
								var32 = true;
							}

							boolean var33 = var32 || this.faceTextures != null;
							int var34 = HealthBarDefinition.method4259();
							int var35 = ViewportMouse.ViewportMouse_y;
							boolean var37 = class89.method2879();
							boolean var39 = 0L != var7;
							boolean var40;
							if (var39) {
								var40 = (int)(var7 >>> 19 & 1L) == 1;
								var39 = !var40;
							}

							var40 = false;
							int var42;
							if (var39 && var37) {
								boolean var41 = false;
								if (field2898) {
									var41 = SpotAnimationDefinition.method4424(this, var1, var4, var5, var6, var13, var14, var15, var16, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
								} else {
									var42 = var18 - var19;
									if (var42 <= 50) {
										var42 = 50;
									}

									if (var21 > 0) {
										var22 /= var20;
										var23 /= var42;
									} else {
										var23 /= var20;
										var22 /= var42;
									}

									if (var24 > 0) {
										var29 /= var20;
										var27 /= var42;
									} else {
										var27 /= var20;
										var29 /= var42;
									}

									int var43 = var34 - Rasterizer3D.getClipMidX();
									int var44 = var35 - Rasterizer3D.getClipMidY();
									if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
										var41 = true;
									}
								}

								if (var41) {
									if (this.isSingleTile) {
										GrandExchangeOfferWorldComparator.method8499(var7);
									} else {
										var40 = true;
									}
								}
							}

							int var52 = Rasterizer3D.getClipMidX();
							var42 = Rasterizer3D.getClipMidY();
							float var53 = 0.0F;
							float var54 = 0.0F;
							if (var1 != 0) {
								var53 = Rasterizer3D.field2630[var1];
								var54 = Rasterizer3D.field2638[var1];
							}

							for (int var45 = 0; var45 < this.verticesCount; ++var45) {
								float var46 = (float)this.verticesX[var45];
								float var47 = (float)this.verticesY[var45];
								float var48 = (float)this.verticesZ[var45];
								float var49;
								if (var1 != 0) {
									var49 = var48 * var53 + var46 * var54;
									var48 = var48 * var54 - var46 * var53;
									var46 = var49;
								}

								var46 += (float)var4;
								var47 += (float)var5;
								var48 += (float)var6;
								var49 = var48 * var15 + var46 * var16;
								var48 = var48 * var16 - var46 * var15;
								var46 = var49;
								var49 = var47 * var14 - var48 * var13;
								var48 = var47 * var13 + var48 * var14;
								var31 |= this.method5481(var45, var46, var49, var48, var18, var52, var42, var33);
							}

							try {
								this.draw0(var31, var40, this.isSingleTile, var7);
							} catch (Exception var51) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bo")
	boolean method5481(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		field2922[var1] = (int)var4 - var5;
		if (var8) {
			field2888[var1] = (int)var2;
			field2889[var1] = (int)var3;
			field2890[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			modelViewportXs[var1] = (float)var6 + var2 * (float)Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = (float)var7 + var3 * (float)Rasterizer3D.get3dZoom() / var4;
			field2886[var1] = var4;
			return false;
		} else {
			modelViewportXs[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("bl")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2884[var6] = 0;
			}

			var6 = var3 ? 20 : 5;
			int var7 = Rasterizer3D.method4939();

			for (int var8 = 0; var8 < this.indicesCount; ++var8) {
				if (this.faceColors3[var8] == -2) {
					field2896[var8] = true;
				} else {
					int var9 = this.indices1[var8];
					int var10 = this.indices2[var8];
					int var11 = this.indices3[var8];
					float var12 = modelViewportXs[var9];
					float var13 = modelViewportXs[var10];
					float var14 = modelViewportXs[var11];
					field2882[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
					if (field2882[var8]) {
						int var15 = field2888[var9];
						int var16 = field2888[var10];
						int var17 = field2888[var11];
						int var18 = field2889[var9];
						int var19 = field2889[var10];
						int var20 = field2889[var11];
						int var21 = field2890[var9];
						int var22 = field2890[var10];
						int var23 = field2890[var11];
						var15 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						var21 -= var22;
						var23 -= var22;
						int var24 = var18 * var23 - var21 * var20;
						int var25 = var21 * var17 - var15 * var23;
						int var26 = var15 * var20 - var18 * var17;
						field2896[var8] = (float)(var16 * var24 + var19 * var25 + var22 * var26) <= 0.0F;
					} else {
						field2896[var8] = (var12 - var13) * (modelViewportYs[var11] - modelViewportYs[var10]) - (modelViewportYs[var9] - modelViewportYs[var10]) * (var14 - var13) <= 0.0F;
						field2881[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > (float)var7 || var13 > (float)var7 || var14 > (float)var7;
						if (var2 && class489.method9812((int)modelViewportYs[var9], (int)modelViewportYs[var10], (int)modelViewportYs[var11], (int)var12, (int)var13, (int)var14, var6)) {
							GrandExchangeOfferWorldComparator.method8499(var4);
							var2 = false;
						}
					}
				}
			}

			short var31 = this.field2952;
			boolean var32 = false;
			if (Rasterizer3D.clips.field3001.method5651()) {
				this.field2952 = (short)this.indicesCount;
			} else if (this.modelColorOverride != null && this.modelColorOverride.method5651()) {
				Rasterizer3D.clips.field3001.method5648(this.modelColorOverride);
				var32 = true;
			}

			try {
				if (!Rasterizer3D.method4940()) {
					this.method5586();
				} else {
					class224 var28 = this.field2951;
					if (var28 == class224.field2627) {
						var28 = this.faceAlphas == null ? class224.field2628 : class224.field2626;
					}

					switch(var28.field2629) {
					case 1:
						Rasterizer3D.clips.field3016 = -1;
						Rasterizer3D.clips.field3019 = -1;
						this.method5586();
						break;
					case 2:
						Rasterizer3D.clips.field3016 = -1;
						Rasterizer3D.clips.field3019 = 0;
						this.method5586();
						Rasterizer3D.clips.field3016 = 0;
						Rasterizer3D.clips.field3019 = -1;
						this.method5586();
						Rasterizer3D.clips.field3016 = -1;
						Rasterizer3D.clips.field3019 = -1;
						break;
					case 3:
						Rasterizer3D.clips.field3016 = -1;
						Rasterizer3D.clips.field3019 = -1;
						this.method5452();
					}
				}
			} finally {
				this.field2952 = var31;
				if (var32) {
					Rasterizer3D.clips.field3001.method5650();
				}

			}

		}
	}

	@ObfuscatedName("by")
	void method5452() {
		for (int var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2896[var1]) {
				this.drawFace(var1);
			}
		}

	}

	@ObfuscatedName("bg")
	void method5586() {
		for (char var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2896[var1]) {
				int var2 = (field2922[this.indices1[var1]] + field2922[this.indices2[var1]] + field2922[this.indices3[var1]]) / 3 + this.radius;
				field2892[var2][field2884[var2]++] = var1;
			}
		}

		if (this.faceRenderPriorities == null) {
			for (int var5 = this.diameter - 1; var5 >= 0; --var5) {
				char var6 = field2884[var5];
				if (var6 > 0) {
					char[] var3 = field2892[var5];

					for (int var4 = 0; var4 < var6; ++var4) {
						this.drawFace(var3[var4]);
					}
				}
			}
		} else {
			this.method5484();
		}

	}

	@ObfuscatedName("bx")
	void method5484() {
		int var1;
		for (var1 = 0; var1 < 12; ++var1) {
			field2893[var1] = 0;
			field2897[var1] = 0;
		}

		int var4;
		for (var1 = this.diameter - 1; var1 >= 0; --var1) {
			char var2 = field2884[var1];
			if (var2 > 0) {
				char[] var13 = field2892[var1];

				for (var4 = 0; var4 < var2; ++var4) {
					char var5 = var13[var4];
					byte var6 = this.faceRenderPriorities[var5];
					int var14 = field2893[var6]++;
					field2894[var6][var14] = var5;
					if (var6 < 10) {
						int[] var10000 = field2897;
						var10000[var6] += var1;
					} else if (var6 == 10) {
						field2895[var14] = var1;
					} else {
						field2899[var14] = var1;
					}
				}
			}
		}

		var1 = 0;
		if (field2893[1] > 0 || field2893[2] > 0) {
			var1 = (field2897[1] + field2897[2]) / (field2893[1] + field2893[2]);
		}

		int var15 = 0;
		if (field2893[3] > 0 || field2893[4] > 0) {
			var15 = (field2897[3] + field2897[4]) / (field2893[3] + field2893[4]);
		}

		int var3 = 0;
		if (field2893[6] > 0 || field2893[8] > 0) {
			var3 = (field2897[8] + field2897[6]) / (field2893[8] + field2893[6]);
		}

		int var16 = 0;
		int var17 = field2893[10];
		int[] var7 = field2894[10];
		int[] var8 = field2895;
		if (var16 == var17) {
			var16 = 0;
			var17 = field2893[11];
			var7 = field2894[11];
			var8 = field2899;
		}

		if (var16 < var17) {
			var4 = var8[var16];
		} else {
			var4 = -1000;
		}

		for (int var9 = 0; var9 < 10; ++var9) {
			while (var9 == 0 && var4 > var1) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2894[11]) {
					var16 = 0;
					var17 = field2893[11];
					var7 = field2894[11];
					var8 = field2899;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 3 && var4 > var15) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2894[11]) {
					var16 = 0;
					var17 = field2893[11];
					var7 = field2894[11];
					var8 = field2899;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 5 && var4 > var3) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2894[11]) {
					var16 = 0;
					var17 = field2893[11];
					var7 = field2894[11];
					var8 = field2899;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			int var10 = field2893[var9];
			int[] var11 = field2894[var9];

			for (int var12 = 0; var12 < var10; ++var12) {
				this.drawFace(var11[var12]);
			}
		}

		while (var4 != -1000) {
			this.drawFace(var7[var16++]);
			if (var16 == var17 && var7 != field2894[11]) {
				var16 = 0;
				var7 = field2894[11];
				var17 = field2893[11];
				var8 = field2899;
			}

			if (var16 < var17) {
				var4 = var8[var16];
			} else {
				var4 = -1000;
			}
		}

	}

	@ObfuscatedName("bq")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2882[var1]) {
			this.method5466(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2881[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
			float var6 = class145.method3742(field2886[var2] - (float)var5);
			float var7 = class145.method3742(field2886[var3] - (float)var5);
			float var8 = class145.method3742(field2886[var4] - (float)var5);
			this.method5487(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], var6, var7, var8, this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bz")
	boolean method5486(int var1) {
		return var1 < this.field2952;
	}

	@ObfuscatedName("bn")
	final void method5487(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2888[var18], field2888[var15], field2888[var16], field2889[var18], field2889[var15], field2889[var16], field2890[var18], field2890[var15], field2890[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2888[var18], field2888[var15], field2888[var16], field2889[var18], field2889[var15], field2889[var16], field2890[var18], field2890[var15], field2890[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5486(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2949[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2949[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("be")
	final void method5466(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2890[var5];
		int var9 = field2890[var6];
		int var10 = field2890[var7];
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
			field2911[var4] = (int)modelViewportXs[var5];
			field2931[var4] = (int)modelViewportYs[var5];
			field2914[var4] = field2886[var5];
			field2913[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2888[var5];
			var12 = field2889[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2902[var10 - var8] * (50 - var8);
				field2911[var4] = var2 + (var11 + ((field2888[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2902[var9 - var8] * (50 - var8);
				field2911[var4] = var2 + (var11 + ((field2888[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2911[var4] = (int)modelViewportXs[var6];
			field2931[var4] = (int)modelViewportYs[var6];
			field2914[var4] = field2886[var6];
			field2913[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2888[var6];
			var12 = field2889[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2902[var8 - var9] * (50 - var9);
				field2911[var4] = var2 + (var11 + ((field2888[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2902[var10 - var9] * (50 - var9);
				field2911[var4] = var2 + (var11 + ((field2888[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2911[var4] = (int)modelViewportXs[var7];
			field2931[var4] = (int)modelViewportYs[var7];
			field2914[var4] = field2886[var7];
			field2913[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2888[var7];
			var12 = field2889[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2902[var9 - var10] * (50 - var10);
				field2911[var4] = var2 + (var11 + ((field2888[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2902[var8 - var10] * (50 - var10);
				field2911[var4] = var2 + (var11 + ((field2888[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4] = var3 + (var12 + ((field2889[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2914[var4] = 50.0F;
				field2913[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2911[0];
		var12 = field2911[1];
		var13 = field2911[2];
		var14 = field2931[0];
		int var15 = field2931[1];
		int var16 = field2931[2];
		int var17 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
		float var18 = class145.method3742(field2914[0] - (float)var17);
		float var19 = class145.method3742(field2914[1] - (float)var17);
		float var20 = class145.method3742(field2914[2] - (float)var17);
		Rasterizer3D.clips.clipping = false;
		int var21 = Rasterizer3D.method4939();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5487(var1, (float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2913[0], field2913[1], field2913[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21 || field2911[3] < 0 || field2911[3] > var21) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2888[var26], field2888[var23], field2888[var24], field2889[var26], field2889[var23], field2889[var24], field2890[var26], field2890[var23], field2890[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2888[var26], field2888[var23], field2888[var24], field2889[var26], field2889[var23], field2889[var24], field2890[var26], field2890[var23], field2890[var24], var27);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2913[0], field2913[1], field2913[2], field2888[var26], field2888[var23], field2888[var24], field2889[var26], field2889[var23], field2889[var24], field2890[var26], field2890[var23], field2890[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], field2913[0], field2913[2], field2913[3], field2888[var26], field2888[var23], field2888[var24], field2889[var26], field2889[var23], field2889[var24], field2890[var26], field2890[var23], field2890[var24], var27);
				}
			} else {
				boolean var22 = this.method5486(var1);
				if (this.faceColors3[var1] == -1 && var22) {
					var23 = field2949[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterTriangle((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], var23);
				} else if (this.faceColors3[var1] == -1) {
					var23 = field2949[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterFlat((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], var23);
				} else if (var22) {
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2913[0], field2913[1], field2913[2]);
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], field2913[0], field2913[2], field2913[3]);
				} else {
					Rasterizer3D.rasterGouraud((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2913[0], field2913[1], field2913[2]);
					Rasterizer3D.rasterGouraud((float)var14, (float)var16, (float)field2931[3], (float)var11, (float)var13, (float)field2911[3], var18, var20, field2914[3], field2913[0], field2913[2], field2913[3]);
				}
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILrj;)V"
	)
	void method5489(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field5186[0] * var3 + var2.field5186[4] * var4 + var2.field5186[8] * var5 + var2.field5186[12] * var6);
		this.verticesY[var1] = -((int)(var2.field5186[1] * var3 + var2.field5186[5] * var4 + var2.field5186[9] * var5 + var2.field5186[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field5186[2] * var3 + var2.field5186[6] * var4 + var2.field5186[10] * var5 + var2.field5186[14] * var6));
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lig;I)V"
	)
	void method5567(class227 var1, int var2) {
		if (this.field2939 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2939[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2938[var3];
					field2940.method9091();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class135 var8 = var1.method5027(var7);
						if (var8 != null) {
							field2883.method9093((float)var5[var6] / 255.0F);
							field2912.method9092(var8.method3624(var2));
							field2912.method9173(field2883);
							field2940.method9095(field2912);
						}
					}

					this.method5489(var3, field2940);
				}
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljz;S)V"
	)
	public void method5491(ModelColorOverride var1, short var2) {
		if (this.modelColorOverride == null) {
			this.modelColorOverride = new ModelColorOverride();
		}

		this.modelColorOverride.method5648(var1);
		this.field2952 = var2;
	}

	@ObfuscatedName("br")
	public void method5599() {
		this.modelColorOverride = null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lid;)V"
	)
	void method5493(class224 var1) {
		this.field2951 = var1;
	}

	@ObfuscatedName("fr")
	void vmethod5531(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.method5479(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ILrj;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class448 var8 = new class448();
		var8.field5155.method9072((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field5156.method8993(1.0F, 1.0F, 1.0F);
		var8.field5154.method8993((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class401.method8245();
		var9.method9097(var8);
		var9.method9173(var2);
		int var10 = (int)var9.method9103(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		boolean var15 = 0L != var6;
		boolean var16;
		if (var15) {
			var16 = (int)(var6 >>> 19 & 1L) == 1;
			var15 = !var16;
		}

		var16 = false;
		if (var15) {
			boolean var17 = ViewportMouse.ViewportMouse_isInViewport;
			if (var17) {
				boolean var18 = class305.method6837(this, var1, var3, var4, var5, var2, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
				if (var18) {
					if (this.isSingleTile) {
						GrandExchangeOfferWorldComparator.method8499(var6);
					} else {
						var16 = true;
					}
				}
			}
		}

		int var25 = Rasterizer3D.getClipMidX();
		int var26 = Rasterizer3D.getClipMidY();

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			float var20 = (float)this.verticesX[var19];
			float var21 = (float)this.verticesY[var19];
			float var22 = (float)this.verticesZ[var19];
			var9.transformPoint(var20, var21, var22, field2903);
			var20 = field2903[0];
			var21 = field2903[1];
			var22 = field2903[2];
			var11 |= this.method5481(var19, var20, var21, var22, var10, var25, var26, var13);
		}

		var8.method8931();
		var9.method9140();

		try {
			this.draw0(var11, var16, this.isSingleTile, var6);
		} catch (Exception var24) {
		}

	}
}
