import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1082022117
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -869572751
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("am")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("aa")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -538659269
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 979800473
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 391914251
	)
	@Export("population")
	int population;
	@ObfuscatedName("au")
	@Export("host")
	String host;
	@ObfuscatedName("aj")
	@Export("activity")
	String activity;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 659280259
	)
	@Export("location")
	int location;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1579590005
	)
	@Export("index")
	int index;
	@ObfuscatedName("ay")
	String field827;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1675784815"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class563.field5585.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329010117"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class563.field5569.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "124"
	)
	boolean method1867() {
		return (class563.field5554.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2100109733"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class563.field5555.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-459274846"
	)
	boolean method1872() {
		return (class563.field5556.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2117332431"
	)
	boolean method1873() {
		return (class563.field5582.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-86"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class563.field5578.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2135994457"
	)
	boolean method1885() {
		return (class563.field5575.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	boolean method1876() {
		return (class563.field5565.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1785779153"
	)
	boolean method1877() {
		return (class563.field5580.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldb;",
		garbageValue = "-1759981266"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = (var2.array.length - 2) * 29699747;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4 * 29699747;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapLabelSize.method5922(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1008 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset * -2066221813 < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "-219781331"
	)
	static void method1875(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method1875(var0, var1, var2, var5 - 1);
			method1875(var0, var1, var5 + 1, var3);
		}

	}
}
