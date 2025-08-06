import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vm")
public class class554 implements class464 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field5659;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	WorldView field5655;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 856467495
	)
	int field5658;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1515759517
	)
	int field5654;
	@ObfuscatedName("av")
	boolean field5657;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Liz;II)V",
		garbageValue = "-1826818520"
	)
	public void vmethod10923(SequenceDefinition var1, int var2) {
		if (this.field5655 != null) {
			WorldMapData_1.method6677(this.field5655, var1, var2, this.field5658, this.field5654, this.field5657);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIZB)V",
		garbageValue = "-72"
	)
	public void method10913(WorldView var1, int var2, int var3, boolean var4) {
		this.field5655 = var1;
		this.field5658 = var2;
		this.field5654 = var3;
		this.field5657 = var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	public void method10914() {
		this.field5655 = null;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-865395459"
	)
	static boolean method10912(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class81.worldView.scene;
		int var9;
		if (var5 == class393.field4711.field4707) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class70.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4270.id) {
					var8.renderable1 = new DynamicObject(class81.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class81.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class81.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class393.field4708.field4707) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class70.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4265.id && var3 != WorldMapDecorationType.field4266.id) {
					if (var3 == WorldMapDecorationType.field4267.id) {
						var10.renderable1 = new DynamicObject(class81.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4269.id) {
						var10.renderable1 = new DynamicObject(class81.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4282.id) {
						var10.renderable1 = new DynamicObject(class81.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class81.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class81.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class393.field4709.field4707) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4275.id) {
				var3 = WorldMapDecorationType.field4264.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class81.worldView, class70.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class393.field4710.field4707) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class81.worldView, class70.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
