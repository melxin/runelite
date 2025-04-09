import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3128((byte)-1, 0.0F),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3133((byte)0, 0.5F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3126((byte)1, 1.0F),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3127((byte)2, 2.0F),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3132((byte)3, 1.5F),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3129((byte)4, 2.5F),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3130((byte)5, 3.0F),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3125((byte)6, 3.5F),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3124((byte)7, 4.0F);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lkw;"
	)
	static MoveSpeed[] field3131 = class7.method47();
	@ObfuscatedName("ax")
	@Export("id")
	final byte id;

	static {
		StringBuilder var0 = new StringBuilder();
		MoveSpeed[] var1 = field3131;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var0.append(var3.id);
			var0.append(", ");
		}

		String var4 = var0.toString();
		var4.substring(0, var4.length() - 2);
	}

	@ObfuscatedSignature(
		descriptor = "(BF)V",
		garbageValue = "0.0"
	)
	MoveSpeed(byte var3, float var4) {
		this.id = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "325199394"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class232.widgetDefinition.loadInterface(var0)) {
			class28.runComponentCloseListeners(class232.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
