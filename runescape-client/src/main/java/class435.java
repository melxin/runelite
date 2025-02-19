import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public final class class435 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "8"
	)
	static int method8220(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return MouseRecorder.method2449(var0, var1, var2);
		} else if (var0 < 1100) {
			return Decimator.method1110(var0, var1, var2);
		} else if (var0 < 1200) {
			return class496.method9377(var0, var1, var2);
		} else if (var0 < 1300) {
			return class1.method13(var0, var1, var2);
		} else if (var0 < 1400) {
			return InterfaceParent.method2433(var0, var1, var2);
		} else if (var0 < 1500) {
			return HorizontalAlignment.method3917(var0, var1, var2);
		} else if (var0 < 1600) {
			return Huffman.method7444(var0, var1, var2);
		} else if (var0 < 1700) {
			return FloorUnderlayDefinition.method4026(var0, var1, var2);
		} else if (var0 < 1800) {
			return class381.method7517(var0, var1, var2);
		} else if (var0 < 1900) {
			return class269.method5589(var0, var1, var2);
		} else if (var0 < 2000) {
			return class30.method409(var0, var1, var2);
		} else if (var0 < 2100) {
			return Decimator.method1110(var0, var1, var2);
		} else if (var0 < 2200) {
			return class496.method9377(var0, var1, var2);
		} else if (var0 < 2300) {
			return class1.method13(var0, var1, var2);
		} else if (var0 < 2400) {
			return InterfaceParent.method2433(var0, var1, var2);
		} else if (var0 < 2500) {
			return HorizontalAlignment.method3917(var0, var1, var2);
		} else if (var0 < 2600) {
			return class196.method3984(var0, var1, var2);
		} else if (var0 < 2700) {
			return NpcOverrides.method3919(var0, var1, var2);
		} else if (var0 < 2800) {
			return StructComposition.method4116(var0, var1, var2);
		} else if (var0 < 2900) {
			return Tiles.method2396(var0, var1, var2);
		} else if (var0 < 3000) {
			return class30.method409(var0, var1, var2);
		} else if (var0 < 3200) {
			return class33.method454(var0, var1, var2);
		} else if (var0 < 3300) {
			return class133.method3328(var0, var1, var2);
		} else if (var0 < 3400) {
			return PlayerCompositionColorTextureOverride.method3740(var0, var1, var2);
		} else if (var0 < 3500) {
			return class564.method10164(var0, var1, var2);
		} else if (var0 < 3600) {
			return WorldMapIcon_0.method6214(var0, var1, var2);
		} else if (var0 < 3700) {
			return class146.method3457(var0, var1, var2);
		} else if (var0 < 3800) {
			return class456.method8831(var0, var1, var2);
		} else if (var0 < 3900) {
			return class216.method4436(var0, var1, var2);
		} else if (var0 < 4000) {
			return class549.method10018(var0, var1, var2);
		} else if (var0 < 4100) {
			return ClanChannelMember.method3491(var0, var1, var2);
		} else if (var0 < 4200) {
			return FontName.method9923(var0, var1, var2);
		} else if (var0 < 4300) {
			return class532.method9670(var0, var1, var2);
		} else if (var0 < 5100) {
			return class36.method665(var0, var1, var2);
		} else if (var0 < 5400) {
			return class278.method5809(var0, var1, var2);
		} else if (var0 < 5600) {
			return class60.method1158(var0, var1, var2);
		} else if (var0 < 5700) {
			return MouseHandler.method651(var0, var1, var2);
		} else if (var0 < 6300) {
			return class333.method6540(var0, var1, var2);
		} else if (var0 < 6600) {
			return VarpDefinition.method3787(var0, var1, var2);
		} else if (var0 < 6700) {
			return Player.method2516(var0, var1, var2);
		} else if (var0 < 6800) {
			return HorizontalAlignment.method3912(var0, var1, var2);
		} else if (var0 < 6900) {
			return JagexCache.method4474(var0, var1, var2);
		} else if (var0 < 7000) {
			return class131.method3272(var0, var1, var2);
		} else if (var0 < 7100) {
			return class139.method3394(var0, var1, var2);
		} else if (var0 < 7200) {
			return Client.method1649(var0, var1, var2);
		} else if (var0 < 7500) {
			return class27.method383(var0, var1, var2);
		} else if (var0 < 7600) {
			return class33.method453(var0, var1, var2);
		} else if (var0 < 7700) {
			return ScriptFrame.method1175(var0, var1, var2);
		} else if (var0 < 8000) {
			return UserComparator9.method3233(var0, var1, var2);
		} else {
			return var0 < 8100 ? SpriteMask.method6855(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060886816"
	)
	static void method8221() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
