import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1183495283
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1548314637
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -404719519
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 824351539
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -440930101
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2106139041
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("aj")
	@Export("action")
	String action;
	@ObfuscatedName("av")
	@Export("target")
	String target;
	@ObfuscatedName("au")
	boolean field918;

	MenuAction() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1874842398"
	)
	static boolean method2257(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;",
		garbageValue = "253643066"
	)
	public static NodeDeque method2256() {
		return Client.scriptEvents;
	}
}
