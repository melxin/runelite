import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class30 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = -37830115
	)
	static int field131;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Loy;",
		garbageValue = "-25"
	)
	public static GameBuild method462(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "-154470972"
	)
	static void method460(NPC var0) {
		var0.size = var0.definition.size;
		var0.field1241 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2712;
		var0.field1215 = var0.definition.field2711;
		var0.field1280 = var0.definition.field2716;
		var0.field1244 = var0.definition.field2715;
		var0.field1245 = var0.definition.field2724;
		var0.field1246 = var0.definition.field2717;
		var0.field1243 = var0.definition.field2718;
		var0.field1248 = var0.definition.field2719;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1846361671"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
