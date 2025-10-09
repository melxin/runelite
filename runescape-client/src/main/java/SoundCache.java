import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field1375;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeHashTable field1376;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field1376 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field1375 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldi;",
		garbageValue = "-825469743"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method3207(var1, var2, false);
		class107 var6 = (class107)this.field1376.get(var4);
		if (var6 != null) {
			return var6.method3424();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field1376.put(new class107(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ley;",
		garbageValue = "55"
	)
	class107 method3203(int var1, int var2) {
		long var3 = this.method3207(var1, var2, true);
		class107 var5 = (class107)this.field1376.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field1375, var1, var2);
			if (var6 == null) {
				return new class107();
			} else {
				class107 var7 = new class107(var6);
				this.field1376.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ldi;",
		garbageValue = "-154508597"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 1) {
			return this.getSoundEffect0(var1, 1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 0) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "8"
	)
	public class107 method3205(int var1) {
		if (this.field1375.getGroupCount() == 1) {
			return this.method3203(0, var1);
		} else if (this.field1375.getGroupFileCount(var1) == 1) {
			return this.method3203(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldi;",
		garbageValue = "-54"
	)
	public RawSound method3206(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "6789848"
	)
	long method3207(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("at")
	public static String method3222(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class445.base37Table[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-2013055166"
	)
	public static int method3204(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "41"
	)
	static int method3224(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class82 var12 = new class82(var4, var3.id, var3.childIndex * -2066937045, var3.itemId);
					Interpreter.field626.add(var12);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				int var5;
				if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
					UrlRequest.Interpreter_intStackSize -= 3;
					int var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					if (var5 >= 1 && var5 <= 10) {
						Widget var10 = class35.widgetDefinition.getWidgetChild(var9, var4);
						if (var10 == null) {
							throw new RuntimeException();
						} else {
							class82 var11 = new class82(var5, var9, var4, var10.itemId);
							Interpreter.field626.add(var11);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2929) {
					Object[] var14 = AABB.method5432();
					UrlRequest.Interpreter_intStackSize -= 3;
					var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					int var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					boolean var7 = true;
					Widget var8 = class35.widgetDefinition.getWidgetChild(var5, var6);
					if (var8 != null) {
						int var15 = var8.itemId;
						Skills.method8169(var5, var6, var15, var4, var14);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			}
		} else if (Interpreter.field629 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var13 = new ScriptEvent();
				var13.widget = var3;
				var13.args = var3.onResize;
				var13.field871 = Interpreter.field629 + 1;
				Client.scriptEvents.addFirst(var13);
				return 1;
			}
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIIIZB)V",
		garbageValue = "43"
	)
	static void method3216(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
		TileItem var11 = new TileItem();
		var11.id = var4;
		var11.quantity = var5;
		var11.setFlag(var6);
		var11.visibleTime = var7 + Client.serverCycle;
		var11.despawnTime = var8 + Client.serverCycle;
		var11.ownership = var9;
		var11.isPrivate = var10;
		if (var0.groundItems[var1][var2][var3] == null) {
			var0.groundItems[var1][var2][var3] = new NodeDeque();
		}

		var0.groundItems[var1][var2][var3].addFirst(var11);
		class263.updateItemPile2(var0, var1, var2, var3);
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "38747412"
	)
	static final void method3221() {
		Client.field529 = Client.cycleCntr;
		ClientPreferences.ClanChat_inClanChat = true;
	}
}
