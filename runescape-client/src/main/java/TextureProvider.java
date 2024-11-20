import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jm")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 391237351
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1505199993
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ao")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 472624929
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.textures = new Texture[var1.getGroupFileCount(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
				this.textures[var7[var9]] = new Texture(var10);
			}
		} else {
			this.textures = new Texture[0];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "70"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) {
			return 100;
		} else {
			int var1 = 0;
			int var2 = 0;
			Texture[] var3 = this.textures;

			for (int var4 = 0; var4 < var3.length; ++var4) {
				Texture var5 = var3[var4];
				if (var5 != null && var5.fileIds != null) {
					var1 += var5.fileIds.length;
					int[] var6 = var5.fileIds;

					for (int var7 = 0; var7 < var6.length; ++var7) {
						int var8 = var6[var7];
						if (this.archive.method7580(var8)) {
							++var2;
						}
					}
				}
			}

			if (var1 == 0) {
				return 0;
			} else {
				return var2 * 100 / var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-36"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-203742621"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean vmethod5526(int var1) {
		return this.textures[var1].field2544;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-882535974"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "893202348"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "196"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;",
		garbageValue = "611200086"
	)
	public static class544 method5186(int var0) {
		int var1 = class542.field5387[var0];
		if (var1 == 1) {
			return class544.field5392;
		} else if (var1 == 2) {
			return class544.field5399;
		} else {
			return var1 == 3 ? class544.field5391 : null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-66"
	)
	static int method5193(int var0, Script var1, boolean var2) {
		Widget var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
