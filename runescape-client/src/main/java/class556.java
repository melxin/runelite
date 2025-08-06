import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class556 implements class555 {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -284803483
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	final class595 field5663;
	@ObfuscatedName("ab")
	Map field5660;

	@ObfuscatedSignature(
		descriptor = "(Lwg;)V"
	)
	public class556(class595 var1) {
		this.field5663 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1618017719"
	)
	public int vmethod10928(int var1) {
		if (this.field5660 != null) {
			class596 var2 = (class596)this.field5660.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5881;
			}
		}

		return (Integer)this.field5663.vmethod11555(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "853421187"
	)
	public void vmethod10930(int var1, Object var2) {
		if (this.field5660 == null) {
			this.field5660 = new HashMap();
			this.field5660.put(var1, new class596(var1, var2));
		} else {
			class596 var3 = (class596)this.field5660.get(var1);
			if (var3 == null) {
				this.field5660.put(var1, new class596(var1, var2));
			} else {
				var3.field5881 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5660 == null ? Collections.emptyList().iterator() : this.field5660.values().iterator();
	}
}
