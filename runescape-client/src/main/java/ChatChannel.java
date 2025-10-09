import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1327006193
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Widget field800;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 1361905301
	)
	static int field803;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2089289801
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbx;",
		garbageValue = "-1456747944"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbx;",
		garbageValue = "-1"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1273108835"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ltl;B)I",
		garbageValue = "38"
	)
	public static int method2054(DynamicArray var0, DynamicArray var1) {
		if (var1 == var0) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var2 = var0.method10433();
			int var3 = var1.method10433();
			int var4 = Math.min(var2, var3);
			int var7;
			if (var0.field5571 == class572.field5879 && class572.field5879 == var1.field5571) {
				int[] var10 = var0.method10430();
				int[] var12 = var1.method10430();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var10[var7] < var12[var7]) {
						return -1;
					}

					if (var10[var7] > var12[var7]) {
						return 1;
					}
				}
			} else if (var0.field5571 == class572.field5878 && class572.field5878 == var1.field5571) {
				long[] var9 = var0.method10431();
				long[] var11 = var1.method10431();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var9[var7] < var11[var7]) {
						return -1;
					}

					if (var9[var7] > var11[var7]) {
						return 1;
					}
				}
			} else {
				if (var0.field5571 != class572.field5877 || class572.field5877 != var1.field5571) {
					throw new RuntimeException();
				}

				Object[] var5 = var0.method10428();
				Object[] var6 = var1.method10428();

				for (var7 = 0; var7 < var4; ++var7) {
					int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
					if (var8 < 0) {
						return -1;
					}

					if (var8 > 0) {
						return 1;
					}
				}
			}

			return var2 < var3 ? -1 : (var2 == var3 ? 0 : 1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIB)V",
		garbageValue = "91"
	)
	static final void method2057(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Tiles.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-1251918862"
	)
	static final void method2058(Actor var0) {
		boolean var1 = var0.field1083 == Client.cycle || !var0.method2447();
		if (!var1) {
			SequenceDefinition var2 = var0.animationSequence.getSequenceDefinition();
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.animationSequence.getFrameCycle() + 1 > var2.frameLengths[var0.animationSequence.getFrame()];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1083 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1032 * 128 + var0.size * 64;
			int var5 = var0.field1080 * 128 + var0.size * 64;
			int var6 = var0.field1061 * 128 + var0.size * 64;
			int var7 = var0.field1055 * 128 + var0.size * 64;
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
			var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8;
		}

		var0.field1093 = 0;
		var0.orientation = var0.field1084;
		var0.rotation = var0.orientation;
	}
}
