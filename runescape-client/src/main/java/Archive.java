import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aq")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("on")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("ac")
	boolean field4937;
	@ObfuscatedName("aa")
	boolean field4952;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1041347307
	)
	@Export("index")
	int index;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1542923063
	)
	volatile int field4948;
	@ObfuscatedName("ar")
	boolean field4943;
	@ObfuscatedName("az")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1152341887
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1994820135
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -409579803
	)
	int field4945;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	JagNetThread field4953;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Ltd;Ltd;Lpa;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4937 = false;
		this.field4952 = false;
		this.field4948 = 0;
		this.field4943 = false;
		this.field4945 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4943 = var7;
		this.field4952 = var8;
		this.field4937 = var9;
		this.field4953 = var3;
		this.field4953.method8491(this, this.index);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method8369() {
		return this.field4948 == 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "169812634"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4948 == 1 || this.field4952 && this.field4948 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4953.method8495(class408.field4957.field4982, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-16251"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4953.method8494(this.index, var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1795678785"
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
			this.field4953.method8493(this, this.index, var1, super.groupCrcs[var1], (byte)4, true);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2105276845"
	)
	void method8348() {
		this.field4948 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-24065"
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
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) {
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
			this.field4953.method8493(this, class408.field4957.field4982, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[BZZS)V",
		garbageValue = "10608"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4948 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				WorldMapRegion.method6643(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 4] = (byte)(super.groupVersions[var1] >> 24);
			var2[var2.length - 3] = (byte)(super.groupVersions[var1] >> 16);
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				WorldMapRegion.method6643(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = SecureUrlRequester.method3587(var2, false);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ltd;I[BZB)V",
		garbageValue = "-3"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4948 == 1) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.field4953.method8493(this, class408.field4957.field4982, this.index, this.indexCrc, (byte)0, true);
			} else {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length);
				var5 = (int)Archive_crc.getValue();
				if (var5 != this.indexCrc) {
					this.field4953.method8493(this, class408.field4957.field4982, this.index, this.indexCrc, (byte)0, true);
				} else {
					Buffer var9 = new Buffer(ObjectComposition.decompressBytes(var3));
					int var7 = var9.readUnsignedByte();
					if (var7 < 5 || var7 > 7) {
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0;
						if (var7 >= 6) {
							var8 = var9.method11575();
						}

						if (var8 != this.indexVersion) {
							this.field4953.method8493(this, class408.field4957.field4982, this.index, this.indexCrc, (byte)0, true);
						} else {
							this.decodeIndex(var3);
							this.loadAllLocal();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field4945) {
				this.field4948 = 1;
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
						super.groups[var2] = SecureUrlRequester.method3587(var3, false);
					}

				} else {
					this.validGroups[var2] = false;
					if (this.field4943 || var4) {
						this.field4953.method8493(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
					}

				}
			} else {
				this.validGroups[var2] = false;
				if (this.field4943 || var4) {
					this.field4953.method8493(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
				}

			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2060123381"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4948 = 1;
		} else {
			this.field4945 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					RestClientThreadFactory.method203(var1, this.archiveDisk, this);
					this.field4945 = var1;
				}
			}

			if (this.field4945 == -1) {
				this.field4948 = 1;
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-28"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4953.method8495(this.index, var1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "258513959"
	)
	public boolean method8377(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "87"
	)
	public boolean method8355(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1526110792"
	)
	public static int method8388(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
