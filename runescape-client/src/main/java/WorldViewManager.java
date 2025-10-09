import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field1001;
	@ObfuscatedName("oa")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("at")
	final HashMap field994;
	@ObfuscatedName("ag")
	final HashMap field1002;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	class516 field997;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	class514 field993;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1415636127
	)
	int field999;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field994 = new HashMap(16);
		this.field1002 = new HashMap(16);
		this.field999 = 0;
		this.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "-1551199473"
	)
	@Export("createWorldView")
	WorldView createWorldView(int var1, int var2, int var3) {
		this.worldView = this.createWorldView2(-1, var1, var2, var3, class216.field2511);
		return this.worldView;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIILir;I)Ldm;",
		garbageValue = "-1538458793"
	)
	@Export("createWorldView2")
	WorldView createWorldView2(int var1, int var2, int var3, int var4, class216 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field999;
		return var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1389879998"
	)
	@Export("removeWorldViewById")
	void removeWorldViewById(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.removeWorldView(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-199661605"
	)
	@Export("removeWorldView")
	void removeWorldView(WorldView var1) {
		if (var1 != null) {
			this.field994.remove(var1.id);
			this.field1002.remove(var1.id);
			var1.method2747();
			var1.remove();
			--this.field999;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ldm;",
		garbageValue = "808661968"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ldm;",
		garbageValue = "1443254763"
	)
	WorldView method2366() {
		return this.worldView;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ldm;",
		garbageValue = "-71975085"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.getWorldView(Client.currentWorldViewId);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Ldm;",
		garbageValue = "-1552023333"
	)
	WorldView method2368(int var1, int var2) {
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "-1277932507"
	)
	WorldEntity method2395(int var1) {
		return (WorldEntity)this.method2366().worldEntities.get((long)var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ltg;",
		garbageValue = "-1613873069"
	)
	WorldEntity method2396() {
		return (WorldEntity)this.method2366().worldEntities.get((long)Client.currentWorldViewId);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "211440506"
	)
	class450 method2371() {
		WorldView var1 = this.getWorldView();
		Player var2 = var1.method2745(Client.localPlayerIndex);
		class450 var3 = Varcs.method3022(var1, var2.getY(), var2.getPlane());
		var3.field5218 = (float)var2.getX();
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2011269836"
	)
	int method2397() {
		return this.field999;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ltj;B)V",
		garbageValue = "25"
	)
	void method2373(class516 var1, class514 var2) {
		this.field997 = var1;
		this.field993 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILtn;Ltj;B)V",
		garbageValue = "2"
	)
	void method2374(int var1, class516 var2, class514 var3) {
		this.field994.put(var1, var2);
		this.field1002.put(var1, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "687587628"
	)
	void method2375(int var1) {
		this.field994.remove(var1);
		this.field1002.remove(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ltn;",
		garbageValue = "-41210452"
	)
	class516 method2376(int var1) {
		class516 var2 = (class516)this.field994.get(var1);
		return var2 != null ? var2 : this.field997;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Ltj;",
		garbageValue = "31780"
	)
	class514 method2417(int var1) {
		class514 var2 = (class514)this.field1002.get(var1);
		return var2 != null ? var2 : this.field993;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	@Export("clear")
	void clear() {
		Iterator var1 = this.worldViews.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.removeWorldView(var2);
		}

		this.worldViews.clear();
		this.field999 = 0;
		this.field994.clear();
		this.field1002.clear();
		this.field997 = class516.field5563;
		this.field993 = class514.field5547;
		if (this.worldView != null) {
			this.worldView.method2743();
			this.worldViews.put(this.worldView, -1L);
			this.field999 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}
}
