import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
public abstract class class528 implements class313 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field5550;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	class574 field5551;

	class528(int var1) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "21"
	)
	abstract void vmethod10463(Buffer var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1571063977"
	)
	public void method10462(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class524[] var3 = new class524[]{class524.field5542, class524.field5540, class524.field5543, class524.field5541};
			class524 var4 = (class524)class173.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field5544) {
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					int var5 = var1.readUnsignedByte();
					this.field5551 = class491.method9850(var5);
					if (this.field5551 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 3:
					class173.findEnumerated(class374.method8145(), var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.vmethod10463(var1, var2);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "76"
	)
	boolean method10475() {
		return this.field5551 != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1714484639"
	)
	Object method10465() {
		if (this.field5551 == class574.field5820) {
			return 0;
		} else if (this.field5551 == class574.field5816) {
			return -1L;
		} else {
			return this.field5551 == class574.field5824 ? "" : null;
		}
	}
}
