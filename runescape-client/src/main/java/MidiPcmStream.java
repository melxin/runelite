import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("by")
	static AtomicBoolean field3666;
	@ObfuscatedName("bm")
	static ThreadPoolExecutor field3667;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -410635123
	)
	int field3638;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 734475531
	)
	int field3639;
	@ObfuscatedName("ao")
	int[] field3648;
	@ObfuscatedName("ad")
	int[] field3641;
	@ObfuscatedName("an")
	int[] field3642;
	@ObfuscatedName("ae")
	int[] field3643;
	@ObfuscatedName("ax")
	int[] field3649;
	@ObfuscatedName("at")
	int[] field3640;
	@ObfuscatedName("ac")
	int[] field3644;
	@ObfuscatedName("au")
	int[] field3647;
	@ObfuscatedName("as")
	int[] field3637;
	@ObfuscatedName("aw")
	int[] field3651;
	@ObfuscatedName("ai")
	int[] field3650;
	@ObfuscatedName("ar")
	int[] field3669;
	@ObfuscatedName("am")
	int[] field3652;
	@ObfuscatedName("ap")
	int[] field3665;
	@ObfuscatedName("ab")
	int[] field3654;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3655;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3656;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bw")
	boolean field3659;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1656712043
	)
	@Export("track")
	int track;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 754007923
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 3254050521887839121L
	)
	long field3661;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = -3823371857040521559L
	)
	long field3662;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bf")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1132771239
	)
	public int field3668;

	static {
		field3666 = null;
		field3667 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbq;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3638 = 256;
		this.field3639 = 1000000;
		this.field3648 = new int[16];
		this.field3641 = new int[16];
		this.field3642 = new int[16];
		this.field3643 = new int[16];
		this.field3649 = new int[16];
		this.field3640 = new int[16];
		this.field3644 = new int[16];
		this.field3647 = new int[16];
		this.field3637 = new int[16];
		this.field3651 = new int[16];
		this.field3650 = new int[16];
		this.field3669 = new int[16];
		this.field3652 = new int[16];
		this.field3665 = new int[16];
		this.field3654 = new int[16];
		this.field3655 = new MusicPatchNode[16][128];
		this.field3656 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class344());
		this.field3668 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6731();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1287356357"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3638 = var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1455965430"
	)
	public int method6710() {
		return this.field3638;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Lpq;Lbs;I)Z",
		garbageValue = "580591264"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class346 var6 = (class346)var1.field3712.first(); var6 != null; var6 = (class346)var1.field3712.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class149.method3586(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6887(var3, var6.field3748)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3694.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class337(var6.field3751, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753530905"
	)
	public void method6712() {
		if (this.priorityQueue != null) {
			if (field3666 != null) {
				field3666.set(true);
			}

			field3666 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3666;
			if (field3667 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3667 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class336(this));
			}

			field3667.submit(new class340(this, var1));
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1485904141"
	)
	public void method6713() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6888();
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ax")
	protected int vmethod6927() {
		return 0;
	}

	@ObfuscatedName("at")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3639 * -727379968 / PcmPlayer.field257;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3661;
				if (this.field3662 - var5 >= 0L) {
					this.field3661 = var5;
					break;
				}

				int var7 = (int)((this.field3662 - this.field3661 + (long)var4 - 1L) / (long)var4);
				this.field3661 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6744();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-272372987"
	)
	public void method6714() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3639 * -727379968 / PcmPlayer.field257;

			do {
				long var3 = (long)var2 * (long)var1 + this.field3661;
				if (this.field3662 - var3 >= 0L) {
					this.field3661 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3662 - this.field3661) - 1L) / (long)var2);
				this.field3661 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6744();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnx;ZI)V",
		garbageValue = "-1658894017"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3659 = var2;
			this.field3661 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3662 = this.midiFile.method6850(this.trackLength);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6731();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-697656511"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-15404535"
	)
	public boolean method6749() {
		synchronized(this.player) {
			return this.musicPatches.method9995() > 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1971479199"
	)
	public void method6719(int var1, int var2) {
		synchronized(this.player) {
			this.method6720(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-221864183"
	)
	void method6720(int var1, int var2) {
		this.field3643[var1] = var2;
		this.field3640[var1] = var2 & -128;
		this.method6782(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1866947017"
	)
	void method6782(int var1, int var2) {
		if (var2 != this.field3649[var1]) {
			this.field3649[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3656[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "64524799"
	)
	void method6780(int var1, int var2, int var3) {
		this.method6724(var1, var2, 64);
		if ((this.field3651[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3731 == var1 && var4.field3727 < 0) {
					this.field3655[var1][var4.field3718] = null;
					this.field3655[var1][var2] = var4;
					int var8 = (var4.field3722 * var4.field3723 >> 12) + var4.field3721;
					var4.field3721 += var2 - var4.field3718 << 8;
					var4.field3722 = var8 - var4.field3721;
					var4.field3723 = 4096;
					var4.field3718 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3649[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1119();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3731 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3716 = var9.field3697[var2];
					var6.field3717 = var9.field3692[var2];
					var6.field3718 = var2;
					var6.field3720 = var3 * var3 * var9.field3695[var2] * var9.field3698 + 1024 >> 11;
					var6.field3719 = var9.field3696[var2] & 255;
					var6.field3721 = (var2 << 8) - (var9.field3691[var2] & 32767);
					var6.field3724 = 0;
					var6.field3715 = 0;
					var6.field3726 = 0;
					var6.field3727 = -1;
					var6.field3714 = 0;
					if (this.field3652[var1] == 0) {
						var6.stream = RawPcmStream.method911(var5, this.method6736(var6), this.method6737(var6), this.method6738(var6));
					} else {
						var6.stream = RawPcmStream.method911(var5, this.method6736(var6), 0, this.method6738(var6));
						this.method6723(var6, var9.field3691[var2] < 0);
					}

					if (var9.field3691[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3717 >= 0) {
						MusicPatchNode var7 = this.field3656[var1][var6.field3717];
						if (var7 != null && var7.field3727 < 0) {
							this.field3655[var1][var7.field3718] = null;
							var7.field3727 = 0;
						}

						this.field3656[var1][var6.field3717] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3655[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lne;ZB)V",
		garbageValue = "-63"
	)
	void method6723(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field244) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3652[var1.field3731] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method974();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3652[var1.field3731] >> 6);
		}

		var1.stream.method1050(var4);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "125"
	)
	void method6724(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3655[var1][var2];
		if (var4 != null) {
			this.field3655[var1][var2] = null;
			if ((this.field3651[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3731 == var4.field3731 && var5.field3727 < 0 && var4 != var5) {
						var4.field3727 = 0;
						break;
					}
				}
			} else {
				var4.field3727 = 0;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "65280"
	)
	void method6725(int var1, int var2, int var3) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1744070669"
	)
	void method6726(int var1, int var2) {
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "824603693"
	)
	void method6727(int var1, int var2) {
		this.field3644[var1] = var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "125"
	)
	void method6791(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3731 == var1) {
				if (var2.stream != null) {
					var2.stream.method924(PcmPlayer.field257 / 100);
					if (var2.stream.method928()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6931();
				}

				if (var2.field3727 < 0) {
					this.field3655[var2.field3731][var2.field3718] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6729(int var1) {
		if (var1 >= 0) {
			this.field3648[var1] = 12800;
			this.field3641[var1] = 8192;
			this.field3642[var1] = 16383;
			this.field3644[var1] = 8192;
			this.field3647[var1] = 0;
			this.field3637[var1] = 8192;
			this.method6817(var1);
			this.method6733(var1);
			this.field3651[var1] = 0;
			this.field3650[var1] = 32767;
			this.field3669[var1] = 256;
			this.field3652[var1] = 0;
			this.method6735(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6729(var1);
			}

		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6754(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3731 == var1) && var2.field3727 < 0) {
				this.field3655[var2.field3731][var2.field3718] = null;
				var2.field3727 = 0;
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	void method6731() {
		this.method6791(-1);
		this.method6729(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3649[var1] = this.field3643[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3640[var1] = this.field3643[var1] & -128;
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-250442588"
	)
	void method6817(int var1) {
		if ((this.field3651[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3731 == var1 && this.field3655[var1][var2.field3718] == null && var2.field3727 < 0) {
					var2.field3727 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-336120997"
	)
	void method6733(int var1) {
		if ((this.field3651[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3731 == var1) {
					var2.field3733 = 0;
				}
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "33"
	)
	void method6770(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6724(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6780(var3, var4, var5);
			} else {
				this.method6724(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6725(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3640[var3] = (var5 << 14) + (this.field3640[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3640[var3] = (var5 << 7) + (this.field3640[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3647[var3] = (var5 << 7) + (this.field3647[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3647[var3] = var5 + (this.field3647[var3] & -128);
			}

			if (var4 == 5) {
				this.field3637[var3] = (var5 << 7) + (this.field3637[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3637[var3] = var5 + (this.field3637[var3] & -128);
			}

			if (var4 == 7) {
				this.field3648[var3] = (var5 << 7) + (this.field3648[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3648[var3] = var5 + (this.field3648[var3] & -128);
			}

			if (var4 == 10) {
				this.field3641[var3] = (var5 << 7) + (this.field3641[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3641[var3] = var5 + (this.field3641[var3] & -128);
			}

			if (var4 == 11) {
				this.field3642[var3] = (var5 << 7) + (this.field3642[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3642[var3] = var5 + (this.field3642[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3651;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3651;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3651;
					var10000[var3] |= 2;
				} else {
					this.method6817(var3);
					var10000 = this.field3651;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3650[var3] = (var5 << 7) + (this.field3650[var3] & 127);
			}

			if (var4 == 98) {
				this.field3650[var3] = (this.field3650[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3650[var3] = (var5 << 7) + (this.field3650[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3650[var3] = (this.field3650[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6791(var3);
			}

			if (var4 == 121) {
				this.method6729(var3);
			}

			if (var4 == 123) {
				this.method6754(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3650[var3];
				if (var6 == 16384) {
					this.field3669[var3] = (var5 << 7) + (this.field3669[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3650[var3];
				if (var6 == 16384) {
					this.field3669[var3] = var5 + (this.field3669[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3652[var3] = (var5 << 7) + (this.field3652[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3652[var3] = var5 + (this.field3652[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3651;
					var10000[var3] |= 4;
				} else {
					this.method6733(var3);
					var10000 = this.field3651;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6735(var3, (var5 << 7) + (this.field3665[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6735(var3, var5 + (this.field3665[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6782(var3, var4 + this.field3640[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6726(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6727(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6731();
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "27268525"
	)
	void method6735(int var1, int var2) {
		this.field3665[var1] = var2;
		this.field3654[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "688799447"
	)
	int method6736(MusicPatchNode var1) {
		int var2 = (var1.field3723 * var1.field3722 >> 12) + var1.field3721;
		var2 += (this.field3644[var1.field3731] - 8192) * this.field3669[var1.field3731] >> 12;
		MusicPatchNode2 var3 = var1.field3716;
		int var4;
		if (var3.field3621 > 0 && (var3.field3618 > 0 || this.field3647[var1.field3731] > 0)) {
			var4 = var3.field3618 << 2;
			int var5 = var3.field3622 << 1;
			if (var1.field3729 < var5) {
				var4 = var4 * var1.field3729 / var5;
			}

			var4 += this.field3647[var1.field3731] >> 7;
			double var6 = Math.sin((double)(var1.field3730 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field257 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "167576027"
	)
	int method6737(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3716;
		int var3 = this.field3648[var1.field3731] * this.field3642[var1.field3731] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3720 + 16384 >> 15;
		var3 = var3 * this.field3638 + 128 >> 8;
		if (var2.field3616 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3724 * (double)var2.field3616) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3614 != null) {
			var4 = var1.field3715;
			var5 = var2.field3614[var1.field3726 * 2 + 1];
			if (var1.field3726 * 2 < var2.field3614.length - 2) {
				var6 = (var2.field3614[var1.field3726 * 2] & 255) << 8;
				var7 = (var2.field3614[var1.field3726 * 2 + 2] & 255) << 8;
				var5 += (var2.field3614[var1.field3726 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3727 > 0 && var2.field3615 != null) {
			var4 = var1.field3727;
			var5 = var2.field3615[var1.field3714 * 2 + 1];
			if (var1.field3714 * 2 < var2.field3615.length - 2) {
				var6 = (var2.field3615[var1.field3714 * 2] & 255) << 8;
				var7 = (var2.field3615[var1.field3714 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3615[var1.field3714 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "1838475002"
	)
	int method6738(MusicPatchNode var1) {
		int var2 = this.field3641[var1.field3731];
		return var2 < 8192 ? var2 * var1.field3719 + 32 >> 6 : 16384 - ((128 - var1.field3719) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071802591"
	)
	void method6744() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3662; var2 == this.trackLength; var3 = this.midiFile.method6850(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3659 || var2 == 0) {
							this.method6731();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6770(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3662 = var3;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)Z",
		garbageValue = "-1590069172"
	)
	boolean method6745(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3727 >= 0) {
				var1.remove();
				if (var1.field3717 > 0 && var1 == this.field3656[var1.field3731][var1.field3717]) {
					this.field3656[var1.field3731][var1.field3717] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIII)Z",
		garbageValue = "-2055070840"
	)
	boolean method6746(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3728 = PcmPlayer.field257 / 100;
		if (var1.field3727 < 0 || var1.stream != null && !var1.stream.method927()) {
			int var5 = var1.field3723;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3637[var1.field3731] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3723 = var5;
			}

			var1.stream.method1040(this.method6736(var1));
			MusicPatchNode2 var6 = var1.field3716;
			boolean var7 = false;
			++var1.field3729;
			var1.field3730 += var6.field3621;
			double var8 = (double)((var1.field3718 - 60 << 8) + (var1.field3723 * var1.field3722 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3616 > 0) {
				if (var6.field3619 > 0) {
					var1.field3724 = var1.field3724 * -1698938880 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3619) + 0.5D) * -1698938880;
				} else {
					var1.field3724 = var1.field3724 * -1698938880 + 1579155456;
				}
			}

			if (var6.field3614 != null) {
				if (var6.field3617 > 0) {
					var1.field3715 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3617) + 0.5D);
				} else {
					var1.field3715 += 128;
				}

				while (var1.field3726 * 2 < var6.field3614.length - 2 && var1.field3715 > (var6.field3614[var1.field3726 * 2 + 2] & 255) << 8) {
					var1.field3726 = var1.field3726 * 4 + 4;
				}

				if (var1.field3726 * 2 == var6.field3614.length - 2 && var6.field3614[var1.field3726 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3727 >= 0 && var6.field3615 != null && (this.field3651[var1.field3731] & 1) == 0 && (var1.field3717 < 0 || var1 != this.field3656[var1.field3731][var1.field3717])) {
				if (var6.field3620 > 0) {
					var1.field3727 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3620 * var8) + 0.5D);
				} else {
					var1.field3727 += 128;
				}

				while (var1.field3714 * 2 < var6.field3615.length - 2 && var1.field3727 > (var6.field3615[var1.field3714 * 2 + 2] & 255) << 8) {
					var1.field3714 = var1.field3714 * 4 + 4;
				}

				if (var1.field3714 * 2 == var6.field3615.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method924(var1.field3728);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method928()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6931();
				if (var1.field3727 >= 0) {
					var1.remove();
					if (var1.field3717 > 0 && var1 == this.field3656[var1.field3731][var1.field3717]) {
						this.field3656[var1.field3731][var1.field3717] = null;
					}
				}

				return true;
			} else {
				var1.stream.method1008(var1.field3728, this.method6737(var1), this.method6738(var1));
				return false;
			}
		} else {
			var1.method6931();
			var1.remove();
			if (var1.field3717 > 0 && var1 == this.field3656[var1.field3731][var1.field3717]) {
				this.field3656[var1.field3731][var1.field3717] = null;
			}

			return true;
		}
	}
}
