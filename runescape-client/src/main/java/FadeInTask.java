import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	static AbstractSocket field5377;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	MidiRequest field5375;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1112736735
	)
	int field5376;

	@ObfuscatedSignature(
		descriptor = "(Lsz;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5375 = null;
		this.field5376 = 0;
		super.field5378 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class345.field3933.size()) {
				this.field5375 = (MidiRequest)class345.field3933.get(var2);
			} else if (!var3 && var2 < class345.midiRequests.size()) {
				this.field5375 = (MidiRequest)class345.midiRequests.get(var2);
			}

			this.field5376 = var4;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		if (this.field5375 != null && this.field5375.midiPcmStream != null) {
			this.field5375.field4050 = true;

			try {
				if (this.field5375.field4046 < (float)this.field5375.musicTrackVolume && this.field5375.midiPcmStream.isReady()) {
					float var1 = this.field5376 == 0 ? (float)this.field5376 : (float)this.field5375.musicTrackVolume / (float)this.field5376;
					MidiRequest var10000 = this.field5375;
					var10000.field4046 += var1 == 0.0F ? (float)this.field5375.musicTrackVolume : var1;
					if (this.field5375.field4046 > (float)this.field5375.musicTrackVolume) {
						this.field5375.field4046 = (float)this.field5375.musicTrackVolume;
					}

					this.field5375.midiPcmStream.setPcmStreamVolume((int)this.field5375.field4046);
					return false;
				}
			} catch (Exception var3) {
				this.method9950(var3.getMessage());
				return true;
			}

			this.field5375.field4050 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-826368912"
	)
	static final void method9940() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)var1.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (BuddyRankComparator.friendsChat != null) {
			BuddyRankComparator.friendsChat.clearFriends();
		}

	}
}
