import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 54249359
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 449153759
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 610650211
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1034135405
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 930450957
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILka;B)Z",
		garbageValue = "-43"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method5649() {
		class197.field2022.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)Lql;",
		garbageValue = "1004011643"
	)
	public static class426 method5650(class426 var0) {
		synchronized(class426.field4765) {
			if (class426.field4762 == 0) {
				return new class426(var0);
			} else {
				class426.field4765[--class426.field4762].method8104(var0);
				return class426.field4765[class426.field4762];
			}
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(ILsh;Ldm;I)I",
		garbageValue = "2042462091"
	)
	static int method5646(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == class31.field153) {
			var3 = var2.plane;
		} else if (class31.field153 == -1) {
			var3 = var1.field5028;
		} else {
			WorldEntity var4 = HttpRequest.topLevelWorldView.worldEntities[class31.field153];
			WorldView var5 = var4.worldView;
			if (var5.plane == var4.field5028) {
				if (var0 == -1) {
					var3 = HttpRequest.topLevelWorldView.worldEntities[class31.field153].getPlane();
				} else {
					var3 = var1.field5028;
				}
			}
		}

		return var3;
	}
}
