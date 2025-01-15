import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ok")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("as")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2139342699
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1662195143
	)
	volatile int field4537;
	@ObfuscatedName("ac")
	boolean field4538;
	@ObfuscatedName("au")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1014943143
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2065943831
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1727520787
	)
	int field4531;
	@ObfuscatedName("ak")
	boolean field4544;
	@ObfuscatedName("al")
	boolean field4545;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	JagNetThread field4546;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;Lpa;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4537 = 0;
		this.field4538 = false;
		this.field4531 = -1;
		this.field4544 = false;
		this.field4545 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4538 = var7;
		this.field4544 = var8;
		this.field4545 = var9;
		this.field4546 = var3;
		this.field4546.method7825(this, this.index);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1720456553"
	)
	public boolean method7674() {
		return this.field4537 == 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4537 == 1 || this.field4544 && this.field4537 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4546.method7831(class389.field4550.field4567, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1455866633"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4546.method7828(this.index, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "20201"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			KeyHandler.method401(var1, this.archiveDisk, this);
		} else {
			this.field4546.method7827(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "9665"
	)
	void method7678() {
		this.field4537 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2080316251"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			KeyHandler.method401(this.index, this.masterDisk, this);
		} else {
			this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-954013354"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4537 == 1) {
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

				synchronized(ArchiveDiskActionHandler.field4530) {
					if (ArchiveDiskActionHandler.field4526 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4526 = 600;
				}
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				Actor.method2784(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var11 = super.groups;
				Object var15;
				if (var2 == null) {
					var15 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var15 = var8;
				} else {
					var15 = var2;
				}

				var11[var1] = var15;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsh;I[BZB)V",
		garbageValue = "-61"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4537 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(TaskHandler.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 < 5 || var12 > 7) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4531) {
				this.field4537 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4538 || var4) {
					this.field4546.method7827(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4538 || var4) {
					this.field4546.method7827(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-914427665"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4537 = 1;
		} else {
			this.field4531 = -1;

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

					synchronized(ArchiveDiskActionHandler.field4530) {
						if (ArchiveDiskActionHandler.field4526 == 0) {
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field4526 = 600;
					}

					this.field4531 = var1;
				}
			}

			if (this.field4531 == -1) {
				this.field4537 = 1;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-78"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4546.method7831(this.index, var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1285921286"
	)
	public boolean method7720(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1818002973"
	)
	public boolean method7684(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "187981839"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "1"
	)
	static int method7721(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = GameEngine.topLevelWorldView.plane;
			int var15 = (ModeWhere.localPlayer.x >> 7) + GameEngine.topLevelWorldView.baseX;
			int var8 = (ModeWhere.localPlayer.y >> 7) + GameEngine.topLevelWorldView.baseY;
			Canvas.getWorldMap().method9730(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				String var16 = "";
				var9 = Canvas.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Canvas.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Canvas.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
					Canvas.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
					Canvas.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
					Canvas.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
					Canvas.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = Canvas.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = Canvas.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = Canvas.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = Canvas.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = Canvas.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
						var11 = Canvas.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
							var11 = Canvas.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
								class88.method2612(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
								class88.method2612(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
								var9 = Canvas.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
								var11 = Canvas.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								Canvas.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								Canvas.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								Canvas.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								Canvas.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
									Canvas.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
									Canvas.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
									Canvas.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									Canvas.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
									Canvas.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										ScriptFrame.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
										Canvas.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										ScriptFrame.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
										Canvas.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										ScriptFrame.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
										var5 = Canvas.getWorldMap().method9775(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = Canvas.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = Canvas.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
												var4 = class31.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
												var4 = class31.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
												var4 = class31.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
												var4 = class31.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "789896050"
	)
	static final void method7701(int var0) {
		int[] var1 = class174.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((GameEngine.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					GameEngine.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (GameEngine.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					GameEngine.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class174.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((GameEngine.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					FriendSystem.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (GameEngine.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					FriendSystem.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = GameEngine.topLevelWorldView.scene.getFloorDecorationTag(GameEngine.topLevelWorldView.plane, var5, var6);
				if (var7 != 0L) {
					int var9 = class360.Entity_unpackID(var7);
					int var10 = class142.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class31.WorldMapElement_get(var10).field2530) {
						Client.mapIcons[Client.mapIconCount] = class31.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		class6.rasterProvider.apply();
	}
}
