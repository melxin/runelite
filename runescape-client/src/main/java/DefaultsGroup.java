import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final DefaultsGroup field5607;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final DefaultsGroup field5605;
	@ObfuscatedName("tf")
	static boolean field5608;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1966855345
	)
	@Export("group")
	final int group;

	static {
		field5607 = new DefaultsGroup(1);
		field5605 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lvt;B)Lrl;",
		garbageValue = "-101"
	)
	public static Bounds method10775(WorldEntityCoord var0, class564 var1) {
		int var2 = var1.field5848;
		int var3 = var1.field5844;
		int var4 = var1.field5851;
		int var5 = var1.field5847;
		int var6 = var0.getCurrentRotationAngle();
		int var7 = var0.getX();
		int var8 = var0.getY();
		double var9 = DevicePcmPlayerProvider.method332(var6);
		double var11 = (double)class66.method2206(var6) / 65536.0D;
		int var15 = (int)(var9 * (double)var2 - (double)var3 * var11);
		int var16 = (int)((double)var3 * var9 + var11 * (double)var2);
		var7 += var15;
		var8 += var16;
		int var17 = (int)(var9 * (double)var4 - var11 * (double)var5);
		int var18 = (int)(var11 * (double)var4 + (double)var5 * var9);
		int var19 = (int)(var9 * (double)var4 + (double)var5 * var11);
		int var20 = (int)((double)var5 * var9 - (double)var4 * var11);
		int var21 = var7 - var17;
		int var22 = var18 + var8;
		int var23 = var7 + var19;
		int var24 = var8 + var20;
		int var25 = var7 + var17;
		int var26 = var8 - var18;
		int var27 = var7 - var19;
		int var28 = var8 - var20;
		int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
		int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
		int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
		int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
		return AbstractArchive.method8678(var29, var31, var30 - var29 + 1, var32 - var31 + 1);
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1735725398"
	)
	static final void method10774(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		UserComparator3.method3718((double)var1);
	}
}
