import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ao")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1050297095
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("av")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-4"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "120"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3271.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 33;
			}

			if (this.percentLoaded == 33) {
				if (this.archive.isValidFileName(WorldMapCacheName.field3265.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3265.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 66;
			}

			if (this.percentLoaded == 66) {
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3267.name)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 100;
				this.loaded = true;
			}
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-176567443"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1795393421"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
