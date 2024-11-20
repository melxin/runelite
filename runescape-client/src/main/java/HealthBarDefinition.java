import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	public static AbstractArchive field1929;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -457709737
	)
	public int field1934;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1654019267
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 263586031
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 452932465
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1559846295
	)
	public int field1937;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1065569319
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1791205917
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1679774647
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2021941839
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1590711131
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
		this.field1937 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "40"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-1790839545"
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
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lvr;",
		garbageValue = "40"
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
				var1 = class53.SpriteBuffer_getSprite(field1929, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lvr;",
		garbageValue = "-111"
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
				var1 = class53.SpriteBuffer_getSprite(field1929, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "194125060"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Liy;",
		garbageValue = "-1651520514"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1669175950"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1323853945"
	)
	public static void method3849() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	static final void method3848(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (SoundSystem.cameraPitch < var0) {
			SoundSystem.cameraPitch = (var0 - SoundSystem.cameraPitch) * UserComparator9.field1502 / 1000 + SoundSystem.cameraPitch + GrandExchangeOfferOwnWorldComparator.field479;
			if (SoundSystem.cameraPitch > var0) {
				SoundSystem.cameraPitch = var0;
			}
		} else if (SoundSystem.cameraPitch > var0) {
			SoundSystem.cameraPitch -= (SoundSystem.cameraPitch - var0) * UserComparator9.field1502 / 1000 + GrandExchangeOfferOwnWorldComparator.field479;
			if (SoundSystem.cameraPitch < var0) {
				SoundSystem.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - ReflectionCheck.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			ReflectionCheck.cameraYaw = var2 * UserComparator9.field1502 / 1000 + ReflectionCheck.cameraYaw + GrandExchangeOfferOwnWorldComparator.field479;
			ReflectionCheck.cameraYaw &= 2047;
		} else if (var2 < 0) {
			ReflectionCheck.cameraYaw -= GrandExchangeOfferOwnWorldComparator.field479 + -var2 * UserComparator9.field1502 / 1000;
			ReflectionCheck.cameraYaw &= 2047;
		}

		int var3 = var1 - ReflectionCheck.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			ReflectionCheck.cameraYaw = var1;
		}

	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1978555062"
	)
	static void method3845(int var0, int var1) {
		ModeWhere.method7808(class482.tempMenuAction, var0, var1);
		class482.tempMenuAction = null;
	}
}
