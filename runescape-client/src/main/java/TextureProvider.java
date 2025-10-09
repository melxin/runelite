import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lid;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1479971029
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1095885591
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ah")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -706188769
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.textures = new Texture[var1.getGroupFileCount(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
				this.textures[var7[var9]] = new Texture(var10);
			}
		} else {
			this.textures = new Texture[0];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1862048089"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) {
			return 100;
		} else {
			int var1 = 0;
			int var2 = 0;
			Texture[] var3 = this.textures;

			for (int var4 = 0; var4 < var3.length; ++var4) {
				Texture var5 = var3[var4];
				if (var5 != null && var5.fileId != -1) {
					++var1;
					if (this.archive.method8392(var5.fileId)) {
						++var2;
					}
				}
			}

			if (var1 == 0) {
				return 0;
			} else {
				return var2 * 100 / var1;
			}
		}
	}

	@ObfuscatedName("at")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-638943649"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1183141771"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textures[var1].isLowDetail;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-472833065"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "860997416"
	)
	public static void method5489(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class338.field3893.clear();
			class338.field3897.clear();
			MidiRequest var7;
			Iterator var10;
			if (var5) {
				Iterator var12 = class338.midiRequests.iterator();

				label74:
				while (true) {
					do {
						if (!var12.hasNext()) {
							class338.midiRequests.clear();
							break label74;
						}

						var7 = (MidiRequest)var12.next();
					} while(var7 == null);

					var7.midiPcmStream.clear();
					var7.midiPcmStream.method7225();
					var7.midiPcmStream.setPcmStreamVolume(0);
					var7.midiPcmStream.field3910 = 0;
					int var13 = var7.musicTrackGroupId;
					int var14 = var7.musicTrackFileId;
					var10 = class338.field3892.iterator();

					while (var10.hasNext()) {
						class344 var11 = (class344)var10.next();
						var11.vmethod7348(var13, var14);
					}
				}
			} else {
				for (int var6 = 0; var6 < class338.midiRequests.size(); ++var6) {
					var7 = (MidiRequest)class338.midiRequests.get(var6);
					if (var7 == null) {
						class338.midiRequests.remove(var6);
						--var6;
					} else if (var7.field4015) {
						if (var7.midiPcmStream.field3910 > 0) {
							--var7.midiPcmStream.field3910;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method7225();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class338.midiRequests.remove(var6);
						--var6;
					} else {
						var7.field4015 = true;
					}
				}
			}

			WorldMapSprite.method6838(var0, var5);
			if (!class338.field3893.isEmpty()) {
				class338.musicPlayerStatus = var1;
				class338.field3899 = var2;
				class338.field3896 = var3;
				class338.field3901 = var4;
				class338.field3897.add(new AddRequestTask((SongTask)null));
				class338.field3897.add(new class477((SongTask)null, WorldMapEvent.field3518, AsyncHttpResponse.field76, class338.field3895));
				ArrayList var17 = new ArrayList();
				var17.add(new class472(new FadeInTask((SongTask)null, 0, true, class338.field3901)));
				if (!class338.midiRequests.isEmpty()) {
					ArrayList var15 = new ArrayList();
					var15.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var17), class338.field3896));
					ArrayList var9 = new ArrayList();
					var10 = class338.midiRequests.iterator();

					while (var10.hasNext()) {
						MidiRequest var16 = (MidiRequest)var10.next();
						var9.add(var16);
					}

					var15.add(new DelayFadeTask(new FadeOutTask(new class470((SongTask)null, var9), 0, false, class338.field3899), class338.musicPlayerStatus));
					class338.field3897.add(new ConcurrentMidiTask((SongTask)null, var15));
				} else {
					class338.field3897.add(new DelayFadeTask((SongTask)null, class338.field3896));
					class338.field3897.add(new ConcurrentMidiTask((SongTask)null, var17));
				}

			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-483394139"
	)
	public static int method5490(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
