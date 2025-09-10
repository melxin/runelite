import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class137 implements Callable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class138 field1654;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	final class139 field1651;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class140 field1650;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1707620043
	)
	final int field1653;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;Lff;Lfe;Lfk;I)V"
	)
	class137(class146 var1, class138 var2, class139 var3, class140 var4, int var5) {
		this.this$0 = var1;
		this.field1654 = var2;
		this.field1651 = var3;
		this.field1650 = var4;
		this.field1653 = var5;
	}

	public Object call() {
		this.field1654.method3671();
		class138[][] var1;
		if (this.field1651 == class139.field1682) {
			var1 = this.this$0.field1737;
		} else {
			var1 = this.this$0.field1732;
		}

		var1[this.field1653][this.field1650.method3716()] = this.field1654;
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "21"
	)
	public static byte[] method3661(int var0) {
		return class403.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lcq;III)V",
		garbageValue = "-1566246001"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (ParamComposition.isWorldMapEvent(var0.type)) {
			Frames.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = VerticalAlignment.WorldMapElement_get(Frames.worldMapEvent.mapElement);
			var4 = HttpRequestTask.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class324.getScript(var5);
		}

		if (var4 != null) {
			ModelData0.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977960047"
	)
	public static void method3667() {
		synchronized(ArchiveDiskActionHandler.field4903) {
			if (ArchiveDiskActionHandler.field4901 != 0) {
				ArchiveDiskActionHandler.field4901 = 1;

				try {
					ArchiveDiskActionHandler.field4903.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcg;",
		garbageValue = "1464521330"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.array = (var2.field5916.length - 2) * -290410379;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.field5916.length - 2 - var3 - 12;
		var2.array = var4 * -290410379;
		int var5 = var2.readShortSmart();
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
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class165.method4019(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readShortSmart();
					int var11 = var2.readShortSmart();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.array = 0;
		var1.field795 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.array * 1216585693 < var4; var1.opcodes[var7++] = var8) {
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
					var1.intOperands[var7] = var2.readShortSmart();
				} else {
					var1.intOperands[var7] = var2.readUnsignedByte();
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	static void method3665() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			MouseRecorder.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.isEmpty()) {
			MouseRecorder.setLoginResponseString("", "Please enter your password.", "");
		} else {
			MouseRecorder.setLoginResponseString("", "Connecting to server...", "");
			class325.method7035(false);
			UrlRequest.updateGameState(20);
		}
	}
}
