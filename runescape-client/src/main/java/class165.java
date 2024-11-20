import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class165 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 3917242285270840869L
	)
	long field1781;
	@ObfuscatedName("aw")
	String field1780;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 381237429
	)
	int field1782;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class165(class153 var1) {
		this.this$0 = var1;
		this.field1781 = -1L;
		this.field1780 = null;
		this.field1782 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1781 = var1.readLong();
		}

		this.field1780 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1782 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3540(this.field1781, this.field1780, this.field1782);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[IIB)V",
		garbageValue = "119"
	)
	static void method3631(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class419.KitDefinition_fileCount; ++var3) {
			KitDefinition var5 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
			KitDefinition var4;
			if (var5 != null) {
				var4 = var5;
			} else if (KitDefinition.KitDefinition_archive == null) {
				var4 = null;
			} else {
				byte[] var6 = KitDefinition.KitDefinition_archive.takeFile(3, var3);
				var5 = new KitDefinition();
				if (var6 != null) {
					var5.decode(new Buffer(var6));
				}

				KitDefinition.KitDefinition_cached.put(var5, (long)var3);
				var4 = var5;
			}

			if (var4 != null && !var4.nonSelectable && var4.method3811(var2, var0)) {
				if (class198.field2055 == null) {
					class198.method3968();
				}

				int var7 = class198.field2055[var2];
				var1[var7] = var3 + 256;
				break;
			}
		}

	}
}
