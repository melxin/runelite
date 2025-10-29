import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("ag")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Lvy;I)Ljava/util/HashMap;",
		garbageValue = "1097748137"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = class147.method3944(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lts;Lxj;B)V",
		garbageValue = "2"
	)
	static void method11262(WorldEntity var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			int var3 = var1.readUnsignedShort();
			int var4 = var1.readUnsignedByte();
			if (var3 == 65535) {
				byte var7 = -1;
				var0.field5537.setSequence(var7);
				var0.field5537.method9872();
				var0.field5523 = var4;
			} else {
				label37: {
					SequenceDefinition var5 = var0.field5537.getSequenceDefinition();
					if (var5 != null) {
						if (var3 == var0.method10503()) {
							int var6 = var5.restartMode;
							if (var6 == 1) {
								var0.field5537.method9872();
								var0.field5523 = var4;
							}

							if (var6 == 2) {
								var0.field5537.method9890();
							}
							break label37;
						}

						if (ClientPacket.SequenceDefinition_get(var3).field2512 < var5.field2512) {
							break label37;
						}
					}

					var0.field5537.setSequence(var3);
					var0.field5537.method9872();
					var0.field5523 = var4;
				}
			}
		}

		if ((var2 & 2) != 0) {
			var0.method10498(var1.readUnsignedByte());
		}

	}
}
