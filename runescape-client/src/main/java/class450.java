import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class450 extends AbstractQueue {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 617338029
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ao")
	final Comparator field4965;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	class448[] field4967;
	@ObfuscatedName("ae")
	Map field4966;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -797131931
	)
	int field4964;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 135595639
	)
	int field4968;

	public class450(int var1, Comparator var2) {
		this.field4968 = 0;
		this.field4967 = new class448[var1];
		this.field4966 = new HashMap();
		this.field4965 = var2;
	}

	public class450(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-789500159"
	)
	void method8545() {
		int var1 = (this.field4967.length << 1) + 1;
		this.field4967 = (class448[])((class448[])Arrays.copyOf(this.field4967, var1));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "328522599"
	)
	void method8548(int var1) {
		class448 var2;
		int var3;
		for (var2 = this.field4967[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class448 var4 = this.field4967[var3];
			if (this.field4965 != null) {
				if (this.field4965.compare(var2.field4956, var4.field4956) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4956).compareTo(var4.field4956) >= 0) {
				break;
			}

			this.field4967[var1] = var4;
			this.field4967[var1].field4959 = var1;
		}

		this.field4967[var1] = var2;
		this.field4967[var1].field4959 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1740422011"
	)
	void method8563(int var1) {
		class448 var2 = this.field4967[var1];

		int var8;
		for (int var3 = this.field4964 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class448 var5 = this.field4967[var4];
			int var6 = (var1 << 1) + 2;
			class448 var7 = this.field4967[var6];
			if (this.field4965 != null) {
				if (var6 < this.field4964 && this.field4965.compare(var5.field4956, var7.field4956) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4964 && ((Comparable)var5.field4956).compareTo(var7.field4956) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4965 != null) {
				if (this.field4965.compare(var2.field4956, this.field4967[var8].field4956) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4956).compareTo(this.field4967[var8].field4956) <= 0) {
				break;
			}

			this.field4967[var1] = this.field4967[var8];
			this.field4967[var1].field4959 = var1;
		}

		this.field4967[var1] = var2;
		this.field4967[var1].field4959 = var1;
	}

	public boolean remove(Object var1) {
		class448 var2 = (class448)this.field4966.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4968;
			--this.field4964;
			if (this.field4964 == var2.field4959) {
				this.field4967[this.field4964] = null;
				return true;
			} else {
				class448 var3 = this.field4967[this.field4964];
				this.field4967[this.field4964] = null;
				this.field4967[var2.field4959] = var3;
				this.field4967[var2.field4959].field4959 = var2.field4959;
				this.method8563(var2.field4959);
				if (var3 == this.field4967[var2.field4959]) {
					this.method8548(var2.field4959);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4964 == 0 ? null : this.field4967[0].field4956;
	}

	public boolean contains(Object var1) {
		return this.field4966.containsKey(var1);
	}

	public boolean offer(Object var1) {
		if (this.field4966.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4968;
			int var2 = this.field4964;
			if (var2 >= this.field4967.length) {
				this.method8545();
			}

			++this.field4964;
			if (var2 == 0) {
				this.field4967[0] = new class448(var1, 0);
				this.field4966.put(var1, this.field4967[0]);
			} else {
				this.field4967[var2] = new class448(var1, var2);
				this.field4966.put(var1, this.field4967[var2]);
				this.method8548(var2);
			}

			return true;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4965 != null) {
			Arrays.sort(var1, this.field4965);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class449(this);
	}

	public Object poll() {
		if (this.field4964 == 0) {
			return null;
		} else {
			++this.field4968;
			Object var1 = this.field4967[0].field4956;
			this.field4966.remove(var1);
			--this.field4964;
			if (this.field4964 == 0) {
				this.field4967[this.field4964] = null;
			} else {
				this.field4967[0] = this.field4967[this.field4964];
				this.field4967[0].field4959 = 0;
				this.field4967[this.field4964] = null;
				this.method8563(0);
			}

			return var1;
		}
	}

	public int size() {
		return this.field4964;
	}
}
