import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public abstract class class497 extends class309 implements class564 {
	@ObfuscatedSignature(
		descriptor = "(Lol;Lph;I)V"
	)
	protected class497(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lts;",
		garbageValue = "-1"
	)
	protected abstract class499 vmethod10080(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1500806592"
	)
	public int method9511() {
		return super.field3286;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-2107940388"
	)
	public Object vmethod10593(int var1) {
		class499 var2 = this.vmethod10080(var1);
		return var2 != null && var2.method9532() ? var2.method9534() : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)Lvm;",
		garbageValue = "1"
	)
	public class565 method9513(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class499 var3 = this.vmethod10080(var2);
		class565 var4 = new class565(var2);
		Class var5 = var3.field5133.field5396;
		if (var5 == Integer.class) {
			var4.field5539 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5539 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5539 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class560.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class560 var6 = (class560)var5.newInstance();
				var6.method10570(var1);
				var4.field5539 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
