import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ae")
	static boolean[] field2875;
	@ObfuscatedName("aq")
	static boolean[] field2923;
	@ObfuscatedName("ac")
	static boolean[] field2907;
	@ObfuscatedName("aa")
	@Export("modelViewportXs")
	static float[] modelViewportXs;
	@ObfuscatedName("ap")
	@Export("modelViewportYs")
	static float[] modelViewportYs;
	@ObfuscatedName("ad")
	static float[] field2880;
	@ObfuscatedName("av")
	static int[] field2915;
	@ObfuscatedName("as")
	static int[] field2882;
	@ObfuscatedName("ar")
	static int[] field2883;
	@ObfuscatedName("az")
	static int[] field2939;
	@ObfuscatedName("au")
	static char[] field2885;
	@ObfuscatedName("ak")
	static char[][] field2881;
	@ObfuscatedName("ao")
	static int[] field2887;
	@ObfuscatedName("ax")
	static int[][] field2888;
	@ObfuscatedName("an")
	static int[] field2932;
	@ObfuscatedName("aw")
	static int[] field2890;
	@ObfuscatedName("ai")
	static int[] field2891;
	@ObfuscatedName("am")
	static boolean field2892;
	@ObfuscatedName("al")
	static int[] field2893;
	@ObfuscatedName("ay")
	static int[] field2913;
	@ObfuscatedName("be")
	static int[] field2895;
	@ObfuscatedName("ba")
	static int[] field2896;
	@ObfuscatedName("bj")
	static float[] field2897;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bn")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("bm")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2869;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2903;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2877;
	@ObfuscatedName("bq")
	static int[] field2905;
	@ObfuscatedName("bo")
	static int[] field2884;
	@ObfuscatedName("bx")
	static int[] field2930;
	@ObfuscatedName("bp")
	static float[] field2924;
	@ObfuscatedName("bz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bh")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bc")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bv")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bi")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("bw")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("br")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bf")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("bl")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("bd")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("bt")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bk")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ca")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("cy")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cj")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ce")
	@Export("faceAlphas")
	public byte[] faceAlphas;
	@ObfuscatedName("cl")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ci")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("cq")
	@Export("faceBias")
	byte[] faceBias;
	@ObfuscatedName("cp")
	public byte field2928;
	@ObfuscatedName("cw")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("cn")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ck")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cx")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("cb")
	int[][] field2933;
	@ObfuscatedName("ct")
	int[][] field2872;
	@ObfuscatedName("cf")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ch")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("cs")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cu")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("cz")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cv")
	@Export("radius")
	int radius;
	@ObfuscatedName("cr")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("cc")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("modelColorOverride")
	ModelColorOverride modelColorOverride;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class223 field2945;
	@ObfuscatedName("cg")
	short field2946;

	static {
		field2875 = new boolean[6500];
		field2923 = new boolean[6500];
		field2907 = new boolean[6500];
		modelViewportXs = new float[6500];
		modelViewportYs = new float[6500];
		field2880 = new float[6500];
		field2915 = new int[6500];
		field2882 = new int[6500];
		field2883 = new int[6500];
		field2939 = new int[6500];
		field2885 = new char[6000];
		field2881 = new char[6000][512];
		field2887 = new int[12];
		field2888 = new int[12][2500];
		field2932 = new int[2500];
		field2890 = new int[2500];
		field2891 = new int[12];
		field2892 = true;
		field2893 = Rasterizer3D.Rasterizer3D_sine;
		field2913 = Rasterizer3D.Rasterizer3D_cosine;
		field2895 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2896 = Rasterizer3D.field2633;
		field2897 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2869 = new TransformationMatrix();
		field2903 = new TransformationMatrix();
		field2877 = new TransformationMatrix();
		field2905 = new int[10];
		field2884 = new int[10];
		field2930 = new int[10];
		field2924 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2928 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2945 = class223.field2627;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2928 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2945 = class223.field2627;
		this.method5524(var1, var2, var3);
		this.field2928 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2928 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2945 = class223.field2627;
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
		this.field2928 = var1.field2928;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljd;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2928 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.modelColorOverride = null;
		this.field2945 = class223.field2627;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2928 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2928 == -1) {
					this.field2928 = var4.field2928;
				}
			}
		}

		this.method5524(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5526(var1[var3]);
		}

	}

	@ObfuscatedName("ab")
	void method5524(int var1, int var2, int var3) {
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
		descriptor = "(Ljd;)V"
	)
	void method5528(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2928 != var1.field2928)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2928);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	public void method5526(Model var1) {
		if (var1 != null) {
			this.method5528(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2928;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljd;"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZLjd;[B)Ljd;"
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
		var2.field2928 = this.field2928;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2933 = this.field2933;
		var2.field2872 = this.field2872;
		var2.isSingleTile = this.isSingleTile;
		var2.modelColorOverride = this.modelColorOverride;
		var2.field2946 = this.field2946;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("az")
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
			int var9 = field2913[var1];
			int var10 = field2893[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var13 = this.verticesX[var11];
				int var14 = this.verticesZ[var11];
				int var12 = var10 * var14 + var13 * var9 >> 16;
				int var16 = this.verticesY[var11];
				int var18 = this.verticesX[var11];
				int var19 = this.verticesZ[var11];
				int var17 = var9 * var19 - var10 * var18 >> 16;
				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}

				if (var17 < var5) {
					var5 = var17;
				}

				if (var17 > var8) {
					var8 = var17;
				}
			}

			var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
			boolean var21 = true;
			if (var2.xMidOffset < 32) {
				var2.xMidOffset = 32;
			}

			if (var2.zMidOffset < 32) {
				var2.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var22 = true;
				var2.xMidOffset += 8;
				var2.zMidOffset += 8;
			}

			var2.aabb = this.aabb;
			this.aabb = var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Liu;"
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

	@ObfuscatedName("ak")
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

	@ObfuscatedName("ao")
	void method5534() {
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

	@ObfuscatedName("ax")
	public int method5535() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("an")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)V"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	public void method5618(class145 var1, int var2) {
		Skeleton var3 = var1.field1731;
		class226 var4 = var3.method5147();
		if (var4 != null) {
			var3.method5147().method5103(var1, var2);
			this.method5540(var3.method5147(), var1.method3862());
		}

		if (var1.method3839()) {
			this.method5595(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	void method5595(class145 var1, int var2) {
		Skeleton var3 = var1.field1731;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1729 != null && var1.field1729[var4] != null && var1.field1729[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class137 var6 = var1.field1729[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3760(var2) * 255.0F);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V"
	)
	void method5540(class226 var1, int var2) {
		this.method5566(var1, var2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILjn;I[I)V"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lip;Lfz;I[ZZZ)V"
	)
	public void method5542(Skeleton var1, class145 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class226 var7 = var1.method5147();
		if (var7 != null) {
			var7.method5093(var2, var3, var4, var5);
			if (var6) {
				this.method5540(var7, var2.method3862());
			}
		}

		if (!var5 && var2.method3839()) {
			this.method5595(var2, var3);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I[IZ)V"
	)
	public void method5543(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("bb")
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
								var15 = field2893[var14];
								var16 = field2913[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2893[var12];
								var16 = field2913[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2893[var13];
								var16 = field2913[var13];
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

	@ObfuscatedName("bn")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("by")
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

	@ObfuscatedName("bg")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2893[var1];
		int var3 = field2913[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	public void method5549(class451 var1) {
		class450 var2 = class147.method3882();

		for (int var3 = 0; var3 < this.verticesCount; ++var3) {
			var2.method9066((float)this.verticesX[var3], (float)this.verticesY[var3], (float)this.verticesZ[var3]);
			var2.method9110(var1);
			this.verticesX[var3] = (int)var2.field5216;
			this.verticesY[var3] = (int)var2.field5218;
			this.verticesZ[var3] = (int)var2.field5219;
		}

		var2.method9065();
		this.resetBounds();
	}

	@ObfuscatedName("bs")
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

	@ObfuscatedName("bq")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5534();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2893[var1];
		int var11 = field2913[var1];
		int var12 = field2893[var2];
		int var13 = field2913[var2];
		int var14 = field2893[var3];
		int var15 = field2913[var3];
		int var16 = field2893[var4];
		int var17 = field2913[var4];
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
			field2915[var19] = var22 - var18;
			modelViewportXs[var19] = (float)(var8 + var20 * Rasterizer3D.get3dZoom() / var22);
			modelViewportYs[var19] = (float)(var9 + var23 * Rasterizer3D.get3dZoom() / var22);
			field2880[var19] = (float)var22;
			if (this.faceTextures != null) {
				field2882[var19] = var20;
				field2883[var19] = var23;
				field2939[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bx")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method5534();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2893[var1];
		int var12 = field2913[var1];
		int var13 = field2893[var2];
		int var14 = field2913[var2];
		int var15 = field2893[var3];
		int var16 = field2913[var3];
		int var17 = field2893[var4];
		int var18 = field2913[var4];
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
			field2915[var20] = var23 - var19;
			modelViewportXs[var20] = (float)(var9 + var21 * Rasterizer3D.get3dZoom() / var8);
			modelViewportYs[var20] = (float)(var10 + var24 * Rasterizer3D.get3dZoom() / var8);
			field2880[var20] = (float)var8;
			if (this.faceTextures != null) {
				field2882[var20] = var21;
				field2883[var20] = var24;
				field2939[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bp")
	void method5555(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		if (Rasterizer3D.clips.field2999 != 1 || this.faceAlphas != null) {
			int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
			float var13 = Rasterizer3D.field2636[var2];
			float var14 = Rasterizer3D.field2632[var2];
			float var15 = Rasterizer3D.field2636[var3];
			float var16 = Rasterizer3D.field2632[var3];
			if (this.boundsType != 1) {
				this.calculateBoundsCylinder();
			}

			this.calculateBoundingBox(var1);
			int var17 = var12 * var6 - var11 * var4 >> 16;
			int var18 = var17 * var10 + var5 * var9 >> 16;
			int var19 = var10 * this.xzRadius >> 16;
			int var20 = var18 + var19;
			if (var20 > 50 && var18 < AbstractRasterizer.method5112()) {
				int var21 = var11 * var6 + var12 * var4 >> 16;
				int var22 = (var21 - this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
					int var23 = (var21 + this.xzRadius) * Rasterizer3D.get3dZoom();
					if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
						int var24 = var5 * var10 - var17 * var9 >> 16;
						int var25 = var9 * this.xzRadius >> 16;
						int var26 = var25 + (var10 * this.bottomY >> 16);
						int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
						if (var27 / var20 > Rasterizer3D.method5060()) {
							int var28 = var25 + (var10 * super.height >> 16);
							int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
							if (var29 / var20 < Rasterizer3D.method4998()) {
								int var30 = var19 + (var9 * super.height >> 16);
								boolean var31 = false;
								boolean var32 = false;
								if (var18 - var30 <= 50) {
									var32 = true;
								}

								boolean var33 = var32 || this.faceTextures != null;
								int var34 = ViewportMouse.ViewportMouse_x;
								int var36 = ViewportMouse.ViewportMouse_y;
								boolean var38 = ViewportMouse.ViewportMouse_isInViewport;
								boolean var40 = LoginState.method798(var7);
								boolean var41 = false;
								int var43;
								if (var40 && var38) {
									boolean var42 = false;
									int var44;
									if (field2892) {
										var42 = class427.method8691(this, var1, var4, var5, var6, var13, var14, var15, var16, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
									} else {
										var43 = var18 - var19;
										if (var43 <= 50) {
											var43 = 50;
										}

										if (var21 > 0) {
											var22 /= var20;
											var23 /= var43;
										} else {
											var23 /= var20;
											var22 /= var43;
										}

										if (var24 > 0) {
											var29 /= var20;
											var27 /= var43;
										} else {
											var27 /= var20;
											var29 /= var43;
										}

										var44 = var34 - Rasterizer3D.getClipMidX();
										int var45 = var36 - Rasterizer3D.getClipMidY();
										if (var44 > var22 && var44 < var23 && var45 > var29 && var45 < var27) {
											var42 = true;
										}
									}

									if (var42) {
										if (this.isSingleTile) {
											AABB var51 = this.getAABB(var1);
											var44 = var6 - var51.zMidOffset;
											FloorUnderlayDefinition.method4509(var7, var44);
										} else {
											var41 = true;
										}
									}
								}

								int var54 = Rasterizer3D.getClipMidX();
								var43 = Rasterizer3D.getClipMidY();
								float var55 = 0.0F;
								float var56 = 0.0F;
								if (var1 != 0) {
									var55 = Rasterizer3D.field2636[var1];
									var56 = Rasterizer3D.field2632[var1];
								}

								for (int var46 = 0; var46 < this.verticesCount; ++var46) {
									float var47 = (float)this.verticesX[var46];
									float var48 = (float)this.verticesY[var46];
									float var49 = (float)this.verticesZ[var46];
									float var50;
									if (var1 != 0) {
										var50 = var49 * var55 + var47 * var56;
										var49 = var49 * var56 - var47 * var55;
										var47 = var50;
									}

									var47 += (float)var4;
									var48 += (float)var5;
									var49 += (float)var6;
									var50 = var49 * var15 + var47 * var16;
									var49 = var49 * var16 - var47 * var15;
									var47 = var50;
									var50 = var48 * var14 - var49 * var13;
									var49 = var48 * var13 + var49 * var14;
									var31 |= this.method5557(var46, var47, var50, var49, var18, var54, var43, var33);
								}

								try {
									this.draw0(var31, var41, this.isSingleTile, var7);
								} catch (Exception var53) {
								}

							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	boolean method5557(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		field2915[var1] = (int)var4 - var5;
		if (var8) {
			field2882[var1] = (int)var2;
			field2883[var1] = (int)var3;
			field2939[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			modelViewportXs[var1] = (float)var6 + var2 * (float)Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = (float)var7 + var3 * (float)Rasterizer3D.get3dZoom() / var4;
			field2880[var1] = var4;
			return false;
		} else {
			modelViewportXs[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("bh")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2885[var6] = 0;
			}

			var6 = var3 ? 20 : 5;
			int var7 = Rasterizer3D.method5026();

			for (int var8 = 0; var8 < this.indicesCount; ++var8) {
				if (this.faceColors3[var8] == -2) {
					field2907[var8] = true;
				} else {
					if (this.field2945 != class223.field2626) {
						if (Rasterizer3D.clips.field2999 == 1 && (this.faceAlphas == null || this.faceAlphas[var8] == 0)) {
							field2907[var8] = true;
							continue;
						}

						if (Rasterizer3D.clips.field2999 == 0 && this.faceAlphas != null && this.faceAlphas[var8] != 0) {
							field2907[var8] = true;
							continue;
						}
					}

					int var9 = this.indices1[var8];
					int var10 = this.indices2[var8];
					int var11 = this.indices3[var8];
					float var12 = modelViewportXs[var9];
					float var13 = modelViewportXs[var10];
					float var14 = modelViewportXs[var11];
					field2923[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
					int var15;
					if (field2923[var8]) {
						var15 = field2882[var9];
						int var16 = field2882[var10];
						int var17 = field2882[var11];
						int var18 = field2883[var9];
						int var19 = field2883[var10];
						int var20 = field2883[var11];
						int var21 = field2939[var9];
						int var22 = field2939[var10];
						int var23 = field2939[var11];
						var15 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						var21 -= var22;
						var23 -= var22;
						int var24 = var18 * var23 - var21 * var20;
						int var25 = var21 * var17 - var15 * var23;
						int var26 = var15 * var20 - var18 * var17;
						field2907[var8] = (float)(var16 * var24 + var19 * var25 + var22 * var26) <= 0.0F;
					} else {
						field2907[var8] = (var12 - var13) * (modelViewportYs[var11] - modelViewportYs[var10]) - (modelViewportYs[var9] - modelViewportYs[var10]) * (var14 - var13) <= 0.0F;
						field2875[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > (float)var7 || var13 > (float)var7 || var14 > (float)var7;
						if (var2 && AttackOption.method2883((int)modelViewportYs[var9], (int)modelViewportYs[var10], (int)modelViewportYs[var11], (int)var12, (int)var13, (int)var14, var6)) {
							var15 = (int)(field2880[var9] + field2880[var10] + field2880[var11]) / 3;
							FloorUnderlayDefinition.method4509(var4, var15);
						}
					}
				}
			}

			short var31 = this.field2946;
			boolean var32 = false;
			if (Rasterizer3D.clips.field3001.method5733()) {
				this.field2946 = (short)this.indicesCount;
			} else if (this.modelColorOverride != null && this.modelColorOverride.method5733()) {
				Rasterizer3D.clips.field3001.method5737(this.modelColorOverride);
				var32 = true;
			}

			try {
				if (!Rasterizer3D.method5002()) {
					this.method5628();
				} else {
					class223 var28 = this.field2945;
					if (var28 == class223.field2627) {
						if (Rasterizer3D.clips.field2999 != 0 && this.faceAlphas != null) {
							var28 = class223.field2625;
						} else {
							var28 = class223.field2624;
						}
					}

					switch(var28.field2628) {
					case 1:
						Rasterizer3D.clips.field3018 = -1;
						Rasterizer3D.clips.field3016 = -1;
						this.method5628();
						break;
					case 2:
						Rasterizer3D.clips.field3018 = -1;
						Rasterizer3D.clips.field3016 = 0;
						this.method5628();
						Rasterizer3D.clips.field3018 = 0;
						Rasterizer3D.clips.field3016 = -1;
						this.method5628();
						Rasterizer3D.clips.field3018 = -1;
						Rasterizer3D.clips.field3016 = -1;
						break;
					case 3:
						Rasterizer3D.clips.field3018 = -1;
						Rasterizer3D.clips.field3016 = -1;
						this.method5523();
					}
				}
			} finally {
				this.field2946 = var31;
				if (var32) {
					Rasterizer3D.clips.field3001.method5728();
				}

			}

		}
	}

	@ObfuscatedName("bc")
	void method5523() {
		for (int var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2907[var1]) {
				this.drawFace(var1);
			}
		}

	}

	@ObfuscatedName("bv")
	void method5628() {
		for (char var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2907[var1]) {
				int var2 = (field2915[this.indices1[var1]] + field2915[this.indices2[var1]] + field2915[this.indices3[var1]]) / 3 + this.radius;
				field2881[var2][field2885[var2]++] = var1;
			}
		}

		if (this.faceRenderPriorities == null) {
			for (int var5 = this.diameter - 1; var5 >= 0; --var5) {
				char var6 = field2885[var5];
				if (var6 > 0) {
					char[] var3 = field2881[var5];

					for (int var4 = 0; var4 < var6; ++var4) {
						this.drawFace(var3[var4]);
					}
				}
			}
		} else {
			this.method5615();
		}

	}

	@ObfuscatedName("bi")
	void method5615() {
		int var1;
		for (var1 = 0; var1 < 12; ++var1) {
			field2887[var1] = 0;
			field2891[var1] = 0;
		}

		int var4;
		for (var1 = this.diameter - 1; var1 >= 0; --var1) {
			char var2 = field2885[var1];
			if (var2 > 0) {
				char[] var13 = field2881[var1];

				for (var4 = 0; var4 < var2; ++var4) {
					char var5 = var13[var4];
					byte var6 = this.faceRenderPriorities[var5];
					int var14 = field2887[var6]++;
					field2888[var6][var14] = var5;
					if (var6 < 10) {
						int[] var10000 = field2891;
						var10000[var6] += var1;
					} else if (var6 == 10) {
						field2932[var14] = var1;
					} else {
						field2890[var14] = var1;
					}
				}
			}
		}

		var1 = 0;
		if (field2887[1] > 0 || field2887[2] > 0) {
			var1 = (field2891[1] + field2891[2]) / (field2887[1] + field2887[2]);
		}

		int var15 = 0;
		if (field2887[3] > 0 || field2887[4] > 0) {
			var15 = (field2891[3] + field2891[4]) / (field2887[3] + field2887[4]);
		}

		int var3 = 0;
		if (field2887[6] > 0 || field2887[8] > 0) {
			var3 = (field2891[8] + field2891[6]) / (field2887[8] + field2887[6]);
		}

		int var16 = 0;
		int var17 = field2887[10];
		int[] var7 = field2888[10];
		int[] var8 = field2932;
		if (var16 == var17) {
			var16 = 0;
			var17 = field2887[11];
			var7 = field2888[11];
			var8 = field2890;
		}

		if (var16 < var17) {
			var4 = var8[var16];
		} else {
			var4 = -1000;
		}

		for (int var9 = 0; var9 < 10; ++var9) {
			while (var9 == 0 && var4 > var1) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2888[11]) {
					var16 = 0;
					var17 = field2887[11];
					var7 = field2888[11];
					var8 = field2890;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 3 && var4 > var15) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2888[11]) {
					var16 = 0;
					var17 = field2887[11];
					var7 = field2888[11];
					var8 = field2890;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 5 && var4 > var3) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2888[11]) {
					var16 = 0;
					var17 = field2887[11];
					var7 = field2888[11];
					var8 = field2890;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			int var10 = field2887[var9];
			int[] var11 = field2888[var9];

			for (int var12 = 0; var12 < var10; ++var12) {
				this.drawFace(var11[var12]);
			}
		}

		while (var4 != -1000) {
			this.drawFace(var7[var16++]);
			if (var16 == var17 && var7 != field2888[11]) {
				var16 = 0;
				var7 = field2888[11];
				var17 = field2887[11];
				var8 = field2890;
			}

			if (var16 < var17) {
				var4 = var8[var16];
			} else {
				var4 = -1000;
			}
		}

	}

	@ObfuscatedName("bw")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.currentFaceAlpha = 0;
		} else {
			Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
		}

		if (Rasterizer3D.clips.field2999 != 1 || Rasterizer3D.clips.currentFaceAlpha != 0) {
			if (Rasterizer3D.clips.field2999 != 0 || Rasterizer3D.clips.currentFaceAlpha == 0) {
				if (field2923[var1]) {
					this.method5529(var1);
				} else {
					int var2 = this.indices1[var1];
					int var3 = this.indices2[var1];
					int var4 = this.indices3[var1];
					Rasterizer3D.clips.clipping = field2875[var1];
					int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
					float var6 = MouseHandler.method724(field2880[var2] - (float)var5);
					float var7 = MouseHandler.method724(field2880[var3] - (float)var5);
					float var8 = MouseHandler.method724(field2880[var4] - (float)var5);
					this.method5637(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], var6, var7, var8, this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
				}
			}
		}
	}

	@ObfuscatedName("br")
	boolean method5597(int var1) {
		return var1 < this.field2946;
	}

	@ObfuscatedName("bf")
	final void method5637(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2882[var18], field2882[var15], field2882[var16], field2883[var18], field2883[var15], field2883[var16], field2939[var18], field2939[var15], field2939[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2882[var18], field2882[var15], field2882[var16], field2883[var18], field2883[var15], field2883[var16], field2939[var18], field2939[var15], field2939[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5597(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2895[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2895[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bl")
	final void method5529(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2939[var5];
		int var9 = field2939[var6];
		int var10 = field2939[var7];
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
			field2905[var4] = (int)modelViewportXs[var5];
			field2884[var4] = (int)modelViewportYs[var5];
			field2924[var4] = field2880[var5];
			field2930[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2882[var5];
			var12 = field2883[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2896[var10 - var8] * (50 - var8);
				field2905[var4] = var2 + (var11 + ((field2882[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2896[var9 - var8] * (50 - var8);
				field2905[var4] = var2 + (var11 + ((field2882[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2905[var4] = (int)modelViewportXs[var6];
			field2884[var4] = (int)modelViewportYs[var6];
			field2924[var4] = field2880[var6];
			field2930[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2882[var6];
			var12 = field2883[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2896[var8 - var9] * (50 - var9);
				field2905[var4] = var2 + (var11 + ((field2882[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2896[var10 - var9] * (50 - var9);
				field2905[var4] = var2 + (var11 + ((field2882[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2905[var4] = (int)modelViewportXs[var7];
			field2884[var4] = (int)modelViewportYs[var7];
			field2924[var4] = field2880[var7];
			field2930[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2882[var7];
			var12 = field2883[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2896[var9 - var10] * (50 - var10);
				field2905[var4] = var2 + (var11 + ((field2882[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2896[var8 - var10] * (50 - var10);
				field2905[var4] = var2 + (var11 + ((field2882[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2884[var4] = var3 + (var12 + ((field2883[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4] = 50.0F;
				field2930[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2905[0];
		var12 = field2905[1];
		var13 = field2905[2];
		var14 = field2884[0];
		int var15 = field2884[1];
		int var16 = field2884[2];
		int var17 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
		float var18 = MouseHandler.method724(field2924[0] - (float)var17);
		float var19 = MouseHandler.method724(field2924[1] - (float)var17);
		float var20 = MouseHandler.method724(field2924[2] - (float)var17);
		Rasterizer3D.clips.clipping = false;
		int var21 = Rasterizer3D.method5026();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5637(var1, (float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2930[0], field2930[1], field2930[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21 || field2905[3] < 0 || field2905[3] > var21) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2882[var26], field2882[var23], field2882[var24], field2883[var26], field2883[var23], field2883[var24], field2939[var26], field2939[var23], field2939[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2882[var26], field2882[var23], field2882[var24], field2883[var26], field2883[var23], field2883[var24], field2939[var26], field2939[var23], field2939[var24], var27);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2930[0], field2930[1], field2930[2], field2882[var26], field2882[var23], field2882[var24], field2883[var26], field2883[var23], field2883[var24], field2939[var26], field2939[var23], field2939[var24], var27);
					Rasterizer3D.rasterTextureWithShadingAndLighting((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], field2930[0], field2930[2], field2930[3], field2882[var26], field2882[var23], field2882[var24], field2883[var26], field2883[var23], field2883[var24], field2939[var26], field2939[var23], field2939[var24], var27);
				}
			} else {
				boolean var22 = this.method5597(var1);
				if (this.faceColors3[var1] == -1 && var22) {
					var23 = field2895[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterTriangle((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], var23);
				} else if (this.faceColors3[var1] == -1) {
					var23 = field2895[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.rasterFlat((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], var23);
				} else if (var22) {
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2930[0], field2930[1], field2930[2]);
					Rasterizer3D.rasterTriangleWithGradient((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], field2930[0], field2930[2], field2930[3]);
				} else {
					Rasterizer3D.rasterGouraud((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2930[0], field2930[1], field2930[2]);
					Rasterizer3D.rasterGouraud((float)var14, (float)var16, (float)field2884[3], (float)var11, (float)var13, (float)field2905[3], var18, var20, field2924[3], field2930[0], field2930[2], field2930[3]);
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILrz;)V"
	)
	void method5565(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field5229[0] * var3 + var2.field5229[4] * var4 + var2.field5229[8] * var5 + var2.field5229[12] * var6);
		this.verticesY[var1] = -((int)(var2.field5229[1] * var3 + var2.field5229[5] * var4 + var2.field5229[9] * var5 + var2.field5229[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field5229[2] * var3 + var2.field5229[6] * var4 + var2.field5229[10] * var5 + var2.field5229[14] * var6));
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V"
	)
	void method5566(class226 var1, int var2) {
		if (this.field2933 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2933[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2872[var3];
					field2869.method9176();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class134 var8 = var1.method5090(var7);
						if (var8 != null) {
							field2903.method9178((float)var5[var6] / 255.0F);
							field2877.method9187(var8.method3697(var2));
							field2877.method9181(field2903);
							field2869.method9180(field2877);
						}
					}

					this.method5565(var3, field2869);
				}
			}

		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljs;S)V"
	)
	public void method5547(ModelColorOverride var1, short var2) {
		if (this.modelColorOverride == null) {
			this.modelColorOverride = new ModelColorOverride();
		}

		this.modelColorOverride.method5737(var1);
		this.field2946 = var2;
	}

	@ObfuscatedName("ca")
	public void method5568() {
		this.modelColorOverride = null;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	void method5559(class223 var1) {
		this.field2945 = var1;
	}

	@ObfuscatedName("gw")
	void vmethod5554(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.method5555(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(ILrz;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (Rasterizer3D.clips.field2999 != 1 || this.faceAlphas != null) {
			if (this.boundsType != 1) {
				this.calculateBoundsCylinder();
			}

			this.calculateBoundingBox(var1);
			class446 var8 = ModeWhere.method8730();
			var8.field5197.method9130((float)var1 * 0.0030679614F, 0.0F, 0.0F);
			var8.field5192.method9066(1.0F, 1.0F, 1.0F);
			var8.field5193.method9066((float)var3, (float)var4, (float)var5);
			TransformationMatrix var9 = AbstractArchive.method8450();
			var9.method9182(var8);
			var9.method9181(var2);
			int var10 = (int)var9.method9194(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.radius;
			boolean var13 = var12 <= 50 || this.faceTextures != null;
			boolean var14 = LoginState.method798(var6);
			boolean var15 = false;
			if (var14) {
				boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
				if (var16) {
					int var19 = Rasterizer3D.getClipMidX();
					int var20 = Rasterizer3D.getClipMidY();
					int var21 = Rasterizer3D.get3dZoom();
					boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
					boolean var17;
					if (!var22) {
						var17 = false;
					} else {
						class226.method5105(var2, var19, var20, var21);
						var17 = class150.method3907(this, var1, var3, var4, var5);
					}

					if (var17) {
						if (this.isSingleTile) {
							AABB var23 = this.getAABB(var1);
							int var24 = var10 - var23.zMidOffset;
							FloorUnderlayDefinition.method4509(var6, var24);
						} else {
							var15 = true;
						}
					}
				}
			}

			int var27 = Rasterizer3D.getClipMidX();
			int var28 = Rasterizer3D.getClipMidY();

			for (int var25 = 0; var25 < this.verticesCount; ++var25) {
				float var29 = (float)this.verticesX[var25];
				float var30 = (float)this.verticesY[var25];
				float var31 = (float)this.verticesZ[var25];
				var9.transformPoint(var29, var30, var31, field2897);
				var29 = field2897[0];
				var30 = field2897[1];
				var31 = field2897[2];
				var11 |= this.method5557(var25, var29, var30, var31, var10, var27, var28, var13);
			}

			var8.method9005();
			var9.method9171();

			try {
				this.draw0(var11, var15, this.isSingleTile, var6);
			} catch (Exception var26) {
			}

		}
	}
}
