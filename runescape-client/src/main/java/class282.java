import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class282 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3271;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3267;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3268;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3269;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3270;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3275;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class282 field3272;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lkc;"
	)
	static final class282[] field3274;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1613042923
	)
	final int field3273;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 694917719
	)
	final int field3277;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1471367001
	)
	final int field3266;

	static {
		field3271 = new class282(0, 8, 8);
		field3267 = new class282(6, 16, 16);
		field3268 = new class282(4, 32, 32);
		field3269 = new class282(2, 48, 48);
		field3270 = new class282(5, 64, 64);
		field3275 = new class282(1, 96, 96);
		field3272 = new class282(3, 128, 128);
		class282[] var0 = new class282[]{field3271, field3275, field3269, field3272, field3268, field3270, field3267};
		field3274 = var0;
		Arrays.sort(field3274, new class289());
	}

	class282(int var1, int var2, int var3) {
		this.field3273 = var1;
		this.field3277 = var2;
		this.field3266 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-70"
	)
	int method6399() {
		return this.field3277 * this.field3266;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)Lvn;",
		garbageValue = "-1446907360"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return WorldMapLabelSize.platformInfo;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "55"
	)
	static final void method6403(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (GraphicsObject.cameraPitch < var0) {
			GraphicsObject.cameraPitch = (var0 - GraphicsObject.cameraPitch) * WorldView.field1142 / 1000 + GraphicsObject.cameraPitch + class28.field124;
			if (GraphicsObject.cameraPitch > var0) {
				GraphicsObject.cameraPitch = var0;
			}
		} else if (GraphicsObject.cameraPitch > var0) {
			GraphicsObject.cameraPitch -= (GraphicsObject.cameraPitch - var0) * WorldView.field1142 / 1000 + class28.field124;
			if (GraphicsObject.cameraPitch < var0) {
				GraphicsObject.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - WorldMapData_0.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			WorldMapData_0.cameraYaw = WorldMapData_0.cameraYaw + class28.field124 + var2 * WorldView.field1142 / 1000;
			WorldMapData_0.cameraYaw &= 2047;
		} else if (var2 < 0) {
			WorldMapData_0.cameraYaw -= -var2 * WorldView.field1142 / 1000 + class28.field124;
			WorldMapData_0.cameraYaw &= 2047;
		}

		int var3 = var1 - WorldMapData_0.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			WorldMapData_0.cameraYaw = var1;
		}

	}
}
