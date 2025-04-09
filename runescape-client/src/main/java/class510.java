import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public abstract class class510 extends class311 implements class577 {
	@ObfuscatedSignature(
		descriptor = "(Loi;Lqa;I)V"
	)
	protected class510(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lts;",
		garbageValue = "1975982205"
	)
	protected abstract class512 vmethod10094(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1475471072"
	)
	public int method9582() {
		return super.field3357;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "60"
	)
	public Object vmethod10633(int var1) {
		class512 var2 = this.vmethod10094(var1);
		return var2 != null && var2.method9607() ? var2.method9604() : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Lwr;",
		garbageValue = "743133072"
	)
	public class578 method9584(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class512 var3 = this.vmethod10094(var2);
		class578 var4 = new class578(var2);
		Class var5 = var3.field5272.field5524;
		if (var5 == Integer.class) {
			var4.field5662 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5662 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5662 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class572.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class572 var6 = (class572)var5.newInstance();
				var6.method10597(var1);
				var4.field5662 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
