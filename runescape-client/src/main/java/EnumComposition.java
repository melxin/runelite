import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("az")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ao")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ad")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -592889597
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -176546561
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ax")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("at")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ac")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "687907281"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-94680643"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2052156765"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lud;",
		garbageValue = "-1958777495"
	)
	public static class544 method5280(int var0) {
		int var1 = class542.field5387[var0];
		if (var1 == 1) {
			return class544.field5392;
		} else if (var1 == 2) {
			return class544.field5393;
		} else {
			return var1 == 3 ? class544.field5395 : null;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1013211388"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
