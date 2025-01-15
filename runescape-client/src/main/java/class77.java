import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class77 {
	@ObfuscatedName("ay")
	static final BigInteger field916;
	@ObfuscatedName("ah")
	static final BigInteger field917;

	static {
		field916 = new BigInteger("10001", 16);
		field917 = new BigInteger("86e8427690ebc5e5cc9b6b3336a1f7af648af5bcf44a8057b13a05934a356697924662f3dc12214aa0ddcb0030e0e53c3fc937e50424a85a5ae1ddfa7712e2971cbc0c6a7c1ed5a6602c4d838b3ec9cd663b6e065923456bc76ea9974bef518ddf4caac9e9cf6ae8090345598fd2f8c55ef7a2e8f01770582bf8cfcc4e668ae9", 16);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = ModelData0.method4806(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lna;II)V",
		garbageValue = "-1626286422"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3861 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3953 == null) {
				var0.field3953 = new int[var0.field3861.length];
			}

			var0.field3953[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1027046531"
	)
	static final void method2366(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2716()];
		float[] var3 = new float[Client.worldViewManager.method2716()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var6 = (WorldView)var5.next();
			var2[var4] = var6.id;
			var3[var4] = var6.scene.field2067;
		}

		class145.method3557(var3, var2);
		HashMap var46 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class492 var47 = Client.worldViewManager.method2720(var2[var4]);
				if (!var46.containsKey(var47)) {
					var46.put(var47, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var33 = var2[var4];
			class492 var7 = Client.worldViewManager.method2720(var33);
			Integer var8 = (Integer)var46.get(var7);
			if (var8 != null && var8.equals(var33)) {
				if (var7 == class492.field5092) {
					class231.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var33);
				} else if (var7 == class492.field5094) {
					int var9 = Canvas.getTileHeight(GameEngine.topLevelWorldView, class53.entity.getX(), class53.entity.getY(), class53.entity.getPlane());
					class426 var10 = Varps.method6964((float)class53.entity.getX(), (float)var9, (float)class53.entity.getY());
					int var12 = Buddy.cameraX;
					int var13 = Message.cameraY;
					int var14 = class31.cameraZ;
					float var15 = 1.0E-5F;
					class426 var16 = Varps.method6964((float)var12, (float)var13, (float)var14);
					class426 var17 = Varps.method6964(0.0F, (float)var9, 0.0F);
					class426 var18 = Varps.method6964(0.0F, 1.0F, 0.0F);
					class426 var20 = ViewportMouse.field2268;
					float var19 = var18.method8305(var20);
					class426 var11;
					float var23;
					if (Math.abs(var19) < 1.0E-5F) {
						var11 = null;
					} else {
						class426 var22 = class223.method5044(var16, var17);
						var23 = var18.method8305(var22);
						float var24 = -var23 / var19;
						if (var24 < 0.0F) {
							var11 = null;
						} else {
							var16.method8317();
							var17.method8317();
							var18.method8317();
							var22.method8317();
							class426 var27 = ViewportMouse.field2268;
							class426 var28;
							synchronized(class426.field4746) {
								if (class426.field4742 == 0) {
									var28 = new class426(var27);
								} else {
									class426.field4746[--class426.field4742].method8316(var27);
									var28 = class426.field4746[class426.field4742];
								}
							}

							var28.method8327(var24);
							class426 var29;
							synchronized(class426.field4746) {
								if (class426.field4742 == 0) {
									var29 = new class426(var16);
								} else {
									class426.field4746[--class426.field4742].method8316(var16);
									var29 = class426.field4746[class426.field4742];
								}
							}

							var29.method8297(var28);
							var11 = var29;
						}
					}

					if (var11 != null) {
						var16 = class223.method5044(var11, var10);
						var18 = class426.field4743;
						class426 var35;
						synchronized(class426.field4746) {
							if (class426.field4742 == 0) {
								var35 = new class426(var18);
							} else {
								class426.field4746[--class426.field4742].method8316(var18);
								var35 = class426.field4746[class426.field4742];
							}
						}

						var35.method8293(var16);
						class426 var36 = class426.field4745;
						float var37 = var35.method8305(var36);
						class426 var39 = class426.field4743;
						var23 = var39.method8305(var16);
						float var40 = (float)Math.atan2((double)var37, (double)var23);
						int var41 = (int)(2048.0D * ((double)var40 / 6.283185307179586D)) & 2047;
						int var42 = var41 + 64;
						var42 = (var42 & 2047) / 128;
						class231.insertMenuItem("Set heading", "", 60, var42, 0, 0, 0, false, var33);
						var16.method8317();
						var35.method8317();
						var11.method8317();
					}
				}
			}
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "647995674"
	)
	static boolean method2369(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		boolean var2 = var0 == LoginPacket.field1676 || var0 == -1 || ScriptFrame.method1231(var1);
		boolean var3;
		if (!var2) {
			var3 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
			var2 = var3;
		}

		var3 = var2;
		if (!var2) {
			boolean var4 = var1 == 1002 || var1 == 1003 || var1 == 1004;
			var3 = var4;
		}

		return var3;
	}
}
