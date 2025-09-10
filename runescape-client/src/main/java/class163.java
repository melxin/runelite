import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class163 extends class167 {
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1743196271
	)
	static int field1873;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -103445513
	)
	static int field1872;
	@ObfuscatedName("af")
	String field1878;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1285409083
	)
	int field1877;
	@ObfuscatedName("at")
	byte field1874;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class163(class168 var1) {
		this.this$0 = var1;
		this.field1878 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1665789280"
	)
	void vmethod4108(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= -290410379;
			var1.readLong();
		}

		this.field1878 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1877 = var1.readUnsignedShort();
		this.field1874 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-358275379"
	)
	void vmethod4104(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1878);
		var2.world = this.field1877;
		var2.rank = this.field1874;
		var1.addMember(var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lko;",
		garbageValue = "46"
	)
	public static MoveSpeed[] method3999() {
		return new MoveSpeed[]{MoveSpeed.field3280, MoveSpeed.field3279, MoveSpeed.field3281, MoveSpeed.field3282};
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lcv;III)V",
		garbageValue = "-1492584916"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		SequenceDefinition var3 = var0.animationSequence.getSequenceDefinition();
		if (var1 == var0.animationSequence.getId() && var1 != -1) {
			int var4 = var3.restartMode;
			if (var4 == 1) {
				var0.animationSequence.method9572();
				var0.field1102 = var2;
			}

			if (var4 == 2) {
				var0.animationSequence.method9589();
			}
		} else if (var1 == -1 || !var0.animationSequence.isActive() || InvDefinition.SequenceDefinition_get(var1).field2480 >= var3.field2480) {
			var0.animationSequence.setSequence(var1);
			var0.animationSequence.method9572();
			var0.field1102 = var2;
			var0.field1040 = var0.pathLength;
		}

	}
}
