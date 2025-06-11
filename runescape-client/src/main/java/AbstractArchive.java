import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -902707759
	)
	static int field4752;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -915044739
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bl")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bi")
	@Export("shallowFiles")
	boolean shallowFiles;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1059772769
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("bq")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("bm")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("bo")
	int[] field4761;
	@ObfuscatedName("bw")
	int[] field4762;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2055100273
	)
	int field4763;
	@ObfuscatedName("bj")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("bt")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("bd")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bs")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bn")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[Lsz;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bg")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bb")
	@Export("files")
	Object[][] files;

	static {
		field4752 = 0;
		gzipDecompressor = new GZipDecompressor();
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "24291"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1136974801"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-25227767"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class339.method7103(var1, var1.length);
		Buffer var2 = new Buffer(Occluder.decompressBytes(var1));
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

				this.field4763 = var10 + 1;
				this.groupCrcs = new int[this.field4763];
				this.groupVersions = new int[this.field4763];
				this.fileCounts = new int[this.field4763];
				this.fileIds = new int[this.field4763][];
				this.groups = new Object[this.field4763];
				this.files = new Object[this.field4763][];
				if (var5) {
					this.groupNameHashes = new int[this.field4763];
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
					this.field4761 = new int[this.field4763];
					this.field4762 = new int[this.field4763];

					for (var11 = 0; var11 < this.groupCount; ++var11) {
						this.field4761[this.groupIds[var11]] = var2.readInt();
						this.field4762[this.groupIds[var11]] = var2.readInt();
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-138984167"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "-32"
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

			byte[] var5 = StructComposition.method4358(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-125534129"
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

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method8075(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1023999147"
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1394886153"
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
		garbageValue = "-336057916"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1626650413"
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

			byte[] var4 = StructComposition.method4358(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-995109373"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "96"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1777475009"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.field4763;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-331710576"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2059199031"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1164779088"
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "988786160"
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
					var18 = StructComposition.method4358(this.groups[var1], false);
				} else {
					var18 = StructComposition.method4358(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var20 = Occluder.decompressBytes(var18);
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
							var5[var4[var15]] = LoginScreenAnimation.method2400(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = LoginScreenAnimation.method2400(var20, false);
				} else {
					var5[var4[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-78"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class191.hashString(var1));
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-1344474253"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class191.hashString(var2));
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "2005102300"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class191.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class191.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-841497815"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class191.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class191.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1066816098"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class191.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class191.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-4"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class191.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "45"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class191.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-11615509"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class191.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V",
		garbageValue = "-860879115"
	)
	static final void method8164(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1085 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = VarpDefinition.SequenceDefinition_get(var0.sequence);
				if (var0.field1048 > 0 && var1.field2341 == 0) {
					++var0.field1085;
					return;
				}

				if (var0.field1048 <= 0 && var1.field2366 == 0) {
					++var0.field1085;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.size * -343670784 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.size * -343670784 + var0.pathY[var0.pathLength - 1] * 128;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			MoveSpeed var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1079 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1085;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1085;
					}
				}

				if (var5 == MoveSpeed.field3119) {
					var8 <<= 1;
				} else if (var5 == MoveSpeed.field3117) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1043 != -1) {
						var0.movementSequence = var0.field1043;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1052 != -1) {
						var0.movementSequence = var0.field1052;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1045 != -1) {
						var0.movementSequence = var0.field1045;
					}
				} else if (var8 <= 2) {
					if (var0.movementSequence == var0.walkSequence && var0.field1046 != -1) {
						var0.movementSequence = var0.field1046;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1047 != -1) {
						var0.movementSequence = var0.field1047;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1074 != -1) {
						var0.movementSequence = var0.field1074;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1038 != -1) {
						var0.movementSequence = var0.field1038;
					}
				}

				if (var10 != var3 || var2 != var4) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1048 > 0) {
						--var0.field1048;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1048 > 0) {
					--var0.field1048;
				}

			}
		}
	}
}
