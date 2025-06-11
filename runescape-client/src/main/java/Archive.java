import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ac")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("aa")
	boolean field4713;
	@ObfuscatedName("am")
	boolean field4705;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 111504285
	)
	@Export("index")
	int index;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 7418749
	)
	volatile int field4707;
	@ObfuscatedName("ad")
	boolean field4710;
	@ObfuscatedName("af")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1174618069
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1683119731
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1498055627
	)
	int field4714;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	JagNetThread field4704;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Ltb;Ltb;Lpm;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4713 = false;
		this.field4705 = false;
		this.field4707 = 0;
		this.field4710 = false;
		this.field4714 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4710 = var7;
		this.field4705 = var8;
		this.field4713 = var9;
		this.field4704 = var3;
		this.field4704.method8182(this, this.index);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-117"
	)
	public boolean method8028() {
		return this.field4707 == 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1812723925"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4707 == 1 || this.field4705 && this.field4707 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4704.method8172(class403.field4734.field4743, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4704.method8171(this.index, var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "24291"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			AABB.method5442(var1, this.archiveDisk, this);
		} else {
			this.field4704.method8169(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1813905262"
	)
	void method8025() {
		this.field4707 = 2;
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
		garbageValue = "-81273982"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			AABB.method5442(this.index, this.masterDisk, this);
		} else {
			this.field4704.method8169(this, class403.field4734.field4743, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "2090777978"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4707 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				HitSplatDefinition.method4397(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				HitSplatDefinition.method4397(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = LoginScreenAnimation.method2400(var2, false);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltb;I[BZI)V",
		garbageValue = "1916701713"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4707 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4704.method8169(this, class403.field4734.field4743, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4704.method8169(this, class403.field4734.field4743, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(Occluder.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 < 5 || var7 > 7) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4704.method8169(this, class403.field4734.field4743, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4714) {
				this.field4707 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4710 || var4) {
					this.field4704.method8169(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || (super.groupVersions[var2] & 65535) != var6) {
				this.validGroups[var2] = false;
				if (this.field4710 || var4) {
					this.field4704.method8169(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = LoginScreenAnimation.method2400(var3, false);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1033134005"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4707 = 1;
		} else {
			this.field4714 = -1;

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

					class137.method3553();
					this.field4714 = var1;
				}
			}

			if (this.field4714 == -1) {
				this.field4707 = 1;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1136974801"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4704.method8172(this.index, var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1089666469"
	)
	public boolean method8040(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-86"
	)
	public boolean method8039(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570176546"
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
