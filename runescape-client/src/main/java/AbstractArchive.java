import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1508102799
	)
	static int field4851;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1375450129
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bi")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bw")
	@Export("shallowFiles")
	boolean shallowFiles;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1932901373
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("be")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("bm")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bv")
	int[] field4860;
	@ObfuscatedName("bx")
	int[] field4863;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2064176861
	)
	int field4862;
	@ObfuscatedName("bf")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("bc")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("bd")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("br")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("ba")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lss;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bg")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bt")
	@Export("files")
	Object[][] files;

	static {
		field4851 = 0;
		gzipDecompressor = new GZipDecompressor();
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1803593603"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "436345775"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1396170113"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-948251154"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = Varps.method7383(var1, var1.length);
		Buffer var2 = new Buffer(Skills.decompressBytes(var1));
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

				this.field4862 = var10 + 1;
				this.groupCrcs = new int[this.field4862];
				this.groupVersions = new int[this.field4862];
				this.fileCounts = new int[this.field4862];
				this.fileIds = new int[this.field4862][];
				this.groups = new Object[this.field4862];
				this.files = new Object[this.field4862][];
				if (var5) {
					this.groupNameHashes = new int[this.field4862];
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
					this.field4860 = new int[this.field4862];
					this.field4863 = new int[this.field4862];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.field4860[this.groupIds[var11]] = var2.readInt();
						this.field4863[this.groupIds[var11]] = var2.readInt();
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "925392242"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1622009833"
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

			byte[] var5 = class152.method3808(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "754199132"
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2022130021"
	)
	public boolean method8338(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1353705840"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-738647294"
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-342179697"
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1300448010"
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

			byte[] var4 = class152.method3808(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-607627900"
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1379078382"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2042859672"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1790769669"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field4862;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1222563250"
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
		garbageValue = "0"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "-1650150578"
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
					var18 = class152.method3808(this.groups[var1], false);
				} else {
					var18 = class152.method3808(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.offset.length);
				}

				byte[] var20 = Skills.decompressBytes(var18);
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
					var11.field5818 = var9;

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

					var11.field5818 = var9;
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
							var5[var4[var15]] = ApproximateRouteStrategy.method802(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = ApproximateRouteStrategy.method802(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "41"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-9"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(GraphicsDefaults.hashString(var2));
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "1252911359"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(GraphicsDefaults.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1543148721"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(GraphicsDefaults.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1628996789"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(GraphicsDefaults.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-71"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "599246327"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-12197"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(GraphicsDefaults.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "-2099738222"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.field1150.method9810(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1150.method9817(var2));
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size * -549711872 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = Skills.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = WorldMapRegion.method6545(var0, var3.x, var3.y, var4, var3.vmethod2682());
					var9 -= var3.method2442();
					int var10 = var3.size * -821821440 - 64 + 60;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
