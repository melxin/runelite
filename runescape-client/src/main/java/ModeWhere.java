import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qq")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5134("", 0, new class427[]{class427.field5116, class427.field5115}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5136("", 1, new class427[]{class427.field5117, class427.field5116, class427.field5115}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5135("", 2, new class427[]{class427.field5117, class427.field5118, class427.field5116}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5133("", 3, new class427[]{class427.field5117}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5137("", 4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5138("", 5, new class427[]{class427.field5117, class427.field5116}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5139("", 6, new class427[]{class427.field5116}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5140("", 8, new class427[]{class427.field5117, class427.field5116}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5141("", 9, new class427[]{class427.field5117, class427.field5118}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5142("", 10, new class427[]{class427.field5117}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5143("", 11, new class427[]{class427.field5117}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5144("", 12, new class427[]{class427.field5117, class427.field5116}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	field5145("", 13, new class427[]{class427.field5117});

	@ObfuscatedName("fy")
	static boolean field5150;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2140155215
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field5147;

	static {
		method8725();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqn;)V"
	)
	ModeWhere(String var3, int var4, class427[] var5) {
		this.field5147 = new HashSet();
		this.id = var4;
		class427[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class427 var8 = var6[var7];
			this.field5147.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field5147 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lrx;",
		garbageValue = "-28"
	)
	public static class446 method8730() {
		synchronized(class446.field5191) {
			if (class446.field5195 == 0) {
				return new class446();
			} else {
				class446.field5191[--class446.field5195].method9007();
				return class446.field5191[class446.field5195];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqq;",
		garbageValue = "2050963986"
	)
	static ModeWhere[] method8725() {
		return new ModeWhere[]{field5133, field5138, field5134, field5135, field5144, field5145, field5140, field5143, field5136, field5142, field5141, field5139, field5137};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "57"
	)
	static final int method8731(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-1"
	)
	static int method8727(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1170404574"
	)
	static boolean method8721() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
