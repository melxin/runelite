import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bq")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -785822587
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1849589045
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -261637247
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1309657229
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 679501541
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1357223757
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ak")
	@Export("action")
	String action;
	@ObfuscatedName("aw")
	@Export("target")
	String target;
	@ObfuscatedName("ap")
	boolean field667;

	MenuAction() {
	}
}
