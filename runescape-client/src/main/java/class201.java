import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class201 extends DualNode {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static EvictingDualNodeHashTable field2177;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("aq")
	public String field2176;
	@ObfuscatedName("ao")
	String[] field2173;
	@ObfuscatedName("az")
	public boolean field2178;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1717116721
	)
	int field2179;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 770750683
	)
	int field2180;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 467270011
	)
	int field2181;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1940682735
	)
	int field2182;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -304469001
	)
	int field2183;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 30479619
	)
	int field2184;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	class582 field2172;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2002980719
	)
	int field2171;

	static {
		field2177 = new EvictingDualNodeHashTable(64);
	}

	class201() {
		this.field2176 = "null";
		this.field2173 = new String[5];
		this.field2178 = false;
		this.field2179 = 0;
		this.field2180 = 0;
		this.field2181 = 0;
		this.field2182 = 0;
		this.field2183 = 0;
		this.field2184 = 0;
		this.field2171 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1119243444"
	)
	void method4454(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4436(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "1379388853"
	)
	void method4436(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2171 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		default:
			break;
		case 4:
			this.field2179 = var1.readShort();
			break;
		case 5:
			this.field2180 = var1.readShort();
			break;
		case 6:
			this.field2181 = var1.readShort();
			break;
		case 7:
			this.field2182 = var1.readShort();
			break;
		case 8:
			this.field2183 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2184 = var1.readUnsignedShort();
			break;
		case 12:
			this.field2176 = var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2178 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2173[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2173[var3].equalsIgnoreCase("Hidden")) {
				this.field2173[var3] = null;
			}
			break;
		case 20:
			var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-193281146"
	)
	void method4437() {
		this.field2172 = new class582(this.field2183, this.field2184, this.field2181, this.field2182);
		short var1 = 362;
		new class582(var1 + this.field2183, var1 + this.field2184, this.field2181, this.field2182);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-161941256"
	)
	public int method4438() {
		return this.field2171;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-30827"
	)
	public int method4439() {
		return this.field2179;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2120971921"
	)
	public int method4441() {
		return this.field2180;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lwe;",
		garbageValue = "-1649003009"
	)
	public class582 method4453() {
		return this.field2172;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lox;IIII)V",
		garbageValue = "-544411000"
	)
	static final void method4440(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7902(class167.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class484.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
