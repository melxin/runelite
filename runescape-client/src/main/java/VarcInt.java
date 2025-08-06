import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ac")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-94"
	)
	void method4195(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4196(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1188285034"
	)
	void method4196(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lox;III)V",
		garbageValue = "1061334519"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !WidgetDefinition.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7902(class167.widgetDefinition, true);
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
					int var9 = var4 * var8 + var5 * var7 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + Client.field581 >> 7;
					int var12 = Client.field492 - var10 >> 7;
					class514 var13 = Client.worldViewManager.method2355(-1);
					if (var13 == class514.field5394) {
						GraphicsDefaults.method10476(var11, var12, var4, var5);
					} else if (var13 == class514.field5397) {
						int var15 = var3.width / 2 + var1;
						int var16 = var3.height / 2 + var2;
						int var17 = MouseHandler.MouseHandler_x - var15;
						int var18 = MouseHandler.MouseHandler_y - var16;
						int var19 = (int)Math.round(Math.atan2((double)var18, (double)var17) * 325.94932345220167D) - 512 & 2047;
						int var20 = var19 - Client.camAngleY;
						var20 &= 2047;
						int var22 = var20 + 64;
						int var21 = (var22 & 2047) / 128;
						Client.field308 = var21;
						Client.field307 = 30;
						MidiPcmStream.method7145(Client.field308);
					}
				}
			}

		}
	}
}
