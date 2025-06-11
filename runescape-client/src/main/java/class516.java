import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class516 extends class311 implements class588 {
	@ObfuscatedSignature(
		descriptor = "(Lon;Lqt;I)V"
	)
	protected class516(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "1059633187"
	)
	protected abstract class518 vmethod10584(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int method10064() {
		return super.field3347;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "2094088981"
	)
	public Object vmethod11181(int var1) {
		class518 var2 = this.vmethod10584(var1);
		return var2 != null && var2.method10085() ? var2.method10086() : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)Lwv;",
		garbageValue = "-1304473454"
	)
	public class589 method10067(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class518 var3 = this.vmethod10584(var2);
		class589 var4 = new class589(var2);
		Class var5 = var3.field5339.field5597;
		if (var5 == Integer.class) {
			var4.field5761 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5761 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5761 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class583.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class583 var6 = (class583)var5.newInstance();
				var6.method11142(var1);
				var4.field5761 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
