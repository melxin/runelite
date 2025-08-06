import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("as")
	static boolean[] field2825;
	@ObfuscatedName("ah")
	static boolean[] field2826;
	@ObfuscatedName("ap")
	static boolean[] field2827;
	@ObfuscatedName("am")
	static float[] field2841;
	@ObfuscatedName("aj")
	static float[] field2829;
	@ObfuscatedName("ag")
	static float[] field2828;
	@ObfuscatedName("ay")
	static int[] field2831;
	@ObfuscatedName("aa")
	static int[] field2832;
	@ObfuscatedName("ai")
	static int[] field2833;
	@ObfuscatedName("ak")
	static int[] field2834;
	@ObfuscatedName("ar")
	static char[] field2890;
	@ObfuscatedName("at")
	static char[][] field2857;
	@ObfuscatedName("ax")
	static int[] field2837;
	@ObfuscatedName("aq")
	static int[][] field2838;
	@ObfuscatedName("ao")
	static int[] field2839;
	@ObfuscatedName("az")
	static int[] field2840;
	@ObfuscatedName("ad")
	static int[] field2843;
	@ObfuscatedName("aw")
	static boolean field2842;
	@ObfuscatedName("af")
	static int[] field2889;
	@ObfuscatedName("an")
	static int[] field2844;
	@ObfuscatedName("ae")
	static int[] field2845;
	@ObfuscatedName("bj")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bn")
	static float[] field2873;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bw")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("be")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static TransformationMatrix field2884;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static TransformationMatrix field2895;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static TransformationMatrix field2835;
	@ObfuscatedName("bx")
	static int[] field2855;
	@ObfuscatedName("bl")
	static int[] field2860;
	@ObfuscatedName("bf")
	static int[] field2875;
	@ObfuscatedName("bc")
	static float[] field2853;
	@ObfuscatedName("bd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("br")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("ba")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bh")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bg")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("bt")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("bs")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bu")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("bp")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("bz")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("bk")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bb")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("by")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("cg")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cs")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ce")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ci")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("cq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("cj")
	byte[] field2893;
	@ObfuscatedName("cm")
	public byte field2878;
	@ObfuscatedName("cu")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("cl")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ck")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cn")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("ch")
	int[][] field2883;
	@ObfuscatedName("cx")
	int[][] field2894;
	@ObfuscatedName("cv")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("cc")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("cp")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cr")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("cb")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cy")
	@Export("radius")
	int radius;
	@ObfuscatedName("ct")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("cw")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	ModelColorOverride field2820;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	class222 field2849;
	@ObfuscatedName("cd")
	short field2880;

	static {
		field2825 = new boolean[6500];
		field2826 = new boolean[6500];
		field2827 = new boolean[6500];
		field2841 = new float[6500];
		field2829 = new float[6500];
		field2828 = new float[6500];
		field2831 = new int[6500];
		field2832 = new int[6500];
		field2833 = new int[6500];
		field2834 = new int[6500];
		field2890 = new char[6000];
		field2857 = new char[6000][512];
		field2837 = new int[12];
		field2838 = new int[12][2000];
		field2839 = new int[2000];
		field2840 = new int[2000];
		field2843 = new int[12];
		field2842 = true;
		field2889 = Rasterizer3D.Rasterizer3D_sine;
		field2844 = Rasterizer3D.Rasterizer3D_cosine;
		field2845 = Rasterizer3D.Rasterizer3D_colorPalette;
		modelViewportXs = Rasterizer3D.field2584;
		field2873 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2884 = new TransformationMatrix();
		field2895 = new TransformationMatrix();
		field2835 = new TransformationMatrix();
		field2855 = new int[10];
		field2860 = new int[10];
		field2875 = new int[10];
		field2853 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2878 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2820 = null;
		this.field2849 = class222.field2578;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2878 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2820 = null;
		this.field2849 = class222.field2578;
		this.method5430(var1, var2, var3);
		this.field2878 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljx;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2878 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2820 = null;
		this.field2849 = class222.field2578;
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
		this.field2893 = var1.field2893;
		this.field2878 = var1.field2878;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljx;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2878 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2820 = null;
		this.field2849 = class222.field2578;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2878 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2878 == -1) {
					this.field2878 = var4.field2878;
				}
			}
		}

		this.method5430(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5508(var1[var3]);
		}

	}

	@ObfuscatedName("al")
	void method5430(int var1, int var2, int var3) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljx;)V"
	)
	void method5431(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2878 != var1.field2878)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2878);
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

		if (this.field2893 == null && var1.field2893 != null) {
			this.field2893 = new byte[var2];
			Arrays.fill(this.field2893, (byte)0);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljx;)V"
	)
	public void method5508(Model var1) {
		if (var1 != null) {
			this.method5431(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2878;
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

				if (this.field2893 != null && var1.field2893 != null) {
					this.field2893[this.indicesCount] = var1.field2893[var2];
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljx;"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljx;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljx;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZLjx;[B)Ljx;"
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
		var2.field2893 = this.field2893;
		var2.field2878 = this.field2878;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2883 = this.field2883;
		var2.field2894 = this.field2894;
		var2.isSingleTile = this.isSingleTile;
		var2.field2820 = this.field2820;
		var2.field2880 = this.field2880;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("am")
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
			int var9 = field2844[var1];
			int var10 = field2889[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var12 = class31.method493(this.verticesX[var11], this.verticesZ[var11], var9, var10);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;"
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

	@ObfuscatedName("ag")
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

	@ObfuscatedName("ay")
	void method5440() {
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

	@ObfuscatedName("aa")
	public int method5441() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("at")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lin;I)V"
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
		descriptor = "(Lfh;I)V"
	)
	public void method5444(class144 var1, int var2) {
		Skeleton var3 = var1.field1708;
		class225 var4 = var3.method5072();
		if (var4 != null) {
			var3.method5072().method5012(var1, var2);
			this.method5446(var3.method5072(), var1.method3731());
		}

		if (var1.method3719()) {
			this.method5491(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I)V"
	)
	void method5491(class144 var1, int var2) {
		Skeleton var3 = var1.field1708;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1710 != null && var1.field1710[var4] != null && var1.field1710[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class137 var6 = var1.field1710[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3652(var2) * 255.0F);
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V"
	)
	void method5446(class225 var1, int var2) {
		this.method5471(var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lin;ILin;I[I)V"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lih;Lfh;I[ZZZ)V"
	)
	public void method5494(Skeleton var1, class144 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class225 var7 = var1.method5072();
		if (var7 != null) {
			var7.method5003(var2, var3, var4, var5);
			if (var6) {
				this.method5446(var7, var2.method3731());
			}
		}

		if (!var5 && var2.method3719()) {
			this.method5491(var2, var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lin;I[IZ)V"
	)
	public void method5449(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ae")
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
								var15 = field2889[var14];
								var16 = field2844[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2889[var12];
								var16 = field2844[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2889[var13];
								var16 = field2844[var13];
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

	@ObfuscatedName("bj")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bn")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bi")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bw")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2889[var1];
		int var3 = field2844[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
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

	@ObfuscatedName("be")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bm")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5440();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2889[var1];
		int var11 = field2844[var1];
		int var12 = field2889[var2];
		int var13 = field2844[var2];
		int var14 = field2889[var3];
		int var15 = field2844[var3];
		int var16 = field2889[var4];
		int var17 = field2844[var4];
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
			field2831[var19] = var22 - var18;
			field2841[var19] = (float)(var8 + var20 * Rasterizer3D.get3dZoom() / var22);
			field2829[var19] = (float)(var9 + var23 * Rasterizer3D.get3dZoom() / var22);
			field2828[var19] = (float)var22;
			if (this.faceTextures != null) {
				field2832[var19] = var20;
				field2833[var19] = var23;
				field2834[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bq")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method5440();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2889[var1];
		int var12 = field2844[var1];
		int var13 = field2889[var2];
		int var14 = field2844[var2];
		int var15 = field2889[var3];
		int var16 = field2844[var3];
		int var17 = field2889[var4];
		int var18 = field2844[var4];
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
			field2831[var20] = var23 - var19;
			field2841[var20] = (float)(var9 + var21 * Rasterizer3D.get3dZoom() / var8);
			field2829[var20] = (float)(var10 + var24 * Rasterizer3D.get3dZoom() / var8);
			field2828[var20] = (float)var8;
			if (this.faceTextures != null) {
				field2832[var20] = var21;
				field2833[var20] = var24;
				field2834[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bv")
	void method5537(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
		float var13 = Rasterizer3D.field2590[var2];
		float var14 = Rasterizer3D.field2588[var2];
		float var15 = Rasterizer3D.field2590[var3];
		float var16 = Rasterizer3D.field2588[var3];
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var17 = var12 * var6 - var11 * var4 >> 16;
		int var18 = var17 * var10 + var5 * var9 >> 16;
		int var19 = var10 * this.xzRadius >> 16;
		int var20 = var18 + var19;
		if (var20 > 50 && var18 < AbstractRasterizer.method5026()) {
			int var21 = var11 * var6 + var12 * var4 >> 16;
			int var22 = (var21 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var23 = (var21 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var24 = var5 * var10 - var17 * var9 >> 16;
					int var25 = var9 * this.xzRadius >> 16;
					int var26 = var25 + (var10 * this.bottomY >> 16);
					int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
					if (var27 / var20 > Rasterizer3D.method4898()) {
						int var28 = var25 + (var10 * super.height >> 16);
						int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
						if (var29 / var20 < Rasterizer3D.method4897()) {
							int var30 = var19 + (var9 * super.height >> 16);
							boolean var31 = false;
							boolean var32 = false;
							if (var18 - var30 <= 50) {
								var32 = true;
							}

							boolean var33 = var32 || this.faceTextures != null;
							int var34 = class48.method1862();
							int var35 = ViewportMouse.ViewportMouse_y;
							boolean var37 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var39 = var7 != 0L && !Varcs.method2848(var7);
							boolean var41 = false;
							int var43;
							if (var39 && var37) {
								boolean var42 = false;
								if (field2842) {
									var42 = ClanChannel.method4061(this, var1, var4, var5, var6, var13, var14, var15, var16, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
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

									int var44 = var34 - Rasterizer3D.getClipMidX();
									int var45 = var35 - Rasterizer3D.getClipMidY();
									if (var44 > var22 && var44 < var23 && var45 > var29 && var45 < var27) {
										var42 = true;
									}
								}

								if (var42) {
									if (this.isSingleTile) {
										HorizontalAlignment.method4304(var7);
									} else {
										var41 = true;
									}
								}
							}

							int var53 = Rasterizer3D.getClipMidX();
							var43 = Rasterizer3D.getClipMidY();
							float var54 = 0.0F;
							float var55 = 0.0F;
							if (var1 != 0) {
								var54 = Rasterizer3D.field2590[var1];
								var55 = Rasterizer3D.field2588[var1];
							}

							for (int var46 = 0; var46 < this.verticesCount; ++var46) {
								float var47 = (float)this.verticesX[var46];
								float var48 = (float)this.verticesY[var46];
								float var49 = (float)this.verticesZ[var46];
								float var50;
								if (var1 != 0) {
									var50 = var49 * var54 + var47 * var55;
									var49 = var49 * var55 - var47 * var54;
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
								var31 |= this.method5475(var46, var47, var50, var49, var18, var53, var43, var33);
							}

							try {
								this.draw0(var31, var41, this.isSingleTile, var7);
							} catch (Exception var52) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	boolean method5475(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		field2831[var1] = (int)var4 - var5;
		if (var8) {
			field2832[var1] = (int)var2;
			field2833[var1] = (int)var3;
			field2834[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			field2841[var1] = (float)var6 + var2 * (float)Rasterizer3D.get3dZoom() / var4;
			field2829[var1] = (float)var7 + var3 * (float)Rasterizer3D.get3dZoom() / var4;
			field2828[var1] = var4;
			return false;
		} else {
			field2841[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("bl")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2890[var6] = 0;
			}

			var6 = var3 ? 20 : 5;
			int var7 = Rasterizer3D.method4959();

			for (int var8 = 0; var8 < this.indicesCount; ++var8) {
				if (this.faceColors3[var8] == -2) {
					field2827[var8] = true;
				} else {
					int var9 = this.indices1[var8];
					int var27 = this.indices2[var8];
					int var11 = this.indices3[var8];
					float var12 = field2841[var9];
					float var13 = field2841[var27];
					float var14 = field2841[var11];
					field2826[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
					int var16;
					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (field2826[var8]) {
						int var30 = field2832[var9];
						var16 = field2832[var27];
						var17 = field2832[var11];
						var18 = field2833[var9];
						var19 = field2833[var27];
						var20 = field2833[var11];
						var21 = field2834[var9];
						var22 = field2834[var27];
						int var23 = field2834[var11];
						var30 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						var21 -= var22;
						var23 -= var22;
						int var24 = var18 * var23 - var21 * var20;
						int var25 = var21 * var17 - var30 * var23;
						int var26 = var30 * var20 - var18 * var17;
						field2827[var8] = (float)(var16 * var24 + var19 * var25 + var22 * var26) <= 0.0F;
					} else {
						field2827[var8] = (var12 - var13) * (field2829[var11] - field2829[var27]) - (field2829[var9] - field2829[var27]) * (var14 - var13) <= 0.0F;
						field2825[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > (float)var7 || var13 > (float)var7 || var14 > (float)var7;
						if (var2) {
							var16 = (int)field2829[var9];
							var17 = (int)field2829[var27];
							var18 = (int)field2829[var11];
							var19 = (int)var12;
							var20 = (int)var13;
							var21 = (int)var14;
							var22 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var15;
							if (var22 < var16 && var22 < var17 && var22 < var18) {
								var15 = false;
							} else {
								var22 = ViewportMouse.ViewportMouse_y - var6;
								if (var22 > var16 && var22 > var17 && var22 > var18) {
									var15 = false;
								} else {
									var22 = var6 + ViewportMouse.ViewportMouse_x;
									if (var22 < var19 && var22 < var20 && var22 < var21) {
										var15 = false;
									} else {
										var22 = ViewportMouse.ViewportMouse_x - var6;
										if (var22 > var19 && var22 > var20 && var22 > var21) {
											var15 = false;
										} else {
											var15 = true;
										}
									}
								}
							}

							if (var15) {
								HorizontalAlignment.method4304(var4);
								var2 = false;
							}
						}
					}
				}
			}

			short var28 = this.field2880;
			boolean var29 = false;
			if (Rasterizer3D.clips.field2943.method5662()) {
				this.field2880 = (short)this.indicesCount;
			} else if (this.field2820 != null && this.field2820.method5662()) {
				Rasterizer3D.clips.field2943.method5650(this.field2820);
				var29 = true;
			}

			if (!Rasterizer3D.method4901()) {
				this.method5464();
			} else {
				class222 var10 = this.field2849;
				if (var10 == class222.field2579) {
					var10 = this.faceAlphas == null ? class222.field2578 : class222.field2576;
				}

				switch(var10.field2575) {
				case 1:
					Rasterizer3D.clips.field2956 = -1;
					Rasterizer3D.clips.field2957 = -1;
					this.method5464();
					break;
				case 2:
					Rasterizer3D.clips.field2956 = -1;
					Rasterizer3D.clips.field2957 = 0;
					this.method5464();
					Rasterizer3D.clips.field2956 = 0;
					Rasterizer3D.clips.field2957 = -1;
					this.method5464();
					Rasterizer3D.clips.field2956 = -1;
					Rasterizer3D.clips.field2957 = -1;
					break;
				case 3:
					Rasterizer3D.clips.field2956 = -1;
					Rasterizer3D.clips.field2957 = -1;
					this.method5481();
				}
			}

			this.field2880 = var28;
			if (var29) {
				Rasterizer3D.clips.field2943.method5652();
			}

		}
	}

	@ObfuscatedName("bf")
	void method5481() {
		for (int var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2827[var1]) {
				this.drawFace(var1);
			}
		}

	}

	@ObfuscatedName("bc")
	void method5464() {
		for (char var1 = 0; var1 < this.indicesCount; ++var1) {
			if (!field2827[var1]) {
				int var2 = (field2831[this.indices1[var1]] + field2831[this.indices2[var1]] + field2831[this.indices3[var1]]) / 3 + this.radius;
				field2857[var2][field2890[var2]++] = var1;
			}
		}

		if (this.faceRenderPriorities == null) {
			for (int var5 = this.diameter - 1; var5 >= 0; --var5) {
				char var6 = field2890[var5];
				if (var6 > 0) {
					char[] var3 = field2857[var5];

					for (int var4 = 0; var4 < var6; ++var4) {
						this.drawFace(var3[var4]);
					}
				}
			}
		} else {
			this.method5465();
		}

	}

	@ObfuscatedName("bd")
	void method5465() {
		int var1;
		for (var1 = 0; var1 < 12; ++var1) {
			field2837[var1] = 0;
			field2843[var1] = 0;
		}

		int var4;
		for (var1 = this.diameter - 1; var1 >= 0; --var1) {
			char var2 = field2890[var1];
			if (var2 > 0) {
				char[] var13 = field2857[var1];

				for (var4 = 0; var4 < var2; ++var4) {
					char var5 = var13[var4];
					byte var6 = this.faceRenderPriorities[var5];
					int var14 = field2837[var6]++;
					field2838[var6][var14] = var5;
					if (var6 < 10) {
						int[] var10000 = field2843;
						var10000[var6] += var1;
					} else if (var6 == 10) {
						field2839[var14] = var1;
					} else {
						field2840[var14] = var1;
					}
				}
			}
		}

		var1 = 0;
		if (field2837[1] > 0 || field2837[2] > 0) {
			var1 = (field2843[1] + field2843[2]) / (field2837[1] + field2837[2]);
		}

		int var15 = 0;
		if (field2837[3] > 0 || field2837[4] > 0) {
			var15 = (field2843[3] + field2843[4]) / (field2837[3] + field2837[4]);
		}

		int var3 = 0;
		if (field2837[6] > 0 || field2837[8] > 0) {
			var3 = (field2843[8] + field2843[6]) / (field2837[8] + field2837[6]);
		}

		int var16 = 0;
		int var17 = field2837[10];
		int[] var7 = field2838[10];
		int[] var8 = field2839;
		if (var16 == var17) {
			var16 = 0;
			var17 = field2837[11];
			var7 = field2838[11];
			var8 = field2840;
		}

		if (var16 < var17) {
			var4 = var8[var16];
		} else {
			var4 = -1000;
		}

		for (int var9 = 0; var9 < 10; ++var9) {
			while (var9 == 0 && var4 > var1) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2838[11]) {
					var16 = 0;
					var17 = field2837[11];
					var7 = field2838[11];
					var8 = field2840;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 3 && var4 > var15) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2838[11]) {
					var16 = 0;
					var17 = field2837[11];
					var7 = field2838[11];
					var8 = field2840;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			while (var9 == 5 && var4 > var3) {
				this.drawFace(var7[var16++]);
				if (var16 == var17 && var7 != field2838[11]) {
					var16 = 0;
					var17 = field2837[11];
					var7 = field2838[11];
					var8 = field2840;
				}

				if (var16 < var17) {
					var4 = var8[var16];
				} else {
					var4 = -1000;
				}
			}

			int var10 = field2837[var9];
			int[] var11 = field2838[var9];

			for (int var12 = 0; var12 < var10; ++var12) {
				this.drawFace(var11[var12]);
			}
		}

		while (var4 != -1000) {
			this.drawFace(var7[var16++]);
			if (var16 == var17 && var7 != field2838[11]) {
				var16 = 0;
				var7 = field2838[11];
				var17 = field2837[11];
				var8 = field2840;
			}

			if (var16 < var17) {
				var4 = var8[var16];
			} else {
				var4 = -1000;
			}
		}

	}

	@ObfuscatedName("br")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2826[var1]) {
			this.method5469(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2825[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			int var5 = this.field2893 == null ? 0 : this.field2893[var1] * 2;
			float var6 = ClanSettings.method3890(field2828[var2] - (float)var5);
			float var7 = ClanSettings.method3890(field2828[var3] - (float)var5);
			float var8 = ClanSettings.method3890(field2828[var4] - (float)var5);
			this.method5520(var1, field2829[var2], field2829[var3], field2829[var4], field2841[var2], field2841[var3], field2841[var4], var6, var7, var8, this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("ba")
	boolean method5467(int var1) {
		return var1 < this.field2880;
	}

	@ObfuscatedName("bh")
	final void method5520(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.method4910(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2832[var18], field2832[var15], field2832[var16], field2833[var18], field2833[var15], field2833[var16], field2834[var18], field2834[var15], field2834[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method4910(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2832[var18], field2832[var15], field2832[var16], field2833[var18], field2833[var15], field2833[var16], field2834[var18], field2834[var15], field2834[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5467(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method4923(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2845[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method4977(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2845[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method4912(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.method4908(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bg")
	final void method5469(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2834[var5];
		int var9 = field2834[var6];
		int var10 = field2834[var7];
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
			field2855[var4] = (int)field2841[var5];
			field2860[var4] = (int)field2829[var5];
			field2853[var4] = field2828[var5];
			field2875[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2832[var5];
			var12 = field2833[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = modelViewportXs[var10 - var8] * (50 - var8);
				field2855[var4] = var2 + (var11 + ((field2832[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = modelViewportXs[var9 - var8] * (50 - var8);
				field2855[var4] = var2 + (var11 + ((field2832[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2855[var4] = (int)field2841[var6];
			field2860[var4] = (int)field2829[var6];
			field2853[var4] = field2828[var6];
			field2875[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2832[var6];
			var12 = field2833[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = modelViewportXs[var8 - var9] * (50 - var9);
				field2855[var4] = var2 + (var11 + ((field2832[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = modelViewportXs[var10 - var9] * (50 - var9);
				field2855[var4] = var2 + (var11 + ((field2832[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2855[var4] = (int)field2841[var7];
			field2860[var4] = (int)field2829[var7];
			field2853[var4] = field2828[var7];
			field2875[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2832[var7];
			var12 = field2833[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = modelViewportXs[var9 - var10] * (50 - var10);
				field2855[var4] = var2 + (var11 + ((field2832[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = modelViewportXs[var8 - var10] * (50 - var10);
				field2855[var4] = var2 + (var11 + ((field2832[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2860[var4] = var3 + (var12 + ((field2833[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4] = 50.0F;
				field2875[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2855[0];
		var12 = field2855[1];
		var13 = field2855[2];
		var14 = field2860[0];
		int var15 = field2860[1];
		int var16 = field2860[2];
		int var17 = this.field2893 == null ? 0 : this.field2893[var1] * 2;
		float var18 = ClanSettings.method3890(field2853[0] - (float)var17);
		float var19 = ClanSettings.method3890(field2853[1] - (float)var17);
		float var20 = ClanSettings.method3890(field2853[2] - (float)var17);
		Rasterizer3D.clips.clipping = false;
		int var21 = Rasterizer3D.method4959();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5520(var1, (float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2875[0], field2875[1], field2875[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var21 || var12 > var21 || var13 > var21 || field2855[3] < 0 || field2855[3] > var21) {
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
					Rasterizer3D.method4910((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2832[var26], field2832[var23], field2832[var24], field2833[var26], field2833[var23], field2833[var24], field2834[var26], field2834[var23], field2834[var24], var27);
					Rasterizer3D.method4910((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2832[var26], field2832[var23], field2832[var24], field2833[var26], field2833[var23], field2833[var24], field2834[var26], field2834[var23], field2834[var24], var27);
				} else {
					Rasterizer3D.method4910((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2875[0], field2875[1], field2875[2], field2832[var26], field2832[var23], field2832[var24], field2833[var26], field2833[var23], field2833[var24], field2834[var26], field2834[var23], field2834[var24], var27);
					Rasterizer3D.method4910((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], field2875[0], field2875[2], field2875[3], field2832[var26], field2832[var23], field2832[var24], field2833[var26], field2833[var23], field2833[var24], field2834[var26], field2834[var23], field2834[var24], var27);
				}
			} else {
				boolean var22 = this.method5467(var1);
				if (this.faceColors3[var1] == -1 && var22) {
					var23 = field2845[this.faceColors1[var1]];
					Rasterizer3D.method4923((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.method4923((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], var23);
				} else if (this.faceColors3[var1] == -1) {
					var23 = field2845[this.faceColors1[var1]];
					Rasterizer3D.method4977((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, var23);
					Rasterizer3D.method4977((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], var23);
				} else if (var22) {
					Rasterizer3D.method4912((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2875[0], field2875[1], field2875[2]);
					Rasterizer3D.method4912((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], field2875[0], field2875[2], field2875[3]);
				} else {
					Rasterizer3D.method4908((float)var14, (float)var15, (float)var16, (float)var11, (float)var12, (float)var13, var18, var19, var20, field2875[0], field2875[1], field2875[2]);
					Rasterizer3D.method4908((float)var14, (float)var16, (float)field2860[3], (float)var11, (float)var13, (float)field2855[3], var18, var20, field2853[3], field2875[0], field2875[2], field2875[3]);
				}
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILrr;)V"
	)
	void method5445(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field5074[0] * var3 + var2.field5074[4] * var4 + var2.field5074[8] * var5 + var2.field5074[12] * var6);
		this.verticesY[var1] = -((int)(var2.field5074[1] * var3 + var2.field5074[5] * var4 + var2.field5074[9] * var5 + var2.field5074[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field5074[2] * var3 + var2.field5074[6] * var4 + var2.field5074[10] * var5 + var2.field5074[14] * var6));
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V"
	)
	void method5471(class225 var1, int var2) {
		if (this.field2883 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2883[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2894[var3];
					field2884.method9109();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class134 var8 = var1.method5001(var7);
						if (var8 != null) {
							field2895.method9111((float)var5[var6] / 255.0F);
							field2835.method9110(var8.method3601(var2));
							field2835.method9172(field2895);
							field2884.method9112(field2835);
						}
					}

					this.method5445(var3, field2884);
				}
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lja;S)V"
	)
	public void method5472(ModelColorOverride var1, short var2) {
		if (this.field2820 == null) {
			this.field2820 = new ModelColorOverride();
		}

		this.field2820.method5650(var1);
		this.field2880 = var2;
	}

	@ObfuscatedName("bp")
	public void method5574() {
		this.field2820 = null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lif;)V"
	)
	void method5474(class222 var1) {
		this.field2849 = var1;
	}

	@ObfuscatedName("fz")
	void vmethod5458(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.method5537(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(ILrr;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class444 var8 = new class444();
		var8.field5037.method9078((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field5039.method9022(1.0F, 1.0F, 1.0F);
		var8.field5038.method9022((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class166.method4019();
		var9.method9115(var8);
		var9.method9172(var2);
		int var10 = (int)var9.method9127(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		boolean var14 = var6 != 0L && !Varcs.method2848(var6);
		boolean var16 = false;
		if (var14) {
			boolean var17 = ViewportMouse.ViewportMouse_isInViewport;
			if (var17) {
				boolean var18 = class179.method4147(this, var1, var3, var4, var5, var2, Rasterizer3D.getClipMidX(), Rasterizer3D.getClipMidY(), Rasterizer3D.get3dZoom());
				if (var18) {
					if (this.isSingleTile) {
						HorizontalAlignment.method4304(var6);
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
			var9.transformPoint(var20, var21, var22, field2873);
			var20 = field2873[0];
			var21 = field2873[1];
			var22 = field2873[2];
			var11 |= this.method5475(var19, var20, var21, var22, var10, var25, var26, var13);
		}

		var8.method8965();
		var9.method9104();

		try {
			this.draw0(var11, var16, this.isSingleTile, var6);
		} catch (Exception var24) {
		}

	}
}
