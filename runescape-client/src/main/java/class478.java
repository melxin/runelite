import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public final class class478 implements Comparable {
	@ObfuscatedName("ao")
	Object field5102;
	@ObfuscatedName("an")
	Object field5098;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7865337586049764111L
	)
	long field5104;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 8271674875368957217L
	)
	long field5101;

	class478(Object var1, Object var2) {
		this.field5102 = var1;
		this.field5098 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsj;I)I",
		garbageValue = "2016125049"
	)
	int method9117(class478 var1) {
		if (this.field5101 < var1.field5101) {
			return -1;
		} else {
			return this.field5101 > var1.field5101 ? 1 : 0;
		}
	}

	public int hashCode() {
		return this.field5098.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method9117((class478)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class478) {
			return this.field5098.equals(((class478)var1).field5098);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1329571799"
	)
	public static int method9105(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbk;B)V",
		garbageValue = "70"
	)
	static void method9116(GameEngine var0) {
		IndexCheck var1 = ArchiveDiskAction.method7614();

		while (var1.method5689()) {
			if (var1.field3071 == 13) {
				class364.method7490();
				return;
			}

			if (var1.field3071 == 96) {
				if (Login.worldSelectPage > 0 && class60.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field3071 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && PcmPlayer.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSectionType.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class364.method7490();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = World.World_worlds[Login.hoveredWorldIndex];
				int var8 = Client.worldProperties;
				class563 var9 = class563.field5569;
				boolean var7 = (var8 & var9.rsOrdinal()) != 0;
				boolean var11 = var6.isDeadman();
				LoginScreenAnimation.field1314 = var11;
				var6.field827 = var11 ? "beta" : var6.field827;
				class254.changeWorld(var6);
				class364.method7490();
				if (var11 != var7) {
					class106.method2966();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && class60.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class60.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class141.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class141.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && PcmPlayer.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - PcmPlayer.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class141.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class141.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
