import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class172 extends class165 {
	@ObfuscatedName("am")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ab")
	String field1880;
	@ObfuscatedName("ay")
	byte field1874;
	@ObfuscatedName("au")
	byte field1879;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class172(class166 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1818142003"
	)
	void vmethod3695(Buffer var1) {
		this.field1880 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1880 != null) {
			var1.readUnsignedByte();
			this.field1874 = var1.readByte();
			this.field1879 = var1.readByte();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "488725669"
	)
	void vmethod3696(ClanChannel var1) {
		var1.name = this.field1880;
		if (this.field1880 != null) {
			var1.field1863 = this.field1874;
			var1.field1857 = this.field1879;
		}

	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IIIILwg;Lnu;I)V",
		garbageValue = "106006443"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var3 * var8 + var9 * var2 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class158.redHintArrowSprite.method10780(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			ClanChannelMember.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
