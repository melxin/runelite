import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class88 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1234;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1235;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1250;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1244;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1238;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1239;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1240;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1241;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1242;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1243;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1236;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1245;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1246;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("field1390")
	static final class88 field1390;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1248;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class88 field1249;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1895118089
	)
	int field1237;

	static {
		field1234 = new class88(0);
		field1235 = new class88(1);
		field1250 = new class88(2);
		field1244 = new class88(3);
		field1238 = new class88(4);
		field1239 = new class88(5);
		field1240 = new class88(6);
		field1241 = new class88(7);
		field1242 = new class88(8);
		field1243 = new class88(9);
		field1236 = new class88(10);
		field1245 = new class88(11);
		field1246 = new class88(12);
		field1390 = new class88(13);
		field1248 = new class88(14);
		field1249 = new class88(15);
	}

	class88(int var1) {
		this.field1237 = var1;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	static boolean method2839() {
		return (Client.drawPlayerNames & 4) != 0;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIII)I",
		garbageValue = "-1367961424"
	)
	static int method2838(WorldView var0, int var1, int var2, int var3) {
		int var4 = class477.getTileHeight(var0, var1, var2, var3);
		WorldEntity var5 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var0.id);
		if (var5 != null) {
			var4 += class477.getTileHeight(class7.topLevelWorldView, var5.getY(), var5.getPlane(), var5.getX());
		}

		return var4;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	static final void method2837(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2320()];
		float[] var3 = new float[Client.worldViewManager.method2320()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var35 = (WorldView)var5.next();
			var2[var4] = var35.id;
			var3[var4] = var35.scene.field2701;
		}

		PcmPlayer.method3052(var3, var2, 0, var3.length - 1);
		HashMap var36 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class514 var37 = Client.worldViewManager.method2355(var2[var4]);
				if (!var36.containsKey(var37)) {
					var36.put(var37, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class514 var7 = Client.worldViewManager.method2355(var6);
			Integer var8 = (Integer)var36.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class514.field5394) {
					ClanSettings.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class514.field5397) {
					int var9 = Client.viewportWidth / 2;
					int var10 = Client.viewportHeight / 2;
					int var11 = Client.viewportZoom;
					Scene var13 = class7.topLevelWorldView.scene;
					int var14 = Client.field352;
					int var15 = Language.cameraX;
					int var16 = WorldMapCacheName.cameraY;
					int var17 = class66.cameraZ;
					float var18 = 1.0E-5F;
					UserComparator3.method3523();
					class114.method3411(var13.field2729, var13.field2698, var13.field2724, var13.field2668, var9, var10, var11);
					class448 var19 = ClientPreferences.method2599(0.0F, 1.0F, 0.0F);
					float var20 = class190.method4290(var19, ViewportMouse.field2905);
					class448 var12;
					class448 var21;
					class448 var22;
					float var23;
					if (Math.abs(var20) < 1.0E-5F) {
						var19.method9038();
						var12 = null;
					} else {
						var21 = ClientPreferences.method2599((float)var15, (float)var16, (float)var17);
						var22 = ClientPreferences.method2599(var21.field5059, var21.field5060 - (float)var14, var21.field5054);
						var23 = -class190.method4290(var19, var22) / var20;
						var19.method9038();
						if (var23 < 0.0F) {
							var22.method9038();
							var21.method9038();
							var12 = null;
						} else {
							class448 var25 = ViewportMouse.field2905;
							class448 var26 = class85.method2788(var25);
							var26.method9032(var23);
							class448 var27 = class366.method7865(var21, var26);
							var26.method9038();
							var22.method9038();
							var21.method9038();
							var12 = var27;
						}
					}

					if (var12 != null) {
						var19 = ClientPreferences.method2599((float)Client.field581, (float)Client.field352, (float)Client.field492);
						var21 = class85.method2788(var12);
						var21.method9028(var19);
						var22 = class393.method8230(class448.field5056, var21);
						class448 var24 = class448.field5058;
						var23 = var22.method9060(var24);
						float var32 = (float)Math.atan2((double)var23, (double)class190.method4290(class448.field5056, var21));
						int var33 = (int)((double)var32 / 6.283185307179586D * 2048.0D) & 2047;
						int var29 = var33 + 64;
						int var28 = (var29 & 2047) / 128;
						ClanSettings.insertMenuItem("Set heading", "", 60, var28, 0, 0, 0, false, var6);
						var19.method9038();
						var21.method9038();
						var22.method9038();
						var12.method9038();
					}
				}
			}
		}

	}
}
