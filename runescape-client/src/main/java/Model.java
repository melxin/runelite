import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("an")
	static final float field2927;
	@ObfuscatedName("aa")
	static boolean[] field2904;
	@ObfuscatedName("am")
	static boolean[] field2881;
	@ObfuscatedName("ah")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ag")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("au")
	static float[] field2884;
	@ObfuscatedName("ar")
	static int[] field2885;
	@ObfuscatedName("ad")
	static int[] field2886;
	@ObfuscatedName("af")
	static int[] field2907;
	@ObfuscatedName("ak")
	static int[] field2914;
	@ObfuscatedName("az")
	static char[] field2889;
	@ObfuscatedName("aw")
	static char[][] field2890;
	@ObfuscatedName("at")
	static int[] field2891;
	@ObfuscatedName("ae")
	static int[][] field2892;
	@ObfuscatedName("av")
	static int[] field2945;
	@ObfuscatedName("ao")
	static int[] field2894;
	@ObfuscatedName("as")
	static int[] field2887;
	@ObfuscatedName("ax")
	static boolean field2896;
	@ObfuscatedName("ab")
	static int[] field2897;
	@ObfuscatedName("aq")
	static int[] field2898;
	@ObfuscatedName("ay")
	static int[] field2899;
	@ObfuscatedName("ba")
	static int[] field2900;
	@ObfuscatedName("bx")
	static float[] field2901;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bi")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("bq")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2906;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2928;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static TransformationMatrix field2908;
	@ObfuscatedName("bw")
	static int[] field2909;
	@ObfuscatedName("bf")
	static int[] field2943;
	@ObfuscatedName("bj")
	static int[] field2911;
	@ObfuscatedName("bt")
	static float[] field2902;
	@ObfuscatedName("bd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bs")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bn")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bc")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bg")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("bb")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("bu")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bz")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("by")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("br")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("bk")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bh")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("bp")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ck")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cy")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ca")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("cr")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("cu")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("cd")
	public byte field2931;
	@ObfuscatedName("cl")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("cq")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ci")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cg")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("cx")
	int[][] field2877;
	@ObfuscatedName("cw")
	int[][] field2937;
	@ObfuscatedName("cz")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("cs")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ct")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cf")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ch")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cp")
	@Export("radius")
	int radius;
	@ObfuscatedName("ce")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("co")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	ModelColorOverride field2947;
	@ObfuscatedName("cn")
	short field2903;

	static {
		field2927 = PlayerUpdateManager.method2740(50);
		field2904 = new boolean[6500];
		field2881 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2884 = new float[6500];
		field2885 = new int[6500];
		field2886 = new int[6500];
		field2907 = new int[6500];
		field2914 = new int[6500];
		field2889 = new char[6000];
		field2890 = new char[6000][512];
		field2891 = new int[12];
		field2892 = new int[12][2000];
		field2945 = new int[2000];
		field2894 = new int[2000];
		field2887 = new int[12];
		field2896 = true;
		field2897 = Rasterizer3D.Rasterizer3D_sine;
		field2898 = Rasterizer3D.Rasterizer3D_cosine;
		field2899 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2900 = Rasterizer3D.field2641;
		field2901 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2906 = new TransformationMatrix();
		field2928 = new TransformationMatrix();
		field2908 = new TransformationMatrix();
		field2909 = new int[10];
		field2943 = new int[10];
		field2911 = new int[10];
		field2902 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2931 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2947 = null;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2931 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2947 = null;
		this.method5528(var1, var2, var3);
		this.field2931 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2931 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2947 = null;
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
		this.field2931 = var1.field2931;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljm;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2931 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2947 = null;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2931 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2931 == -1) {
					this.field2931 = var4.field2931;
				}
			}
		}

		this.method5528(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5530(var1[var3]);
		}

	}

	@ObfuscatedName("ap")
	void method5528(int var1, int var2, int var3) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	void method5529(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2931 != var1.field2931)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2931);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public void method5530(Model var1) {
		if (var1 != null) {
			this.method5529(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2931;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljm;"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljm;"
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
		descriptor = "(Z)Ljm;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZLjm;[B)Ljm;"
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
		var2.field2931 = this.field2931;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2877 = this.field2877;
		var2.field2937 = this.field2937;
		var2.isSingleTile = this.isSingleTile;
		var2.field2947 = this.field2947;
		var2.field2903 = this.field2903;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("au")
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
			int var9 = field2898[var1];
			int var10 = field2897[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var13 = this.verticesX[var11];
				int var14 = this.verticesZ[var11];
				int var12 = var14 * var10 + var13 * var9 >> 16;
				int var16 = this.verticesY[var11];
				int var17 = MusicPatchNode.method7149(this.verticesX[var11], this.verticesZ[var11], var9, var10);
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
		descriptor = "(I)Ljz;"
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

	@ObfuscatedName("ad")
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

	@ObfuscatedName("af")
	void method5555() {
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

	@ObfuscatedName("ak")
	public int method5572() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("az")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V"
	)
	public void method5542(class143 var1, int var2) {
		Skeleton var3 = var1.field1669;
		class242 var4 = var3.method5173();
		if (var4 != null) {
			var3.method5173().method5103(var1, var2);
			this.method5544(var3.method5173(), var1.method3592());
		}

		if (var1.method3596()) {
			this.method5543(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V"
	)
	void method5543(class143 var1, int var2) {
		Skeleton var3 = var1.field1669;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1667 != null && var1.field1667[var4] != null && var1.field1667[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class136 var6 = var1.field1667[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3526(var2) * 255.0F);
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
		descriptor = "(Ljp;I)V"
	)
	void method5544(class242 var1, int var2) {
		this.method5567(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljk;ILjk;I[I)V"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljx;Lfj;I[ZZZ)V"
	)
	public void method5546(Skeleton var1, class143 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class242 var7 = var1.method5173();
		if (var7 != null) {
			var7.method5110(var2, var3, var4, var5);
			if (var6) {
				this.method5544(var7, var2.method3592());
			}
		}

		if (!var5 && var2.method3596()) {
			this.method5543(var2, var3);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I[IZ)V"
	)
	public void method5547(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ab")
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
								var15 = field2897[var14];
								var16 = field2898[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2897[var12];
								var16 = field2898[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2897[var13];
								var16 = field2898[var13];
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

	@ObfuscatedName("aq")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ay")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("ba")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bx")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2897[var1];
		int var3 = field2898[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bl")
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

	@ObfuscatedName("bv")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5555();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2897[var1];
		int var11 = field2898[var1];
		int var12 = field2897[var2];
		int var13 = field2898[var2];
		int var14 = field2897[var3];
		int var15 = field2898[var3];
		int var16 = field2897[var4];
		int var17 = field2898[var4];
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
			field2885[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2884[var19] = PlayerUpdateManager.method2740(var22);
			if (this.faceTextures != null) {
				field2886[var19] = var20;
				field2907[var19] = var23;
				field2914[var19] = var22;
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
			this.method5555();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2897[var1];
		int var12 = field2898[var1];
		int var13 = field2897[var2];
		int var14 = field2898[var2];
		int var15 = field2897[var3];
		int var16 = field2898[var3];
		int var17 = field2897[var4];
		int var18 = field2898[var4];
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
			field2885[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2884[var20] = PlayerUpdateManager.method2740(var8);
			if (this.faceTextures != null) {
				field2886[var20] = var21;
				field2907[var20] = var24;
				field2914[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bm")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method5136()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method5025()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method5016()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = VerticalAlignment.method4229();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = class140.method3589();
							boolean var33 = var9 != 0L;
							boolean var34;
							if (var33) {
								var34 = (int)(var9 >>> 19 & 1L) == 1;
								var33 = !var34;
							}

							var34 = false;
							int var38;
							int var44;
							int var48;
							if (var33 && var31) {
								boolean var35 = false;
								if (field2896) {
									boolean var36;
									if (!class140.method3589()) {
										var36 = false;
									} else {
										class217.method4695(var2, var3, var4, var5);
										var36 = Messages.method2806(this, var1, var6, var7, var8);
									}

									var35 = var36;
								} else {
									var48 = var12 - var13;
									if (var48 <= 50) {
										var48 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var48;
									} else {
										var17 /= var14;
										var16 /= var48;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var48;
									} else {
										var21 /= var14;
										var23 /= var48;
									}

									var44 = var28 - Rasterizer3D.getClipMidX();
									var38 = var29 - Rasterizer3D.getClipMidY();
									if (var44 > var16 && var44 < var17 && var38 > var23 && var38 < var21) {
										var35 = true;
									}
								}

								if (var35) {
									if (this.isSingleTile) {
										JagNetThread.method8173(var9);
									} else {
										var34 = true;
									}
								}
							}

							int var47 = Rasterizer3D.getClipMidX();
							var48 = Rasterizer3D.getClipMidY();
							var44 = 0;
							var38 = 0;
							if (var1 != 0) {
								var44 = field2897[var1];
								var38 = field2898[var1];
							}

							for (int var39 = 0; var39 < this.verticesCount; ++var39) {
								int var40 = this.verticesX[var39];
								int var41 = this.verticesY[var39];
								int var42 = this.verticesZ[var39];
								int var43;
								if (var1 != 0) {
									var43 = var42 * var44 + var40 * var38 >> 16;
									var42 = var42 * var38 - var40 * var44 >> 16;
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
								var25 |= this.method5621(var39, var40, var43, var42, var12, var47, var48, var27);
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9);
							} catch (Exception var46) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("be")
	boolean method5621(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2885[var1] = var4 - var5;
		if (var8) {
			field2886[var1] = var2;
			field2907[var1] = var3;
			field2914[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2884[var1] = PlayerUpdateManager.method2740(var4);
			return false;
		} else {
			modelViewportXs[var1] = -5000;
			return true;
		}
	}

	@ObfuscatedName("bo")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2889[var6] = 0;
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
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
						if (var2) {
							var28 = modelViewportYs[var8];
							var29 = modelViewportYs[var9];
							var17 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var35;
							if (var18 < var28 && var18 < var29 && var18 < var17) {
								var35 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var28 && var18 > var29 && var18 > var17) {
									var35 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var35 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var35 = false;
										} else {
											var35 = true;
										}
									}
								}
							}

							if (var35) {
								JagNetThread.method8173(var4);
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var13 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2881[var7] = false;
							var14 = Rasterizer3D.method5071();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
								field2904[var7] = false;
							} else {
								field2904[var7] = true;
							}

							var28 = (field2885[var8] + field2885[var9] + field2885[var10]) / 3 + this.radius;
							field2890[var28][field2889[var28]++] = var7;
						}
					} else {
						var14 = field2886[var8];
						var28 = field2886[var9];
						var29 = field2886[var10];
						var17 = field2907[var8];
						var18 = field2907[var9];
						int var30 = field2907[var10];
						var20 = field2914[var8];
						int var21 = field2914[var9];
						int var22 = field2914[var10];
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
							field2881[var7] = true;
							int var26 = (field2885[var8] + field2885[var9] + field2885[var10]) / 3 + this.radius;
							field2890[var26][field2889[var26]++] = var7;
						}
					}
				}
			}

			boolean var31 = this.field2947 != null && this.field2947.method5714() && !Rasterizer3D.clips.field2990.method5714();
			short var32 = this.field2903;
			if (var31) {
				Rasterizer3D.clips.field2990.method5711(this.field2947);
			} else {
				this.field2903 = (short)this.indicesCount;
			}

			char[] var27;
			char var33;
			if (this.faceRenderPriorities == null) {
				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var33 = field2889[var9];
					if (var33 > 0) {
						var27 = field2890[var9];

						for (var12 = 0; var12 < var33; ++var12) {
							this.drawFace(var27[var12]);
						}
					}
				}

				this.field2903 = var32;
				if (var31) {
					Rasterizer3D.clips.field2990.method5713();
				}

			} else {
				for (var9 = 0; var9 < 12; ++var9) {
					field2891[var9] = 0;
					field2887[var9] = 0;
				}

				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var33 = field2889[var9];
					if (var33 > 0) {
						var27 = field2890[var9];

						for (var12 = 0; var12 < var33; ++var12) {
							char var34 = var27[var12];
							byte var36 = this.faceRenderPriorities[var34];
							var28 = field2891[var36]++;
							field2892[var36][var28] = var34;
							if (var36 < 10) {
								int[] var37 = field2887;
								var37[var36] += var9;
							} else if (var36 == 10) {
								field2945[var28] = var9;
							} else {
								field2894[var28] = var9;
							}
						}
					}
				}

				var9 = 0;
				if (field2891[1] > 0 || field2891[2] > 0) {
					var9 = (field2887[1] + field2887[2]) / (field2891[1] + field2891[2]);
				}

				var10 = 0;
				if (field2891[3] > 0 || field2891[4] > 0) {
					var10 = (field2887[3] + field2887[4]) / (field2891[3] + field2891[4]);
				}

				var11 = 0;
				if (field2891[6] > 0 || field2891[8] > 0) {
					var11 = (field2887[8] + field2887[6]) / (field2891[8] + field2891[6]);
				}

				var13 = 0;
				var14 = field2891[10];
				int[] var15 = field2892[10];
				int[] var16 = field2945;
				if (var13 == var14) {
					var13 = 0;
					var14 = field2891[11];
					var15 = field2892[11];
					var16 = field2894;
				}

				if (var13 < var14) {
					var12 = var16[var13];
				} else {
					var12 = -1000;
				}

				for (var17 = 0; var17 < 10; ++var17) {
					while (var17 == 0 && var12 > var9) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2892[11]) {
							var13 = 0;
							var14 = field2891[11];
							var15 = field2892[11];
							var16 = field2894;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 3 && var12 > var10) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2892[11]) {
							var13 = 0;
							var14 = field2891[11];
							var15 = field2892[11];
							var16 = field2894;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 5 && var12 > var11) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2892[11]) {
							var13 = 0;
							var14 = field2891[11];
							var15 = field2892[11];
							var16 = field2894;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					var18 = field2891[var17];
					int[] var19 = field2892[var17];

					for (var20 = 0; var20 < var18; ++var20) {
						this.drawFace(var19[var20]);
					}
				}

				while (var12 != -1000) {
					this.drawFace(var15[var13++]);
					if (var13 == var14 && var15 != field2892[11]) {
						var13 = 0;
						var15 = field2892[11];
						var14 = field2891[11];
						var16 = field2894;
					}

					if (var13 < var14) {
						var12 = var16[var13];
					} else {
						var12 = -1000;
					}
				}

				this.field2903 = var32;
				if (var31) {
					Rasterizer3D.clips.field2990.method5713();
				}

			}
		}
	}

	@ObfuscatedName("bw")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2881[var1]) {
			this.method5565(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2904[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5649(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2884[var2], field2884[var3], field2884[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bf")
	boolean method5563(int var1) {
		return var1 < this.field2903;
	}

	@ObfuscatedName("bj")
	final void method5649(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2886[var18], field2886[var15], field2886[var16], field2907[var18], field2907[var15], field2907[var16], field2914[var18], field2914[var15], field2914[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2886[var18], field2886[var15], field2886[var16], field2907[var18], field2907[var15], field2907[var16], field2914[var18], field2914[var15], field2914[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5563(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2899[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2899[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bt")
	final void method5565(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2914[var5];
		int var9 = field2914[var6];
		int var10 = field2914[var7];
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
			field2909[var4] = modelViewportXs[var5];
			field2943[var4] = modelViewportYs[var5];
			field2902[var4] = field2884[var7];
			field2911[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2886[var5];
			var12 = field2907[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2900[var10 - var8] * (50 - var8);
				field2909[var4] = var2 + (var11 + ((field2886[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2902[var4] = field2927;
				field2911[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2900[var9 - var8] * (50 - var8);
				field2909[var4] = var2 + (var11 + ((field2886[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2902[var4] = field2927;
				field2911[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2909[var4] = modelViewportXs[var6];
			field2943[var4] = modelViewportYs[var6];
			field2902[var4] = field2884[var7];
			field2911[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2886[var6];
			var12 = field2907[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2900[var8 - var9] * (50 - var9);
				field2909[var4] = var2 + (var11 + ((field2886[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2902[var4] = field2927;
				field2911[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2900[var10 - var9] * (50 - var9);
				field2909[var4] = var2 + (var11 + ((field2886[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2911[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2909[var4] = modelViewportXs[var7];
			field2943[var4] = modelViewportYs[var7];
			field2902[var4] = field2884[var7];
			field2911[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2886[var7];
			var12 = field2907[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2900[var9 - var10] * (50 - var10);
				field2909[var4] = var2 + (var11 + ((field2886[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2902[var4] = field2927;
				field2911[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2900[var8 - var10] * (50 - var10);
				field2909[var4] = var2 + (var11 + ((field2886[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2943[var4] = var3 + (var12 + ((field2907[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2902[var4] = field2927;
				field2911[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2909[0];
		var12 = field2909[1];
		var13 = field2909[2];
		var14 = field2943[0];
		int var15 = field2943[1];
		int var16 = field2943[2];
		float var17 = field2902[0];
		float var18 = field2902[1];
		float var19 = field2902[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method5071();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5649(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2911[0], field2911[1], field2911[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2909[3] < 0 || field2909[3] > var20) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2886[var25], field2886[var22], field2886[var23], field2907[var25], field2907[var22], field2907[var23], field2914[var25], field2914[var22], field2914[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2943[3], var11, var13, field2909[3], var17, var19, field2902[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2886[var25], field2886[var22], field2886[var23], field2907[var25], field2907[var22], field2907[var23], field2914[var25], field2914[var22], field2914[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2911[0], field2911[1], field2911[2], field2886[var25], field2886[var22], field2886[var23], field2907[var25], field2907[var22], field2907[var23], field2914[var25], field2914[var22], field2914[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2943[3], var11, var13, field2909[3], var17, var19, field2902[3], field2911[0], field2911[2], field2911[3], field2886[var25], field2886[var22], field2886[var23], field2907[var25], field2907[var22], field2907[var23], field2914[var25], field2914[var22], field2914[var23], var26);
				}
			} else {
				boolean var21 = this.method5563(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2899[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterTriangle(var14, var16, field2943[3], var11, var13, field2909[3], var17, var19, field2902[3], var22);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2899[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2943[3], var11, var13, field2909[3], var17, var19, field2902[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2911[0], field2911[1], field2911[2]);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2943[3], var11, var13, field2909[3], 0.0F, 0.0F, 0.0F, field2911[0], field2911[2], field2911[3]);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2911[0], field2911[1], field2911[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2943[3], var11, var13, field2909[3], var17, var19, field2902[3], field2911[0], field2911[2], field2911[3]);
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILrz;)V"
	)
	void method5566(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4984[0] * var3 + var2.field4984[4] * var4 + var2.field4984[8] * var5 + var2.field4984[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4984[1] * var3 + var2.field4984[5] * var4 + var2.field4984[9] * var5 + var2.field4984[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4984[2] * var3 + var2.field4984[6] * var4 + var2.field4984[10] * var5 + var2.field4984[14] * var6));
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V"
	)
	void method5567(class242 var1, int var2) {
		if (this.field2877 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2877[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2937[var3];
					field2906.method8777();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class133 var8 = var1.method5102(var7);
						if (var8 != null) {
							field2928.method8779((float)var5[var6] / 255.0F);
							field2908.method8778(var8.method3482(var2));
							field2908.method8782(field2928);
							field2906.method8781(field2908);
						}
					}

					this.method5566(var3, field2906);
				}
			}

		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljw;S)V"
	)
	public void method5661(ModelColorOverride var1, short var2) {
		if (this.field2947 == null) {
			this.field2947 = new ModelColorOverride();
		}

		this.field2947.method5711(var1);
		this.field2903 = var2;
	}

	@ObfuscatedName("bc")
	public void method5611() {
		this.field2947 = null;
	}

	@ObfuscatedName("ed")
	void vmethod5557(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(ILrz;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class441 var8 = new class441();
		var8.field4951.method8740((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4948.method8688(1.0F, 1.0F, 1.0F);
		var8.field4946.method8688((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class231.method4854();
		var9.method8791(var8);
		var9.method8782(var2);
		int var10 = (int)var9.method8793(0.0F, 0.0F, 0.0F);
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
		int var20;
		int var21;
		int var22;
		int var31;
		if (var15 && class140.method3589()) {
			boolean var17;
			if (!class140.method3589()) {
				var17 = false;
			} else {
				if (!ViewportMouse.ViewportMouse_false0) {
					byte var19 = 50;
					var20 = AbstractRasterizer.method5136();
					var21 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var19 / Rasterizer3D.get3dZoom();
					var22 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var19 / Rasterizer3D.get3dZoom();
					int var23 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var20 / Rasterizer3D.get3dZoom();
					int var24 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var20 / Rasterizer3D.get3dZoom();
					TransformationMatrix var25 = WallDecoration.method5858(var2);
					var25.method8787();
					float[] var26 = new float[3];
					var25.transformPoint((float)var21, (float)var22, (float)var19, var26);
					var21 = (int)var26[0];
					var22 = (int)var26[1];
					var31 = (int)var26[2];
					var25.transformPoint((float)var23, (float)var24, (float)var20, var26);
					var23 = (int)var26[0];
					var24 = (int)var26[1];
					var20 = (int)var26[2];
					var25.method8772();
					class188.method4104(var21, var22, var31, var23, var24, var20);
				}

				var17 = Messages.method2806(this, var1, var3, var4, var5);
			}

			if (var17) {
				if (this.isSingleTile) {
					JagNetThread.method8173(var6);
				} else {
					var16 = true;
				}
			}
		}

		int var30 = Rasterizer3D.getClipMidX();
		int var27 = Rasterizer3D.getClipMidY();

		for (var31 = 0; var31 < this.verticesCount; ++var31) {
			var20 = this.verticesX[var31];
			var21 = this.verticesY[var31];
			var22 = this.verticesZ[var31];
			var9.transformPoint((float)var20, (float)var21, (float)var22, field2901);
			var20 = (int)field2901[0];
			var21 = (int)field2901[1];
			var22 = (int)field2901[2];
			var11 |= this.method5621(var31, var20, var21, var22, var10, var30, var27, var13);
		}

		var8.method8634();
		var9.method8772();

		try {
			this.draw0(var11, var16, this.isSingleTile, var6);
		} catch (Exception var29) {
		}

	}
}
