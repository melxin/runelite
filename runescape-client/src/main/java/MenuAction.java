import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1888534493
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 616377407
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 819791699
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 469917353
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -850110859
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1405140087
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ah")
	@Export("action")
	String action;
	@ObfuscatedName("ap")
	@Export("target")
	String target;
	@ObfuscatedName("am")
	boolean field691;

	MenuAction() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-894686351"
	)
	static boolean method1865(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljx;IIIII)Z",
		garbageValue = "1575078166"
	)
	static boolean method1866(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = HttpContentType.field5455 - var6;
		int var13 = class172.field1901 - var7;
		int var14 = WorldMapIcon_0.field3313 - var8;
		if (Math.abs(var12) > var9 + class188.field2027) {
			return false;
		} else if (Math.abs(var13) > var10 + FontName.field5650) {
			return false;
		} else if (Math.abs(var14) > var11 + NPCOverheadIcons.field5822) {
			return false;
		} else if (Math.abs(var14 * Message.field248 - var13 * class214.field2459) > var10 * NPCOverheadIcons.field5822 + var11 * FontName.field5650) {
			return false;
		} else if (Math.abs(var12 * class214.field2459 - var14 * class159.field1801) > var11 * class188.field2027 + var9 * NPCOverheadIcons.field5822) {
			return false;
		} else {
			return Math.abs(var13 * class159.field1801 - var12 * Message.field248) <= var10 * class188.field2027 + var9 * FontName.field5650;
		}
	}
}
