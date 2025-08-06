import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public class class515 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	public final class570 field5399;
	@ObfuscatedName("ac")
	public final boolean field5400;
	@ObfuscatedName("av")
	int field5401;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1063659871
	)
	int field5402;
	@ObfuscatedName("as")
	Object field5403;
	@ObfuscatedName("ah")
	int[] field5404;
	@ObfuscatedName("ap")
	long[] field5405;
	@ObfuscatedName("am")
	Object[] field5406;

	@ObfuscatedSignature(
		descriptor = "(Lvf;Z)V"
	)
	class515(class570 var1, boolean var2) {
		this.field5399 = var1;
		this.field5400 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;Ljava/lang/Object;II)V"
	)
	public class515(class570 var1, Object var2, int var3, int var4) {
		this.field5400 = true;
		this.field5399 = var1;
		this.field5402 = var4;
		this.field5403 = var2;
		if (var1 == class570.field5721) {
			this.field5404 = new int[var4];
		} else if (var1 == class570.field5724) {
			this.field5405 = new long[var4];
		} else if (var1 == class570.field5718) {
			this.field5406 = new String[var4];
		}

		this.method10358(var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2034257173"
	)
	public final int[] method10348() {
		return this.field5404;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[J",
		garbageValue = "27"
	)
	final long[] method10377() {
		return this.field5405;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "-1671068294"
	)
	public final Object[] method10393() {
		return this.field5406;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1747068260"
	)
	public final int method10351() {
		return this.field5401 * -519676011;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-536881167"
	)
	final Object method10352(int var1) {
		if (this.field5399 == class570.field5721) {
			return this.field5404[var1];
		} else {
			return this.field5399 == class570.field5724 ? this.field5405[var1] : this.field5406[var1];
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-2123880166"
	)
	final void method10361(int var1, Object var2) {
		if (this.field5399 == class570.field5721) {
			this.field5404[var1] = (Integer)var2;
		} else if (this.field5399 == class570.field5724) {
			this.field5405[var1] = (Long)var2;
		} else {
			this.field5406[var1] = var2;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1459669578"
	)
	public final void method10354(int var1) {
		this.method10398(var1);
		this.method10358(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1139960371"
	)
	final void method10398(int var1) {
		if (!this.field5400) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.field5402) {
				this.method10356(this.method10392(var1));
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "221897707"
	)
	int method10392(int var1) {
		int var2 = this.field5402 + (this.field5402 >> 1);
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2079710084"
	)
	void method10356(int var1) {
		if (this.field5402 != var1) {
			this.field5402 = var1;
			if (this.field5399 == class570.field5721) {
				this.field5404 = Arrays.copyOf(this.field5404, var1);
			} else if (this.field5399 == class570.field5724) {
				this.field5405 = Arrays.copyOf(this.field5405, var1);
			} else if (this.field5399 == class570.field5718) {
				this.field5406 = Arrays.copyOf(this.field5406, var1);
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	final void method10358(int var1) {
		int var2 = this.field5401 * -519676011;
		this.field5401 = var1 * 1527641021;
		if (var1 < var2) {
			if (this.field5399 == class570.field5721) {
				Arrays.fill(this.field5404, var1, var2, 0);
			} else if (this.field5399 == class570.field5724) {
				Arrays.fill(this.field5405, var1, var2, 0L);
			} else {
				Arrays.fill(this.field5406, var1, var2, (Object)null);
			}
		} else if (var1 > var2) {
			if (this.field5399 == class570.field5721) {
				int var5 = (Integer)this.field5403;
				if (var5 != 0) {
					Arrays.fill(this.field5404, var2, var1, var5);
				}
			} else if (this.field5399 == class570.field5724) {
				long var3 = (Long)this.field5403;
				if (var3 != 0L) {
					Arrays.fill(this.field5405, var2, var1, var3);
				}
			} else if (this.field5403 != null) {
				Arrays.fill(this.field5406, var2, var1, this.field5403);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1378372413"
	)
	public void method10359(Buffer var1) {
		var1.writeShort(this.field5401 * -519676011);
		int var2;
		if (this.field5399 == class570.field5721) {
			var1.writeByte(0);

			for (var2 = 0; var2 < this.field5401 * -519676011; ++var2) {
				var1.writeInt(this.field5404[var2]);
			}
		} else if (this.field5399 == class570.field5724) {
			var1.writeByte(1);

			for (var2 = 0; var2 < this.field5401 * -519676011; ++var2) {
				var1.writeLong(this.field5405[var2]);
			}
		} else if (this.field5399 == class570.field5718) {
			var1.writeByte(2);

			for (var2 = 0; var2 < this.field5401 * -519676011; ++var2) {
				var1.writeStringCp1252NullTerminated((String)this.field5406[var2]);
			}
		}

	}
}
