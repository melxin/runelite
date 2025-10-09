import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
public abstract class class526 implements class312 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	class572 field5622;

	class526(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "496057084"
	)
	abstract void vmethod10587(Buffer var1, int var2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "597306179"
	)
	public void method10586(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class522 var3 = (class522)ScriptFrame.findEnumerated(class302.method6841(), var2);
			if (var3 != null) {
				switch(var3.field5615) {
				case 0:
					ScriptFrame.findEnumerated(class292.method6727(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					this.field5622 = Tile.method4986(var4);
					if (this.field5622 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod10587(var1, var2);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	boolean method10588() {
		return this.field5622 != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "965804614"
	)
	Object method10589() {
		if (this.field5622 == class572.field5879) {
			return 0;
		} else if (this.field5622 == class572.field5878) {
			return -1L;
		} else {
			return this.field5622 == class572.field5877 ? "" : null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/lang/Object;III)I",
		garbageValue = "464472696"
	)
	public static int method10592(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10433()) {
			var3 = var0.method10433();
		}

		int var5;
		if (var0.field5571 == class572.field5879) {
			int[] var11 = var0.method10430();
			var5 = (Integer)var1;

			for (int var6 = var2; var6 < var3; ++var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5571 == class572.field5878) {
			long[] var10 = var0.method10431();
			long var8 = (Long)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var8 == var10[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10428();

			for (var5 = var2; var5 < var3; ++var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}
}
