import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ah")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("at")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ac")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ap")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1626468919
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -598220801
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("as")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("al")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("au")
	@Export("strVals")
	public String[] strVals;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	DynamicArray field2065;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	DynamicArray field2076;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1136687181"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "1773897561"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readShortSmart();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readShortSmart();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readShortSmart();
					this.intVals[var3] = var1.readShortSmart();
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1961250368"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lti;",
		garbageValue = "2075308221"
	)
	public DynamicArray method4290() {
		if (this.field2065 == null) {
			int[] var2 = this.keys;
			DynamicArray var3 = new DynamicArray(class574.field5820, false);
			var3.array = var2;
			var3.size = var2.length * -698619497;
			var3.field5503 = var2.length;
			this.field2065 = var3;
		}

		return this.field2065;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lti;",
		garbageValue = "657796052"
	)
	public DynamicArray method4287() {
		if (this.field2076 == null) {
			if (this.outputType == 's') {
				this.field2076 = WorldMapSection1.method6858(this.strVals);
			} else {
				int[] var2 = this.intVals;
				DynamicArray var3 = new DynamicArray(class574.field5820, false);
				var3.array = var2;
				var3.size = var2.length * -698619497;
				var3.field5503 = var2.length;
				this.field2076 = var3;
			}
		}

		return this.field2076;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "134409544"
	)
	public static int method4308(CharSequence var0) {
		return StudioGame.method8195(var0, 10, true);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwb;S)V",
		garbageValue = "-16659"
	)
	static void method4307(Buffer var0) {
		while (true) {
			int var1 = var0.readUnsignedShort();
			if (var1 != 0) {
				if (var1 != 1) {
					if (var1 <= 49) {
						var0.readShort();
					}
					continue;
				}

				var0.readUnsignedByte();
			}

			return;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFIIIB)V",
		garbageValue = "-22"
	)
	static final void method4304(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!ViewportMouse.ViewportMouse_false0) {
			float var11 = 50.0F;
			float var12 = (float)AbstractRasterizer.method5050();
			float var13 = var11 * (float)(ViewportMouse.ViewportMouse_x - var4) / (float)var6;
			float var14 = (float)(ViewportMouse.ViewportMouse_y - var5) * var11 / (float)var6;
			float var15 = (float)(ViewportMouse.ViewportMouse_x - var4) * var12 / (float)var6;
			float var16 = (float)(ViewportMouse.ViewportMouse_y - var5) * var12 / (float)var6;
			float var18 = var11 * var0 + var1 * var14;
			var11 = class265.method5963(var14, var11, var1, var0);
			float var19 = var1 * var16 + var12 * var0;
			var12 = class265.method5963(var16, var12, var1, var0);
			float var17 = SoundCache.method3130(var13, var11, var3, var2);
			float var20 = var2 * var13 + var3 * var11;
			var13 = var17;
			var17 = SoundCache.method3130(var15, var12, var3, var2);
			float var21 = var15 * var2 + var12 * var3;
			class405.method8273((int)var13, (int)var18, (int)var20, (int)var17, (int)var19, (int)var21);
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1650531523"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		ObjectSound.updateItemPile2(HttpHeaders.worldView, var0, var1, var2);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1739685858"
	)
	static final int method4305() {
		float var0 = 200.0F * ((float)class36.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
