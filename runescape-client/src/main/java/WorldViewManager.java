import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static Fonts field995;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = 1249372231
	)
	static int field1000;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("ab")
	final HashMap field994;
	@ObfuscatedName("ac")
	final HashMap field993;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	class514 field996;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	class512 field997;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1437111785
	)
	int field999;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field994 = new HashMap(16);
		this.field993 = new HashMap(16);
		this.field999 = 0;
		this.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldj;",
		garbageValue = "-107"
	)
	WorldView method2309(int var1, int var2, int var3) {
		this.worldView = this.method2310(-1, var1, var2, var3, class215.field2460);
		return this.worldView;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;B)Ldj;",
		garbageValue = "101"
	)
	WorldView method2310(int var1, int var2, int var3, int var4, class215 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field999;
		return var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1559351787"
	)
	void method2311(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.method2312(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "2058815225"
	)
	void method2312(WorldView var1) {
		if (var1 != null) {
			this.field994.remove(var1.id);
			this.field993.remove(var1.id);
			var1.method2641();
			var1.remove();
			--this.field999;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ldj;",
		garbageValue = "-385981111"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ldj;",
		garbageValue = "-656714051"
	)
	WorldView method2314() {
		return this.worldView;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ldj;",
		garbageValue = "713153204"
	)
	WorldView method2315() {
		return this.getWorldView(Client.field326);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Ldj;",
		garbageValue = "1052432634"
	)
	WorldView method2316(int var1, int var2) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Ltz;",
		garbageValue = "1028984052"
	)
	WorldEntity method2317(int var1) {
		return (WorldEntity)this.method2314().worldEntities.get((long)var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ltz;",
		garbageValue = "-23"
	)
	WorldEntity method2318() {
		return (WorldEntity)this.method2314().worldEntities.get((long)Client.field326);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lrm;",
		garbageValue = "2004382639"
	)
	class448 method2363() {
		WorldView var1 = this.method2315();
		Player var2 = var1.method2627(Client.localPlayerIndex);
		class448 var3 = AttackOption.method2761(var1, var2.getY(), var2.getPlane());
		var3.field5060 = (float)var2.getX();
		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1208930073"
	)
	int method2320() {
		return this.field999;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltx;Lte;B)V",
		garbageValue = "124"
	)
	void method2321(class514 var1, class512 var2) {
		this.field996 = var1;
		this.field997 = var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILtx;Lte;I)V",
		garbageValue = "-663102578"
	)
	void method2350(int var1, class514 var2, class512 var3) {
		this.field994.put(var1, var2);
		this.field993.put(var1, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1361153612"
	)
	void method2344(int var1) {
		this.field994.remove(var1);
		this.field993.remove(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltx;",
		garbageValue = "-128"
	)
	class514 method2355(int var1) {
		class514 var2 = (class514)this.field994.get(var1);
		return var2 != null ? var2 : this.field996;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lte;",
		garbageValue = "-27"
	)
	class512 method2313(int var1) {
		class512 var2 = (class512)this.field993.get(var1);
		return var2 != null ? var2 : this.field997;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1897604562"
	)
	@Export("clear")
	void clear() {
		Iterator var1 = this.worldViews.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.method2312(var2);
		}

		this.worldViews.clear();
		this.field999 = 0;
		this.field994.clear();
		this.field993.clear();
		this.field996 = class514.field5394;
		this.field997 = class512.field5377;
		if (this.worldView != null) {
			this.worldView.method2628();
			this.worldViews.put(this.worldView, -1L);
			this.field999 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;IIB)Ljava/lang/String;",
		garbageValue = "61"
	)
	public static String method2348(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = (CharSequence)var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = (CharSequence)var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = (CharSequence)var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "521539138"
	)
	static void method2364() {
		class484.compass = null;
		class141.redHintArrowSprite = null;
		Bounds.mapSceneSprites = null;
		Message.headIconPkSprites = null;
		HttpMethod.headIconPrayerSprites = null;
		class389.headIconHintSprites = null;
		class48.mapDotSprites = null;
		class360.crossSprites = null;
		AsyncRestClient.field62 = null;
		class393.scrollBarSprites = null;
		Tiles.field820 = null;
	}
}
