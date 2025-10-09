import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("WidgetConfigNode")
public class WidgetConfigNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 502341387
	)
	@Export("start")
	public final int start;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1554788563
	)
	@Export("end")
	public final int end;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1891297153
	)
	@Export("clickMask")
	final int clickMask;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1115268561
	)
	@Export("opMask")
	final int opMask;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("nextWidgetConfigNode")
	public WidgetConfigNode nextWidgetConfigNode;

	WidgetConfigNode(int var1, int var2, int var3, int var4) {
		this.start = var1;
		this.end = var2;
		this.clickMask = var3;
		this.opMask = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method7506() {
		return this.clickMask;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method7507() {
		return this.opMask;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "436065348"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4250 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4322 == null) {
				var0.field4322 = new int[var0.field4250.length];
			}

			var0.field4322[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lwn;B)V",
		garbageValue = "8"
	)
	static void method7516(WorldView var0, PacketBuffer var1) {
		WorldView var2 = class32.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field445[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field445[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class135.field1642 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				class135.field1642[var6][var7] = var1.readInt();
			}
		}

		class62.field864 = new int[var5];
		class331.field3831 = new int[var5];
		class140.field1710 = new int[var5];
		class196.field2145 = new byte[var5][];
		class204.field2245 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field445[var6][var7][var8];
					if (var9 != -1) {
						int var10 = class210.method4671(var9);
						int var11 = class138.method3798(var9);
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (class62.field864[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							class62.field864[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							class331.field3831[var5] = ItemContainer.archive9.getGroupId("m" + var13 + "_" + var14);
							class140.field1710[var5] = ItemContainer.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		Client.playerUpdateManager.method2940(var2);
		class135.updateGameState(25);
		Client.field433 = true;
		Player.field939 = var2;
		PlatformInfo.method10717(var2);
	}
}
