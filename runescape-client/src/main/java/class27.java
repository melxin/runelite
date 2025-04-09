import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
public class class27 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1135730219
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("av")
	int[] field107;
	@ObfuscatedName("am")
	int[] field103;

	public class27() {
		this.field107 = new int[112];
		this.field103 = new int[192];
		Arrays.fill(this.field107, 3);
		Arrays.fill(this.field103, 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1762655769"
	)
	public void method395(int var1, int var2) {
		if (this.method401(var1) && this.method404(var2)) {
			this.field107[var1] = var2;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-115728978"
	)
	public void method396(char var1, int var2) {
		if (this.method422(var1) && this.method404(var2)) {
			this.field103[var1] = var2;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "793451865"
	)
	public int method397(int var1) {
		return this.method401(var1) ? this.field107[var1] : 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-1960163389"
	)
	public int method398(char var1) {
		return this.method422(var1) ? this.field103[var1] : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-28185"
	)
	public boolean method399(int var1) {
		return this.method401(var1) && (this.field107[var1] == 1 || this.field107[var1] == 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "124"
	)
	public boolean method400(char var1) {
		return this.method422(var1) && (this.field103[var1] == 1 || this.field103[var1] == 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "90771561"
	)
	public boolean method427(int var1) {
		return this.method401(var1) && (this.field107[var1] == 2 || this.field107[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1502671738"
	)
	public boolean method402(char var1) {
		return this.method422(var1) && (this.field103[var1] == 2 || this.field103[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "55"
	)
	boolean method401(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1016927366"
	)
	boolean method422(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-561282386"
	)
	boolean method404(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;B)V",
		garbageValue = "113"
	)
	public static void method435(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferNameComparator.field4771 = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "900177902"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "26"
	)
	static final boolean method432(int var0, int var1) {
		ObjectComposition var2 = class162.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method5430(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1739048168"
	)
	static int method406(int var0, Script var1, boolean var2) {
		Widget var8;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var8 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class106 var9 = new class106(var4, var8.id, var8.childIndex * -1626125685, var8.itemId);
					Interpreter.field869.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					Widget var6 = class232.widgetDefinition.getWidgetChild(var3, var4);
					if (var6 == null) {
						throw new RuntimeException();
					} else {
						class106 var7 = new class106(var5, var3, var4, var6.itemId);
						Interpreter.field869.add(var7);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field870 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var8 = class232.widgetDefinition.method6951(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
			} else {
				var8 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
			}

			if (var8.onResize == null) {
				return 0;
			} else {
				ScriptEvent var10 = new ScriptEvent();
				var10.widget = var8;
				var10.args = var8.onResize;
				var10.field1094 = Interpreter.field870 + 1;
				Client.scriptEvents.addFirst(var10);
				return 1;
			}
		}
	}
}
