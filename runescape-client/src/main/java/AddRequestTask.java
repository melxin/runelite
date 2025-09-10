import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsi;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5303 = "AddRequestTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		while (!class339.field3895.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class339.field3895.peek();
			if (var1 == null) {
				class339.field3895.pop();
			} else {
				var1.midiPcmStream = this.method9638();
				class339.midiRequests.add(var1);
				class339.field3895.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "1021257879"
	)
	MidiPcmStream method9638() {
		MidiPcmStream var1 = null;
		Iterator var2 = class339.field3888.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3904;
							if (var1.method7139() == 0 && var1.isReady()) {
								var1.clear();
								var1.method7143();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3904 <= var3.field3904 && (var3.method7139() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lct;B)V",
		garbageValue = "-108"
	)
	static final void method9640(WorldView var0, Actor var1) {
		Client.field399.method10862(var0, var1.x, var1.y, var1 == HealthBarUpdate.localPlayer);
		int var2 = class145.method3747(var1.poseAnimationSequence, 1, Client.field399);
		if ((var2 & 2) != 0) {
			var1.poseAnimationSequence.method9572();
		}

		var1.field1093.setSequence(var1.idleSequence);
		if (var1.poseAnimationSequence.method9574() > 0 && var1.field1093.method9574() < 30) {
			if (var1.poseAnimationSequence.getId() == var1.field1093.getId()) {
				var1.field1093.setSequence(var1.poseAnimationSequence);
			} else {
				int var3 = class145.method3747(var1.field1093, 1, (class468)null);
				if ((var3 & 2) != 0) {
					var1.field1093.method9572();
				}
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var1.method2429());

		for (ActorSpotAnim var4 = (ActorSpotAnim)var7.method8573(); var4 != null; var4 = (ActorSpotAnim)var7.next()) {
			if (var4.id != -1 && Client.cycle >= var4.field5444) {
				AnimationSequence var5 = var4.animationSequence;
				if (!var5.isActive()) {
					var4.remove();
					--var1.graphicsCount;
				} else {
					int var6 = class145.method3747(var5, 1, Client.field399);
					if ((var6 & 1) != 0) {
						var4.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.animationSequence.isActive() && var1.field1102 <= 1) {
			SequenceDefinition var9 = var1.animationSequence.getSequenceDefinition();
			if (var9.field2492 == 1 && var1.field1040 > 0 && var1.spotAnimation <= Client.cycle && var1.field1094 < Client.cycle) {
				var1.field1102 = 1;
				return;
			}
		}

		if (var1.field1102 > 0) {
			--var1.field1102;
		} else {
			int var8 = class145.method3747(var1.animationSequence, 1, Client.field399);
			if ((var8 & 2) != 0) {
				var1.animationSequence.reset();
			}
		}

		var1.isWalking = var1.animationSequence.isActive() && var1.animationSequence.getSequenceDefinition().field2482;
		Client.field399.method10859();
	}
}
