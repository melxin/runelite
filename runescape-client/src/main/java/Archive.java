import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pw")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("af")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("as")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("al")
	boolean field4915;
	@ObfuscatedName("au")
	boolean field4916;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -726769123
	)
	@Export("index")
	int index;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1447802299
	)
	volatile int field4920;
	@ObfuscatedName("ar")
	boolean field4921;
	@ObfuscatedName("ae")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -41025361
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1181815205
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2035495681
	)
	int field4910;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	JagNetThread field4926;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lto;Lto;Lpk;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4915 = false;
		this.field4916 = false;
		this.field4920 = 0;
		this.field4921 = false;
		this.field4910 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4921 = var7;
		this.field4916 = var8;
		this.field4915 = var9;
		this.field4926 = var3;
		this.field4926.method8438(this, this.index);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1750148097"
	)
	public boolean method8287() {
		return this.field4920 == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1333805331"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4920 == 1 || this.field4916 && this.field4920 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4926.method8442(class410.field4947.field4954, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979975584"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4926.method8440(this.index, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "948719152"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class175.method4119(var1, this.archiveDisk, this);
		} else {
			this.field4926.method8437(this, this.index, var1, super.groupCrcs[var1], (byte)4, true);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method8290() {
		this.field4920 = 2;
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
		descriptor = "(IIB)V",
		garbageValue = "-41"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class175.method4119(this.index, this.masterDisk, this);
		} else {
			this.field4926.method8437(this, class410.field4947.field4954, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "71"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4920 == 1) {
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

				synchronized(ArchiveDiskActionHandler.field4903) {
					if (ArchiveDiskActionHandler.field4901 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4901 = 600;
				}
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 4] = (byte)(super.groupVersions[var1] >> 24);
			var2[var2.length - 3] = (byte)(super.groupVersions[var1] >> 16);
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var13 = this.archiveDisk;
				ArchiveDiskAction var18 = new ArchiveDiskAction();
				var18.type = 0;
				var18.key = (long)var1;
				var18.data = var2;
				var18.archiveDisk = var13;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18);
				}

				synchronized(ArchiveDiskActionHandler.field4903) {
					if (ArchiveDiskActionHandler.field4901 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4901 = 600;
				}

				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = class382.method8182(var2, false);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lto;I[BZI)V",
		garbageValue = "-1570337334"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4920 == 1) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.field4926.method8437(this, class410.field4947.field4954, this.index, this.indexCrc, (byte)0, true);
			} else {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length);
				var5 = (int)Archive_crc.getValue();
				if (var5 != this.indexCrc) {
					this.field4926.method8437(this, class410.field4947.field4954, this.index, this.indexCrc, (byte)0, true);
				} else {
					Buffer var9 = new Buffer(class551.decompressBytes(var3));
					int var7 = var9.readUnsignedByte();
					if (var7 < 5 || var7 > 7) {
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0;
						if (var7 >= 6) {
							var8 = var9.method1958();
						}

						if (var8 != this.indexVersion) {
							this.field4926.method8437(this, class410.field4947.field4954, this.index, this.indexCrc, (byte)0, true);
						} else {
							this.decodeIndex(var3);
							this.loadAllLocal();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field4910) {
				this.field4920 = 1;
			}

			if (var3 != null && var3.length > 2) {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length - 4);
				var5 = (int)Archive_crc.getValue();
				int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255) + ((var3[var3.length - 4] & 255) << 24) + ((var3[var3.length - 3] & 255) << 16);
				if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
					Archive_crc.reset();
					Archive_crc.update(var3, 0, var3.length - 2);
					var5 = (int)Archive_crc.getValue();
					var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				}

				if (var5 == super.groupCrcs[var2] && var6 == super.groupVersions[var2]) {
					this.validGroups[var2] = true;
					if (var4) {
						super.groups[var2] = class382.method8182(var3, false);
					}

				} else {
					this.validGroups[var2] = false;
					if (this.field4921 || var4) {
						this.field4926.method8437(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
					}

				}
			} else {
				this.validGroups[var2] = false;
				if (this.field4921 || var4) {
					this.field4926.method8437(this, this.index, var2, super.groupCrcs[var2], (byte)4, var4);
				}

			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4920 = 1;
		} else {
			this.field4910 = -1;

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

					synchronized(ArchiveDiskActionHandler.field4903) {
						if (ArchiveDiskActionHandler.field4901 == 0) {
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field4901 = 600;
					}

					this.field4910 = var1;
				}
			}

			if (this.field4910 == -1) {
				this.field4920 = 1;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "603200064"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4926.method8442(this.index, var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method8297(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method8298(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-868218566"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "2078596780"
	)
	static int method8327(int var0, Script var1, boolean var2) {
		Widget var3;
		int var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			var3 = UrlRequester.widgetDefinition.method7476(var4);
		} else {
			var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			int var15 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class366 var16 = var3.method7971();
				if (var16 != null && var16.method7859(var4, var15)) {
					class89.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var4;
				if (var3.scrollX > var3.scrollWidth - var3.width * 469894397) {
					var3.scrollX = var3.scrollWidth - var3.width * 469894397;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var15;
				if (var3.scrollY > var3.scrollHeight - var3.height * 1156037777) {
					var3.scrollY = var3.scrollHeight - var3.height * 1156037777;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class89.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			UserComparator7.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 5];
			class89.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			if (var4 != var3.sequenceId) {
				var3.sequenceId = var4;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class89.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			class89.invalidateWidget(var3);
			return 1;
		} else {
			String var17;
			class366 var18;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var17 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				if (var3.type == 12) {
					var18 = var3.method7971();
					if (var18 != null && var18.method7658()) {
						var18.method7607(var17);
					} else {
						var3.text = var17;
					}

					class89.invalidateWidget(var3);
				} else if (!var17.equals(var3.text)) {
					var3.text = var17;
					class89.invalidateWidget(var3);
				}

				return 1;
			} else {
				class366 var21;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (var3.type == 12) {
						var21 = var3.method7971();
						if (var21 != null) {
							var21.method7618();
						}
					}

					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					UserComparator7.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var21 = var3.method7971();
						if (var21 != null) {
							var21.method7865(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
							var21.method7616(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					}

					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					class89.invalidateWidget(var3);
					if (var3.type == 0) {
						Widget[] var23 = var3.childIndex * -217986249 == -1 ? UrlRequester.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : UrlRequester.widgetDefinition.method7476(var3.parentId).children;
						Canvas.revalidateWidgetScroll(var23, var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class115.resumePauseWidget(var3.id, var3.childIndex * -217986249);
					Client.meslayerContinueWidget = var3;
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class89.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					FillMode var19 = (FillMode)class173.findEnumerated(GrandExchangeEvent.FillMode_values(), var4);
					if (var19 != null) {
						var3.fillMode = var19;
						class89.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						var3.field4182 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field4185 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
						class89.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method8012((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], "", class114.urlRequester, WorldMapData_0.getUserId());
						return 1;
					} else if (var0 == 1131) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var3.method7957(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method8056((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
						return 1;
					} else {
						class360 var22;
						if (var0 == 1133) {
							--UserComparator7.Interpreter_intStackSize;
							var22 = var3.method8088();
							if (var22 != null) {
								var22.field4052 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--UserComparator7.Interpreter_intStackSize;
							var22 = var3.method8088();
							if (var22 != null) {
								var22.field4053 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--Interpreter.Interpreter_objectStackSize;
							var21 = var3.method7971();
							if (var21 != null) {
								var3.text2 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--UserComparator7.Interpreter_intStackSize;
							var22 = var3.method8088();
							if (var22 != null) {
								var22.field4055 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null && var21.method7832(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize])) {
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null && var21.method7612(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize])) {
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null && var21.method7613(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize])) {
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							Client.field598.method6085();
							var18 = var3.method7971();
							if (var18 != null && var18.method7605(var14)) {
								if (var14) {
									Client.field598.method6104(var3);
								}

								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field598.method6084() == var3) {
								Client.field598.method6085();
								class89.invalidateWidget(var3);
							}

							var18 = var3.method7971();
							if (var18 != null) {
								var18.method7606(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var21 = var3.method7971();
							if (var21 != null && var21.method7604(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1])) {
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null && var21.method7604(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize])) {
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null) {
								var21.method7667(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
								class89.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null) {
								var21.method7665(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null) {
								var21.method7716(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--UserComparator7.Interpreter_intStackSize;
							var21 = var3.method7971();
							if (var21 != null) {
								var21.method7670(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
								class89.invalidateWidget(var3);
							}

							return 1;
						} else {
							class28 var20;
							if (var0 == 1148) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var20 = var3.method7973();
								if (var20 != null) {
									var20.method417(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var20 = var3.method7973();
								if (var20 != null) {
									var20.method418((char)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method8057((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], class114.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								Interpreter.Interpreter_objectStackSize -= 3;
								var17 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
								String var13 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
								String var6 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 2];
								long var7 = WorldMapData_0.getUserId();
								long var9 = IndexCheck.getUserHash();
								String var11 = Language.getPlatformInfo().getDeviceId(Language.getPlatformInfo().os);
								if (var7 != -1L) {
									var17 = var17.replaceAll("%userid%", Long.toString(var7));
								}

								if (-1L != var9) {
									var17 = var17.replaceAll("%userhash%", Long.toString(var9));
								}

								if (!var11.isEmpty()) {
									var17 = var17.replaceAll("%deviceid%", var11);
								}

								var3.method7932(var17, var13, var6, var11, Long.toString(var9), class114.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class256 var12 = var3.method7967();
									boolean var5 = var12 != null && var12.method5821() && class259.method5905().method5992(var12.method5825());
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
									return 1;
								}
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
