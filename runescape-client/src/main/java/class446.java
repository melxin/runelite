import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class446 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	static final class446[] field5191;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1581373791
	)
	static final int field5190;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1419369225
	)
	static int field5195;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	public class451 field5197;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class450 field5193;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public class450 field5192;

	static {
		field5195 = 0;
		field5190 = 16;
		field5191 = new class446[field5190];
	}

	class446() {
		this.field5197 = new class451();
		this.field5193 = new class450();
		this.field5192 = new class450(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1567104906"
	)
	public void method9005() {
		synchronized(field5191) {
			if (field5195 < field5190) {
				field5191[++field5195 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1215827010"
	)
	void method9007() {
		this.field5197.method9144();
		this.field5193.method9068();
		this.field5192.field5216 = 1.0F;
		this.field5192.field5218 = 1.0F;
		this.field5192.field5219 = 1.0F;
	}

	public String toString() {
		return "[" + this.field5197.toString() + "|" + this.field5193.toString() + "|" + this.field5192.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class446)) {
			return false;
		} else {
			class446 var2 = (class446)var1;
			return this.field5197.equals(var2.field5197) && this.field5193.method9085(var2.field5193) && this.field5192.method9085(var2.field5192);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field5197.hashCode();
		var3 = var3 * 31 + this.field5193.hashCode();
		var3 = 31 * var3 + this.field5192.hashCode();
		return var3;
	}
}
