import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aq")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("av")
	boolean field4672;
	@ObfuscatedName("am")
	boolean field4669;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1537287307
	)
	@Export("index")
	int index;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 845112683
	)
	volatile int field4676;
	@ObfuscatedName("ar")
	boolean field4673;
	@ObfuscatedName("au")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1052479073
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 307865929
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1797276681
	)
	int field4682;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	JagNetThread field4683;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;Lpu;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4672 = false;
		this.field4669 = false;
		this.field4676 = 0;
		this.field4673 = false;
		this.field4682 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4673 = var7;
		this.field4669 = var8;
		this.field4672 = var9;
		this.field4683 = var3;
		this.field4683.method7788(this, this.index);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1514607267"
	)
	public boolean method7630() {
		return this.field4676 == 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-13661"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4676 == 1 || this.field4669 && this.field4676 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4683.method7817(class400.field4706.field4712, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "112"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4683.method7791(this.index, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-184654211"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ReflectionCheck.method713(var1, this.archiveDisk, this);
		} else {
			this.field4683.method7790(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	void method7633() {
		this.field4676 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "581156974"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			ReflectionCheck.method713(this.index, this.masterDisk, this);
		} else {
			this.field4683.method7790(this, class400.field4706.field4712, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "-18"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4676 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				UserComparator7.method3222(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				UserComparator7.method3222(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var5 = super.groups;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lti;I[BZI)V",
		garbageValue = "504071990"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4676 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4683.method7790(this, class400.field4706.field4712, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4683.method7790(this, class400.field4706.field4712, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(AABB.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 < 5 || var12 > 7) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4683.method7790(this, class400.field4706.field4712, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4682) {
				this.field4676 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4673 || var4) {
					this.field4683.method7790(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4673 || var4) {
					this.field4683.method7790(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				Object[] var7 = super.groups;
				Object var9;
				if (var3 == null) {
					var9 = null;
				} else if (var3.length > 136) {
					DirectByteArrayCopier var10 = new DirectByteArrayCopier();
					var10.set(var3);
					var9 = var10;
				} else {
					var9 = var3;
				}

				var7[var2] = var9;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1210183610"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4676 = 1;
		} else {
			this.field4682 = -1;

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

					synchronized(ArchiveDiskActionHandler.field4664) {
						if (ArchiveDiskActionHandler.field4668 == 0) {
							GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.setDaemon(true);
							GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.start();
							GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field4668 = 600;
					}

					this.field4682 = var1;
				}
			}

			if (this.field4682 == -1) {
				this.field4676 = 1;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-799870731"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4683.method7817(this.index, var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1770133694"
	)
	public boolean method7639(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "949886921"
	)
	public boolean method7664(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1749319795"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "40"
	)
	public static int method7679(int var0) {
		return class520.field5297[var0 & 2047];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lde;",
		garbageValue = "1849131944"
	)
	static class92[] method7678() {
		return new class92[]{class92.field1116, class92.field1117, class92.field1114, class92.field1119, class92.field1115, class92.field1123, class92.field1113};
	}
}
