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

@ObfuscatedName("rq")
public class class458 extends AbstractQueue {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ab")
	final Comparator field5268;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrc;"
	)
	class456[] field5265;
	@ObfuscatedName("ag")
	Map field5267;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1382092093
	)
	int field5266;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -467516741
	)
	int field5269;

	public class458(int var1, Comparator var2) {
		this.field5269 = 0;
		this.field5265 = new class456[var1];
		this.field5267 = new HashMap();
		this.field5268 = var2;
	}

	public class458(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	void method9297() {
		int var1 = (this.field5265.length << 1) + 1;
		this.field5265 = (class456[])((class456[])Arrays.copyOf(this.field5265, var1));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1636425641"
	)
	void method9298(int var1) {
		class456 var2;
		int var3;
		for (var2 = this.field5265[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class456 var4 = this.field5265[var3];
			if (this.field5268 != null) {
				if (this.field5268.compare(var2.field5256, var4.field5256) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field5256).compareTo(var4.field5256) >= 0) {
				break;
			}

			this.field5265[var1] = var4;
			this.field5265[var1].field5258 = var1;
		}

		this.field5265[var1] = var2;
		this.field5265[var1].field5258 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	void method9299(int var1) {
		class456 var2 = this.field5265[var1];

		int var8;
		for (int var3 = this.field5266 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class456 var5 = this.field5265[var4];
			int var6 = (var1 << 1) + 2;
			class456 var7 = this.field5265[var6];
			if (this.field5268 != null) {
				if (var6 < this.field5266 && this.field5268.compare(var5.field5256, var7.field5256) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5266 && ((Comparable)var5.field5256).compareTo(var7.field5256) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field5268 != null) {
				if (this.field5268.compare(var2.field5256, this.field5265[var8].field5256) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field5256).compareTo(this.field5265[var8].field5256) <= 0) {
				break;
			}

			this.field5265[var1] = this.field5265[var8];
			this.field5265[var1].field5258 = var1;
		}

		this.field5265[var1] = var2;
		this.field5265[var1].field5258 = var1;
	}

	public boolean remove(Object var1) {
		class456 var2 = (class456)this.field5267.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field5269;
			--this.field5266;
			if (this.field5266 == var2.field5258) {
				this.field5265[this.field5266] = null;
				return true;
			} else {
				class456 var3 = this.field5265[this.field5266];
				this.field5265[this.field5266] = null;
				this.field5265[var2.field5258] = var3;
				this.field5265[var2.field5258].field5258 = var2.field5258;
				this.method9299(var2.field5258);
				if (var3 == this.field5265[var2.field5258]) {
					this.method9298(var2.field5258);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field5266 == 0 ? null : this.field5265[0].field5256;
	}

	public boolean offer(Object var1) {
		if (this.field5267.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field5269;
			int var2 = this.field5266;
			if (var2 >= this.field5265.length) {
				this.method9297();
			}

			++this.field5266;
			if (var2 == 0) {
				this.field5265[0] = new class456(var1, 0);
				this.field5267.put(var1, this.field5265[0]);
			} else {
				this.field5265[var2] = new class456(var1, var2);
				this.field5267.put(var1, this.field5265[var2]);
				this.method9298(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field5266 == 0) {
			return null;
		} else {
			++this.field5269;
			Object var1 = this.field5265[0].field5256;
			this.field5267.remove(var1);
			--this.field5266;
			if (this.field5266 == 0) {
				this.field5265[this.field5266] = null;
			} else {
				this.field5265[0] = this.field5265[this.field5266];
				this.field5265[0].field5258 = 0;
				this.field5265[this.field5266] = null;
				this.method9299(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field5267.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5268 != null) {
			Arrays.sort(var1, this.field5268);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class457(this);
	}

	public int size() {
		return this.field5266;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)F",
		garbageValue = "-15"
	)
	static float method9316(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (float)(var2 - var1);
	}
}
