import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ap")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1396666983
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	static SpritePixels[] field1257;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -1994986839
	)
	static int field1260;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1202934909"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = HealthBarConfig.getPreferencesFile("", FontName.field5530.name, true);
			Buffer var1 = ClientPacket.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "-1010700983"
	)
	public static void method2787(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIII)Z",
		garbageValue = "-916934984"
	)
	static boolean method2806(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = class150.field1719 - var6;
		int var13 = IntHashTable.field5140 - var7;
		int var14 = class168.field1846 - var8;
		if (Math.abs(var12) > var9 + class159.field1777) {
			return false;
		} else if (Math.abs(var13) > var10 + class218.field2407) {
			return false;
		} else if (Math.abs(var14) > var11 + Interpreter.field680) {
			return false;
		} else if (Math.abs(var14 * Message.field257 - var13 * EnumComposition.field1991) > var10 * Interpreter.field680 + var11 * class218.field2407) {
			return false;
		} else if (Math.abs(var12 * EnumComposition.field1991 - var14 * JagexCache.field2431) > var9 * Interpreter.field680 + var11 * class159.field1777) {
			return false;
		} else {
			return Math.abs(var13 * JagexCache.field2431 - var12 * Message.field257) <= var10 * class159.field1777 + var9 * class218.field2407;
		}
	}
}
