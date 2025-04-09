import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -4732346877224747441L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 544254391
	)
	@Export("z")
	int z;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1410318419
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 178073435
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1788351575
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1339709725
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1644910475
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lik;",
		garbageValue = "1308195939"
	)
	public static class220 method4686() {
		return class220.field2472;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1342351555"
	)
	static final void method4685(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class258.cameraPitch < var0) {
			class258.cameraPitch = (var0 - class258.cameraPitch) * Timer.field4632 / 1000 + class258.cameraPitch + GameBuild.field4198;
			if (class258.cameraPitch > var0) {
				class258.cameraPitch = var0;
			}
		} else if (class258.cameraPitch > var0) {
			class258.cameraPitch -= (class258.cameraPitch - var0) * Timer.field4632 / 1000 + GameBuild.field4198;
			if (class258.cameraPitch < var0) {
				class258.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - AsyncHttpResponse.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			AsyncHttpResponse.cameraYaw = var2 * Timer.field4632 / 1000 + AsyncHttpResponse.cameraYaw + GameBuild.field4198;
			AsyncHttpResponse.cameraYaw &= 2047;
		} else if (var2 < 0) {
			AsyncHttpResponse.cameraYaw -= GameBuild.field4198 + -var2 * Timer.field4632 / 1000;
			AsyncHttpResponse.cameraYaw &= 2047;
		}

		int var3 = var1 - AsyncHttpResponse.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			AsyncHttpResponse.cameraYaw = var1;
		}

	}
}
