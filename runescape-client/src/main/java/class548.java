import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
public abstract class class548 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1060272487
	)
	int field5566;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2110684937
	)
	int field5563;
	@ObfuscatedName("ag")
	double field5565;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1001667867
	)
	int field5564;

	class548(int var1, int var2) {
		this.field5566 = 0;
		this.field5563 = 0;
		this.field5565 = 0.0D;
		this.field5564 = 0;
		this.field5566 = var1;
		this.field5563 = 0;
		this.field5564 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5565 = class198.method4387((long)this.field5563, (long)this.field5566, Tile.method4883(this.field5564));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1370001777"
	)
	public void method10669() {
		if (this.field5563 < this.field5566) {
			++this.field5563;
			this.field5565 = class198.method4387((long)this.field5563, (long)this.field5566, Tile.method4883(this.field5564));
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1216070505"
	)
	double method10664() {
		return this.field5565;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ltn;",
		garbageValue = "1117916046"
	)
	static DynamicArray method10667(int var0, Object var1) {
		DynamicArray var2 = (DynamicArray)var1;
		if (var2 == null) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIILcw;I)Lrm;",
		garbageValue = "-1410502272"
	)
	static class448 method10668(int var0, int var1, int var2, int var3, WorldViewManager var4) {
		class448 var5 = null;
		WorldView var6 = null;
		if (class381.method8158(var0)) {
			boolean var8 = var0 > 0;
			Object var7;
			int var9;
			if (var8) {
				var9 = var0 - 1;
				int var10 = var9;
				Iterator var21 = var4.iterator();

				WorldView var20;
				while (true) {
					if (var21.hasNext()) {
						WorldView var22 = (WorldView)var21.next();
						if (var22.npcs.get((long)var10) == null) {
							continue;
						}

						var20 = var22;
						break;
					}

					var20 = var4.method2314();
					break;
				}

				var6 = var20;
				var7 = (Actor)var20.npcs.get((long)var10);
			} else {
				var9 = class27.method414(var0);
				Iterator var11 = var4.iterator();

				WorldView var15;
				while (true) {
					if (var11.hasNext()) {
						WorldView var12 = (WorldView)var11.next();
						Player var13 = (Player)var12.players.get((long)var9);
						if (var13 == null || var12.id == -1) {
							continue;
						}

						var15 = var12;
						break;
					}

					var15 = var4.method2314();
					break;
				}

				var6 = var15;
				var7 = var15.method2627(var9);
			}

			if (var7 != null) {
				Coord var16 = ((Actor)var7).method2400(var6);
				class448 var23;
				synchronized(class448.field5055) {
					if (class448.field5061 == 0) {
						var23 = new class448();
					} else {
						class448.field5055[--class448.field5061].method9024();
						var23 = class448.field5055[class448.field5061];
					}
				}

				var5 = var23;
				var23.field5059 = (float)var16.x;
				var23.field5054 = (float)var16.y;
			}
		}

		if (var5 == null) {
			var6 = var4.method2316(var1, var2);
			int var17 = var1 - var6.baseX;
			int var19 = var2 - var6.baseY;
			WorldEntity var24 = (WorldEntity)var4.method2314().worldEntities.get((long)var6.id);
			if (var24 != null) {
				var5 = var24.method10109(Coord.method7396(var17), Coord.method7396(var19));
			} else {
				var5 = ClientPreferences.method2599((float)Coord.method7396(var17), 0.0F, (float)Coord.method7396(var19));
			}
		}

		var5.field5060 = (float)class88.method2838(var6, (int)var5.field5059, (int)var5.field5054, var3);
		return var5;
	}
}
