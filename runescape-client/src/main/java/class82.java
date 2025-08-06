import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class82 {
	@ObfuscatedName("ah")
	protected static String field1189;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field1191;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 559467851
	)
	int field1184;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -4376043
	)
	int field1185;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1716454131
	)
	int field1186;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 400619493
	)
	int field1188;

	class82(int var1, int var2, int var3, int var4) {
		this.field1184 = var1;
		this.field1185 = var2;
		this.field1186 = var3;
		this.field1188 = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2001308070"
	)
	int method2749() {
		return this.field1184;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2018859775"
	)
	int method2739() {
		return this.field1185;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "675459745"
	)
	int method2740() {
		return this.field1186;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1370189292"
	)
	int method2737() {
		return this.field1188;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1540594819"
	)
	static String method2754(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkt;",
		garbageValue = "1417366610"
	)
	static class274[] method2747() {
		return new class274[]{class274.field3173, class274.field3163, class274.field3161, class274.field3166, class274.field3162, class274.field3167, class274.field3164};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1681257440"
	)
	public static void method2751() {
		synchronized(ArchiveDiskActionHandler.field4796) {
			if (ArchiveDiskActionHandler.field4795 != 0) {
				ArchiveDiskActionHandler.field4795 = 1;

				try {
					ArchiveDiskActionHandler.field4796.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-305221880"
	)
	static void method2752() {
		Iterator var0 = class337.midiRequests.iterator();

		while (true) {
			MidiRequest var1;
			do {
				if (!var0.hasNext()) {
					class337.midiRequests.clear();
					return;
				}

				var1 = (MidiRequest)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method7210();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3806 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class337.field3799.iterator();

			while (var4.hasNext()) {
				class343 var5 = (class343)var4.next();
				var5.vmethod7316(var2, var3);
			}
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIB)V",
		garbageValue = "-58"
	)
	static void method2750(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.vmethod10593();
					break;
				}
			}

			if (var6.last() == null) {
				var0.groundItems[var1][var2][var3] = null;
			}

			class570.updateItemPile2(var0, var1, var2, var3);
		}

	}
}
