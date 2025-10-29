import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class363 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lmj;I)V",
		garbageValue = "1588887468"
	)
	static void method7636(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(class226.field2558.hash);
		var0.packetBuffer.writeIntLE(HttpRequestTask.archive10.hash);
		var0.packetBuffer.writeInt(ActorSpotAnim.archive13.hash);
		var0.packetBuffer.writeIntIME(AbstractWorldMapIcon.field3529.hash);
		var0.packetBuffer.writeIntIME(class160.field1815.hash);
		var0.packetBuffer.writeIntIME(AsyncHttpResponse.field67.hash);
		var0.packetBuffer.writeIntLE(Varps.field4092.hash);
		var0.packetBuffer.writeIntLE(class147.archive8.hash);
		var0.packetBuffer.writeIntIME(WorldMapRectangle.archive12.hash);
		var0.packetBuffer.writeIntIME(class138.field1642.hash);
		var0.packetBuffer.writeIntLE(0);
		var0.packetBuffer.writeIntLE(class175.field1928.hash);
		var0.packetBuffer.writeIntME(Tile.archive9.hash);
		var0.packetBuffer.writeInt(UserComparator4.archive6.hash);
		var0.packetBuffer.writeIntIME(class136.field1619.hash);
		var0.packetBuffer.writeIntME(VarcInt.field2017.hash);
		var0.packetBuffer.writeIntIME(ParamComposition.field2290.hash);
		var0.packetBuffer.writeIntLE(PcmPlayer.field1328.hash);
		var0.packetBuffer.writeIntLE(StructComposition.archive2.hash);
		var0.packetBuffer.writeIntME(class474.field5353.hash);
		var0.packetBuffer.writeIntLE(class189.archive4.hash);
		var0.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.field248.hash);
		var0.packetBuffer.writeIntIME(Skeleton.field2836.hash);
	}
}
