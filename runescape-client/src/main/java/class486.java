import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public final class class486 {
	@ObfuscatedName("al")
	final Comparator field5247;
	@ObfuscatedName("ab")
	final Map field5251;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final class456 field5249;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final class456 field5250;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -2489235999170015371L
	)
	final long field5248;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	final class484 field5252;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1904133951
	)
	final int field5253;

	@ObfuscatedSignature(
		descriptor = "(JILsw;)V"
	)
	class486(long var1, int var3, class484 var4) {
		this.field5247 = new class485(this);
		this.field5248 = var1;
		this.field5253 = var3;
		this.field5252 = var4;
		if (this.field5253 == -1) {
			this.field5251 = new HashMap(64);
			this.field5249 = new class456(64, this.field5247);
			this.field5250 = null;
		} else {
			if (this.field5252 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5251 = new HashMap(this.field5253);
			this.field5249 = new class456(this.field5253, this.field5247);
			this.field5250 = new class456(this.field5253);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsw;)V"
	)
	public class486(int var1, class484 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	boolean method9845() {
		return this.field5253 != -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1348492305"
	)
	public Object method9833(Object var1) {
		synchronized(this) {
			if (-1L != this.field5248) {
				this.method9832();
			}

			class487 var3 = (class487)this.field5251.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9837(var3, false);
				return var3.field5259;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1224393901"
	)
	public Object method9836(Object var1, Object var2) {
		synchronized(this) {
			if (this.field5248 != -1L) {
				this.method9832();
			}

			class487 var4 = (class487)this.field5251.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5259;
				var4.field5259 = var2;
				this.method9837(var4, false);
				return var8;
			} else {
				class487 var5;
				if (this.method9845() && this.field5251.size() == this.field5253) {
					var5 = (class487)this.field5250.remove();
					this.field5251.remove(var5.field5260);
					this.field5249.remove(var5);
				}

				var5 = new class487(var2, var1);
				this.field5251.put(var1, var5);
				this.method9837(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsv;ZI)V",
		garbageValue = "979131476"
	)
	void method9837(class487 var1, boolean var2) {
		if (!var2) {
			this.field5249.remove(var1);
			if (this.method9845() && !this.field5250.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5257 = System.currentTimeMillis();
		if (this.method9845()) {
			switch(this.field5252.field5243) {
			case 0:
				++var1.field5258;
				break;
			case 1:
				var1.field5258 = var1.field5257;
			}

			this.field5250.add(var1);
		}

		this.field5249.add(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	void method9832() {
		if (-1L == this.field5248) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5248;

			while (!this.field5249.isEmpty()) {
				class487 var3 = (class487)this.field5249.peek();
				if (var3.field5257 >= var1) {
					return;
				}

				this.field5251.remove(var3.field5260);
				this.field5249.remove(var3);
				if (this.method9845()) {
					this.field5250.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1163680823"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5251.clear();
			this.field5249.clear();
			if (this.method9845()) {
				this.field5250.clear();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method9855(int var0) {
		return (var0 & class576.field5748) - 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-700704798"
	)
	static void method9834() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2638().last(); var2 != null; var2 = (ObjectSound)var1.method2638().previous()) {
				if (var2.obj != null) {
					var2.set();
				}
			}
		}

	}
}
