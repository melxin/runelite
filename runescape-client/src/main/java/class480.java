import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public final class class480 {
	@ObfuscatedName("ap")
	final Comparator field5149;
	@ObfuscatedName("aj")
	final Map field5151;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class453 field5150;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class453 field5148;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 2567931209999575089L
	)
	final long field5152;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	final class478 field5153;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1559954835
	)
	final int field5154;

	@ObfuscatedSignature(
		descriptor = "(JILsc;)V"
	)
	class480(long var1, int var3, class478 var4) {
		this.field5149 = new class479(this);
		this.field5152 = var1;
		this.field5154 = var3;
		this.field5153 = var4;
		if (this.field5154 == -1) {
			this.field5151 = new HashMap(64);
			this.field5150 = new class453(64, this.field5149);
			this.field5148 = null;
		} else {
			if (this.field5153 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5151 = new HashMap(this.field5154);
			this.field5150 = new class453(this.field5154, this.field5149);
			this.field5148 = new class453(this.field5154);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsc;)V"
	)
	public class480(int var1, class478 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1704690766"
	)
	boolean method9462() {
		return this.field5154 != -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2072033964"
	)
	public Object method9463(Object var1) {
		synchronized(this) {
			if (this.field5152 != -1L) {
				this.method9481();
			}

			class481 var3 = (class481)this.field5151.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9465(var3, false);
				return var3.field5158;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "100"
	)
	public Object method9464(Object var1, Object var2) {
		synchronized(this) {
			if (this.field5152 != -1L) {
				this.method9481();
			}

			class481 var4 = (class481)this.field5151.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5158;
				var4.field5158 = var2;
				this.method9465(var4, false);
				return var8;
			} else {
				class481 var5;
				if (this.method9462() && this.field5151.size() == this.field5154) {
					var5 = (class481)this.field5148.remove();
					this.field5151.remove(var5.field5155);
					this.field5150.remove(var5);
				}

				var5 = new class481(var2, var1);
				this.field5151.put(var1, var5);
				this.method9465(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lsa;ZI)V",
		garbageValue = "408374997"
	)
	void method9465(class481 var1, boolean var2) {
		if (!var2) {
			this.field5150.remove(var1);
			if (this.method9462() && !this.field5148.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5157 = System.currentTimeMillis();
		if (this.method9462()) {
			switch(this.field5153.field5143) {
			case 0:
				var1.field5156 = var1.field5157;
				break;
			case 1:
				++var1.field5156;
			}

			this.field5148.add(var1);
		}

		this.field5150.add(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-989122165"
	)
	void method9481() {
		if (this.field5152 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5152;

			while (!this.field5150.isEmpty()) {
				class481 var3 = (class481)this.field5150.peek();
				if (var3.field5157 >= var1) {
					return;
				}

				this.field5151.remove(var3.field5155);
				this.field5150.remove(var3);
				if (this.method9462()) {
					this.field5148.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5151.clear();
			this.field5150.clear();
			if (this.method9462()) {
				this.field5148.clear();
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lps;III)[Lwd;",
		garbageValue = "-953413690"
	)
	public static SpritePixels[] method9483(AbstractArchive var0, int var1, int var2) {
		if (!class167.method3865(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = Varps.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class379.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class171.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = SpriteBufferProperties.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = SpriteBufferProperties.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			Varps.SpriteBuffer_yOffsets = null;
			class379.SpriteBuffer_spriteWidths = null;
			class171.SpriteBuffer_spriteHeights = null;
			SpriteBufferProperties.SpriteBuffer_spritePalette = null;
			SpriteBufferProperties.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
