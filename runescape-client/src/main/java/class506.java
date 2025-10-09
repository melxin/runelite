import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class506 extends class505 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -378183603
	)
	static final int field5503;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	final WorldEntityCoord field5500;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	final WorldEntityCoord field5502;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1543323241
	)
	int field5501;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1939409911
	)
	int field5504;

	static {
		field5503 = Client.revision + 3;
	}

	class506() {
		this.field5500 = new WorldEntityCoord();
		this.field5502 = new WorldEntityCoord();
		this.field5501 = 0;
		this.field5504 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkg;Ltx;II)V",
		garbageValue = "1882012107"
	)
	void vmethod10277(WorldEntityCoord var1, class504 var2, int var3) {
		this.field5500.method6291(var1);
		this.field5502.method6291(var2.field5495);
		this.field5501 = var3 - 1;
		this.field5504 = var2.field5496 + field5503;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkg;IIB)Z",
		garbageValue = "109"
	)
	boolean vmethod10285(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5501 >= this.field5504) {
			var1.method6291(this.field5502);
			return true;
		} else {
			float var4 = class458.method9316(var2, this.field5501, this.field5504);
			class135.method3748(this.field5500, this.field5502, var4, var1);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2092436005"
	)
	void vmethod10279(int var1, int var2) {
		this.field5500.setDirection(var1, var2);
		this.field5502.setDirection(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-8059"
	)
	public static boolean method10287(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class441.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
