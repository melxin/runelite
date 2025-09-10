import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lmy;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -970155801
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 877204477
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 408172313
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1371602599"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lcq;B)V",
		garbageValue = "-21"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class137.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1901978652"
	)
	public static int method7048(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method7052() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)var1.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (DevicePcmPlayerProvider.friendsChat != null) {
			DevicePcmPlayerProvider.friendsChat.clearFriends();
		}

	}
}
