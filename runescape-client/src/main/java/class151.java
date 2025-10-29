import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public abstract class class151 extends Node {
	class151() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	abstract void vmethod4235(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	abstract void vmethod4241(ClanSettings var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "-2143684328"
	)
	public static class461 method3974() {
		synchronized(class461.field5251) {
			if (class461.field5245 == 0) {
				return new class461();
			} else {
				class461.field5251[--class461.field5245].method9369();
				return class461.field5251[class461.field5245];
			}
		}
	}

	@ObfuscatedName("av")
	public static final int method3969(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var4 + var2 - var4 * var2;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = (var12 - var14) * 6.0D * var0 + var14;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + 6.0D * (var12 - var14) * var20;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IIIIB)Z",
		garbageValue = "0"
	)
	static boolean method3975(class563 var0, int var1, int var2, int var3, int var4) {
		int var6 = var0.method11233();
		int var7 = var0.method11230();
		int var8 = var0.method11208();
		int var9 = var7 - var1;
		int var10 = var8 - var2;
		int var11 = var9 * var9;
		int var12 = var10 * var10;
		boolean var5;
		if (var11 + var12 <= var6) {
			var5 = true;
		} else {
			int var13 = var7 - var3;
			int var14 = var13 * var13;
			if (var14 + var12 <= var6) {
				var5 = true;
			} else {
				int var15 = var8 - var4;
				int var16 = var15 * var15;
				if (var16 + var11 <= var6) {
					var5 = true;
				} else {
					var5 = var16 + var14 <= var6;
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1310936102"
	)
	static void method3973() {
		Iterator var0 = class345.midiRequests.iterator();

		while (true) {
			MidiRequest var1;
			do {
				if (!var0.hasNext()) {
					class345.midiRequests.clear();
					return;
				}

				var1 = (MidiRequest)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method7462();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3948 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class345.field3925.iterator();

			while (var4.hasNext()) {
				class351 var5 = (class351)var4.next();
				var5.vmethod7564(var2, var3);
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V",
		garbageValue = "2108391709"
	)
	static void method3977(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "-1866562559"
	)
	static void method3976(NPC var0) {
		var0.size = var0.definition.size;
		var0.field1069 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2123;
		var0.field1038 = var0.definition.field2124;
		var0.field1027 = var0.definition.field2105;
		var0.field1012 = var0.definition.field2126;
		var0.field1041 = var0.definition.field2127;
		var0.field1042 = var0.definition.field2120;
		var0.field1040 = var0.definition.field2129;
		var0.field1043 = var0.definition.field2130;
	}
}
