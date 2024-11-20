import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("aw")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lqb;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lji;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Lje;IIIB)V",
		garbageValue = "36"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7;
		int var8;
		int var9 = var8 = var5 << 7;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5];
		int var15 = var1.tileHeights[var3][var4 + 1][var5];
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1];
		int var17 = var1.tileHeights[var3][var4][var5 + 1];
		this.transformationMatrix.transformPoint((float)var7, (float)var14, (float)var9, this.projection);
		var7 = (int)this.projection[0];
		var14 = (int)this.projection[1];
		var9 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var11, (float)var15, (float)var8, this.projection);
		var11 = (int)this.projection[0];
		var15 = (int)this.projection[1];
		var8 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var10, (float)var16, (float)var13, this.projection);
		var10 = (int)this.projection[0];
		var16 = (int)this.projection[1];
		var13 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var6, (float)var17, (float)var12, this.projection);
		var6 = (int)this.projection[0];
		var17 = (int)this.projection[1];
		var12 = (int)this.projection[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljq;III)V",
		garbageValue = "-1019162740"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.transformationMatrix.transformPoint((float)var7, (float)var8, (float)var9, this.projection);
			var7 = (int)this.projection[0];
			var8 = (int)this.projection[1];
			var9 = (int)this.projection[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var8;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = Decimator.method1117(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lsw;",
		garbageValue = "-62"
	)
	public static AbstractSocket method5138(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F",
		garbageValue = "-1451259994"
	)
	public static float method5136(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var1 - var7) * (var4 - var3) + (var6 - var7) * (var0 - var4)) / var11;
		float var13 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var8 * var12 + var13 * var9 + var14 * var10;
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2051825902"
	)
	static final void method5137(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3676()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = Message.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class164.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
