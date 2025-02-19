import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class200 extends DualNode {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static EvictingDualNodeHashTable field2139;
	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("topLevelWorldView")
	public static WorldView topLevelWorldView;
	@ObfuscatedName("ag")
	String[] field2133;
	@ObfuscatedName("az")
	public boolean field2135;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 383448135
	)
	int field2142;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1414325477
	)
	int field2140;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2059404961
	)
	int field2144;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1989694059
	)
	int field2145;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -251803349
	)
	int field2141;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -4661863
	)
	int field2143;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -992134497
	)
	int field2148;

	static {
		field2139 = new EvictingDualNodeHashTable(64);
	}

	public class200() {
		this.field2133 = new String[5];
		this.field2135 = false;
		this.field2142 = 0;
		this.field2140 = 0;
		this.field2144 = 0;
		this.field2145 = 0;
		this.field2141 = 0;
		this.field2143 = 0;
		this.field2148 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1900168721"
	)
	public void method4028(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4029(var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1365771823"
	)
	void method4029(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2142 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		default:
			break;
		case 4:
			this.field2140 = var1.readShort();
			break;
		case 5:
			this.field2144 = var1.readShort();
			break;
		case 6:
			this.field2145 = var1.readShort();
			break;
		case 7:
			this.field2141 = var1.readShort();
			break;
		case 8:
			this.field2143 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2148 = var1.readUnsignedShort();
			break;
		case 12:
			var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2135 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2133[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2133[var3].equalsIgnoreCase("Hidden")) {
				this.field2133[var3] = null;
			}
			break;
		case 20:
			var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1565016470"
	)
	public int method4030() {
		return this.field2142;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1308598746"
	)
	public int method4031() {
		return this.field2140;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1871218130"
	)
	public int method4032() {
		return this.field2144;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-816733132"
	)
	public int method4033() {
		return this.field2145;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "372216982"
	)
	public int method4038() {
		return this.field2141;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "260235251"
	)
	public int method4047() {
		return this.field2143;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "18497"
	)
	public int method4051() {
		return this.field2148;
	}
}
