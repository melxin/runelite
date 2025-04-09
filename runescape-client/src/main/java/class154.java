import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class154 extends class164 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1435550419
	)
	int field1748;
	@ObfuscatedName("an")
	byte field1743;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 104136101
	)
	int field1747;
	@ObfuscatedName("af")
	String field1745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgo;)V"
	)
	class154(class165 var1) {
		this.this$0 = var1;
		this.field1748 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1341652344"
	)
	void vmethod3736(Buffer var1) {
		this.field1748 = var1.readUnsignedShort();
		this.field1743 = var1.readByte();
		this.field1747 = var1.readUnsignedShort();
		var1.readLong();
		this.field1745 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "992088037"
	)
	void vmethod3737(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1748);
		var2.rank = this.field1743;
		var2.world = this.field1747;
		var2.username = new Username(this.field1745);
	}
}
