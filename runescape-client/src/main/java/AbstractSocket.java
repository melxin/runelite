import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-118"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-837832776"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-122"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2009179957"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "50"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "797434832"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;IIB)V",
		garbageValue = "60"
	)
	public static void method9821(int[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					Object var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method9821(var0, var1, var2, var5 - 1);
			method9821(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2121912683"
	)
	static void method9822(String var0) {
		Login.displayName = class507.method9926(var0);
	}
}
