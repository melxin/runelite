import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -2080262311
	)
	static int field3313;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1479556057
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 484692617
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 427356961
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lng;Lng;ILla;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = GrandExchangeOfferAgeComparator.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "43009635"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "9"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1977770397"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)Ljava/lang/String;",
		garbageValue = "29"
	)
	public static String method6722(Buffer var0) {
		return class190.method4291(var0, 32767);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "2"
	)
	static int method6721(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-20"
	)
	static int method6723(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			NPCComposition var6 = class191.getNpcDefinition(var5);
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var3 = class191.getNpcDefinition(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.method4321(var4);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.method4360(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class191.getNpcDefinition(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
