import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
public class class564 extends class522 implements class314 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final DemotingHashTable field5704;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	final AbstractArchive field5702;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 322588711
	)
	final int field5701;

	@ObfuscatedSignature(
		descriptor = "(Loy;ILqq;Lpx;)V"
	)
	public class564(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5704 = new DemotingHashTable(64);
		this.field5702 = var4;
		this.field5701 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "1217291460"
	)
	protected class524 vmethod11009(int var1) {
		synchronized(this.field5704) {
			class523 var2 = (class523)this.field5704.get((long)var1);
			if (var2 == null) {
				var2 = this.method11019(var1);
				this.field5704.method6953(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1850917223"
	)
	class523 method11019(int var1) {
		byte[] var2 = this.field5702.takeFile(this.field5701, var1);
		class523 var3 = new class523(var1);
		if (var2 != null) {
			var3.method10507(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-110"
	)
	public void method11011() {
		synchronized(this.field5704) {
			this.field5704.clear();
		}
	}

	public Iterator iterator() {
		return new class563(this);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lwe;B)Lri;",
		garbageValue = "0"
	)
	public static Bounds method11020(WorldEntityCoord var0, class582 var1) {
		int var2 = var1.field5800;
		int var3 = var1.field5803;
		int var4 = var1.field5798;
		int var5 = var1.field5802;
		int var6 = var0.getCurrentRotationAngle();
		int var7 = var0.getX();
		int var8 = var0.getY();
		double var9 = (double)WorldMapLabel.method6812(var6) / 65536.0D;
		int var15 = class532.field5477[var6 & 2047];
		double var13 = (double)var15 / 65536.0D;
		int var17 = (int)((double)var2 * var9 - (double)var3 * var13);
		int var18 = (int)((double)var3 * var9 + var13 * (double)var2);
		var7 += var17;
		var8 += var18;
		int var19 = (int)((double)var4 * var9 - var13 * (double)var5);
		int var20 = (int)((double)var5 * var9 + var13 * (double)var4);
		int var21 = (int)((double)var4 * var9 + (double)var5 * var13);
		int var22 = (int)(var9 * (double)var5 - var13 * (double)var4);
		int var23 = var7 - var19;
		int var24 = var8 + var20;
		int var25 = var7 + var21;
		int var26 = var8 + var22;
		int var27 = var7 + var19;
		int var28 = var8 - var20;
		int var29 = var7 - var21;
		int var30 = var8 - var22;
		int var31 = Math.min(var23, Math.min(var25, Math.min(var27, var29)));
		int var32 = Math.max(var23, Math.max(var25, Math.max(var27, var29)));
		int var33 = Math.min(var24, Math.min(var26, Math.min(var28, var30)));
		int var34 = Math.max(var24, Math.max(var26, Math.max(var28, var30)));
		return class279.method6309(var31, var33, var32 - var31 + 1, var34 - var33 + 1);
	}
}
