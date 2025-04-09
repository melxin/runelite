import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class543 implements class542 {
	@ObfuscatedName("al")
	static int[][] field5472;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	final class577 field5469;
	@ObfuscatedName("an")
	Map field5470;

	@ObfuscatedSignature(
		descriptor = "(Lwf;)V"
	)
	public class543(class577 var1) {
		this.field5469 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-976759473"
	)
	public int vmethod10021(int var1) {
		if (this.field5470 != null) {
			class578 var2 = (class578)this.field5470.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5662;
			}
		}

		return (Integer)this.field5469.vmethod10633(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-31998852"
	)
	public void vmethod10026(int var1, Object var2) {
		if (this.field5470 == null) {
			this.field5470 = new HashMap();
			this.field5470.put(var1, new class578(var1, var2));
		} else {
			class578 var3 = (class578)this.field5470.get(var1);
			if (var3 == null) {
				this.field5470.put(var1, new class578(var1, var2));
			} else {
				var3.field5662 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5470 == null ? Collections.emptyList().iterator() : this.field5470.values().iterator();
	}
}
