import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	field2750(1, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	field2752(0, 2);

	@ObfuscatedName("ap")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2015156517
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -871672953
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method5222(int var0) {
		return class333.field3678[var0];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lcu;",
		garbageValue = "1603378894"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}
}
