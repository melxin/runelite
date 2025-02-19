import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class438 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	public class443 field4882;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	public class442 field4881;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	public class442 field4878;

	public class438() {
		this.field4882 = class433.method8185();
		this.field4881 = AbstractArchive.method7634();
		this.field4878 = EnumComposition.method3908(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	public void method8243() {
		this.field4882.method8366();
		this.field4881.method8341();
		this.field4878.method8341();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4882.hashCode();
		var3 = 31 * var3 + this.field4881.hashCode();
		var3 = var3 * 31 + this.field4878.hashCode();
		return var3;
	}

	public String toString() {
		return "[" + this.field4882.toString() + "|" + this.field4881.toString() + "|" + this.field4878.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class438)) {
			return false;
		} else {
			class438 var2 = (class438)var1;
			return this.field4882.equals(var2.field4882) && this.field4881.method8348(var2.field4881) && this.field4878.method8348(var2.field4878);
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "5209"
	)
	static final void method8247(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2533()];
		float[] var3 = new float[Client.worldViewManager.method2533()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var21 = (WorldView)var5.next();
			var2[var4] = var21.id;
			var3[var4] = var21.scene.field2737;
		}

		class290.method6197(var3, var2, 0, var3.length - 1);
		HashMap var22 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class505 var23 = Client.worldViewManager.method2536(var2[var4]);
				if (!var22.containsKey(var23)) {
					var22.put(var23, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class505 var7 = Client.worldViewManager.method2536(var6);
			Integer var8 = (Integer)var22.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class505.field5212) {
					WorldMapSprite.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class505.field5213) {
					class442 var9 = class161.method3617(Client.field648, class181.cameraX, GrandExchangeOfferUnitPriceComparator.cameraY, ApproximateRouteStrategy.cameraZ);
					if (var9 != null) {
						class442 var10 = EnumComposition.method3908((float)Client.field647, (float)Client.field648, (float)Client.field532);
						class442 var12 = WorldMapDecoration.method6284(var9);
						var12.method8295(var10);
						class442 var14 = class442.field4895;
						class442 var15 = WorldMapDecoration.method6284(var14);
						var15.method8305(var12);
						float var16 = (float)Math.atan2((double)MidiRequest.method6843(var15, class442.field4897), (double)MidiRequest.method6843(class442.field4895, var12));
						int var17 = (int)(2048.0D * ((double)var16 / 6.283185307179586D)) & 2047;
						int var20 = var17 + 64;
						int var19 = (var20 & 2047) / 128;
						WorldMapSprite.insertMenuItem("Set heading", "", 60, var19, 0, 0, 0, false, var6);
						var10.method8341();
						var12.method8341();
						var15.method8341();
						var9.method8341();
					}
				}
			}
		}

	}
}
