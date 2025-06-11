import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static Task field909;
	@ObfuscatedName("ap")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aj")
	@Export("lock")
	Object lock;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -546749483
	)
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("al")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ac")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; UserComparator8.method3393(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltk;",
		garbageValue = "149666851"
	)
	static class514[] method2126() {
		return new class514[]{class514.field5329, class514.field5330, class514.field5332, class514.field5331};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "805476268"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "425190326"
	)
	static final void method2130(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (WorldMapData_1.cameraPitch < var0) {
			WorldMapData_1.cameraPitch = (var0 - WorldMapData_1.cameraPitch) * HealthBarUpdate.field1090 / 1000 + WorldMapData_1.cameraPitch + IntHashTable.field5141;
			if (WorldMapData_1.cameraPitch > var0) {
				WorldMapData_1.cameraPitch = var0;
			}
		} else if (WorldMapData_1.cameraPitch > var0) {
			WorldMapData_1.cameraPitch -= (WorldMapData_1.cameraPitch - var0) * HealthBarUpdate.field1090 / 1000 + IntHashTable.field5141;
			if (WorldMapData_1.cameraPitch < var0) {
				WorldMapData_1.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class455.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class455.cameraYaw = var2 * HealthBarUpdate.field1090 / 1000 + class455.cameraYaw + IntHashTable.field5141;
			class455.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class455.cameraYaw -= -var2 * HealthBarUpdate.field1090 / 1000 + IntHashTable.field5141;
			class455.cameraYaw &= 2047;
		}

		int var3 = var1 - class455.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class455.cameraYaw = var1;
		}

	}
}
