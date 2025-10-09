import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("av")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3) {
		int var4 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var4];
		Skeleton var5 = null;
		int[] var6 = var1.getGroupFileIds(var3);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var1.takeFile(var3, var6[var7]);
			if (var5 == null) {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var2.getFile(var9, 0);
				var5 = new Skeleton(var9, var10);
			}

			this.frames[var6[var7]] = new Animation(var8, var5);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1393509855"
	)
	static final void method5459(String var0) {
		class292.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;I)I",
		garbageValue = "1988870365"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = class416.method8556(var9);
			var8 = class416.method8556(var10);
			var9 = class409.standardizeChar(var9, var2);
			var10 = class409.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return Actor.lowercaseChar(var9, var2) - Actor.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var12 != var11) {
					return Actor.lowercaseChar(var11, var2) - Actor.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return Actor.lowercaseChar(var12, var2) - Actor.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "304896636"
	)
	static void method5460() {
		class146.method3876(24);
		class203.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1541346005"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		AbstractUserComparator.method10062();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
