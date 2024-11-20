import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ae")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ac")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aj")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("av")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("an")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -428395373
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1721967107
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ay")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aa")
	static boolean field871;
	@ObfuscatedName("aq")
	static boolean field868;
	@ObfuscatedName("am")
	static ArrayList field873;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1085097899
	)
	static int field874;
	@ObfuscatedName("bt")
	static final double field864;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field871 = false;
		field868 = false;
		field873 = new ArrayList();
		field874 = 0;
		field864 = Math.log(2.0D);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "1269711124"
	)
	static PacketBufferNode method2155() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "61"
	)
	static final int method2104(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-368263244"
	)
	public static int method2156(int var0, int var1, int var2) {
		int var3 = class139.method3386(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "37624772"
	)
	static boolean method2127(int var0) {
		for (int var1 = 0; var1 < Client.field743; ++var1) {
			if (Client.field745[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
