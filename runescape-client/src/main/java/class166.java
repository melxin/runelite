import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class166 extends class151 {
	@ObfuscatedName("pc")
	static byte[][] field1890;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 8061763569836155007L
	)
	long field1889;
	@ObfuscatedName("aw")
	String field1887;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 571895803
	)
	int field1888;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class166(class154 var1) {
		this.this$0 = var1;
		this.field1889 = -1L;
		this.field1887 = null;
		this.field1888 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= -290410379;
			this.field1889 = var1.readLong();
		}

		this.field1887 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1888 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3962(this.field1889, this.field1887, this.field1888);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "142805065"
	)
	public static void method4023() {
		class196.field2100.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "21"
	)
	public static int method4030(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1288803374"
	)
	public static void method4028(AbstractArchive var0, int var1) {
		if (!class339.field3889.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class339.field3889.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field4009 = false;
				var4.field4008 = false;
				var4.field4010 = false;
				var4.field4011 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field4002 = 0.0F;
				var2.add(var4);
			}

			Clock.method6081(var2, class339.musicPlayerStatus, class339.field3896, class339.field3898, class339.field3897, false);
		}
	}
}
