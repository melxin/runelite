import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public abstract class class512 implements class310 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	class555 field5251;

	class512(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-707800152"
	)
	abstract void vmethod9557(Buffer var1, int var2);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-696535352"
	)
	public void method9553(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class508[] var3 = new class508[]{class508.field5238, class508.field5239, class508.field5240, class508.field5241};
			class508 var4 = (class508)class454.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field5237) {
				case 0:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 1:
					class454.findEnumerated(WorldViewManager.method2570(), var1.readUnsignedByte());
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					int var5 = var1.readUnsignedByte();
					this.field5251 = class330.method6526(var5);
					if (this.field5251 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					}
				}
			} else {
				this.vmethod9557(var1, var2);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1703168683"
	)
	boolean method9555() {
		return this.field5251 != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "43"
	)
	Object method9556() {
		if (this.field5251 == class555.field5495) {
			return 0;
		} else if (this.field5251 == class555.field5491) {
			return -1L;
		} else {
			return this.field5251 == class555.field5492 ? "" : null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "1522255432"
	)
	static class137 method9563(int var0) {
		class137[] var1 = new class137[]{class137.field1631, class137.field1632, class137.field1633, class137.field1639, class137.field1634, class137.field1636};
		class137 var2 = (class137)class454.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class137.field1631;
		}

		return var2;
	}
}
