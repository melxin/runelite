import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ab")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("aw")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("at")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "1932131867"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public static String method4429(CharSequence var0) {
		String var1 = GrandExchangeOffer.base37DecodeLong(class201.method4009(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	static final void method4426() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}
}
