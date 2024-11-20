import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lja;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13 = var2.getFile(var11, 0);
				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1859345343"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-24"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class202.method4010(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-724466955"
	)
	static void method5162(AbstractArchive var0, int var1) {
		if ((var1 & class552.field5424.rsOrdinal()) != 0) {
			HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class552.field5454.rsOrdinal()) != 0) {
			HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class552.field5432.rsOrdinal()) != 0) {
			HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}
}
