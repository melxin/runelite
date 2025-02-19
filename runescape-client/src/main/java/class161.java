import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class161 extends class165 {
	@ObfuscatedName("ab")
	String field1814;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -342002681
	)
	int field1815;
	@ObfuscatedName("au")
	byte field1816;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class161(class166 var1) {
		this.this$0 = var1;
		this.field1814 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	void vmethod3695(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1814 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1815 = var1.readUnsignedShort();
		this.field1816 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	void vmethod3696(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1814);
		var2.world = this.field1815;
		var2.rank = this.field1816;
		var1.addMember(var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lrp;",
		garbageValue = "-1810966579"
	)
	public static final class442 method3617(int var0, int var1, int var2, int var3) {
		float var4 = 1.0E-5F;
		class442 var5 = EnumComposition.method3908(0.0F, 1.0F, 0.0F);
		float var6 = MidiRequest.method6843(var5, ViewportMouse.field2956);
		if (Math.abs(var6) < 1.0E-5F) {
			var5.method8341();
			return null;
		} else {
			class442 var7 = EnumComposition.method3908((float)var1, (float)var2, (float)var3);
			class442 var8 = EnumComposition.method3908(var7.field4898, var7.field4899 - (float)var0, var7.field4900);
			float var9 = -MidiRequest.method6843(var5, var8) / var6;
			var5.method8341();
			if (var9 < 0.0F) {
				var8.method8341();
				var7.method8341();
				return null;
			} else {
				class442 var11 = ViewportMouse.field2956;
				class442 var12 = WorldMapDecoration.method6284(var11);
				var12.method8307(var9);
				class442 var13 = class208.method4151(var7, var12);
				var12.method8341();
				var8.method8341();
				var7.method8341();
				return var13;
			}
		}
	}
}
