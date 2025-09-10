import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class161 extends class151 {
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	static ClanChannel field1834;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1828087627
	)
	static int field1836;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	static class568 field1835;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 967399037
	)
	int field1839;
	@ObfuscatedName("aw")
	String field1838;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class161(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1839 = var1.readShortSmart();
		this.field1838 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3933(this.field1839, this.field1838);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "238619040"
	)
	static final void method3908(String var0) {
		PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "1561121208"
	)
	public static NodeDeque method3912() {
		return Client.scriptEvents;
	}
}
