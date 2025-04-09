import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 971369453
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1679094291
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2017597401
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1099651673
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-967859595"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3312.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1112243034"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3281 = new byte[super.planes][64][64];
		super.field3278 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class300.field3305.value) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "281619914"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1559817261"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "177949956"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-1098"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) {
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1891167306"
	)
	static final String method6224(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)I",
		garbageValue = "1834362728"
	)
	static int method6203(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var0.method7368(var1);
			return 1;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lvu;B)V",
		garbageValue = "-8"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		int var4;
		if (var2 < var0.field1352.method9060()) {
			for (int var3 = var2; var3 < var0.field1352.method9060(); ++var3) {
				var4 = var0.field1352.method9056(var3);
				PlayerType.method7586(var4);
				WorldEntity var28 = (WorldEntity)var0.worldEntities.get((long)var4);
				if (var28 != null) {
					var28.remove();
				}
			}
		}

		if (var2 > var0.field1352.method9060()) {
			throw new RuntimeException("");
		} else {
			var0.field1352.method9058();
			WorldEntityCoord var19 = new WorldEntityCoord();

			int var5;
			int var7;
			int var13;
			for (var4 = 0; var4 < var2; ++var4) {
				var5 = var0.field1352.method9056(var4);
				WorldEntity var21 = (WorldEntity)var0.worldEntities.get((long)var5);
				var7 = var1.readUnsignedByte();
				if (var7 == 0) {
					PlayerType.method7586(var5);
					if (var21 != null) {
						var21.remove();
					}
				} else {
					var0.field1352.method9064(var5);
					if (var7 != 1) {
						var19.method5807(var21.method9335());
						byte var8 = var1.readByte();
						if (var8 != 0) {
							int var22 = var8 >> 0 & 3;
							int var23;
							if (var22 == 3) {
								var23 = var1.readInt();
							} else if (var22 == 2) {
								var23 = var1.readShort();
							} else if (var22 == 1) {
								var23 = var1.readByte();
							} else {
								var23 = 0;
							}

							int var24 = var8 >> 2 & 3;
							int var25;
							if (var24 == 3) {
								var25 = var1.readInt();
							} else if (var24 == 2) {
								var25 = var1.readShort();
							} else if (var24 == 1) {
								var25 = var1.readByte();
							} else {
								var25 = 0;
							}

							int var26 = var8 >> 4 & 3;
							if (var26 == 3) {
								var13 = var1.readInt();
							} else if (var26 == 2) {
								var13 = var1.readShort();
							} else if (var26 == 1) {
								var13 = var1.readByte();
							} else {
								var13 = 0;
							}

							int var16 = var8 >> 6 & 3;
							int var27;
							if (var16 == 3) {
								var27 = var1.readInt();
							} else if (var16 == 2) {
								var27 = var1.readShort();
							} else if (var16 == 1) {
								var27 = var1.readByte();
							} else {
								var27 = 0;
							}

							var19.method5839(var23, var25, var13, var27);
						}

						if (var7 == 2) {
							var21.method9342(var19);
						} else {
							var21.method9343(var19);
						}
					}
				}
			}

			while (var1.method10246(Client.packetWriter.serverPacketLength) >= 10) {
				var4 = var1.readUnsignedShort();
				var0.field1352.method9064(var4);
				var5 = var1.readUnsignedByte();
				int var6 = var1.readUnsignedByte();
				var7 = var5 * 8;
				int var29 = var6 * 8;
				WorldView var9 = Client.worldViewManager.method2591(var4, var7, var29, Renderable.clientPreferences.getDrawDistance(), class173.field1878);
				WorldEntity var10 = new WorldEntity(var4, var9);
				var0.worldEntities.put(var10, (long)var4);
				var10.plane = var4;
				var10.field5162 = var0.id;
				var13 = var1.readUnsignedShort();
				class254 var14 = (class254)class254.field2801.get((long)var13);
				class254 var12;
				if (var14 != null) {
					var12 = var14;
				} else {
					byte[] var15 = Skills.field4161.takeFile(72, var13);
					var14 = new class254();
					if (var15 != null) {
						var14.method5291(new Buffer(var15));
					}

					class254.field2801.put(var14, (long)var13);
					var12 = var14;
				}

				var10.method9336(var12);
				WorldEntityCoord var30 = var10.worldEntityCoord;
				byte var31 = 0;
				byte var18 = 0;
				var30.method5815(var31, var18);
				var30.setZ(0);
				var30.setCurrentRotationAngle(0);
				Clock.method4979(var1, var30);
				var10.method9342(var10.worldEntityCoord);
				class386[] var20 = new class386[]{class386.field4571, class386.field4570, class386.TOKEN};
				var10.method9338((class386)ArchiveDiskActionHandler.findEnumerated(var20, var1.readUnsignedByte()));
			}

		}
	}
}
