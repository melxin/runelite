import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1107492311
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 802420521
	)
	public int field2015;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 221382165
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 840361369
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 292443457
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 349252879
	)
	public int field2007;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 689026667
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1833373539
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1683759989
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -397083115
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1085713115
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field2007 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "9"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "1830543019"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "1287339576"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(class172.field1904, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lxv;",
		garbageValue = "48"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(class172.field1904, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906804617"
	)
	static void method4257() {
		synchronized(ArchiveDiskActionHandler.field4796) {
			if (ArchiveDiskActionHandler.field4795 == 0) {
				class27.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class27.ArchiveDiskActionHandler_thread.setDaemon(true);
				class27.ArchiveDiskActionHandler_thread.start();
				class27.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4795 = 600;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)I",
		garbageValue = "-65346655"
	)
	public static int method4258(class515 var0, int var1) {
		class267.method6013(var0, class570.field5721);
		if (var1 >= 0) {
			int[] var2 = var0.method10348();
			int var3 = var0.method10351();

			for (int var4 = 0; var4 < var3; ++var4) {
				if (var1 < var2[var4]) {
					return var4;
				}

				var1 -= var2[var4];
			}
		}

		return -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-110"
	)
	static final int method4254(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(ILtz;Ldj;I)I",
		garbageValue = "-813601895"
	)
	static int method4252(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == Client.field326) {
			var3 = var2.plane;
		} else if (Client.field326 == -1) {
			var3 = var1.field5320.method4438();
		} else {
			WorldEntity var4 = Client.worldViewManager.method2318();
			WorldView var5 = var4.worldView;
			if (var5.plane == var4.field5320.method4438()) {
				if (var0 == -1) {
					var3 = var4.getX();
				} else {
					var3 = var1.field5320.method4438();
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "326845586"
	)
	static final void method4255(int var0, int var1, int var2, boolean var3) {
		if (class167.widgetDefinition.loadInterface(var0)) {
			PcmPlayer.resizeInterface(class167.widgetDefinition.Widget_interfaceComponents[var0], 0, class167.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3);
		}
	}
}
