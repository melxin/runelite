import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 741238659
	)
	static int field5030;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1599863785
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bz")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bk")
	@Export("shallowFiles")
	boolean shallowFiles;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1969481383
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("bj")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("bm")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bt")
	int[] field5028;
	@ObfuscatedName("bu")
	int[] field5029;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1716717933
	)
	int field5017;
	@ObfuscatedName("bi")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("by")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("bw")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bf")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bn")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("br")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bh")
	@Export("files")
	Object[][] files;

	static {
		field5030 = 0;
		gzipDecompressor = new GZipDecompressor();
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1511163426"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "743318851"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2093977259"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = HttpRequestTask.method294(var1, var1.length);
		Buffer var2 = new Buffer(HttpRequestTask.decompressBytes(var1));
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

				this.field5017 = var10 + 1;
				this.groupCrcs = new int[this.field5017];
				this.groupVersions = new int[this.field5017];
				this.fileCounts = new int[this.field5017];
				this.fileIds = new int[this.field5017][];
				this.groups = new Object[this.field5017];
				this.files = new Object[this.field5017][];
				if (var5) {
					this.groupNameHashes = new int[this.field5017];
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
					this.field5028 = new int[this.field5017];
					this.field5029 = new int[this.field5017];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.field5028[this.groupIds[var11]] = var2.readInt();
						this.field5029[this.groupIds[var11]] = var2.readInt();
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "269531577"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-590775437"
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

			byte[] var5 = FriendSystem.method1657(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "756705879"
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
		descriptor = "(IB)Z",
		garbageValue = "56"
	)
	public boolean method8601(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1255109178"
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1106010882"
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1248133470"
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-2053428314"
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

			byte[] var4 = FriendSystem.method1657(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "34"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1775968255"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-120"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1037357832"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field5017;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "251638033"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "105"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1255700466"
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
					var18 = FriendSystem.method1657(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				} else {
					var18 = FriendSystem.method1657(this.groups[var1], false);
				}

				byte[] var20 = HttpRequestTask.decompressBytes(var18);
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
					var11.offset = var9 * 1741769013;

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

					var11.offset = var9 * 1741769013;
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
							var5[var4[var15]] = BufferedSource.method10439(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = BufferedSource.method10439(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-23"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(Projectile.hashString(var1));
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1321621639"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(Projectile.hashString(var2));
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1726307925"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Projectile.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "2075438454"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Projectile.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-989960120"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Projectile.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1319387222"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Projectile.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "987702175"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Projectile.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "53"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Projectile.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lrl;",
		garbageValue = "-1497663406"
	)
	public static Bounds method8678(int var0, int var1, int var2, int var3) {
		synchronized(Bounds.field5229) {
			if (Bounds.field5228 == 0) {
				return new Bounds(var0, var1, var2, var3);
			} else {
				--Bounds.field5228;
				Bounds.field5229[Bounds.field5228].setLow(var0, var1);
				Bounds.field5229[Bounds.field5228].setHigh(var2, var3);
				return Bounds.field5229[Bounds.field5228];
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1259167768"
	)
	static int method8677(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
