import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public abstract class class522 extends class312 implements class595 {
	@ObfuscatedSignature(
		descriptor = "(Loy;Lqq;I)V"
	)
	protected class522(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "1217291460"
	)
	protected abstract class524 vmethod11009(int var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method10490() {
		return super.field3429;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "388994870"
	)
	public Object vmethod11555(int var1) {
		class524 var2 = this.vmethod11009(var1);
		return var2 != null && var2.method10510() ? var2.method10509() : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)Lwq;",
		garbageValue = "1179034885"
	)
	public class596 method10492(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class524 var3 = this.vmethod11009(var2);
		class596 var4 = new class596(var2);
		Class var5 = var3.field5449.field5722;
		if (var5 == Integer.class) {
			var4.field5881 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5881 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5881 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class590.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class590 var6 = (class590)var5.newInstance();
				var6.method11515(var1);
				var4.field5881 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)Z",
		garbageValue = "-1541946220"
	)
	public static boolean method10495(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class262.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
