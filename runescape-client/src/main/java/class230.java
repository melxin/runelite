import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class230 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "83"
	)
	static final void method5023(String var0) {
		ClanSettings.method3631("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;Ljava/lang/String;Ljava/lang/String;I)Lrk;",
		garbageValue = "1126247432"
	)
	public static Font method5024(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			return class255.method5320(var0, var1, var4, var5);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lph;IB)V",
		garbageValue = "15"
	)
	public static void method5022(AbstractArchive var0, int var1) {
		if (!class335.field3698.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class335.field3698.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field3818 = false;
				var4.field3820 = false;
				var4.field3819 = false;
				var4.field3814 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3815 = 0.0F;
				var2.add(var4);
			}

			MouseHandler.method665(var2, class335.musicPlayerStatus, class335.field3692, class335.field3702, class335.field3693, false);
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1899824822"
	)
	static final void method5021() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			Iterator var2 = var1.npcs.iterator();

			while (var2.hasNext()) {
				NPC var3 = (NPC)var2.next();
				if (var3 != null) {
					class244.updateActorSequence(var1, var3, var3.definition.size);
				}
			}
		}

	}
}
