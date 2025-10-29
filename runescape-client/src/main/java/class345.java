import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class345 {
	@ObfuscatedName("av")
	public static final List field3925;
	@ObfuscatedName("at")
	public static ArrayList field3924;
	@ObfuscatedName("ag")
	public static LinkedList field3933;
	@ObfuscatedName("an")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field3927;
	@ObfuscatedName("aw")
	public static ArrayList field3928;
	@ObfuscatedName("ap")
	public static ArrayList field3929;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 847508035
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 595186573
	)
	static int field3931;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1197280793
	)
	static int field3932;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -673721945
	)
	static int field3926;

	static {
		field3925 = new ArrayList();
		field3924 = null;
		field3933 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3928 = new ArrayList(3);
		field3929 = new ArrayList();
		musicPlayerStatus = 0;
		field3931 = 0;
		field3932 = 0;
		field3926 = 0;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lmj;B)V",
		garbageValue = "-105"
	)
	static void method7363(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(class147.archive8.hash);
		var0.packetBuffer.method11690(ActorSpotAnim.archive13.hash);
		var0.packetBuffer.writeIntIME(class474.field5353.hash);
		var0.packetBuffer.method11727(class175.field1928.hash);
		var0.packetBuffer.writeInt(class226.field2558.hash);
		var0.packetBuffer.method11690(GrandExchangeOfferOwnWorldComparator.field248.hash);
		var0.packetBuffer.writeInt(HttpRequestTask.archive10.hash);
	}
}
