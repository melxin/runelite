import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class203 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcj;",
		garbageValue = "1706000418"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.method11575();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ConcurrentMidiTask.method9757(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.method11575();
					int var11 = var2.method11575();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field769 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			switch(var8) {
			case 3:
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
				break;
			case 21:
			case 38:
			case 39:
			case 63:
				var1.intOperands[var7] = var2.readUnsignedByte();
				break;
			default:
				if (var8 <= 99) {
					var1.intOperands[var7] = var2.method11575();
				} else {
					var1.intOperands[var7] = var2.readUnsignedByte();
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-300411601"
	)
	static void method4568() {
		setLoginResponseString("", "Connecting to server...", "");
		Client.field310 = class593.field6034;
		class379.method8181(false);
		class135.updateGameState(20);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "47"
	)
	static Date method4567() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-52"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIS)V",
		garbageValue = "28041"
	)
	static void method4563(WorldView var0, int var1, int var2, int var3, int var4) {
		int var5 = var1;
		int var6 = var2;
		int var7 = VerticalAlignment.method4455(var0, var1, var2, var0.plane, var4) - var3;
		if (!var0.method2736()) {
			WorldEntity var8 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var0.id);
			if (var8 != null) {
				class450 var9 = Varcs.method3022(var0, var1, var2);
				var5 = (int)var9.field5216;
				var6 = (int)var9.field5219;
				var7 += class280.getTileHeight(class547.topLevelWorldView, var8.getY(), var8.getPlane(), class547.topLevelWorldView.plane);
				var9.method9065();
			}
		}

		class4.method19(var5, var6, var7, var4);
	}
}
