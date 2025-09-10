import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -246449449
	)
	public static int field904;
	@ObfuscatedName("af")
	boolean field899;
	@ObfuscatedName("aw")
	@Export("args")
	Object[] args;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -16830371
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 718756911
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1368322837
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1604733201
	)
	int field897;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -163423073
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 595835473
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ai")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 777036783
	)
	int field902;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1145176903
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "125546287"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1771288626"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)V",
		garbageValue = "1403497876"
	)
	public void method2136(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) {
				World.World_request = class114.urlRequester.request(new URL(class268.field3179));
			} else if (World.World_request.isDone()) {
				byte[] var0 = World.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readShortSmart();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readShortSmart();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class464.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				World.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			World.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)Ljava/lang/String;",
		garbageValue = "-114"
	)
	public static String method2145(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readShortSmartSub();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.array += class376.huffman.decompress(var0.field5916, var0.array * 1216585693, var3, 0, var2) * -290410379;
			String var4 = FloorOverlayDefinition.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
