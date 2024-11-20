import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class434 extends AbstractQueue {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqv;"
	)
	class432[] field4804;
	@ObfuscatedName("aw")
	Map field4801;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -829575609
	)
	int field4802;
	@ObfuscatedName("ae")
	final Comparator field4803;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1474820785
	)
	int field4800;

	public class434(int var1, Comparator var2) {
		this.field4800 = 0;
		this.field4804 = new class432[var1];
		this.field4801 = new HashMap();
		this.field4803 = var2;
	}

	public class434(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "102568558"
	)
	void method8342() {
		int var1 = (this.field4804.length << 1) + 1;
		this.field4804 = (class432[])((class432[])Arrays.copyOf(this.field4804, var1));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-849055301"
	)
	void method8341(int var1) {
		class432 var2;
		int var3;
		for (var2 = this.field4804[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class432 var4 = this.field4804[var3];
			if (this.field4803 != null) {
				if (this.field4803.compare(var2.field4795, var4.field4795) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4795).compareTo(var4.field4795) >= 0) {
				break;
			}

			this.field4804[var1] = var4;
			this.field4804[var1].field4796 = var1;
		}

		this.field4804[var1] = var2;
		this.field4804[var1].field4796 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-513030412"
	)
	void method8343(int var1) {
		class432 var2 = this.field4804[var1];

		int var8;
		for (int var3 = this.field4802 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class432 var5 = this.field4804[var4];
			int var6 = (var1 << 1) + 2;
			class432 var7 = this.field4804[var6];
			if (this.field4803 != null) {
				if (var6 < this.field4802 && this.field4803.compare(var5.field4795, var7.field4795) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4802 && ((Comparable)var5.field4795).compareTo(var7.field4795) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4803 != null) {
				if (this.field4803.compare(var2.field4795, this.field4804[var8].field4795) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4795).compareTo(this.field4804[var8].field4795) <= 0) {
				break;
			}

			this.field4804[var1] = this.field4804[var8];
			this.field4804[var1].field4796 = var1;
		}

		this.field4804[var1] = var2;
		this.field4804[var1].field4796 = var1;
	}

	public boolean remove(Object var1) {
		class432 var2 = (class432)this.field4801.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4800;
			--this.field4802;
			if (this.field4802 == var2.field4796) {
				this.field4804[this.field4802] = null;
				return true;
			} else {
				class432 var3 = this.field4804[this.field4802];
				this.field4804[this.field4802] = null;
				this.field4804[var2.field4796] = var3;
				this.field4804[var2.field4796].field4796 = var2.field4796;
				this.method8343(var2.field4796);
				if (var3 == this.field4804[var2.field4796]) {
					this.method8341(var2.field4796);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4802 == 0 ? null : this.field4804[0].field4795;
	}

	public int size() {
		return this.field4802;
	}

	public boolean offer(Object var1) {
		if (this.field4801.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4800;
			int var2 = this.field4802;
			if (var2 >= this.field4804.length) {
				this.method8342();
			}

			++this.field4802;
			if (var2 == 0) {
				this.field4804[0] = new class432(var1, 0);
				this.field4801.put(var1, this.field4804[0]);
			} else {
				this.field4804[var2] = new class432(var1, var2);
				this.field4801.put(var1, this.field4804[var2]);
				this.method8341(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field4802 == 0) {
			return null;
		} else {
			++this.field4800;
			Object var1 = this.field4804[0].field4795;
			this.field4801.remove(var1);
			--this.field4802;
			if (this.field4802 == 0) {
				this.field4804[this.field4802] = null;
			} else {
				this.field4804[0] = this.field4804[this.field4802];
				this.field4804[0].field4796 = 0;
				this.field4804[this.field4802] = null;
				this.method8343(0);
			}

			return var1;
		}
	}

	public Iterator iterator() {
		return new class433(this);
	}

	public boolean contains(Object var1) {
		return this.field4801.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4803 != null) {
			Arrays.sort(var1, this.field4803);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}
}
