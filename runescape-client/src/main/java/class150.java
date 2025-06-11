import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class150 extends class149 {
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1768702051
	)
	static int field1719;
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field1717;
	@ObfuscatedName("oz")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1359579163
	)
	int field1722;
	@ObfuscatedName("aj")
	boolean field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class150(class152 var1) {
		this.this$0 = var1;
		this.field1722 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1722 = var1.readUnsignedShort();
		this.field1718 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3754(this.field1722, this.field1718);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)Lia;",
		garbageValue = "260421896"
	)
	static class209 method3671(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			boolean var2 = true;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.readUnsignedShort();
			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			int var9 = var0.readUnsignedByte();
			int var10 = var0.readUnsignedByte();
			if (var6 >= 1 && var8 >= 1 && var9 >= 0 && var10 >= 0) {
				return new class209(var6, var7, var8, var9, var10);
			}
		}

		return null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "958330632"
	)
	static int method3676(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
