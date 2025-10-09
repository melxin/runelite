import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class139 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1689;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1707;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1708;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1688;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1705;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1693;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1694;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1695;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1696;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1697;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1698;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1699;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1700;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1701;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1690;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1703;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class139 field1692;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1894400737
	)
	static int field1691;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -887787047
	)
	final int field1704;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1610961501
	)
	final int field1706;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1433676745
	)
	final int field1702;

	static {
		field1689 = new class139(0, 0, (String)null, -1, -1);
		field1707 = new class139(1, 1, (String)null, 0, 2);
		field1708 = new class139(2, 2, (String)null, 1, 2);
		field1688 = new class139(3, 3, (String)null, 2, 2);
		field1705 = new class139(4, 4, (String)null, 3, 1);
		field1693 = new class139(5, 5, (String)null, 4, 1);
		field1694 = new class139(6, 6, (String)null, 5, 1);
		field1695 = new class139(7, 7, (String)null, 6, 3);
		field1696 = new class139(8, 8, (String)null, 7, 3);
		field1697 = new class139(9, 9, (String)null, 8, 3);
		field1698 = new class139(10, 10, (String)null, 0, 7);
		field1699 = new class139(11, 11, (String)null, 1, 7);
		field1700 = new class139(12, 12, (String)null, 2, 7);
		field1701 = new class139(13, 13, (String)null, 3, 7);
		field1690 = new class139(14, 14, (String)null, 4, 7);
		field1703 = new class139(15, 15, (String)null, 5, 7);
		field1692 = new class139(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class139(int var1, int var2, String var3, int var4, int var5) {
		this.field1704 = var1;
		this.field1706 = var2;
		this.field1702 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1706;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-18705777"
	)
	int method3807() {
		return this.field1702;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-112"
	)
	public static int method3809(int var0, int var1, int var2) {
		int var3 = class172.method4149(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "821286557"
	)
	static boolean method3814(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(IIILxl;I)V",
		garbageValue = "167413999"
	)
	static void method3815(int var0, int var1, int var2, SpritePixels var3) {
		int var4 = var2 * 128;
		var4 += Client.camAngleY;
		var4 &= 2047;
		byte var5 = 30;
		double var7 = (double)class267.method6053(var4) / 65536.0D;
		int var9 = var0 - (int)((double)var5 * var7);
		int var10 = var1 + (int)(class258.method5937(var4) * (double)var5);
		int var11 = Math.max(var3.subWidth, var3.subHeight);
		int var12 = var11 / 2;
		int var14 = var9 - var12;
		int var15 = var10 - var12;
		int var16 = var3.subWidth;
		int var17 = var3.subHeight;
		int var18 = var3.subWidth / 2;
		int var19 = var3.subHeight / 2;
		int var21 = var4 & 2047;
		float var20 = (float)((double)((float)var21 / 2048.0F) * 6.283185307179586D);
		var3.method11965(var14, var15, var16, var17, var18, var19, (double)var20, 256);
	}
}
