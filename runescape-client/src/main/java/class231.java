import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public abstract class class231 {
	@ObfuscatedName("ai")
	String field2518;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	final class228 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lio;Ljava/lang/String;)V"
	)
	class231(class228 var1, String var2) {
		this.this$0 = var1;
		this.field2518 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1702909446"
	)
	public abstract int vmethod4851();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1519037099"
	)
	public int vmethod4853() {
		return -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1383799233"
	)
	public String vmethod4852() {
		return null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-25375"
	)
	public String method4850() {
		return this.field2518;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "-1473246040"
	)
	public static TransformationMatrix method4854() {
		synchronized(TransformationMatrix.field4981) {
			if (TransformationMatrix.field4980 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4981[--TransformationMatrix.field4980].method8776();
				return TransformationMatrix.field4981[TransformationMatrix.field4980];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-2"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
