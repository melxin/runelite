import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
public class class543 implements class542 {
	@ObfuscatedName("ab")
	Map field5448;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwr;"
	)
	final class577 field5447;

	@ObfuscatedSignature(
		descriptor = "(Lwr;)V"
	)
	public class543(class577 var1) {
		this.field5447 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1956256978"
	)
	public int vmethod9939(int var1) {
		if (this.field5448 != null) {
			class578 var2 = (class578)this.field5448.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5638;
			}
		}

		return (Integer)this.field5447.vmethod10577(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "85"
	)
	public void vmethod9940(int var1, Object var2) {
		if (this.field5448 == null) {
			this.field5448 = new HashMap();
			this.field5448.put(var1, new class578(var1, var2));
		} else {
			class578 var3 = (class578)this.field5448.get(var1);
			if (var3 == null) {
				this.field5448.put(var1, new class578(var1, var2));
			} else {
				var3.field5638 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5448 == null ? Collections.emptyList().iterator() : this.field5448.values().iterator();
	}
}
