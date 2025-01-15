import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public final class class465 {
	@ObfuscatedName("ay")
	final Comparator field4964;
	@ObfuscatedName("ah")
	final Map field4960;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	final class434 field4961;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	final class434 field4962;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 3203989653765037379L
	)
	final long field4963;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class463 field4965;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1227924963
	)
	final int field4959;

	@ObfuscatedSignature(
		descriptor = "(JILrq;)V"
	)
	class465(long var1, int var3, class463 var4) {
		this.field4964 = new class464(this);
		this.field4963 = var1;
		this.field4959 = var3;
		this.field4965 = var4;
		if (this.field4959 == -1) {
			this.field4960 = new HashMap(64);
			this.field4961 = new class434(64, this.field4964);
			this.field4962 = null;
		} else {
			if (this.field4965 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4960 = new HashMap(this.field4959);
			this.field4961 = new class434(this.field4959, this.field4964);
			this.field4962 = new class434(this.field4959);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrq;)V"
	)
	public class465(int var1, class463 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1479259566"
	)
	boolean method9036() {
		return this.field4959 != -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2061781268"
	)
	public Object method9037(Object var1) {
		synchronized(this) {
			if (this.field4963 != -1L) {
				this.method9052();
			}

			class466 var3 = (class466)this.field4960.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9048(var3, false);
				return var3.field4970;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "607857320"
	)
	public Object method9038(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4963) {
				this.method9052();
			}

			class466 var4 = (class466)this.field4960.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4970;
				var4.field4970 = var2;
				this.method9048(var4, false);
				return var8;
			} else {
				class466 var5;
				if (this.method9036() && this.field4960.size() == this.field4959) {
					var5 = (class466)this.field4962.remove();
					this.field4960.remove(var5.field4967);
					this.field4961.remove(var5);
				}

				var5 = new class466(var2, var1);
				this.field4960.put(var1, var5);
				this.method9048(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrs;ZI)V",
		garbageValue = "2120275250"
	)
	void method9048(class466 var1, boolean var2) {
		if (!var2) {
			this.field4961.remove(var1);
			if (this.method9036() && !this.field4962.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4969 = System.currentTimeMillis();
		if (this.method9036()) {
			switch(this.field4965.field4952) {
			case 0:
				var1.field4966 = var1.field4969;
				break;
			case 1:
				++var1.field4966;
			}

			this.field4962.add(var1);
		}

		this.field4961.add(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "583766195"
	)
	void method9052() {
		if (this.field4963 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4963;

			while (!this.field4961.isEmpty()) {
				class466 var3 = (class466)this.field4961.peek();
				if (var3.field4969 >= var1) {
					return;
				}

				this.field4960.remove(var3.field4967);
				this.field4961.remove(var3);
				if (this.method9036()) {
					this.field4962.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1000767985"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4960.clear();
			this.field4961.clear();
			if (this.method9036()) {
				this.field4962.clear();
			}

		}
	}
}
