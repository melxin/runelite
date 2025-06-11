import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("World")
public class World {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 642460741
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2061487393
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("am")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ah")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ao")
	static int[] field617;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1876409233
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1101765481
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -608310465
	)
	@Export("population")
	int population;
	@ObfuscatedName("af")
	@Export("host")
	String host;
	@ObfuscatedName("ak")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 674314283
	)
	@Export("location")
	int location;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1101409511
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	String field626;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-751950885"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class571.field5642.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1487297400"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class571.field5627.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-512890185"
	)
	boolean method1443() {
		return (class571.field5648.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2004348249"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class571.field5629.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-221401747"
	)
	boolean method1445() {
		return (class571.field5630.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1010782609"
	)
	boolean method1446() {
		return (class571.field5656.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "831723289"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class571.field5652.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "108"
	)
	boolean method1455() {
		return (class571.field5657.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1191091695"
	)
	boolean method1474() {
		return (class571.field5635.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-895676329"
	)
	boolean method1450() {
		return (class571.field5633.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhy;",
		garbageValue = "0"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIILcj;I)Lre;",
		garbageValue = "62497297"
	)
	static class445 method1493(int var0, int var1, int var2, int var3, WorldViewManager var4) {
		class445 var5 = null;
		WorldView var6 = null;
		if (WorldMapData_0.method6147(var0)) {
			boolean var8 = var0 > 0;
			Object var7;
			int var9;
			if (var8) {
				var9 = class446.method8755(var0);
				var6 = Widget.method7887(var9, var4);
				var7 = (Actor)var6.npcs.get((long)var9);
			} else {
				var9 = -var0 - 1;
				int var10 = var9;
				Iterator var12 = var4.iterator();

				WorldView var11;
				while (true) {
					if (var12.hasNext()) {
						WorldView var13 = (WorldView)var12.next();
						Player var14 = (Player)var13.players.get((long)var10);
						if (var14 == null || var13.id == -1) {
							continue;
						}

						var11 = var13;
						break;
					}

					var11 = var4.method2221();
					break;
				}

				var6 = var11;
				var7 = var11.method2532(var10);
			}

			if (var7 != null) {
				Coord var15 = ((Actor)var7).method2308(var6);
				var5 = class70.method2210();
				var5.field4967 = (float)var15.x;
				var5.field4969 = (float)var15.y;
			}
		}

		if (var5 == null) {
			var6 = var4.method2233(var1, var2);
			int var16 = var1 - var6.baseX;
			int var17 = var2 - var6.baseY;
			WorldEntity var18 = (WorldEntity)var4.method2221().worldEntities.get((long)var6.id);
			if (var18 != null) {
				var5 = var18.method9718(Coord.method7242(var16), Coord.method7242(var17));
			} else {
				var5 = class47.method1781((float)Coord.method7242(var16), 0.0F, (float)Coord.method7242(var17));
			}
		}

		var5.field4971 = (float)class364.method7313(var6, (int)var5.field4967, (int)var5.field4969, var3);
		return var5;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;IIB)V",
		garbageValue = "0"
	)
	static void method1454(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
