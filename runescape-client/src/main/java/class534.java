import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public abstract class class534 extends class320 implements class608 {
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lqd;I)V"
	)
	protected class534(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lue;",
		garbageValue = "-535565336"
	)
	protected abstract class536 vmethod11384(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	public int method10790() {
		return super.field3553;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1807762460"
	)
	public Object vmethod11988(int var1) {
		class536 var2 = this.vmethod11384(var1);
		return var2 != null && var2.method10811() ? var2.method10809() : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;S)Lxx;",
		garbageValue = "17804"
	)
	public class609 method10794(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class536 var3 = this.vmethod11384(var2);
		class609 var4 = new class609(var2);
		Class var5 = var3.field5640.field5943;
		if (var5 == Integer.class) {
			var4.field6085 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field6085 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field6085 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class603.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class603 var6 = (class603)var5.newInstance();
				var6.method11945(var1);
				var4.field6085 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
