import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class167 {
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 4162624972685030787L
	)
	long field1790;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 4903555781910376907L
	)
	public long field1789;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	IterableNodeDeque field1787;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	public class167(Buffer var1) {
		this.field1789 = -1L;
		this.field1787 = new IterableNodeDeque();
		this.method3638(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-85314999"
	)
	void method3638(Buffer var1) {
		this.field1790 = var1.readLong();
		this.field1789 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class173(this);
			} else if (var2 == 3) {
				var3 = new class158(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class166)var3).vmethod3691(var1);
			this.field1787.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-266555571"
	)
	public void method3639(ClanChannel var1) {
		if (var1.key == this.field1790 && var1.field1806 == this.field1789) {
			for (class166 var2 = (class166)this.field1787.last(); var2 != null; var2 = (class166)this.field1787.previous()) {
				var2.vmethod3688(var1);
			}

			++var1.field1806;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "1"
	)
	public static int method3641(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(IIIILvr;Lna;B)V",
		garbageValue = "0"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10640(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
