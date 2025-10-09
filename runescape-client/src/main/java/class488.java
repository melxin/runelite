import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public final class class488 {
	@ObfuscatedName("ab")
	final Comparator field5410;
	@ObfuscatedName("at")
	final Map field5409;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class458 field5408;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class458 field5412;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 6116086858691943137L
	)
	final long field5411;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	final class486 field5413;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -140190097
	)
	final int field5414;

	@ObfuscatedSignature(
		descriptor = "(JILsx;)V"
	)
	class488(long var1, int var3, class486 var4) {
		this.field5410 = new class487(this);
		this.field5411 = var1;
		this.field5414 = var3;
		this.field5413 = var4;
		if (this.field5414 == -1) {
			this.field5409 = new HashMap(64);
			this.field5408 = new class458(64, this.field5410);
			this.field5412 = null;
		} else {
			if (this.field5413 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5409 = new HashMap(this.field5414);
			this.field5408 = new class458(this.field5414, this.field5410);
			this.field5412 = new class458(this.field5414);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsx;)V"
	)
	public class488(int var1, class486 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method9910() {
		return this.field5414 != -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1887149471"
	)
	public Object method9911(Object var1) {
		synchronized(this) {
			if (this.field5411 != -1L) {
				this.method9914();
			}

			class489 var3 = (class489)this.field5409.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9913(var3, false);
				return var3.field5417;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "138508923"
	)
	public Object method9921(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field5411) {
				this.method9914();
			}

			class489 var4 = (class489)this.field5409.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5417;
				var4.field5417 = var2;
				this.method9913(var4, false);
				return var8;
			} else {
				class489 var5;
				if (this.method9910() && this.field5409.size() == this.field5414) {
					var5 = (class489)this.field5412.remove();
					this.field5409.remove(var5.field5416);
					this.field5408.remove(var5);
				}

				var5 = new class489(var2, var1);
				this.field5409.put(var1, var5);
				this.method9913(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsc;ZI)V",
		garbageValue = "1116112676"
	)
	void method9913(class489 var1, boolean var2) {
		if (!var2) {
			this.field5408.remove(var1);
			if (this.method9910() && !this.field5412.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5418 = System.currentTimeMillis();
		if (this.method9910()) {
			switch(this.field5413.field5406) {
			case 0:
				++var1.field5415;
				break;
			case 1:
				var1.field5415 = var1.field5418;
			}

			this.field5412.add(var1);
		}

		this.field5408.add(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	void method9914() {
		if (-1L == this.field5411) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5411;

			while (!this.field5408.isEmpty()) {
				class489 var3 = (class489)this.field5408.peek();
				if (var3.field5418 >= var1) {
					return;
				}

				this.field5409.remove(var3.field5416);
				this.field5408.remove(var3);
				if (this.method9910()) {
					this.field5412.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5409.clear();
			this.field5408.clear();
			if (this.method9910()) {
				this.field5412.clear();
			}

		}
	}
}
