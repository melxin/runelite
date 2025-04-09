import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("as")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("aq")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -148134707
	)
	int field2538;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -884926897
	)
	int field2539;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1918226295
	)
	int field2545;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -846641599
	)
	int field2544;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 771834277
	)
	public int field2540;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	public Model field2533;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field2538 = -1;
		this.field2539 = -1;
		this.field2545 = -1;
		this.field2544 = -1;
		ItemComposition var2 = class231.ItemDefinition_get(var1);
		if (var2.method5557()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method5549()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field2540 = var2.model;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1118657125"
	)
	public boolean method4984() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1781288327"
	)
	public boolean method4990() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1908706895"
	)
	boolean method4986(int var1) {
		return var1 == 0 && this.field2538 != -1 || var1 == 1 && this.field2539 != -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-482368666"
	)
	boolean method4987(int var1) {
		return var1 == 0 && this.field2545 != -1 || var1 == 1 && this.field2544 != -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "269534391"
	)
	int method4988(int var1) {
		return var1 == 0 ? this.field2538 : this.field2539;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1493971593"
	)
	int method4993(int var1) {
		return var1 == 0 ? this.field2545 : this.field2544;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIS)Ljava/lang/String;",
		garbageValue = "132"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class433.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
