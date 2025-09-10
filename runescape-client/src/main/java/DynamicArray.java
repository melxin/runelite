import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
@Implements("DynamicArray")
public class DynamicArray {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	public final class574 field5504;
	@ObfuscatedName("at")
	public final boolean field5501;
	@ObfuscatedName("ac")
	@Export("size")
	public int size;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -187538165
	)
	public int field5503;
	@ObfuscatedName("aq")
	Object field5500;
	@ObfuscatedName("ao")
	@Export("array")
	public int[] array;
	@ObfuscatedName("as")
	long[] field5508;
	@ObfuscatedName("al")
	Object[] field5506;

	@ObfuscatedSignature(
		descriptor = "(Lwv;Z)V"
	)
	public DynamicArray(class574 var1, boolean var2) {
		this.field5504 = var1;
		this.field5501 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Lwv;Ljava/lang/Object;II)V"
	)
	public DynamicArray(class574 var1, Object var2, int var3, int var4) {
		this.field5501 = true;
		this.field5504 = var1;
		this.field5503 = var4;
		this.field5500 = var2;
		if (var1 == class574.field5820) {
			this.array = new int[var4];
		} else if (var1 == class574.field5816) {
			this.field5508 = new long[var4];
		} else if (var1 == class574.field5824) {
			this.field5506 = new String[var4];
		}

		this.method10362(var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1192999187"
	)
	public final int[] method10318() {
		return this.array;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[J",
		garbageValue = "-1809212408"
	)
	final long[] method10320() {
		return this.field5508;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "-1324526901"
	)
	public final Object[] method10321() {
		return this.field5506;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1771498025"
	)
	public final int method10322() {
		return this.size * -1549457881;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "754893750"
	)
	final Object method10323(int var1) {
		if (this.field5504 == class574.field5820) {
			return this.array[var1];
		} else {
			return this.field5504 == class574.field5816 ? this.field5508[var1] : this.field5506[var1];
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-342330548"
	)
	final void method10363(int var1, Object var2) {
		if (this.field5504 == class574.field5820) {
			this.array[var1] = (Integer)var2;
		} else if (this.field5504 == class574.field5816) {
			this.field5508[var1] = (Long)var2;
		} else {
			this.field5506[var1] = var2;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1259812629"
	)
	public final void method10337(int var1) {
		this.method10355(var1);
		this.method10362(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "962628418"
	)
	final void method10355(int var1) {
		if (!this.field5501) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.field5503) {
				this.method10328(this.method10327(var1));
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-119"
	)
	int method10327(int var1) {
		int var2 = this.field5503 + (this.field5503 >> 1);
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	void method10328(int var1) {
		if (this.field5503 != var1) {
			this.field5503 = var1;
			if (this.field5504 == class574.field5820) {
				this.array = Arrays.copyOf(this.array, var1);
			} else if (this.field5504 == class574.field5816) {
				this.field5508 = Arrays.copyOf(this.field5508, var1);
			} else if (this.field5504 == class574.field5824) {
				this.field5506 = Arrays.copyOf(this.field5506, var1);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "83"
	)
	final void method10362(int var1) {
		int var2 = this.size * -1549457881;
		this.size = var1 * -698619497;
		if (var1 < var2) {
			if (this.field5504 == class574.field5820) {
				Arrays.fill(this.array, var1, var2, 0);
			} else if (this.field5504 == class574.field5816) {
				Arrays.fill(this.field5508, var1, var2, 0L);
			} else {
				Arrays.fill(this.field5506, var1, var2, (Object)null);
			}
		} else if (var1 > var2) {
			if (this.field5504 == class574.field5820) {
				int var5 = (Integer)this.field5500;
				if (var5 != 0) {
					Arrays.fill(this.array, var2, var1, var5);
				}
			} else if (this.field5504 == class574.field5816) {
				long var3 = (Long)this.field5500;
				if (0L != var3) {
					Arrays.fill(this.field5508, var2, var1, var3);
				}
			} else if (this.field5500 != null) {
				Arrays.fill(this.field5506, var2, var1, this.field5500);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "235844079"
	)
	public void method10329(Buffer var1) {
		var1.writeShort(this.size * -1549457881);
		int var2;
		if (this.field5504 == class574.field5820) {
			var1.writeByte(0);

			for (var2 = 0; var2 < this.size * -1549457881; ++var2) {
				var1.writeInt(this.array[var2]);
			}
		} else if (this.field5504 == class574.field5816) {
			var1.writeByte(1);

			for (var2 = 0; var2 < this.size * -1549457881; ++var2) {
				var1.writeLong(this.field5508[var2]);
			}
		} else if (this.field5504 == class574.field5824) {
			var1.writeByte(2);

			for (var2 = 0; var2 < this.size * -1549457881; ++var2) {
				var1.writeStringCp1252NullTerminated((String)this.field5506[var2]);
			}
		}

	}
}
