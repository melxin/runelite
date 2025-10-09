import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("vh")
public abstract class class550 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -172657989
	)
	int field5735;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 323333331
	)
	int field5738;
	@ObfuscatedName("ap")
	double field5737;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2061351653
	)
	int field5736;

	class550(int var1, int var2) {
		this.field5735 = 0;
		this.field5738 = 0;
		this.field5737 = 0.0D;
		this.field5736 = 0;
		this.field5735 = var1;
		this.field5738 = 0;
		this.field5736 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		int var4 = this.field5738;
		int var5 = this.field5735;
		int var7 = this.field5736;
		class336 var6 = class336.field3873[var7];
		this.field5737 = class147.method3887((long)var4, (long)var5, var6);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	public void method10770() {
		if (this.field5738 < this.field5735) {
			++this.field5738;
			int var1 = this.field5738;
			int var2 = this.field5735;
			int var4 = this.field5736;
			class336 var3 = class336.field3873[var4];
			this.field5737 = class147.method3887((long)var1, (long)var2, var3);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "495142011"
	)
	double method10766() {
		return this.field5737;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lwd;",
		garbageValue = "828693387"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class142.field1721.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method11217(new Buffer(var2));
			}

			var1.method11219();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1785387346"
	)
	static int method10765(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			UrlRequest.Interpreter_intStackSize -= 2;
			Client.field347 = (short)ReflectionCheck.method737(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
			if (Client.field347 <= 0) {
				Client.field347 = 256;
			}

			Client.field348 = (short)ReflectionCheck.method737(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
			if (Client.field348 <= 0) {
				Client.field348 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			UrlRequest.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			UrlRequest.Interpreter_intStackSize -= 4;
			Client.field458 = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			if (Client.field458 <= 0) {
				Client.field458 = 1;
			}

			Client.field352 = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			if (Client.field352 <= 0) {
				Client.field352 = 32767;
			} else if (Client.field352 < Client.field458) {
				Client.field352 = Client.field458;
			}

			Client.field353 = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			if (Client.field353 <= 0) {
				Client.field353 = 1;
			}

			Client.field354 = (short)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
			if (Client.field354 <= 0) {
				Client.field354 = 32767;
			} else if (Client.field354 < Client.field353) {
				Client.field354 = Client.field353;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class173.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height * -171267385, false);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = FriendSystem.method1628(Client.field347);
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = FriendSystem.method1628(Client.field348);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class4.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class558.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
