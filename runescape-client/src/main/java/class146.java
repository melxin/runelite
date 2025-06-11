import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class146 extends class149 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1474496073
	)
	int field1697;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1876568733
	)
	int field1698;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 646968379
	)
	int field1700;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1147060621
	)
	int field1701;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class146(class152 var1) {
		this.this$0 = var1;
		this.field1697 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1697 = var1.readUnsignedShort();
		this.field1698 = var1.readInt();
		this.field1700 = var1.readUnsignedByte();
		this.field1701 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3790(this.field1697, this.field1698, this.field1700, this.field1701);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lxs;",
		garbageValue = "-42"
	)
	public static PrivateChatMode method3642(int var0) {
		PrivateChatMode[] var1 = ClanMate.method9580();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field5858) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-606855044"
	)
	public static int method3635(CharSequence var0) {
		return class364.method7312(var0, 10, true);
	}
}
