import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class207 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static EvictingDualNodeHashTable field2237;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static EvictingDualNodeHashTable field2248;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -913317043
	)
	static int field2252;
	@ObfuscatedName("ao")
	public String field2233;
	@ObfuscatedName("aa")
	public String[] field2234;
	@ObfuscatedName("aq")
	public boolean field2227;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 365389617
	)
	int field2235;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1597504643
	)
	int field2236;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 420693345
	)
	int field2238;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2043328725
	)
	int field2232;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1708957505
	)
	int field2240;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1934803429
	)
	int field2241;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1402587353
	)
	int field2242;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	class564 field2243;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	class564[] field2244;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1496622753
	)
	int field2245;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 2058769091
	)
	int field2224;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	class406 field2247;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	class386 field2246;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -318810877
	)
	int field2249;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 168300967
	)
	int field2231;

	static {
		field2237 = new EvictingDualNodeHashTable(64);
		field2248 = new EvictingDualNodeHashTable(64);
	}

	class207() {
		this.field2233 = "null";
		this.field2234 = new String[5];
		this.field2227 = false;
		this.field2235 = 0;
		this.field2236 = 0;
		this.field2238 = 0;
		this.field2232 = 0;
		this.field2240 = 0;
		this.field2241 = 0;
		this.field2242 = -1;
		this.field2244 = new class564[4];
		this.field2245 = -1;
		this.field2224 = 0;
		this.field2247 = class406.field4908;
		this.field2246 = class386.field4427;
		this.field2249 = -1;
		this.field2231 = 39188;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "113503557"
	)
	public int method4610() {
		return this.field2245;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1035328937"
	)
	void method4611(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4645(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1948815390"
	)
	void method4645(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2224 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		case 21:
		case 22:
		default:
			break;
		case 4:
			this.field2235 = var1.readShort();
			break;
		case 5:
			this.field2236 = var1.readShort();
			break;
		case 6:
			this.field2238 = var1.readShort();
			break;
		case 7:
			this.field2232 = var1.readShort();
			break;
		case 8:
			this.field2240 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2241 = var1.readUnsignedShort();
			break;
		case 12:
			this.field2233 = var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2227 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2234[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2234[var3].equalsIgnoreCase("Hidden")) {
				this.field2234[var3] = null;
			}

			this.field2227 = true;
			break;
		case 20:
			var1.readUnsignedShort();
			break;
		case 23:
			this.field2247 = (class406)GrandExchangeOffer.findEnumerated(class170.method4189(), var1.readUnsignedByte());
			break;
		case 24:
			this.field2246 = (class386)GrandExchangeOffer.findEnumerated(class222.method4988(), var1.readUnsignedByte());
			break;
		case 25:
			this.field2242 = var1.readUnsignedShort();
			break;
		case 26:
			this.field2249 = var1.readNullableLargeSmart();
			break;
		case 27:
			this.field2231 = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-521677348"
	)
	void method4613() {
		this.field2243 = new class564(this.field2240, this.field2241, this.field2238, this.field2232);
		this.method4614();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	void method4614() {
		short var1 = 256;
		this.field2244[0] = new class564(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2232);
		var1 = 362;
		this.field2244[2] = new class564(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2232);
		var1 = 334;
		this.field2244[1] = new class564(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2232);
		this.field2244[3] = this.field2244[1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	public int method4615() {
		return this.field2224;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	public int method4628() {
		return this.field2235;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1292643"
	)
	public int method4617() {
		return this.field2236;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1936731261"
	)
	public int method4618() {
		return this.field2242;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lvt;",
		garbageValue = "-1958663222"
	)
	public class564 method4619() {
		return this.field2243;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lpn;",
		garbageValue = "123"
	)
	public class406 method4620() {
		return this.field2247;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "420774120"
	)
	public class386 method4621() {
		return this.field2246;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lxt;",
		garbageValue = "-64"
	)
	public SpritePixels method4640() {
		if (this.field2249 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2248.get((long)this.field2249);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.SpriteBuffer_getSprite(class141.field1694, this.field2249, 0);
				if (var1 != null) {
					field2248.put(var1, (long)this.field2249);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1872155345"
	)
	public int method4658() {
		return this.field2231;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;IIB)[Lxm;",
		garbageValue = "-9"
	)
	public static IndexedSprite[] method4647(AbstractArchive var0, int var1, int var2) {
		if (!FloorOverlayDefinition.method4919(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class615.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class615.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class208.SpriteBuffer_spriteWidth;
				var6.height = class144.SpriteBuffer_spriteHeight;
				var6.xOffset = class615.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class615.SpriteBuffer_yOffsets[var5];
				var6.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class615.SpriteBuffer_spriteHeights[var5] * 449044205;
				var6.palette = BufferedSource.SpriteBuffer_spritePalette;
				var6.pixels = class320.SpriteBuffer_pixels[var5];
			}

			class615.SpriteBuffer_xOffsets = null;
			class615.SpriteBuffer_yOffsets = null;
			IntHashTable.SpriteBuffer_spriteWidths = null;
			class615.SpriteBuffer_spriteHeights = null;
			BufferedSource.SpriteBuffer_spritePalette = null;
			class320.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "77"
	)
	static int method4659(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			VarbitComposition.method4668(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)Lof;",
		garbageValue = "601122207"
	)
	static Widget method4626(Widget var0) {
		int var1 = class330.method7260(class191.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = class226.widgetDefinition.method7728(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
