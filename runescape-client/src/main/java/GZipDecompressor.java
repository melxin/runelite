import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xs")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("af")
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;[BI)V",
		garbageValue = "-1430530410"
	)
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.field5916[var1.array * 1216585693] == 31 && var1.field5916[var1.array * 1216585693 + 1] == -117) {
			if (this.inflater == null) {
				this.inflater = new Inflater(true);
			}

			try {
				this.inflater.setInput(var1.field5916, var1.array * 1216585693 + 10, var1.field5916.length - (var1.array * 1216585693 + 8 + 10));
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
