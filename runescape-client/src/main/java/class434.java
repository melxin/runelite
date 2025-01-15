import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class434 extends AbstractQueue {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	class432[] field4793;
	@ObfuscatedName("ah")
	Map field4797;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1652179925
	)
	int field4792;
	@ObfuscatedName("ao")
	final Comparator field4795;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1936714925
	)
	int field4796;

	public class434(int var1, Comparator var2) {
		this.field4796 = 0;
		this.field4793 = new class432[var1];
		this.field4797 = new HashMap();
		this.field4795 = var2;
	}

	public class434(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1188088117"
	)
	void method8496() {
		int var1 = (this.field4793.length << 1) + 1;
		this.field4793 = (class432[])((class432[])Arrays.copyOf(this.field4793, var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2020518532"
	)
	void method8492(int var1) {
		class432 var2;
		int var3;
		for (var2 = this.field4793[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class432 var4 = this.field4793[var3];
			if (this.field4795 != null) {
				if (this.field4795.compare(var2.field4785, var4.field4785) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4785).compareTo(var4.field4785) >= 0) {
				break;
			}

			this.field4793[var1] = var4;
			this.field4793[var1].field4784 = var1;
		}

		this.field4793[var1] = var2;
		this.field4793[var1].field4784 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1409273919"
	)
	void method8490(int var1) {
		class432 var2 = this.field4793[var1];

		int var8;
		for (int var3 = this.field4792 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class432 var5 = this.field4793[var4];
			int var6 = (var1 << 1) + 2;
			class432 var7 = this.field4793[var6];
			if (this.field4795 != null) {
				if (var6 < this.field4792 && this.field4795.compare(var5.field4785, var7.field4785) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4792 && ((Comparable)var5.field4785).compareTo(var7.field4785) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4795 != null) {
				if (this.field4795.compare(var2.field4785, this.field4793[var8].field4785) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4785).compareTo(this.field4793[var8].field4785) <= 0) {
				break;
			}

			this.field4793[var1] = this.field4793[var8];
			this.field4793[var1].field4784 = var1;
		}

		this.field4793[var1] = var2;
		this.field4793[var1].field4784 = var1;
	}

	public boolean remove(Object var1) {
		class432 var2 = (class432)this.field4797.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4796;
			--this.field4792;
			if (var2.field4784 == this.field4792) {
				this.field4793[this.field4792] = null;
				return true;
			} else {
				class432 var3 = this.field4793[this.field4792];
				this.field4793[this.field4792] = null;
				this.field4793[var2.field4784] = var3;
				this.field4793[var2.field4784].field4784 = var2.field4784;
				this.method8490(var2.field4784);
				if (var3 == this.field4793[var2.field4784]) {
					this.method8492(var2.field4784);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4792 == 0 ? null : this.field4793[0].field4785;
	}

	public int size() {
		return this.field4792;
	}

	public boolean offer(Object var1) {
		if (this.field4797.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4796;
			int var2 = this.field4792;
			if (var2 >= this.field4793.length) {
				this.method8496();
			}

			++this.field4792;
			if (var2 == 0) {
				this.field4793[0] = new class432(var1, 0);
				this.field4797.put(var1, this.field4793[0]);
			} else {
				this.field4793[var2] = new class432(var1, var2);
				this.field4797.put(var1, this.field4793[var2]);
				this.method8492(var2);
			}

			return true;
		}
	}

	public Iterator iterator() {
		return new class433(this);
	}

	public Object poll() {
		if (this.field4792 == 0) {
			return null;
		} else {
			++this.field4796;
			Object var1 = this.field4793[0].field4785;
			this.field4797.remove(var1);
			--this.field4792;
			if (this.field4792 == 0) {
				this.field4793[this.field4792] = null;
			} else {
				this.field4793[0] = this.field4793[this.field4792];
				this.field4793[0].field4784 = 0;
				this.field4793[this.field4792] = null;
				this.method8490(0);
			}

			return var1;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4795 != null) {
			Arrays.sort(var1, this.field4795);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public boolean contains(Object var1) {
		return this.field4797.containsKey(var1);
	}
}
