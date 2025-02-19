import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-743932481"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1942163586"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-2117204605"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = UserComparator6.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-99"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class28.method391(this.params, var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-6703034"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class59.method1133(this.params, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "390455846"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "-85"
	)
	static int method4116(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.method7342() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			return IndexCheck.method5621(var3);
		} else if (var0 == 2709) {
			var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			return PacketWriter.method3123(var3);
		} else {
			return 2;
		}
	}
}
