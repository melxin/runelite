import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2138505781
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2024870581
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ap")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1330578249
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1628015845
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1718029787
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 918300961
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 577986567
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -61945303
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2017146409
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1205870462"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;III)V",
		garbageValue = "-27259752"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 != 8 && var2 == 9) {
			var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-68"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)Ljava/lang/String;",
		garbageValue = "-583843459"
	)
	public static String method4815(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class373.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = TileItem.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIILnt;II)V",
		garbageValue = "-437185113"
	)
	static void method4795(WorldView var0, int var1, int var2, int var3, SpriteMask var4, int var5) {
		int var13;
		if (var5 == 1) {
			var13 = Client.hintArrow.method8231();
			WorldViewManager var14 = Client.worldViewManager;
			Iterator var9 = var14.iterator();

			NPC var12;
			while (true) {
				if (!var9.hasNext()) {
					var12 = null;
					break;
				}

				WorldView var10 = (WorldView)var9.next();
				NPC var11 = (NPC)var10.npcs.get((long)var13);
				if (var11 != null) {
					var12 = var11;
					break;
				}
			}

			if (var12 != null) {
				HorizontalAlignment.worldToMinimap(var12.getWorldView(), var12.x, var12.y, var1, var2, var3, AsyncHttpResponse.mapDotSprites[1], var4);
			}
		} else if (var5 == 2) {
			WorldView var15 = Client.worldViewManager.getWorldViewFromWorldPoint(Client.hintArrow.method8250(), Client.hintArrow.method8235());
			var13 = Coord.method7440(Client.hintArrow.method8250() - var15.baseX) + Client.hintArrow.method8232();
			int var8 = Coord.method7440(Client.hintArrow.method8235() - var15.baseY) + Client.hintArrow.method8234();
			HorizontalAlignment.worldToMinimap(var15, var13, var8, var1, var2, var3, AsyncHttpResponse.mapDotSprites[1], var4);
		} else if (var5 == 3) {
			Player var16 = VerticalAlignment.method4463(Client.hintArrow.method8231(), Client.worldViewManager);
			if (var16 != null) {
				HorizontalAlignment.worldToMinimap(var16.getWorldView(), var16.x, var16.y, var1, var2, var3, AsyncHttpResponse.mapDotSprites[1], var4);
			}
		} else if (var5 == 4) {
			int var6 = Client.hintArrow.method8231();
			WorldEntity var7 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var6);
			if (var7 != null) {
				HorizontalAlignment.worldToMinimap(class547.topLevelWorldView, var7.getY(), var7.getPlane(), var1, var2, var3, AsyncHttpResponse.mapDotSprites[1], var4);
			}
		}

	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-93"
	)
	public static void method4817(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = HorizontalAlignment.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShortLE(var1);
		var4.packetBuffer.writeShortLE(var0);
		var4.packetBuffer.writeIntME(var3 ? Client.field459 : 0);
		var4.packetBuffer.writeByteAdd(var2);
		Client.packetWriter.addNode(var4);
	}
}
