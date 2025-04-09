import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class256 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class256 field2819;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class256 field2816;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class256 field2817;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class256 field2818;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class256 field2815;

	static {
		field2819 = new class256(0);
		field2816 = new class256(1);
		field2817 = new class256(2);
		field2818 = new class256(3);
		field2815 = new class256(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class256(int var1) {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1364490326"
	)
	public static float method5324(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0) * 3.834951969714103E-4D);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1001891964"
	)
	public static int method5325(int var0) {
		return var0 >>> 4 & class561.field5547;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-144147869"
	)
	public static void method5322(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1205080604"
	)
	static int method5323(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2147050557"
	)
	static boolean method5321() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
