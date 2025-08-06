import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("as")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static Model field4803;
	@ObfuscatedName("ah")
	boolean field4812;
	@ObfuscatedName("ap")
	boolean field4804;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 66952881
	)
	@Export("index")
	int index;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -104840795
	)
	volatile int field4810;
	@ObfuscatedName("aa")
	boolean field4798;
	@ObfuscatedName("ai")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -901939377
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 266293331
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 535069413
	)
	int field4813;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	JagNetThread field4814;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Ltp;Ltp;Lpt;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4812 = false;
		this.field4804 = false;
		this.field4810 = 0;
		this.field4798 = false;
		this.field4813 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4798 = var7;
		this.field4804 = var8;
		this.field4812 = var9;
		this.field4814 = var3;
		this.field4814.method8449(this, this.index);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-637303961"
	)
	public boolean method8285() {
		return this.field4810 == 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "536382486"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4810 == 1 || this.field4804 && this.field4810 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4814.method8482(class406.field4821.field4820, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1803593603"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4814.method8452(this.index, var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "436345775"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class180.method4149(var1, this.archiveDisk, this);
		} else {
			this.field4814.method8451(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996512475"
	)
	void method8289() {
		this.field4810 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1484972332"
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
			this.field4814.method8451(this, class406.field4821.field4820, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "772322779"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4810 == 1) {
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

				HealthBarDefinition.method4257();
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

				HealthBarDefinition.method4257();
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = ApproximateRouteStrategy.method802(var2, false);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltp;I[BZI)V",
		garbageValue = "648799585"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4810 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4814.method8451(this, class406.field4821.field4820, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4814.method8451(this, class406.field4821.field4820, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(Skills.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 < 5 || var7 > 7) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4814.method8451(this, class406.field4821.field4820, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4813) {
				this.field4810 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4798 || var4) {
					this.field4814.method8451(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || (super.groupVersions[var2] & 65535) != var6) {
				this.validGroups[var2] = false;
				if (this.field4798 || var4) {
					this.field4814.method8451(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = ApproximateRouteStrategy.method802(var3, false);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4810 = 1;
		} else {
			this.field4813 = -1;

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

					HealthBarDefinition.method4257();
					this.field4813 = var1;
				}
			}

			if (this.field4813 == -1) {
				this.field4810 = 1;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1396170113"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4814.method8482(this.index, var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "3385"
	)
	public boolean method8304(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-676571631"
	)
	public boolean method8290(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "335023623"
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

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V",
		garbageValue = "0"
	)
	static void method8323(WorldView var0) {
		if (Client.combatTargetPlayerIndex >= 0 && var0.players.get((long)Client.combatTargetPlayerIndex) != null) {
			InvDefinition.addPlayerToScene(var0, Client.combatTargetPlayerIndex, false);
		}

	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lbk;III)V",
		garbageValue = "1326880253"
	)
	static final void method8326(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class141.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
