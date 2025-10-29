import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
public class class572 implements class571 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxr;"
	)
	final class608 field5887;
	@ObfuscatedName("at")
	Map field5886;

	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public class572(class608 var1) {
		this.field5887 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1090201482"
	)
	public int vmethod11295(int var1) {
		if (this.field5886 != null) {
			class609 var2 = (class609)this.field5886.get(var1);
			if (var2 != null) {
				return (Integer)var2.field6085;
			}
		}

		return (Integer)this.field5887.vmethod11988(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-711539122"
	)
	public void vmethod11305(int var1, Object var2) {
		if (this.field5886 == null) {
			this.field5886 = new HashMap();
			this.field5886.put(var1, new class609(var1, var2));
		} else {
			class609 var3 = (class609)this.field5886.get(var1);
			if (var3 == null) {
				this.field5886.put(var1, new class609(var1, var2));
			} else {
				var3.field6085 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5886 == null ? Collections.emptyList().iterator() : this.field5886.values().iterator();
	}
}
