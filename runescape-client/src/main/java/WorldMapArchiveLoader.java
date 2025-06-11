import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("al")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1680953715
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("am")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "70"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1701536186"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3328.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 33;
			}

			if (this.percentLoaded == 33) {
				if (this.archive.isValidFileName(WorldMapCacheName.field3333.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3333.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 66;
			}

			if (this.percentLoaded == 66) {
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3331.name)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 100;
				this.loaded = true;
			}
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1654474607"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1844663349"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1702418681"
	)
	static void method10282(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
