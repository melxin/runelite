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

@ObfuscatedName("mp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ak")
	public static short[][] field3729;
	@ObfuscatedName("by")
	static AtomicBoolean field3707;
	@ObfuscatedName("bh")
	static ThreadPoolExecutor field3712;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -595351473
	)
	int field3698;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -567604953
	)
	int field3699;
	@ObfuscatedName("ad")
	int[] field3700;
	@ObfuscatedName("ah")
	int[] field3725;
	@ObfuscatedName("ac")
	int[] field3702;
	@ObfuscatedName("ao")
	int[] field3716;
	@ObfuscatedName("af")
	int[] field3704;
	@ObfuscatedName("aa")
	int[] field3705;
	@ObfuscatedName("as")
	int[] field3706;
	@ObfuscatedName("ae")
	int[] field3727;
	@ObfuscatedName("ax")
	int[] field3708;
	@ObfuscatedName("am")
	int[] field3714;
	@ObfuscatedName("aq")
	int[] field3701;
	@ObfuscatedName("aw")
	int[] field3711;
	@ObfuscatedName("an")
	int[] field3724;
	@ObfuscatedName("at")
	int[] field3713;
	@ObfuscatedName("ap")
	int[] field3697;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lnm;"
	)
	MusicPatchNode[][] field3723;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[[Lnm;"
	)
	MusicPatchNode[][] field3710;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bs")
	boolean field3718;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 895309257
	)
	@Export("track")
	int track;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 2008532257
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -5234981910510820959L
	)
	long field3721;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = 6563888406576967871L
	)
	long field3722;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bu")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1404012883
	)
	public int field3728;

	static {
		field3707 = null;
		field3712 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbf;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3698 = 256;
		this.field3699 = 1000000;
		this.field3700 = new int[16];
		this.field3725 = new int[16];
		this.field3702 = new int[16];
		this.field3716 = new int[16];
		this.field3704 = new int[16];
		this.field3705 = new int[16];
		this.field3706 = new int[16];
		this.field3727 = new int[16];
		this.field3708 = new int[16];
		this.field3714 = new int[16];
		this.field3701 = new int[16];
		this.field3711 = new int[16];
		this.field3724 = new int[16];
		this.field3713 = new int[16];
		this.field3697 = new int[16];
		this.field3723 = new MusicPatchNode[16][128];
		this.field3710 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class346());
		this.field3728 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6628();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "265075419"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3698 = var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147209668"
	)
	public int method6608() {
		return this.field3698;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lpl;Lbi;I)Z",
		garbageValue = "1542986324"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class348 var6 = (class348)var1.field3773.first(); var6 != null; var6 = (class348)var1.field3773.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class146.method3455(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6786(var3, var6.field3817)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3762.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class339(var6.field3816, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "896231664"
	)
	public void method6610() {
		if (this.priorityQueue != null) {
			if (field3707 != null) {
				field3707.set(true);
			}

			field3707 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3707;
			if (field3712 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3712 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class338(this));
			}

			field3712.submit(new class342(this, var1));
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050125871"
	)
	public void method6611() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6788();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("af")
	protected int vmethod6801() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3699 * -727379968 / PcmPlayer.field284;

			do {
				long var5 = (long)var3 * (long)var4 + this.field3721;
				if (this.field3722 - var5 >= 0L) {
					this.field3721 = var5;
					break;
				}

				int var7 = (int)((this.field3722 - this.field3721 + (long)var4 - 1L) / (long)var4);
				this.field3721 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6641();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1175022688"
	)
	public void method6619() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3699 * -727379968 / PcmPlayer.field284;

			do {
				long var3 = (long)var1 * (long)var2 + this.field3721;
				if (this.field3722 - var3 >= 0L) {
					this.field3721 = var3;
					break;
				}

				int var5 = (int)((this.field3722 - this.field3721 + (long)var2 - 1L) / (long)var2);
				this.field3721 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6641();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lna;ZI)V",
		garbageValue = "-399481815"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3718 = var2;
			this.field3721 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3722 = this.midiFile.method6739(this.trackLength);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1072254861"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6628();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "905598524"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1621027724"
	)
	public boolean method6606() {
		synchronized(this.player) {
			return this.musicPatches.method7949() > 0;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void method6616(int var1, int var2) {
		synchronized(this.player) {
			this.method6617(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "913980390"
	)
	void method6617(int var1, int var2) {
		this.field3716[var1] = var2;
		this.field3705[var1] = var2 & -128;
		this.method6618(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1750829161"
	)
	void method6618(int var1, int var2) {
		if (var2 != this.field3704[var1]) {
			this.field3704[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3710[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "103"
	)
	void method6690(int var1, int var2, int var3) {
		this.method6621(var1, var2, 64);
		if ((this.field3714[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3774 == var1 && var4.field3788 < 0) {
					this.field3723[var1][var4.field3779] = null;
					this.field3723[var1][var2] = var4;
					int var8 = (var4.field3784 * var4.field3783 >> 12) + var4.field3782;
					var4.field3782 += var2 - var4.field3779 << 8;
					var4.field3783 = var8 - var4.field3782;
					var4.field3784 = 4096;
					var4.field3779 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3704[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1065();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3774 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3777 = var9.field3759[var2];
					var6.field3785 = var9.field3761[var2];
					var6.field3779 = var2;
					var6.field3780 = var3 * var3 * var9.field3758[var2] * var9.field3755 + 1024 >> 11;
					var6.field3781 = var9.field3760[var2] & 255;
					var6.field3782 = (var2 << 8) - (var9.field3757[var2] & 32767);
					var6.field3795 = 0;
					var6.field3796 = 0;
					var6.field3787 = 0;
					var6.field3788 = -1;
					var6.field3778 = 0;
					if (this.field3724[var1] == 0) {
						var6.stream = RawPcmStream.method866(var5, this.method6649(var6), this.method6686(var6), this.method6635(var6));
					} else {
						var6.stream = RawPcmStream.method866(var5, this.method6649(var6), 0, this.method6635(var6));
						this.method6620(var6, var9.field3757[var2] < 0);
					}

					if (var9.field3757[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3785 >= 0) {
						MusicPatchNode var7 = this.field3710[var1][var6.field3785];
						if (var7 != null && var7.field3788 < 0) {
							this.field3723[var1][var7.field3779] = null;
							var7.field3788 = 0;
						}

						this.field3710[var1][var6.field3785] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3723[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZB)V",
		garbageValue = "121"
	)
	void method6620(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field256) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3724[var1.field3774] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method875();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3724[var1.field3774] >> 6);
		}

		var1.stream.method874(var4);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "117"
	)
	void method6621(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3723[var1][var2];
		if (var4 != null) {
			this.field3723[var1][var2] = null;
			if ((this.field3714[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3774 == var4.field3774 && var5.field3788 < 0 && var5 != var4) {
						var4.field3788 = 0;
						break;
					}
				}
			} else {
				var4.field3788 = 0;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "24"
	)
	void method6638(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1930068989"
	)
	void method6623(int var1, int var2) {
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1012872322"
	)
	void method6624(int var1, int var2) {
		this.field3706[var1] = var2;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "39"
	)
	void method6625(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3774 == var1) {
				if (var2.stream != null) {
					var2.stream.method879(PcmPlayer.field284 / 100);
					if (var2.stream.method883()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6827();
				}

				if (var2.field3788 < 0) {
					this.field3723[var2.field3774][var2.field3779] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "26801"
	)
	void method6626(int var1) {
		if (var1 >= 0) {
			this.field3700[var1] = 12800;
			this.field3725[var1] = 8192;
			this.field3702[var1] = 16383;
			this.field3706[var1] = 8192;
			this.field3727[var1] = 0;
			this.field3708[var1] = 8192;
			this.method6717(var1);
			this.method6630(var1);
			this.field3714[var1] = 0;
			this.field3701[var1] = 32767;
			this.field3711[var1] = 256;
			this.field3724[var1] = 0;
			this.method6632(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6626(var1);
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "392644007"
	)
	void method6652(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3774 == var1) && var2.field3788 < 0) {
				this.field3723[var2.field3774][var2.field3779] = null;
				var2.field3788 = 0;
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	void method6628() {
		this.method6625(-1);
		this.method6626(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3704[var1] = this.field3716[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3705[var1] = this.field3716[var1] & -128;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-12"
	)
	void method6717(int var1) {
		if ((this.field3714[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3774 == var1 && this.field3723[var1][var2.field3779] == null && var2.field3788 < 0) {
					var2.field3788 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "65"
	)
	void method6630(int var1) {
		if ((this.field3714[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3774 == var1) {
					var2.field3789 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-818276472"
	)
	void method6631(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6621(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6690(var3, var4, var5);
			} else {
				this.method6621(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6638(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3705[var3] = (var5 << 14) + (this.field3705[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3705[var3] = (var5 << 7) + (this.field3705[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3727[var3] = (var5 << 7) + (this.field3727[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3727[var3] = var5 + (this.field3727[var3] & -128);
			}

			if (var4 == 5) {
				this.field3708[var3] = (var5 << 7) + (this.field3708[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3708[var3] = var5 + (this.field3708[var3] & -128);
			}

			if (var4 == 7) {
				this.field3700[var3] = (var5 << 7) + (this.field3700[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3700[var3] = var5 + (this.field3700[var3] & -128);
			}

			if (var4 == 10) {
				this.field3725[var3] = (var5 << 7) + (this.field3725[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3725[var3] = var5 + (this.field3725[var3] & -128);
			}

			if (var4 == 11) {
				this.field3702[var3] = (var5 << 7) + (this.field3702[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3702[var3] = var5 + (this.field3702[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3714;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3714;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3714;
					var10000[var3] |= 2;
				} else {
					this.method6717(var3);
					var10000 = this.field3714;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3701[var3] = (var5 << 7) + (this.field3701[var3] & 127);
			}

			if (var4 == 98) {
				this.field3701[var3] = (this.field3701[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3701[var3] = (var5 << 7) + (this.field3701[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3701[var3] = (this.field3701[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6625(var3);
			}

			if (var4 == 121) {
				this.method6626(var3);
			}

			if (var4 == 123) {
				this.method6652(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3701[var3];
				if (var6 == 16384) {
					this.field3711[var3] = (var5 << 7) + (this.field3711[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3701[var3];
				if (var6 == 16384) {
					this.field3711[var3] = var5 + (this.field3711[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3724[var3] = (var5 << 7) + (this.field3724[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3724[var3] = var5 + (this.field3724[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3714;
					var10000[var3] |= 4;
				} else {
					this.method6630(var3);
					var10000 = this.field3714;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6632(var3, (var5 << 7) + (this.field3713[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6632(var3, var5 + (this.field3713[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6618(var3, var4 + this.field3705[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6623(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6624(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6628();
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1914601533"
	)
	void method6632(int var1, int var2) {
		this.field3713[var1] = var2;
		this.field3697[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)I",
		garbageValue = "-70"
	)
	int method6649(MusicPatchNode var1) {
		int var2 = (var1.field3784 * var1.field3783 >> 12) + var1.field3782;
		var2 += (this.field3706[var1.field3774] - 8192) * this.field3711[var1.field3774] >> 12;
		MusicPatchNode2 var3 = var1.field3777;
		int var4;
		if (var3.field3682 > 0 && (var3.field3683 > 0 || this.field3727[var1.field3774] > 0)) {
			var4 = var3.field3683 << 2;
			int var5 = var3.field3675 << 1;
			if (var1.field3790 < var5) {
				var4 = var4 * var1.field3790 / var5;
			}

			var4 += this.field3727[var1.field3774] >> 7;
			double var6 = Math.sin((double)(var1.field3786 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field284 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "-470723809"
	)
	int method6686(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3777;
		int var3 = this.field3700[var1.field3774] * this.field3702[var1.field3774] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3780 + 16384 >> 15;
		var3 = var3 * this.field3698 + 128 >> 8;
		if (var2.field3677 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3677 * 1.953125E-5D * (double)var1.field3795) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3681 != null) {
			var4 = var1.field3796;
			var5 = var2.field3681[var1.field3787 * 4 + 1];
			if (var1.field3787 * 4 < var2.field3681.length - 2) {
				var6 = (var2.field3681[var1.field3787 * 4] & 255) << 8;
				var7 = (var2.field3681[var1.field3787 * 4 + 2] & 255) << 8;
				var5 += (var2.field3681[var1.field3787 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3788 > 0 && var2.field3676 != null) {
			var4 = var1.field3788;
			var5 = var2.field3676[var1.field3778 * 4 + 1];
			if (var1.field3778 * 4 < var2.field3676.length - 2) {
				var6 = (var2.field3676[var1.field3778 * 4] & 255) << 8;
				var7 = (var2.field3676[var1.field3778 * 4 + 2] & 255) << 8;
				var5 += (var2.field3676[var1.field3778 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)I",
		garbageValue = "4"
	)
	int method6635(MusicPatchNode var1) {
		int var2 = this.field3725[var1.field3774];
		return var2 < 8192 ? var2 * var1.field3781 + 32 >> 6 : 16384 - ((128 - var1.field3781) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	void method6641() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3722; var2 == this.trackLength; var3 = this.midiFile.method6739(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3718 || var2 == 0) {
							this.method6628();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6631(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3722 = var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)Z",
		garbageValue = "-77"
	)
	boolean method6642(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3788 >= 0) {
				var1.remove();
				if (var1.field3785 > 0 && var1 == this.field3710[var1.field3774][var1.field3785]) {
					this.field3710[var1.field3774][var1.field3785] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnm;[IIII)Z",
		garbageValue = "-1805694520"
	)
	boolean method6643(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3793 = PcmPlayer.field284 / 100;
		if (var1.field3788 < 0 || var1.stream != null && !var1.stream.method978()) {
			int var5 = var1.field3784;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3708[var1.field3774]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3784 = var5;
			}

			var1.stream.method880(this.method6649(var1));
			MusicPatchNode2 var6 = var1.field3777;
			boolean var7 = false;
			++var1.field3790;
			var1.field3786 += var6.field3682;
			double var8 = (double)((var1.field3779 - 60 << 8) + (var1.field3784 * var1.field3783 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3677 > 0) {
				if (var6.field3680 > 0) {
					var1.field3795 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3680) + 0.5D);
				} else {
					var1.field3795 += 128;
				}
			}

			if (var6.field3681 != null) {
				if (var6.field3678 > 0) {
					var1.field3796 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3678 * var8) + 0.5D);
				} else {
					var1.field3796 += 128;
				}

				while (var1.field3787 * 4 < var6.field3681.length - 2 && var1.field3796 > (var6.field3681[var1.field3787 * 4 + 2] & 255) << 8) {
					var1.field3787 = var1.field3787 * 4 + 2;
				}

				if (var1.field3787 * 4 == var6.field3681.length - 2 && var6.field3681[var1.field3787 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3788 >= 0 && var6.field3676 != null && (this.field3714[var1.field3774] & 1) == 0 && (var1.field3785 < 0 || var1 != this.field3710[var1.field3774][var1.field3785])) {
				if (var6.field3679 > 0) {
					var1.field3788 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3679 * var8) + 0.5D);
				} else {
					var1.field3788 += 128;
				}

				while (var1.field3778 * 4 < var6.field3676.length - 2 && var1.field3788 > (var6.field3676[var1.field3778 * 4 + 2] & 255) << 8) {
					var1.field3778 = var1.field3778 * 4 + 2;
				}

				if (var1.field3778 * 4 == var6.field3676.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method879(var1.field3793);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method883()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6827();
				if (var1.field3788 >= 0) {
					var1.remove();
					if (var1.field3785 > 0 && var1 == this.field3710[var1.field3774][var1.field3785]) {
						this.field3710[var1.field3774][var1.field3785] = null;
					}
				}

				return true;
			} else {
				var1.stream.method957(var1.field3793, this.method6686(var1), this.method6635(var1));
				return false;
			}
		} else {
			var1.method6827();
			var1.remove();
			if (var1.field3785 > 0 && var1 == this.field3710[var1.field3774][var1.field3785]) {
				this.field3710[var1.field3774][var1.field3785] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	static void method6671() {
		for (int var0 = 0; var0 < Client.field812.size(); ++var0) {
			if (class138.method3390((Integer)Client.field812.get(var0)) != 2) {
				Client.field812.remove(var0);
				--var0;
			}
		}

	}
}
