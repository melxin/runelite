import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static Widget field295;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static Bounds field299;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field292;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeHashTable field293;

	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field293 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field292 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbj;",
		garbageValue = "624892547"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method869(var1, var2, false);
		class53 var6 = (class53)this.field293.get(var4);
		if (var6 != null) {
			return var6.method1089();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field293.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.field240.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lcg;",
		garbageValue = "563861007"
	)
	class53 method880(int var1, int var2) {
		long var3 = this.method869(var1, var2, true);
		class53 var5 = (class53)this.field293.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field292, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field293.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbj;",
		garbageValue = "318454101"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcg;",
		garbageValue = "84"
	)
	public class53 method870(int var1) {
		if (this.field292.getGroupCount() == 1) {
			return this.method880(0, var1);
		} else if (this.field292.getGroupFileCount(var1) == 1) {
			return this.method880(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lbj;",
		garbageValue = "-148864622"
	)
	public RawSound method868(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1391685606"
	)
	long method869(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2062827274"
	)
	static int method879(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	public static void method864() {
		Iterator var0 = class335.midiRequests.iterator();

		while (var0.hasNext()) {
			MidiRequest var1 = (MidiRequest)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6637();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3708 = 0;
				class359.method6985(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class335.midiRequests.clear();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "-167538467"
	)
	static int method884(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (friendsChat != null) {
			friendsChat.invalidateIgnoreds();
		}

	}
}
