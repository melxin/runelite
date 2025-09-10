import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public class class460 extends AbstractQueue {
	@ObfuscatedName("af")
	final Comparator field5217;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lrr;"
	)
	class458[] field5218;
	@ObfuscatedName("at")
	Map field5213;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1196200717
	)
	int field5216;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 129142419
	)
	int field5214;

	public class460(int var1, Comparator var2) {
		this.field5214 = 0;
		this.field5218 = new class458[var1];
		this.field5213 = new HashMap();
		this.field5217 = var2;
	}

	public class460(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1187452093"
	)
	void method9224() {
		int var1 = (this.field5218.length << 1) + 1;
		this.field5218 = (class458[])((class458[])Arrays.copyOf(this.field5218, var1));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1933247897"
	)
	void method9246(int var1) {
		class458 var2;
		int var3;
		for (var2 = this.field5218[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class458 var4 = this.field5218[var3];
			if (this.field5217 != null) {
				if (this.field5217.compare(var2.field5206, var4.field5206) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field5206).compareTo(var4.field5206) >= 0) {
				break;
			}

			this.field5218[var1] = var4;
			this.field5218[var1].field5205 = var1;
		}

		this.field5218[var1] = var2;
		this.field5218[var1].field5205 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1423407339"
	)
	void method9227(int var1) {
		class458 var2 = this.field5218[var1];

		int var8;
		for (int var3 = this.field5216 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class458 var5 = this.field5218[var4];
			int var6 = (var1 << 1) + 2;
			class458 var7 = this.field5218[var6];
			if (this.field5217 != null) {
				if (var6 < this.field5216 && this.field5217.compare(var5.field5206, var7.field5206) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5216 && ((Comparable)var5.field5206).compareTo(var7.field5206) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field5217 != null) {
				if (this.field5217.compare(var2.field5206, this.field5218[var8].field5206) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field5206).compareTo(this.field5218[var8].field5206) <= 0) {
				break;
			}

			this.field5218[var1] = this.field5218[var8];
			this.field5218[var1].field5205 = var1;
		}

		this.field5218[var1] = var2;
		this.field5218[var1].field5205 = var1;
	}

	public boolean remove(Object var1) {
		class458 var2 = (class458)this.field5213.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field5214;
			--this.field5216;
			if (this.field5216 == var2.field5205) {
				this.field5218[this.field5216] = null;
				return true;
			} else {
				class458 var3 = this.field5218[this.field5216];
				this.field5218[this.field5216] = null;
				this.field5218[var2.field5205] = var3;
				this.field5218[var2.field5205].field5205 = var2.field5205;
				this.method9227(var2.field5205);
				if (var3 == this.field5218[var2.field5205]) {
					this.method9246(var2.field5205);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field5216 == 0 ? null : this.field5218[0].field5206;
	}

	public int size() {
		return this.field5216;
	}

	public boolean offer(Object var1) {
		if (this.field5213.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field5214;
			int var2 = this.field5216;
			if (var2 >= this.field5218.length) {
				this.method9224();
			}

			++this.field5216;
			if (var2 == 0) {
				this.field5218[0] = new class458(var1, 0);
				this.field5213.put(var1, this.field5218[0]);
			} else {
				this.field5218[var2] = new class458(var1, var2);
				this.field5213.put(var1, this.field5218[var2]);
				this.method9246(var2);
			}

			return true;
		}
	}

	public Iterator iterator() {
		return new class459(this);
	}

	public boolean contains(Object var1) {
		return this.field5213.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5217 != null) {
			Arrays.sort(var1, this.field5217);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Object poll() {
		if (this.field5216 == 0) {
			return null;
		} else {
			++this.field5214;
			Object var1 = this.field5218[0].field5206;
			this.field5213.remove(var1);
			--this.field5216;
			if (this.field5216 == 0) {
				this.field5218[this.field5216] = null;
			} else {
				this.field5218[0] = this.field5218[this.field5216];
				this.field5218[0].field5205 = 0;
				this.field5218[this.field5216] = null;
				this.method9227(0);
			}

			return var1;
		}
	}
}
