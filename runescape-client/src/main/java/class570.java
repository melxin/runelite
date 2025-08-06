import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public class class570 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	public static final class570 field5721;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	public static final class570 field5724;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	public static final class570 field5718;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final class570 field5719;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1604297537
	)
	public final int field5720;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1304666281
	)
	public final int field5717;
	@ObfuscatedName("ah")
	public final Class field5722;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	final class565 field5723;

	static {
		field5721 = new class570(0, 0, Integer.class, new class566());
		field5724 = new class570(1, 1, Long.class, new class569());
		field5718 = new class570(3, 2, String.class, new class571());
		field5719 = new class570(2, 5, class515.class, new class567());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lvz;)V"
	)
	class570(int var1, int var2, Class var3, class565 var4) {
		this.field5720 = var1;
		this.field5717 = var2;
		this.field5722 = var3;
		this.field5723 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5717;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)Ljava/lang/Object;",
		garbageValue = "-1801513735"
	)
	public Object method11054(Buffer var1) {
		return this.field5723.vmethod11078(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvf;",
		garbageValue = "1511929578"
	)
	public static class570[] method11060() {
		return new class570[]{field5718, field5724, field5721, field5719};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lws;",
		garbageValue = "-28"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5729.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method11085(new Buffer(var2));
			}

			var1.method11087();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;B)V",
		garbageValue = "-46"
	)
	public static void method11055(Object var0, Buffer var1) {
		class565 var2 = method11065(var0.getClass());
		var2.vmethod11079(var0, var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lvz;",
		garbageValue = "-108982593"
	)
	static class565 method11065(Class var0) {
		class570[] var2 = method11060();
		int var3 = 0;

		class570 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null;
				break;
			}

			class570 var4 = var2[var3];
			if (var4.field5722 == var0) {
				var1 = var4;
				break;
			}

			++var3;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5723;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Ljava/lang/Object;I)V",
		garbageValue = "2120968168"
	)
	static void method11073(class570 var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5720) {
			case 0:
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (Integer)var1;
				break;
			case 3:
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
			}

		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Ljava/lang/String;B)V",
		garbageValue = "12"
	)
	static void method11072(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field480 += var2.groupCount;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIB)V",
		garbageValue = "1"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = ObjectComposition.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var15.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = Skills.calculateTag(var1, var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, class477.method9725(var0, Coord.method7396(var2), Coord.method7396(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
