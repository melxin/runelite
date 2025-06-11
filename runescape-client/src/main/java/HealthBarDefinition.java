import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static AbstractArchive field1966;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("pcmPlayerProvider")
	static class105 pcmPlayerProvider;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1322806567
	)
	public int field1961;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1280983361
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 524103943
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2033621399
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 18000013
	)
	public int field1971;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1139089751
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 608622039
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -615271137
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 860997041
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1369196193
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1971 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "21"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "124"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method10873();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method10873();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lwd;",
		garbageValue = "-1"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(field1966, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lwd;",
		garbageValue = "1047976409"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(field1966, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "47"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				HttpResponse.method306(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class335.field3698.isEmpty()) {
					var6 = false;
				} else {
					MidiRequest var7 = (MidiRequest)class335.field3698.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && ClientPacket.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MidiRequest(ModeWhere.field4905, (Integer)var0.get(var8), 0, ClientPacket.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						Login.method1870(var9, var1, var2, var3, var4);
					} else {
						class30.method451(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
