import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
public class class560 implements class559 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lxw;"
	)
	final class599 field5764;
	@ObfuscatedName("aw")
	Map field5763;

	@ObfuscatedSignature(
		descriptor = "(Lxw;)V"
	)
	public class560(class599 var1) {
		this.field5764 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1608890484"
	)
	public int vmethod10877(int var1) {
		if (this.field5763 != null) {
			class600 var2 = (class600)this.field5763.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5985;
			}
		}

		return (Integer)this.field5764.vmethod11541(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-422047690"
	)
	public void vmethod10878(int var1, Object var2) {
		if (this.field5763 == null) {
			this.field5763 = new HashMap();
			this.field5763.put(var1, new class600(var1, var2));
		} else {
			class600 var3 = (class600)this.field5763.get(var1);
			if (var3 == null) {
				this.field5763.put(var1, new class600(var1, var2));
			} else {
				var3.field5985 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5763 == null ? Collections.emptyList().iterator() : this.field5763.values().iterator();
	}
}
