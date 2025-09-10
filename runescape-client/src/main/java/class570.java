import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
final class class570 implements class569 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwb;I)V",
		garbageValue = "1264095929"
	)
	public void vmethod11041(Object var1, Buffer var2) {
		this.method10978((Integer)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Ljava/lang/Object;",
		garbageValue = "-944661961"
	)
	public Object vmethod11037(Buffer var1) {
		return var1.method1958();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lwb;I)V",
		garbageValue = "783821411"
	)
	void method10978(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "2058676137"
	)
	static void method10977(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.field3109, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset * 1216585693);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}
}
