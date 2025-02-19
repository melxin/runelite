import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("GraphicsObject")
public class GraphicsObject {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "776162835"
	)
	static final void method6532(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class59.cameraPitch < var0) {
			class59.cameraPitch = (var0 - class59.cameraPitch) * MusicPatch.field3764 / 1000 + class59.cameraPitch + User.field5125;
			if (class59.cameraPitch > var0) {
				class59.cameraPitch = var0;
			}
		} else if (class59.cameraPitch > var0) {
			class59.cameraPitch -= (class59.cameraPitch - var0) * MusicPatch.field3764 / 1000 + User.field5125;
			if (class59.cameraPitch < var0) {
				class59.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - FloorDecoration.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			FloorDecoration.cameraYaw = var2 * MusicPatch.field3764 / 1000 + FloorDecoration.cameraYaw + User.field5125;
			FloorDecoration.cameraYaw &= 2047;
		} else if (var2 < 0) {
			FloorDecoration.cameraYaw -= User.field5125 + -var2 * MusicPatch.field3764 / 1000;
			FloorDecoration.cameraYaw &= 2047;
		}

		int var3 = var1 - FloorDecoration.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			FloorDecoration.cameraYaw = var1;
		}

	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	static final int method6534() {
		return Client.menu.menuOptionsCount - 1;
	}
}
