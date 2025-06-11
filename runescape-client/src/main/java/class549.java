import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class549 implements class548 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	final class588 field5543;
	@ObfuscatedName("aj")
	Map field5542;

	@ObfuscatedSignature(
		descriptor = "(Lwh;)V"
	)
	public class549(class588 var1) {
		this.field5543 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "16"
	)
	public int vmethod10501(int var1) {
		if (this.field5542 != null) {
			class589 var2 = (class589)this.field5542.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5761;
			}
		}

		return (Integer)this.field5543.vmethod11181(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "13"
	)
	public void vmethod10500(int var1, Object var2) {
		if (this.field5542 == null) {
			this.field5542 = new HashMap();
			this.field5542.put(var1, new class589(var1, var2));
		} else {
			class589 var3 = (class589)this.field5542.get(var1);
			if (var3 == null) {
				this.field5542.put(var1, new class589(var1, var2));
			} else {
				var3.field5761 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5542 == null ? Collections.emptyList().iterator() : this.field5542.values().iterator();
	}
}
