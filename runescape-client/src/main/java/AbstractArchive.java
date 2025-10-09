import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1022170767
	)
	static int field5007;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1987012869
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bn")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("by")
	@Export("shallowFiles")
	boolean shallowFiles;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1334836837
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("bg")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("bu")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bq")
	int[] field5005;
	@ObfuscatedName("bo")
	int[] field5000;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1202663357
	)
	int field4990;
	@ObfuscatedName("bp")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("bz")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("bh")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bc")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bv")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[Lsl;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bw")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("br")
	@Export("files")
	Object[][] files;

	static {
		field5007 = 0;
		gzipDecompressor = new GZipDecompressor();
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-16251"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1795678785"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-28"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([BS)V",
		garbageValue = "29806"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var3; ++var6) {
			var5 = var5 >>> 8 ^ Buffer.field5981[(var5 ^ var1[var6]) & 255];
		}

		var5 = ~var5;
		this.hash = var5;
		Buffer var19 = new Buffer(ObjectComposition.decompressBytes(var1));
		var5 = var19.readUnsignedByte();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var19.readInt();
			}

			var6 = var19.readUnsignedByte();
			boolean var7 = (var6 & 1) != 0;
			boolean var8 = (var6 & 2) != 0;
			boolean var9 = (var6 & 4) != 0;
			boolean var10 = (var6 & 8) != 0;
			if (var8) {
				throw new UnsupportedOperationException("");
			} else if (var10) {
				throw new UnsupportedOperationException("");
			} else {
				if (var5 >= 7) {
					this.groupCount = var19.readLargeSmart();
				} else {
					this.groupCount = var19.readUnsignedShort();
				}

				int var11 = 0;
				int var12 = -1;
				this.groupIds = new int[this.groupCount];
				int var13;
				if (var5 >= 7) {
					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.groupIds[var13] = var11 += var19.readLargeSmart();
						if (this.groupIds[var13] > var12) {
							var12 = this.groupIds[var13];
						}
					}
				} else {
					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.groupIds[var13] = var11 += var19.readUnsignedShort();
						if (this.groupIds[var13] > var12) {
							var12 = this.groupIds[var13];
						}
					}
				}

				this.field4990 = var12 + 1;
				this.groupCrcs = new int[this.field4990];
				this.groupVersions = new int[this.field4990];
				this.fileCounts = new int[this.field4990];
				this.fileIds = new int[this.field4990][];
				this.groups = new Object[this.field4990];
				this.files = new Object[this.field4990][];
				if (var7) {
					this.groupNameHashes = new int[this.field4990];
					Arrays.fill(this.groupNameHashes, -1);

					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.groupNameHashes[this.groupIds[var13]] = var19.readInt();
					}

					this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
				}

				for (var13 = 0; var13 < this.groupCount; ++var13) {
					this.groupCrcs[this.groupIds[var13]] = var19.readInt();
				}

				if (var9) {
					this.field5005 = new int[this.field4990];
					this.field5000 = new int[this.field4990];

					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.field5005[this.groupIds[var13]] = var19.readInt();
						this.field5000[this.groupIds[var13]] = var19.readInt();
					}
				}

				for (var13 = 0; var13 < this.groupCount; ++var13) {
					this.groupVersions[this.groupIds[var13]] = var19.readInt();
				}

				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var5 >= 7) {
					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.fileCounts[this.groupIds[var13]] = var19.readLargeSmart();
					}

					for (var13 = 0; var13 < this.groupCount; ++var13) {
						var14 = this.groupIds[var13];
						var15 = this.fileCounts[var14];
						var11 = 0;
						var16 = -1;
						this.fileIds[var14] = new int[var15];

						for (var17 = 0; var17 < var15; ++var17) {
							var18 = this.fileIds[var14][var17] = var11 += var19.readLargeSmart();
							if (var18 > var16) {
								var16 = var18;
							}
						}

						this.files[var14] = new Object[var16 + 1];
					}
				} else {
					for (var13 = 0; var13 < this.groupCount; ++var13) {
						this.fileCounts[this.groupIds[var13]] = var19.readUnsignedShort();
					}

					for (var13 = 0; var13 < this.groupCount; ++var13) {
						var14 = this.groupIds[var13];
						var15 = this.fileCounts[var14];
						var11 = 0;
						var16 = -1;
						this.fileIds[var14] = new int[var15];

						for (var17 = 0; var17 < var15; ++var17) {
							var18 = this.fileIds[var14][var17] = var11 += var19.readUnsignedShort();
							if (var18 > var16) {
								var16 = var18;
							}
						}

						this.files[var14] = new Object[var16 + 1];
					}
				}

				if (var7) {
					this.fileNameHashes = new int[var12 + 1][];
					this.fileNameHashTables = new IntHashTable[var12 + 1];

					for (var13 = 0; var13 < this.groupCount; ++var13) {
						var14 = this.groupIds[var13];
						var15 = this.fileCounts[var14];
						this.fileNameHashes[var14] = new int[this.files[var14].length];
						Arrays.fill(this.fileNameHashes[var14], -1);

						for (var16 = 0; var16 < var15; ++var16) {
							var17 = this.fileIds[var14] != null ? this.fileIds[var14][var16] : var16;
							this.fileNameHashes[var14][var17] = var19.readInt();
						}

						this.fileNameHashTables[var14] = new IntHashTable(this.fileNameHashes[var14]);
					}
				}

			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1036295352"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1837519235"
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

			byte[] var5 = class284.method6399(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1663872272"
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "257005687"
	)
	public boolean method8392(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-508129685"
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2133706279"
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

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "626073590"
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1788962446"
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

			byte[] var4 = class284.method6399(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "233483883"
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1933721404"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-96"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1958626630"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field4990;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-92465191"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-65"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-712708221"
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1374298035"
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
					var18 = class284.method6399(this.groups[var1], false);
				} else {
					var18 = class284.method6399(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var20 = ObjectComposition.decompressBytes(var18);
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
							var5[var4[var15]] = SecureUrlRequester.method3587(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = SecureUrlRequester.method3587(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-768569011"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class179.hashString(var1));
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1228603470"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class179.hashString(var2));
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)Z",
		garbageValue = "11260"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class179.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class179.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1294841271"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class179.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class179.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1488579175"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class179.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class179.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-128"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class179.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1333651254"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class179.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-121"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class179.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lrz;",
		garbageValue = "22"
	)
	public static TransformationMatrix method8450() {
		synchronized(TransformationMatrix.field5231) {
			if (TransformationMatrix.field5233 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field5231[--TransformationMatrix.field5233].method9175();
				return TransformationMatrix.field5231[TransformationMatrix.field5233];
			}
		}
	}
}
