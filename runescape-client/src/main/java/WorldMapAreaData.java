import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -1291871039
	)
	static int field3274;
	@ObfuscatedName("af")
	HashSet field3272;
	@ObfuscatedName("aa")
	HashSet field3273;
	@ObfuscatedName("ak")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lvy;IZI)V",
		garbageValue = "-1315466009"
	)
	void method6492(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method6033(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3272 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3272.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3273 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3273.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lvy;ZI)V",
		garbageValue = "1912354326"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "736875172"
	)
	static final void method6494(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class106.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3837()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = ScriptEvent.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + MouseRecorder.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
