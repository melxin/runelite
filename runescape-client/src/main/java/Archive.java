import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aw")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ap")
	boolean field4983;
	@ObfuscatedName("ay")
	boolean field4974;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -669659167
	)
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1934961457
	)
	volatile int field4978;
	@ObfuscatedName("as")
	boolean field4970;
	@ObfuscatedName("ac")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1643278115
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1508356495
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1387569623
	)
	int field4977;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	JagNetThread field4979;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Ltf;Ltf;Lqy;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4983 = false;
		this.field4974 = false;
		this.field4978 = 0;
		this.field4970 = false;
		this.field4977 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4970 = var7;
		this.field4974 = var8;
		this.field4983 = var9;
		this.field4979 = var3;
		this.field4979.method8682(this, this.index);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "86757269"
	)
	public boolean method8532() {
		return this.field4978 == 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4978 == 1 || this.field4974 && this.field4978 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4979.method8686(class418.field4996.field5012, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1511163426"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4979.method8685(this.index, var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) {
						var4 = var6.data;
						break;
					}
				}
			}

			if (var4 != null) {
				this.load(var2, var1, var4, true);
			} else {
				byte[] var5 = var2.read(var1);
				this.load(var2, var1, var5, true);
			}
		} else {
			this.field4979.method8684(this, this.index, var1, super.groupCrcs[var1], (byte)4, true);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1537917663"
	)
	void method8536() {
		this.field4978 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "119"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			int var3 = this.index;
			ArchiveDisk var4 = this.masterDisk;
			byte[] var6 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) {
						var6 = var8.data;
						break;
					}
				}
			}

			if (var6 != null) {
				this.load(var4, var3, var6, true);
			} else {
				byte[] var7 = var4.read(var3);
				this.load(var4, var3, var7, true);
			}
		} else {
			this.field4979.method8684(this, class418.field4996.field5012, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1799083207"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4978 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				class529.method10773(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 4] = (byte)(super.groupVersions[var1] >> 24);
			var2[var2.length - 3] = (byte)(super.groupVersions[var1] >> 16);
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				class529.method10773(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = BufferedSource.method10439(var2, false);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I[BZI)V",
		garbageValue = "-229409281"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4978 == 1) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.field4979.method8684(this, class418.field4996.field5012, this.index, this.indexCrc, (byte)0, true);
			} else {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length);
				var5 = (int)Archive_crc.getValue();
				if (var5 != this.indexCrc) {
					this.field4979.method8684(this, class418.field4996.field5012, this.index, this.indexCrc, (byte)0, true);
				} else {
					Buffer var9 = new Buffer(HttpRequestTask.decompressBytes(var3));
					int var7 = var9.readUnsignedByte();
					if (var7 < 5 || var7 > 7) {
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0;
						if (var7 >= 6) {
							var8 = var9.readInt();
						}

						if (var8 != this.indexVersion) {
							this.field4979.method8684(this, class418.field4996.field5012, this.index, this.indexCrc, (byte)0, true);
						} else {
							this.decodeIndex(var3);
							this.loadAllLocal();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field4977) {
				this.field4978 = 1;
			}

			if (var3 != null && var3.length > 4) {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length - 4);
				var5 = (int)Archive_crc.getValue();
				int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255) + ((var3[var3.length - 4] & 255) << 24) + ((var3[var3.length - 3] & 255) << 16);
				if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
					Archive_crc.reset();
					Archive_crc.update(var3, 0, var3.length - 2);
					var5 = (int)Archive_crc.getValue();
					var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				}

				if (var5 == super.groupCrcs[var2] && var6 == super.groupVersions[var2]) {
					this.validGroups[var2] = true;
					if (var4) {
						super.groups[var2] = BufferedSource.method10439(var3, false);
					}

				} else {
					this.validGroups[var2] = false;
					if (this.field4970 || var4) {
						this.field4979.method8684(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
					}

				}
			} else {
				this.validGroups[var2] = false;
				if (this.field4970 || var4) {
					this.field4979.method8684(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
				}

			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1316215267"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4978 = 1;
		} else {
			this.field4977 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = (long)var1;
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					class228.method5078();
					this.field4977 = var1;
				}
			}

			if (this.field4977 == -1) {
				this.field4978 = 1;
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "743318851"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4979.method8686(this.index, var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "985857643"
	)
	public boolean method8541(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1344023781"
	)
	public boolean method8542(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1781125969"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZIII)Lxt;",
		garbageValue = "-1750200916"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
		if (var6 == 36 && var7 == 32) {
			if (var1 == -1) {
				var4 = 0;
			} else if (var4 == 2 && var1 != 1) {
				var4 = 1;
			}
		} else {
			var4 = 0;
		}

		long var8 = ((long)var3 << 42) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40);
		SpritePixels var10;
		if (!var5 && var6 == 36 && var7 == 32) {
			var10 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var8);
			if (var10 != null) {
				return var10;
			}
		}

		ItemComposition var11 = class150.ItemDefinition_get(var0);
		if (var1 > 1 && var11.countobj != null) {
			int var12 = -1;

			for (int var13 = 0; var13 < 10; ++var13) {
				if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
					var12 = var11.countobj[var13];
				}
			}

			if (var12 != -1) {
				var11 = class150.ItemDefinition_get(var12);
			}
		}

		Model var23 = var11.getModel(1);
		if (var23 == null) {
			return null;
		} else {
			SpritePixels var24 = null;
			if (var11.noteTemplate != -1) {
				var24 = getItemSprite(var11.note, 10, 1, 0, 0, true, var6, var7);
				if (var24 == null) {
					return null;
				}
			} else if (var11.notedId != -1) {
				var24 = getItemSprite(var11.unnotedId, var1, var2, var3, 0, false, var6, var7);
				if (var24 == null) {
					return null;
				}
			} else if (var11.placeholderTemplate != -1) {
				var24 = getItemSprite(var11.placeholder, var1, 0, 0, 0, false, var6, var7);
				if (var24 == null) {
					return null;
				}
			}

			int[] var14 = Rasterizer2D.Rasterizer2D_pixels;
			int var15 = Rasterizer2D.Rasterizer2D_width;
			int var16 = Rasterizer2D.Rasterizer2D_height;
			float[] var17 = Rasterizer2D.Rasterizer2D_brightness;
			int[] var18 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var18);
			var10 = new SpritePixels(var6, var7);
			Rasterizer3D.method5410(var10.pixels, var6, var7, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			int var19 = var7 >> 1;
			Rasterizer3D.setCustomClipBounds(var19, var19);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var11.placeholderTemplate != -1) {
				var24.drawTransBgAt(0, 0);
			}

			int var20 = var11.zoom2d;
			if (var6 != 36) {
				var20 = var20 * 32 / var6;
			}

			if (var5) {
				var20 = (int)(1.5D * (double)var20);
			} else if (var2 == 2) {
				var20 = (int)(1.04D * (double)var20);
			}

			int var21 = var20 * Rasterizer3D.Rasterizer3D_sine[var11.xan2d] >> 16;
			int var22 = var20 * Rasterizer3D.Rasterizer3D_cosine[var11.xan2d] >> 16;
			var23.calculateBoundsCylinder();
			var23.drawFrustum(0, var11.yan2d, var11.zan2d, var11.xan2d, var11.offsetX2d, var23.height / 2 + var21 + var11.offsetY2d, var22 + var11.offsetY2d);
			if (var11.notedId != -1) {
				var24.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var10.outline(1);
			}

			if (var2 >= 2) {
				var10.outline(16777215);
			}

			if (var3 != 0) {
				var10.shadow(var3);
			}

			Rasterizer3D.method5410(var10.pixels, var6, var7, (float[])null);
			if (var11.noteTemplate != -1) {
				var24.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var11.isStackable == 1) {
				class175.ItemDefinition_fontPlain11.draw(HttpMethod.method74(var1), 0, 9, 16776960, 1);
			}

			if (!var5 && var6 == 36 && var7 == 32) {
				ItemComposition.ItemDefinition_cachedSprites.put(var10, var8);
			}

			Rasterizer3D.method5410(var14, var15, var16, var17);
			Rasterizer2D.Rasterizer2D_setClipArray(var18);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var10;
		}
	}
}
