import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ai")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1994318239
	)
	@Export("index")
	int index;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1744846875
	)
	volatile int field4531;
	@ObfuscatedName("an")
	boolean field4539;
	@ObfuscatedName("af")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 910297903
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1656430421
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1424127435
	)
	int field4544;
	@ObfuscatedName("az")
	boolean field4545;
	@ObfuscatedName("ak")
	boolean field4543;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	JagNetThread field4547;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsr;Lsr;Lpl;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4531 = 0;
		this.field4539 = false;
		this.field4544 = -1;
		this.field4545 = false;
		this.field4543 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4539 = var7;
		this.field4545 = var8;
		this.field4543 = var9;
		this.field4547 = var3;
		this.field4547.method7646(this, this.index);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1409485971"
	)
	public boolean method7514() {
		return this.field4531 == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1277775407"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4531 == 1 || this.field4545 && this.field4531 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4547.method7670(class389.field4568.field4548, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "217054892"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4547.method7652(this.index, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-24"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class421.method8044(var1, this.archiveDisk, this);
		} else {
			this.field4547.method7651(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method7516() {
		this.field4531 = 2;
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
		descriptor = "(III)V",
		garbageValue = "517405850"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class421.method8044(this.index, this.masterDisk, this);
		} else {
			this.field4547.method7651(this, class389.field4568.field4548, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-726253757"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4531 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = (long)var5;
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}

				class278.method5768();
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var11 = this.archiveDisk;
				ArchiveDiskAction var14 = new ArchiveDiskAction();
				var14.type = 0;
				var14.key = (long)var1;
				var14.data = var2;
				var14.archiveDisk = var11;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14);
				}

				class278.method5768();
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = HttpRequest.method106(var2, false);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I[BZI)V",
		garbageValue = "-794770026"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4531 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4547.method7651(this, class389.field4568.field4548, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4547.method7651(this, class389.field4568.field4548, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(class182.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 < 5 || var7 > 7) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4547.method7651(this, class389.field4568.field4548, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4544) {
				this.field4531 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4539 || var4) {
					this.field4547.method7651(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4539 || var4) {
					this.field4547.method7651(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = HttpRequest.method106(var3, false);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4531 = 1;
		} else {
			this.field4544 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class276.method5742(var1, this.archiveDisk, this);
					this.field4544 = var1;
				}
			}

			if (this.field4544 == -1) {
				this.field4531 = 1;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1701153385"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4547.method7670(this.index, var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2019095529"
	)
	public boolean method7521(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1712541539"
	)
	public boolean method7522(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2035582178"
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
