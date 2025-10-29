import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class50 {
	@ObfuscatedName("av")
	static final BigInteger field674;
	@ObfuscatedName("at")
	static final BigInteger field669;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	static {
		field674 = new BigInteger("10001", 16);
		field669 = new BigInteger("a6a2290023a892f09b33e0be1efaafcf9a1eca20f9af373ae1db3b51fd83e807b5c71470bebe73d392cdd0f144ca4144973d32074a3282f5edf68516ea6eb84c3d83e152faa25e38d77a48030c06a3c59df491b6de99f6c329bcf999f36c131095b13fa5a07c96d4211618f31929b58c7b8a26e8bb1ab28c8d91ba7dbd73e86b", 16);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-343906879"
	)
	static int method1943(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static void method1942() {
		if (class330.localPlayer.x >> 7 == Client.destinationX && class330.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
