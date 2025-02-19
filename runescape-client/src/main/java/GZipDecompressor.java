import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wo")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ab")
	@Export("inflater")
	Inflater inflater;

	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1000000"
	)
	GZipDecompressor(int var1, int var2, int var3) {
	}

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;[BB)V",
		garbageValue = "60"
	)
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.field5573[var1.field5570] == 31 && var1.field5573[var1.field5570 + 1] == -117) {
			if (this.inflater == null) {
				this.inflater = new Inflater(true);
			}

			try {
				this.inflater.setInput(var1.field5573, var1.field5570 + 10, var1.field5573.length - (var1.field5570 + 8 + 10));
				this.inflater.inflate(var2);
			} catch (Exception var4) {
				this.inflater.reset();
				throw new RuntimeException("");
			}

			this.inflater.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
