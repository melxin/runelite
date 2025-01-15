import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("az")
	@Export("type")
	char type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1211806913
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ad")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("an")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1097931173"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "6"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "355757749"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class417.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-218803820"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}
}
