import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("at")
public class class1 implements Callable {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	static GameBuild field2;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	final Buffer field1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final SpriteBufferProperties this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;Lxa;Lan;)V"
	)
	class1(SpriteBufferProperties var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod15(this.field1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljx;",
		garbageValue = "-2082206047"
	)
	public static Clock method12() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)V",
		garbageValue = "964510254"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (class39.minimapState == 0 || class39.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method8168(class226.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + Client.field468 >> 7;
					int var12 = Client.field512 - var10 >> 7;
					class526 var13 = Client.worldViewManager.method2398(-1);
					if (var13 == class526.field5582) {
						BuddyRankComparator.method3734(var11, var12, var4, var5);
					} else if (var13 == class526.field5580) {
						int var15 = var3.width / 2 + var1;
						int var16 = var3.height / 2 + var2;
						int var17 = MouseHandler.MouseHandler_x - var15;
						int var18 = MouseHandler.MouseHandler_y - var16;
						int var19 = class238.method5229(var18, var17);
						var19 -= Client.camAngleY;
						var19 &= 2047;
						int var14 = class169.method4184(var19);
						Client.field377 = var14;
						Client.field536 = 30;
						HealthBarUpdate.method2590(Client.field377);
					}
				}
			}

		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1679490786"
	)
	static int method11(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class408.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIB)V",
		garbageValue = "3"
	)
	static void method10(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if (var4 == var7.id) {
					var7.setFlag(var5);
					break;
				}
			}
		}

	}
}
