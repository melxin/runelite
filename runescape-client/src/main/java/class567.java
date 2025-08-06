import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
final class class567 implements class565 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-567180997"
	)
	public void vmethod11079(Object var1, Buffer var2) {
		this.method11036((DynamicArray)var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "-30185"
	)
	public Object vmethod11078(Buffer var1) {
		int var3 = var1.readUnsignedShort();
		if (var3 >= 0 && var3 <= 5000) {
			int var4 = var1.readUnsignedByte();
			DynamicArray var2;
			int var6;
			if (var4 == 0) {
				int[] var5 = new int[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var5[var6] = var1.readInt();
				}

				var2 = Occluder.method5374(var5);
			} else if (var4 == 1) {
				long[] var7 = new long[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var7[var6] = var1.readLong();
				}

				var2 = class512.method10338(var7);
			} else {
				if (var4 != 2) {
					throw new RuntimeException();
				}

				String[] var8 = new String[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var8[var6] = var1.readStringCp1252NullTerminated();
				}

				var2 = class458.method9410(var8);
			}

			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Lwj;I)V",
		garbageValue = "2098885611"
	)
	void method11036(DynamicArray var1, Buffer var2) {
		var1.method10359(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "20"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = World.World_worlds[var9];
				int var12 = SecureUrlRequester.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = SecureUrlRequester.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var14;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
