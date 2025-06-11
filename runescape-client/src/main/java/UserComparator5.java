import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1743940011
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)I",
		garbageValue = "1269819791"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ljava/lang/Object;III)I",
		garbageValue = "2068972439"
	)
	public static int method3406(class509 var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method9937()) {
			var3 = var0.method9937();
		}

		int var5;
		if (var0.field5288 == class563.field5600) {
			int[] var11 = var0.method9965();
			var5 = (Integer)var1;

			for (int var6 = var2; var6 < var3; ++var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5288 == class563.field5594) {
			long[] var10 = var0.method9973();
			long var8 = (Long)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var10[var7] == var8) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method9936();

			for (var5 = var2; var5 < var3; ++var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)Lcr;",
		garbageValue = "8"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
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
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? HealthBarUpdate.method2362(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field803 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			switch(var8) {
			case 3:
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
				break;
			case 21:
			case 38:
			case 39:
			case 63:
				var1.intOperands[var7] = var2.readUnsignedByte();
				break;
			default:
				if (var8 <= 99) {
					var1.intOperands[var7] = var2.readInt();
				} else {
					var1.intOperands[var7] = var2.readUnsignedByte();
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-346950824"
	)
	static final String method3409(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return AbstractWorldMapIcon.colorStartTag(16711680);
		} else if (var2 < -6) {
			return AbstractWorldMapIcon.colorStartTag(16723968);
		} else if (var2 < -3) {
			return AbstractWorldMapIcon.colorStartTag(16740352);
		} else if (var2 < 0) {
			return AbstractWorldMapIcon.colorStartTag(16756736);
		} else if (var2 > 9) {
			return AbstractWorldMapIcon.colorStartTag(65280);
		} else if (var2 > 6) {
			return AbstractWorldMapIcon.colorStartTag(4259584);
		} else if (var2 > 3) {
			return AbstractWorldMapIcon.colorStartTag(8453888);
		} else {
			return var2 > 0 ? AbstractWorldMapIcon.colorStartTag(12648192) : AbstractWorldMapIcon.colorStartTag(16776960);
		}
	}
}
