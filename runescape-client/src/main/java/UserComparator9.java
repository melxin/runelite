import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ey")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class539 field1513;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;I)I",
		garbageValue = "-1948928075"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1358990506"
	)
	static int method3354(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			Client.field609 = (short)LoginPacket.method3575(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
			if (Client.field609 <= 0) {
				Client.field609 = 256;
			}

			Client.field656 = (short)LoginPacket.method3575(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
			if (Client.field656 <= 0) {
				Client.field656 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			ScriptFrame.Interpreter_intStackSize -= 4;
			Client.field772 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			if (Client.field772 <= 0) {
				Client.field772 = 1;
			}

			Client.field773 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			if (Client.field773 <= 0) {
				Client.field773 = 32767;
			} else if (Client.field773 < Client.field772) {
				Client.field773 = Client.field772;
			}

			Client.field702 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			if (Client.field702 <= 0) {
				Client.field702 = 1;
			}

			Client.field775 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
			if (Client.field775 <= 0) {
				Client.field775 = 32767;
			} else if (Client.field775 < Client.field702) {
				Client.field775 = Client.field702;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class143.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpMethod.method85(Client.field609);
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpMethod.method85(Client.field656);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = BuddyRankComparator.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
