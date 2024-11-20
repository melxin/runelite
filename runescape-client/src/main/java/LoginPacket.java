import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("LoginPacket")
public class LoginPacket extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -7797161101180981703L
	)
	long field1669;
	@ObfuscatedName("aw")
	String field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	LoginPacket(class153 var1) {
		this.this$0 = var1;
		this.field1669 = -1L;
		this.field1672 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1669 = var1.readLong();
		}

		this.field1672 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3540(this.field1669, this.field1672, 0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-317497481"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-206110438"
	)
	static void method3448(int var0) {
		Client.oculusOrbState = var0;
	}
}
