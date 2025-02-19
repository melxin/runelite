import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class153 extends class149 {
	@ObfuscatedName("ht")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -99695897
	)
	int field1746;
	@ObfuscatedName("ay")
	byte field1745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class153(class152 var1) {
		this.this$0 = var1;
		this.field1746 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1746 = var1.readUnsignedShort();
		this.field1745 = var1.readByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3558(this.field1746, this.field1745);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "470578133"
	)
	static final void method3505(String var0) {
		AsyncRestClient.method146(var0 + " is already on your ignore list");
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	static void method3510(int var0) {
		class162.tempMenuAction = new MenuAction();
		class162.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		class162.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		class162.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		class162.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		class162.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		class162.tempMenuAction.action = Client.menu.menuActions[var0];
		class162.tempMenuAction.target = Client.menu.menuTargets[var0];
		class162.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		class162.tempMenuAction.field930 = Client.menu.menuShiftClick[var0];
	}
}
