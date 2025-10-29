import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class48 {
	@ObfuscatedName("au")
	static final BigInteger field655;
	@ObfuscatedName("az")
	static final BigInteger field656;

	static {
		field655 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field656 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-933848389"
	)
	static int method1938(int var0) {
		return var0 - 1;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldv;B)Z",
		garbageValue = "2"
	)
	static boolean method1941(NPC var0) {
		if (!var0.definition.method4482()) {
			return false;
		} else {
			for (int var1 = 0; var1 < Occluder.topLevelWorldView.field1148.method10038(); ++var1) {
				WorldEntity var2 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)Occluder.topLevelWorldView.field1148.method10037(var1));
				if (var2 != null && var2.worldView.scene.cycle == Client.cycle && !var2.method10502() && class495.method10096(var2, var0)) {
					return true;
				}
			}

			return false;
		}
	}
}
