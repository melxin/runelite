import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class452 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1323853945
	)
	int field4893;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1931969849
	)
	int field4891;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 600308111
	)
	int field4890;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1490761049
	)
	int field4892;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4893).length();
		int var3 = 10 - Integer.toString(this.field4890).length();
		int var4 = 10 - Integer.toString(this.field4891).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4893 + var5 + "Created: " + this.field4891 + var7 + "Total used: " + this.field4890 + var6 + "Max-In-Use: " + this.field4892;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "67"
	)
	static int method8765(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = CollisionMap.method5624() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-1812973973"
	)
	static void method8771(NPC var0) {
		var0.field1199 = var0.definition.size * -720464675;
		var0.field1241 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2003;
		var0.field1209 = var0.definition.field1999;
		var0.field1228 = var0.definition.field2029;
		var0.field1266 = var0.definition.field2004;
		var0.field1212 = var0.definition.field2005;
		var0.field1213 = var0.definition.field2006;
		var0.field1214 = var0.definition.field2007;
		var0.field1215 = var0.definition.field2008;
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1769764748"
	)
	static void method8772() {
		if (class506.field5147 != null) {
			Client.field802 = Client.cycle;
			class506.field5147.method7764();

			for (int var0 = 0; var0 < HttpRequest.topLevelWorldView.players.length; ++var0) {
				if (HttpRequest.topLevelWorldView.players[var0] != null) {
					class506.field5147.method7763((HttpRequest.topLevelWorldView.players[var0].x >> 7) + HttpRequest.topLevelWorldView.baseX, (HttpRequest.topLevelWorldView.players[var0].y >> 7) + HttpRequest.topLevelWorldView.baseY);
				}
			}
		}

	}
}
