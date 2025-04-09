import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class165 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1647405675
	)
	public static int field1835;
	@ObfuscatedName("ih")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1627592805
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -186690921
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 1853080285625281461L
	)
	long field1832;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 4724959197895371481L
	)
	public long field1830;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	IterableNodeDeque field1834;

	@ObfuscatedSignature(
		descriptor = "(Lve;)V"
	)
	public class165(Buffer var1) {
		this.field1830 = -1L;
		this.field1834 = new IterableNodeDeque();
		this.method3676(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "90"
	)
	void method3676(Buffer var1) {
		this.field1832 = var1.readLong();
		this.field1830 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class160(this);
			} else if (var2 == 4) {
				var3 = new class171(this);
			} else if (var2 == 3) {
				var3 = new class156(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class161(this);
			}

			((class164)var3).vmethod3736(var1);
			this.field1834.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "1788512154"
	)
	public void method3678(ClanChannel var1) {
		if (var1.key == this.field1832 && var1.field1854 == this.field1830) {
			for (class164 var2 = (class164)this.field1834.last(); var2 != null; var2 = (class164)this.field1834.previous()) {
				var2.vmethod3737(var1);
			}

			++var1.field1854;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-89"
	)
	static boolean method3681(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ldy;II)V",
		garbageValue = "965742327"
	)
	static void method3675(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2653(var0);
		int var4 = Coord.method6896(var1.x, var1.size * -145616896 - 1);
		int var5 = Coord.method6896(var1.y, var1.size * -145616896 - 1);
		class136.worldToScreen(var0, var3.x, var3.y, var4, var5, var2);
	}
}
