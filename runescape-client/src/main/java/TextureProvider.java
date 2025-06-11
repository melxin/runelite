import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ljq;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1128153515
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1690358439
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("al")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1645089557
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;IDI)V"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1149354793"
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
				if (var5 != null && var5.fileIds != null) {
					var1 += var5.fileIds.length;
					int[] var6 = var5.fileIds;

					for (int var7 = 0; var7 < var6.length; ++var7) {
						int var8 = var6[var7];
						if (this.archive.method8075(var8)) {
							++var2;
						}
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

	@ObfuscatedName("aj")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1086905002"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1205864267"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "973328106"
	)
	public boolean vmethod5847(int var1) {
		return this.textures[var1].field2593;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2032088871"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1338366436"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-75"
	)
	static String method5483(int var0) {
		return "<img=" + var0 + ">";
	}
}
