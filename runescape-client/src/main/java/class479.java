import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sw")
public class class479 extends SongTask {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5310;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5309;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5311;

	@ObfuscatedSignature(
		descriptor = "(Lsi;Lpx;Lpx;Lpx;)V"
	)
	public class479(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5310 = var2;
		this.field5309 = var3;
		this.field5311 = var4;
		super.field5303 = "LoadSongTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		int var1 = 0;
		Iterator var2 = class339.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3904 > 1 && var3.midiPcmStream.method7256()) {
					this.method9659("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field4008) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field4003 == null) {
								var3.field4003 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field4003 == null) {
									continue;
								}
							}

							if (var3.field4006 == null) {
								var3.field4006 = new SoundCache(this.field5311, this.field5309);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field4003, this.field5310, var3.field4006)) {
								++var1;
								var3.field4008 = true;
								var3.midiPcmStream.method7141();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class508.RunException_sendStackTrace((String)null, var5);
						this.method9659(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class339.midiRequests.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-217428198"
	)
	static int method9675(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			EnumComposition var10 = VarcInt.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				EnumComposition var4 = VarcInt.getEnum(var3);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			UserComparator7.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
			EnumComposition var7 = VarcInt.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
