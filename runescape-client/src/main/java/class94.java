import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class94 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1167;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1158;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1154;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1155;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1156;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1157;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1170;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1159;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1160;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1161;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1162;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1164;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1153;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1165;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1171;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1169;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1168;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class94 field1166;

	static {
		field1167 = new class94();
		field1158 = new class94();
		field1154 = new class94();
		field1155 = new class94();
		field1156 = new class94();
		field1157 = new class94();
		field1170 = new class94();
		field1159 = new class94();
		field1160 = new class94();
		field1161 = new class94();
		field1162 = new class94();
		field1164 = new class94();
		field1153 = new class94();
		field1165 = new class94();
		field1171 = new class94();
		field1169 = new class94();
		field1168 = new class94();
		field1166 = new class94();
	}

	class94() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	public static void method2564() {
		class36.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-710402881"
	)
	static boolean method2567(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Leg;",
		garbageValue = "-176804061"
	)
	static AttackOption[] method2562() {
		return new AttackOption[]{AttackOption.field1389, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1388, AttackOption.AttackOption_hidden};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1498870685"
	)
	static void method2565(int var0) {
		class137.method3379(14);
		Login.Login_banType = var0;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILnt;ZI)V",
		garbageValue = "-2071237744"
	)
	static void method2563(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = DynamicObject.getWorldMap().getMapArea(var0);
		int var4 = Script.localPlayer.plane;
		int var5 = (Script.localPlayer.x >> 7) + class509.topLevelWorldView.baseX;
		int var6 = (Script.localPlayer.y >> 7) + class509.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		DynamicObject.getWorldMap().method9815(var3, var7, var1, var2);
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lvu;I)V",
		garbageValue = "1971206780"
	)
	static void method2566(WorldView var0, PacketBuffer var1) {
		WorldView var2 = DevicePcmPlayerProvider.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field657[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field657[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		Actor.field1286 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				Actor.field1286[var6][var7] = var1.readInt();
			}
		}

		class370.field4122 = new int[var5];
		ModelData0.field2361 = new int[var5];
		HorizontalAlignment.field2679 = new int[var5];
		WorldMapScaleHandler.field3349 = new byte[var5][];
		class235.field2577 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field657[var6][var7][var8];
					if (var9 != -1) {
						int var10 = var9 >> 14 & 1023;
						int var11 = var9 >> 3 & 2047;
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (class370.field4122[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							class370.field4122[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							ModelData0.field2361[var5] = class161.archive9.getGroupId("m" + var13 + "_" + var14);
							HorizontalAlignment.field2679[var5] = class161.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		class325.updateGameState(25);
		Client.field637 = true;
		class166.field1847 = var2;
		VarcInt.method5076(var2);
	}
}
