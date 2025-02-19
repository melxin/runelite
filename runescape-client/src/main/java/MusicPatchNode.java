import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -735039873
	)
	int field3774;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	MusicPatchNode2 field3777;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -747309049
	)
	int field3785;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1467501219
	)
	int field3779;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -847321275
	)
	int field3780;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1156163831
	)
	int field3781;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -286659465
	)
	int field3782;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1900746283
	)
	int field3783;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -998821407
	)
	int field3784;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 834469563
	)
	int field3795;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1829748887
	)
	int field3796;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2135247769
	)
	int field3787;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -709324747
	)
	int field3788;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1360705035
	)
	int field3778;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -560005877
	)
	int field3790;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 297969383
	)
	int field3786;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1398731197
	)
	int field3793;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -463210079
	)
	int field3789;

	MusicPatchNode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "201219620"
	)
	void method6827() {
		this.table = null;
		this.rawSound = null;
		this.field3777 = null;
		this.stream = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvy;J)V"
	)
	static void method6832(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)Lip;",
		garbageValue = "16"
	)
	static class208 method6828(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			boolean var2 = true;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.readUnsignedShort();
			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			int var9 = var0.readUnsignedByte();
			int var10 = var0.readUnsignedByte();
			if (var6 >= 1 && var8 >= 1 && var9 >= 0 && var10 >= 0) {
				return new class208(var6, var7, var8, var9, var10);
			}
		}

		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1874225574"
	)
	static int method6833() {
		return Login.loginIndex;
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1043655708"
	)
	static final void method6831(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		AbstractWorldMapIcon.clientPreferences.updateSoundEffectVolume(var0);
	}
}
