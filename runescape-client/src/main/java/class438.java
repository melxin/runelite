import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class438 {
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -987179491
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	public class443 field4899;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public class442 field4900;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public class442 field4902;

	public class438() {
		this.field4899 = IntProjection.method3961();
		class442 var1;
		synchronized(class442.field4917) {
			if (class442.field4920 == 0) {
				var1 = new class442();
			} else {
				class442.field4917[--class442.field4920].method8342();
				var1 = class442.field4917[class442.field4920];
			}
		}

		this.field4900 = var1;
		this.field4902 = class219.method4844(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109666250"
	)
	public void method8292() {
		this.field4899.method8397();
		this.field4900.method8339();
		this.field4902.method8339();
	}

	public String toString() {
		return "[" + this.field4899.toString() + "|" + this.field4900.toString() + "|" + this.field4902.toString() + "]";
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4899.hashCode();
		var3 = var3 * 31 + this.field4900.hashCode();
		var3 = var3 * 31 + this.field4902.hashCode();
		return var3;
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class438)) {
			return false;
		} else {
			class438 var2 = (class438)var1;
			return this.field4899.equals(var2.field4899) && this.field4900.method8343(var2.field4900) && this.field4902.method8343(var2.field4902);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1998627032"
	)
	static final void method8300() {
		ClanSettings.method3631("Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-827071021"
	)
	public static void method8301() {
		class335.field3698.clear();
	}
}
