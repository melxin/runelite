import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class48 {
	@ObfuscatedName("ag")
	static final BigInteger field686;
	@ObfuscatedName("ay")
	static final BigInteger field682;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		field686 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field682 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1432940801"
	)
	static final int method1862() {
		return ViewportMouse.ViewportMouse_x;
	}
}
