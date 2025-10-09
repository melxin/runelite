import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class70 {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = 108051455
	)
	static int field966;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgk;",
		garbageValue = "89"
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

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1328734565"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		WorldMapElement.method4252();
		switch(var0) {
		case 1:
			class146.method3876(24);
			class203.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			Frames.method5460();
		}

	}
}
