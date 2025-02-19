import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Model")
public class Model extends Renderable
{
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ay")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ad")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static TransformationMatrix field2899;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static TransformationMatrix field2878;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static TransformationMatrix field2932;
	@ObfuscatedName("bj")
	static boolean[] field2935;
	@ObfuscatedName("bq")
	static boolean[] field2913;
	@ObfuscatedName("bx")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bf")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bc")
	static float[] field2905;
	@ObfuscatedName("bb")
	static int[] field2928;
	@ObfuscatedName("bi")
	static int[] field2918;
	@ObfuscatedName("bn")
	static int[] field2919;
	@ObfuscatedName("bl")
	static int[] field2920;
	@ObfuscatedName("br")
	static char[] field2922;
	@ObfuscatedName("bm")
	static char[][] field2944;
	@ObfuscatedName("bp")
	static int[] field2924;
	@ObfuscatedName("ch")
	static int[][] field2925;
	@ObfuscatedName("cd")
	static int[] field2926;
	@ObfuscatedName("cp")
	static int[] field2912;
	@ObfuscatedName("ca")
	static int[] field2895;
	@ObfuscatedName("cs")
	static int[] field2945;
	@ObfuscatedName("cj")
	static int[] field2923;
	@ObfuscatedName("cy")
	static int[] field2931;
	@ObfuscatedName("cb")
	static float[] field2936;
	@ObfuscatedName("co")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ct")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cv")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cf")
	static boolean field2893;
	@ObfuscatedName("cu")
	static int[] field2939;
	@ObfuscatedName("cg")
	static int[] field2916;
	@ObfuscatedName("cw")
	static int[] field2941;
	@ObfuscatedName("ce")
	static int[] field2942;
	@ObfuscatedName("ci")
	static final float field2927;
	@ObfuscatedName("cq")
	static float[] field2947;
	@ObfuscatedName("af")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("aa")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("as")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ae")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ax")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ai")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ak")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("aj")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("av")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ar")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ag")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("az")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("am")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aq")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("aw")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("an")
	public byte field2904;
	@ObfuscatedName("at")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ap")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("al")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bw")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bo")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bs")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bz")
	int[][] field2902;
	@ObfuscatedName("bt")
	int[][] field2903;
	@ObfuscatedName("ba")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bg")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bv")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bk")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bu")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("by")
	@Export("radius")
	int radius;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	class258 field2910;
	@ObfuscatedName("cc")
	short field2946;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2899 = new TransformationMatrix();
		field2878 = new TransformationMatrix();
		field2932 = new TransformationMatrix();
		field2935 = new boolean[6500];
		field2913 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2905 = new float[6500];
		field2928 = new int[6500];
		field2918 = new int[6500];
		field2919 = new int[6500];
		field2920 = new int[6500];
		field2922 = new char[6000];
		field2944 = new char[6000][512];
		field2924 = new int[12];
		field2925 = new int[12][2000];
		field2926 = new int[2000];
		field2912 = new int[2000];
		field2895 = new int[12];
		field2945 = new int[10];
		field2923 = new int[10];
		field2931 = new int[10];
		field2936 = new float[10];
		field2893 = true;
		field2939 = Rasterizer3D.Rasterizer3D_sine;
		field2916 = Rasterizer3D.Rasterizer3D_cosine;
		field2941 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2942 = Rasterizer3D.field2639;
		field2927 = class148.method3471(50);
		field2947 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2904 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2910 = null;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2904 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2910 = null;
		this.method5259(var1, var2, var3);
		this.field2904 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2904 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2910 = null;
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
		this.field2904 = var1.field2904;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljf;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2904 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2910 = null;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2904 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2904 == -1) {
					this.field2904 = var4.field2904;
				}
			}
		}

		this.method5259(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5257(var1[var3]);
		}

	}

	@ObfuscatedName("ab")
	void method5259(int var1, int var2, int var3) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	void method5256(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2904 != var1.field2904)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2904);
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

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	public void method5257(Model var1) {
		if (var1 != null) {
			this.method5256(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2904;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljf;"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljf;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljf;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZLjf;[B)Ljf;"
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
		var2.field2904 = this.field2904;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2902 = this.field2902;
		var2.field2903 = this.field2903;
		var2.isSingleTile = this.isSingleTile;
		var2.field2910 = this.field2910;
		var2.field2946 = this.field2946;
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
			int var9 = field2916[var1];
			int var10 = field2939[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var13 = this.verticesX[var11];
				int var14 = this.verticesZ[var11];
				int var12 = var13 * var9 + var14 * var10 >> 16;
				int var16 = this.verticesY[var11];
				int var18 = this.verticesX[var11];
				int var19 = this.verticesZ[var11];
				int var17 = var19 * var9 - var10 * var18 >> 16;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljl;"
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

	@ObfuscatedName("aj")
	void method5269() {
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

	@ObfuscatedName("av")
	public int method5266() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ar")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("ag")
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V"
	)
	public void method5261(class144 var1, int var2) {
		Skeleton var3 = var1.field1683;
		class241 var4 = var3.method4900();
		if (var4 != null) {
			var3.method4900().method4852(var1, var2);
			this.method5271(var3.method4900(), var1.method3413());
		}

		if (var1.method3414()) {
			this.method5270(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V"
	)
	void method5270(class144 var1, int var2) {
		Skeleton var3 = var1.field1683;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1681 != null && var1.field1681[var4] != null && var1.field1681[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class136 var6 = var1.field1681[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3370(var2) * 255.0F);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)V"
	)
	void method5271(class241 var1, int var2) {
		this.method5294(var1, var2);
	}

	@ObfuscatedName("aw")
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljg;Lfb;I[ZZZ)V"
	)
	public void method5273(Skeleton var1, class144 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class241 var7 = var1.method4900();
		if (var7 != null) {
			var7.method4845(var2, var3, var4, var5);
			if (var6) {
				this.method5271(var7, var2.method3413());
			}
		}

		if (!var5 && var2.method3414()) {
			this.method5270(var2, var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I[IZ)V"
	)
	public void method5274(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ap")
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
								var15 = field2939[var14];
								var16 = field2916[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2939[var12];
								var16 = field2916[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2939[var13];
								var16 = field2916[var13];
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

	@ObfuscatedName("al")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bw")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
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
		int var2 = field2939[var1];
		int var3 = field2916[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bz")
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

	@ObfuscatedName("bt")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ba")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5269();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2939[var1];
		int var11 = field2916[var1];
		int var12 = field2939[var2];
		int var13 = field2916[var2];
		int var14 = field2939[var3];
		int var15 = field2916[var3];
		int var16 = field2939[var4];
		int var17 = field2916[var4];
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
			field2928[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2905[var19] = class148.method3471(var22);
			if (this.faceTextures != null) {
				field2918[var19] = var20;
				field2919[var19] = var23;
				field2920[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bg")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method5269();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2939[var1];
		int var12 = field2916[var1];
		int var13 = field2939[var2];
		int var14 = field2916[var2];
		int var15 = field2939[var3];
		int var16 = field2916[var3];
		int var17 = field2939[var4];
		int var18 = field2916[var4];
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
			field2928[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2905[var20] = class148.method3471(var8);
			if (this.faceTextures != null) {
				field2918[var20] = var21;
				field2919[var20] = var24;
				field2920[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < AbstractRasterizer.method4881()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4754()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method4753()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = ViewportMouse.ViewportMouse_x;
							int var30 = HealthBarConfig.method2839();
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var33 = class241.method4839(var9);
							boolean var34 = false;
							int var36;
							int var37;
							int var38;
							if (var33 && var31) {
								boolean var35 = false;
								if (field2893) {
									var35 = UserComparator9.method3223(this, var1, var6, var7, var8, var2, var3, var4, var5);
								} else {
									var36 = var12 - var13;
									if (var36 <= 50) {
										var36 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var36;
									} else {
										var17 /= var14;
										var16 /= var36;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var36;
									} else {
										var21 /= var14;
										var23 /= var36;
									}

									var37 = var28 - Rasterizer3D.getClipMidX();
									var38 = var30 - Rasterizer3D.getClipMidY();
									if (var37 > var16 && var37 < var17 && var38 > var23 && var38 < var21) {
										var35 = true;
									}
								}

								if (var35) {
									if (this.isSingleTile) {
										class339.method6784(var9);
									} else {
										var34 = true;
									}
								}
							}

							int var46 = Rasterizer3D.getClipMidX();
							var36 = Rasterizer3D.getClipMidY();
							var37 = 0;
							var38 = 0;
							if (var1 != 0) {
								var37 = field2939[var1];
								var38 = field2916[var1];
							}

							for (int var39 = 0; var39 < this.verticesCount; ++var39) {
								int var40 = this.verticesX[var39];
								int var41 = this.verticesY[var39];
								int var42 = this.verticesZ[var39];
								int var43;
								if (var1 != 0) {
									var43 = var42 * var37 + var40 * var38 >> 16;
									var42 = var42 * var38 - var40 * var37 >> 16;
									var40 = var43;
								}

								var40 += var6;
								var41 += var7;
								var42 += var8;
								var43 = var42 * var4 + var5 * var40 >> 16;
								var42 = var5 * var42 - var40 * var4 >> 16;
								var40 = var43;
								var43 = var3 * var41 - var42 * var2 >> 16;
								var42 = var41 * var2 + var3 * var42 >> 16;
								var25 |= this.method5287(var39, var40, var43, var42, var12, var46, var36, var27);
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9);
							} catch (Exception var45) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bk")
	boolean method5287(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2928[var1] = var4 - var5;
		if (var8) {
			field2918[var1] = var2;
			field2919[var1] = var3;
			field2920[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2905[var1] = class148.method3471(var4);
			return false;
		} else {
			modelViewportXs[var1] = -5000;
			return true;
		}
	}

	@ObfuscatedName("bu")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2922[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var17;
			int var18;
			int var20;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					int var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var13 = modelViewportXs[var10];
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var14 = field2918[var8];
						var28 = field2918[var9];
						int var29 = field2918[var10];
						var17 = field2919[var8];
						var18 = field2919[var9];
						int var30 = field2919[var10];
						var20 = field2920[var8];
						int var21 = field2920[var9];
						int var22 = field2920[var10];
						var14 -= var28;
						var29 -= var28;
						var17 -= var18;
						var30 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var30;
						int var24 = var20 * var29 - var14 * var22;
						int var25 = var14 * var30 - var17 * var29;
						if (var28 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2913[var7] = true;
							int var26 = (field2928[var8] + field2928[var9] + field2928[var10]) / 3 + this.radius;
							field2944[var26][field2922[var26]++] = var7;
						}
					} else {
						if (var2 && class219.method4458(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var13, var6)) {
							class339.method6784(var4);
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var13 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2913[var7] = false;
							var14 = Rasterizer3D.method4749();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
								field2935[var7] = false;
							} else {
								field2935[var7] = true;
							}

							var28 = (field2928[var8] + field2928[var9] + field2928[var10]) / 3 + this.radius;
							field2944[var28][field2922[var28]++] = var7;
						}
					}
				}
			}

			boolean var31 = this.field2910 != null && this.field2910.method5437() && !Rasterizer3D.clips.field3000.method5437();
			short var32 = this.field2946;
			if (var31) {
				Rasterizer3D.clips.field3000.method5434(this.field2910);
			} else {
				this.field2946 = (short)this.indicesCount;
			}

			char[] var27;
			char var33;
			if (this.faceRenderPriorities == null) {
				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var33 = field2922[var9];
					if (var33 > 0) {
						var27 = field2944[var9];

						for (var12 = 0; var12 < var33; ++var12) {
							this.drawFace(var27[var12]);
						}
					}
				}

				this.field2946 = var32;
				if (var31) {
					Rasterizer3D.clips.field3000.method5436();
				}

			} else {
				for (var9 = 0; var9 < 12; ++var9) {
					field2924[var9] = 0;
					field2895[var9] = 0;
				}

				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var33 = field2922[var9];
					if (var33 > 0) {
						var27 = field2944[var9];

						for (var12 = 0; var12 < var33; ++var12) {
							char var34 = var27[var12];
							byte var35 = this.faceRenderPriorities[var34];
							var28 = field2924[var35]++;
							field2925[var35][var28] = var34;
							if (var35 < 10) {
								int[] var36 = field2895;
								var36[var35] += var9;
							} else if (var35 == 10) {
								field2926[var28] = var9;
							} else {
								field2912[var28] = var9;
							}
						}
					}
				}

				var9 = 0;
				if (field2924[1] > 0 || field2924[2] > 0) {
					var9 = (field2895[1] + field2895[2]) / (field2924[1] + field2924[2]);
				}

				var10 = 0;
				if (field2924[3] > 0 || field2924[4] > 0) {
					var10 = (field2895[3] + field2895[4]) / (field2924[3] + field2924[4]);
				}

				var11 = 0;
				if (field2924[6] > 0 || field2924[8] > 0) {
					var11 = (field2895[8] + field2895[6]) / (field2924[8] + field2924[6]);
				}

				var13 = 0;
				var14 = field2924[10];
				int[] var15 = field2925[10];
				int[] var16 = field2926;
				if (var13 == var14) {
					var13 = 0;
					var14 = field2924[11];
					var15 = field2925[11];
					var16 = field2912;
				}

				if (var13 < var14) {
					var12 = var16[var13];
				} else {
					var12 = -1000;
				}

				for (var17 = 0; var17 < 10; ++var17) {
					while (var17 == 0 && var12 > var9) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2925[11]) {
							var13 = 0;
							var14 = field2924[11];
							var15 = field2925[11];
							var16 = field2912;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 3 && var12 > var10) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2925[11]) {
							var13 = 0;
							var14 = field2924[11];
							var15 = field2925[11];
							var16 = field2912;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 5 && var12 > var11) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2925[11]) {
							var13 = 0;
							var14 = field2924[11];
							var15 = field2925[11];
							var16 = field2912;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					var18 = field2924[var17];
					int[] var19 = field2925[var17];

					for (var20 = 0; var20 < var18; ++var20) {
						this.drawFace(var19[var20]);
					}
				}

				while (var12 != -1000) {
					this.drawFace(var15[var13++]);
					if (var13 == var14 && var15 != field2925[11]) {
						var13 = 0;
						var15 = field2925[11];
						var14 = field2924[11];
						var16 = field2912;
					}

					if (var13 < var14) {
						var12 = var16[var13];
					} else {
						var12 = -1000;
					}
				}

				this.field2946 = var32;
				if (var31) {
					Rasterizer3D.clips.field3000.method5436();
				}

			}
		}
	}

	@ObfuscatedName("by")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2913[var1]) {
			this.method5335(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2935[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5291(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2905[var2], field2905[var3], field2905[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bh")
	boolean method5290(int var1) {
		return var1 < this.field2946;
	}

	@ObfuscatedName("be")
	final void method5291(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2918[var18], field2918[var15], field2918[var16], field2919[var18], field2919[var15], field2919[var16], field2920[var18], field2920[var15], field2920[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2918[var18], field2918[var15], field2918[var16], field2919[var18], field2919[var15], field2919[var16], field2920[var18], field2920[var15], field2920[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5290(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2941[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2941[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bj")
	final void method5335(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2920[var5];
		int var9 = field2920[var6];
		int var10 = field2920[var7];
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
			field2945[var4] = modelViewportXs[var5];
			field2923[var4] = modelViewportYs[var5];
			field2936[var4] = field2905[var7];
			field2931[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2918[var5];
			var12 = field2919[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2942[var10 - var8] * (50 - var8);
				field2945[var4] = var2 + (var11 + ((field2918[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2936[var4] = field2927;
				field2931[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2942[var9 - var8] * (50 - var8);
				field2945[var4] = var2 + (var11 + ((field2918[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2936[var4] = field2927;
				field2931[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2945[var4] = modelViewportXs[var6];
			field2923[var4] = modelViewportYs[var6];
			field2936[var4] = field2905[var7];
			field2931[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2918[var6];
			var12 = field2919[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2942[var8 - var9] * (50 - var9);
				field2945[var4] = var2 + (var11 + ((field2918[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2936[var4] = field2927;
				field2931[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2942[var10 - var9] * (50 - var9);
				field2945[var4] = var2 + (var11 + ((field2918[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2931[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2945[var4] = modelViewportXs[var7];
			field2923[var4] = modelViewportYs[var7];
			field2936[var4] = field2905[var7];
			field2931[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2918[var7];
			var12 = field2919[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2942[var9 - var10] * (50 - var10);
				field2945[var4] = var2 + (var11 + ((field2918[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2936[var4] = field2927;
				field2931[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2942[var8 - var10] * (50 - var10);
				field2945[var4] = var2 + (var11 + ((field2918[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2919[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2936[var4] = field2927;
				field2931[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2945[0];
		var12 = field2945[1];
		var13 = field2945[2];
		var14 = field2923[0];
		int var15 = field2923[1];
		int var16 = field2923[2];
		float var17 = field2936[0];
		float var18 = field2936[1];
		float var19 = field2936[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method4749();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5291(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2931[0], field2931[1], field2931[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2945[3] < 0 || field2945[3] > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var23;
				int var25;
				if (this.textureFaces != null && this.textureFaces[var1] != -1) {
					int var24 = this.textureFaces[var1] & 255;
					var25 = this.texIndices1[var24];
					var22 = this.texIndices2[var24];
					var23 = this.texIndices3[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2918[var25], field2918[var22], field2918[var23], field2919[var25], field2919[var22], field2919[var23], field2920[var25], field2920[var22], field2920[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2923[3], var11, var13, field2945[3], var17, var19, field2936[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2918[var25], field2918[var22], field2918[var23], field2919[var25], field2919[var22], field2919[var23], field2920[var25], field2920[var22], field2920[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2931[0], field2931[1], field2931[2], field2918[var25], field2918[var22], field2918[var23], field2919[var25], field2919[var22], field2919[var23], field2920[var25], field2920[var22], field2920[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2923[3], var11, var13, field2945[3], var17, var19, field2936[3], field2931[0], field2931[2], field2931[3], field2918[var25], field2918[var22], field2918[var23], field2919[var25], field2919[var22], field2919[var23], field2920[var25], field2920[var22], field2920[var23], var26);
				}
			} else {
				boolean var21 = this.method5290(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2941[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterTriangle(var14, var16, field2923[3], var11, var13, field2945[3], var17, var19, field2936[3], var22);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2941[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2923[3], var11, var13, field2945[3], var17, var19, field2936[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2931[0], field2931[1], field2931[2]);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2923[3], var11, var13, field2945[3], 0.0F, 0.0F, 0.0F, field2931[0], field2931[2], field2931[3]);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2931[0], field2931[1], field2931[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2923[3], var11, var13, field2945[3], var17, var19, field2936[3], field2931[0], field2931[2], field2931[3]);
				}
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILro;)V"
	)
	void method5293(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4913[0] * var3 + var2.field4913[4] * var4 + var2.field4913[8] * var5 + var2.field4913[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4913[1] * var3 + var2.field4913[5] * var4 + var2.field4913[9] * var5 + var2.field4913[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4913[2] * var3 + var2.field4913[6] * var4 + var2.field4913[10] * var5 + var2.field4913[14] * var6));
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)V"
	)
	void method5294(class241 var1, int var2) {
		if (this.field2902 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2902[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2903[var3];
					field2899.method8394();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class133 var8 = var1.method4842(var7);
						if (var8 != null) {
							field2878.method8396((float)var5[var6] / 255.0F);
							field2932.method8395(var8.method3294(var2));
							field2932.method8399(field2878);
							field2899.method8429(field2932);
						}
					}

					this.method5293(var3, field2899);
				}
			}

		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljb;S)V"
	)
	public void method5295(class258 var1, short var2) {
		if (this.field2910 == null) {
			this.field2910 = new class258();
		}

		this.field2910.method5434(var1);
		this.field2946 = var2;
	}

	@ObfuscatedName("bc")
	public void method5296() {
		this.field2910 = null;
	}

	@ObfuscatedName("fu")
	void vmethod5284(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ILro;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class438 var8 = new class438();
		var8.field4882.method8363((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4878.method8296(1.0F, 1.0F, 1.0F);
		var8.field4881.method8296((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class148.method3476();
		var9.method8435(var8);
		var9.method8399(var2);
		int var10 = (int)var9.method8410(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		int var14 = Rasterizer3D.getClipMidX();
		int var15 = Rasterizer3D.getClipMidY();

		for (int var16 = 0; var16 < this.verticesCount; ++var16) {
			int var17 = this.verticesX[var16];
			int var18 = this.verticesY[var16];
			int var19 = this.verticesZ[var16];
			var9.transformPoint((float)var17, (float)var18, (float)var19, field2947);
			var17 = (int)field2947[0];
			var18 = (int)field2947[1];
			var19 = (int)field2947[2];
			var11 |= this.method5287(var16, var17, var18, var19, var10, var14, var15, var13);
		}

		boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
		boolean var23 = var22 && class241.method4839(var6);
		var8.method8243();
		var9.method8413();

		try {
			this.draw0(var11, var23, this.isSingleTile, var6);
		} catch (Exception var21) {
		}

	}
}
