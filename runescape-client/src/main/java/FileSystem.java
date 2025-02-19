import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ab")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ay")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("au")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1858078912"
	)
	static long method4489() {
		try {
			URL var0 = new URL(World.method1887("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.field5573, var4.field5570, 1000 - var4.field5570);
				if (var5 == -1) {
					var4.field5570 = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.field5570 += var5;
			} while(var4.field5570 < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1421819473"
	)
	public static String method4490(CharSequence var0) {
		long var3 = 0L;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			var3 *= 37L;
			char var7 = var0.charAt(var6);
			if (var7 >= 'A' && var7 <= 'Z') {
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') {
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48);
			}

			if (var3 >= 177917621779460413L) {
				break;
			}
		}

		while (var3 % 37L == 0L && 0L != var3) {
			var3 /= 37L;
		}

		String var8 = class217.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}
}
