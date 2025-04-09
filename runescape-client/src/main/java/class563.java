import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
public enum class563 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5585(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5554(2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5555(4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5556(8),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5567(16),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5558(32),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5557(64, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5560(128),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5565(256, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5562(512),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5583(1024),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5564(2048),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5576(4096),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5566(8192),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5563(16384),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5568(32768),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5569(65536),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5570(131072),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5571(262144),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5572(524288),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5573(1048576),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5574(2097152),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5584(4194304),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5577(8388608),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5581(16777216),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5578(33554432),
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5579(67108864, true),
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5580(134217728),
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5553(268435456),
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5582(536870912, true),
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5575(1073741824, true),
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5559(Integer.MIN_VALUE);

	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -759173613
	)
	final int field5561;

	class563(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class563(int var3, boolean var4) {
		this.field5561 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5561;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1008570220"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = Renderable.clientPreferences.getEULA() >= Client.field791;
		if (!var2) {
			var1 = 12;
		} else if (SecureRandomCallable.client.containsAccessAndRefreshToken() || SecureRandomCallable.client.otlTokenRequesterInitialized() || SecureRandomCallable.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class137.method3379(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class137.otpMedium = 0;
			WorldMapIcon_1.otp = "";
		}

		TileItem.method2992();
		ChatChannel.focusPasswordWhenUsernameFilled();
	}
}
