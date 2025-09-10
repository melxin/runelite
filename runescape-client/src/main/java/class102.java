import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class102 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	VorbisSample field1386;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	RawSound field1387;
	@ObfuscatedName("at")
	ReentrantLock field1388;

	@ObfuscatedSignature(
		descriptor = "(Leo;Ldv;)V"
	)
	class102(VorbisSample var1, RawSound var2) {
		this.field1386 = var1;
		this.field1387 = var2;
		this.field1388 = new ReentrantLock();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1494324479"
	)
	public static void method3148() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}
}
