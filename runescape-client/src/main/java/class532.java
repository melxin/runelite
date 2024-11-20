import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class532 implements class531 {
	@ObfuscatedName("ab")
	Map field5343;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	final class564 field5341;

	@ObfuscatedSignature(
		descriptor = "(Lvs;)V"
	)
	public class532(class564 var1) {
		this.field5341 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-44"
	)
	public int vmethod9817(int var1) {
		if (this.field5343 != null) {
			class565 var2 = (class565)this.field5343.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5536;
			}
		}

		return (Integer)this.field5341.vmethod10431(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "16"
	)
	public void vmethod9822(int var1, Object var2) {
		if (this.field5343 == null) {
			this.field5343 = new HashMap();
			this.field5343.put(var1, new class565(var1, var2));
		} else {
			class565 var3 = (class565)this.field5343.get(var1);
			if (var3 == null) {
				this.field5343.put(var1, new class565(var1, var2));
			} else {
				var3.field5536 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5343 == null ? Collections.emptyList().iterator() : this.field5343.values().iterator();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-15"
	)
	static int method9828(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Client.field805 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.field805;
			return 1;
		} else {
			return 2;
		}
	}
}
