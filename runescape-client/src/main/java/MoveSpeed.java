import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kt")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3121((byte)-1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3117((byte)0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3118((byte)1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3119((byte)2);

	@ObfuscatedName("al")
	@Export("id")
	final byte id;

	MoveSpeed(byte var3) {
		this.id = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcr;",
		garbageValue = "-1036430378"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = LoginPacket.method3651(var1, var0);
		Script var4 = UserComparator10.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = WorldMapIcon_0.method6537(var2, var0);
			var4 = UserComparator10.getScript(var3, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var5 = var0 + -512;
				var4 = UserComparator10.getScript(var5, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public static String method6102(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = TaskHandler.method4700(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1771448669"
	)
	static int method6101(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
