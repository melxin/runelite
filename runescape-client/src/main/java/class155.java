import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class155 extends class165 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -303517089
	)
	int field1757;
	@ObfuscatedName("aj")
	byte field1756;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1373437449
	)
	int field1758;
	@ObfuscatedName("ai")
	String field1759;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class155(class166 var1) {
		this.this$0 = var1;
		this.field1757 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-830685594"
	)
	void vmethod3902(Buffer var1) {
		this.field1757 = var1.readUnsignedShort();
		this.field1756 = var1.readByte();
		this.field1758 = var1.readUnsignedShort();
		var1.readLong();
		this.field1759 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;B)V",
		garbageValue = "0"
	)
	void vmethod3908(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1757);
		var2.rank = this.field1756;
		var2.world = this.field1758;
		var2.username = new Username(this.field1759);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;I)V",
		garbageValue = "-130015486"
	)
	public static void method3705(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.field2026 = var1;
	}
}
