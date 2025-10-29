import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class394 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1245634957
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-368351008"
	)
	public static int method8396(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	static void method8394() {
		for (int var0 = 0; var0 < Client.field410.size(); ++var0) {
			if (HitSplatDefinition.method4740((Integer)Client.field410.get(var0)) != 2) {
				Client.field410.remove(var0);
				--var0;
			}
		}

	}
}
