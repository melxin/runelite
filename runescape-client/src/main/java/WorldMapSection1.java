import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1952092899
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -860455509
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1365363659
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2112240261
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1502864257
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2036461915
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "1896416407"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-739948834"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-51"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2061697618"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1979822224"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2085895626"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1971343149"
	)
	static int method6859(int var0) {
		return class27.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "114431228"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5317) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5322) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5316) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5324) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5321 < ByteArrayPool.field5325) {
				ByteArrayPool.field5328[++ByteArrayPool.field5321 - 1] = var0;
			} else {
				if (class67.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var2] && FadeInTask.ByteArrayPool_altSizeArrayCounts[var2] < class67.ByteArrayPool_arrays[var2].length) {
							class67.ByteArrayPool_arrays[var2][FadeInTask.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)Lti;",
		garbageValue = "1808539492"
	)
	public static DynamicArray method6858(String[] var0) {
		DynamicArray var1 = new DynamicArray(class574.field5824, false);
		var1.field5506 = var0;
		var1.size = var0.length * -698619497;
		var1.field5503 = var0.length;
		return var1;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-898793886"
	)
	static void method6862(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, PacketWriter.loginType);
		WorldView var6 = HealthBarUpdate.localPlayer.getWorldView();
		if (var6 == null) {
			Varcs.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.players.get((long)var3[var7]);
				if (var8 != null && var8 != HealthBarUpdate.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(var3[var7]);
						var9.packetBuffer.writeByteNeg(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3[var7]);
						var9.packetBuffer.writeByteSub(0);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				Varcs.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
