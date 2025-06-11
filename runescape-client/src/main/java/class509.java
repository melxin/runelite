import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class509 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public final class563 field5288;
	@ObfuscatedName("an")
	public final boolean field5293;
	@ObfuscatedName("ai")
	public int field5287;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1238202665
	)
	public int field5291;
	@ObfuscatedName("ac")
	Object field5292;
	@ObfuscatedName("aa")
	public int[] field5294;
	@ObfuscatedName("am")
	long[] field5289;
	@ObfuscatedName("ah")
	Object[] field5295;

	@ObfuscatedSignature(
		descriptor = "(Lve;Z)V"
	)
	public class509(class563 var1, boolean var2) {
		this.field5288 = var1;
		this.field5293 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Lve;Ljava/lang/Object;II)V"
	)
	public class509(class563 var1, Object var2, int var3, int var4) {
		this.field5293 = true;
		this.field5288 = var1;
		this.field5291 = var4;
		this.field5292 = var2;
		if (var1 == class563.field5600) {
			this.field5294 = new int[var4];
		} else if (var1 == class563.field5594) {
			this.field5289 = new long[var4];
		} else if (var1 == class563.field5595) {
			this.field5295 = new String[var4];
		}

		this.method9944(var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-76"
	)
	public final int[] method9965() {
		return this.field5294;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[J",
		garbageValue = "1291371752"
	)
	final long[] method9973() {
		return this.field5289;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)[Ljava/lang/Object;",
		garbageValue = "3204"
	)
	public final Object[] method9936() {
		return this.field5295;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	public final int method9937() {
		return this.field5287 * 935110769;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1408382303"
	)
	final Object method9938(int var1) {
		if (this.field5288 == class563.field5600) {
			return this.field5294[var1];
		} else {
			return this.field5288 == class563.field5594 ? this.field5289[var1] : this.field5295[var1];
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "928924774"
	)
	final void method9939(int var1, Object var2) {
		if (this.field5288 == class563.field5600) {
			this.field5294[var1] = (Integer)var2;
		} else if (this.field5288 == class563.field5594) {
			this.field5289[var1] = (Long)var2;
		} else {
			this.field5295[var1] = var2;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-306311565"
	)
	public final void method9976(int var1) {
		this.method9941(var1);
		this.method9944(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1402"
	)
	final void method9941(int var1) {
		if (!this.field5293) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.field5291) {
				this.method9949(this.method9968(var1));
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-238878481"
	)
	int method9968(int var1) {
		int var2 = this.field5291 + (this.field5291 >> 1);
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-817816324"
	)
	void method9949(int var1) {
		if (this.field5291 != var1) {
			this.field5291 = var1;
			if (this.field5288 == class563.field5600) {
				this.field5294 = Arrays.copyOf(this.field5294, var1);
			} else if (this.field5288 == class563.field5594) {
				this.field5289 = Arrays.copyOf(this.field5289, var1);
			} else if (this.field5288 == class563.field5595) {
				this.field5295 = Arrays.copyOf(this.field5295, var1);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "96"
	)
	final void method9944(int var1) {
		int var2 = this.field5287 * 935110769;
		this.field5287 = var1 * 1090132113;
		if (var1 < var2) {
			if (this.field5288 == class563.field5600) {
				Arrays.fill(this.field5294, var1, var2, 0);
			} else if (this.field5288 == class563.field5594) {
				Arrays.fill(this.field5289, var1, var2, 0L);
			} else {
				Arrays.fill(this.field5295, var1, var2, (Object)null);
			}
		} else if (var1 > var2) {
			if (this.field5288 == class563.field5600) {
				int var5 = (Integer)this.field5292;
				if (var5 != 0) {
					Arrays.fill(this.field5294, var2, var1, var5);
				}
			} else if (this.field5288 == class563.field5594) {
				long var3 = (Long)this.field5292;
				if (0L != var3) {
					Arrays.fill(this.field5289, var2, var1, var3);
				}
			} else if (this.field5292 != null) {
				Arrays.fill(this.field5295, var2, var1, this.field5292);
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "10"
	)
	public void method9945(Buffer var1) {
		var1.writeShort(this.field5287 * 935110769);
		int var2;
		if (this.field5288 == class563.field5600) {
			var1.writeByte(0);

			for (var2 = 0; var2 < this.field5287 * 935110769; ++var2) {
				var1.writeInt(this.field5294[var2]);
			}
		} else if (this.field5288 == class563.field5594) {
			var1.writeByte(1);

			for (var2 = 0; var2 < this.field5287 * 935110769; ++var2) {
				var1.writeLong(this.field5289[var2]);
			}
		} else if (this.field5288 == class563.field5595) {
			var1.writeByte(2);

			for (var2 = 0; var2 < this.field5287 * 935110769; ++var2) {
				var1.writeStringCp1252NullTerminated((String)this.field5295[var2]);
			}
		}

	}
}
