import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("LoginPacket")
public class LoginPacket extends class150 {
	@ObfuscatedName("ad")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 851312265
	)
	static int field1676;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -7198038692640291871L
	)
	long field1673;
	@ObfuscatedName("ah")
	String field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	LoginPacket(class153 var1) {
		this.this$0 = var1;
		this.field1673 = -1L;
		this.field1672 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1673 = var1.readLong();
		}

		this.field1672 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3691(this.field1673, this.field1672, 0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "37"
	)
	public static int method3577(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "98"
	)
	static int method3575(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
