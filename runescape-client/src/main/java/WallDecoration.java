import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1360717247176388875L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 355786887
	)
	@Export("z")
	int z;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1661396665
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -68301323
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -499550773
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 738440143
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1001841007
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 103501313
	)
	int field2974;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 588140379
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2061198463
	)
	int field2985;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1931344609
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "22"
	)
	void method5785(int var1, int var2) {
		this.yOffset = var1;
		this.field2974 = var2;
		switch(this.orientation) {
		case 1:
			++var1;
			break;
		case 2:
			--var2;
		case 3:
		case 5:
		case 6:
		case 7:
		default:
			break;
		case 4:
			--var1;
			break;
		case 8:
			++var2;
		}

		this.xOffset = var1;
		this.field2985 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-2130616148"
	)
	static final boolean method5786(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label68:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label68;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = SpriteMask.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field391;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}
}
