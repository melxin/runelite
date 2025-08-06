import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("ao")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 770929889
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2122069667
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1780932119
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 726618239
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-59"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3386.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 64;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1513260144"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3356 = new byte[super.planes][64][64];
		super.field3357 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class301.field3383.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1116445556"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1037282226"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1373"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1708464783"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Liz;IIIZI)V",
		garbageValue = "-2072361868"
	)
	public static void method6677(WorldView var0, SequenceDefinition var1, int var2, int var3, int var4, boolean var5) {
		if (class57.soundEffectCount < 50) {
			if (var1.field2406 != null && var1.field2406.containsKey(var2)) {
				ArrayList var6 = (ArrayList)var1.field2406.get(var2);
				if (!var6.isEmpty()) {
					int var7 = 0;
					int var9;
					int var12;
					if (var6.size() > 1) {
						int var8 = 1 + (int)(Math.random() * 100.0D);
						var9 = 0;

						for (Iterator var10 = var6.iterator(); var10.hasNext(); ++var7) {
							class209 var11 = (class209)var10.next();
							var12 = var9;
							var9 += var11.field2253;
							if (var12 <= var8 && var8 < var9) {
								break;
							}
						}

						if (var7 >= var6.size()) {
							return;
						}
					}

					class209 var14 = (class209)var6.get(var7);
					var9 = var14.field2252 & 31;
					if ((var9 <= 0 || FriendSystem.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var9 != 0 || FriendSystem.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var14 != null) {
							if (var14.field2252 == 0) {
								if (!var5) {
									return;
								}

								Calendar.method8097(var0.id, var14.field2257, 0, 0, 0, var14.field2255, var14.field2254, 0, var1.field2441);
							} else {
								int var15 = Coord.method7394(var3 - 64);
								var12 = var4 - 64;
								int var16 = var12 >> 7;
								Calendar.method8097(var0.id, var14.field2257, var15, var16, var14.field2252, var14.field2255, var14.field2254, 0, var1.field2441);
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Lvf;I)V",
		garbageValue = "-1477532044"
	)
	static void method6678(class515 var0, class570 var1) {
		class150.method3792(var0, var1, true);
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lox;III)V",
		garbageValue = "462586014"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var7 = class516.getWidgetFlags(var0);
				int var6 = var7 >> 17 & 7;
				int var8 = var6;
				Widget var4;
				int var9;
				if (var6 == 0) {
					var4 = null;
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5;
							break;
						}

						var5 = class167.widgetDefinition.method7456(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var9;
					}
				}

				Widget var10 = var4;
				if (var4 == null) {
					var10 = var0.parent;
				}

				if (var10 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var7 = class516.getWidgetFlags(var0);
					var6 = var7 >> 17 & 7;
					var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}

							var5 = class167.widgetDefinition.method7456(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var9;
						}
					}

					var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class465.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = Client.menu.menuOptionsCount - 1;
					if (var11 != -1) {
						NPCComposition.tempMenuAction = new MenuAction();
						NPCComposition.tempMenuAction.param0 = Client.menu.menuArguments1[var11];
						NPCComposition.tempMenuAction.param1 = Client.menu.menuArguments2[var11];
						NPCComposition.tempMenuAction.opcode = Client.menu.menuOpcodes[var11];
						NPCComposition.tempMenuAction.identifier = Client.menu.menuIdentifiers[var11];
						NPCComposition.tempMenuAction.itemId = Client.menu.menuItemIds[var11];
						NPCComposition.tempMenuAction.action = Client.menu.menuActions[var11];
						NPCComposition.tempMenuAction.target = Client.menu.menuTargets[var11];
						NPCComposition.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var11];
						NPCComposition.tempMenuAction.field691 = Client.menu.menuShiftClick[var11];
					}

					return;
				}
			}

		}
	}
}
