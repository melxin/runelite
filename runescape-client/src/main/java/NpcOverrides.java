import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 7439184828842411303L
	)
	public long field2093;
	@ObfuscatedName("aw")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("at")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ac")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ap")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2093 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "81"
	)
	static boolean method4322(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-56"
	)
	static final int method4321(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
