import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public abstract class class499 implements class308 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	class544 field5133;

	class499(int var1) {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "66"
	)
	abstract void vmethod9531(Buffer var1, int var2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1938210601"
	)
	public void method9530(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class495 var3 = (class495)StructComposition.findEnumerated(ArchiveLoader.method2586(), var2);
			if (var3 != null) {
				switch(var3.field5123) {
				case 0:
					StructComposition.findEnumerated(class4.method16(), var1.readUnsignedByte());
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					int var4 = var1.readUnsignedByte();
					this.field5133 = EnumComposition.method5280(var4);
					if (this.field5133 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod9531(var1, var2);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	boolean method9532() {
		return this.field5133 != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1060776712"
	)
	Object method9534() {
		if (this.field5133 == class544.field5392) {
			return 0;
		} else if (this.field5133 == class544.field5395) {
			return -1L;
		} else {
			return this.field5133 == class544.field5393 ? "" : null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-126"
	)
	static final int method9540(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "3"
	)
	static int method9539(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5469[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
