import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class162 extends class165 {
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 794843863
	)
	int field1822;
	@ObfuscatedName("ay")
	byte field1820;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 909847413
	)
	int field1821;
	@ObfuscatedName("ad")
	String field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class162(class166 var1) {
		this.this$0 = var1;
		this.field1822 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	void vmethod3695(Buffer var1) {
		var1.readUnsignedByte();
		this.field1822 = var1.readUnsignedShort();
		this.field1820 = var1.readByte();
		this.field1821 = var1.readUnsignedShort();
		var1.readLong();
		this.field1819 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	void vmethod3696(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1822);
		var2.rank = this.field1820;
		var2.world = this.field1821;
		var2.username = new Username(this.field1819);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	protected static final void method3623() {
		GameEngine.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		DesktopPlatformInfoProvider.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ldp;III)Lrp;",
		garbageValue = "-1298657196"
	)
	static class442 method3620(WorldView var0, int var1, int var2) {
		if (class200.topLevelWorldView == var0) {
			return EnumComposition.method3908((float)var1, 0.0F, (float)var2);
		} else {
			WorldEntity var3 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? EnumComposition.method3908((float)var1, 0.0F, (float)var2) : var3.method9302(var1, var2);
		}
	}
}
