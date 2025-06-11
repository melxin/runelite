import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("aj")
	final HashMap field988;
	@ObfuscatedName("an")
	final HashMap field987;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	class508 field985;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	class506 field989;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 134623201
	)
	int field991;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field988 = new HashMap(16);
		this.field987 = new HashMap(16);
		this.field991 = 0;
		this.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldl;",
		garbageValue = "-8"
	)
	WorldView method2216(int var1, int var2, int var3) {
		this.worldView = this.method2222(-1, var1, var2, var3, class233.field2522);
		return this.worldView;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIILiz;I)Ldl;",
		garbageValue = "-501226202"
	)
	WorldView method2222(int var1, int var2, int var3, int var4, class233 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field991;
		return var6;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-49"
	)
	void method2272(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.method2219(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "1443339860"
	)
	void method2219(WorldView var1) {
		if (var1 != null) {
			this.field988.remove(var1.id);
			this.field987.remove(var1.id);
			var1.method2533().method8404();
			var1.remove();
			--this.field991;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Ldl;",
		garbageValue = "3211"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ldl;",
		garbageValue = "279587139"
	)
	public WorldView method2221() {
		return this.worldView;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ldl;",
		garbageValue = "-491115880"
	)
	WorldView method2263() {
		return this.getWorldView(Client.field337);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ldl;",
		garbageValue = "114"
	)
	WorldView method2233(int var1, int var2) {
		Iterator var3 = this.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			if (var4.id != -1) {
				int var5 = var4.baseX;
				int var6 = var4.baseY;
				int var7 = var5 + var4.sizeX;
				int var8 = var6 + var4.sizeY;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return this.worldView;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ltr;",
		garbageValue = "319536426"
	)
	WorldEntity method2261(int var1) {
		return (WorldEntity)this.method2221().worldEntities.get((long)var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ltr;",
		garbageValue = "-1875720281"
	)
	WorldEntity method2217() {
		return (WorldEntity)this.method2221().worldEntities.get((long)Client.field337);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "-1597310102"
	)
	class445 method2226() {
		WorldView var1 = this.method2263();
		Player var2 = var1.method2532(Client.localPlayerIndex);
		class445 var3 = IgnoreList.method9505(var1, var2.getY(), var2.getPlane());
		var3.field4971 = (float)var2.getX();
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-989361076"
	)
	int method2227() {
		return this.field991;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Ltv;B)V",
		garbageValue = "59"
	)
	void method2251(class508 var1, class506 var2) {
		this.field985 = var1;
		this.field989 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILtz;Ltv;B)V",
		garbageValue = "-108"
	)
	void method2229(int var1, class508 var2, class506 var3) {
		this.field988.put(var1, var2);
		this.field987.put(var1, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-116"
	)
	void method2230(int var1) {
		this.field988.remove(var1);
		this.field987.remove(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ltz;",
		garbageValue = "-2012698633"
	)
	class508 method2231(int var1) {
		class508 var2 = (class508)this.field988.get(var1);
		return var2 != null ? var2 : this.field985;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ltv;",
		garbageValue = "1410781430"
	)
	class506 method2260(int var1) {
		class506 var2 = (class506)this.field987.get(var1);
		return var2 != null ? var2 : this.field989;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "753635163"
	)
	@Export("clear")
	void clear() {
		this.worldViews.clear();
		this.field991 = 0;
		this.field988.clear();
		this.field987.clear();
		this.field985 = class508.field5283;
		this.field989 = class506.field5263;
		if (this.worldView != null) {
			this.worldView.method2530();
			this.worldViews.put(this.worldView, -1L);
			this.field991 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)Ltp;",
		garbageValue = "2076217381"
	)
	public static class509 method2276(Buffer var0) {
		int var1 = var0.readUnsignedShort();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.readUnsignedByte();
			int var4;
			if (var2 == 0) {
				int[] var8 = new int[var1];

				for (var4 = 0; var4 < var1; ++var4) {
					var8[var4] = var0.readInt();
				}

				class509 var5 = new class509(class563.field5600, false);
				var5.field5294 = var8;
				var5.field5287 = var8.length * 1090132113;
				var5.field5291 = var8.length;
				return var5;
			} else if (var2 == 1) {
				long[] var7 = new long[var1];

				for (var4 = 0; var4 < var1; ++var4) {
					var7[var4] = var0.readLong();
				}

				return class456.method9082(var7);
			} else if (var2 != 2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (var4 = 0; var4 < var1; ++var4) {
					var3[var4] = var0.readStringCp1252NullTerminated();
				}

				return ChatChannel.method2005(var3);
			}
		} else {
			throw new RuntimeException();
		}
	}
}
