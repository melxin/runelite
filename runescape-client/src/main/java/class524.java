import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
public abstract class class524 implements class311 {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	class570 field5449;

	class524(int var1) {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "2015342623"
	)
	abstract void vmethod10514(Buffer var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1914360259"
	)
	public void method10507(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class520 var3 = (class520)HealthBarConfig.findEnumerated(class142.method3706(), var2);
			if (var3 != null) {
				switch(var3.field5442) {
				case 0:
					HealthBarConfig.findEnumerated(class132.method3574(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					this.field5449 = WorldMapDecoration.method6802(var4);
					if (this.field5449 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod10514(var1, var2);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1796187099"
	)
	boolean method10510() {
		return this.field5449 != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1337242868"
	)
	Object method10509() {
		if (this.field5449 == class570.field5721) {
			return 0;
		} else if (this.field5449 == class570.field5724) {
			return -1L;
		} else {
			return this.field5449 == class570.field5718 ? "" : null;
		}
	}
}
