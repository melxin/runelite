import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ad")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1318039913
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("ax")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lpq;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-536495632"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1237303035"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3269.name, this.cacheName)) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-915181834"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-923373061"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
