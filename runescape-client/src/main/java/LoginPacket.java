import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("LoginPacket")
public class LoginPacket extends class149 {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field1743;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -263207229019276879L
	)
	long field1739;
	@ObfuscatedName("ab")
	String field1737;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	LoginPacket(class152 var1) {
		this.this$0 = var1;
		this.field1739 = -1L;
		this.field1737 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.field5818;
			this.field1739 = var1.readLong();
		}

		this.field1737 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3897(this.field1739, this.field1737, 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "-1600957457"
	)
	public static VarcInt method3765(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method4195(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
