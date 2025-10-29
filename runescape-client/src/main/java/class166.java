import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class166 extends class151 {
	@ObfuscatedName("af")
	static Image field1876;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static Model field1882;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -5037811622651568387L
	)
	long field1879;
	@ObfuscatedName("at")
	String field1877;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2115333599
	)
	int field1878;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class166(class154 var1) {
		this.this$0 = var1;
		this.field1879 = -1L;
		this.field1877 = null;
		this.field1878 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1741769013;
			this.field1879 = var1.readLong();
		}

		this.field1877 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1878 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4057(this.field1879, this.field1877, this.field1878);
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1997342808"
	)
	static final void method4157(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2387()];
		float[] var3 = new float[Client.worldViewManager.method2387()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var24 = (WorldView)var5.next();
			var2[var4] = var24.id;
			var3[var4] = var24.scene.field2877;
		}

		class144.method3897(var3, var2);
		HashMap var25 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class526 var26 = Client.worldViewManager.method2398(var2[var4]);
				if (!var25.containsKey(var26)) {
					var25.put(var26, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class526 var7 = Client.worldViewManager.method2398(var6);
			Integer var8 = (Integer)var25.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class526.field5582) {
					ClanChannel.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class526.field5580) {
					int var9 = Client.viewportWidth / 2;
					int var10 = Client.viewportHeight / 2;
					int var11 = Client.viewportZoom;
					ProjectionCoord var12 = class210.method4667(Occluder.topLevelWorldView.scene, Client.field469, SpriteBufferProperties.cameraX, ScriptFrame.cameraY, class528.cameraZ, var9, var10, var11);
					if (var12 != null) {
						ProjectionCoord var13 = FaceNormal.method5848((float)Client.field468, (float)Client.field469, (float)Client.field512);
						ProjectionCoord var15 = class30.method486(var12);
						var15.method9293(var13);
						ProjectionCoord var16 = class451.method9146(ProjectionCoord.field5234, var15);
						ProjectionCoord var18 = ProjectionCoord.field5240;
						float var17 = var16.method9303(var18);
						ProjectionCoord var21 = ProjectionCoord.field5234;
						float var20 = var21.method9303(var15);
						float var22 = (float)Math.atan2((double)var17, (double)var20);
						int var23 = class311.method7022(var22);
						var23 = class169.method4184(var23);
						ClanChannel.insertMenuItem("Set heading", "", 60, var23, 0, 0, 0, false, var6);
						var13.release();
						var15.release();
						var16.release();
						var12.release();
					}
				}
			}
		}

	}
}
