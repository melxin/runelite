import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field1342;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	AbstractArchive field1340;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	NodeHashTable field1341;

	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field1341 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field1340 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lds;",
		garbageValue = "-90"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method2988(var1, var2, false);
		class107 var6 = (class107)this.field1341.get(var4);
		if (var6 != null) {
			return var6.method3218();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field1341.put(new class107(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Leh;",
		garbageValue = "-276516117"
	)
	class107 method2982(int var1, int var2) {
		long var3 = this.method2988(var1, var2, true);
		class107 var5 = (class107)this.field1341.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field1340, var1, var2);
			if (var6 == null) {
				return new class107();
			} else {
				class107 var7 = new class107(var6);
				this.field1341.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lds;",
		garbageValue = "112"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Leh;",
		garbageValue = "-1412463801"
	)
	public class107 method2984(int var1) {
		if (this.field1340.getGroupCount() == 1) {
			return this.method2982(0, var1);
		} else if (this.field1340.getGroupFileCount(var1) == 1) {
			return this.method2982(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Lds;",
		garbageValue = "-2050"
	)
	public RawSound method2987(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "74"
	)
	long method2988(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1821477672"
	)
	public static void method3005(int var0) {
		if (!class335.midiRequests.isEmpty()) {
			Iterator var1 = class335.midiRequests.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MidiRequest var3 = (MidiRequest)class335.midiRequests.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3818) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3814 = (float)var0;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1267167739"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "583189071"
	)
	static void method2983(Widget var0) {
		var0.method7806();
		var0.method7755().method7445(new class85(var0));
		var0.method7755().method7444(new class86(var0));
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZLwx;I)V",
		garbageValue = "-1950917234"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var1.readSignedShort();
			int var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			Projectile.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					Projectile.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class131.regions = new int[var4];
			class320.regionMapArchiveIds = new int[var4];
			class372.regionLandArchiveIds = new int[var4];
			AsyncRestClient.regionLandArchives = new byte[var4][];
			VarbitComposition.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class131.regions[var4] = var7;
					class320.regionMapArchiveIds[var4] = VerticalAlignment.archive9.getGroupId("m" + var5 + "_" + var6);
					class372.regionLandArchiveIds[var4] = VerticalAlignment.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			AuthenticationScheme.method3632(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var3 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			Projectile.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Projectile.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class131.regions = new int[var5];
			class320.regionMapArchiveIds = new int[var5];
			class372.regionLandArchiveIds = new int[var5];
			AsyncRestClient.regionLandArchives = new byte[var5][];
			VarbitComposition.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = SpriteMask.method7212(var9);
							int var11 = WorldMapRegion.method6426(var9);
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class131.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class131.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class320.regionMapArchiveIds[var5] = VerticalAlignment.archive9.getGroupId("m" + var13 + "_" + var14);
								class372.regionLandArchiveIds[var5] = VerticalAlignment.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			AuthenticationScheme.method3632(var3, var4, !var15);
		}

	}
}
