import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("LoginPacket")
public class LoginPacket extends class149 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 569762769106855655L
	)
	long field1714;
	@ObfuscatedName("ay")
	String field1712;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	LoginPacket(class152 var1) {
		this.this$0 = var1;
		this.field1714 = -1L;
		this.field1712 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.field5570;
			this.field1714 = var1.readLong();
		}

		this.field1712 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3553(this.field1714, this.field1712, 0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "7"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		ScriptFrame.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3425"
	)
	static void method3468() {
		if (class541.worldMap != null) {
			class541.worldMap.method9727(class200.topLevelWorldView.plane, (Client.serverCycle >> 7) + class200.topLevelWorldView.baseX, (Client.field532 >> 7) + class200.topLevelWorldView.baseY, false);
			class541.worldMap.loadCache();
		}

	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "15"
	)
	static boolean method3469(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class503 var2 = Client.worldViewManager.method2537(var0);
		boolean var3 = var0 == -1;
		boolean var4 = var0 == Client.field780;
		boolean var5 = true;
		boolean var6 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
		if (var6 && !var2.method9491(var5, var3, var4)) {
			return false;
		} else {
			boolean var7 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
			if (var7 && !var2.method9489(var5, var3, var4)) {
				return false;
			} else {
				boolean var8 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
				if (var8 && !var2.method9490(var5, var3, var4)) {
					return false;
				} else {
					boolean var9 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
					if (var9 && !var2.method9487(var5, var3, var4)) {
						return false;
					} else if (var1 == 1002 && !var2.method9511(var5, var3, var4)) {
						return false;
					} else if (var1 == 1004 && !var2.method9492(var5, var3, var4)) {
						return false;
					} else {
						return var1 != 1003 || var2.method9493(var5, var3, var4);
					}
				}
			}
		}
	}
}
