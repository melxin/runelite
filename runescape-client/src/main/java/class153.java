import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class153 extends class149 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -865680697
	)
	int field1745;
	@ObfuscatedName("aj")
	byte field1746;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class153(class152 var1) {
		this.this$0 = var1;
		this.field1745 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1745 = var1.readUnsignedShort();
		this.field1746 = var1.readByte();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3752(this.field1745, this.field1746);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method3689(int var0) {
		return var0 == WorldMapDecorationType.field4174.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lvm;",
		garbageValue = "1488134608"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5614.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method10675(new Buffer(var2));
			}

			var1.method10667();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	public static void method3696() {
		class335.field3698.clear();
	}
}
