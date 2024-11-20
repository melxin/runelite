import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class153 {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -84777741
	)
	static int field1700;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -3976112273295813203L
	)
	long field1696;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1898780395
	)
	public int field1697;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	IterableNodeDeque field1693;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	public class153(Buffer var1) {
		this.field1697 = -1;
		this.field1693 = new IterableNodeDeque();
		this.method3477(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "1"
	)
	void method3477(Buffer var1) {
		this.field1696 = var1.readLong();
		this.field1697 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class172(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class165(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class164(this);
			} else if (var2 == 5) {
				var3 = new class149(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else if (var2 == 7) {
				var3 = new class147(this);
			} else if (var2 == 14) {
				var3 = new class151(this);
			} else if (var2 == 8) {
				var3 = new class168(this);
			} else if (var2 == 9) {
				var3 = new class174(this);
			} else if (var2 == 10) {
				var3 = new class160(this);
			} else if (var2 == 11) {
				var3 = new class155(this);
			} else if (var2 == 12) {
				var3 = new class159(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class169(this);
			}

			((class150)var3).vmethod3694(var1);
			this.field1693.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;B)V",
		garbageValue = "88"
	)
	public void method3481(ClanSettings var1) {
		if (var1.field1740 == this.field1696 && this.field1697 == var1.field1741) {
			for (class150 var2 = (class150)this.field1693.last(); var2 != null; var2 = (class150)this.field1693.previous()) {
				var2.vmethod3695(var1);
			}

			++var1.field1741;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1580013774"
	)
	static String method3479(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BS)Ldt;",
		garbageValue = "-2875"
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
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ServerPacket.method6470(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1016 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-54"
	)
	static int method3484(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5470[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
