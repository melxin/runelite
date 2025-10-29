import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class159 extends class167 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1902340551
	)
	int field1809;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class159(class168 var1) {
		this.this$0 = var1;
		this.field1809 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "23"
	)
	void vmethod4228(Buffer var1) {
		this.field1809 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1741769013;
			var1.readLong();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-24"
	)
	void vmethod4229(ClanChannel var1) {
		var1.removeMember(this.field1809);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "558050665"
	)
	public static HitSplatDefinition method4033(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferWorldComparator.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
