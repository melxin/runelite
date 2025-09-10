import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class401 {
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -2105622257
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -336208599
	)
	static int field4853;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;",
		garbageValue = "1771498025"
	)
	public static TransformationMatrix method8245() {
		synchronized(TransformationMatrix.field5185) {
			if (class172.field1931 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field5185[--class172.field1931].method9090();
				return TransformationMatrix.field5185[class172.field1931];
			}
		}
	}
}
