import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class202 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static EvictingDualNodeHashTable field2228;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static EvictingDualNodeHashTable field2230;
	@ObfuscatedName("ai")
	public String field2213;
	@ObfuscatedName("am")
	public String[] field2214;
	@ObfuscatedName("al")
	public boolean field2215;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 362226429
	)
	int field2210;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1760281807
	)
	int field2217;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -225185621
	)
	int field2232;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1114475729
	)
	int field2219;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 361916405
	)
	int field2220;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 2067642301
	)
	int field2223;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 442567821
	)
	int field2218;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	class584 field2221;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lwq;"
	)
	class584[] field2224;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 958872875
	)
	int field2222;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 29727629
	)
	int field2226;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	class396 field2227;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	class377 field2225;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1613530001
	)
	int field2229;

	static {
		field2228 = new EvictingDualNodeHashTable(64);
		field2230 = new EvictingDualNodeHashTable(64);
	}

	class202() {
		this.field2213 = "null";
		this.field2214 = new String[5];
		this.field2215 = false;
		this.field2210 = 0;
		this.field2217 = 0;
		this.field2232 = 0;
		this.field2219 = 0;
		this.field2220 = 0;
		this.field2223 = 0;
		this.field2218 = -1;
		this.field2224 = new class584[4];
		this.field2222 = -1;
		this.field2226 = 0;
		this.field2227 = class396.field4885;
		this.field2225 = class377.field4392;
		this.field2229 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method4523() {
		return this.field2222;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1786740311"
	)
	void method4515(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4549(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "2069431939"
	)
	void method4549(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2226 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		case 21:
		case 22:
		default:
			break;
		case 4:
			this.field2210 = var1.readShort();
			break;
		case 5:
			this.field2217 = var1.readShort();
			break;
		case 6:
			this.field2232 = var1.readShort();
			break;
		case 7:
			this.field2219 = var1.readShort();
			break;
		case 8:
			this.field2220 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2223 = var1.readUnsignedShort();
			break;
		case 12:
			this.field2213 = var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2215 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2214[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2214[var3].equalsIgnoreCase("Hidden")) {
				this.field2214[var3] = null;
			}

			this.field2215 = true;
			break;
		case 20:
			var1.readUnsignedShort();
			break;
		case 23:
			this.field2227 = (class396)ScriptFrame.findEnumerated(Client.method1500(), var1.readUnsignedByte());
			break;
		case 24:
			class377[] var4 = new class377[]{class377.field4387, class377.field4386, class377.field4395};
			this.field2225 = (class377)ScriptFrame.findEnumerated(var4, var1.readUnsignedByte());
			break;
		case 25:
			this.field2218 = var1.readUnsignedShort();
			break;
		case 26:
			this.field2229 = var1.readNullableLargeSmart();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-12461"
	)
	void method4517() {
		this.field2221 = new class584(this.field2220, this.field2223, this.field2232, this.field2219);
		this.method4518();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1041516101"
	)
	void method4518() {
		short var1 = 256;
		this.field2224[0] = new class584(var1 + this.field2220, var1 + this.field2223, this.field2232, this.field2219);
		var1 = 362;
		this.field2224[2] = new class584(var1 + this.field2220, var1 + this.field2223, this.field2232, this.field2219);
		var1 = 334;
		this.field2224[1] = new class584(var1 + this.field2220, var1 + this.field2223, this.field2232, this.field2219);
		this.field2224[3] = this.field2224[1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2053342165"
	)
	public int method4539() {
		return this.field2226;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	public int method4520() {
		return this.field2210;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "335467483"
	)
	public int method4521() {
		return this.field2217;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method4522() {
		return this.field2218;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lwq;",
		garbageValue = "824992946"
	)
	public class584 method4516() {
		return this.field2221;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lph;",
		garbageValue = "0"
	)
	public class396 method4524() {
		return this.field2227;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "947582506"
	)
	public class377 method4525() {
		return this.field2225;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "1929132625"
	)
	public SpritePixels method4514() {
		if (this.field2229 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2230.get((long)this.field2229);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(class267.field3180, this.field2229, 0);
				if (var1 != null) {
					field2230.put(var1, (long)this.field2229);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-80160230"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
