import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
@Implements("DynamicArray")
public class DynamicArray {
	@ObfuscatedName("ks")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	public final class586 field5584;
	@ObfuscatedName("ag")
	public final boolean field5585;
	@ObfuscatedName("an")
	@Export("size")
	public int size;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1016864637
	)
	public int field5587;
	@ObfuscatedName("aj")
	Object field5588;
	@ObfuscatedName("ak")
	@Export("array")
	public int[] array;
	@ObfuscatedName("aw")
	public long[] field5590;
	@ObfuscatedName("ap")
	public Object[] field5586;

	@ObfuscatedSignature(
		descriptor = "(Lwh;Z)V"
	)
	public DynamicArray(class586 var1, boolean var2) {
		this.field5584 = var1;
		this.field5585 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Lwh;Ljava/lang/Object;II)V"
	)
	public DynamicArray(class586 var1, Object var2, int var3, int var4) {
		this.field5585 = true;
		this.field5584 = var1;
		this.field5587 = var4;
		this.field5588 = var2;
		if (var1 == class586.field5937) {
			this.array = new int[var4];
		} else if (var1 == class586.field5942) {
			this.field5590 = new long[var4];
		} else if (var1 == class586.field5939) {
			this.field5586 = new String[var4];
		}

		this.method10649(var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2053374425"
	)
	public final int[] method10650() {
		return this.array;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[J",
		garbageValue = "10"
	)
	final long[] method10651() {
		return this.field5590;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljava/lang/Object;",
		garbageValue = "-66"
	)
	public final Object[] method10681() {
		return this.field5586;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	public final int method10652() {
		return this.size * 1583568339;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/Object;",
		garbageValue = "-7543"
	)
	final Object method10673(int var1) {
		if (this.field5584 == class586.field5937) {
			return this.array[var1];
		} else {
			return this.field5584 == class586.field5942 ? this.field5590[var1] : this.field5586[var1];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1904613362"
	)
	final void method10663(int var1, Object var2) {
		if (this.field5584 == class586.field5937) {
			this.array[var1] = (Integer)var2;
		} else if (this.field5584 == class586.field5942) {
			this.field5590[var1] = (Long)var2;
		} else {
			this.field5586[var1] = var2;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "100"
	)
	public final void method10655(int var1) {
		this.method10656(var1);
		this.method10649(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-117529853"
	)
	final void method10656(int var1) {
		if (!this.field5585) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.field5587) {
				this.method10658(this.method10683(var1));
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "20"
	)
	int method10683(int var1) {
		int var2 = this.field5587 + (this.field5587 >> 1);
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1793819103"
	)
	void method10658(int var1) {
		if (this.field5587 != var1) {
			this.field5587 = var1;
			if (this.field5584 == class586.field5937) {
				this.array = Arrays.copyOf(this.array, var1);
			} else if (this.field5584 == class586.field5942) {
				this.field5590 = Arrays.copyOf(this.field5590, var1);
			} else if (this.field5584 == class586.field5939) {
				this.field5586 = Arrays.copyOf(this.field5586, var1);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-71"
	)
	final void method10649(int var1) {
		int var2 = this.size * 1583568339;
		this.size = var1 * -1205286309;
		if (var1 < var2) {
			if (this.field5584 == class586.field5937) {
				Arrays.fill(this.array, var1, var2, 0);
			} else if (this.field5584 == class586.field5942) {
				Arrays.fill(this.field5590, var1, var2, 0L);
			} else {
				Arrays.fill(this.field5586, var1, var2, (Object)null);
			}
		} else if (var1 > var2) {
			if (this.field5584 == class586.field5937) {
				int var5 = (Integer)this.field5588;
				if (var5 != 0) {
					Arrays.fill(this.array, var2, var1, var5);
				}
			} else if (this.field5584 == class586.field5942) {
				long var3 = (Long)this.field5588;
				if (var3 != 0L) {
					Arrays.fill(this.field5590, var2, var1, var3);
				}
			} else if (this.field5588 != null) {
				Arrays.fill(this.field5586, var2, var1, this.field5588);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "3"
	)
	public void method10670(Buffer var1) {
		var1.writeShort(this.size * 1583568339);
		int var2;
		if (this.field5584 == class586.field5937) {
			var1.writeByte(0);

			for (var2 = 0; var2 < this.size * 1583568339; ++var2) {
				var1.writeInt(this.array[var2]);
			}
		} else if (this.field5584 == class586.field5942) {
			var1.writeByte(1);

			for (var2 = 0; var2 < this.size * 1583568339; ++var2) {
				var1.writeLong(this.field5590[var2]);
			}
		} else if (this.field5584 == class586.field5939) {
			var1.writeByte(2);

			for (var2 = 0; var2 < this.size * 1583568339; ++var2) {
				var1.writeStringCp1252NullTerminated((String)this.field5586[var2]);
			}
		}

	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1904722388"
	)
	static final int method10686(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
