import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class168 {
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 7018002505015220295L
	)
	long field1895;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -7923538897576424543L
	)
	public long field1898;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	IterableNodeDeque field1900;

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	public class168(Buffer var1) {
		this.field1898 = -1L;
		this.field1900 = new IterableNodeDeque();
		this.method4039(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "111"
	)
	void method4039(Buffer var1) {
		this.field1895 = var1.readLong();
		this.field1898 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class163(this);
			} else if (var2 == 4) {
				var3 = new class174(this);
			} else if (var2 == 3) {
				var3 = new class159(this);
			} else if (var2 == 2) {
				var3 = new class157(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class167)var3).vmethod4108(var1);
			this.field1900.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "599787228"
	)
	public void method4044(ClanChannel var1) {
		if (var1.key == this.field1895 && this.field1898 == var1.field1922) {
			for (class167 var2 = (class167)this.field1900.last(); var2 != null; var2 = (class167)this.field1900.previous()) {
				var2.vmethod4104(var1);
			}

			++var1.field1922;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)[Lxc;",
		garbageValue = "1816728910"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class587.method11132(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite[] var7 = new IndexedSprite[class606.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < class606.SpriteBuffer_spriteCount; ++var8) {
					IndexedSprite var9 = var7[var8] = new IndexedSprite();
					var9.width = class606.SpriteBuffer_spriteWidth;
					var9.height = class581.SpriteBuffer_spriteHeight;
					var9.xOffset = LoginPacket.SpriteBuffer_xOffsets[var8];
					var9.yOffset = class191.SpriteBuffer_yOffsets[var8];
					var9.subWidth = class255.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = FriendLoginUpdate.field5390[var8];
					var9.palette = TriBool.SpriteBuffer_spritePalette;
					var9.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var8];
				}

				class388.method8205();
				var5 = var7;
			}

			return var5;
		}
	}
}
