import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class453 extends AbstractQueue {
	@ObfuscatedName("ap")
	final Comparator field5019;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	class451[] field5018;
	@ObfuscatedName("an")
	Map field5023;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 398250717
	)
	int field5020;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1453459469
	)
	int field5021;

	public class453(int var1, Comparator var2) {
		this.field5021 = 0;
		this.field5018 = new class451[var1];
		this.field5023 = new HashMap();
		this.field5019 = var2;
	}

	public class453(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1012540759"
	)
	void method8926() {
		int var1 = (this.field5018.length << 1) + 1;
		this.field5018 = (class451[])((class451[])Arrays.copyOf(this.field5018, var1));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	void method8929(int var1) {
		class451 var2;
		int var3;
		for (var2 = this.field5018[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class451 var4 = this.field5018[var3];
			if (this.field5019 != null) {
				if (this.field5019.compare(var2.field5012, var4.field5012) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field5012).compareTo(var4.field5012) >= 0) {
				break;
			}

			this.field5018[var1] = var4;
			this.field5018[var1].field5010 = var1;
		}

		this.field5018[var1] = var2;
		this.field5018[var1].field5010 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method8915(int var1) {
		class451 var2 = this.field5018[var1];

		int var8;
		for (int var3 = this.field5020 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class451 var5 = this.field5018[var4];
			int var6 = (var1 << 1) + 2;
			class451 var7 = this.field5018[var6];
			if (this.field5019 != null) {
				if (var6 < this.field5020 && this.field5019.compare(var5.field5012, var7.field5012) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5020 && ((Comparable)var5.field5012).compareTo(var7.field5012) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field5019 != null) {
				if (this.field5019.compare(var2.field5012, this.field5018[var8].field5012) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field5012).compareTo(this.field5018[var8].field5012) <= 0) {
				break;
			}

			this.field5018[var1] = this.field5018[var8];
			this.field5018[var1].field5010 = var1;
		}

		this.field5018[var1] = var2;
		this.field5018[var1].field5010 = var1;
	}

	public boolean remove(Object var1) {
		class451 var2 = (class451)this.field5023.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field5021;
			--this.field5020;
			if (var2.field5010 == this.field5020) {
				this.field5018[this.field5020] = null;
				return true;
			} else {
				class451 var3 = this.field5018[this.field5020];
				this.field5018[this.field5020] = null;
				this.field5018[var2.field5010] = var3;
				this.field5018[var2.field5010].field5010 = var2.field5010;
				this.method8915(var2.field5010);
				if (var3 == this.field5018[var2.field5010]) {
					this.method8929(var2.field5010);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field5020 == 0 ? null : this.field5018[0].field5012;
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5019 != null) {
			Arrays.sort(var1, this.field5019);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public boolean offer(Object var1) {
		if (this.field5023.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field5021;
			int var2 = this.field5020;
			if (var2 >= this.field5018.length) {
				this.method8926();
			}

			++this.field5020;
			if (var2 == 0) {
				this.field5018[0] = new class451(var1, 0);
				this.field5023.put(var1, this.field5018[0]);
			} else {
				this.field5018[var2] = new class451(var1, var2);
				this.field5023.put(var1, this.field5018[var2]);
				this.method8929(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field5020 == 0) {
			return null;
		} else {
			++this.field5021;
			Object var1 = this.field5018[0].field5012;
			this.field5023.remove(var1);
			--this.field5020;
			if (this.field5020 == 0) {
				this.field5018[this.field5020] = null;
			} else {
				this.field5018[0] = this.field5018[this.field5020];
				this.field5018[0].field5010 = 0;
				this.field5018[this.field5020] = null;
				this.method8915(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field5023.containsKey(var1);
	}

	public Iterator iterator() {
		return new class452(this);
	}

	public int size() {
		return this.field5020;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-33"
	)
	public static int method8935(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) - 512 & 2047;
	}
}
