import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public class class456 extends AbstractQueue {
	@ObfuscatedName("al")
	final Comparator field5099;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class454[] field5097;
	@ObfuscatedName("ac")
	Map field5102;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 747075391
	)
	int field5096;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 224716063
	)
	int field5100;

	public class456(int var1, Comparator var2) {
		this.field5100 = 0;
		this.field5097 = new class454[var1];
		this.field5102 = new HashMap();
		this.field5099 = var2;
	}

	public class456(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050541791"
	)
	void method9227() {
		int var1 = (this.field5097.length << 1) + 1;
		this.field5097 = (class454[])((class454[])Arrays.copyOf(this.field5097, var1));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "22426"
	)
	void method9229(int var1) {
		class454 var2;
		int var3;
		for (var2 = this.field5097[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class454 var4 = this.field5097[var3];
			if (this.field5099 != null) {
				if (this.field5099.compare(var2.field5091, var4.field5091) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field5091).compareTo(var4.field5091) >= 0) {
				break;
			}

			this.field5097[var1] = var4;
			this.field5097[var1].field5092 = var1;
		}

		this.field5097[var1] = var2;
		this.field5097[var1].field5092 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1093368482"
	)
	void method9230(int var1) {
		class454 var2 = this.field5097[var1];

		int var8;
		for (int var3 = this.field5096 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class454 var5 = this.field5097[var4];
			int var6 = (var1 << 1) + 2;
			class454 var7 = this.field5097[var6];
			if (this.field5099 != null) {
				if (var6 < this.field5096 && this.field5099.compare(var5.field5091, var7.field5091) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5096 && ((Comparable)var5.field5091).compareTo(var7.field5091) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field5099 != null) {
				if (this.field5099.compare(var2.field5091, this.field5097[var8].field5091) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field5091).compareTo(this.field5097[var8].field5091) <= 0) {
				break;
			}

			this.field5097[var1] = this.field5097[var8];
			this.field5097[var1].field5092 = var1;
		}

		this.field5097[var1] = var2;
		this.field5097[var1].field5092 = var1;
	}

	public boolean remove(Object var1) {
		class454 var2 = (class454)this.field5102.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field5100;
			--this.field5096;
			if (var2.field5092 == this.field5096) {
				this.field5097[this.field5096] = null;
				return true;
			} else {
				class454 var3 = this.field5097[this.field5096];
				this.field5097[this.field5096] = null;
				this.field5097[var2.field5092] = var3;
				this.field5097[var2.field5092].field5092 = var2.field5092;
				this.method9230(var2.field5092);
				if (var3 == this.field5097[var2.field5092]) {
					this.method9229(var2.field5092);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field5096 == 0 ? null : this.field5097[0].field5091;
	}

	public int size() {
		return this.field5096;
	}

	public boolean offer(Object var1) {
		if (this.field5102.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field5100;
			int var2 = this.field5096;
			if (var2 >= this.field5097.length) {
				this.method9227();
			}

			++this.field5096;
			if (var2 == 0) {
				this.field5097[0] = new class454(var1, 0);
				this.field5102.put(var1, this.field5097[0]);
			} else {
				this.field5097[var2] = new class454(var1, var2);
				this.field5102.put(var1, this.field5097[var2]);
				this.method9229(var2);
			}

			return true;
		}
	}

	public boolean contains(Object var1) {
		return this.field5102.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5099 != null) {
			Arrays.sort(var1, this.field5099);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class455(this);
	}

	public Object poll() {
		if (this.field5096 == 0) {
			return null;
		} else {
			++this.field5100;
			Object var1 = this.field5097[0].field5091;
			this.field5102.remove(var1);
			--this.field5096;
			if (this.field5096 == 0) {
				this.field5097[this.field5096] = null;
			} else {
				this.field5097[0] = this.field5097[this.field5096];
				this.field5097[0].field5092 = 0;
				this.field5097[this.field5096] = null;
				this.method9230(0);
			}

			return var1;
		}
	}
}
