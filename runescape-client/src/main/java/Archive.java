import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ax")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2083450777
	)
	@Export("index")
	int index;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2008646425
	)
	volatile int field4650;
	@ObfuscatedName("as")
	boolean field4651;
	@ObfuscatedName("ae")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1862571377
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -933222431
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1047089791
	)
	int field4656;
	@ObfuscatedName("av")
	boolean field4657;
	@ObfuscatedName("ar")
	boolean field4643;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	JagNetThread field4660;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;Lpw;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4650 = 0;
		this.field4651 = false;
		this.field4656 = -1;
		this.field4657 = false;
		this.field4643 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4651 = var7;
		this.field4657 = var8;
		this.field4643 = var9;
		this.field4660 = var3;
		this.field4660.method7766(this, this.index);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean vmethod7631() {
		return this.field4650 == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-363640837"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4650 == 1 || this.field4657 && this.field4650 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4660.method7750(class400.field4680.field4685, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4660.method7749(this.index, var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "506087866"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			MidiRequest.method6846(var1, this.archiveDisk, this);
		} else {
			this.field4660.method7748(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	void method7589() {
		this.field4650 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "87"
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
			this.field4660.method7748(this, class400.field4680.field4685, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1882614372"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4650 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				BoundaryObject.method5542(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				BoundaryObject.method5542(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = class447.method8504(var2, false);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I[BZI)V",
		garbageValue = "1036422901"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4650 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4660.method7748(this, class400.field4680.field4685, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4660.method7748(this, class400.field4680.field4685, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(class302.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 < 5 || var7 > 7) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4660.method7748(this, class400.field4680.field4685, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4656) {
				this.field4650 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4651 || var4) {
					this.field4660.method7748(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4651 || var4) {
					this.field4660.method7748(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = class447.method8504(var3, false);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4650 = 1;
		} else {
			this.field4656 = -1;

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

					synchronized(ArchiveDiskActionHandler.field4639) {
						if (ArchiveDiskActionHandler.field4637 == 0) {
							WorldMapDecoration.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							WorldMapDecoration.ArchiveDiskActionHandler_thread.setDaemon(true);
							WorldMapDecoration.ArchiveDiskActionHandler_thread.start();
							WorldMapDecoration.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field4637 = 600;
					}

					this.field4656 = var1;
				}
			}

			if (this.field4656 == -1) {
				this.field4650 = 1;
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-796953421"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4660.method7750(this.index, var1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-513945285"
	)
	public boolean method7595(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-10"
	)
	public boolean method7592(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
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
}
