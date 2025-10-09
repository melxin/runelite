import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class143 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "38"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class263.method5981(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ILjd;I)V",
		garbageValue = "-1321514816"
	)
	static void method3828(WorldView var0, int var1, Model var2) {
		boolean var3 = true;
		float var4 = (float)Client.viewportHeight / 334.0F;
		float var5 = (float)Client.viewportZoom * 4.0F / var4;
		int var6 = Math.max(512, (int)(1400.0F - var5));
		int var7 = Client.field484;
		double var8 = (double)class267.method6053(var1) / 65536.0D;
		int var10 = var7 - (int)((double)var6 * var8);
		int var11 = Client.field377 - (int)(class258.method5937(var1) * (double)var6);
		int var12 = var0.plane;
		int var13 = var10 >> 7;
		int var15 = var11 >> 7;
		long var16 = ClanChannelMember.calculateTag(var12, var13, var15, 5, false, -1, var0.id);
		var0.scene.drawEntity(var0.plane, var10, var11, Client.field572, 60, var2, var1, var16, false);
	}
}
