import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 extends class166 {
	@ObfuscatedName("ab")
	String field1871;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1395738695
	)
	int field1869;
	@ObfuscatedName("ag")
	byte field1870;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	class162(class167 var1) {
		this.this$0 = var1;
		this.field1871 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	void vmethod4154(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1871 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1869 = var1.readUnsignedShort();
		this.field1870 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	void vmethod4151(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1871);
		var2.world = this.field1869;
		var2.rank = this.field1870;
		var1.addMember(var2);
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIS)I",
		garbageValue = "-7578"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !Calendar.method8179(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}
}
