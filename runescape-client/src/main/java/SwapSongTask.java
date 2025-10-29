import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsz;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5378 = "SwapSongTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		if (class345.midiRequests.size() > 1 && class345.midiRequests.get(0) != null && ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady() && class345.midiRequests.get(1) != null && ((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class345.midiRequests.get(0);
			class345.midiRequests.set(0, class345.midiRequests.get(1));
			class345.midiRequests.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	static final void method9921(String var0) {
		class356.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lwh;Ljava/lang/Object;B)V",
		garbageValue = "-89"
	)
	static void method9926(class586 var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5941) {
			case 0:
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var1;
				break;
			case 3:
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (Integer)var1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
			}

		}
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	static void method9925() {
		if (Client.field444 && class330.localPlayer != null) {
			int var0 = class330.localPlayer.pathX[0];
			int var1 = class330.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			class40.oculusOrbFocalPointX = class330.localPlayer.x;
			int var2 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, class330.localPlayer.x, class330.localPlayer.y, Occluder.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < class289.oculusOrbFocalPointZ) {
				class289.oculusOrbFocalPointZ = var2;
			}

			class4.oculusOrbFocalPointY = class330.localPlayer.y;
			Client.field444 = false;
		}

	}
}
