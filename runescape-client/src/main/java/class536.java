import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
public abstract class class536 implements class319 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	class586 field5640;

	class536(int var1) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1489048031"
	)
	abstract void vmethod10810(Buffer var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "558607637"
	)
	public void method10818(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class532[] var3 = new class532[]{class532.field5631, class532.field5632, class532.field5635, class532.field5630};
			class532 var4 = (class532)GrandExchangeOffer.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field5634) {
				case 0:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 1:
					GrandExchangeOffer.findEnumerated(MusicPatchNode.method7598(), var1.readUnsignedByte());
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					int var5 = var1.readUnsignedByte();
					this.field5640 = class251.method5495(var5);
					if (this.field5640 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					}
				}
			} else {
				this.vmethod10810(var1, var2);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	boolean method10811() {
		return this.field5640 != null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "2042259295"
	)
	Object method10809() {
		if (this.field5640 == class586.field5937) {
			return 0;
		} else if (this.field5640 == class586.field5942) {
			return -1L;
		} else {
			return this.field5640 == class586.field5939 ? "" : null;
		}
	}
}
