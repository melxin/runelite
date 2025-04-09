import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public abstract class class512 implements class310 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	class555 field5272;

	class512(int var1) {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "2117475033"
	)
	abstract void vmethod9606(Buffer var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "120"
	)
	public void method9605(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class508[] var3 = new class508[]{class508.field5262, class508.field5263, class508.field5265, class508.field5266};
			class508 var4 = (class508)ArchiveDiskActionHandler.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field5267) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field5272 = SpotAnimationDefinition.method5259(var5);
					if (this.field5272 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					class387[] var6 = new class387[]{class387.field4580, class387.field4581, class387.field4583, class387.field4578};
					ArchiveDiskActionHandler.findEnumerated(var6, var1.readUnsignedByte());
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod9606(var1, var2);
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2026772333"
	)
	boolean method9607() {
		return this.field5272 != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1305055409"
	)
	Object method9604() {
		if (this.field5272 == class555.field5525) {
			return 0;
		} else if (this.field5272 == class555.field5520) {
			return -1L;
		} else {
			return this.field5272 == class555.field5521 ? "" : null;
		}
	}
}
