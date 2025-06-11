import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field4689;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 960110547
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)Ljava/lang/Object;",
		garbageValue = "-110"
	)
	static Object method8009(class563 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5596) {
			case 0:
				return Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
			case 3:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
