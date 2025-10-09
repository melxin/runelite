import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public abstract class class524 extends class313 implements class597 {
	@ObfuscatedSignature(
		descriptor = "(Loh;Lqd;I)V"
	)
	protected class524(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lux;",
		garbageValue = "-99"
	)
	protected abstract class526 vmethod11140(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "479803723"
	)
	public int method10564() {
		return super.field3525;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-89"
	)
	public Object vmethod11708(int var1) {
		class526 var2 = this.vmethod11140(var1);
		return var2 != null && var2.method10588() ? var2.method10589() : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)Lxs;",
		garbageValue = "0"
	)
	public class598 method10565(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class526 var3 = this.vmethod11140(var2);
		class598 var4 = new class598(var2);
		Class var5 = var3.field5622.field5885;
		if (var5 == Integer.class) {
			var4.field6046 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field6046 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field6046 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class592.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class592 var6 = (class592)var5.newInstance();
				var6.method11667(var1);
				var4.field6046 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
