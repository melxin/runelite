import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3278((byte)-1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3280((byte)0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3276((byte)1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3274((byte)2);

	@ObfuscatedName("ah")
	@Export("id")
	final byte id;

	MoveSpeed(byte var3) {
		this.id = var3;
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lwe;Ljava/lang/Object;B)V",
		garbageValue = "0"
	)
	static void method6336(class572 var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5881) {
			case 1:
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var1;
				break;
			case 2:
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (Integer)var1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
			}

		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lcs;B)Z",
		garbageValue = "55"
	)
	static boolean method6337(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class159.localPlayer != var0) {
				var1 = (Client.drawPlayerNames & 4) != 0;
				boolean var2 = var1;
				if (!var1) {
					boolean var3 = (Client.drawPlayerNames & 1) != 0;
					var2 = var3 && var0.isFriend();
				}

				return var2 || ModeWhere.method8721() && var0.isFriendsChatMember();
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			}
		}
	}
}
