import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public final class class498 {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("av")
	final Comparator field5440;
	@ObfuscatedName("at")
	final Map field5435;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	final class468 field5436;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	final class468 field5437;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -1872081348891082963L
	)
	final long field5438;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	final class496 field5439;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 324683267
	)
	final int field5434;

	@ObfuscatedSignature(
		descriptor = "(JILtb;)V"
	)
	class498(long var1, int var3, class496 var4) {
		this.field5440 = new class497(this);
		this.field5438 = var1;
		this.field5434 = var3;
		this.field5439 = var4;
		if (this.field5434 == -1) {
			this.field5435 = new HashMap(64);
			this.field5436 = new class468(64, this.field5440);
			this.field5437 = null;
		} else {
			if (this.field5439 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5435 = new HashMap(this.field5434);
			this.field5436 = new class468(this.field5434, this.field5440);
			this.field5437 = new class468(this.field5434);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILtb;)V"
	)
	public class498(int var1, class496 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	boolean method10139() {
		return this.field5434 != -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1934219016"
	)
	public Object method10126(Object var1) {
		synchronized(this) {
			if (this.field5438 != -1L) {
				this.method10129();
			}

			class499 var3 = (class499)this.field5435.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method10128(var3, false);
				return var3.field5443;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1214301467"
	)
	public Object method10124(Object var1, Object var2) {
		synchronized(this) {
			if (this.field5438 != -1L) {
				this.method10129();
			}

			class499 var4 = (class499)this.field5435.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5443;
				var4.field5443 = var2;
				this.method10128(var4, false);
				return var8;
			} else {
				class499 var5;
				if (this.method10139() && this.field5435.size() == this.field5434) {
					var5 = (class499)this.field5437.remove();
					this.field5435.remove(var5.field5444);
					this.field5436.remove(var5);
				}

				var5 = new class499(var2, var1);
				this.field5435.put(var1, var5);
				this.method10128(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltt;ZI)V",
		garbageValue = "2023365228"
	)
	void method10128(class499 var1, boolean var2) {
		if (!var2) {
			this.field5436.remove(var1);
			if (this.method10139() && !this.field5437.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5445 = System.currentTimeMillis();
		if (this.method10139()) {
			switch(this.field5439.field5431) {
			case 0:
				var1.field5446 = var1.field5445;
				break;
			case 1:
				++var1.field5446;
			}

			this.field5437.add(var1);
		}

		this.field5436.add(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1375939680"
	)
	void method10129() {
		if (-1L == this.field5438) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5438;

			while (!this.field5436.isEmpty()) {
				class499 var3 = (class499)this.field5436.peek();
				if (var3.field5445 >= var1) {
					return;
				}

				this.field5435.remove(var3.field5444);
				this.field5436.remove(var3);
				if (this.method10139()) {
					this.field5437.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5435.clear();
			this.field5436.clear();
			if (this.method10139()) {
				this.field5437.clear();
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "67"
	)
	public static int method10136(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1076608302"
	)
	public static int method10142(int var0) {
		return var0 >> 14 & 1023;
	}
}
