import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ob")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 188032839
	)
	static int field4509;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 172242479
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ar")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ap")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ai")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("at")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("az")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bg")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bz")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bc")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bo")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -770698785
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bh")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bx")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4509 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1982151396"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-489947135"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2106725989"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class1.method7(var1, var1.length);
		Buffer var2 = new Buffer(BoundaryObject.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readInt();
			}

			int var4 = var2.readUnsignedByte();
			if (var3 >= 7) {
				this.groupCount = var2.readLargeSmart();
			} else {
				this.groupCount = var2.readUnsignedShort();
			}

			int var5 = 0;
			int var6 = -1;
			this.groupIds = new int[this.groupCount];
			int var7;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.readLargeSmart();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.readUnsignedShort();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1];
			this.groupVersions = new int[var6 + 1];
			this.fileCounts = new int[var6 + 1];
			this.fileIds = new int[var6 + 1][];
			this.groups = new Object[var6 + 1];
			this.files = new Object[var6 + 1][];
			if (var4 != 0) {
				this.groupNameHashes = new int[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.readLargeSmart();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			}

			if (var4 != 0) {
				this.fileNameHashes = new int[var6 + 1][];
				this.fileNameHashTables = new IntHashTable[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					this.fileNameHashes[var8] = new int[this.files[var8].length];

					for (var10 = 0; var10 < var9; ++var10) {
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1584809182"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "0"
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

			byte[] var5 = PcmPlayer.method798(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "100"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1594286423"
	)
	public boolean method7265(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "842937886"
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1631754185"
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-495653028"
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
		garbageValue = "1962582743"
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

			byte[] var4 = PcmPlayer.method798(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "1"
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
		garbageValue = "-240085745"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-77"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1870571517"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "801541537"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-394395657"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1465334810"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "120"
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
					var18 = PcmPlayer.method798(this.groups[var1], false);
				} else {
					var18 = PcmPlayer.method798(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var20 = BoundaryObject.decompressBytes(var18);
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
							var5[var4[var15]] = FloorUnderlayDefinition.method5014(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = FloorUnderlayDefinition.method5014(var20, false);
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
		garbageValue = "0"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class143.hashString(var1));
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "289172096"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class143.hashString(var2));
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "808043897"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class143.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class143.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1723804165"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class143.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class143.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-127"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class143.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class143.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1408004980"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class143.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1406780051"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class143.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1300066211"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class143.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-1209237187"
	)
	static int method7309(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
		if (var7 != -1) {
			var9[0] = new Integer(var7);
		} else {
			var9 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var9;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var9;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var9;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) {
			var3.field3928 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3921 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3922 = var9;
		} else if (var0 == 1430) {
			var3.field3917 = var9;
		} else if (var0 == 1431) {
			var3.field3838 = var9;
		} else if (var0 == 1434) {
			var3.field3929 = var9;
		} else if (var0 == 1435) {
			var3.field3913 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class356 var8 = var3.method6974();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3734 = var9;
				} else if (var0 == 1437) {
					var8.field3735 = var9;
				} else if (var0 == 1438) {
					var8.field3736 = var9;
				} else if (var0 == 1439) {
					var8.field3732 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
