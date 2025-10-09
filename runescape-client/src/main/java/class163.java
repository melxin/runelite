import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class163 extends class166 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 95984119
	)
	int field1877;
	@ObfuscatedName("at")
	byte field1878;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -197328297
	)
	int field1879;
	@ObfuscatedName("aj")
	String field1880;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	class163(class167 var1) {
		this.this$0 = var1;
		this.field1877 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	void vmethod4154(Buffer var1) {
		var1.readUnsignedByte();
		this.field1877 = var1.readUnsignedShort();
		this.field1878 = var1.readByte();
		this.field1879 = var1.readUnsignedShort();
		var1.readLong();
		this.field1880 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	void vmethod4151(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1877);
		var2.rank = this.field1878;
		var2.world = this.field1879;
		var2.username = new Username(this.field1880);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lcb;III)V",
		garbageValue = "-1977714884"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (DirectByteArrayCopier.isWorldMapEvent(var0.type)) {
			class199.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = LoginState.WorldMapElement_get(class199.worldMapEvent.mapElement);
			var4 = SpriteMask.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class456.getScript(var5);
		}

		if (var4 != null) {
			ModelData0.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-689943485"
	)
	public static void method4069(int var0, int var1) {
		Iterator var2 = class338.field3892.iterator();

		while (var2.hasNext()) {
			class344 var3 = (class344)var2.next();
			var3.vmethod7348(var0, var1);
		}

	}
}
