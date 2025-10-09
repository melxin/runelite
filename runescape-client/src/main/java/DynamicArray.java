import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("DynamicArray")
public class DynamicArray {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	public final class572 field5571;
	@ObfuscatedName("ag")
	public final boolean field5570;
	@ObfuscatedName("aj")
	@Export("size")
	public int size;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1472786963
	)
	public int field5572;
	@ObfuscatedName("af")
	Object field5573;
	@ObfuscatedName("ae")
	@Export("array")
	int[] array;
	@ObfuscatedName("aq")
	public long[] field5575;
	@ObfuscatedName("ac")
	Object[] field5576;

	@ObfuscatedSignature(
		descriptor = "(Lwe;Z)V"
	)
	public DynamicArray(class572 var1, boolean var2) {
		this.field5571 = var1;
		this.field5570 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Lwe;Ljava/lang/Object;II)V"
	)
	public DynamicArray(class572 var1, Object var2, int var3, int var4) {
		this.field5570 = true;
		this.field5571 = var1;
		this.field5572 = var4;
		this.field5573 = var2;
		if (var1 == class572.field5879) {
			this.array = new int[var4];
		} else if (var1 == class572.field5878) {
			this.field5575 = new long[var4];
		} else if (var1 == class572.field5877) {
			this.field5576 = new String[var4];
		}

		this.method10440(var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "36"
	)
	public final int[] method10430() {
		return this.array;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[J",
		garbageValue = "1552863854"
	)
	final long[] method10431() {
		return this.field5575;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "1188562551"
	)
	public final Object[] method10428() {
		return this.field5576;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-120"
	)
	public final int method10433() {
		return this.size * 479682119;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1385960136"
	)
	final Object method10434(int var1) {
		if (this.field5571 == class572.field5879) {
			return this.array[var1];
		} else {
			return this.field5571 == class572.field5878 ? this.field5575[var1] : this.field5576[var1];
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "997514288"
	)
	final void method10435(int var1, Object var2) {
		if (this.field5571 == class572.field5879) {
			this.array[var1] = (Integer)var2;
		} else if (this.field5571 == class572.field5878) {
			this.field5575[var1] = (Long)var2;
		} else {
			this.field5576[var1] = var2;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "821778995"
	)
	public final void method10456(int var1) {
		this.method10437(var1);
		this.method10440(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1816568150"
	)
	final void method10437(int var1) {
		if (!this.field5570) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.field5572) {
				this.method10468(this.method10438(var1));
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1437485140"
	)
	int method10438(int var1) {
		int var2 = this.field5572 + (this.field5572 >> 1);
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1048731799"
	)
	void method10468(int var1) {
		if (this.field5572 != var1) {
			this.field5572 = var1;
			if (this.field5571 == class572.field5879) {
				this.array = Arrays.copyOf(this.array, var1);
			} else if (this.field5571 == class572.field5878) {
				this.field5575 = Arrays.copyOf(this.field5575, var1);
			} else if (this.field5571 == class572.field5877) {
				this.field5576 = Arrays.copyOf(this.field5576, var1);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	final void method10440(int var1) {
		int var2 = this.size * 479682119;
		this.size = var1 * 1093200759;
		if (var1 < var2) {
			if (this.field5571 == class572.field5879) {
				Arrays.fill(this.array, var1, var2, 0);
			} else if (this.field5571 == class572.field5878) {
				Arrays.fill(this.field5575, var1, var2, 0L);
			} else {
				Arrays.fill(this.field5576, var1, var2, (Object)null);
			}
		} else if (var1 > var2) {
			if (this.field5571 == class572.field5879) {
				int var5 = (Integer)this.field5573;
				if (var5 != 0) {
					Arrays.fill(this.array, var2, var1, var5);
				}
			} else if (this.field5571 == class572.field5878) {
				long var3 = (Long)this.field5573;
				if (0L != var3) {
					Arrays.fill(this.field5575, var2, var1, var3);
				}
			} else if (this.field5573 != null) {
				Arrays.fill(this.field5576, var2, var1, this.field5573);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1075959232"
	)
	public void method10448(Buffer var1) {
		var1.writeShort(this.size * 479682119);
		int var2;
		if (this.field5571 == class572.field5879) {
			var1.writeByte(0);

			for (var2 = 0; var2 < this.size * 479682119; ++var2) {
				var1.writeInt(this.array[var2]);
			}
		} else if (this.field5571 == class572.field5878) {
			var1.writeByte(1);

			for (var2 = 0; var2 < this.size * 479682119; ++var2) {
				var1.writeLong(this.field5575[var2]);
			}
		} else if (this.field5571 == class572.field5877) {
			var1.writeByte(2);

			for (var2 = 0; var2 < this.size * 479682119; ++var2) {
				var1.writeStringCp1252NullTerminated((String)this.field5576[var2]);
			}
		}

	}
}
