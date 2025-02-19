import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public final class class477 {
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1127952831
	)
	static int field5082;
	@ObfuscatedName("ab")
	final Comparator field5087;
	@ObfuscatedName("ay")
	final Map field5083;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	final class450 field5085;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	final class450 field5086;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 8953405526988630883L
	)
	final long field5089;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	final class475 field5084;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -474274211
	)
	final int field5088;

	@ObfuscatedSignature(
		descriptor = "(JILsj;)V"
	)
	class477(long var1, int var3, class475 var4) {
		this.field5087 = new class476(this);
		this.field5089 = var1;
		this.field5088 = var3;
		this.field5084 = var4;
		if (this.field5088 == -1) {
			this.field5083 = new HashMap(64);
			this.field5085 = new class450(64, this.field5087);
			this.field5086 = null;
		} else {
			if (this.field5084 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5083 = new HashMap(this.field5088);
			this.field5085 = new class450(this.field5088, this.field5087);
			this.field5086 = new class450(this.field5088);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsj;)V"
	)
	public class477(int var1, class475 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "157003142"
	)
	boolean method9047() {
		return this.field5088 != -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1849689463"
	)
	public Object method9042(Object var1) {
		synchronized(this) {
			if (this.field5089 != -1L) {
				this.method9040();
			}

			class478 var3 = (class478)this.field5083.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9039(var3, false);
				return var3.field5095;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-621257710"
	)
	public Object method9038(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field5089) {
				this.method9040();
			}

			class478 var4 = (class478)this.field5083.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5095;
				var4.field5095 = var2;
				this.method9039(var4, false);
				return var8;
			} else {
				class478 var5;
				if (this.method9047() && this.field5083.size() == this.field5088) {
					var5 = (class478)this.field5086.remove();
					this.field5083.remove(var5.field5091);
					this.field5085.remove(var5);
				}

				var5 = new class478(var2, var1);
				this.field5083.put(var1, var5);
				this.method9039(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsk;ZB)V",
		garbageValue = "4"
	)
	void method9039(class478 var1, boolean var2) {
		if (!var2) {
			this.field5085.remove(var1);
			if (this.method9047() && !this.field5086.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5092 = System.currentTimeMillis();
		if (this.method9047()) {
			switch(this.field5084.field5080) {
			case 0:
				++var1.field5093;
				break;
			case 1:
				var1.field5093 = var1.field5092;
			}

			this.field5086.add(var1);
		}

		this.field5085.add(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	void method9040() {
		if (-1L == this.field5089) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5089;

			while (!this.field5085.isEmpty()) {
				class478 var3 = (class478)this.field5085.peek();
				if (var3.field5092 >= var1) {
					return;
				}

				this.field5083.remove(var3.field5091);
				this.field5085.remove(var3);
				if (this.method9047()) {
					this.field5086.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106946667"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5083.clear();
			this.field5085.clear();
			if (this.method9047()) {
				this.field5086.clear();
			}

		}
	}
}
