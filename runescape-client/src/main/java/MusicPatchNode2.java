import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("al")
	byte[] field3786;
	@ObfuscatedName("ab")
	byte[] field3779;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -406615673
	)
	int field3781;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1133784551
	)
	int field3782;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -290104489
	)
	int field3780;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1614089033
	)
	int field3783;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1965798351
	)
	int field3778;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1239950655
	)
	int field3785;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 128121969
	)
	int field3784;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1310062891"
	)
	public static int method7087(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1933049284"
	)
	public static final void method7088(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
