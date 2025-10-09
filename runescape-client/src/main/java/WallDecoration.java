import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 5377812239843171079L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 290260849
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 296287657
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -429627473
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 272329847
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 466978823
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -490026635
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -309778379
	)
	int field3046;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1427268267
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1074292649
	)
	int field3044;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1633565455
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "73"
	)
	void method5847(int var1, int var2) {
		this.yOffset = var1;
		this.field3046 = var2;
		switch(this.orientation) {
		case 1:
			++var1;
			break;
		case 2:
			--var2;
		case 3:
		case 5:
		case 6:
		case 7:
		default:
			break;
		case 4:
			--var1;
			break;
		case 8:
			++var2;
		}

		this.xOffset = var1;
		this.field3044 = var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "12"
	)
	static int method5849(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
