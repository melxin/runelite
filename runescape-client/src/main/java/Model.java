import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ah")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ao")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static TransformationMatrix field2242;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static TransformationMatrix field2189;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static TransformationMatrix field2190;
	@ObfuscatedName("bg")
	static boolean[] field2204;
	@ObfuscatedName("bc")
	static boolean[] field2224;
	@ObfuscatedName("bv")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bq")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ba")
	static float[] field2187;
	@ObfuscatedName("bk")
	static int[] field2247;
	@ObfuscatedName("bs")
	static int[] field2229;
	@ObfuscatedName("bj")
	static int[] field2230;
	@ObfuscatedName("bo")
	static int[] field2231;
	@ObfuscatedName("bn")
	static char[] field2233;
	@ObfuscatedName("br")
	static char[][] field2201;
	@ObfuscatedName("bl")
	static int[] field2235;
	@ObfuscatedName("cb")
	static int[][] field2234;
	@ObfuscatedName("cn")
	static int[] field2209;
	@ObfuscatedName("cc")
	static int[] field2238;
	@ObfuscatedName("co")
	static int[] field2256;
	@ObfuscatedName("ca")
	static int[] field2240;
	@ObfuscatedName("cg")
	static int[] field2258;
	@ObfuscatedName("cp")
	static int[] field2227;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cy")
	static float[] field2243;
	@ObfuscatedName("cu")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cq")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cf")
	static boolean field2215;
	@ObfuscatedName("cl")
	static int[] field2250;
	@ObfuscatedName("cw")
	static int[] field2251;
	@ObfuscatedName("cj")
	static int[] field2213;
	@ObfuscatedName("cx")
	static int[] field2259;
	@ObfuscatedName("cv")
	static final float field2255;
	@ObfuscatedName("ch")
	static float[] field2261;
	@ObfuscatedName("ax")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("at")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ac")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("au")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("as")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aq")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("af")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("aa")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ak")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("al")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("av")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ag")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("aw")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ai")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ar")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("am")
	public byte field2212;
	@ObfuscatedName("ap")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ab")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("aj")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bu")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bh")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bw")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bb")
	int[][] field2260;
	@ObfuscatedName("bx")
	int[][] field2214;
	@ObfuscatedName("bd")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bi")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bz")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bt")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bf")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("by")
	@Export("radius")
	int radius;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("ck")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cs")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cm")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ce")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cr")
	public short field2193;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2242 = new TransformationMatrix();
		field2189 = new TransformationMatrix();
		field2190 = new TransformationMatrix();
		field2204 = new boolean[6500];
		field2224 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2187 = new float[6500];
		field2247 = new int[6500];
		field2229 = new int[6500];
		field2230 = new int[6500];
		field2231 = new int[6500];
		field2233 = new char[6000];
		field2201 = new char[6000][512];
		field2235 = new int[12];
		field2234 = new int[12][2000];
		field2209 = new int[2000];
		field2238 = new int[2000];
		field2256 = new int[12];
		field2240 = new int[10];
		field2258 = new int[10];
		field2227 = new int[10];
		field2243 = new float[10];
		field2215 = true;
		field2250 = Rasterizer3D.Rasterizer3D_sine;
		field2251 = Rasterizer3D.Rasterizer3D_cosine;
		field2213 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2259 = Rasterizer3D.field1953;
		field2255 = HttpResponse.method298(50);
		field2261 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2212 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2212 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.method4535(var1, var2, var3);
		this.field2212 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lhv;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2212 = 0;
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
		this.field2212 = var1.field2212;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Lhv;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2212 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2212 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2212 == -1) {
					this.field2212 = var4.field2212;
				}
			}
		}

		this.method4535(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method4553(var1[var3]);
		}

	}

	@ObfuscatedName("ay")
	void method4535(int var1, int var2, int var3) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhv;)V"
	)
	void method4536(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2212 != var1.field2212)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2212);
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhv;)V"
	)
	public void method4553(Model var1) {
		if (var1 != null) {
			this.method4536(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2212;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhv;"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhv;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhv;"
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
		descriptor = "(ZLhv;[B)Lhv;"
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
		var2.field2212 = this.field2212;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2260 = this.field2260;
		var2.field2214 = this.field2214;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
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
			int var9 = field2251[var1];
			int var10 = field2250[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var13 = this.verticesX[var11];
				int var14 = this.verticesZ[var11];
				int var12 = var13 * var9 + var10 * var14 >> 16;
				int var16 = this.verticesY[var11];
				int var17 = class499.method9540(this.verticesX[var11], this.verticesZ[var11], var9, var10);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;"
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

	@ObfuscatedName("ac")
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

	@ObfuscatedName("au")
	void method4544() {
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
	public int method4591() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ak")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lfl;I)V"
	)
	public void method4548(class144 var1, int var2) {
		Skeleton var3 = var1.field1641;
		class184 var4 = var3.method4168();
		if (var4 != null) {
			var3.method4168().method4110(var1, var2);
			this.method4550(var3.method4168(), var1.method3529());
		}

		if (var1.method3535()) {
			this.method4537(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfl;I)V"
	)
	void method4537(class144 var1, int var2) {
		Skeleton var3 = var1.field1641;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1639 != null && var1.field1639[var4] != null && var1.field1639[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class136 var6 = var1.field1639[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3454(var2) * 255.0F);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)V"
	)
	void method4550(class184 var1, int var2) {
		this.method4538(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhb;ILhb;I[I)V"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhu;Lfl;I[ZZZ)V"
	)
	public void method4552(Skeleton var1, class144 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class184 var7 = var1.method4168();
		if (var7 != null) {
			var7.method4111(var2, var3, var4, var5);
			if (var6) {
				this.method4550(var7, var2.method3529());
			}
		}

		if (!var5 && var2.method3535()) {
			this.method4537(var2, var3);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I[IZ)V"
	)
	public void method4598(Frames var1, int var2, int[] var3, boolean var4) {
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
								var15 = field2250[var14];
								var16 = field2251[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2250[var12];
								var16 = field2251[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2250[var13];
								var16 = field2251[var13];
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

	@ObfuscatedName("ab")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("aj")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bu")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bh")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2250[var1];
		int var3 = field2251[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bw")
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

	@ObfuscatedName("bb")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bx")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method4544();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2250[var1];
		int var11 = field2251[var1];
		int var12 = field2250[var2];
		int var13 = field2251[var2];
		int var14 = field2250[var3];
		int var15 = field2251[var3];
		int var16 = field2250[var4];
		int var17 = field2251[var4];
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
			field2247[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2187[var19] = HttpResponse.method298(var22);
			if (this.faceTextures != null) {
				field2229[var19] = var20;
				field2230[var19] = var23;
				field2231[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bd")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method4544();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2250[var1];
		int var12 = field2251[var1];
		int var13 = field2250[var2];
		int var14 = field2251[var2];
		int var15 = field2250[var3];
		int var16 = field2251[var3];
		int var17 = field2250[var4];
		int var18 = field2251[var4];
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
			field2247[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2187[var20] = HttpResponse.method298(var8);
			if (this.faceTextures != null) {
				field2229[var20] = var21;
				field2230[var20] = var24;
				field2231[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bi")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method4138()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4013()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method4012()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = PlayerUpdateManager.method3152();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = Login.method2449();
							boolean var33 = 0L != var9;
							boolean var34;
							if (var33) {
								var34 = (int)(var9 >>> 16 & 1L) == 1;
								var33 = !var34;
							}

							var34 = false;
							int var39;
							int var40;
							int var41;
							int var42;
							int var43;
							int var48;
							int var49;
							int var55;
							if (var33 && var31) {
								boolean var35 = false;
								if (field2215) {
									boolean var36;
									if (!Login.method2449()) {
										var36 = false;
									} else {
										class110.method3122(var2, var3, var4, var5);
										AABB var38 = this.getAABB(var1);
										var39 = var38.xMid + var6;
										var40 = var7 + var38.yMid;
										var41 = var8 + var38.zMid;
										var42 = var38.xMidOffset;
										var43 = var38.yMidOffset;
										int var44 = var38.zMidOffset;
										int var45 = ViewportMouse.field2267 - var39;
										int var46 = Huffman.field4034 - var40;
										int var47 = class169.field1804 - var41;
										if (Math.abs(var45) > var42 + WorldMapSprite.field3231) {
											var36 = false;
										} else if (Math.abs(var46) > var43 + class464.field4955) {
											var36 = false;
										} else if (Math.abs(var47) > var44 + UserComparator10.field1516) {
											var36 = false;
										} else if (Math.abs(var47 * class496.field5128 - var46 * CollisionMap.field2995) > var43 * UserComparator10.field1516 + var44 * class464.field4955) {
											var36 = false;
										} else if (Math.abs(var45 * CollisionMap.field2995 - var47 * ViewportMouse.field2262) > var42 * UserComparator10.field1516 + var44 * WorldMapSprite.field3231) {
											var36 = false;
										} else if (Math.abs(var46 * ViewportMouse.field2262 - var45 * class496.field5128) > var43 * WorldMapSprite.field3231 + var42 * class464.field4955) {
											var36 = false;
										} else {
											var36 = true;
										}
									}

									var35 = var36;
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

									var48 = var28 - Rasterizer3D.getClipMidX();
									var49 = var29 - Rasterizer3D.getClipMidY();
									if (var48 > var16 && var48 < var17 && var49 > var23 && var49 < var21) {
										var35 = true;
									}
								}

								if (var35) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var34 = true;
									}
								}
							}

							int var54 = Rasterizer3D.getClipMidX();
							var55 = Rasterizer3D.getClipMidY();
							var48 = 0;
							var49 = 0;
							if (var1 != 0) {
								var48 = field2250[var1];
								var49 = field2251[var1];
							}

							for (var39 = 0; var39 < this.verticesCount; ++var39) {
								var40 = this.verticesX[var39];
								var41 = this.verticesY[var39];
								var42 = this.verticesZ[var39];
								if (var1 != 0) {
									var43 = var42 * var48 + var40 * var49 >> 16;
									var42 = var42 * var49 - var40 * var48 >> 16;
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
								var25 |= this.method4566(var39, var40, var43, var42, var12, var54, var55, var27);
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9);
							} catch (Exception var53) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	boolean method4566(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2247[var1] = var4 - var5;
		if (var8) {
			field2229[var1] = var2;
			field2230[var1] = var3;
			field2231[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2187[var1] = HttpResponse.method298(var4);
			return false;
		} else {
			modelViewportXs[var1] = -5000;
			return true;
		}
	}

	@ObfuscatedName("bt")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2233[var6] = 0;
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
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2) {
							var15 = modelViewportYs[var8];
							var16 = modelViewportYs[var9];
							var30 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) {
								var37 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var30) {
									var37 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var37 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
								}
							}

							if (var37) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2224[var7] = false;
							var29 = Rasterizer3D.method4015();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field2204[var7] = false;
							} else {
								field2204[var7] = true;
							}

							var15 = (field2247[var8] + field2247[var9] + field2247[var10]) / 3 + this.radius;
							field2201[var15][field2233[var15]++] = var7;
						}
					} else {
						var29 = field2229[var8];
						var15 = field2229[var9];
						var16 = field2229[var10];
						var30 = field2230[var8];
						var18 = field2230[var9];
						int var19 = field2230[var10];
						int var20 = field2231[var8];
						int var21 = field2231[var9];
						int var22 = field2231[var10];
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
							field2224[var7] = true;
							int var26 = (field2247[var8] + field2247[var9] + field2247[var10]) / 3 + this.radius;
							field2201[var26][field2233[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2233[var33];
					if (var34 > 0) {
						var27 = field2201[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2235[var33] = 0;
					field2256[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2233[var33];
					if (var34 > 0) {
						var27 = field2201[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2235[var36]++;
							field2234[var36][var28] = var35;
							if (var36 < 10) {
								int[] var38 = field2256;
								var38[var36] += var33;
							} else if (var36 == 10) {
								field2209[var28] = var33;
							} else {
								field2238[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2235[1] > 0 || field2235[2] > 0) {
					var33 = (field2256[1] + field2256[2]) / (field2235[1] + field2235[2]);
				}

				var8 = 0;
				if (field2235[3] > 0 || field2235[4] > 0) {
					var8 = (field2256[3] + field2256[4]) / (field2235[3] + field2235[4]);
				}

				var9 = 0;
				if (field2235[6] > 0 || field2235[8] > 0) {
					var9 = (field2256[8] + field2256[6]) / (field2235[8] + field2235[6]);
				}

				var11 = 0;
				var12 = field2235[10];
				int[] var13 = field2234[10];
				int[] var14 = field2209;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2235[11];
					var13 = field2234[11];
					var14 = field2238;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2234[11]) {
							var11 = 0;
							var12 = field2235[11];
							var13 = field2234[11];
							var14 = field2238;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2234[11]) {
							var11 = 0;
							var12 = field2235[11];
							var13 = field2234[11];
							var14 = field2238;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2234[11]) {
							var11 = 0;
							var12 = field2235[11];
							var13 = field2234[11];
							var14 = field2238;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2235[var15];
					int[] var17 = field2234[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2234[11]) {
						var11 = 0;
						var13 = field2234[11];
						var12 = field2235[11];
						var14 = field2238;
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

	@ObfuscatedName("bf")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2224[var1]) {
			this.method4657(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2204[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method4546(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2187[var2], field2187[var3], field2187[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("by")
	boolean method4622(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2193;
	}

	@ObfuscatedName("bm")
	final void method4546(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2229[var18], field2229[var15], field2229[var16], field2230[var18], field2230[var15], field2230[var16], field2231[var18], field2231[var15], field2231[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2229[var18], field2229[var15], field2229[var16], field2230[var18], field2230[var15], field2230[var16], field2231[var18], field2231[var15], field2231[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method4622(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2213[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2213[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bp")
	final void method4657(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2231[var5];
		int var9 = field2231[var6];
		int var10 = field2231[var7];
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
			field2240[var4] = modelViewportXs[var5];
			field2258[var4] = modelViewportYs[var5];
			field2243[var4] = field2187[var7];
			field2227[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2229[var5];
			var12 = field2230[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2259[var10 - var8] * (50 - var8);
				field2240[var4] = var2 + (var11 + ((field2229[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2243[var4] = field2255;
				field2227[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2259[var9 - var8] * (50 - var8);
				field2240[var4] = var2 + (var11 + ((field2229[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2243[var4] = field2255;
				field2227[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2240[var4] = modelViewportXs[var6];
			field2258[var4] = modelViewportYs[var6];
			field2243[var4] = field2187[var7];
			field2227[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2229[var6];
			var12 = field2230[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2259[var8 - var9] * (50 - var9);
				field2240[var4] = var2 + (var11 + ((field2229[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2243[var4] = field2255;
				field2227[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2259[var10 - var9] * (50 - var9);
				field2240[var4] = var2 + (var11 + ((field2229[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2227[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2240[var4] = modelViewportXs[var7];
			field2258[var4] = modelViewportYs[var7];
			field2243[var4] = field2187[var7];
			field2227[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2229[var7];
			var12 = field2230[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2259[var9 - var10] * (50 - var10);
				field2240[var4] = var2 + (var11 + ((field2229[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2243[var4] = field2255;
				field2227[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2259[var8 - var10] * (50 - var10);
				field2240[var4] = var2 + (var11 + ((field2229[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4] = var3 + (var12 + ((field2230[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2243[var4] = field2255;
				field2227[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2240[0];
		var12 = field2240[1];
		var13 = field2240[2];
		var14 = field2258[0];
		int var15 = field2258[1];
		int var16 = field2258[2];
		float var17 = field2243[0];
		float var18 = field2243[1];
		float var19 = field2243[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method4015();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method4546(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2227[0], field2227[1], field2227[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2240[3] < 0 || field2240[3] > var20) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2229[var25], field2229[var22], field2229[var23], field2230[var25], field2230[var22], field2230[var23], field2231[var25], field2231[var22], field2231[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2258[3], var11, var13, field2240[3], var17, var19, field2243[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2229[var25], field2229[var22], field2229[var23], field2230[var25], field2230[var22], field2230[var23], field2231[var25], field2231[var22], field2231[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2227[0], field2227[1], field2227[2], field2229[var25], field2229[var22], field2229[var23], field2230[var25], field2230[var22], field2230[var23], field2231[var25], field2231[var22], field2231[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2258[3], var11, var13, field2240[3], var17, var19, field2243[3], field2227[0], field2227[2], field2227[3], field2229[var25], field2229[var22], field2229[var23], field2230[var25], field2230[var22], field2230[var23], field2231[var25], field2231[var22], field2231[var23], var26);
				}
			} else {
				boolean var21 = this.method4622(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2213[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.rasterTriangle(var14, var16, field2258[3], var11, var13, field2240[3], var17, var19, field2243[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2213[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2258[3], var11, var13, field2240[3], var17, var19, field2243[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2227[0], field2227[1], field2227[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2258[3], var11, var13, field2240[3], 0.0F, 0.0F, 0.0F, field2227[0], field2227[2], field2227[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2227[0], field2227[1], field2227[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2258[3], var11, var13, field2240[3], var17, var19, field2243[3], field2227[0], field2227[2], field2227[3]);
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILqe;)V"
	)
	void method4555(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4761[0] * var3 + var2.field4761[4] * var4 + var2.field4761[8] * var5 + var2.field4761[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4761[1] * var3 + var2.field4761[5] * var4 + var2.field4761[9] * var5 + var2.field4761[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4761[2] * var3 + var2.field4761[6] * var4 + var2.field4761[10] * var5 + var2.field4761[14] * var6));
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)V"
	)
	void method4538(class184 var1, int var2) {
		if (this.field2260 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2260[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2214[var3];
					field2242.method8368();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class133 var8 = var1.method4108(var7);
						if (var8 != null) {
							field2189.method8375((float)var5[var6] / 255.0F);
							field2190.method8374(var8.method3403(var2));
							field2190.method8389(field2189);
							field2242.method8377(field2190);
						}
					}

					this.method4555(var3, field2242);
				}
			}

		}
	}

	@ObfuscatedName("eq")
	void vmethod4616(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(ILqe;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class422 var8 = new class422();
		var8.field4728.method8332((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4732.method8285(1.0F, 1.0F, 1.0F);
		var8.field4729.method8285((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = AbstractWorldMapData.method6389();
		var9.method8379(var8);
		var9.method8389(var2);
		int var10 = (int)var9.method8452(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		int var14 = Rasterizer3D.getClipMidX();
		int var15 = Rasterizer3D.getClipMidY();

		for (int var16 = 0; var16 < this.verticesCount; ++var16) {
			int var17 = this.verticesX[var16];
			int var18 = this.verticesY[var16];
			int var19 = this.verticesZ[var16];
			var9.transformPoint((float)var17, (float)var18, (float)var19, field2261);
			var17 = (int)field2261[0];
			var18 = (int)field2261[1];
			var19 = (int)field2261[2];
			var11 |= this.method4566(var16, var17, var18, var19, var10, var14, var15, var13);
		}

		boolean var22 = Login.method2449();
		if (var22) {
			boolean var24 = var6 != 0L;
			if (var24) {
				boolean var25 = (int)(var6 >>> 16 & 1L) == 1;
				var24 = !var25;
			}

			var22 = var24;
		}

		boolean var23 = var22;
		var8.method8253();
		var9.method8373();

		try {
			this.draw0(var11, var23, this.isSingleTile, var6);
		} catch (Exception var21) {
		}

	}
}
