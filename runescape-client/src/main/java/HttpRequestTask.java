import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final HttpRequest field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Lau;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field75 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field75.connect()) {
				LoginState.method841(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field75.getResponse();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;BII)I",
		garbageValue = "-1960684968"
	)
	public static int method291(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;I)Lxm;",
		garbageValue = "1939176022"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return HitSplatDefinition.method4769(var0, var3, var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1759377449"
	)
	static int method292(int var0, int var1, int var2) {
		return var1 >= var2 ? var0 : (int)((float)var0 * ((float)var1 / (float)var2));
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1733044161"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field5030 != 0 && var3 > AbstractArchive.field5030) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field5030 == 0 || var4 <= AbstractArchive.field5030)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "60"
	)
	public static int method294(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field6017[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-685537587"
	)
	static final void method290() {
		if (Skills.pcmPlayer1 != null) {
			Skills.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;I)V",
		garbageValue = "-1186579790"
	)
	static void method289(int var0, int var1, int var2, int var3, Object[] var4) {
		boolean var5 = false;
		Widget var6 = class226.widgetDefinition.getWidgetChild(var0, var1);
		if (var5 || var6 != null) {
			if (var5 || class339.method7287(class191.getWidgetFlags(var6))) {
				PacketBufferNode var7 = ReflectionCheck.getPacketBufferNode(ClientPacket.IF_RUNSCRIPT, Client.packetWriter.isaacCipher);
				var7.packetBuffer.writeShort(0);
				int var8 = var7.packetBuffer.offset * 2108391709;
				var7.packetBuffer.writeIntLE(var3);
				var7.packetBuffer.writeShortLE(var1);
				var7.packetBuffer.writeIntLE(var0);
				var7.packetBuffer.writeShortLE(var2);
				Object[] var9 = var4;

				for (int var10 = 0; var10 < var9.length; ++var10) {
					Object var11 = var9[var10];
					if (var11 instanceof Integer) {
						var7.packetBuffer.method11623((Integer)var11);
					} else if (var11 instanceof String) {
						var7.packetBuffer.writeStringCp1252NullTerminated((String)var11);
					} else if (var11 instanceof DynamicArray) {
						DynamicArray var12 = (DynamicArray)var11;
						int var13 = var12.method10652();
						var7.packetBuffer.writeSmartByteShort(var13);
						int var15;
						if (var12.field5584 == class586.field5937) {
							int[] var16 = var12.method10650();

							for (var15 = 0; var15 < var13; ++var15) {
								var7.packetBuffer.method11623(var16[var15]);
							}
						} else {
							Object[] var14 = var12.method10681();

							for (var15 = 0; var15 < var13; ++var15) {
								var7.packetBuffer.writeStringCp1252NullTerminated((String)var14[var15]);
							}
						}
					} else if (var11 == null) {
						var7.packetBuffer.writeByte(0);
					}
				}

				var7.packetBuffer.writeLengthShort(var7.packetBuffer.offset * 2108391709 - var8);
				Client.packetWriter.addNode(var7);
			}
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "659493871"
	)
	static boolean method288(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class524 var2 = Client.worldViewManager.method2399(var0);
		WorldEntity var3 = (WorldEntity)Client.worldViewManager.method2394().worldEntities.get((long)var0);
		boolean var4 = var0 == -1;
		boolean var5 = var0 == Client.currentWorldViewId;
		boolean var6 = false;
		boolean var8;
		if (var3 != null) {
			var6 = var3.method10495() != class400.field4844;
			if (!var5) {
				class386 var7 = var3.field5538.method4621();
				var8 = var1 == 1002 || var1 == 1003 || var1 == 1004 || var1 == 1013;
				if (var8 && !var7.field4425) {
					return false;
				}

				boolean var10 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
				boolean var11 = var10;
				boolean var12;
				if (!var10) {
					var12 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
					var11 = var12;
				}

				var12 = var11;
				boolean var13;
				if (!var11) {
					var13 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
					var12 = var13;
				}

				var13 = var12;
				if (!var12) {
					boolean var14 = var1 >= 61 && var1 <= 67;
					var13 = var14;
				}

				if (var13 && !var7.field4420) {
					return false;
				}
			}
		}

		boolean var15 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
		if (var15 && !var2.method10633(var6, var4, var5)) {
			return false;
		} else {
			var8 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
			if (var8 && !var2.method10613(var6, var4, var5)) {
				return false;
			} else {
				boolean var9 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
				if (var9 && !var2.method10609(var6, var4, var5)) {
					return false;
				} else if (class172.method4221(var1) && !var2.method10610(var6, var4, var5)) {
					return false;
				} else if (var1 == 1002 && !var2.method10607(var6, var4, var5)) {
					return false;
				} else if (var1 == 1004 && !var2.method10604(var6, var4, var5)) {
					return false;
				} else {
					return var1 != 1003 || var2.method10629(var6, var4, var5);
				}
			}
		}
	}
}
