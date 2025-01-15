import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class1 implements Callable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field2;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;Lvy;Lao;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field2 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod12(this.field2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lue;S)Lue;",
		garbageValue = "-4982"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class357.method7049(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1322829904"
	)
	public static void method9(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class333.field3631.clear();
			class333.field3629.clear();
			MusicSong var7;
			Iterator var10;
			Iterator var12;
			if (var5) {
				var12 = class333.musicSongs.iterator();

				label102:
				while (true) {
					do {
						if (!var12.hasNext()) {
							class333.musicSongs.clear();
							break label102;
						}

						var7 = (MusicSong)var12.next();
					} while(var7 == null);

					var7.midiPcmStream.clear();
					var7.midiPcmStream.method6714();
					var7.midiPcmStream.setPcmStreamVolume(0);
					var7.midiPcmStream.field3668 = 0;
					int var13 = var7.musicTrackGroupId;
					int var14 = var7.musicTrackFileId;
					var10 = class333.field3627.iterator();

					while (var10.hasNext()) {
						class339 var11 = (class339)var10.next();
						var11.vmethod6894(var13, var14);
					}
				}
			} else {
				for (int var6 = 0; var6 < class333.musicSongs.size(); ++var6) {
					var7 = (MusicSong)class333.musicSongs.get(var6);
					if (var7 == null) {
						class333.musicSongs.remove(var6);
						--var6;
					} else if (var7.field3744) {
						if (var7.midiPcmStream.field3668 > 0) {
							--var7.midiPcmStream.field3668;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6714();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class333.musicSongs.remove(var6);
						--var6;
					} else {
						var7.field3744 = true;
					}
				}
			}

			if (!var5) {
				class333.field3626.clear();
			}

			var12 = var0.iterator();

			while (var12.hasNext()) {
				var7 = (MusicSong)var12.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class333.field3626.add(var7);
					}

					class333.field3631.add(var7);
				}
			}

			if (!class333.field3631.isEmpty()) {
				class333.musicPlayerStatus = var1;
				class333.field3632 = var2;
				class333.field3633 = var3;
				class333.field3634 = var4;
				class333.field3629.add(new AddRequestTask((SongTask)null));
				class333.field3629.add(new class450((SongTask)null, class333.field3628, class553.field5461, class333.field3624));
				ArrayList var17 = new ArrayList();
				var17.add(new class445(new FadeInTask((SongTask)null, 0, true, class333.field3634)));
				if (!class333.musicSongs.isEmpty()) {
					ArrayList var15 = new ArrayList();
					var15.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var17), class333.field3633));
					ArrayList var9 = new ArrayList();
					var10 = class333.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var16 = (MusicSong)var10.next();
						var9.add(var16);
					}

					var15.add(new DelayFadeTask(new FadeOutTask(new class443((SongTask)null, var9), 0, false, class333.field3632), class333.musicPlayerStatus));
					class333.field3629.add(new ConcurrentMidiTask((SongTask)null, var15));
				} else {
					class333.field3629.add(new DelayFadeTask((SongTask)null, class333.field3633));
					class333.field3629.add(new ConcurrentMidiTask((SongTask)null, var17));
				}

			}
		}
	}
}
