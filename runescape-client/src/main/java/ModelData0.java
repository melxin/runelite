import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ab")
	final int[] field5071;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -789887503
	)
	int field5072;

	public ModelData0(int var1) {
		this.field5071 = new int[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1109114007"
	)
	public void method9006(int var1) {
		this.field5071[++this.field5072 - 1] = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "15163"
	)
	public int method9007(int var1) {
		return this.field5071[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1383393403"
	)
	public int method9005() {
		return this.field5072;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1828255679"
	)
	public void method9009() {
		this.field5072 = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljt;",
		garbageValue = "-97"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class246.method5176(SequenceDefinition.SequenceDefinition_animationsArchive, class194.SpotAnimationDefinition_archive, var0);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
