import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static JagNetThread field3418;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 805003913
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aq")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)Lxi;",
		garbageValue = "222"
	)
	public static PrivateChatMode method6780(int var0) {
		PrivateChatMode[] var1 = class558.method10860();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field6073) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Llh;",
		garbageValue = "2077012818"
	)
	static WorldMapSectionType[] method6777() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfk;",
		garbageValue = "-1514668502"
	)
	static class140[] method6781() {
		return new class140[]{class140.field1704, class140.field1694, class140.field1695, class140.field1693, class140.field1697, class140.field1698, class140.field1711, class140.field1700, class140.field1701, class140.field1712, class140.field1703, class140.field1696, class140.field1705, class140.field1706, class140.field1707, class140.field1708, class140.field1709};
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lwv;B)Ljava/lang/Object;",
		garbageValue = "-123"
	)
	static Object method6775(class574 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5819) {
			case 0:
				return Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			case 1:
				return Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "-26119"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field367;
		} else if (var5 >= 100) {
			var6 = Client.field368;
		} else {
			var6 = (Client.field368 - Client.field367) * var5 / 100 + Client.field367;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field419) {
			var18 = Client.field419;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field364) {
				var6 = Client.field364;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field382) {
			var18 = Client.field382;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field371) {
				var6 = Client.field371;
				var8 = var18 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var11 * var16 / 256;
				var17[var9] = var13 * var14 >> 16;
			}

			class333.topLevelWorldView.scene.method5152(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "607449571"
	)
	public static void method6782(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = UserComparator6.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShortAdd(var0);
		var4.packetBuffer.writeByteNeg(var2);
		var4.packetBuffer.writeInt(var3 ? Client.field486 : 0);
		var4.packetBuffer.writeShortAddLE(var1);
		Client.packetWriter.addNode(var4);
	}
}
