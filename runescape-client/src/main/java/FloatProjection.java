import java.lang.management.GarbageCollectorMXBean;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("bt")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("aw")
	@Export("projection")
	float[] projection;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -462666941977619849L
	)
	long field2786;

	@ObfuscatedSignature(
		descriptor = "(Lrj;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.field2786 = 0L;
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Liz;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		int var8 = ViewportMouse.ViewportMouse_entityCount;
		boolean var16;
		if (this.field2786 != 0L) {
			boolean var11 = var6 != 0L;
			boolean var12;
			if (var11) {
				var12 = (int)(var6 >>> 19 & 1L) == 1;
				var11 = !var12;
			}

			var12 = !var11;
			long var14;
			if (!var12) {
				var14 = this.field2786;
				var16 = var14 != 0L;
				if (var16) {
					boolean var17 = (int)(var14 >>> 19 & 1L) == 1;
					var16 = !var17;
				}

				var12 = var16;
			}

			if (var12) {
				long var18 = this.field2786;
				var14 = var18 & -524289L;
				var6 = var14;
			}
		}

		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
		if (0L != this.field2786) {
			int var22 = ViewportMouse.ViewportMouse_entityCount;
			if (var22 != var8) {
				long var20 = this.field2786;
				boolean var15 = 0L != var20;
				if (var15) {
					var16 = (int)(var20 >>> 19 & 1L) == 1;
					var15 = !var16;
				}

				this.field2786 = UserComparator8.calculateTag(0, 0, 0, 5, !var15, 0, 0);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljt;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		float var6;
		float var7 = var6 = (float)(var4 << 7);
		float var8;
		float var9 = var8 = (float)(var5 << 7);
		float var10;
		float var11 = var10 = 128.0F + var7;
		float var12;
		float var13 = var12 = var9 + 128.0F;
		float var14 = (float)var1.tileHeights[var3][var4][var5];
		float var15 = (float)var1.tileHeights[var3][var4 + 1][var5];
		float var16 = (float)var1.tileHeights[var3][var4 + 1][var5 + 1];
		float var17 = (float)var1.tileHeights[var3][var4][var5 + 1];
		this.transformationMatrix.transformPoint(var7, var14, var9, this.projection);
		var7 = this.projection[0];
		var14 = this.projection[1];
		var9 = this.projection[2];
		if (var9 >= 50.0F) {
			this.transformationMatrix.transformPoint(var11, var15, var8, this.projection);
			var11 = this.projection[0];
			var15 = this.projection[1];
			var8 = this.projection[2];
			if (var8 >= 50.0F) {
				this.transformationMatrix.transformPoint(var10, var16, var13, this.projection);
				var10 = this.projection[0];
				var16 = this.projection[1];
				var13 = this.projection[2];
				if (var13 >= 50.0F) {
					this.transformationMatrix.transformPoint(var6, var17, var12, this.projection);
					var6 = this.projection[0];
					var17 = this.projection[1];
					var12 = this.projection[2];
					if (var12 >= 50.0F) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljp;III)V",
		garbageValue = "-535692172"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			float var7 = (float)var2.vertexX[var6];
			float var8 = (float)var2.vertexY[var6];
			float var9 = (float)var2.vertexZ[var6];
			this.transformationMatrix.transformPoint(var7, var8, var9, this.projection);
			var7 = this.projection[0];
			var8 = this.projection[1];
			var9 = this.projection[2];
			if (var9 < 50.0F) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = (int)var7;
				SceneTileModel.triangleTexturesY[var6] = (int)var8;
				SceneTileModel.triangleTexturesZ[var6] = (int)var9;
			}

			SceneTileModel.verticesX[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = (float)Rasterizer3D.getClipMidY() + var8 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = class145.method3742(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ai")
	void method5350(long var1) {
		this.field2786 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1038093422"
	)
	public static void method5344() {
		Iterator var0 = class339.midiRequests.iterator();

		while (true) {
			MidiRequest var1;
			do {
				if (!var0.hasNext()) {
					class339.midiRequests.clear();
					return;
				}

				var1 = (MidiRequest)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method7143();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3904 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class339.field3893.iterator();

			while (var4.hasNext()) {
				class345 var5 = (class345)var4.next();
				var5.vmethod7338(var2, var3);
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;I)V",
		garbageValue = "-1613690713"
	)
	static void method5359(int var0, int var1, int var2, int var3, Object[] var4) {
		boolean var5 = false;
		Widget var6 = UrlRequester.widgetDefinition.getWidgetChild(var0, var1);
		if (var5 || var6 != null) {
			int var8;
			if (!var5) {
				var8 = DirectByteArrayCopier.getWidgetFlags(var6);
				boolean var7 = (var8 >> 23 & 1) != 0;
				if (!var7) {
					return;
				}
			}

			PacketBufferNode var16 = UserComparator6.getPacketBufferNode(ClientPacket.IF_RUNSCRIPT, Client.packetWriter.isaacCipher);
			var16.packetBuffer.writeShort(0);
			var8 = var16.packetBuffer.array * 1216585693;
			var16.packetBuffer.writeIntIME(var3);
			var16.packetBuffer.writeInt(var0);
			var16.packetBuffer.writeShortAddLE(var2);
			var16.packetBuffer.writeShortAdd(var1);
			Object[] var9 = var4;

			for (int var10 = 0; var10 < var9.length; ++var10) {
				Object var11 = var9[var10];
				if (var11 instanceof Integer) {
					var16.packetBuffer.writeByteAdd((Integer)var11);
				} else if (var11 instanceof String) {
					var16.packetBuffer.writeStringCp1252NullTerminated((String)var11);
				} else if (var11 instanceof DynamicArray) {
					DynamicArray var12 = (DynamicArray)var11;
					int var13 = var12.method10322();
					var16.packetBuffer.writeSmartByteShort(var13);
					int var15;
					if (var12.field5504 == class574.field5820) {
						int[] var17 = var12.method10318();

						for (var15 = 0; var15 < var13; ++var15) {
							var16.packetBuffer.writeByteAdd(var17[var15]);
						}
					} else {
						Object[] var14 = var12.method10321();

						for (var15 = 0; var15 < var13; ++var15) {
							var16.packetBuffer.writeStringCp1252NullTerminated((String)var14[var15]);
						}
					}
				} else if (var11 == null) {
					var16.packetBuffer.writeByte(0);
				}
			}

			var16.packetBuffer.writeLengthShort(var16.packetBuffer.array * 1216585693 - var8);
			Client.packetWriter.addNode(var16);
		}
	}
}
