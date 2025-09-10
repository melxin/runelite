import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("aw")
	final HashMap field1014;
	@ObfuscatedName("at")
	final HashMap field1009;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	class518 field1017;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	class516 field1011;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -216031703
	)
	int field1013;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field1014 = new HashMap(16);
		this.field1009 = new HashMap(16);
		this.field1013 = 0;
		this.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldr;",
		garbageValue = "524163268"
	)
	WorldView method2380(int var1, int var2, int var3) {
		this.worldView = this.method2363(-1, var1, var2, var3, class217.field2512);
		return this.worldView;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIILio;I)Ldr;",
		garbageValue = "-1150538650"
	)
	WorldView method2363(int var1, int var2, int var3, int var4, class217 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field1013;
		return var6;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-78"
	)
	void method2376(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.method2341(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-1952370542"
	)
	void method2341(WorldView var1) {
		if (var1 != null) {
			this.field1014.remove(var1.id);
			this.field1009.remove(var1.id);
			var1.method2686();
			var1.remove();
			--this.field1013;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ldr;",
		garbageValue = "-895060527"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ldr;",
		garbageValue = "1914949692"
	)
	public WorldView method2343() {
		return this.worldView;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ldr;",
		garbageValue = "2029947527"
	)
	WorldView method2348() {
		return this.getWorldView(Client.field346);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Ldr;",
		garbageValue = "-172649369"
	)
	WorldView method2345(int var1, int var2) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltj;",
		garbageValue = "-104"
	)
	WorldEntity method2346(int var1) {
		return (WorldEntity)this.method2343().worldEntities.get((long)var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ltj;",
		garbageValue = "1823470721"
	)
	WorldEntity method2347() {
		return (WorldEntity)this.method2343().worldEntities.get((long)Client.field346);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "798312635"
	)
	class452 method2361() {
		WorldView var1 = this.method2348();
		Player var2 = var1.method2683(Client.localPlayerIndex);
		class452 var3 = DynamicObject.method2010(var1, var2.getY(), var2.getPlane());
		var3.field5176 = (float)var2.getX();
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-980049304"
	)
	int method2349() {
		return this.field1013;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltb;Ltz;I)V",
		garbageValue = "1952238475"
	)
	void method2362(class518 var1, class516 var2) {
		this.field1017 = var1;
		this.field1011 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILtb;Ltz;B)V",
		garbageValue = "-10"
	)
	void method2351(int var1, class518 var2, class516 var3) {
		this.field1014.put(var1, var2);
		this.field1009.put(var1, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "67295533"
	)
	void method2393(int var1) {
		this.field1014.remove(var1);
		this.field1009.remove(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ltb;",
		garbageValue = "-1166056294"
	)
	class518 method2352(int var1) {
		class518 var2 = (class518)this.field1014.get(var1);
		return var2 != null ? var2 : this.field1017;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ltz;",
		garbageValue = "-1377775468"
	)
	class516 method2378(int var1) {
		class516 var2 = (class516)this.field1009.get(var1);
		return var2 != null ? var2 : this.field1011;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1841855457"
	)
	@Export("clear")
	void clear() {
		Iterator var1 = this.worldViews.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.method2341(var2);
		}

		this.worldViews.clear();
		this.field1013 = 0;
		this.field1014.clear();
		this.field1009.clear();
		this.field1017 = class518.field5493;
		this.field1011 = class516.field5485;
		if (this.worldView != null) {
			this.worldView.method2681();
			this.worldViews.put(this.worldView, -1L);
			this.field1013 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lff;FZI)F",
		garbageValue = "191954913"
	)
	static float method2395(class138 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3697() != 0) {
			float var4 = (float)var0.field1673[0].field1612;
			float var5 = (float)var0.field1673[var0.method3697() - 1].field1612;
			float var6 = var5 - var4;
			if (0.0F == var6) {
				return var0.field1673[0].field1606;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1659 == class136.field1644) {
						if (var9 != 0.0F) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1659 != class136.field1642 && var0.field1659 != class136.field1643) {
						if (var0.field1659 == class136.field1641) {
							var10 = var4 - var1;
							var13 = var0.field1673[0].field1605;
							var14 = var0.field1673[0].field1603;
							var3 = var0.field1673[0].field1606;
							if (var13 != 0.0F) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1660 == class136.field1644) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1660 != class136.field1642 && var0.field1660 != class136.field1643) {
					if (var0.field1660 == class136.field1641) {
						var10 = var1 - var5;
						var13 = var0.field1673[var0.method3697() - 1].field1613;
						var14 = var0.field1673[var0.method3697() - 1].field1608;
						var3 = var0.field1673[var0.method3697() - 1].field1606;
						if (0.0F != var13) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = UserComparator6.method3592(var0, var10);
				float var15;
				if (var2 && var0.field1659 == class136.field1643) {
					var15 = var0.field1673[var0.method3697() - 1].field1606 - var0.field1673[0].field1606;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1660 == class136.field1643) {
					var15 = var0.field1673[var0.method3697() - 1].field1606 - var0.field1673[0].field1606;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lti;Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-65"
	)
	public static String method2396(DynamicArray var0, String var1) {
		class328.method7046(var0, class574.field5824);
		int var2 = var0.method10322();
		String[] var3 = (String[])((String[])var0.method10321());
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			return var3[0];
		} else {
			int var4 = var1.length();
			int var5 = var4 * (var2 - 1);

			for (int var6 = 0; var6 < var2; ++var6) {
				var5 += var3[var6].length();
			}

			char[] var9 = new char[var5];
			int var7 = 0;

			for (int var8 = 0; var8 < var2; ++var8) {
				if (var8 > 0) {
					var1.getChars(0, var4, var9, var7);
					var7 += var4;
				}

				var3[var8].getChars(0, var3[var8].length(), var9, var7);
				var7 += var3[var8].length();
			}

			return new String(var9);
		}
	}
}
