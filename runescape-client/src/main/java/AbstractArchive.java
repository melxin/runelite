import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1347197305
	)
	static int field4701;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2033918989
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ap")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("al")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bo")
	int[] field4696;
	@ObfuscatedName("bs")
	int[] field4697;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -36821891
	)
	int field4698;
	@ObfuscatedName("bt")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("ba")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("bg")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bv")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bk")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[Lsc;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("by")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bh")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -307279267
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bq")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bx")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4701 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean vmethod7631() {
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "506087866"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-796953421"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "8"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = FriendsChat.method9113(var1, var1.length);
		Buffer var2 = new Buffer(class302.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readInt();
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
					this.groupCount = var2.readLargeSmart();
				} else {
					this.groupCount = var2.readUnsignedShort();
				}

				int var9 = 0;
				int var10 = -1;
				this.groupIds = new int[this.groupCount];
				int var11;
				if (var3 >= 7) {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.groupIds[var11] = var9 += var2.readLargeSmart();
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

				this.field4698 = var10 + 1;
				this.groupCrcs = new int[this.field4698];
				this.groupVersions = new int[this.field4698];
				this.fileCounts = new int[this.field4698];
				this.fileIds = new int[this.field4698][];
				this.groups = new Object[this.field4698];
				this.files = new Object[this.field4698][];
				if (var5) {
					this.groupNameHashes = new int[this.field4698];
					Arrays.fill(this.groupNameHashes, -1);

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.groupNameHashes[this.groupIds[var11]] = var2.readInt();
					}

					this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
				}

				for (var11 = 0; var11 < this.groupCount; ++var11) {
					this.groupCrcs[this.groupIds[var11]] = var2.readInt();
				}

				if (var7) {
					this.field4696 = new int[this.field4698];
					this.field4697 = new int[this.field4698];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.field4696[this.groupIds[var11]] = var2.readInt();
						this.field4697[this.groupIds[var11]] = var2.readInt();
					}
				}

				for (var11 = 0; var11 < this.groupCount; ++var11) {
					this.groupVersions[this.groupIds[var11]] = var2.readInt();
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (var3 >= 7) {
					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.fileCounts[this.groupIds[var11]] = var2.readLargeSmart();
					}

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						var12 = this.groupIds[var11];
						var13 = this.fileCounts[var12];
						var9 = 0;
						var14 = -1;
						this.fileIds[var12] = new int[var13];

						for (var15 = 0; var15 < var13; ++var15) {
							var16 = this.fileIds[var12][var15] = var9 += var2.readLargeSmart();
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
							this.fileNameHashes[var12][var15] = var2.readInt();
						}

						this.fileNameHashTables[var12] = new IntHashTable(this.fileNameHashes[var12]);
					}
				}

			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "972821786"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1268467027"
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

			byte[] var5 = PlayerUpdateManager.method2996(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1771707553"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-509064331"
	)
	public boolean method7636(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-306991493"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-360873197"
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1655856989"
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

			byte[] var4 = PlayerUpdateManager.method2996(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1714229767"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-81"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-15"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1631845818"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field4698;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "14"
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
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var18 = PlayerUpdateManager.method2996(this.groups[var1], false);
				} else {
					var18 = PlayerUpdateManager.method2996(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var20 = class302.decompressBytes(var18);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var20.length;
					--var9;
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4;
					Buffer var11 = new Buffer(var20);
					int[] var12 = new int[var3];
					var11.offset = var9;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var19 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var19[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.offset = var9;
					var14 = 0;

					for (var15 = 0; var15 < var10; ++var15) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; ++var17) {
							var16 += var11.readInt();
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var5[var4[var15]] = class447.method8504(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = class447.method8504(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-46"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(Calendar.hashString(var1));
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1299382151"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(Calendar.hashString(var2));
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-261208157"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Calendar.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(Calendar.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1416331319"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Calendar.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Calendar.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "2037278670"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Calendar.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Calendar.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "55"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Calendar.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-105"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Calendar.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1858874228"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Calendar.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lrp;",
		garbageValue = "-925251998"
	)
	static class442 method7634() {
		synchronized(class442.field4894) {
			if (class187.field1997 == 0) {
				return new class442();
			} else {
				class442.field4894[--class187.field1997].method8331();
				return class442.field4894[class187.field1997];
			}
		}
	}
}
