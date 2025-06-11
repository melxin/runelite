import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1189518373
	)
	public static int field1910;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -483192749
	)
	public static int field1914;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 533587421
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "-5"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				this.method3978();
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1129575553"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160722520"
	)
	void method3978() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lip;",
		garbageValue = "-1728911948"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "477485197"
	)
	public static void method3989() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3991() {
		if (Client.logoutTimer > 0) {
			class378.logOut();
		} else {
			Client.timer.method7986();
			HealthBarConfig.updateGameState(40);
			ObjectSound.field653 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1686072307"
	)
	static final void method3992(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3878()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + FriendsChat.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
