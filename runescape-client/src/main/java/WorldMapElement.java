import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 134506511
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("lm")
	static String field1997;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 50924905
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 191158763
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1719022835
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("al")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2032885629
	)
	public int field1996;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -367454329
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aa")
	public boolean field1998;
	@ObfuscatedName("am")
	public boolean field2000;
	@ObfuscatedName("an")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ae")
	int[] field2002;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1093298753
	)
	int field2003;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1709027597
	)
	int field2007;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1252222821
	)
	int field2005;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1502275431
	)
	int field1990;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ax")
	int[] field2009;
	@ObfuscatedName("ak")
	byte[] field2010;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -566293439
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1998 = true;
		this.field2000 = false;
		this.menuActions = new String[5];
		this.field2003 = Integer.MAX_VALUE;
		this.field2007 = Integer.MAX_VALUE;
		this.field2005 = Integer.MIN_VALUE;
		this.field1990 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1627631135"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "733819842"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1996 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1998 = false;
				}

				if ((var6 & 2) == 2) {
					this.field2000 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field2002 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field2002[var4] = var1.readShort();
				}

				var1.method1958();
				var4 = var1.readUnsignedByte();
				this.field2009 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2009.length; ++var5) {
					this.field2009[var5] = var1.method1958();
				}

				this.field2010 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field2010[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.method1958();
				} else if (var2 == 22) {
					var1.method1958();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2088, HorizontalAlignment.field2089};
					this.horizontalAlignment = (HorizontalAlignment)class173.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2167, VerticalAlignment.field2172, VerticalAlignment.VerticalAlignment_centered};
					this.verticalAlignment = (VerticalAlignment)class173.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "836494955"
	)
	void method4183() {
		if (this.field2002 != null) {
			for (int var1 = 0; var1 < this.field2002.length; var1 += 2) {
				if (this.field2002[var1] < this.field2003) {
					this.field2003 = this.field2002[var1];
				} else if (this.field2002[var1] > this.field2005) {
					this.field2005 = this.field2002[var1];
				}

				if (this.field2002[var1 + 1] < this.field2007) {
					this.field2007 = this.field2002[var1 + 1];
				} else if (this.field2002[var1 + 1] > this.field1990) {
					this.field1990 = this.field2002[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lxt;",
		garbageValue = "-2030326822"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lxt;",
		garbageValue = "-179058894"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = SoundCache.SpriteBuffer_getSprite(class169.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "425079402"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "-1979610932"
	)
	public static void method4205(class345 var0) {
		if (!class339.field3893.contains(var0)) {
			class339.field3893.add(var0);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1771498025"
	)
	static void method4204(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Loi;IB)Ljava/lang/String;",
		garbageValue = "-63"
	)
	static String method4186(Widget var0, int var1) {
		if (!VarcInt.method4212(class388.getWidgetFlags2(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && !var0.actions[var1].trim().isEmpty() ? var0.actions[var1] : null;
		}
	}
}
