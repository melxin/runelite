import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1707816521
	)
	static int field4961;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static Task field4979;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -610906425
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bd")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ba")
	@Export("shallowFiles")
	boolean shallowFiles;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2105439429
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("bo")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("bl")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bg")
	int[] field4970;
	@ObfuscatedName("bx")
	int[] field4971;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 902128281
	)
	int field4972;
	@ObfuscatedName("bz")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("bn")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("be")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bh")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bk")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lsm;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("br")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bv")
	@Export("files")
	Object[][] files;

	static {
		field4961 = 0;
		gzipDecompressor = new GZipDecompressor();
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979975584"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "948719152"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "603200064"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1992841576"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class488.method9805(var1, var1.length);
		Buffer var2 = new Buffer(class551.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readShortSmart();
			}

			int var4 = var2.readUnsignedByte();
			boolean var5 = (var4 & 1) != 0;
			boolean var6 = (var4 & 2) != 0;
			boolean var7 = (var4 & 4) != 0;
			boolean var8 = (var4 & 8) != 0;
			if (var6) {
				throw new UnsupportedOperationException("");
			} else if (var8) {
				throw new UnsupportedOperationException("");
			} else {
				if (var3 >= 7) {
					this.groupCount = var2.readNullableLargeSmart();
				} else {
					this.groupCount = var2.readUnsignedShort();
				}

				int var9 = 0;
				int var10 = -1;
				this.groupIds = new int[this.groupCount];
				int var11;
				if (var3 >= 7) {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.groupIds[var11] = var9 += var2.readNullableLargeSmart();
						if (this.groupIds[var11] > var10) {
							var10 = this.groupIds[var11];
						}
					}
				} else {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.groupIds[var11] = var9 += var2.readUnsignedShort();
						if (this.groupIds[var11] > var10) {
							var10 = this.groupIds[var11];
						}
					}
				}

				this.field4972 = var10 + 1;
				this.groupCrcs = new int[this.field4972];
				this.groupVersions = new int[this.field4972];
				this.fileCounts = new int[this.field4972];
				this.fileIds = new int[this.field4972][];
				this.groups = new Object[this.field4972];
				this.files = new Object[this.field4972][];
				if (var5) {
					this.groupNameHashes = new int[this.field4972];
					Arrays.fill(this.groupNameHashes, -1);

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.groupNameHashes[this.groupIds[var11]] = var2.readShortSmart();
					}

					this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
				}

				for (var11 = 0; var11 < this.groupCount; ++var11) {
					this.groupCrcs[this.groupIds[var11]] = var2.readShortSmart();
				}

				if (var7) {
					this.field4970 = new int[this.field4972];
					this.field4971 = new int[this.field4972];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.field4970[this.groupIds[var11]] = var2.readShortSmart();
						this.field4971[this.groupIds[var11]] = var2.readShortSmart();
					}
				}

				for (var11 = 0; var11 < this.groupCount; ++var11) {
					this.groupVersions[this.groupIds[var11]] = var2.readShortSmart();
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (var3 >= 7) {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.fileCounts[this.groupIds[var11]] = var2.readNullableLargeSmart();
					}

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						var12 = this.groupIds[var11];
						var13 = this.fileCounts[var12];
						var9 = 0;
						var14 = -1;
						this.fileIds[var12] = new int[var13];

						for (var15 = 0; var15 < var13; ++var15) {
							var16 = this.fileIds[var12][var15] = var9 += var2.readNullableLargeSmart();
							if (var16 > var14) {
								var14 = var16;
							}
						}

						this.files[var12] = new Object[var14 + 1];
					}
				} else {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.fileCounts[this.groupIds[var11]] = var2.readUnsignedShort();
					}

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						var12 = this.groupIds[var11];
						var13 = this.fileCounts[var12];
						var9 = 0;
						var14 = -1;
						this.fileIds[var12] = new int[var13];

						for (var15 = 0; var15 < var13; ++var15) {
							var16 = this.fileIds[var12][var15] = var9 += var2.readUnsignedShort();
							if (var16 > var14) {
								var14 = var16;
							}
						}

						this.files[var12] = new Object[var14 + 1];
					}
				}

				if (var5) {
					this.fileNameHashes = new int[var10 + 1][];
					this.fileNameHashTables = new IntHashTable[var10 + 1];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						var12 = this.groupIds[var11];
						var13 = this.fileCounts[var12];
						this.fileNameHashes[var12] = new int[this.files[var12].length];
						Arrays.fill(this.fileNameHashes[var12], -1);

						for (var14 = 0; var14 < var13; ++var14) {
							var15 = this.fileIds[var12] != null ? this.fileIds[var12][var14] : var14;
							this.fileNameHashes[var12][var15] = var2.readShortSmart();
						}

						this.fileNameHashTables[var12] = new IntHashTable(this.fileNameHashes[var12]);
					}
				}

			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "0"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "65"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class200.method4403(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2046771972"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) {
				return true;
			} else if (this.groups[var1] != null) {
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "870373580"
	)
	public boolean method8381(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "83"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1957183820"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1557908280"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1800570773"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null);
				if (!var3) {
					this.loadGroup(var1);
					var3 = this.buildFiles(var1, (int[])null);
					if (!var3) {
						return null;
					}
				}
			}

			byte[] var4 = class200.method4403(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1775609491"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1830862682"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1774572236"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1820206791"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field4972;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "676566421"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-34"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1223532830"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) {
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-58"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1];
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7) {
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var18;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
					var18 = class200.method4403(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.field5916.length);
				} else {
					var18 = class200.method4403(this.groups[var1], false);
				}

				byte[] var20 = class551.decompressBytes(var18);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var20.length;
					--var9;
					int var10 = var20[var9] & 255;
					var9 -= var10 * var3 * 4;
					Buffer var11 = new Buffer(var20);
					int[] var12 = new int[var3];
					var11.array = var9 * -290410379;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readShortSmart();
							var12[var15] += var14;
						}
					}

					byte[][] var19 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var19[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.array = var9 * -290410379;
					var14 = 0;

					for (var15 = 0; var15 < var10; ++var15) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; ++var17) {
							var16 += var11.readShortSmart();
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var5[var4[var15]] = class382.method8182(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = class382.method8182(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1022700798"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class141.hashString(var1));
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)I",
		garbageValue = "-756"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class141.hashString(var2));
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-7"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class141.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class141.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "2027512969"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class141.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class141.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-92"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class141.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class141.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class141.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1690689417"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class141.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "126"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class141.hashString(var1));
		return this.groupLoadPercent(var2);
	}
}
