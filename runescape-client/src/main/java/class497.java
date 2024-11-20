import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public abstract class class497 extends class309 implements class564 {
	@ObfuscatedSignature(
		descriptor = "(Loc;Lpw;I)V"
	)
	protected class497(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltt;",
		garbageValue = "64"
	)
	protected abstract class499 vmethod9904(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1437479639"
	)
	public int method9329() {
		return super.field3286;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1831995324"
	)
	public Object vmethod10431(int var1) {
		class499 var2 = this.vmethod9904(var1);
		return var2 != null && var2.method9346() ? var2.method9347() : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Lvz;",
		garbageValue = "-573289876"
	)
	public class565 method9328(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class499 var3 = this.vmethod9904(var2);
		class565 var4 = new class565(var2);
		Class var5 = var3.field5127.field5395;
		if (var5 == Integer.class) {
			var4.field5536 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5536 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5536 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class560.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class560 var6 = (class560)var5.newInstance();
				var6.method10407(var1);
				var4.field5536 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1295810712"
	)
	static void method9339(class95 var0) {
		if (Client.field544 != var0) {
			Client.field544 = var0;
		}
	}
}
