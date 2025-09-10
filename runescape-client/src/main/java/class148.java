import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class148 extends class151 {
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 681706275
	)
	static int field1756;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1250611857
	)
	int field1753;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 983318571
	)
	int field1752;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2125047361
	)
	int field1757;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1646419103
	)
	int field1754;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class148(class154 var1) {
		this.this$0 = var1;
		this.field1753 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1753 = var1.readUnsignedShort();
		this.field1752 = var1.readShortSmart();
		this.field1757 = var1.readUnsignedByte();
		this.field1754 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3929(this.field1753, this.field1752, this.field1757, this.field1754);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lij;IIIZI)V",
		garbageValue = "-378981254"
	)
	public static void method3797(WorldView var0, SequenceDefinition var1, int var2, int var3, int var4, boolean var5) {
		if (class58.soundEffectCount < 50) {
			if (var1.field2471 != null && var1.field2471.containsKey(var2)) {
				ArrayList var6 = (ArrayList)var1.field2471.get(var2);
				if (!var6.isEmpty()) {
					int var7 = 0;
					int var9;
					if (var6.size() > 1) {
						int var8 = 1 + (int)(Math.random() * 100.0D);
						var9 = 0;

						for (Iterator var10 = var6.iterator(); var10.hasNext(); ++var7) {
							class211 var11 = (class211)var10.next();
							int var12 = var9;
							var9 += var11.field2305;
							if (var12 <= var8 && var8 < var9) {
								break;
							}
						}

						if (var7 >= var6.size()) {
							return;
						}
					}

					class211 var16 = (class211)var6.get(var7);
					var9 = var16.field2303 & 31;
					if ((var9 <= 0 || class36.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var9 != 0 || class36.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var16 != null) {
							if (var16.field2303 == 0) {
								if (!var5) {
									return;
								}

								JagexCache.method5932(var0.id, var16.field2304, 0, 0, 0, var16.field2307, var16.field2306, 0, var1.field2483);
							} else {
								int var17 = var3 - 64;
								int var18 = var17 >> 7;
								int var14 = var4 - 64;
								int var13 = var14 >> 7;
								JagexCache.method5932(var0.id, var16.field2304, var18, var13, var16.field2303, var16.field2307, var16.field2306, 0, var1.field2483);
							}

						}
					}
				}
			}
		}
	}
}
