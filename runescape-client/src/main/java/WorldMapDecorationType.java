import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4153(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4133(1, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4134(2, 0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4154(3, 0),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4136(9, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4137(4, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4145(5, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4139(6, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4148(7, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4141(8, 1),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4143(12, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4140(13, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4144(14, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4147(15, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4146(16, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4132(17, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4138(18, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4149(19, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4150(20, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4151(21, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4152(10, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4142(11, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4135(22, 3);

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1213162427
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "131143886"
	)
	static final void method7541(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.isFinished) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.isFinished) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-301073810"
	)
	static void method7544() {
		if (Client.field672 && Script.localPlayer != null) {
			int var0 = Script.localPlayer.pathX[0];
			int var1 = Script.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			ReflectionCheck.oculusOrbFocalPointX = Script.localPlayer.x;
			int var2 = GraphicsObject.getTileHeight(class509.topLevelWorldView, Script.localPlayer.x, Script.localPlayer.y, class509.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < class165.oculusOrbFocalPointZ) {
				class165.oculusOrbFocalPointZ = var2;
			}

			KeyHandler.oculusOrbFocalPointY = Script.localPlayer.y;
			Client.field672 = false;
		}

	}
}
