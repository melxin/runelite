import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static Widget field5138;
	@ObfuscatedName("an")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-216728409"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;B)I",
		garbageValue = "-1"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "31"
	)
	public static int method9226(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5600[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "3"
	)
	static final void method9227(Actor var0) {
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var1 = class91.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						GrandExchangeEvents.method7827(var1, var0.movementFrame, var0.x, var0.y, Script.localPlayer == var0);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field3026) {
								++var0.field1260;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field3026 && var0.field1260 >= var1.field3025) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1260 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						GrandExchangeEvents.method7827(var1, var0.movementFrame, var0.x, var0.y, Script.localPlayer == var0);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					int var2 = var1.getMayaAnimFrame();
					if (var0.movementFrame < var2) {
						GrandExchangeEvents.method7827(var1, var0.movementFrame, var0.x, var0.y, Script.localPlayer == var0);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field3026) {
								++var0.field1260;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field3026 && var0.field1260 >= var1.field3025) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1260 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						GrandExchangeEvents.method7827(var1, var0.movementFrame, var0.x, var0.y, Script.localPlayer == var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2647());

		int var3;
		for (ActorSpotAnim var6 = (ActorSpotAnim)var7.method7939(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
			if (var6.spotAnimation != -1 && Client.cycle >= var6.field5188) {
				var3 = ArchiveLoader.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
				if (var3 == -1) {
					var6.remove();
					--var0.graphicsCount;
				} else {
					var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
					SequenceDefinition var4 = class91.SequenceDefinition_get(var3);
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrameCycle;
						if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
							var6.spotAnimationFrameCycle = 1;
							++var6.spotAnimationFrame;
							GrandExchangeEvents.method7827(var4, var6.spotAnimationFrame, var0.x, var0.y, Script.localPlayer == var0);
						}

						if (var6.spotAnimationFrame >= var4.frameIds.length) {
							var6.remove();
							--var0.graphicsCount;
						}
					} else if (var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrame;
						int var5 = var4.getMayaAnimFrame();
						if (var6.spotAnimationFrame < var5) {
							GrandExchangeEvents.method7827(var4, var6.spotAnimationFrame, var0.x, var0.y, Script.localPlayer == var0);
						} else {
							var6.remove();
							--var0.graphicsCount;
						}
					} else {
						var6.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var8 = class91.SequenceDefinition_get(var0.sequence);
			if (var8.field3010 == 1 && var0.field1284 > 0 && var0.spotAnimation <= Client.cycle && var0.field1273 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = class91.SequenceDefinition_get(var0.sequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						GrandExchangeEvents.method7827(var8, var0.sequenceFrame, var0.x, var0.y, Script.localPlayer == var0);
					}

					if (var0.sequenceFrame >= var8.frameIds.length) {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1265;
						if (var0.field1265 >= var8.field3025) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
							GrandExchangeEvents.method7827(var8, var0.sequenceFrame, var0.x, var0.y, Script.localPlayer == var0);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var8.field3009;
				} else if (var8.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var3 = var8.getMayaAnimFrame();
					if (var0.sequenceFrame < var3) {
						GrandExchangeEvents.method7827(var8, var0.sequenceFrame, var0.x, var0.y, Script.localPlayer == var0);
					} else {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1265;
						if (var0.field1265 >= var8.field3025) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
							GrandExchangeEvents.method7827(var8, var0.sequenceFrame, var0.x, var0.y, Script.localPlayer == var0);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
