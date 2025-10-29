import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class152 extends class151 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -919298639
	)
	int field1762;
	@ObfuscatedName("at")
	boolean field1763;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class152(class154 var1) {
		this.this$0 = var1;
		this.field1762 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1762 = var1.readUnsignedShort();
		this.field1763 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4100(this.field1762, this.field1763);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lci;B)Z",
		garbageValue = "0"
	)
	static boolean method3979(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class330.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = GameEngine.method676();
				boolean var2;
				if (!var1) {
					var2 = (Client.drawPlayerNames & 1) != 0;
					var1 = var2 && var0.isFriend();
				}

				var2 = var1;
				if (!var1) {
					boolean var3 = (Client.drawPlayerNames & 2) != 0;
					var2 = var3 && var0.isFriendsChatMember();
				}

				return var2;
			}
		}
	}
}
