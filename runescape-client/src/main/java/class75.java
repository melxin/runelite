import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class75 {
	@ObfuscatedName("ad")
	static final BigInteger field897;
	@ObfuscatedName("an")
	static final BigInteger field900;

	static {
		field897 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field900 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "4804"
	)
	static int method2360(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1630366833"
	)
	static final int method2359(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class374.method7622(var3, var5);
		int var8 = class374.method7622(var3 + 1, var5);
		int var9 = class374.method7622(var3, var5 + 1);
		int var10 = class374.method7622(var3 + 1, var5 + 1);
		int var11 = ObjectComposition.method5559(var7, var8, var4, var2);
		int var12 = ObjectComposition.method5559(var9, var10, var4, var2);
		return ObjectComposition.method5559(var11, var12, var6, var2);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1194165105"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = ScriptEvent.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
