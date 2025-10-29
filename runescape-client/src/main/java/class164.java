import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class164 extends class167 {
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1436734183
	)
	static int field1862;
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -516555115
	)
	int field1859;
	@ObfuscatedName("at")
	byte field1864;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -506745563
	)
	int field1860;
	@ObfuscatedName("an")
	String field1861;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class164(class168 var1) {
		this.this$0 = var1;
		this.field1859 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "23"
	)
	void vmethod4228(Buffer var1) {
		var1.readUnsignedByte();
		this.field1859 = var1.readUnsignedShort();
		this.field1864 = var1.readByte();
		this.field1860 = var1.readUnsignedShort();
		var1.readLong();
		this.field1861 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-24"
	)
	void vmethod4229(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1859);
		var2.rank = this.field1864;
		var2.world = this.field1860;
		var2.username = new Username(this.field1861);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Luv;",
		garbageValue = "1672752639"
	)
	public static class526[] method4141() {
		return new class526[]{class526.field5579, class526.field5582, class526.field5580};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-42"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "27"
	)
	static void method4140(WorldView var0) {
		if (class166.field1882 != null && Client.field536 > 0) {
			int var1 = Client.field377 * 128;
			Clock.method5250(var0, var1, class166.field1882);
		}

	}
}
