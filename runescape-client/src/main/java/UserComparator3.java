import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;Lst;I)I",
		garbageValue = "-2147478082"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lwg;",
		garbageValue = "-2145729549"
	)
	static SpritePixels method3220(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "-124"
	)
	static void method3214(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (WorldEntity.field144.startsWith("win") && !var3) {
				SoundSystem.method829(var0, 0);
				return;
			}

			if (WorldEntity.field144.startsWith("mac")) {
				class178.method3767(var0, 1, var2);
				return;
			}

			SoundSystem.method829(var0, 2);
		} else {
			SoundSystem.method829(var0, 3);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lvm;",
		garbageValue = "-1"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(VarcInt.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class47.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class47.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class321.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "769818369"
	)
	public static void method3219(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class335.field3687.clear();
			class335.field3694.clear();
			class59.method1136(var5);
			class400.method7627(var0, var5);
			if (!class335.field3687.isEmpty()) {
				ClientPreferences.method2821(var1, var2, var3, var4);
				class335.field3694.add(new AddRequestTask((SongTask)null));
				class335.field3694.add(new class466((SongTask)null, class335.field3686, AbstractByteArrayCopier.field4097, class335.field3685));
				ArrayList var6 = new ArrayList();
				var6.add(new class461(new FadeInTask((SongTask)null, 0, true, class335.field3684)));
				if (!class335.midiRequests.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class335.field3690));
					ArrayList var8 = AbstractWorldMapData.method6246();
					var7.add(new DelayFadeTask(new FadeOutTask(new class459((SongTask)null, var8), 0, false, class335.field3693), class335.musicPlayerStatus));
					class335.field3694.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class335.field3694.add(new DelayFadeTask((SongTask)null, class335.field3690));
					class335.field3694.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-2140166655"
	)
	static void method3217(WorldView var0) {
		if (Client.renderSelf) {
			VarbitComposition.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}
}
