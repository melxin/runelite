import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class107 extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	class101 field1403;

	public class107() {
		this.field1403 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lek;)V"
	)
	class107(VorbisSample var1) {
		if (var1 != null) {
			this.field1403 = new class101(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	public class107(RawSound var1) {
		this.field1403 = new class101((VorbisSample)null, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "399884039"
	)
	public boolean method3315() {
		return this.field1403 == null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ldg;",
		garbageValue = "609475608"
	)
	public RawSound method3304() {
		if (this.field1403 != null && this.field1403.field1365.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method3303();
			} finally {
				this.field1403.field1365.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ldg;",
		garbageValue = "-1250854929"
	)
	public RawSound method3305() {
		if (this.field1403 != null) {
			this.field1403.field1365.lock();

			RawSound var1;
			try {
				var1 = this.method3303();
			} finally {
				this.field1403.field1365.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ldg;",
		garbageValue = "-17"
	)
	RawSound method3303() {
		if (this.field1403.field1362 == null) {
			this.field1403.field1362 = this.field1403.field1363.toRawSound((int[])null);
			this.field1403.field1363 = null;
		}

		return this.field1403.field1362;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "-1987009659"
	)
	public static VarbitComposition method3302(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1497652567"
	)
	static final void method3306(int var0) {
		if (class167.widgetDefinition.loadInterface(var0)) {
			class557.drawModelComponents(class167.widgetDefinition.Widget_interfaceComponents[var0], 0, class167.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1);
		}
	}
}
