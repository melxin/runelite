import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class456 {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 637004629
	)
	static int field5001;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	class452 field4999;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -728863639
	)
	int field4998;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2027456091
	)
	int field5000;

	@ObfuscatedSignature(
		descriptor = "(Lrn;II)V"
	)
	class456(class452 var1, int var2, int var3) {
		this.field4998 = 0;
		this.field5000 = 0;
		this.field4999 = var1;
		this.field4998 = var2;
		this.field5000 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1041332992"
	)
	public String method8803() {
		if (this.method8805()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8802());

			for (int var2 = this.field4998; var2 < this.field5000; ++var2) {
				class454 var3 = this.field4999.method8552(var2);
				var1.append(var3.field4974);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1868433047"
	)
	boolean method8804(int var1) {
		return this.field4999.method8655() == 2 || this.field4999.method8655() == 1 && (!this.field4999.field4963 || this.field5000 - 1 != var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1976575165"
	)
	public boolean method8805() {
		return this.field4998 == this.field5000;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "785926966"
	)
	public int method8802() {
		return this.field5000 - this.field4998;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)Z",
		garbageValue = "-1873808834"
	)
	boolean method8806(class454 var1) {
		if (this.field4999.field4965 == 2) {
			return true;
		} else if (this.field4999.field4965 == 0) {
			return false;
		} else {
			return this.field4999.method8632() != var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "731102107"
	)
	int method8824() {
		if (this.method8805()) {
			return 0;
		} else {
			class454 var1 = this.field4999.method8552(this.field5000 - 1);
			if (var1.field4974 == '\n') {
				return 0;
			} else if (this.method8806(var1)) {
				return this.field4999.field4964.advances[42];
			} else {
				int var2 = this.field4999.field4964.advances[var1.field4974];
				if (var2 == 0) {
					return var1.field4974 == '\t' ? this.field4999.field4964.advances[32] * 3 : this.field4999.field4964.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Luv;",
		garbageValue = "-1176270027"
	)
	public class541 method8808() {
		if (this.method8805()) {
			return new class541(0, 0);
		} else {
			class454 var1 = this.field4999.method8552(this.field5000 - 1);
			return new class541(var1.field4972 + this.method8824(), var1.field4971);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "697971714"
	)
	public class454 method8821(int var1) {
		return var1 >= 0 && var1 < this.method8802() ? this.field4999.method8552(this.field4998 + var1) : null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-737477347"
	)
	static int method8831(int var0, Script var1, boolean var2) {
		return 2;
	}
}
