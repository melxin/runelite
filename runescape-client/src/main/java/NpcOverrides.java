import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hu")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -7069476798080068169L
	)
	public long field2066;
	@ObfuscatedName("ab")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("au")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2066 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1052793079"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class332.World_request == null) {
				class332.World_request = class203.urlRequester.request(new URL(User.field5291));
			} else if (class332.World_request.isDone()) {
				byte[] var0 = class332.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class407.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class332.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class332.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "441834907"
	)
	public static void method4307() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "1829334454"
	)
	static int method4305(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			var3 = class167.widgetDefinition.method7456(var4);
		} else {
			var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		Widget[] var5;
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
			var3.rawX = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var3.rawY = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			var3.xAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			var3.yAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
			ApproximateRouteStrategy.invalidateWidget(var3);
			Language.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -64977777 == -1 ? class167.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class167.widgetDefinition.method7456(var3.parentId).children;
				Tiles.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
			var3.rawWidth = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var3.rawHeight = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			var3.widthAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			var3.heightAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
			ApproximateRouteStrategy.invalidateWidget(var3);
			Language.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -64977777 == -1 ? class167.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class167.widgetDefinition.method7456(var3.parentId).children;
				Tiles.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			if (var6 != var3.isHidden) {
				var3.isHidden = var6;
				ApproximateRouteStrategy.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var3.noClickThrough = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var3.noScrollThrough = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
