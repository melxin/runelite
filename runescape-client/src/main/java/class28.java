import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
public class class28 {
	@ObfuscatedName("aa")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 388119823
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -707976655
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ah")
	int[] field130;
	@ObfuscatedName("ap")
	int[] field131;

	public class28() {
		this.field130 = new int[112];
		this.field131 = new int[192];
		Arrays.fill(this.field130, 3);
		Arrays.fill(this.field131, 3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-469114926"
	)
	public void method420(int var1, int var2) {
		if (this.method428(var1) && this.method430(var2)) {
			this.field130[var1] = var2;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "99"
	)
	public void method442(char var1, int var2) {
		if (this.method429(var1) && this.method430(var2)) {
			this.field131[var1] = var2;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1228605709"
	)
	public int method422(int var1) {
		return this.method428(var1) ? this.field130[var1] : 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-58"
	)
	public int method423(char var1) {
		return this.method429(var1) ? this.field131[var1] : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-95"
	)
	public boolean method424(int var1) {
		return this.method428(var1) && (this.field130[var1] == 1 || this.field130[var1] == 3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-803839082"
	)
	public boolean method425(char var1) {
		return this.method429(var1) && (this.field131[var1] == 1 || this.field131[var1] == 3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-334351263"
	)
	public boolean method441(int var1) {
		return this.method428(var1) && (this.field130[var1] == 2 || this.field130[var1] == 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "88"
	)
	public boolean method427(char var1) {
		return this.method429(var1) && (this.field131[var1] == 2 || this.field131[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "105"
	)
	boolean method428(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1389239308"
	)
	boolean method429(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1188604496"
	)
	boolean method430(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "676319445"
	)
	static class145 method461(int var0) {
		class145 var1 = (class145)HealthBarConfig.findEnumerated(UserComparator7.method3500(), var0);
		if (var1 == null) {
			var1 = class145.field1722;
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1513405883"
	)
	static final void method460(String var0) {
		PacketBufferNode var1 = class291.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lox;II)V",
		garbageValue = "1497245549"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4145 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4181 == null) {
				var0.field4181 = new int[var0.field4145.length];
			}

			var0.field4181[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-981772689"
	)
	static int method432(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class255.Widget_unpackTargetMask(class516.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-22"
	)
	static int method453(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			Client.field535 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.field535;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "99"
	)
	static Object method462(int var0) {
		return var0 == -1 ? null : class546.method10651((class570)HealthBarConfig.findEnumerated(class570.method11060(), var0));
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1834103823"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class393.scrollBarSprites[0].drawAt(var0, var1);
		class393.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field456);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field411);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field354);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field354);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field354);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field354);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field290);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field290);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field290);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field290);
	}
}
