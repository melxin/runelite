import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class175 extends class151 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1011030091
	)
	int field1943;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -2726175228611035441L
	)
	long field1942;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class175(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1943 = var1.readShortSmart();
		this.field1942 = var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3974(this.field1943, this.field1942);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILto;Lpw;I)V",
		garbageValue = "1742995161"
	)
	static void method4119(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1827948220"
	)
	static void method4117(int var0, int var1) {
		if (class36.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(class259.archive6, var0, 0, class36.clientPreferences.getMusicVolume(), false));
			Clock.method6081(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
