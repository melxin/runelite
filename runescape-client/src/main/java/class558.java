import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vd")
public class class558 implements class557 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1662532201
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	final class597 field5827;
	@ObfuscatedName("at")
	Map field5828;

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	public class558(class597 var1) {
		this.field5827 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "724708289"
	)
	public int vmethod11022(int var1) {
		if (this.field5828 != null) {
			class598 var2 = (class598)this.field5828.get(var1);
			if (var2 != null) {
				return (Integer)var2.field6046;
			}
		}

		return (Integer)this.field5827.vmethod11708(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1781330931"
	)
	public void vmethod11023(int var1, Object var2) {
		if (this.field5828 == null) {
			this.field5828 = new HashMap();
			this.field5828.put(var1, new class598(var1, var2));
		} else {
			class598 var3 = (class598)this.field5828.get(var1);
			if (var3 == null) {
				this.field5828.put(var1, new class598(var1, var2));
			} else {
				var3.field6046 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5828 == null ? Collections.emptyList().iterator() : this.field5828.values().iterator();
	}
}
