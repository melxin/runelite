import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("hashTable")
	final IterableNodeHashTable hashTable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 757750021
	)
	int field1173;
	@ObfuscatedName("ae")
	final HashMap field1178;
	@ObfuscatedName("ao")
	final HashMap field1175;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	class492 field1176;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	class491 field1172;

	WorldViewManager() {
		this.hashTable = new IterableNodeHashTable(16);
		this.field1173 = 0;
		this.field1178 = new HashMap(16);
		this.field1175 = new HashMap(16);
		this.field1176 = class492.field5090;
		this.field1172 = class491.field5084;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "-591302131"
	)
	WorldView method2606(int var1, int var2, int var3) {
		this.worldView = this.method2591(-1, var1, var2, var3, class232.field2479);
		return this.worldView;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIILit;B)Ldm;",
		garbageValue = "66"
	)
	WorldView method2591(int var1, int var2, int var3, int var4, class232 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.hashTable.put(var6, (long)var1);
		++this.field1173;
		return var6;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-1949702553"
	)
	void method2592(WorldView var1) {
		if (var1 != null) {
			this.field1178.remove(var1.id);
			this.field1175.remove(var1.id);
			var1.remove();
			--this.field1173;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ldm;",
		garbageValue = "-1452394893"
	)
	WorldView method2593() {
		return this.worldView;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10483"
	)
	int method2612() {
		return this.field1173;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsm;Lse;B)V",
		garbageValue = "1"
	)
	void method2595(class492 var1, class491 var2) {
		this.field1176 = var1;
		this.field1172 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILsm;Lse;I)V",
		garbageValue = "-864886389"
	)
	void method2596(int var1, class492 var2, class491 var3) {
		this.field1178.put(var1, var2);
		this.field1175.put(var1, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	void method2598(int var1) {
		this.field1178.remove(var1);
		this.field1175.remove(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lsm;",
		garbageValue = "2110742674"
	)
	class492 method2607(int var1) {
		class492 var2 = (class492)this.field1178.get(var1);
		return var2 != null ? var2 : this.field1176;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lse;",
		garbageValue = "86"
	)
	class491 method2599(int var1) {
		class491 var2 = (class491)this.field1175.get(var1);
		return var2 != null ? var2 : this.field1172;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("clear")
	void clear() {
		this.hashTable.clear();
		this.field1173 = 0;
		this.field1178.clear();
		this.field1175.clear();
		this.field1176 = class492.field5090;
		this.field1172 = class491.field5084;
		if (this.worldView != null) {
			this.worldView.method2869();
			this.hashTable.put(this.worldView, -1L);
			this.field1173 = 1;
		}

	}

	public Iterator iterator() {
		return this.hashTable.iterator();
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1747577664"
	)
	static boolean method2618() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
