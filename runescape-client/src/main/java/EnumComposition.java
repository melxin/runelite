import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 1532580053
	)
	static int field2034;
	@ObfuscatedName("ac")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("av")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("au")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1245976595
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1195541527
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ap")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("am")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("aj")
	@Export("strVals")
	public String[] strVals;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	class515 field2048;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	class515 field2040;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-433756535"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-11975984"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ltn;",
		garbageValue = "854540047"
	)
	public class515 method4288() {
		if (this.field2048 == null) {
			this.field2048 = Occluder.method5374(this.keys);
		}

		return this.field2048;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ltn;",
		garbageValue = "1460195907"
	)
	public class515 method4272() {
		if (this.field2040 == null) {
			if (this.outputType == 's') {
				this.field2040 = class458.method9410(this.strVals);
			} else {
				this.field2040 = Occluder.method5374(this.intVals);
			}
		}

		return this.field2040;
	}
}
