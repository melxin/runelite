import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public class class137 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1619;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1639;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1620;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1636;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1622;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1621;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1618;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1625;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1626;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1627;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1628;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1629;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1624;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1631;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1632;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1638;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class137 field1634;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 938224089
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -770375853
	)
	static int field1641;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2088094483
	)
	final int field1635;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1519471173
	)
	final int field1633;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 766521343
	)
	final int field1637;

	static {
		field1619 = new class137(0, 0, (String)null, -1, -1);
		field1639 = new class137(1, 1, (String)null, 0, 2);
		field1620 = new class137(2, 2, (String)null, 1, 2);
		field1636 = new class137(3, 3, (String)null, 2, 2);
		field1622 = new class137(4, 4, (String)null, 3, 1);
		field1621 = new class137(5, 5, (String)null, 4, 1);
		field1618 = new class137(6, 6, (String)null, 5, 1);
		field1625 = new class137(7, 7, (String)null, 6, 3);
		field1626 = new class137(8, 8, (String)null, 7, 3);
		field1627 = new class137(9, 9, (String)null, 8, 3);
		field1628 = new class137(10, 10, (String)null, 0, 7);
		field1629 = new class137(11, 11, (String)null, 1, 7);
		field1624 = new class137(12, 12, (String)null, 2, 7);
		field1631 = new class137(13, 13, (String)null, 3, 7);
		field1632 = new class137(14, 14, (String)null, 4, 7);
		field1638 = new class137(15, 15, (String)null, 5, 7);
		field1634 = new class137(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class137(int var1, int var2, String var3, int var4, int var5) {
		this.field1635 = var1;
		this.field1633 = var2;
		this.field1637 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1633;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "446336137"
	)
	int method3369() {
		return this.field1637;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public static void method3367() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	public static void method3368() {
		KitDefinition.KitDefinition_archive = null;
		class435.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static void method3379(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "-1056896065"
	)
	static int method3378(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class171.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					MouseRecorder.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Renderable.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--AbstractByteArrayCopier.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Renderable.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}
}
