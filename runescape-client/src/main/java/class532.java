import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public class class532 implements class531 {
	@ObfuscatedName("ay")
	Map field5344;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final class564 field5345;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public class532(class564 var1) {
		this.field5345 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-195596197"
	)
	public int vmethod10004(int var1) {
		if (this.field5344 != null) {
			class565 var2 = (class565)this.field5344.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5539;
			}
		}

		return (Integer)this.field5345.vmethod10593(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1337046256"
	)
	public void vmethod10011(int var1, Object var2) {
		if (this.field5344 == null) {
			this.field5344 = new HashMap();
			this.field5344.put(var1, new class565(var1, var2));
		} else {
			class565 var3 = (class565)this.field5344.get(var1);
			if (var3 == null) {
				this.field5344.put(var1, new class565(var1, var2));
			} else {
				var3.field5539 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5344 == null ? Collections.emptyList().iterator() : this.field5344.values().iterator();
	}
}
