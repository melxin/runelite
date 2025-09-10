import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public final class class490 {
	@ObfuscatedName("af")
	final Comparator field5363;
	@ObfuscatedName("aw")
	final Map field5356;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	final class460 field5358;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	final class460 field5359;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -521006244743754223L
	)
	final long field5360;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	final class488 field5361;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -141961497
	)
	final int field5362;

	@ObfuscatedSignature(
		descriptor = "(JILsl;)V"
	)
	class490(long var1, int var3, class488 var4) {
		this.field5363 = new class489(this);
		this.field5360 = var1;
		this.field5362 = var3;
		this.field5361 = var4;
		if (this.field5362 == -1) {
			this.field5356 = new HashMap(64);
			this.field5358 = new class460(64, this.field5363);
			this.field5359 = null;
		} else {
			if (this.field5361 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5356 = new HashMap(this.field5362);
			this.field5358 = new class460(this.field5362, this.field5363);
			this.field5359 = new class460(this.field5362);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsl;)V"
	)
	public class490(int var1, class488 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1534053870"
	)
	boolean method9816() {
		return this.field5362 != -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2080029629"
	)
	public Object method9819(Object var1) {
		synchronized(this) {
			if (this.field5360 != -1L) {
				this.method9833();
			}

			class491 var3 = (class491)this.field5356.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9818(var3, false);
				return var3.field5366;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1390854500"
	)
	public Object method9834(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field5360) {
				this.method9833();
			}

			class491 var4 = (class491)this.field5356.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5366;
				var4.field5366 = var2;
				this.method9818(var4, false);
				return var8;
			} else {
				class491 var5;
				if (this.method9816() && this.field5356.size() == this.field5362) {
					var5 = (class491)this.field5359.remove();
					this.field5356.remove(var5.field5364);
					this.field5358.remove(var5);
				}

				var5 = new class491(var2, var1);
				this.field5356.put(var1, var5);
				this.method9818(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ZI)V",
		garbageValue = "-1027749019"
	)
	void method9818(class491 var1, boolean var2) {
		if (!var2) {
			this.field5358.remove(var1);
			if (this.method9816() && !this.field5359.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5365 = System.currentTimeMillis();
		if (this.method9816()) {
			switch(this.field5361.field5352) {
			case 0:
				var1.field5367 = var1.field5365;
				break;
			case 1:
				++var1.field5367;
			}

			this.field5359.add(var1);
		}

		this.field5358.add(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method9833() {
		if (-1L == this.field5360) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5360;

			while (!this.field5358.isEmpty()) {
				class491 var3 = (class491)this.field5358.peek();
				if (var3.field5365 >= var1) {
					return;
				}

				this.field5356.remove(var3.field5364);
				this.field5358.remove(var3);
				if (this.method9816()) {
					this.field5359.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5356.clear();
			this.field5358.clear();
			if (this.method9816()) {
				this.field5359.clear();
			}

		}
	}
}
