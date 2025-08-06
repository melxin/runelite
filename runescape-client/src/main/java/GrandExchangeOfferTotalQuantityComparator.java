import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)I",
		garbageValue = "-1993453542"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "-27"
	)
	static void method8496(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(Canvas.archive12.hash);
		var0.packetBuffer.writeIntME(class381.field4313.hash);
		var0.packetBuffer.writeIntME(AsyncRestClient.archive2.hash);
		var0.packetBuffer.writeIntME(ScriptEvent.field871.hash);
		var0.packetBuffer.writeInt(class161.archive4.hash);
		var0.packetBuffer.writeIntIME(LoginPacket.field1743.hash);
		var0.packetBuffer.writeInt(CollisionMap.field3159.hash);
		var0.packetBuffer.writeIntME(PacketWriter.archive10.hash);
		var0.packetBuffer.writeIntME(0);
		var0.packetBuffer.writeIntME(class350.field3925.hash);
		var0.packetBuffer.writeIntIME(class36.archive13.hash);
		var0.packetBuffer.writeInt(class201.archive9.hash);
		var0.packetBuffer.writeIntIME(MoveSpeed.field3199.hash);
		var0.packetBuffer.writeIntME(class4.field6.hash);
		var0.packetBuffer.writeInt(MusicPatch.field3868.hash);
		var0.packetBuffer.writeInt(class175.field1928.hash);
		var0.packetBuffer.writeIntIME(class173.field1915.hash);
		var0.packetBuffer.writeIntIME(MoveSpeed.archive6.hash);
		var0.packetBuffer.writeIntLE(class82.field1191.hash);
		var0.packetBuffer.writeIntME(class46.field666.hash);
		var0.packetBuffer.writeIntLE(class197.field2131.hash);
		var0.packetBuffer.writeInt(ReflectionCheck.field240.hash);
		var0.packetBuffer.writeIntLE(class188.archive8.hash);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1654100240"
	)
	static final int method8487(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-404162649"
	)
	public static boolean method8499() {
		return Client.staffModLevel >= 2;
	}
}
