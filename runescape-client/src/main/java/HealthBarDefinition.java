import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static AbstractArchive field2572;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("jr")
	static int[] field2578;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1735350197
	)
	public int field2568;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 849378789
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 437889605
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 798558681
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1254299183
	)
	public int field2565;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 566914995
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 683773839
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1171934191
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1397526847
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 714006507
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
		this.field2565 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "163483323"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "-95"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "1179546533"
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
				var1 = ChatChannel.SpriteBuffer_getSprite(field2572, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-1979105144"
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
				var1 = ChatChannel.SpriteBuffer_getSprite(field2572, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "63"
	)
	static int method5247(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--ScriptFrame.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			DesktopPlatformInfoProvider.method9651(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			ScriptFrame.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class451.method8899(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
