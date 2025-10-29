import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("CameraViewMode")
public enum CameraViewMode implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4455(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4454(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4457(2, 2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1598305657
	)
	@Export("mode")
	public final int mode;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2127446423
	)
	int field4456;

	CameraViewMode(int var3, int var4) {
		this.mode = var3;
		this.field4456 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4456;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lci;III)V",
		garbageValue = "-40656488"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		SequenceDefinition var3 = var0.animationSequence.getSequenceDefinition();
		if (var1 == var0.animationSequence.getId() && var1 != -1) {
			int var4 = var3.restartMode;
			if (var4 == 1) {
				var0.animationSequence.method9872();
				var0.field1017 = var2;
			}

			if (var4 == 2) {
				var0.animationSequence.method9890();
			}
		} else if (var1 == -1 || !var0.animationSequence.isActive() || ClientPacket.SequenceDefinition_get(var1).field2512 >= var3.field2512) {
			var0.animationSequence.setSequence(var1);
			var0.animationSequence.method9872();
			var0.field1017 = var2;
			var0.field1075 = var0.pathLength;
		}

	}
}
