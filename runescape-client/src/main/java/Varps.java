import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("av")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("at")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ag")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field4092;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmm;",
		garbageValue = "-532511595"
	)
	public static class334[] method7670() {
		return new class334[]{class334.field3687, class334.field3686, class334.field3698, class334.field3688, class334.field3689, class334.field3690, class334.field3699, class334.field3692, class334.field3693, class334.field3694, class334.field3695, class334.field3696, class334.field3697};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpq;",
		garbageValue = "-1075935156"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4888, PlayerType.field4889, PlayerType.field4891, PlayerType.field4884, PlayerType.PlayerType_normal, PlayerType.field4887, PlayerType.field4883, PlayerType.field4882, PlayerType.PlayerType_ultimateIronman, PlayerType.field4881, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4885, PlayerType.PlayerType_playerModerator, PlayerType.field4892, PlayerType.PlayerType_jagexModerator, PlayerType.field4886, PlayerType.PlayerType_ironman};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(JII)V",
		garbageValue = "-1692751389"
	)
	static final void method7665(long var0, int var2) {
		if (ViewportMouse.field3116[ViewportMouse.ViewportMouse_entityCount] != Integer.MAX_VALUE && var0 != ViewportMouse.ViewportMouse_entityTags[ViewportMouse.ViewportMouse_entityCount]) {
			++ViewportMouse.ViewportMouse_entityCount;
			ViewportMouse.field3116[ViewportMouse.ViewportMouse_entityCount] = Integer.MAX_VALUE;
		}

		ViewportMouse.ViewportMouse_entityTags[ViewportMouse.ViewportMouse_entityCount] = var0;
		ViewportMouse.field3116[ViewportMouse.ViewportMouse_entityCount] = Math.min(ViewportMouse.field3116[ViewportMouse.ViewportMouse_entityCount], var2);
	}
}
