import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class32 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -757046739
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("fq")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	static WorldView worldView;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -400628287
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = -170445531
	)
	static int field150;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1520765249
	)
	int field141;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1468189759
	)
	int field151;

	class32(int var1, int var2) {
		this.field141 = var1;
		this.field151 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbj;I)Z",
		garbageValue = "2145091586"
	)
	boolean method490(class28 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field141) {
			case 1:
				return var1.vmethod6166(this.field151);
			case 2:
				return var1.vmethod6127(this.field151);
			case 3:
				return var1.vmethod6156((char)this.field151);
			case 4:
				return var1.vmethod6138(this.field151 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lkb;",
		garbageValue = "-102"
	)
	public static class264 method493() {
		return class264.field3137;
	}

	@ObfuscatedName("ab")
	static boolean method498(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-677180369"
	)
	static void method495(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class154.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && class57.soundEffectCount < 50) {
			class421.method8618(worldView.id, var1, var2, var3, var4, var5, var6, var7, false);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-184382822"
	)
	static final int method496(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
