import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class161 extends class164 {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1342483327
	)
	int field1810;
	@ObfuscatedName("an")
	byte field1814;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 13447819
	)
	int field1811;
	@ObfuscatedName("af")
	String field1809;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgo;)V"
	)
	class161(class165 var1) {
		this.this$0 = var1;
		this.field1810 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1341652344"
	)
	void vmethod3736(Buffer var1) {
		var1.readUnsignedByte();
		this.field1810 = var1.readUnsignedShort();
		this.field1814 = var1.readByte();
		this.field1811 = var1.readUnsignedShort();
		var1.readLong();
		this.field1809 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "992088037"
	)
	void vmethod3737(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1810);
		var2.rank = this.field1814;
		var2.world = this.field1811;
		var2.username = new Username(this.field1809);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1571849208"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class232.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class232.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class7.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
