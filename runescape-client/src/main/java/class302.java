import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class302 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class302 field3472;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class302 field3471;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -399617977
	)
	@Export("value")
	final int value;

	static {
		field3472 = new class302(0);
		field3471 = new class302(1);
	}

	class302(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232877034"
	)
	static void method6842() {
		try {
			File var0 = new File(ItemContainer.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label39:
				for (int var1 = 0; var1 < JagexCache.field3115.length; ++var1) {
					for (var2 = 0; var2 < DefaultsGroup.field5589.length; ++var2) {
						File var3 = new File(DefaultsGroup.field5589[var2] + JagexCache.field3115[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label39;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)Lre;",
		garbageValue = "-1084477567"
	)
	public static final ProjectionCoord method6840(ProjectionCoord var0, ProjectionCoord var1) {
		ProjectionCoord var2 = NPC.method2793(var0);
		var2.method9064(var1);
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Luo;",
		garbageValue = "-72141241"
	)
	static class522[] method6841() {
		return new class522[]{class522.field5612, class522.field5614, class522.field5611, class522.field5617};
	}
}
