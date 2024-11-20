import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("aw")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ae")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static TransformationMatrix field2882;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static TransformationMatrix field2850;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static TransformationMatrix field2819;
	@ObfuscatedName("bl")
	static boolean[] field2852;
	@ObfuscatedName("bi")
	static boolean[] field2869;
	@ObfuscatedName("bz")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bx")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("br")
	static float[] field2835;
	@ObfuscatedName("bq")
	static int[] field2857;
	@ObfuscatedName("bn")
	static int[] field2813;
	@ObfuscatedName("bd")
	static int[] field2859;
	@ObfuscatedName("bf")
	static int[] field2860;
	@ObfuscatedName("by")
	static char[] field2864;
	@ObfuscatedName("bs")
	static char[][] field2861;
	@ObfuscatedName("bc")
	static int[] field2820;
	@ObfuscatedName("cc")
	static int[][] field2865;
	@ObfuscatedName("ct")
	static int[] field2866;
	@ObfuscatedName("cy")
	static int[] field2873;
	@ObfuscatedName("cv")
	static int[] field2867;
	@ObfuscatedName("cq")
	static int[] field2868;
	@ObfuscatedName("cn")
	static int[] field2837;
	@ObfuscatedName("ck")
	static int[] field2840;
	@ObfuscatedName("cs")
	static float[] field2858;
	@ObfuscatedName("co")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ci")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cl")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("ca")
	static boolean field2876;
	@ObfuscatedName("ce")
	static int[] field2879;
	@ObfuscatedName("cw")
	static int[] field2880;
	@ObfuscatedName("cj")
	static int[] field2881;
	@ObfuscatedName("cu")
	static int[] field2885;
	@ObfuscatedName("ch")
	static final float field2884;
	@ObfuscatedName("cf")
	static float[] field2890;
	@ObfuscatedName("av")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("au")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("an")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("af")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ai")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("al")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ar")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("as")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("az")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ak")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ap")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ah")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ad")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ay")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ax")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("aa")
	public byte field2842;
	@ObfuscatedName("aq")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("am")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ag")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bw")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bm")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bv")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bt")
	int[][] field2856;
	@ObfuscatedName("bk")
	int[][] field2843;
	@ObfuscatedName("bb")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ba")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bp")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bo")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bu")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bj")
	@Export("radius")
	int radius;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cg")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cp")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cr")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cz")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cx")
	public short field2889;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2882 = new TransformationMatrix();
		field2850 = new TransformationMatrix();
		field2819 = new TransformationMatrix();
		field2852 = new boolean[6500];
		field2869 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2835 = new float[6500];
		field2857 = new int[6500];
		field2813 = new int[6500];
		field2859 = new int[6500];
		field2860 = new int[6500];
		field2864 = new char[6000];
		field2861 = new char[6000][512];
		field2820 = new int[12];
		field2865 = new int[12][2000];
		field2866 = new int[2000];
		field2867 = new int[2000];
		field2868 = new int[12];
		field2837 = new int[10];
		field2840 = new int[10];
		field2873 = new int[10];
		field2858 = new float[10];
		field2876 = true;
		field2879 = Rasterizer3D.Rasterizer3D_sine;
		field2880 = Rasterizer3D.Rasterizer3D_cosine;
		field2881 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2885 = Rasterizer3D.field2595;
		field2884 = Decimator.method1117(50);
		field2890 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2842 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2842 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.method5264(var1, var2, var3);
		this.field2842 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljt;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2842 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
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
		this.field2842 = var1.field2842;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljt;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2842 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2842 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2842 == -1) {
					this.field2842 = var4.field2842;
				}
			}
		}

		this.method5264(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5243(var1[var3]);
		}

	}

	@ObfuscatedName("ab")
	void method5264(int var1, int var2, int var3) {
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
		descriptor = "(Ljt;)V"
	)
	void method5292(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2842 != var1.field2842)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2842);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljt;)V"
	)
	public void method5243(Model var1) {
		if (var1 != null) {
			this.method5292(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2842;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljt;"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljt;"
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
		descriptor = "(Z)Ljt;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZLjt;[B)Ljt;"
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
		var2.field2842 = this.field2842;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2856 = this.field2856;
		var2.field2843 = this.field2843;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("av")
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
			int var9 = field2880[var1];
			int var10 = field2879[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var12 = Varcs.method3106(this.verticesX[var11], this.verticesZ[var11], var9, var10);
				int var13 = this.verticesY[var11];
				int var15 = this.verticesX[var11];
				int var16 = this.verticesZ[var11];
				int var14 = var9 * var16 - var10 * var15 >> 16;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljk;"
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

	@ObfuscatedName("an")
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

	@ObfuscatedName("as")
	void method5367() {
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

	@ObfuscatedName("az")
	public int method5389() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ak")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	public void method5255(class145 var1, int var2) {
		Skeleton var3 = var1.field1648;
		class241 var4 = var3.method4867();
		if (var4 != null) {
			var3.method4867().method4815(var1, var2);
			this.method5257(var3.method4867(), var1.method3405());
		}

		if (var1.method3406()) {
			this.method5322(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	void method5322(class145 var1, int var2) {
		Skeleton var3 = var1.field1648;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1644 != null && var1.field1644[var4] != null && var1.field1644[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class137 var6 = var1.field1644[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3349(var2) * 255.0F);
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
		descriptor = "(Ljs;I)V"
	)
	void method5257(class241 var1, int var2) {
		this.method5280(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljv;ILjv;I[I)V"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lfz;I[ZZZ)V"
	)
	public void method5363(Skeleton var1, class145 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class241 var7 = var1.method4867();
		if (var7 != null) {
			var7.method4818(var2, var3, var4, var5);
			if (var6) {
				this.method5257(var7, var2.method3405());
			}
		}

		if (!var5 && var2.method3406()) {
			this.method5322(var2, var3);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I[IZ)V"
	)
	public void method5260(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("am")
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
								var15 = field2879[var14];
								var16 = field2880[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2879[var12];
								var16 = field2880[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2879[var13];
								var16 = field2880[var13];
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

	@ObfuscatedName("ag")
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

	@ObfuscatedName("bv")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2879[var1];
		int var3 = field2880[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bt")
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

	@ObfuscatedName("bk")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bb")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method5367();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2879[var1];
		int var11 = field2880[var1];
		int var12 = field2879[var2];
		int var13 = field2880[var2];
		int var14 = field2879[var3];
		int var15 = field2880[var3];
		int var16 = field2879[var4];
		int var17 = field2880[var4];
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
			field2857[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2835[var19] = Decimator.method1117(var22);
			if (this.faceTextures != null) {
				field2813[var19] = var20;
				field2859[var19] = var23;
				field2860[var19] = var22;
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
			this.method5367();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2879[var1];
		int var12 = field2880[var1];
		int var13 = field2879[var2];
		int var14 = field2880[var2];
		int var15 = field2879[var3];
		int var16 = field2880[var3];
		int var17 = field2879[var4];
		int var18 = field2880[var4];
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
			field2857[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2835[var20] = Decimator.method1117(var8);
			if (this.faceTextures != null) {
				field2813[var20] = var21;
				field2859[var20] = var24;
				field2860[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bp")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method4835()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4712()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method4711()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = class155.method3495();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var34 = var9 != 0L;
							boolean var35;
							if (var34) {
								var35 = (int)(var9 >>> 16 & 1L) == 1;
								var34 = !var35;
							}

							var35 = false;
							int var41;
							int var42;
							int var43;
							int var44;
							int var50;
							int var54;
							int var55;
							if (var34 && var31) {
								boolean var36 = false;
								if (field2876) {
									boolean var39 = ViewportMouse.ViewportMouse_isInViewport;
									boolean var37;
									if (!var39) {
										var37 = false;
									} else {
										class113.method3069(var2, var3, var4, var5);
										AABB var40 = this.getAABB(var1);
										var41 = var40.xMid + var6;
										var42 = var7 + var40.yMid;
										var43 = var8 + var40.zMid;
										var44 = var40.xMidOffset;
										int var45 = var40.yMidOffset;
										int var46 = var40.zMidOffset;
										int var47 = class107.field1369 - var41;
										int var48 = Bounds.field4747 - var42;
										int var49 = class180.field1867 - var43;
										if (Math.abs(var47) > var44 + GrandExchangeOfferNameComparator.field4636) {
											var37 = false;
										} else if (Math.abs(var48) > var45 + Client.field815) {
											var37 = false;
										} else if (Math.abs(var49) > var46 + class146.field1657) {
											var37 = false;
										} else if (Math.abs(var49 * class289.field3175 - var48 * class1.field5) > var45 * class146.field1657 + var46 * Client.field815) {
											var37 = false;
										} else if (Math.abs(var47 * class1.field5 - var49 * class162.field1770) > var44 * class146.field1657 + var46 * GrandExchangeOfferNameComparator.field4636) {
											var37 = false;
										} else if (Math.abs(var48 * class162.field1770 - var47 * class289.field3175) > var45 * GrandExchangeOfferNameComparator.field4636 + var44 * Client.field815) {
											var37 = false;
										} else {
											var37 = true;
										}
									}

									var36 = var37;
								} else {
									var55 = var12 - var13;
									if (var55 <= 50) {
										var55 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var55;
									} else {
										var17 /= var14;
										var16 /= var55;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var55;
									} else {
										var21 /= var14;
										var23 /= var55;
									}

									var50 = var28 - Rasterizer3D.getClipMidX();
									var54 = var29 - Rasterizer3D.getClipMidY();
									if (var50 > var16 && var50 < var17 && var54 > var23 && var54 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.isSingleTile) {
										GrandExchangeEvents.method7682(var9);
									} else {
										var35 = true;
									}
								}
							}

							int var53 = Rasterizer3D.getClipMidX();
							var55 = Rasterizer3D.getClipMidY();
							var50 = 0;
							var54 = 0;
							if (var1 != 0) {
								var50 = field2879[var1];
								var54 = field2880[var1];
							}

							for (int var51 = 0; var51 < this.verticesCount; ++var51) {
								var41 = this.verticesX[var51];
								var42 = this.verticesY[var51];
								var43 = this.verticesZ[var51];
								if (var1 != 0) {
									var44 = var43 * var50 + var41 * var54 >> 16;
									var43 = var43 * var54 - var41 * var50 >> 16;
									var41 = var44;
								}

								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var5 * var41 >> 16;
								var43 = var5 * var43 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var3 * var42 - var43 * var2 >> 16;
								var43 = var42 * var2 + var3 * var43 >> 16;
								var25 |= this.method5273(var51, var41, var44, var43, var12, var53, var55, var27);
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9);
							} catch (Exception var52) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bo")
	boolean method5273(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2857[var1] = var4 - var5;
		if (var8) {
			field2813[var1] = var2;
			field2859[var1] = var3;
			field2860[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2835[var1] = Decimator.method1117(var4);
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
				field2864[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var28 = modelViewportXs[var10];
					int var29;
					if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) {
						var29 = field2813[var8];
						var15 = field2813[var9];
						var16 = field2813[var10];
						int var30 = field2859[var8];
						var18 = field2859[var9];
						int var19 = field2859[var10];
						int var20 = field2860[var8];
						int var21 = field2860[var9];
						int var22 = field2860[var10];
						var29 -= var15;
						var16 -= var15;
						var30 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var30 * var22 - var20 * var19;
						int var24 = var20 * var16 - var29 * var22;
						int var25 = var29 * var19 - var30 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2869[var7] = true;
							int var26 = (field2857[var8] + field2857[var9] + field2857[var10]) / 3 + this.radius;
							field2861[var26][field2864[var26]++] = var7;
						}
					} else {
						if (var2 && HttpRequest.method104(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2869[var7] = false;
							var29 = Rasterizer3D.method4780();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field2852[var7] = false;
							} else {
								field2852[var7] = true;
							}

							var15 = (field2857[var8] + field2857[var9] + field2857[var10]) / 3 + this.radius;
							field2861[var15][field2864[var15]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2864[var33];
					if (var34 > 0) {
						var27 = field2861[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2820[var33] = 0;
					field2868[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2864[var33];
					if (var34 > 0) {
						var27 = field2861[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2820[var36]++;
							field2865[var36][var28] = var35;
							if (var36 < 10) {
								int[] var37 = field2868;
								var37[var36] += var33;
							} else if (var36 == 10) {
								field2866[var28] = var33;
							} else {
								field2867[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2820[1] > 0 || field2820[2] > 0) {
					var33 = (field2868[1] + field2868[2]) / (field2820[1] + field2820[2]);
				}

				var8 = 0;
				if (field2820[3] > 0 || field2820[4] > 0) {
					var8 = (field2868[3] + field2868[4]) / (field2820[3] + field2820[4]);
				}

				var9 = 0;
				if (field2820[6] > 0 || field2820[8] > 0) {
					var9 = (field2868[8] + field2868[6]) / (field2820[8] + field2820[6]);
				}

				var11 = 0;
				var12 = field2820[10];
				int[] var13 = field2865[10];
				int[] var14 = field2866;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2820[11];
					var13 = field2865[11];
					var14 = field2867;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2865[11]) {
							var11 = 0;
							var12 = field2820[11];
							var13 = field2865[11];
							var14 = field2867;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2865[11]) {
							var11 = 0;
							var12 = field2820[11];
							var13 = field2865[11];
							var14 = field2867;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2865[11]) {
							var11 = 0;
							var12 = field2820[11];
							var13 = field2865[11];
							var14 = field2867;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2820[var15];
					int[] var17 = field2865[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2865[11]) {
						var11 = 0;
						var13 = field2865[11];
						var12 = field2820[11];
						var14 = field2867;
					}

					if (var11 < var12) {
						var10 = var14[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	@ObfuscatedName("bj")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2869[var1]) {
			this.method5336(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2852[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5277(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2835[var2], field2835[var3], field2835[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bh")
	boolean method5276(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2889;
	}

	@ObfuscatedName("bg")
	final void method5277(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2813[var18], field2813[var15], field2813[var16], field2859[var18], field2859[var15], field2859[var16], field2860[var18], field2860[var15], field2860[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2813[var18], field2813[var15], field2813[var16], field2859[var18], field2859[var15], field2859[var16], field2860[var18], field2860[var15], field2860[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5276(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2881[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2881[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bl")
	final void method5336(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2860[var5];
		int var9 = field2860[var6];
		int var10 = field2860[var7];
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
			field2837[var4] = modelViewportXs[var5];
			field2840[var4] = modelViewportYs[var5];
			field2858[var4] = field2835[var7];
			field2873[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2813[var5];
			var12 = field2859[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2885[var10 - var8] * (50 - var8);
				field2837[var4] = var2 + (var11 + ((field2813[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2858[var4] = field2884;
				field2873[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2885[var9 - var8] * (50 - var8);
				field2837[var4] = var2 + (var11 + ((field2813[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2858[var4] = field2884;
				field2873[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2837[var4] = modelViewportXs[var6];
			field2840[var4] = modelViewportYs[var6];
			field2858[var4] = field2835[var7];
			field2873[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2813[var6];
			var12 = field2859[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2885[var8 - var9] * (50 - var9);
				field2837[var4] = var2 + (var11 + ((field2813[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2858[var4] = field2884;
				field2873[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2885[var10 - var9] * (50 - var9);
				field2837[var4] = var2 + (var11 + ((field2813[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2873[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2837[var4] = modelViewportXs[var7];
			field2840[var4] = modelViewportYs[var7];
			field2858[var4] = field2835[var7];
			field2873[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2813[var7];
			var12 = field2859[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2885[var9 - var10] * (50 - var10);
				field2837[var4] = var2 + (var11 + ((field2813[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2858[var4] = field2884;
				field2873[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2885[var8 - var10] * (50 - var10);
				field2837[var4] = var2 + (var11 + ((field2813[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2840[var4] = var3 + (var12 + ((field2859[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2858[var4] = field2884;
				field2873[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2837[0];
		var12 = field2837[1];
		var13 = field2837[2];
		var14 = field2840[0];
		int var15 = field2840[1];
		int var16 = field2840[2];
		float var17 = field2858[0];
		float var18 = field2858[1];
		float var19 = field2858[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method4780();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5277(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2873[0], field2873[1], field2873[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2837[3] < 0 || field2837[3] > var20) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2813[var25], field2813[var22], field2813[var23], field2859[var25], field2859[var22], field2859[var23], field2860[var25], field2860[var22], field2860[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2840[3], var11, var13, field2837[3], var17, var19, field2858[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2813[var25], field2813[var22], field2813[var23], field2859[var25], field2859[var22], field2859[var23], field2860[var25], field2860[var22], field2860[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2873[0], field2873[1], field2873[2], field2813[var25], field2813[var22], field2813[var23], field2859[var25], field2859[var22], field2859[var23], field2860[var25], field2860[var22], field2860[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2840[3], var11, var13, field2837[3], var17, var19, field2858[3], field2873[0], field2873[2], field2873[3], field2813[var25], field2813[var22], field2813[var23], field2859[var25], field2859[var22], field2859[var23], field2860[var25], field2860[var22], field2860[var23], var26);
				}
			} else {
				boolean var21 = this.method5276(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2881[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.rasterTriangle(var14, var16, field2840[3], var11, var13, field2837[3], var17, var19, field2858[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2881[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2840[3], var11, var13, field2837[3], var17, var19, field2858[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2873[0], field2873[1], field2873[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2840[3], var11, var13, field2837[3], 0.0F, 0.0F, 0.0F, field2873[0], field2873[2], field2873[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2873[0], field2873[1], field2873[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2840[3], var11, var13, field2837[3], var17, var19, field2858[3], field2873[0], field2873[2], field2873[3]);
				}
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILqb;)V"
	)
	void method5279(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4777[0] * var3 + var2.field4777[4] * var4 + var2.field4777[8] * var5 + var2.field4777[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4777[1] * var3 + var2.field4777[5] * var4 + var2.field4777[9] * var5 + var2.field4777[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4777[2] * var3 + var2.field4777[6] * var4 + var2.field4777[10] * var5 + var2.field4777[14] * var6));
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V"
	)
	void method5280(class241 var1, int var2) {
		if (this.field2856 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2856[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2843[var3];
					field2882.method8211();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class134 var8 = var1.method4809(var7);
						if (var8 != null) {
							field2850.method8213((float)var5[var6] / 255.0F);
							field2819.method8212(var8.method3292(var2));
							field2819.method8216(field2850);
							field2882.method8215(field2819);
						}
					}

					this.method5279(var3, field2882);
				}
			}

		}
	}

	@ObfuscatedName("eo")
	void vmethod5270(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(ILqb;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class422 var8 = new class422();
		var8.field4744.method8164((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4746.method8103(1.0F, 1.0F, 1.0F);
		var8.field4745.method8103((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = MidiPcmStream.method6684();
		var9.method8217(var8);
		var9.method8216(var2);
		int var10 = (int)var9.method8227(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		int var14 = Rasterizer3D.getClipMidX();
		int var15 = Rasterizer3D.getClipMidY();

		for (int var16 = 0; var16 < this.verticesCount; ++var16) {
			int var17 = this.verticesX[var16];
			int var18 = this.verticesY[var16];
			int var19 = this.verticesZ[var16];
			var9.transformPoint((float)var17, (float)var18, (float)var19, field2890);
			var17 = (int)field2890[0];
			var18 = (int)field2890[1];
			var19 = (int)field2890[2];
			var11 |= this.method5273(var16, var17, var18, var19, var10, var14, var15, var13);
		}

		boolean var23 = ViewportMouse.ViewportMouse_isInViewport;
		boolean var24 = var23;
		if (var23) {
			boolean var26 = var6 != 0L;
			if (var26) {
				boolean var20 = (int)(var6 >>> 16 & 1L) == 1;
				var26 = !var20;
			}

			var24 = var26;
		}

		boolean var25 = var24;
		var8.method8054();
		var9.method8266();

		try {
			this.draw0(var11, var25, this.isSingleTile, var6);
		} catch (Exception var22) {
		}

	}
}
