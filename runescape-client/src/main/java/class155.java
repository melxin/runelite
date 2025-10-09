import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class155 extends class150 {
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static GraphicsDefaults field1804;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1305937963
	)
	int field1807;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 878503313
	)
	int field1808;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1058963461
	)
	int field1805;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1655427877
	)
	int field1806;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class155(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1807 = var1.readInt();
		this.field1806 = var1.readInt();
		this.field1808 = var1.readUnsignedByte();
		this.field1805 = var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3997(this.field1807, this.field1806, this.field1808, this.field1805);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2020020691"
	)
	public static boolean method3939() {
		if (!class338.field3897.isEmpty()) {
			return true;
		} else {
			return !class338.midiRequests.isEmpty() && class338.midiRequests.get(0) != null && ((MidiRequest)class338.midiRequests.get(0)).midiPcmStream != null ? ((MidiRequest)class338.midiRequests.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltn;",
		garbageValue = "1727841736"
	)
	public static class516[] method3940() {
		return new class516[]{class516.field5567, class516.field5563, class516.field5564};
	}
}
