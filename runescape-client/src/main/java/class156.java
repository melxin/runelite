import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class156 extends class164 {
	@ObfuscatedName("ax")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field1763;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1261225771
	)
	static int field1756;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1739081225
	)
	int field1762;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgo;)V"
	)
	class156(class165 var1) {
		this.this$0 = var1;
		this.field1762 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1341652344"
	)
	void vmethod3736(Buffer var1) {
		this.field1762 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 29699747;
			var1.readLong();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "992088037"
	)
	void vmethod3737(ClanChannel var1) {
		var1.removeMember(this.field1762);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-671085297"
	)
	public static int method3534(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
