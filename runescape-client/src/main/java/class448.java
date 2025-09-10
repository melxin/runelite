import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class448 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	public class453 field5155;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class452 field5154;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class452 field5156;

	public class448() {
		this.field5155 = PendingSpawn.method2414();
		class452 var1;
		synchronized(class452.field5171) {
			if (class452.field5173 == 0) {
				var1 = new class452();
			} else {
				class452.field5171[--class452.field5173].method9004();
				var1 = class452.field5171[class452.field5173];
			}
		}

		this.field5154 = var1;
		this.field5156 = WorldMapSection0.method6761(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "761457926"
	)
	public void method8931() {
		this.field5155.method9054();
		this.field5154.method8992();
		this.field5156.method8992();
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class448)) {
			return false;
		} else {
			class448 var2 = (class448)var1;
			return this.field5155.equals(var2.field5155) && this.field5154.method8996(var2.field5154) && this.field5156.method8996(var2.field5156);
		}
	}

	public String toString() {
		return "[" + this.field5155.toString() + "|" + this.field5154.toString() + "|" + this.field5156.toString() + "]";
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field5155.hashCode();
		var3 = 31 * var3 + this.field5154.hashCode();
		var3 = var3 * 31 + this.field5156.hashCode();
		return var3;
	}
}
