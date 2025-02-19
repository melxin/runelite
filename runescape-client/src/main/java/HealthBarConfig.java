import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("HealthBarConfig")
public class HealthBarConfig extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1820696693
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	HealthBarConfig(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "7"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lde;",
		garbageValue = "1199108951"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method8055();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "300127497"
	)
	static final int method2839() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1097002671"
	)
	static final int method2838(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
