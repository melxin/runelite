import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
class class483 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	class483(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1710064879"
	)
	int method9880(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method9880((Entry)var1, (Entry)var2);
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	static final void method9883() {
		WorldMapRenderer.method6699(class304.field3485, GameEngine.field187, ServerPacket.field3813);
		class281.method6350(class70.field966, class32.field150);
		if (Huffman.cameraX == class304.field3485 && class514.cameraY == GameEngine.field187 && ChatChannel.cameraZ == ServerPacket.field3813 && class70.field966 == class386.cameraPitch && class32.field150 == SpriteBufferProperties.cameraYaw) {
			Client.field429 = false;
			Client.isCameraLocked = false;
			Client.field559 = false;
			Client.field560 = false;
			class168.field1907 = 0;
			PlayerComposition.field4113 = 0;
			ConcurrentMidiTask.field5357 = 0;
			HealthBarConfig.field1176 = 0;
			MilliClock.field3131 = 0;
			ClientPacket.field3651 = 0;
			ObjectSound.field983 = 0;
			AddRequestTask.field5334 = 0;
			WorldMapSectionType.field3426 = 0;
			UserComparator10.field1585 = 0;
			Client.field494 = null;
			Client.field564 = null;
			Client.field378 = null;
		}

	}
}
