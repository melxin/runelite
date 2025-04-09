import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class400 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static final class400 field4706;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4687;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4691;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4689;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4705;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4710;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4692;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4693;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4708;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4695;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4711;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4697;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4704;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4699;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4700;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4701;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4698;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4703;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4688;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4702;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4696;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4707;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4686;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class400 field4709;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static final class400 field4694;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static final class400 field4690;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1829358405
	)
	public final int field4712;

	static {
		field4706 = new class400(255);
		field4687 = new class400(0);
		field4691 = new class400(1);
		field4689 = new class400(2);
		field4705 = new class400(3);
		field4710 = new class400(4);
		field4692 = new class400(5);
		field4693 = new class400(6);
		field4708 = new class400(7);
		field4695 = new class400(8);
		field4711 = new class400(9);
		field4697 = new class400(10);
		field4704 = new class400(11);
		field4699 = new class400(12);
		field4700 = new class400(13);
		field4701 = new class400(14);
		field4698 = new class400(15);
		field4703 = new class400(17);
		field4688 = new class400(18);
		field4702 = new class400(19);
		field4696 = new class400(20);
		field4707 = new class400(21);
		field4686 = new class400(22);
		field4709 = new class400(23);
		field4694 = new class400(24);
		field4690 = new class400(25);
	}

	class400(int var1) {
		this.field4712 = var1;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "1499027712"
	)
	static boolean method7680(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = DevicePcmPlayerProvider.worldView.scene;
		int var9;
		if (var5 == class388.field4592.field4590) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = HttpMethod.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4134.id) {
					var8.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class388.field4587.field4590) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = HttpMethod.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4137.id && var3 != WorldMapDecorationType.field4145.id) {
					if (var3 == WorldMapDecorationType.field4139.id) {
						var10.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4148.id) {
						var10.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4141.id) {
						var10.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(DevicePcmPlayerProvider.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class388.field4588.field4590) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4142.id) {
				var3 = WorldMapDecorationType.field4152.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(DevicePcmPlayerProvider.worldView, HttpMethod.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class388.field4586.field4590) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(DevicePcmPlayerProvider.worldView, HttpMethod.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
