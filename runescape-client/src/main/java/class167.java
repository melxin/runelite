import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class167 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -6942288683400013351L
	)
	long field1898;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 7482336616541902515L
	)
	public long field1899;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	IterableNodeDeque field1900;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public class167(Buffer var1) {
		this.field1899 = -1L;
		this.field1900 = new IterableNodeDeque();
		this.method4096(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)V",
		garbageValue = "26035"
	)
	void method4096(Buffer var1) {
		this.field1898 = var1.readLong();
		this.field1899 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class173(this);
			} else if (var2 == 3) {
				var3 = new class158(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class166)var3).vmethod4154(var1);
			this.field1900.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "939879134"
	)
	public void method4092(ClanChannel var1) {
		if (var1.key == this.field1898 && var1.field1913 == this.field1899) {
			for (class166 var2 = (class166)this.field1900.last(); var2 != null; var2 = (class166)this.field1900.previous()) {
				var2.vmethod4151(var1);
			}

			++var1.field1913;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "1283421798"
	)
	static byte[] method4105(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var3 + var4;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltl;III)V",
		garbageValue = "-1787119218"
	)
	public static void method4102(DynamicArray var0, int var1, int var2) {
		if (var0 != null && var0.method10433() > 1) {
			PacketBufferNode.method7052(var0, (class572)null, true);
			if (var0.field5571 == class572.field5879) {
				class478.method9779(var0.method10430(), var0.method10433(), var1, var2);
			} else if (var0.field5571 == class572.field5878) {
				class478.method9780(var0.method10431(), var0.method10433(), var1, var2);
			} else {
				class478.method9781(var0.method10428(), var0.method10433(), var1, var2);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "46"
	)
	static void method4104(int[] var0, int var1, int var2) {
		while (var1 < var2) {
			int var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ILtl;III)V",
		garbageValue = "1910947913"
	)
	static void method4091(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
		if (var0.field5571 == class572.field5879) {
			System.arraycopy(var0.array, var1, var2.array, var3, var4);
		} else if (var0.field5571 == class572.field5878) {
			System.arraycopy(var0.field5575, var1, var2.field5575, var3, var4);
		} else {
			System.arraycopy(var0.field5576, var1, var2.field5576, var3, var4);
		}

	}
}
