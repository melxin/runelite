import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1769426223
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 465307575
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 791045811
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -829818609
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1480952507
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1603213755
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ae")
	@Export("action")
	String action;
	@ObfuscatedName("ax")
	@Export("target")
	String target;
	@ObfuscatedName("at")
	boolean field912;

	MenuAction() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljy;",
		garbageValue = "-512309802"
	)
	public static FloorUnderlayDefinition method2365(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "82"
	)
	static final int method2362(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-192239950"
	)
	static final void method2363() {
		if (Client.logoutTimer > 0) {
			Client.logOut();
		} else {
			Client.timer.method8954();
			class360.updateGameState(40);
			VarpDefinition.field2508 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIIIIIB)V",
		garbageValue = "11"
	)
	static final void method2364(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field519) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field519 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				UserComparator8.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				UserComparator8.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				UserComparator8.invalidateWidget(var0);
				Client.field519 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				UserComparator8.invalidateWidget(var0);
			}
		}

	}
}
