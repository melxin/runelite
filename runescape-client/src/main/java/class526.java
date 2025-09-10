import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public abstract class class526 extends class314 implements class599 {
	@ObfuscatedSignature(
		descriptor = "(Lop;Lqh;I)V"
	)
	protected class526(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Luo;",
		garbageValue = "1856887071"
	)
	protected abstract class528 vmethod10961(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "337613658"
	)
	public int method10445() {
		return super.field3515;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-1"
	)
	public Object vmethod11541(int var1) {
		class528 var2 = this.vmethod10961(var1);
		return var2 != null && var2.method10475() ? var2.method10465() : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)Lxv;",
		garbageValue = "-121"
	)
	public class600 method10449(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class528 var3 = this.vmethod10961(var2);
		class600 var4 = new class600(var2);
		Class var5 = var3.field5551.field5821;
		if (var5 == Integer.class) {
			var4.field5985 = var1.method1958();
		} else if (var5 == Long.class) {
			var4.field5985 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5985 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class594.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class594 var6 = (class594)var5.newInstance();
				var6.method11506(var1);
				var4.field5985 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
