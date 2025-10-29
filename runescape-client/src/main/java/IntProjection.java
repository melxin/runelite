import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1728789787
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1473847235
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1313245843
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1734369933
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -881129575
	)
	@Export("cameraYaw2")
	int cameraYaw2;
	@ObfuscatedName("aj")
	@Export("pitchSin")
	float pitchSin;
	@ObfuscatedName("ak")
	@Export("pitchCos")
	float pitchCos;
	@ObfuscatedName("aw")
	@Export("yawSin")
	float yawSin;
	@ObfuscatedName("ap")
	@Export("yawCos")
	float yawCos;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -996485637
	)
	int field2809;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -917731727
	)
	int field2810;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw2 = var5;
		this.pitchSin = Rasterizer3D.field2798[var4];
		this.pitchCos = Rasterizer3D.field2791[var4];
		this.yawSin = Rasterizer3D.field2798[var5];
		this.yawCos = Rasterizer3D.field2791[var5];
		this.field2809 = var6;
		this.field2810 = var7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5939(var2, this.cameraPitch, this.cameraYaw2, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2809, this.field2810, false);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkz;IIII)V",
		garbageValue = "-436402298"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		if (Rasterizer3D.clips.field3150 != 1) {
			float var6;
			float var7 = var6 = (float)((var4 << 7) - this.cameraX);
			float var8;
			float var9 = var8 = (float)((var5 << 7) - this.cameraZ);
			float var10;
			float var11 = var10 = 128.0F + var7;
			float var12;
			float var13 = var12 = 128.0F + var9;
			float var14 = (float)(var1.tileHeights[var3][var4][var5] - this.cameraY);
			float var15 = (float)(var1.tileHeights[var3][var4 + 1][var5] - this.cameraY);
			float var16 = (float)(var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY);
			float var17 = (float)(var1.tileHeights[var3][var4][var5 + 1] - this.cameraY);
			float var18 = var7 * this.yawCos + this.yawSin * var9;
			var9 = this.yawCos * var9 - this.yawSin * var7;
			var7 = var18;
			var18 = this.pitchCos * var14 - var9 * this.pitchSin;
			var9 = var9 * this.pitchCos + this.pitchSin * var14;
			var14 = var18;
			if (var9 >= 50.0F) {
				var18 = this.yawSin * var8 + var11 * this.yawCos;
				var8 = var8 * this.yawCos - var11 * this.yawSin;
				var11 = var18;
				var18 = this.pitchCos * var15 - var8 * this.pitchSin;
				var8 = var15 * this.pitchSin + this.pitchCos * var8;
				var15 = var18;
				if (var8 >= 50.0F) {
					var18 = var13 * this.yawSin + var10 * this.yawCos;
					var13 = this.yawCos * var13 - this.yawSin * var10;
					var10 = var18;
					var18 = var16 * this.pitchCos - this.pitchSin * var13;
					var13 = this.pitchCos * var13 + var16 * this.pitchSin;
					var16 = var18;
					if (var13 >= 50.0F) {
						var18 = this.yawSin * var12 + var6 * this.yawCos;
						var12 = this.yawCos * var12 - var6 * this.yawSin;
						var6 = var18;
						var18 = var17 * this.pitchCos - var12 * this.pitchSin;
						var12 = this.pitchSin * var17 + this.pitchCos * var12;
						if (var12 >= 50.0F) {
							this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkr;III)V",
		garbageValue = "-656009185"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		if (Rasterizer3D.clips.field3150 != 1) {
			int var5 = var2.vertexX.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				float var7 = (float)(var2.vertexX[var6] - this.cameraX);
				float var8 = (float)(var2.vertexY[var6] - this.cameraY);
				float var9 = (float)(var2.vertexZ[var6] - this.cameraZ);
				float var10 = this.yawSin * var9 + this.yawCos * var7;
				var9 = var9 * this.yawCos - this.yawSin * var7;
				var7 = var10;
				var10 = this.pitchCos * var8 - var9 * this.pitchSin;
				var9 = this.pitchSin * var8 + this.pitchCos * var9;
				if (var9 < 50.0F) {
					return;
				}

				if (var2.triangleTextureId != null) {
					SceneTileModel.triangleTexturesX[var6] = (int)var7;
					SceneTileModel.triangleTexturesY[var6] = (int)var10;
					SceneTileModel.triangleTexturesZ[var6] = (int)var9;
				}

				SceneTileModel.verticesX[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesY[var6] = (float)Rasterizer3D.getClipMidY() + var10 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesZ[var6] = WorldMapSectionType.method6970(var9);
			}

			this.drawSceneTileModel(var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxt;IIII)V",
		garbageValue = "-418973918"
	)
	static void method5472(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-269605761"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
