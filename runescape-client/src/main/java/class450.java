import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class450 extends AbstractQueue {
	@ObfuscatedName("jj")
	static int[] field4944;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	class448[] field4951;
	@ObfuscatedName("ay")
	Map field4945;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1548273269
	)
	int field4946;
	@ObfuscatedName("ad")
	final Comparator field4947;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -572902437
	)
	int field4948;

	public class450(int var1, Comparator var2) {
		this.field4948 = 0;
		this.field4951 = new class448[var1];
		this.field4945 = new HashMap();
		this.field4947 = var2;
	}

	public class450(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26450"
	)
	void method8518() {
		int var1 = (this.field4951.length << 1) + 1;
		this.field4951 = (class448[])((class448[])Arrays.copyOf(this.field4951, var1));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	void method8523(int var1) {
		class448 var2;
		int var3;
		for (var2 = this.field4951[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class448 var4 = this.field4951[var3];
			if (this.field4947 != null) {
				if (this.field4947.compare(var2.field4938, var4.field4938) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4938).compareTo(var4.field4938) >= 0) {
				break;
			}

			this.field4951[var1] = var4;
			this.field4951[var1].field4937 = var1;
		}

		this.field4951[var1] = var2;
		this.field4951[var1].field4937 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-67"
	)
	void method8524(int var1) {
		class448 var2 = this.field4951[var1];

		int var8;
		for (int var3 = this.field4946 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class448 var5 = this.field4951[var4];
			int var6 = (var1 << 1) + 2;
			class448 var7 = this.field4951[var6];
			if (this.field4947 != null) {
				if (var6 < this.field4946 && this.field4947.compare(var5.field4938, var7.field4938) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4946 && ((Comparable)var5.field4938).compareTo(var7.field4938) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4947 != null) {
				if (this.field4947.compare(var2.field4938, this.field4951[var8].field4938) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4938).compareTo(this.field4951[var8].field4938) <= 0) {
				break;
			}

			this.field4951[var1] = this.field4951[var8];
			this.field4951[var1].field4937 = var1;
		}

		this.field4951[var1] = var2;
		this.field4951[var1].field4937 = var1;
	}

	public boolean remove(Object var1) {
		class448 var2 = (class448)this.field4945.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4948;
			--this.field4946;
			if (var2.field4937 == this.field4946) {
				this.field4951[this.field4946] = null;
				return true;
			} else {
				class448 var3 = this.field4951[this.field4946];
				this.field4951[this.field4946] = null;
				this.field4951[var2.field4937] = var3;
				this.field4951[var2.field4937].field4937 = var2.field4937;
				this.method8524(var2.field4937);
				if (var3 == this.field4951[var2.field4937]) {
					this.method8523(var2.field4937);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4946 == 0 ? null : this.field4951[0].field4938;
	}

	public int size() {
		return this.field4946;
	}

	public boolean contains(Object var1) {
		return this.field4945.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4947 != null) {
			Arrays.sort(var1, this.field4947);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class449(this);
	}

	public Object poll() {
		if (this.field4946 == 0) {
			return null;
		} else {
			++this.field4948;
			Object var1 = this.field4951[0].field4938;
			this.field4945.remove(var1);
			--this.field4946;
			if (this.field4946 == 0) {
				this.field4951[this.field4946] = null;
			} else {
				this.field4951[0] = this.field4951[this.field4946];
				this.field4951[0].field4937 = 0;
				this.field4951[this.field4946] = null;
				this.method8524(0);
			}

			return var1;
		}
	}

	public boolean offer(Object var1) {
		if (this.field4945.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4948;
			int var2 = this.field4946;
			if (var2 >= this.field4951.length) {
				this.method8518();
			}

			++this.field4946;
			if (var2 == 0) {
				this.field4951[0] = new class448(var1, 0);
				this.field4945.put(var1, this.field4951[0]);
			} else {
				this.field4951[var2] = new class448(var1, var2);
				this.field4945.put(var1, this.field4951[var2]);
				this.method8523(var2);
			}

			return true;
		}
	}
}
