import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 771752219
	)
	static int field3329;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 710146413
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 708033615
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -479911227
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -926181235
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1825812815
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1635558445
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-127"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2003842246"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1047006974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "16776960"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnq;",
		garbageValue = "-1362839714"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2010052210"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1997568070"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lep;",
		garbageValue = "1047204703"
	)
	static AttackOption[] method6317() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1404, AttackOption.field1407, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels};
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)Ljava/lang/Object;",
		garbageValue = "1544225614"
	)
	static Object method6326(class555 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5493) {
			case 0:
				return Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			case 1:
				return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1026497896"
	)
	static boolean method6328(int var0) {
		for (int var1 = 0; var1 < Client.field579; ++var1) {
			if (Client.field752[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
