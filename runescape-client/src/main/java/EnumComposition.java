import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1618932575
	)
	static int field1991;
	@ObfuscatedName("an")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ai")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("al")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -311000709
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1232725907
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("am")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ah")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ag")
	@Export("strVals")
	public String[] strVals;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	class509 field1998;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	class509 field1988;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1088034478"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "436526466"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "599549872"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ltp;",
		garbageValue = "-1741019282"
	)
	public class509 method4107() {
		if (this.field1998 == null) {
			int[] var2 = this.keys;
			class509 var3 = new class509(class563.field5600, false);
			var3.field5294 = var2;
			var3.field5287 = var2.length * 1090132113;
			var3.field5291 = var2.length;
			this.field1998 = var3;
		}

		return this.field1998;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ltp;",
		garbageValue = "-957403934"
	)
	public class509 method4112() {
		if (this.field1988 == null) {
			if (this.outputType == 's') {
				this.field1988 = ChatChannel.method2005(this.strVals);
			} else {
				int[] var2 = this.intVals;
				class509 var3 = new class509(class563.field5600, false);
				var3.field5294 = var2;
				var3.field5287 = var2.length * 1090132113;
				var3.field5291 = var2.length;
				this.field1988 = var3;
			}
		}

		return this.field1988;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;II)Z",
		garbageValue = "-714407408"
	)
	public static boolean method4121(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var3 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var3 == null) {
			return false;
		} else {
			int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
			byte[] var5 = var1.getFile(var4, 0);
			return var5 != null;
		}
	}
}
