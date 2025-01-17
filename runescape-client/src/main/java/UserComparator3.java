import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1260367595
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -1449433465
	)
	static int field1506;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;I)I",
		garbageValue = "1663642696"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "908157200"
	)
	public static void method3346() {
		class254.field2136.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "23665"
	)
	public static void method3347(int var0, int var1) {
		class333.musicPlayerStatus = var0;
		class333.field3632 = var1;
		class333.field3633 = 0;
		class333.field3634 = 0;
		class333.field3626.clear();
		class333.field3629.clear();
		if (!class333.midiRequests.isEmpty() && (var0 != 0 || var1 != 0)) {
			class333.field3629.add(new DelayFadeTask((SongTask)null, class333.musicPlayerStatus));
			class333.field3629.add(new FadeOutTask((SongTask)null, 0, false, class333.field3632));
			ArrayList var10 = new ArrayList();
			Iterator var4 = class333.midiRequests.iterator();

			while (var4.hasNext()) {
				MidiRequest var5 = (MidiRequest)var4.next();
				var10.add(var5);
			}

			class333.field3629.add(new class443((SongTask)null, var10));
		} else {
			Iterator var2 = class333.midiRequests.iterator();

			while (true) {
				MidiRequest var3;
				do {
					if (!var2.hasNext()) {
						class333.midiRequests.clear();
						return;
					}

					var3 = (MidiRequest)var2.next();
				} while(var3 == null);

				var3.midiPcmStream.clear();
				var3.midiPcmStream.method6714();
				var3.midiPcmStream.setPcmStreamVolume(0);
				var3.midiPcmStream.field3668 = 0;
				int var8 = var3.musicTrackGroupId;
				int var9 = var3.musicTrackFileId;
				Iterator var6 = class333.field3627.iterator();

				while (var6.hasNext()) {
					class339 var7 = (class339)var6.next();
					var7.vmethod6894(var8, var9);
				}
			}
		}
	}
}
