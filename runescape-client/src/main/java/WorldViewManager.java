import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("hashTable")
	final IterableNodeHashTable hashTable;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1964738089
	)
	int field1176;
	@ObfuscatedName("ao")
	final HashMap field1173;
	@ObfuscatedName("ad")
	final HashMap field1174;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	class492 field1175;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	class491 field1170;

	WorldViewManager() {
		this.hashTable = new IterableNodeHashTable(16);
		this.field1176 = 0;
		this.field1173 = new HashMap(16);
		this.field1174 = new HashMap(16);
		this.field1175 = class492.field5092;
		this.field1170 = class491.field5087;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldz;",
		garbageValue = "1069529031"
	)
	WorldView method2712(int var1, int var2, int var3) {
		this.worldView = this.method2713(-1, var1, var2, var3, class175.field1837);
		return this.worldView;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIILgs;I)Ldz;",
		garbageValue = "1552571679"
	)
	WorldView method2713(int var1, int var2, int var3, int var4, class175 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.hashTable.put(var6, (long)var1);
		++this.field1176;
		return var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-1414812928"
	)
	void method2737(WorldView var1) {
		if (var1 != null) {
			this.field1173.remove(var1.id);
			this.field1174.remove(var1.id);
			var1.remove();
			--this.field1176;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ldz;",
		garbageValue = "-421887075"
	)
	public WorldView method2726() {
		return this.worldView;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1850524275"
	)
	int method2716() {
		return this.field1176;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsn;Lsl;S)V",
		garbageValue = "1540"
	)
	void method2739(class492 var1, class491 var2) {
		this.field1175 = var1;
		this.field1170 = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILsn;Lsl;B)V",
		garbageValue = "-96"
	)
	void method2718(int var1, class492 var2, class491 var3) {
		this.field1173.put(var1, var2);
		this.field1174.put(var1, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	void method2749(int var1) {
		this.field1173.remove(var1);
		this.field1174.remove(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Lsn;",
		garbageValue = "177"
	)
	class492 method2720(int var1) {
		class492 var2 = (class492)this.field1173.get(var1);
		return var2 != null ? var2 : this.field1175;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsl;",
		garbageValue = "-23"
	)
	class491 method2740(int var1) {
		class491 var2 = (class491)this.field1174.get(var1);
		return var2 != null ? var2 : this.field1170;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clear")
	void clear() {
		this.hashTable.clear();
		this.field1176 = 0;
		this.field1173.clear();
		this.field1174.clear();
		this.field1175 = class492.field5092;
		this.field1170 = class491.field5087;
		if (this.worldView != null) {
			this.worldView.method2991();
			this.hashTable.put(this.worldView, -1L);
			this.field1176 = 1;
		}

	}

	public Iterator iterator() {
		return this.hashTable.iterator();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "29"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2751() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Leq;B)V",
		garbageValue = "20"
	)
	static void method2736(NPC var0) {
		var0.field1268 = var0.definition.size * 1387352433;
		var0.field1200 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2659;
		var0.field1198 = var0.definition.field2633;
		var0.field1210 = var0.definition.field2634;
		var0.field1251 = var0.definition.field2623;
		var0.field1212 = var0.definition.field2636;
		var0.field1234 = var0.definition.field2649;
		var0.field1214 = var0.definition.field2660;
		var0.field1220 = var0.definition.field2639;
	}
}
