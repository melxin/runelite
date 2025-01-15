import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 812877491
	)
	@Export("group")
	int group;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 661452433
	)
	@Export("type")
	int type;
	@ObfuscatedName("az")
	boolean field1071;

	InterfaceParent() {
		this.field1071 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;I)V",
		garbageValue = "-1285017470"
	)
	public static void method2618(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field2572 = var1;
	}
}
